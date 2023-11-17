
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
 * A Project Field is a custom field defined within your Workspace for each Project. Each
 * Project Field has a data type as well as options in how it is handled.
 */
public class ProjectFieldsValueResponseDto
{
    private @NotNull String id;
    private @Nullable String value;
    private @Nullable String name;
    private @Nullable String type;

    /**
     * The unique identifier of this Project Field.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Project Field.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The value currently set for this Project Field.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value currently set for this Project Field.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
    /**
     * The name of this Project Field.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this Project Field.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The type of this Project Field.  Valid types are the following:
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
     * The type of this Project Field.  Valid types are the following:
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
