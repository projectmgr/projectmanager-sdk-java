
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
 * Represents a document or file attached to a timesheet day entry.
 */
public class TimesheetFileResponseDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String url;
    private @NotNull String fileType;
    private @NotNull String fileTypeLabel;
    private @Nullable String date;
    private @NotNull Integer size;
    private @NotNull String projectId;
    private @NotNull String projectType;
    private @Nullable String taskId;
    private @Nullable String newFilename;
    private @Nullable Boolean canRead;
    private @Nullable String thumbnailUrl;
    private @Nullable String externalId;
    private @NotNull Boolean canDelete;
    private @NotNull Boolean isLocked;
    private @NotNull String type;
    private @NotNull Boolean dirty;
    private @NotNull Boolean deleted;
    private @NotNull Boolean isNew;

    /**
     * The unique identifier of the document.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the document.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of the file (including extension).
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the file (including extension).
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The download or access URL for the file.
     *
     * @return The field url
     */
    public @NotNull String getUrl() { return this.url; }
    /**
     * The download or access URL for the file.
     *
     * @param value The new value for url
     */
    public void setUrl(@NotNull String value) { this.url = value; }
    /**
     * The file type or extension (e.g., "pdf", "png").
     *
     * @return The field fileType
     */
    public @NotNull String getFileType() { return this.fileType; }
    /**
     * The file type or extension (e.g., "pdf", "png").
     *
     * @param value The new value for fileType
     */
    public void setFileType(@NotNull String value) { this.fileType = value; }
    /**
     * A user-friendly label describing the file type (e.g., "PDF Document").
     *
     * @return The field fileTypeLabel
     */
    public @NotNull String getFileTypeLabel() { return this.fileTypeLabel; }
    /**
     * A user-friendly label describing the file type (e.g., "PDF Document").
     *
     * @param value The new value for fileTypeLabel
     */
    public void setFileTypeLabel(@NotNull String value) { this.fileTypeLabel = value; }
    /**
     * The date and time the file was uploaded or created.
     *
     * @return The field date
     */
    public @Nullable String getDate() { return this.date; }
    /**
     * The date and time the file was uploaded or created.
     *
     * @param value The new value for date
     */
    public void setDate(@Nullable String value) { this.date = value; }
    /**
     * The size of the file in bytes.
     *
     * @return The field size
     */
    public @NotNull Integer getSize() { return this.size; }
    /**
     * The size of the file in bytes.
     *
     * @param value The new value for size
     */
    public void setSize(@NotNull Integer value) { this.size = value; }
    /**
     * The ID of the project associated with the file.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The ID of the project associated with the file.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * The type of project (e.g., "project", "admin").
     *
     * @return The field projectType
     */
    public @NotNull String getProjectType() { return this.projectType; }
    /**
     * The type of project (e.g., "project", "admin").
     *
     * @param value The new value for projectType
     */
    public void setProjectType(@NotNull String value) { this.projectType = value; }
    /**
     * The ID of the task this file is associated with, if any.
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * The ID of the task this file is associated with, if any.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * A new file name for the document, if renamed.
     *
     * @return The field newFilename
     */
    public @Nullable String getNewFilename() { return this.newFilename; }
    /**
     * A new file name for the document, if renamed.
     *
     * @param value The new value for newFilename
     */
    public void setNewFilename(@Nullable String value) { this.newFilename = value; }
    /**
     * Whether other users can read the document.
     *
     * @return The field canRead
     */
    public @Nullable Boolean getCanRead() { return this.canRead; }
    /**
     * Whether other users can read the document.
     *
     * @param value The new value for canRead
     */
    public void setCanRead(@Nullable Boolean value) { this.canRead = value; }
    /**
     * A thumbnail URL for previewing the file (if applicable).
     *
     * @return The field thumbnailUrl
     */
    public @Nullable String getThumbnailUrl() { return this.thumbnailUrl; }
    /**
     * A thumbnail URL for previewing the file (if applicable).
     *
     * @param value The new value for thumbnailUrl
     */
    public void setThumbnailUrl(@Nullable String value) { this.thumbnailUrl = value; }
    /**
     * An optional external provider ID (e.g., for integrations).
     *
     * @return The field externalId
     */
    public @Nullable String getExternalId() { return this.externalId; }
    /**
     * An optional external provider ID (e.g., for integrations).
     *
     * @param value The new value for externalId
     */
    public void setExternalId(@Nullable String value) { this.externalId = value; }
    /**
     * Indicates whether the current user has permission to delete the file.
     *
     * @return The field canDelete
     */
    public @NotNull Boolean getCanDelete() { return this.canDelete; }
    /**
     * Indicates whether the current user has permission to delete the file.
     *
     * @param value The new value for canDelete
     */
    public void setCanDelete(@NotNull Boolean value) { this.canDelete = value; }
    /**
     * Indicates whether the file is locked and cannot be modified.
     *
     * @return The field isLocked
     */
    public @NotNull Boolean getIsLocked() { return this.isLocked; }
    /**
     * Indicates whether the file is locked and cannot be modified.
     *
     * @param value The new value for isLocked
     */
    public void setIsLocked(@NotNull Boolean value) { this.isLocked = value; }
    /**
     * The object type identifier used by the frontend ("pm.models.Document").
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * The object type identifier used by the frontend ("pm.models.Document").
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * Indicates whether the document has unsaved changes (used by frontend only).
     *
     * @return The field dirty
     */
    public @NotNull Boolean getDirty() { return this.dirty; }
    /**
     * Indicates whether the document has unsaved changes (used by frontend only).
     *
     * @param value The new value for dirty
     */
    public void setDirty(@NotNull Boolean value) { this.dirty = value; }
    /**
     * Indicates whether the document is marked for deletion (used by frontend only).
     *
     * @return The field deleted
     */
    public @NotNull Boolean getDeleted() { return this.deleted; }
    /**
     * Indicates whether the document is marked for deletion (used by frontend only).
     *
     * @param value The new value for deleted
     */
    public void setDeleted(@NotNull Boolean value) { this.deleted = value; }
    /**
     * Indicates whether the document is newly added (used by frontend only).
     *
     * @return The field isNew
     */
    public @NotNull Boolean getIsNew() { return this.isNew; }
    /**
     * Indicates whether the document is newly added (used by frontend only).
     *
     * @param value The new value for isNew
     */
    public void setIsNew(@NotNull Boolean value) { this.isNew = value; }
};
