
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
 * DTO to assign roles to a list of project members
 */
public class ProjectMembersAccessDto
{
    private @NotNull ProjectAccessEntryDto[] projectAccess;

    /**
     * List of project members and their roles
     *
     * @return The field projectAccess
     */
    public @NotNull ProjectAccessEntryDto[] getProjectAccess() { return this.projectAccess; }
    /**
     * List of project members and their roles
     *
     * @param value The new value for projectAccess
     */
    public void setProjectAccess(@NotNull ProjectAccessEntryDto[] value) { this.projectAccess = value; }
};
