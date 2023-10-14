
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
 * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
 * define TaskFields for any integration purpose that is important to your business.  Each
 * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
 * for each Task inside this Project.
 */
public class TaskFieldsValueResponseDto
{
    private @NotNull String id;
    private @Nullable String value;
    private @Nullable String name;
    private @Nullable String type;

    /**
     * The unique identifier of this TaskField.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskField.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The value currently set for this TaskField for this Task.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value currently set for this TaskField for this Task.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
    /**
     * The name of this TaskField.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this TaskField.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The type of this TaskField.  Valid types are the following:
     * * Text
     * * Number
     * * Date
     * * Checkbox
     * * Currency
     * * Dropdown
     *
     * @return The field type
     */
    public @Nullable String getType() { return this.type; }
    /**
     * The type of this TaskField.  Valid types are the following:
     * * Text
     * * Number
     * * Date
     * * Checkbox
     * * Currency
     * * Dropdown
     *
     * @param value The new value for type
     */
    public void setType(@Nullable String value) { this.type = value; }
};
