
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
import com.projectmanager.models.ChangeSetStatusDto;

import com.projectmanager.models.TaskLinkCreateDto;
import com.projectmanager.models.TaskLinkUpdateDto;
import com.projectmanager.models.TaskLinkDto;

/**
 * Contains all methods related to TaskLink
 */
public class TaskLinkClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskLink API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskLinkClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Creates a new link (dependency) from this Task to another Task in the same Project.
     *
     * A Task Link connects a predecessor Task to a successor Task, indicating a scheduling
     * dependency between them. The link type controls how the two Tasks' dates relate to
     * each other, and lag adds (or, if negative, removes) time between them.
     *
     * Valid LinkType values (case-insensitive): finishToStart, startToStart, finishToFinish, startToFinish.
     * Omitting LinkType defaults to finishToStart.
     *
     * @param taskId The unique identifier of the predecessor Task for this link
     * @param body The Task to link to, along with the link type and lag
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> createTaskLink(@NotNull String taskId, @NotNull TaskLinkCreateDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/links-to");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Updates the link type and/or lag of an existing link between this Task and another Task.
     *
     * @param taskId The unique identifier of the predecessor Task for this link
     * @param successorTaskId The unique identifier of the successor Task for this link
     * @param body The new link type and lag for this link
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> updateTaskLink(@NotNull String taskId, @NotNull String successorTaskId, @NotNull TaskLinkUpdateDto body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/links-to/{successorTaskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{successorTaskId}", successorTaskId == null ? "" : successorTaskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Removes an existing link between this Task and another Task.
     *
     * @param taskId The unique identifier of the predecessor Task for this link
     * @param successorTaskId The unique identifier of the successor Task for this link
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> deleteTaskLink(@NotNull String taskId, @NotNull String successorTaskId)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/links-to/{successorTaskId}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{successorTaskId}", successorTaskId == null ? "" : successorTaskId.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Retrieve the existing links from this Task to other Tasks.
     *
     * @param taskId The unique identifier of the predecessor Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskLinkDto[]> retrieveTaskLinks(@NotNull String taskId)
    {
        RestRequest<TaskLinkDto[]> r = new RestRequest<TaskLinkDto[]>(this.client, "GET", "/api/data/tasks/{taskId}/links");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskLinkDto[]>>() {}.getType());
    }
}
