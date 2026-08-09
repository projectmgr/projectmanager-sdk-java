
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
 * Dto To Describe a ProjectMember Role
 */
public class ProjectMemberRoleDto
{
    private @Nullable String role;

    /**
     * Role to apply. Optional — when omitted, a default role is applied based on the
     * target user's workspace access: users who can edit all projects become a Manager,
     * guest users become a Guest, and everyone else becomes an Editor. When updating an
     * existing member, omitting the role leaves their current role unchanged.
     *
     * @return The field role
     */
    public @Nullable String getRole() { return this.role; }
    /**
     * Role to apply. Optional — when omitted, a default role is applied based on the
     * target user's workspace access: users who can edit all projects become a Manager,
     * guest users become a Guest, and everyone else becomes an Editor. When updating an
     * existing member, omitting the role leaves their current role unchanged.
     *
     * @param value The new value for role
     */
    public void setRole(@Nullable String value) { this.role = value; }
};
