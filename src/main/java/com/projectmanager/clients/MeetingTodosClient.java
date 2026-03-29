
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
import com.projectmanager.models.MeetingTodoDto;

import com.projectmanager.models.MeetingTodoCreateDto;
import com.projectmanager.models.MeetingTodoUpdateDto;

/**
 * Contains all methods related to MeetingTodos
 */
public class MeetingTodosClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the MeetingTodos API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public MeetingTodosClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Get todos for a meeting
     *
     * @param meetingId The id of the meeting
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingTodoDto[]> getMeetingTodos(@NotNull String meetingId)
    {
        RestRequest<MeetingTodoDto[]> r = new RestRequest<MeetingTodoDto[]>(this.client, "GET", "/api/data/meetings/{meetingId}/todos");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        return r.Call(new TypeToken<AstroResult<MeetingTodoDto[]>>() {}.getType());
    }

    /**
     * Creates a new todos and associates it with the meeting
     *
     * @param meetingId The id of the meeting
     * @param body The todos to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingTodoDto> createMeetingTodos(@NotNull String meetingId, @NotNull MeetingTodoCreateDto body)
    {
        RestRequest<MeetingTodoDto> r = new RestRequest<MeetingTodoDto>(this.client, "POST", "/api/data/meetings/{meetingId}/todos");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<MeetingTodoDto>>() {}.getType());
    }

    /**
     * Update a todos
     *
     * @param todoId The id of the todos
     * @param body The fields to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingTodoDto> updateaMeetingTodos(@NotNull String todoId, @NotNull MeetingTodoUpdateDto body)
    {
        RestRequest<MeetingTodoDto> r = new RestRequest<MeetingTodoDto>(this.client, "PUT", "/api/data/meetings/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<MeetingTodoDto>>() {}.getType());
    }

    /**
     * Remove meeting todos
     *
     * @param todoId The id of the todos to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeMeetingTodos(@NotNull String todoId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/meetings/todos/{todoId}");
        r.AddPath("{todoId}", todoId == null ? "" : todoId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
