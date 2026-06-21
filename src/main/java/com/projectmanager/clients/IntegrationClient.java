
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
import com.projectmanager.models.IntegrationDto;

import com.projectmanager.models.IntegrationMetadataDto;

/**
 * Contains all methods related to Integration
 */
public class IntegrationClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Integration API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public IntegrationClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves an Integration specified by a unique identifier.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please
     * contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of this Integration
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto> retrieveIntegration(@NotNull String integrationId)
    {
        RestRequest<IntegrationDto> r = new RestRequest<IntegrationDto>(this.client, "GET", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId == null ? "" : integrationId.toString());
        return r.Call(new TypeToken<AstroResult<IntegrationDto>>() {}.getType());
    }

    /**
     * Enable a specific Integration for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please
     * contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to enable
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto> enableIntegration(@NotNull String integrationId)
    {
        RestRequest<IntegrationDto> r = new RestRequest<IntegrationDto>(this.client, "POST", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId == null ? "" : integrationId.toString());
        return r.Call(new TypeToken<AstroResult<IntegrationDto>>() {}.getType());
    }

    /**
     * Disable a specific Integration for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please
     * contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to disable
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> disableIntegration(@NotNull String integrationId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId == null ? "" : integrationId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves all Integrations for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please
     * contact ProjectManager's sales team to request use of this API.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto[]> retrieveAllIntegrations()
    {
        RestRequest<IntegrationDto[]> r = new RestRequest<IntegrationDto[]>(this.client, "GET", "/api/data/integrations");
        return r.Call(new TypeToken<AstroResult<IntegrationDto[]>>() {}.getType());
    }

    /**
     * Replaces the metadata stored against a specific Integration for the current Workspace.
     * Metadata is a list of key-value pairs where values are comma-separated strings to support
     * multiple values per key (e.g. a list of IDs, names, or reference values).
     *
     * The Integrations API is intended for use by ProjectManager and its business development
     * partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to update
     * @param body The full set of metadata key-value pairs to store against this Integration
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto> updateIntegrationMetadata(@NotNull String integrationId, @NotNull IntegrationMetadataDto[] body)
    {
        RestRequest<IntegrationDto> r = new RestRequest<IntegrationDto>(this.client, "PUT", "/api/data/integrations/{integrationId}/metadata");
        r.AddPath("{integrationId}", integrationId == null ? "" : integrationId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<IntegrationDto>>() {}.getType());
    }
}
