
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
import com.projectmanager.models.ProjectFolderDto;
import com.projectmanager.models.ProjectFolderCreateDto;

import com.projectmanager.models.ProjectFolderUpdateDto;

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
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFolderDto[]> retrieveProjectFolders()
    {
        RestRequest<ProjectFolderDto[]> r = new RestRequest<ProjectFolderDto[]>(this.client, "GET", "/api/data/project-folders");
        return r.Call(new TypeToken<AstroResult<ProjectFolderDto[]>>() {}.getType());
    }

    /**
     * Create a project folder
     *
     * @param body The data to create the folder
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFolderDto> createProjectFolder(@NotNull ProjectFolderCreateDto body)
    {
        RestRequest<ProjectFolderDto> r = new RestRequest<ProjectFolderDto>(this.client, "POST", "/api/data/project-folders");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectFolderDto>>() {}.getType());
    }

    /**
     * Update a project folder
     *
     * @param projectFolderId The id of the folder
     * @param body The data to update the folder
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFolderDto> updateProjectFolder(@NotNull String projectFolderId, @NotNull ProjectFolderUpdateDto body)
    {
        RestRequest<ProjectFolderDto> r = new RestRequest<ProjectFolderDto>(this.client, "PUT", "/api/data/project-folders/{projectFolderId}");
        r.AddPath("{projectFolderId}", projectFolderId == null ? "" : projectFolderId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectFolderDto>>() {}.getType());
    }

    /**
     * Delete a project folder
     *
     * @param projectFolderId The id of the folder
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProjectFolder(@NotNull String projectFolderId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/project-folders/{projectFolderId}");
        r.AddPath("{projectFolderId}", projectFolderId == null ? "" : projectFolderId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
