
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
import com.projectmanager.models.TaskDto;

import com.projectmanager.models.ChangeSetStatusDto;
import com.projectmanager.models.TaskUpdateDto;
import com.projectmanager.models.TaskCreateDto;
import com.projectmanager.models.TaskPriorityDto;

/**
 * Contains all methods related to Task
 */
public class TaskClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Task API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a list of Tasks that match an [OData formatted query](https://www.odata.org/).
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskDto[]> queryTasks(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TaskDto[]> r = new RestRequest<TaskDto[]>(this.client, "GET", "/api/data/tasks");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<TaskDto[]>>() {}.getType());
    }

    /**
     * Retrieve a Task by its unique identifier or by its short ID.  A Task has both a unique identifier, which is a GUID, and a short ID, which is a small text label that is unique only within your Workspace.
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * @param taskId The unique identifier or short ID of the Task to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskDto> retrieveTask(@NotNull String taskId)
    {
        RestRequest<TaskDto> r = new RestRequest<TaskDto>(this.client, "GET", "/api/data/tasks/{taskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskDto>>() {}.getType());
    }

    /**
     * Update an existing Task and replace the values of fields specified.
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * Multiple users can be working on data at the same time.  When you call an API to update an object, this call is converted into a Changeset that is then applied sequentially.  You can use RetrieveChangeset to see the status of an individual Changeset.
     *
     * Known Issues:  This API returns an error if your Update call includes too many changes in a single API call.  Please restrict usage to one change per API request.  This API will be deprecated and replaced with an improved API call in a future release.
     *
     * @param taskId The unique identifier of the Task to update
     * @param body All non-null fields in this object will replace existing data in the Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> updateTask(@NotNull String taskId, @NotNull TaskUpdateDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Delete an existing Task.
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * Multiple users can be working on data at the same time.  When you call an API to update an object, this call is converted into a Changeset that is then applied sequentially.  You can use RetrieveChangeset to see the status of an individual Changeset.
     *
     * @param taskId Unique identifier of the Task to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> deleteTask(@NotNull String taskId)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Create a new Task within a specified project.
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * @param projectId The unique identifier of the Project that will contain this Task
     * @param body The new Task to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> createTask(@NotNull String projectId, @NotNull TaskCreateDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/projects/{projectId}/tasks");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Retrieves all TaskPriorities defined within your Workspace.
     *
     * A TaskPriority is a named priority level used by your business to determine how to decide which Tasks are the most important.  You can name your TaskPriority levels anything you like and you can reorganize the order of the TaskPriority levels at any time.
     *
     * Note that TaskPriority and ProjectPriority are different classes of priority levels.  Even if they may have similar names, they are different objects and must be tracked separately.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskPriorityDto[]> retrieveTaskPriorities()
    {
        RestRequest<TaskPriorityDto[]> r = new RestRequest<TaskPriorityDto[]>(this.client, "GET", "/api/data/tasks/priorities");
        return r.Call(new TypeToken<AstroResult<TaskPriorityDto[]>>() {}.getType());
    }

    /**
     * Create multiple new Tasks within a specified project with a single API call.
     *
     * A Task is an individual element of work that must be performed to complete a Project.  A Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to indicate whether they have a dependency or a connection.
     *
     * @param projectId The unique identifier of the Project that will contain these Tasks
     * @param body The list of new Tasks to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto[]> createManyTasks(@NotNull String projectId, @NotNull TaskCreateDto[] body)
    {
        RestRequest<ChangeSetStatusDto[]> r = new RestRequest<ChangeSetStatusDto[]>(this.client, "POST", "/api/data/projects/{projectId}/tasks/bulk");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto[]>>() {}.getType());
    }

    /**
     * Adds a task parent relationship
     *
     * @param taskId The task that will become the child
     * @param parentTaskId The parent task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> addParentTask(@NotNull String taskId, @NotNull String parentTaskId)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/parent/{parentTaskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{parentTaskId}", parentTaskId == null ? "" : parentTaskId.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Updates a task parent relationship
     *
     * @param taskId The task that will become the child
     * @param parentTaskId The parent task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> updateParentTask(@NotNull String taskId, @NotNull String parentTaskId)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/parent/{parentTaskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{parentTaskId}", parentTaskId == null ? "" : parentTaskId.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Removes a task parent relationship completely
     *
     * @param taskId The child task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> removeParentTask(@NotNull String taskId)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/parent");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }
}
