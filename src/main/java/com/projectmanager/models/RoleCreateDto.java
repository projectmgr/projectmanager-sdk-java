
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
 * Request body for POST /api/data/security/businessroles. Creates a custom workspace role; the server assigns the role id and the name must be unique in the workspace. Permission flags use the same shape as RetrieveMe `permissions` (Astro.Common.Dto.WorkSpaces.WorkSpacePermissionsDto). Subscription entitlements are applied server-side; nothing in Chargebee is updated by this request.
 */
public class RoleCreateDto
{
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull WorkSpacePermissionsDto permissions;

    /**
     * Display name of the new custom role; must not duplicate another role name in the workspace (case-insensitive).
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * Display name of the new custom role; must not duplicate another role name in the workspace (case-insensitive).
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * Optional description; must not match reserved system role description tokens.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Optional description; must not match reserved system role description tokens.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Workspace permissions for the new role. Same property names as RetrieveMe; `true`/`false` per flag. Omitted or null properties are treated as off. `ChangeOwnEmail` is not modeled here and defaults to off for new custom roles.
     *
     * @return The field permissions
     */
    public @NotNull WorkSpacePermissionsDto getPermissions() { return this.permissions; }
    /**
     * Workspace permissions for the new role. Same property names as RetrieveMe; `true`/`false` per flag. Omitted or null properties are treated as off. `ChangeOwnEmail` is not modeled here and defaults to off for new custom roles.
     *
     * @param value The new value for permissions
     */
    public void setPermissions(@NotNull WorkSpacePermissionsDto value) { this.permissions = value; }
};
