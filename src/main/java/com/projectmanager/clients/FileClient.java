
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
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
     * ProjectManager allows you to store Files connected to other elements of your Workspace
     * such as a Project, a Task, or Home.  Files are maintained separately based on the location
     * where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified.
     * ProjectManager may reject File uploads that contain problems such as malware. Once a File has
     * completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * If successful, this API returns the file contents as an octet-stream (raw bytes).  If an error
     * occurs, you will receive a JSON result with error information.
     *
     * @param documentId The unique identifier of the document to download
     * @param type If you specify a type of `html`, processes the file using text encoding, otherwise binary
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<byte[]> downloadFile(@NotNull String documentId, @Nullable String type)
    {
        BlobRequest r = new BlobRequest(this.client, "GET", "/api/data/files/{documentId}/download");
        r.AddPath("{documentId}", documentId == null ? "" : documentId.toString());
        if (type != null) { r.AddQuery("type", type.toString()); }
        return r.Call(new TypeToken<AstroResult<byte[]>>() {}.getType());
    }

    /**
     * Downloads a thumbnail image associated with a document that was previously uploaded to ProjectManager.com.
     *
     * ProjectManager allows you to store files linked to various elements within your Workspace,
     * such as Projects, Tasks, or your Home. Files are organized based on their storage location.
     *
     * When uploading a file, please allow some time for the file to undergo processing and verification.
     * ProjectManager may reject file uploads containing issues such as malware. Once a file has
     * completed the upload process, you can retrieve its associated thumbnail using the DownloadThumbnail API.
     *
     * If successful, this API returns the file contents as an octet-stream (raw bytes).  If an error
     * occurs, you will receive a JSON result with error information.
     *
     * @param documentId The unique identifier of the document for which to download the thumbnail.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<byte[]> downloadaThumbnailImage(@NotNull String documentId)
    {
        BlobRequest r = new BlobRequest(this.client, "GET", "/api/data/files/{documentId}/thumbnail");
        r.AddPath("{documentId}", documentId == null ? "" : documentId.toString());
        return r.Call(new TypeToken<AstroResult<byte[]>>() {}.getType());
    }

    /**
     * Updates information about a File uploaded to your Workspace.
     *
     * ProjectManager allows you to store Files connected to other elements of your Workspace such as a Project, a Task, or Home.  Files are maintained separately based on the location where the file was stored.
     *
     * When you upload a File, please allow a few moments for the File to be processed and verified. ProjectManager may reject File uploads that contain problems such as malware. Once a File has completed the upload the process, you may retrieve it using the DownloadFile API.
     *
     * This API returns a JSON response indicating success or failure.
     *
     * @param fileId The unique identifier of the File to update
     * @param body Information to change about the File and its location
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateFile(@NotNull String fileId, @NotNull UpdateRequestDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/files/{fileId}");
        r.AddPath("{fileId}", fileId == null ? "" : fileId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * In case of soft delete moves file to trash folder. For hard delete completely deletes file's metadata from pm database as well as from amazon storage
     *
     * This API returns a JSON response indicating success or failure.
     *
     * @param fileId The unique identifier of the File to delete
     * @param hard Param indicates that file should be hard deleted
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deletefile(@NotNull String fileId, @Nullable Boolean hard)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/files/{fileId}");
        r.AddPath("{fileId}", fileId == null ? "" : fileId.toString());
        if (hard != null) { r.AddQuery("hard", hard.toString()); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
