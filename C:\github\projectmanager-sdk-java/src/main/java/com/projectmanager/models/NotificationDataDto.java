
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contains the optional data associated with the notifcation.
 */
public class NotificationDataDto
{
    private @Nullable String taskId;
    private @Nullable String projectId;
    private @Nullable String taskShortId;
    private @Nullable String projectShortId;
    private @Nullable String projectName;
    private @Nullable String taskName;
    private @Nullable String senderFirstName;
    private @Nullable String assigneeId;
    private @Nullable String view;
    private @Nullable String shareId;
    private @Nullable String fileName;

    /**
     * Set if the notification is related to a task
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * Set if the notification is related to a task
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * Set if the notification is related to a project
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * Set if the notification is related to a project
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * set if the notification is related to a task
     *
     * @return The field taskShortId
     */
    public @Nullable String getTaskShortId() { return this.taskShortId; }
    /**
     * set if the notification is related to a task
     *
     * @param value The new value for taskShortId
     */
    public void setTaskShortId(@Nullable String value) { this.taskShortId = value; }
    /**
     * set if the notification is related to a project
     *
     * @return The field projectShortId
     */
    public @Nullable String getProjectShortId() { return this.projectShortId; }
    /**
     * set if the notification is related to a project
     *
     * @param value The new value for projectShortId
     */
    public void setProjectShortId(@Nullable String value) { this.projectShortId = value; }
    /**
     * Name of the project the notification is related to
     *
     * @return The field projectName
     */
    public @Nullable String getProjectName() { return this.projectName; }
    /**
     * Name of the project the notification is related to
     *
     * @param value The new value for projectName
     */
    public void setProjectName(@Nullable String value) { this.projectName = value; }
    /**
     * Name of the task this notification is related to
     *
     * @return The field taskName
     */
    public @Nullable String getTaskName() { return this.taskName; }
    /**
     * Name of the task this notification is related to
     *
     * @param value The new value for taskName
     */
    public void setTaskName(@Nullable String value) { this.taskName = value; }
    /**
     * Firstname of the person initiating the notification
     *
     * @return The field senderFirstName
     */
    public @Nullable String getSenderFirstName() { return this.senderFirstName; }
    /**
     * Firstname of the person initiating the notification
     *
     * @param value The new value for senderFirstName
     */
    public void setSenderFirstName(@Nullable String value) { this.senderFirstName = value; }
    /**
     * Assignee for the notification
     *
     * @return The field assigneeId
     */
    public @Nullable String getAssigneeId() { return this.assigneeId; }
    /**
     * Assignee for the notification
     *
     * @param value The new value for assigneeId
     */
    public void setAssigneeId(@Nullable String value) { this.assigneeId = value; }
    /**
     * View
     *
     * @return The field view
     */
    public @Nullable String getView() { return this.view; }
    /**
     * View
     *
     * @param value The new value for view
     */
    public void setView(@Nullable String value) { this.view = value; }
    /**
     * Id for the shared item
     *
     * @return The field shareId
     */
    public @Nullable String getShareId() { return this.shareId; }
    /**
     * Id for the shared item
     *
     * @param value The new value for shareId
     */
    public void setShareId(@Nullable String value) { this.shareId = value; }
    /**
     * Name of the file
     *
     * @return The field fileName
     */
    public @Nullable String getFileName() { return this.fileName; }
    /**
     * Name of the file
     *
     * @param value The new value for fileName
     */
    public void setFileName(@Nullable String value) { this.fileName = value; }
};
