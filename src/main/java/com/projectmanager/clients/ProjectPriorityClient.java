
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
import com.projectmanager.models.ProjectPriorityDto;
import com.projectmanager.models.ProjectPriorityCreateDto;


/**
 * Contains all methods related to ProjectPriority
 */
public class ProjectPriorityClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectPriority API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectPriorityClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectPriorities defined within your Workspace.
     *
     * A ProjectPriority is a named priority level used by your business to determine how to decide
     * which Projects are the most important.  You can name your ProjectPriority levels anything you like
     * and you can reorganize the order of the ProjectPriority levels at any time.
     *
     * Note that TaskPriority and ProjectPriority are different classes of priority levels.  Even
     * if they may have similar names, they are different objects and must be tracked separately.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectPriorityDto[]> retrieveProjectPriorities()
    {
        RestRequest<ProjectPriorityDto[]> r = new RestRequest<ProjectPriorityDto[]>(this.client, "GET", "/api/data/projects/priorities");
        return r.Call(new TypeToken<AstroResult<ProjectPriorityDto[]>>() {}.getType());
    }

    /**
     * Create a project priority
     *
     * @param body The data to create the priority
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectPriorityDto> createProjectPriority(@NotNull ProjectPriorityCreateDto body)
    {
        RestRequest<ProjectPriorityDto> r = new RestRequest<ProjectPriorityDto>(this.client, "POST", "/api/data/projects/priorities");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectPriorityDto>>() {}.getType());
    }

    /**
     * Updates a project priority
     *
     * @param priorityId The id of the priority to update
     * @param body The data to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectPriorityDto> updateProjectPriority(@NotNull String priorityId, @NotNull ProjectPriorityCreateDto body)
    {
        RestRequest<ProjectPriorityDto> r = new RestRequest<ProjectPriorityDto>(this.client, "PUT", "/api/data/projects/priorities/{priorityId}");
        r.AddPath("{priorityId}", priorityId == null ? "" : priorityId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectPriorityDto>>() {}.getType());
    }

    /**
     * Delete a project priority. They will also be removed from any projects they were assigned too.
     *
     * @param priorityId The id of the priority to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProjectPriority(@NotNull String priorityId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/priorities/{priorityId}");
        r.AddPath("{priorityId}", priorityId == null ? "" : priorityId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
