
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
 * Represents the access permissions assigned to a single user within a project.
 */
public class ProjectAccessEntryDto
{
    private @NotNull String userId;
    private @Nullable Boolean canEdit;
    private @Nullable Boolean canManage;

    /**
     * The unique identifier of the user to whom the access permissions apply.
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The unique identifier of the user to whom the access permissions apply.
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
    /**
     * Indicates whether the user has permission to edit the project.
     *
     * @return The field canEdit
     */
    public @Nullable Boolean getCanEdit() { return this.canEdit; }
    /**
     * Indicates whether the user has permission to edit the project.
     *
     * @param value The new value for canEdit
     */
    public void setCanEdit(@Nullable Boolean value) { this.canEdit = value; }
    /**
     * Indicates whether the user has permission to manage the project (e.g., assign roles, change settings).
     *
     * @return The field canManage
     */
    public @Nullable Boolean getCanManage() { return this.canManage; }
    /**
     * Indicates whether the user has permission to manage the project (e.g., assign roles, change settings).
     *
     * @param value The new value for canManage
     */
    public void setCanManage(@Nullable Boolean value) { this.canManage = value; }
};
