
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
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
import com.projectmanager.models.ProjectDto;

import com.projectmanager.models.ProjectCreateDto;
import com.projectmanager.models.ProjectUpdateDto;

/**
 * Contains all methods related to Project
 */
public class ProjectClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Project API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a list of Projects that match an [OData formatted query](https://www.odata.org/).
     *
     * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
     * represent individual items of work that team members must complete.  The sum total of Tasks
     * within a Project represents the work to be completed for that Project.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectDto[]> queryProjects(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ProjectDto[]> r = new RestRequest<ProjectDto[]>(this.client, "GET", "/api/data/projects");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<ProjectDto[]>>() {}.getType());
    }

    /**
     * Create a new project based on the details provided.
     *
     * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
     * represent individual items of work that team members must complete.  The sum total of Tasks
     * within a Project represents the work to be completed for that Project.
     *
     * @param body Information about the Project you wish to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectDto> createProject(@NotNull ProjectCreateDto body)
    {
        RestRequest<ProjectDto> r = new RestRequest<ProjectDto>(this.client, "POST", "/api/data/projects");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectDto>>() {}.getType());
    }

    /**
     * Retrieves a project based on its unique identifier.
     *
     * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
     * represent individual items of work that team members must complete.  The sum total of Tasks
     * within a Project represents the work to be completed for that Project.
     *
     * @param projectId The unique identifier of the Project to retrieve.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectDto> retrieveProject(@NotNull String projectId)
    {
        RestRequest<ProjectDto> r = new RestRequest<ProjectDto>(this.client, "GET", "/api/data/projects/{projectId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectDto>>() {}.getType());
    }

    /**
     * Update an existing Project and replace the values of fields specified.
     *
     * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
     * represent individual items of work that team members must complete.  The sum total of Tasks
     * within a Project represents the work to be completed for that Project.
     *
     * Multiple users can be working on data at the same time.  When you call an API to update an
     * object, this call is converted into a Changeset that is then applied sequentially.  You can use
     * RetrieveChangeset to see the status of an individual Changeset.
     *
     * @param projectId The unique identifier of the Project to update
     * @param body All non-null fields in this object will replace previous data within the Project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateProject(@NotNull String projectId, @NotNull ProjectUpdateDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/projects/{projectId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Delete a project based on the details provided.
     *
     * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
     * represent individual items of work that team members must complete.  The sum total of Tasks
     * within a Project represents the work to be completed for that Project.
     *
     * @param projectId The unique identifier of the Project to delete
     * @param hardDelete Hard delete project true or false
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProject(@NotNull String projectId, @Nullable Boolean hardDelete)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (hardDelete != null) { r.AddQuery("hardDelete", hardDelete.toString()); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
