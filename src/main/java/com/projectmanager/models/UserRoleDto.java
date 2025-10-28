
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
 * A UserRole is a name for a privilege level granted to a specific User.  The 'Global Admin'
 * UserRole is granted to the owner of the Workspace, and this UserRole cannot be changed.
 * You can choose which UserRole applies to a User within your Workspace.
 */
public class UserRoleDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String description;
    private @NotNull Boolean isAdmin;
    private @NotNull Boolean isCustom;
    private @NotNull Boolean isGlobalAdmin;
    private @NotNull Boolean isGuest;
    private @NotNull Boolean isDefault;
    private @NotNull UserRolePermissionsDto permissions;

    /**
     * The unique identifier of this UserRole.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this UserRole.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The friendly name of this UserRole.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The friendly name of this UserRole.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The description of this UserRole.
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * The description of this UserRole.
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
    /**
     * Set to true if this is the default Admin role
     *
     * @return The field isAdmin
     */
    public @NotNull Boolean getIsAdmin() { return this.isAdmin; }
    /**
     * Set to true if this is the default Admin role
     *
     * @param value The new value for isAdmin
     */
    public void setIsAdmin(@NotNull Boolean value) { this.isAdmin = value; }
    /**
     * Set to true if this is a custom role (Only supported on Enterprise Plan)
     *
     * @return The field isCustom
     */
    public @NotNull Boolean getIsCustom() { return this.isCustom; }
    /**
     * Set to true if this is a custom role (Only supported on Enterprise Plan)
     *
     * @param value The new value for isCustom
     */
    public void setIsCustom(@NotNull Boolean value) { this.isCustom = value; }
    /**
     * Set to true if this is the default Global Admin role
     *
     * @return The field isGlobalAdmin
     */
    public @NotNull Boolean getIsGlobalAdmin() { return this.isGlobalAdmin; }
    /**
     * Set to true if this is the default Global Admin role
     *
     * @param value The new value for isGlobalAdmin
     */
    public void setIsGlobalAdmin(@NotNull Boolean value) { this.isGlobalAdmin = value; }
    /**
     * Set to true if this is the Guest role
     *
     * @return The field isGuest
     */
    public @NotNull Boolean getIsGuest() { return this.isGuest; }
    /**
     * Set to true if this is the Guest role
     *
     * @param value The new value for isGuest
     */
    public void setIsGuest(@NotNull Boolean value) { this.isGuest = value; }
    /**
     * This is the role that will be assigned to new users by default.
     *
     * @return The field isDefault
     */
    public @NotNull Boolean getIsDefault() { return this.isDefault; }
    /**
     * This is the role that will be assigned to new users by default.
     *
     * @param value The new value for isDefault
     */
    public void setIsDefault(@NotNull Boolean value) { this.isDefault = value; }
    /**
     * Returns the permission setup associated with this UserRole
     *
     * @return The field permissions
     */
    public @NotNull UserRolePermissionsDto getPermissions() { return this.permissions; }
    /**
     * Returns the permission setup associated with this UserRole
     *
     * @param value The new value for permissions
     */
    public void setPermissions(@NotNull UserRolePermissionsDto value) { this.permissions = value; }
};
