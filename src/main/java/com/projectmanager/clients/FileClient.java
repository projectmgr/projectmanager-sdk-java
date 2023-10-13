
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

import com.projectmanager.models.UpdateRequestDto;

/**
 * Contains all methods related to File
 */
public class FileClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the File API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public FileClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Downloads the contents of a file that was previously uploaded to ProjectManager.com.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param documentId The unique identifier of the document to download
     * @param type If you specify a type of `html`, processes the file using text encoding, otherwise binary
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> downloadFile(@NotNull String documentId, @Nullable String type)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "GET", "/api/data/files/{documentId}/download");
        r.AddPath("{documentId}", documentId.toString());
        r.AddQuery("type", type.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Updates information about a File uploaded to your Workspace.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * @param fileId The unique identifier of the File to update
     * @param body Information to change about the File and its location
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateFile(@NotNull String fileId, @NotNull UpdateRequestDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/files/{fileId}");
        r.AddPath("{fileId}", fileId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
