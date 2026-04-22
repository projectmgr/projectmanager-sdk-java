
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
 * Workspace business role returned by the data API security endpoints (list/update responses and create response).
 */
public class RoleDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull Boolean isGlobalAdmin;
    private @NotNull Boolean isAdmin;
    private @NotNull Boolean isCustom;
    private @NotNull Boolean isDefault;
    private @NotNull Boolean isGuest;
    private @NotNull Object permissions;

    /**
     * Unique identifier of the business user role (`BusinessUserRoleId`).
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Unique identifier of the business user role (`BusinessUserRoleId`).
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Display name of the role (e.g. Member, Manager, or a custom role name).
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * Display name of the role (e.g. Member, Manager, or a custom role name).
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * Optional description; for system roles may match a well-known description token used server-side.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Optional description; for system roles may match a well-known description token used server-side.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * True when this row is the non-editable global administrator role for the workspace.
     *
     * @return The field isGlobalAdmin
     */
    public @NotNull Boolean getIsGlobalAdmin() { return this.isGlobalAdmin; }
    /**
     * True when this row is the non-editable global administrator role for the workspace.
     *
     * @param value The new value for isGlobalAdmin
     */
    public void setIsGlobalAdmin(@NotNull Boolean value) { this.isGlobalAdmin = value; }
    /**
     * True when this role has account administrator privileges (non-guest elevated role).
     *
     * @return The field isAdmin
     */
    public @NotNull Boolean getIsAdmin() { return this.isAdmin; }
    /**
     * True when this role has account administrator privileges (non-guest elevated role).
     *
     * @param value The new value for isAdmin
     */
    public void setIsAdmin(@NotNull Boolean value) { this.isAdmin = value; }
    /**
     * True for user-defined roles; false for built-in system roles.
     *
     * @return The field isCustom
     */
    public @NotNull Boolean getIsCustom() { return this.isCustom; }
    /**
     * True for user-defined roles; false for built-in system roles.
     *
     * @param value The new value for isCustom
     */
    public void setIsCustom(@NotNull Boolean value) { this.isCustom = value; }
    /**
     * True when this role represents the default team member role for the workspace.
     *
     * @return The field isDefault
     */
    public @NotNull Boolean getIsDefault() { return this.isDefault; }
    /**
     * True when this role represents the default team member role for the workspace.
     *
     * @param value The new value for isDefault
     */
    public void setIsDefault(@NotNull Boolean value) { this.isDefault = value; }
    /**
     * True when this role is the guest (client) role with restricted permissions.
     *
     * @return The field isGuest
     */
    public @NotNull Boolean getIsGuest() { return this.isGuest; }
    /**
     * True when this role is the guest (client) role with restricted permissions.
     *
     * @param value The new value for isGuest
     */
    public void setIsGuest(@NotNull Boolean value) { this.isGuest = value; }
    /**
     * Workspace security matrix. Keys are camelCase action names (for example invitePeople). Each entry includes isGranted and, when the action is subscription-gated, optional featureId and featureName.
     *
     * @return The field permissions
     */
    public @NotNull Object getPermissions() { return this.permissions; }
    /**
     * Workspace security matrix. Keys are camelCase action names (for example invitePeople). Each entry includes isGranted and, when the action is subscription-gated, optional featureId and featureName.
     *
     * @param value The new value for permissions
     */
    public void setPermissions(@NotNull Object value) { this.permissions = value; }
};
