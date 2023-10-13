
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
import com.projectmanager.models.FileDto;


/**
 * Contains all methods related to HomeFile
 */
public class HomeFileClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the HomeFile API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public HomeFileClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Uploads a file to a Home folder.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param filename The full path of a file to upload to the API
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadHomeFile(@NotNull byte[] filename)
    {
        RestRequest<FileDto> r = new RestRequest<FileDto>(this.client, "POST", "/api/data/home/files");
        return r.Call();
    }

    /**
     * Uploads a file to a home folder.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param folderId The reference to the sub folder to put the file into
     * @param filename The full path of a file to upload to the API
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<FileDto> uploadHomeFileToFolder(@NotNull String folderId, @NotNull byte[] filename)
    {
        RestRequest<FileDto> r = new RestRequest<FileDto>(this.client, "POST", "/api/data/home/folders/{folderId}/files");
        r.AddPath("{folderId}", folderId.toString());
        return r.Call();
    }
}
