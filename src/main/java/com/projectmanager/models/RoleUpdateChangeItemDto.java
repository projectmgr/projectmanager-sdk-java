
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
 * One property change when updating a business role (batch change-set item).
 */
public class RoleUpdateChangeItemDto
{
    private @NotNull String property;
    private @Nullable Object value;
    private @Nullable String id;

    /**
     * Field to change: name, description, or permissions.
     *
     * @return The field property
     */
    public @NotNull String getProperty() { return this.property; }
    /**
     * Field to change: name, description, or permissions.
     *
     * @param value The new value for property
     */
    public void setProperty(@NotNull String value) { this.property = value; }
    /**
     * New value for the field; for permissions, a JSON object in the role permissions matrix shape.
     *
     * @return The field value
     */
    public @Nullable Object getValue() { return this.value; }
    /**
     * New value for the field; for permissions, a JSON object in the role permissions matrix shape.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable Object value) { this.value = value; }
    /**
     * Optional identifier when the change targets a nested or keyed item.
     *
     * @return The field id
     */
    public @Nullable String getId() { return this.id; }
    /**
     * Optional identifier when the change targets a nested or keyed item.
     *
     * @param value The new value for id
     */
    public void setId(@Nullable String value) { this.id = value; }
};
