
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


package ProjectManager.SDK.clients;

import ProjectManager.SDK.ProjectManagerClient;
import ProjectManager.SDK.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ProjectManager.SDK.AstroResult;
import com.google.gson.reflect.TypeToken;
import ProjectManager.SDK.models.IntegrationDto;

import ProjectManager.SDK.models.NewIntegrationInstanceDto;
import ProjectManager.SDK.models.CreateIntegrationInstanceDto;

/**
 * Contains all methods related to Integration
 */
public class IntegrationClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Integration API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public IntegrationClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves an Integration specified by a unique identifier.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of this Integration
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto> retrieveIntegration(@NotNull String integrationId)
    {
        RestRequest<AstroResult<IntegrationDto>> r = new RestRequest<AstroResult<IntegrationDto>>(this.client, "GET", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId.toString());
        return r.Call(new TypeToken<AstroResult<IntegrationDto>>() {}.getType());
    }

    /**
     * Enable a specific Integration for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to enable
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto> enableIntegration(@NotNull String integrationId)
    {
        RestRequest<AstroResult<IntegrationDto>> r = new RestRequest<AstroResult<IntegrationDto>>(this.client, "POST", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId.toString());
        return r.Call(new TypeToken<AstroResult<IntegrationDto>>() {}.getType());
    }

    /**
     * Disable a specific Integration for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to disable
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> disableIntegration(@NotNull String integrationId)
    {
        RestRequest<AstroResult<Object>> r = new RestRequest<AstroResult<Object>>(this.client, "DELETE", "/api/data/integrations/{integrationId}");
        r.AddPath("{integrationId}", integrationId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves all Integrations for the current Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationDto[]> retrieveAllIntegrations()
    {
        RestRequest<AstroResult<IntegrationDto[]>> r = new RestRequest<AstroResult<IntegrationDto[]>>(this.client, "GET", "/api/data/integrations");
        return r.Call(new TypeToken<AstroResult<IntegrationDto[]>>() {}.getType());
    }

    /**
     * Adds a new Integration instance to a Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationId The unique identifier of the Integration to add to this Workspace
     * @param body The information about this Integration to add
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<NewIntegrationInstanceDto> addIntegrationInstance(@NotNull String integrationId, @NotNull CreateIntegrationInstanceDto body)
    {
        RestRequest<AstroResult<NewIntegrationInstanceDto>> r = new RestRequest<AstroResult<NewIntegrationInstanceDto>>(this.client, "POST", "/api/data/integrations/{integrationId}/instance");
        r.AddPath("{integrationId}", integrationId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<NewIntegrationInstanceDto>>() {}.getType());
    }

    /**
     * Removes an existing Integration instance from a Workspace.
     *
     * The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @param integrationInstanceId The unique identifier of the IntegrationInstance to remove from this Workspace
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeIntegrationInstance(@NotNull String integrationInstanceId)
    {
        RestRequest<AstroResult<Object>> r = new RestRequest<AstroResult<Object>>(this.client, "DELETE", "/api/data/integrations/instances/{integrationInstanceId}");
        r.AddPath("{integrationInstanceId}", integrationInstanceId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
