
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
import com.projectmanager.models.GetTaskFieldsResponseDto;

import com.projectmanager.models.ChangeSetStatusDto;
import com.projectmanager.models.CreateTaskFieldRequestDto;
import com.projectmanager.models.TaskFieldsValueResponseDto;
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
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project to retrieve TaskFields
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<GetTaskFieldsResponseDto[]> retrieveTaskFields(@NotNull String projectId)
    {
        RestRequest<GetTaskFieldsResponseDto[]> r = new RestRequest<GetTaskFieldsResponseDto[]>(this.client, "GET", "/api/data/projects/{projectId}/tasks/fields");
        r.AddPath("{projectId}", projectId.toString());
        return r.Call(new TypeToken<AstroResult<GetTaskFieldsResponseDto[]>>() {}.getType());
    }

    /**
     * Creates a new TaskFields for a specific Project within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project within which to create this TaskField
     * @param body Information about the TaskField to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> createTaskField(@NotNull String projectId, @NotNull CreateTaskFieldRequestDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/projects/{projectId}/tasks/fields");
        r.AddPath("{projectId}", projectId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Deletes a TaskField for a specific Project within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param projectId The unique identifier of the Project that contains this TaskField
     * @param fieldId The unique identifier of the TaskField to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteTaskField(@NotNull String projectId, @NotNull String fieldId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}/tasks/fields/{fieldId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{fieldId}", fieldId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves the current TaskField value for a particular Task and TaskField.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task of the value to retrieve
     * @param fieldId The unique identifier of the TaskField of the value to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldsValueResponseDto> retrieveTaskFieldValue(@NotNull String taskId, @NotNull String fieldId)
    {
        RestRequest<TaskFieldsValueResponseDto> r = new RestRequest<TaskFieldsValueResponseDto>(this.client, "GET", "/api/data/tasks/{taskId}/fields/{fieldId}");
        r.AddPath("{taskId}", taskId.toString());
        r.AddPath("{fieldId}", fieldId.toString());
        return r.Call(new TypeToken<AstroResult<TaskFieldsValueResponseDto>>() {}.getType());
    }

    /**
     * Replaces the current value of a TaskFields for a specific Task within your Workspace.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task whose value you wish to update
     * @param fieldId The unique identifier of the TaskField whose value you wish to update
     * @param body The new value for this TaskField for this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> updateTaskFieldValue(@NotNull String taskId, @NotNull String fieldId, @NotNull UpdateTaskFieldValueDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/fields/{fieldId}");
        r.AddPath("{taskId}", taskId.toString());
        r.AddPath("{fieldId}", fieldId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Retrieves all TaskField values for a particular Task.
     *
     * A TaskField is a custom field defined within your Workspace for a specific Project.  You can define TaskFields for any integration purpose that is important to your business.  Each TaskField has a data type as well as options in how it is handled.  TaskFields can be edited for each Task inside this Project.
     *
     * @param taskId The unique identifier of the Task for which we want TaskField values
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskFieldsValueResponseDto[]> retrieveAllTaskFieldValues(@NotNull String taskId)
    {
        RestRequest<TaskFieldsValueResponseDto[]> r = new RestRequest<TaskFieldsValueResponseDto[]>(this.client, "GET", "/api/data/tasks/{taskId}/fields");
        r.AddPath("{taskId}", taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskFieldsValueResponseDto[]>>() {}.getType());
    }
}
