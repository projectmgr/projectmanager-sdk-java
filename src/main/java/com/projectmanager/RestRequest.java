/**
 * ProjectManager API for Java
 *
 * (c) 2023-2025 ProjectManager.com
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2025 ProjectManager.com
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */

package com.projectmanager;

import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.util.Hashtable;
import java.util.Map.Entry;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import org.jetbrains.annotations.NotNull;

import com.google.gson.Gson;


/**
 * Represents a request to a remote web server
 */
public class RestRequest<@NotNull T> {
    private Hashtable<String, String> queryParams;
    private Hashtable<String, String> pathReplacements;
    private String method;
    private String path;
    private Object body;
    private ProjectManagerClient client;

    /**
     * <p>
     * Constructor for RestRequest.
     * </p>
     *
     * @param client a {@link com.projectmanager.ProjectManagerClient} object.
     * @param method a {@link java.lang.String} object.
     * @param path   a {@link java.lang.String} object.
     */
    public RestRequest(@NotNull ProjectManagerClient client, @NotNull String method, @NotNull String path) {
        this.client = client;
        this.method = method;
        this.path = path;
        queryParams = new Hashtable<String, String>();
        pathReplacements = new Hashtable<String, String>();
    }

    /**
     * <p>
     * AddQuery.
     * </p>
     *
     * @param name  a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void AddQuery(@NotNull String name, @NotNull String value) {
        this.queryParams.put(name, value);
    }

    /**
     * <p>
     * AddPath.
     * </p>
     *
     * @param name  a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void AddPath(@NotNull String name, @NotNull String value) {
        this.pathReplacements.put(name, value);
    }

    /**
     * <p>
     * AddBody.
     * </p>
     *
     * @param body a {@link java.lang.Object} object.
     */
    public void AddBody(Object body) {
        this.body = body;
    }

    /**
     * Adapted from Apache simple request client example
     *
     * @return a {@link com.projectmanager.AstroResult} object.
     */
    public @NotNull AstroResult<T> Call(Type classReference) {
        Instant start = Instant.now();
        AstroResult<T> result = new AstroResult<T>();
        try {

            CloseableHttpClient httpclient = HttpClients.createDefault();

            // Add query parameters
            URIBuilder builder = new URIBuilder(this.client.getServerUri());
            for (Entry<String, String> entry : this.queryParams.entrySet()) {
                builder.addParameter(entry.getKey(), entry.getValue());
            }

            // Set the path and execute replacements
            String filledPath = this.path;
            for (Entry<String, String> entry : this.pathReplacements.entrySet()) {
                filledPath = filledPath.replaceAll(entry.getKey(), entry.getValue());
            }
            builder.setPath(filledPath);
            URI uri = builder.build();

            // Create the appropriate request
            ClassicHttpRequest request;
            switch (this.method) {
                case "PATCH":
                    request = new HttpPatch(uri);
                    break;
                case "PUT":
                    request = new HttpPut(uri);
                    break;
                case "POST":
                    request = new HttpPost(uri);
                    break;
                case "DELETE":
                    request = new HttpDelete(uri);
                    break;
                case "GET":
                default:
                    request = new HttpGet(uri);
                    break;
            }

            request.addHeader("SdkName", "Java");
            request.addHeader("SdkVersion", "138.1.170.0");

            String applicationName = this.client.getAppName();

            if (applicationName != null) {
                request.addHeader("ApplicationName", applicationName);
            }

            String machineName = InetAddress.getLocalHost().getHostName();

            if (machineName != null) {
                request.addHeader("MachineName", machineName);
            }

            String bearerToken = this.client.getBearerToken();
            if (bearerToken != null) {
                request.addHeader("Authorization", "Bearer " + bearerToken);
            }

            // If we have a request body
            if (body != null) {
                Gson gson = new Gson();
                StringEntity stringEntity = new StringEntity(gson.toJson(body));
                request.setEntity(stringEntity);
            }
            
            // Execute and parse results
            final CloseableHttpResponse response = httpclient.execute(request);

            // Did we succeed?
            long serverDuration = 0;
            if (response.getHeader("ServerDuration") != null) {
                serverDuration = Long.parseLong(response.getHeader("ServerDuration").getValue());
            }
            String content = EntityUtils.toString(response.getEntity());
            long roundTripTime = Duration.between(start, Instant.now()).toMillis();
            result.Parse(classReference, content, response.getCode(), serverDuration, roundTripTime);
        } catch (Exception e) {
            result.Parse(classReference, e.toString(), -1, -1, -1);
        }
        return result;
    }
}