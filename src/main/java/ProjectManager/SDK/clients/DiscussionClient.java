
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
import ProjectManager.SDK.models.DiscussionDto;

import ProjectManager.SDK.models.DiscussionCreateResponseDto;
import ProjectManager.SDK.models.DiscussionCreateDto;

/**
 * Contains all methods related to Discussion
 */
public class DiscussionClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Discussion API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public DiscussionClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve all comments written about a task
     *
     * @param taskId The unique ID number of the task to retrieve comments
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<DiscussionDto[]> retrieveTaskComments(@NotNull String taskId)
    {
        RestRequest<DiscussionDto[]> r = new RestRequest<DiscussionDto[]>(this.client, "GET", "/api/data/tasks/{taskId}/discussions");
        r.AddPath("{taskId}", taskId.toString());
        return r.Call();
    }

    /**
     * Adds a Markdown-formatted comment to a task.
     *
     * Tasks can have discussions attached to them.  These discussions can include text with simple formatting.  Discussion comments are formatted using [Markdown](https://www.markdownguide.org/) and users should be aware that HTML embedding is not permitted due to the risk of cross-site attacks and other embedding challenges.
     *
     * @param taskId The unique ID number of the task being commented upon
     * @param body The Markdown-formatted text of the comment
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<DiscussionCreateResponseDto> createTaskComments(@NotNull String taskId, @NotNull DiscussionCreateDto body)
    {
        RestRequest<DiscussionCreateResponseDto> r = new RestRequest<DiscussionCreateResponseDto>(this.client, "POST", "/api/data/tasks/{taskId}/discussions");
        r.AddPath("{taskId}", taskId.toString());
        r.AddBody(body);
        return r.Call();
    }
}
