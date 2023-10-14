
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a file in project manager
 */
public class FileDto
{
    private @NotNull String id;
    private @Nullable String projectId;
    private @Nullable String taskId;
    private @NotNull String ownerId;
    private @NotNull String createdDate;
    private @NotNull String folderId;
    private @Nullable String fileType;
    private @Nullable String fileTypeLabel;
    private @NotNull Integer size;
    private @Nullable String downloadPath;
    private @NotNull Boolean deleted;
    private @Nullable String type;
    private @Nullable String name;
    private @NotNull String entityOwnerId;

    /**
     * The identifier for this file
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The identifier for this file
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * If specified this file belongs to a project. The value is the id of  this project
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * If specified this file belongs to a project. The value is the id of  this project
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * If specified, the file has been associated with this task.
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * If specified, the file has been associated with this task.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * The reference for who uploaded the file
     *
     * @return The field ownerId
     */
    public @NotNull String getOwnerId() { return this.ownerId; }
    /**
     * The reference for who uploaded the file
     *
     * @param value The new value for ownerId
     */
    public void setOwnerId(@NotNull String value) { this.ownerId = value; }
    /**
     * The UTC time the file was created.
     *
     * @return The field createdDate
     */
    public @NotNull String getCreatedDate() { return this.createdDate; }
    /**
     * The UTC time the file was created.
     *
     * @param value The new value for createdDate
     */
    public void setCreatedDate(@NotNull String value) { this.createdDate = value; }
    /**
     * A reference to the folder
     *
     * @return The field folderId
     */
    public @NotNull String getFolderId() { return this.folderId; }
    /**
     * A reference to the folder
     *
     * @param value The new value for folderId
     */
    public void setFolderId(@NotNull String value) { this.folderId = value; }
    /**
     * The type of the file
     *
     * @return The field fileType
     */
    public @Nullable String getFileType() { return this.fileType; }
    /**
     * The type of the file
     *
     * @param value The new value for fileType
     */
    public void setFileType(@Nullable String value) { this.fileType = value; }
    /**
     * A user friendly label for the file type
     *
     * @return The field fileTypeLabel
     */
    public @Nullable String getFileTypeLabel() { return this.fileTypeLabel; }
    /**
     * A user friendly label for the file type
     *
     * @param value The new value for fileTypeLabel
     */
    public void setFileTypeLabel(@Nullable String value) { this.fileTypeLabel = value; }
    /**
     * Size of the file in bytes
     *
     * @return The field size
     */
    public @NotNull Integer getSize() { return this.size; }
    /**
     * Size of the file in bytes
     *
     * @param value The new value for size
     */
    public void setSize(@NotNull Integer value) { this.size = value; }
    /**
     * Path to download the file
     *
     * @return The field downloadPath
     */
    public @Nullable String getDownloadPath() { return this.downloadPath; }
    /**
     * Path to download the file
     *
     * @param value The new value for downloadPath
     */
    public void setDownloadPath(@Nullable String value) { this.downloadPath = value; }
    /**
     * Is the file in the trash can
     *
     * @return The field deleted
     */
    public @NotNull Boolean getDeleted() { return this.deleted; }
    /**
     * Is the file in the trash can
     *
     * @param value The new value for deleted
     */
    public void setDeleted(@NotNull Boolean value) { this.deleted = value; }
    /**
     * Defines the object type the file belongs to.
     *
     * @return The field type
     */
    public @Nullable String getType() { return this.type; }
    /**
     * Defines the object type the file belongs to.
     *
     * @param value The new value for type
     */
    public void setType(@Nullable String value) { this.type = value; }
    /**
     * The name of the file
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the file
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Id of owner of parent entity
     *
     * @return The field entityOwnerId
     */
    public @NotNull String getEntityOwnerId() { return this.entityOwnerId; }
    /**
     * Id of owner of parent entity
     *
     * @param value The new value for entityOwnerId
     */
    public void setEntityOwnerId(@NotNull String value) { this.entityOwnerId = value; }
};
