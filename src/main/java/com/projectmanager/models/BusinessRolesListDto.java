
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
 * Business roles for the account security UI. Each role includes a permissions object whose keys are camelCase action names (for example invitePeople) with isGranted and subscription-related fields per row.
 */
public class BusinessRolesListDto
{
    private @NotNull RoleDto[] roles;

    /**
     * All business roles in the workspace, including built-in and custom roles.
     *
     * @return The field roles
     */
    public @NotNull RoleDto[] getRoles() { return this.roles; }
    /**
     * All business roles in the workspace, including built-in and custom roles.
     *
     * @param value The new value for roles
     */
    public void setRoles(@NotNull RoleDto[] value) { this.roles = value; }
};
