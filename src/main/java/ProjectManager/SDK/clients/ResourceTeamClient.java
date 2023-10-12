
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
import ProjectManager.SDK.models.ResourceTeamDto;

import ProjectManager.SDK.models.CreateResourceTeamDto;
import ProjectManager.SDK.models.UpdateResourceTeamDto;

/**
 * Contains all methods related to ResourceTeam
 */
public class ResourceTeamClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ResourceTeam API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public ResourceTeamClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ResourceTeams defined within your Workspace that match an [OData formatted query](https://www.odata.org/).
     *
     * A ResourceTeam is a grouping of Resources that allows you to keep track of assignments in a manner consistent with your business needs.  You can assign Resources to be members of zero, one, or many ResourceTeams.
     *
     * @param $top The number of records to return
     * @param $skip Skips the given number of records and then returns $top records
     * @param $filter Filter the expression according to oData queries
     * @param $select Specify which properties should be returned
     * @param $orderby Order collection by this field.
     * @param $expand Include related data in the response
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto[]> retrieveResourceTeams(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ResourceTeamDto[]> r = new RestRequest<ResourceTeamDto[]>(this.client, "GET", "/api/data/resources/teams");
        r.AddQuery("$top", top.toString());
        r.AddQuery("$skip", skip.toString());
        r.AddQuery("$filter", filter.toString());
        r.AddQuery("$select", select.toString());
        r.AddQuery("$orderby", orderby.toString());
        r.AddQuery("$expand", expand.toString());
        return r.Call();
    }

    /**
     * Create a Resource Team.
     *
     * @param body The name of the team to create.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto> createResourceTeam(@NotNull CreateResourceTeamDto body)
    {
        RestRequest<ResourceTeamDto> r = new RestRequest<ResourceTeamDto>(this.client, "POST", "/api/data/resources/teams");
        r.AddBody(body);
        return r.Call();
    }

    /**
     * The endpoint is used to delete a resource team. Users assigned to this team will no longer be assigned thereafter.
     *
     * @param resourceTeamId The Id of the team to be removed.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteResourceTeam(@NotNull String resourceTeamId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/resources/teams/{resourceTeamId}");
        r.AddPath("{resourceTeamId}", resourceTeamId.toString());
        return r.Call();
    }

    /**
     * Update a Resource Team.
     *
     * @param teamresourceId The id of the resource team
     * @param body The name of the team to Update.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto> updateResourceTeam(@NotNull String teamresourceId, @NotNull UpdateResourceTeamDto body)
    {
        RestRequest<ResourceTeamDto> r = new RestRequest<ResourceTeamDto>(this.client, "PUT", "/api/data/resources/teams/{teamresourceId}");
        r.AddPath("{teamresourceId}", teamresourceId.toString());
        r.AddBody(body);
        return r.Call();
    }
}
