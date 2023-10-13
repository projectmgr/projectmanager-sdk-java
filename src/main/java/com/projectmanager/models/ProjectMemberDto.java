
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
 * A ProjectMember is a user who can collaborate on a Project.  You can control
 * permissions for what each ProjectMember can do and how they can interact with
 * the Project using this model.
 */
public class ProjectMemberDto
{
    private @NotNull String id;
    private @Nullable String initials;
    private @Nullable String name;
    private @Nullable String avatarUrl;
    private @Nullable String permission;
    private @Nullable String color;
    private @Nullable PermissionOptionsDto permissionOptions;

    /**
     * The unique identifier of the user of this ProjectMember.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the user of this ProjectMember.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * the initials of the user
     *
     * @return The field initials
     */
    public @Nullable String getInitials() { return this.initials; }
    /**
     * the initials of the user
     *
     * @param value The new value for initials
     */
    public void setInitials(@Nullable String value) { this.initials = value; }
    /**
     * The display name of the user
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The display name of the user
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Avatar URL
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * Avatar URL
     *
     * @param value The new value for avatarUrl
     */
    public void setAvatarUrl(@Nullable String value) { this.avatarUrl = value; }
    /**
     * The current permission of the user
     *
     * @return The field permission
     */
    public @Nullable String getPermission() { return this.permission; }
    /**
     * The current permission of the user
     *
     * @param value The new value for permission
     */
    public void setPermission(@Nullable String value) { this.permission = value; }
    /**
     * The color for their avatar
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * The color for their avatar
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
    /**
     * Specifies the permissions that you can set against the project member. This changes based on who is logged in and the role they have.
     *
     * @return The field permissionOptions
     */
    public @Nullable PermissionOptionsDto getPermissionOptions() { return this.permissionOptions; }
    /**
     * Specifies the permissions that you can set against the project member. This changes based on who is logged in and the role they have.
     *
     * @param value The new value for permissionOptions
     */
    public void setPermissionOptions(@Nullable PermissionOptionsDto value) { this.permissionOptions = value; }
};
