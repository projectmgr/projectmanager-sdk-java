
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


package ProjectManager.SDK.clients;

import ProjectManager.SDK.ProjectManagerClient;
import ProjectManager.SDK.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ProjectManager.SDK.AstroResult;
import ProjectManager.SDK.models.ChangeSetStatusDto;

import ProjectManager.SDK.models.AssigneeUpsertDto;
import ProjectManager.SDK.models.IdDto;

/**
 * Contains all methods related to TaskAssignee
 */
public class TaskAssigneeClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskAssignee API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public TaskAssigneeClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Replace all TaskAssignees on a Task with new TaskAssignees.
     *
     * A TaskAssignee is an assignment of a Resource to a Task.  You can assign multiple Resources to a Task and designate what proportion of their time will be allocated to this Task.
     *
     * @param taskId The unique identifier of the Task whose TaskAssignees will be replaced
     * @param body The new list of TaskAssignees for this Task
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> replaceTaskAssignees(@NotNull String taskId, @NotNull AssigneeUpsertDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/assignees");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Adds or updates a TaskAssignee to a Task.  If the TaskAssignee is already assigned to the Task, update their allocation.  If the TaskAssignee is not yet assigned to the Task, assign them and set their allocation level to the correct amount.
     *
     * A TaskAssignee is an assignment of a Resource to a Task.  You can assign multiple Resources to a Task and designate what proportion of their time will be allocated to this Task.
     *
     * @param taskId The unique identifier of the Task to add or update an assignment
     * @param body List of Assignee data
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> createOrUpdateTaskAssignee(@NotNull String taskId, @NotNull AssigneeUpsertDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "PUT", "/api/data/tasks/{taskId}/assignees");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Remove one or more TaskAssignees from a Task.
     *
     * A TaskAssignee is an assignment of a Resource to a Task.  You can assign multiple Resources to a Task and designate what proportion of their time will be allocated to this Task.
     *
     * @param taskId The unique identifier of the Task whose TaskAssignee will be removed
     * @param body List of TaskAssignee records to remove
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> deleteTaskAssignees(@NotNull String taskId, @NotNull IdDto[] body)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/assignees");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }
}
