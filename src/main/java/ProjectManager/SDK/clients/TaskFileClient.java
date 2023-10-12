
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
import com.google.gson.reflect.TypeToken;
import ProjectManager.SDK.models.FileDto;

import ProjectManager.SDK.BlobRequest;

/**
 * Contains all methods related to TaskFile
 */
public class TaskFileClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskFile API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public TaskFileClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Uploads a file to a task.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param taskId The reference to the task
     * @param filename The full path of a file to upload to the API
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadTaskFile(@NotNull String taskId, @NotNull byte[] filename)
    {
        RestRequest<AstroResult<FileDto>> r = new RestRequest<AstroResult<FileDto>>(this.client, "POST", "/api/data/tasks/{taskId}/files");
        r.AddPath("{taskId}", taskId.toString());
        return r.Call(new TypeToken<AstroResult<FileDto>>() {}.getType());
    }
}
