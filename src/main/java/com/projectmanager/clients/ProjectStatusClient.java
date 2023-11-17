
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
import com.projectmanager.models.ProjectStatusDto;

/**
 * Contains all methods related to ProjectStatus
 */
public class ProjectStatusClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectStatus API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectStatusClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectStatuses defined within your Workspace.
     *
     * A ProjectStatus is a named condition used by your business to categorize the completion level of Tasks and Projects within your Workspace.  You can name your ProjectStatus levels anything you like and you can reorganize the order of the ProjectPriority levels at any time.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectStatusDto[]> retrieveProjectStatuses()
    {
        RestRequest<ProjectStatusDto[]> r = new RestRequest<ProjectStatusDto[]>(this.client, "GET", "/api/data/projects/statuses");
        return r.Call(new TypeToken<AstroResult<ProjectStatusDto[]>>() {}.getType());
    }
}
