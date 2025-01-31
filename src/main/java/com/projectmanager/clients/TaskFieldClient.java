
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
import com.projectmanager.models.TaskFieldDto;

import com.projectmanager.models.ChangeSetStatusDto;
import com.projectmanager.models.CreateTaskFieldDto;
import com.projectmanager.models.TaskFieldValueDto;
import com.projectmanager.models.UpdateTaskFieldValueDto;

/**
 * Contains all methods related to TaskField
 */
public class TaskFieldClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskField API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskFieldClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all TaskFields defined for a specific Project within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project to retrieve TaskFields
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldDto[]> retrieveTaskFields(@NotNull String projectId)
    {
        RestRequest<TaskFieldDto[]> r = new RestRequest<TaskFieldDto[]>(this.client, "GET", "/api/data/projects/{projectId}/tasks/fields");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<TaskFieldDto[]>>() {}.getType());
    }

    /**
     * Creates a new TaskField for a specific Project within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project within which to create this TaskField
     * @param body Information about the TaskField to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> createTaskField(@NotNull String projectId, @NotNull CreateTaskFieldDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/projects/{projectId}/tasks/fields");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Retrieve a list of TaskFields that match an [OData formatted query](https://www.odata.org/).
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside a Project.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldDto[]> queryTaskFields(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TaskFieldDto[]> r = new RestRequest<TaskFieldDto[]>(this.client, "GET", "/api/data/projects/tasks/fields");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<TaskFieldDto[]>>() {}.getType());
    }

    /**
     * Deletes a TaskField for a specific Project within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project that contains this TaskField
     * @param fieldId The unique identifier of the TaskField to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteTaskField(@NotNull String projectId, @NotNull String fieldId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}/tasks/fields/{fieldId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves all TaskField values for a particular Task.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task for which we want TaskField values
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldValueDto[]> retrieveAllTaskFieldValues(@NotNull String taskId)
    {
        RestRequest<TaskFieldValueDto[]> r = new RestRequest<TaskFieldValueDto[]>(this.client, "GET", "/api/data/tasks/{taskId}/fields/values");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskFieldValueDto[]>>() {}.getType());
    }

    /**
     * Retrieve a list of TaskFieldValues that match an [OData formatted query](https://www.odata.org/).
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldValueDto[]> queryTaskFieldValues(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TaskFieldValueDto[]> r = new RestRequest<TaskFieldValueDto[]>(this.client, "GET", "/api/data/tasks/fields/values");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<TaskFieldValueDto[]>>() {}.getType());
    }

    /**
     * Retrieves the current TaskField value for a particular Task and TaskField.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task of the value to retrieve
     * @param fieldId The unique identifier of the TaskField of the value to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldValueDto> retrieveTaskFieldValue(@NotNull String taskId, @NotNull String fieldId)
    {
        RestRequest<TaskFieldValueDto> r = new RestRequest<TaskFieldValueDto>(this.client, "GET", "/api/data/tasks/{taskId}/fields/{fieldId}/values");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        return r.Call(new TypeToken<AstroResult<TaskFieldValueDto>>() {}.getType());
    }

    /**
     * Replaces the current value of a TaskField for a specific Task within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
     * define TaskFields for any integration purpose that is important to your business.  Each
     * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
     * for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task whose value you wish to update
     * @param fieldId The unique identifier of the TaskField whose value you wish to update
     * @param body The new value for this TaskField for this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> updateTaskFieldValue(@NotNull String taskId, @NotNull String fieldId, @NotNull UpdateTaskFieldValueDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/fields/{fieldId}/values");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }
}
