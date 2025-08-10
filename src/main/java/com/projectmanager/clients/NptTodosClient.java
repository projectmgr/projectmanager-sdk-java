
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
import com.projectmanager.models.TaskTodoDto;

import com.projectmanager.models.TaskTodoCreateDto;
import com.projectmanager.models.TaskTodoUpdateDto;

/**
 * Contains all methods related to NptTodos
 */
public class NptTodosClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptTodos API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptTodosClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Get todos for a npt
     *
     * @param nptId the id of the npt
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto[]> getNptTodos(@NotNull String nptId)
    {
        RestRequest<TaskTodoDto[]> r = new RestRequest<TaskTodoDto[]>(this.client, "GET", "/api/data/non-project-tasks/{nptId}/todos");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        return r.Call(new TypeToken<AstroResult<TaskTodoDto[]>>() {}.getType());
    }

    /**
     * Creates a new todo and associates it with the npt
     *
     * @param nptId the id of the npt
     * @param body The todo to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto> createNptTodo(@NotNull String nptId, @NotNull TaskTodoCreateDto body)
    {
        RestRequest<TaskTodoDto> r = new RestRequest<TaskTodoDto>(this.client, "POST", "/api/data/non-project-tasks/{nptId}/todos");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTodoDto>>() {}.getType());
    }

    /**
     * Update a Todo
     *
     * @param todoId the id of the todo
     * @param body the fields to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTodoDto> updateANptTodo(@NotNull String todoId, @NotNull TaskTodoUpdateDto body)
    {
        RestRequest<TaskTodoDto> r = new RestRequest<TaskTodoDto>(this.client, "PUT", "/api/data/non-project-tasks/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTodoDto>>() {}.getType());
    }

    /**
     * Remove Npt Todo
     *
     * @param todoId the id of the todo to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeNptTodo(@NotNull String todoId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
