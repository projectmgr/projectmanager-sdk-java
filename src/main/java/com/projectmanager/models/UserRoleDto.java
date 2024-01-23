
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
 * A UserRole is a name for a privilege level granted to a specific User.  The 'Global Admin'
 * UserRole is granted to the owner of the Workspace, and this UserRole cannot be changed.
 * You can choose which UserRole applies to a User within your Workspace.
 */
public class UserRoleDto
{
    private @NotNull String id;
    private @Nullable String name;

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
    public @Nullable String getName() { return this.name; }
    /**
     * The friendly name of this UserRole.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
