
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
import com.projectmanager.models.TaskTodoDto;

import com.projectmanager.models.TaskTodoCreateDto;
import com.projectmanager.models.TaskTodoUpdateDto;

/**
 * Contains all methods related to TaskTodo
 */
public class TaskTodoClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskTodo API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskTodoClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a list of todos for a task
     *
     * @param taskId the id of the task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto[]> gettodosforatask(@NotNull String taskId)
    {
        RestRequest<TaskTodoDto[]> r = new RestRequest<TaskTodoDto[]>(this.client, "GET", "/api/data/tasks/{taskId}/todos");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskTodoDto[]>>() {}.getType());
    }

    /**
     * Create a todo for a task
     *
     * @param taskId the id of the task
     * @param body the data for creating a todo
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto> createatodoforatask(@NotNull String taskId, @NotNull TaskTodoCreateDto body)
    {
        RestRequest<TaskTodoDto> r = new RestRequest<TaskTodoDto>(this.client, "POST", "/api/data/tasks/{taskId}/todos");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTodoDto>>() {}.getType());
    }

    /**
     * Update a todo for a task
     *
     * @param todoId the id of the task
     * @param body the data for updating a todo
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto> updateatodo(@NotNull String todoId, @NotNull TaskTodoUpdateDto body)
    {
        RestRequest<TaskTodoDto> r = new RestRequest<TaskTodoDto>(this.client, "PUT", "/api/data/tasks/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTodoDto>>() {}.getType());
    }

    /**
     * Remove a todo
     *
     * @param todoId the id of the todo
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteatodo(@NotNull String todoId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/tasks/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
