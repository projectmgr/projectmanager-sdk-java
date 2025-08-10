
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
import com.projectmanager.models.TaskTagDto;

import com.projectmanager.models.NameDto;

/**
 * Contains all methods related to NptTag
 */
public class NptTagClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptTag API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptTagClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Replaces the existing TaskTags on a Task with a newly provided list of TaskTags.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many
     * TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you
     * classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will replace TaskTags
     * @param body The replacement list of TaskTags for this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> replaceTaskTags(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "POST", "/api/data/non-project-tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Add one or more new TaskTags to a Task.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many
     * TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you
     * classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will add TaskTags
     * @param body The new TaskTags to add to this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> addTaskTagtoTask(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "PUT", "/api/data/non-project-tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Removes one or more existing TaskTags from a Task.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many
     * TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you
     * classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will remove existing TaskTags
     * @param body The TaskTags to remove from this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeTaskTagfromTask(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieve the existing TaskTags on a Task
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many
     * TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you
     * classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will retrieve TaskTags
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> retrieveTaskTags(@NotNull String taskId)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "GET", "/api/data/non-project-tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }
}
