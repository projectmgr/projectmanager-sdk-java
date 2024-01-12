
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
     * Member's role in the project
     *
     * @return The field permission
     */
    public @Nullable String getPermission() { return this.permission; }
    /**
     * Member's role in the project
     *
     * @param value The new value for permission
     */
    public void setPermission(@Nullable String value) { this.permission = value; }
};
