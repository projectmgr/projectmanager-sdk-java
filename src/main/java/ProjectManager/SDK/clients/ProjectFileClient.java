
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
import ProjectManager.SDK.models.FileDto;


/**
 * Contains all methods related to ProjectFile
 */
public class ProjectFileClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectFile API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public ProjectFileClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Uploads a file to a project folder.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param projectId The reference to the project
     * @param filename The full path of a file to upload to the API
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadProjectFile(@NotNull String projectId, @NotNull byte[] filename)
    {
        RestRequest<FileDto> r = new RestRequest<FileDto>(this.client, "POST", "/api/data/projects/{projectId}/files");
        r.AddPath("{projectId}", projectId.toString());
        return r.Call();
    }

    /**
     * Uploads a file to a project folder.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param projectId The reference to the project
     * @param folderId The reference to the sub folder to put the file into
     * @param filename The full path of a file to upload to the API
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadProjectFileToFolder(@NotNull String projectId, @NotNull String folderId, @NotNull byte[] filename)
    {
        RestRequest<FileDto> r = new RestRequest<FileDto>(this.client, "POST", "/api/data/projects/{projectId}/folders/{folderId}/files");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{folderId}", folderId.toString());
        return r.Call();
    }
}
