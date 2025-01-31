
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
import com.projectmanager.models.FileDto;


/**
 * Contains all methods related to NptFiles
 */
public class NptFilesClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptFiles API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptFilesClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Uploads a file to a non-project task.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace
     * such as a Project, a Task, or Home.  Files are maintained separately based on the location
     * where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified.
     * ProjectManager may reject File uploads that contain problems such as malware. Once a File has
     * completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * This API returns a JSON response indicating success or failure.
     *
     * @param taskId The reference to the task
     * @param fileName The full path of a file to upload to the API
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadFileToNonProjectTasks(@NotNull String taskId, @NotNull byte[] fileName)
    {
        RestRequest<FileDto> r = new RestRequest<FileDto>(this.client, "POST", "/api/data/non-project-tasks/{taskId}/files");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        return r.Call(new TypeToken<AstroResult<FileDto>>() {}.getType());
    }
}
