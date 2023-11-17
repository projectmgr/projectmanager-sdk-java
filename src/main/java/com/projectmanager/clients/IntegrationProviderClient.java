
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.IntegrationProviderDto;
import com.projectmanager.models.ConnectionSchemaDto;

import com.projectmanager.models.AuthenticationDto;
import com.projectmanager.models.DirectLinkDto;
import com.projectmanager.models.AuthenticationStatusDto;

/**
 * Contains all methods related to IntegrationProvider
 */
public class IntegrationProviderClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the IntegrationProvider API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public IntegrationProviderClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * List all available IntegrationProviders that can be activated.
     *
     * An IntegrationProvider is the name of an external application or service that can be connected to ProjectManager.com.  The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationProviderDto[]> listProviders(@Nullable Object xintegrationname)
    {
        RestRequest<IntegrationProviderDto[]> r = new RestRequest<IntegrationProviderDto[]>(this.client, "GET", "/api/data/integrations/providers");
        return r.Call(new TypeToken<AstroResult<IntegrationProviderDto[]>>() {}.getType());
    }

    /**
     * Activates an Integration Provider and retrieves authentication information about a specific IntegrationProvider.
     *
     * An IntegrationProvider is the name of an external application or service that can be connected to ProjectManager.com.  The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param providerId The unique identifier of the IntegrationProvider for which you are requesting authentication information
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ConnectionSchemaDto> activateIntegrationProvider(@NotNull String providerId, @Nullable Object xintegrationname)
    {
        RestRequest<ConnectionSchemaDto> r = new RestRequest<ConnectionSchemaDto>(this.client, "POST", "/api/data/integrations/providers/{providerId}");
        r.AddPath("{providerId}", providerId == null ? "" : providerId.toString());
        return r.Call(new TypeToken<AstroResult<ConnectionSchemaDto>>() {}.getType());
    }

    /**
     * Allows you to update the auth status of the provider specific connection.
     *
     * @param providerId The identifier to the provider
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body Specify the auth status
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateIntegrationProvider(@NotNull String providerId, @Nullable Object xintegrationname, @NotNull AuthenticationDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/integrations/providers/{providerId}");
        r.AddPath("{providerId}", providerId == null ? "" : providerId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Allows you to deactivate an integration provider
     *
     * @param providerId The identifier to the provider
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deactivateIntegrationProvider(@NotNull String providerId, @Nullable Object xintegrationname)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/integrations/providers/{providerId}");
        r.AddPath("{providerId}", providerId == null ? "" : providerId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves user authentication information about a specific IntegrationProvider.
     *
     * This connection can be used for requests to Providers that require specific user data.
     *
     * @param providerId The unique identifier of the IntegrationProvider for which you are requesting authentication information
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<DirectLinkDto> createUserIntegrationProviderConnection(@NotNull String providerId, @Nullable Object xintegrationname)
    {
        RestRequest<DirectLinkDto> r = new RestRequest<DirectLinkDto>(this.client, "POST", "/api/data/integrations/providers/{providerId}/user-connection");
        r.AddPath("{providerId}", providerId == null ? "" : providerId.toString());
        return r.Call(new TypeToken<AstroResult<DirectLinkDto>>() {}.getType());
    }

    /**
     * Allows you to update the auth status of the provider specific user connection.
     *
     * @param providerId The identifier to the provider
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body Specify the auth status
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateUserIntegrationProviderConnection(@NotNull String providerId, @Nullable Object xintegrationname, @NotNull AuthenticationStatusDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/integrations/providers/{providerId}/user-connection");
        r.AddPath("{providerId}", providerId == null ? "" : providerId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
