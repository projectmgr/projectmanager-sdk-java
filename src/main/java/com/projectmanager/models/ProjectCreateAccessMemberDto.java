
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
 * Represents project member that have access to new project
 */
public class ProjectCreateAccessMemberDto
{
    private @NotNull String userId;
    private @Nullable String permission;

    /**
     * Member's id
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * Member's id
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
    /**
     * Member's role in the project, if left empty the default role will be used
     *
     * For users with Access All Data permission, this will be set to `Manager`.
     * For guests, this will be set to `Guest`.
     * For all other users, this will be set to `Editor`.
     *
     * Valid values are: `Manager`, `Editor`, `Collaborate`, `Guest`.
     *
     * @return The field permission
     */
    public @Nullable String getPermission() { return this.permission; }
    /**
     * Member's role in the project, if left empty the default role will be used
     *
     * For users with Access All Data permission, this will be set to `Manager`.
     * For guests, this will be set to `Guest`.
     * For all other users, this will be set to `Editor`.
     *
     * Valid values are: `Manager`, `Editor`, `Collaborate`, `Guest`.
     *
     * @param value The new value for permission
     */
    public void setPermission(@Nullable String value) { this.permission = value; }
};
