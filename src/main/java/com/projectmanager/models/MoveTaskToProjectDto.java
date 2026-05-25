
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
 * Move task to project data transfer object. Contains information about target project to move, necessary options and users to add access for if needed.
 */
public class MoveTaskToProjectDto
{
    private @NotNull String projectId;
    private @NotNull Boolean keepTimeEntries;
    private @NotNull String[] addAccessUserIds;

    /**
     * Target project id to move
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * Target project id to move
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * Move time entries associated with the task. If false, time entries will be copied to the new project but remain in the original project as well. If true, time entries will be moved to the new project and removed from the original project.
     *
     * @return The field keepTimeEntries
     */
    public @NotNull Boolean getKeepTimeEntries() { return this.keepTimeEntries; }
    /**
     * Move time entries associated with the task. If false, time entries will be copied to the new project but remain in the original project as well. If true, time entries will be moved to the new project and removed from the original project.
     *
     * @param value The new value for keepTimeEntries
     */
    public void setKeepTimeEntries(@NotNull Boolean value) { this.keepTimeEntries = value; }
    /**
     * List of user IDs to add access for in the new project.
     *
     * @return The field addAccessUserIds
     */
    public @NotNull String[] getAddAccessUserIds() { return this.addAccessUserIds; }
    /**
     * List of user IDs to add access for in the new project.
     *
     * @param value The new value for addAccessUserIds
     */
    public void setAddAccessUserIds(@NotNull String[] value) { this.addAccessUserIds = value; }
};
