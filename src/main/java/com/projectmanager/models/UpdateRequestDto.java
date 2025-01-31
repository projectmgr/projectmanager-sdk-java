
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an update request for a File within ProjectManager.
 *
 * ProjectManager allows you to store Files connected to other elements of your Workspace
 * such as a Project or a Discussion.  When you upload a File, please allow a few moments
 * for the File to be processed and verified.  ProjectManager may reject File uploads that
 * contain problems such as malware. Once a File has completed the upload the process, you
 * may retrieve it using the DownloadFile API.
 */
public class UpdateRequestDto
{
    private @NotNull String name;
    private @Nullable String taskId;
    private @Nullable String folderId;

    /**
     * The new name for the File.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The new name for the File.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * To assign this File to a Task, specify the TaskId here.
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * To assign this File to a Task, specify the TaskId here.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * To move this File to a new Folder, specify the Folder's unique identifier here.
     *
     * @return The field folderId
     */
    public @Nullable String getFolderId() { return this.folderId; }
    /**
     * To move this File to a new Folder, specify the Folder's unique identifier here.
     *
     * @param value The new value for folderId
     */
    public void setFolderId(@Nullable String value) { this.folderId = value; }
};
