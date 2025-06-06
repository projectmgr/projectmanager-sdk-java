
/**
 * ProjectManager API for Java
 *
 * (c) ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.ApiKeyDto;
import com.projectmanager.models.ApiKeyCreateDto;


/**
 * Contains all methods related to ApiKey
 */
public class ApiKeyClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ApiKey API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ApiKeyClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Creates a new API key for the current user with the specified options.
     *
     * An API key is a credential that you can use to make REST v4 API calls for ProjectManager.com.  When you create
     * a new API key, that API key is only visible in the response JSON for the `CreateApiKey` method.  If you do not
     * preserve this information, it cannot be recreated.
     *
     * Some best practices for working with API keys:
     * * An API key is valid for a two year period after it is created.  We encourage you to rotate your API keys
     * regularly according to your company's security policies.
     * * You should create separate API keys for each system that works with your API.  If that API key is exposed
     * or if that program needs to be shut down, you can revoke that one key and reissue it.
     * * An API key is tied to the workspace that created it. A single API key can only interact with one workspace.
     *
     * @param body Options for the API key to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ApiKeyDto> createApiKey(@NotNull ApiKeyCreateDto body)
    {
        RestRequest<ApiKeyDto> r = new RestRequest<ApiKeyDto>(this.client, "POST", "/api/data/api-keys");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ApiKeyDto>>() {}.getType());
    }

    /**
     * Returns a list of all API keys within the current workspace.
     *
     * An API key is a credential that you can use to make REST v4 API calls for ProjectManager.com.  When you create
     * a new API key, that API key is only visible in the response JSON for the `CreateApiKey` method.  If you do not
     * preserve this information, it cannot be recreated.
     *
     * Some best practices for working with API keys:
     * * An API key is valid for a two-year period after it is created.  We encourage you to rotate your API keys
     * regularly according to your company's security policies.
     * * You should create separate API keys for each system that works with your API.  If that API key is exposed
     * or if that program needs to be shut down, you can revoke that one key and reissue it.
     * * An API key is tied to the workspace that created it. A single API key can only interact with one workspace.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ApiKeyDto[]> listApiKeys()
    {
        RestRequest<ApiKeyDto[]> r = new RestRequest<ApiKeyDto[]>(this.client, "GET", "/api/data/api-keys");
        return r.Call(new TypeToken<AstroResult<ApiKeyDto[]>>() {}.getType());
    }

    /**
     * This API call revokes all existing API keys in given workspace.  No existing keys will continue to work
     * after this call completes.  We strongly encourage you to revoke a single API key at a time; this method
     * should only be used if you need to rapidly halt access to your product for automated systems.
     *
     * An API key is a credential that you can use to make REST v4 API calls for ProjectManager.com.  When you create
     * a new API key, that API key is only visible in the response JSON for the `CreateApiKey` method.  If you do not
     * preserve this information, it cannot be recreated.
     *
     * Some best practices for working with API keys:
     * * An API key is valid for a two year period after it is created.  We encourage you to rotate your API keys
     * regularly according to your company's security policies.
     * * You should create separate API keys for each system that works with your API.  If that API key is exposed
     * or if that program needs to be shut down, you can revoke that one key and reissue it.
     * * An API key is tied to the workspace that created it. A single API key can only interact with one workspace.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> revokeAllApiKeys()
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/api-keys/revoke-all");
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Revokes a single API key in the current workspace.
     *
     * An API key is a credential that you can use to make REST v4 API calls for ProjectManager.com.  When you create
     * a new API key, that API key is only visible in the response JSON for the `CreateApiKey` method.  If you do not
     * preserve this information, it cannot be recreated.
     *
     * Some best practices for working with API keys:
     * * An API key is valid for a two year period after it is created.  We encourage you to rotate your API keys
     * regularly according to your company's security policies.
     * * You should create separate API keys for each system that works with your API.  If that API key is exposed
     * or if that program needs to be shut down, you can revoke that one key and reissue it.
     * * An API key is tied to the workspace that created it. A single API key can only interact with one workspace.
     *
     * @param id The unique identifier of the API key to revoke
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> revokeAPIKey(@NotNull String id)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/api-keys/{id}/revoke");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
