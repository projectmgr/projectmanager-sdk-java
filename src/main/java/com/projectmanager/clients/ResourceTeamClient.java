
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
import com.projectmanager.models.ResourceTeamDto;

import com.projectmanager.models.CreateResourceTeamDto;
import com.projectmanager.models.UpdateResourceTeamDto;

/**
 * Contains all methods related to ResourceTeam
 */
public class ResourceTeamClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ResourceTeam API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
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
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param select Specify which properties should be returned
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto[]> retrieveResourceTeams(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ResourceTeamDto[]> r = new RestRequest<ResourceTeamDto[]>(this.client, "GET", "/api/data/resources/teams");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (select != null) { r.AddQuery("$select", select.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<ResourceTeamDto[]>>() {}.getType());
    }

    /**
     * Create a Resource Team.
     *
     * @param body The name of the team to create.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto> createResourceTeam(@NotNull CreateResourceTeamDto body)
    {
        RestRequest<ResourceTeamDto> r = new RestRequest<ResourceTeamDto>(this.client, "POST", "/api/data/resources/teams");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceTeamDto>>() {}.getType());
    }

    /**
     * The endpoint is used to delete a resource team. Users assigned to this team will no longer be assigned thereafter.
     *
     * @param resourceTeamId The Id of the team to be removed.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteResourceTeam(@NotNull String resourceTeamId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/resources/teams/{resourceTeamId}");
        r.AddPath("{resourceTeamId}", resourceTeamId == null ? "" : resourceTeamId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Update a Resource Team.
     *
     * @param teamresourceId The id of the resource team
     * @param body The name of the team to Update.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceTeamDto> updateResourceTeam(@NotNull String teamresourceId, @NotNull UpdateResourceTeamDto body)
    {
        RestRequest<ResourceTeamDto> r = new RestRequest<ResourceTeamDto>(this.client, "PUT", "/api/data/resources/teams/{teamresourceId}");
        r.AddPath("{teamresourceId}", teamresourceId == null ? "" : teamresourceId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceTeamDto>>() {}.getType());
    }
}
