
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
import com.projectmanager.AstroResult;
import com.projectmanager.models.ChangeSetStatusDto;

import com.projectmanager.models.NameDto;

/**
 * Contains all methods related to TaskTag
 */
public class TaskTagClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskTag API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskTagClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Replaces the existing TaskTags on a Task with a newly provided list of TaskTags.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will replace TaskTags
     * @param body The replacement list of TaskTags for this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> replaceTaskTags(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Add one or more new TaskTags to a Task.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will add TaskTags
     * @param body The new TaskTags to add to this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> addTaskTagtoTask(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Removes one or more existing TaskTags from a Task.
     *
     * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you classify your Tasks and prioritize work.
     *
     * @param taskId The unique identifier of the Task for which we will remove existing TaskTags
     * @param body The TaskTags to remove from this Task
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> removeTaskTagfromTask(@NotNull String taskId, @NotNull NameDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/tags");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }
}
