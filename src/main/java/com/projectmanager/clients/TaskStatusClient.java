
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
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.TaskStatusDto;

import com.projectmanager.models.TaskStatusCreateDto;
import com.projectmanager.models.TaskStatusUpdateDto;

/**
 * Contains all methods related to TaskStatus
 */
public class TaskStatusClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskStatus API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskStatusClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the list of TaskStatus levels for a specific Project within your Workspace.
     *
     * A TaskStatus is a named status level used by your business to determine how to measure the progress of Tasks.  You can define your own named status levels that are appropriate for your business and determine which status levels are considered done.
     *
     * @param projectId The unique identifier of the Project to retrieve TaskStatuses
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskStatusDto[]> retrieveTaskStatuses(@NotNull String projectId)
    {
        RestRequest<TaskStatusDto[]> r = new RestRequest<TaskStatusDto[]>(this.client, "GET", "/api/data/projects/{projectId}/tasks/statuses");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<TaskStatusDto[]>>() {}.getType());
    }

    /**
     * Creates a new TaskStatus level for a specific Project within your Workspace.
     *
     * A TaskStatus is a named status level used by your business to determine how to measure the progress of Tasks.  You can define your own named status levels that are appropriate for your business.
     *
     * @param projectId The unique identifier of the Project for the new TaskStatus
     * @param body Information about the new TaskStatus level to create within this Project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskStatusDto> createTaskStatus(@NotNull String projectId, @NotNull TaskStatusCreateDto body)
    {
        RestRequest<TaskStatusDto> r = new RestRequest<TaskStatusDto>(this.client, "POST", "/api/data/projects/{projectId}/tasks/statuses");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskStatusDto>>() {}.getType());
    }

    /**
     * Updates an existing TaskStatus level for a specific Project within your Workspace.
     *
     * A TaskStatus is a named status level used by your business to determine how to measure the progress of Tasks.  You can define your own named status levels that are appropriate for your business.
     *
     * @param projectId The unique identifier of the Project for the new TaskStatus
     * @param body Information about the existing TaskStatus level to update within this Project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskStatusDto> updateTaskStatus(@NotNull String projectId, @NotNull TaskStatusUpdateDto body)
    {
        RestRequest<TaskStatusDto> r = new RestRequest<TaskStatusDto>(this.client, "PUT", "/api/data/projects/{projectId}/tasks/statuses");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskStatusDto>>() {}.getType());
    }

    /**
     * The endpoint is used to delete a TaskStatus.
     *
     * You will not be able to delete a TaskStatus if there are tasks that have been assigned to this status level or if the TaskStatus is the default status level.
     *
     * @param projectId The unique identifier of the Project for the TaskStatus level to delete
     * @param taskStatusId The Id of the TaskStatus level to be removed.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteTaskStatus(@NotNull String projectId, @NotNull String taskStatusId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}/tasks/statuses/{taskStatusId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{taskStatusId}", taskStatusId == null ? "" : taskStatusId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
