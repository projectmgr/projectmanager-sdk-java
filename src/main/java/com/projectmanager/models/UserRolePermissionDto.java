
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
 * The basic permission object
 */
public class UserRolePermissionDto
{
    private @NotNull String description;
    private @NotNull Boolean value;
    private @NotNull Boolean canBeModified;

    /**
     * The description of the permission
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * The description of the permission
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
    /**
     * True if the permission is on
     *
     * @return The field value
     */
    public @NotNull Boolean getValue() { return this.value; }
    /**
     * True if the permission is on
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull Boolean value) { this.value = value; }
    /**
     * If true this permission can be turned on or off for this role.
     * Most roles can have all permissions modified, but some roles have all or some permissions fixed.
     *
     * @return The field canBeModified
     */
    public @NotNull Boolean getCanBeModified() { return this.canBeModified; }
    /**
     * If true this permission can be turned on or off for this role.
     * Most roles can have all permissions modified, but some roles have all or some permissions fixed.
     *
     * @param value The new value for canBeModified
     */
    public void setCanBeModified(@NotNull Boolean value) { this.canBeModified = value; }
};
