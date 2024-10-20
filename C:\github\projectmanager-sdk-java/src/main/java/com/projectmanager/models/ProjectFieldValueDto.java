
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
 * A model that contains the value for a ProjectField.
 */
public class ProjectFieldValueDto
{
    private @NotNull String id;
    private @Nullable String shortId;
    private @NotNull String name;
    private @NotNull String type;
    private @NotNull String value;
    private @NotNull String createdDate;
    private @NotNull String modifiedDate;

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
     * The unique Short Id of this Project Field.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * The unique Short Id of this Project Field.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The name of this Project Field.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this Project Field.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
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
    public @NotNull String getType() { return this.type; }
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
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * The value currently set for this Project Field Value.
     *
     * @return The field value
     */
    public @NotNull String getValue() { return this.value; }
    /**
     * The value currently set for this Project Field Value.
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull String value) { this.value = value; }
    /**
     * Date and time (in UTC) that this TaskField was created.
     *
     * @return The field createdDate
     */
    public @NotNull String getCreatedDate() { return this.createdDate; }
    /**
     * Date and time (in UTC) that this TaskField was created.
     *
     * @param value The new value for createdDate
     */
    public void setCreatedDate(@NotNull String value) { this.createdDate = value; }
    /**
     * Date and time (in UTC) that this TaskField was last modified.
     *
     * @return The field modifiedDate
     */
    public @NotNull String getModifiedDate() { return this.modifiedDate; }
    /**
     * Date and time (in UTC) that this TaskField was last modified.
     *
     * @param value The new value for modifiedDate
     */
    public void setModifiedDate(@NotNull String value) { this.modifiedDate = value; }
};
