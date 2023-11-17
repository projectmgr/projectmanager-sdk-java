
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
import com.projectmanager.models.ProjectFolderDto;

/**
 * Contains all methods related to ProjectFolder
 */
public class ProjectFolderClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectFolder API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectFolderClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectFolders defined within your Workspace.
     *
     * A ProjectFolder is a named storage location that can contain Projects.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFolderDto[]> retrieveProjectFolders(@Nullable Object xintegrationname)
    {
        RestRequest<ProjectFolderDto[]> r = new RestRequest<ProjectFolderDto[]>(this.client, "GET", "/api/data/project-folders");
        return r.Call(new TypeToken<AstroResult<ProjectFolderDto[]>>() {}.getType());
    }
}
