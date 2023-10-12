
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
import ProjectManager.SDK.models.ProjectPriorityDto;

/**
 * Contains all methods related to ProjectPriority
 */
public class ProjectPriorityClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectPriority API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public ProjectPriorityClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectPriorities defined within your Workspace.
     *
     * A ProjectPriority is a named priority level used by your business to determine how to decide which Tasks are the most important.  You can name your ProjectPriority levels anything you like and you can reorganize the order of the ProjectPriority levels at any time.
     *
     * Note that TaskPriority and ProjectPriority are different classes of priority levels.  Even if they may have similar names, they are different objects and must be tracked separately.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectPriorityDto[]> retrieveProjectPriorities()
    {
        RestRequest<ProjectPriorityDto[]> r = new RestRequest<ProjectPriorityDto[]>(this.client, "GET", "/api/data/projects/priorities");
        return r.Call();
    }
}
