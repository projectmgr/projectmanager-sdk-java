
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
 * Represents either a ProjectField or a TaskField, depending on the value of the
 * `EntityType` for this object.
 *
 * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
 * for any integration purpose that is important to your business.  Each ProjectField has a data
 * type as well as options in how it is handled.  ProjectFields can be edited for each Project
 * within your Workspace.
 *
 * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
 * define TaskFields for any integration purpose that is important to your business.  Each
 * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
 * for each Task inside this Project.
 */
public class ProjectFieldDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String type;
    private @NotNull String entityType;
    private @Nullable String[] options;
    private @Nullable String shortId;

    /**
     * The unique identifier of this Field
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Field
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this Field
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this Field
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The type of the Field.  Valid types are the following:
     * * Text
     * * Number
     * * Date
     * * Currency
     * * Dropdown
     *
     * Attempting to create a field with any Type other than these will
     * return an error.
     *
     * For Dropdown Field, specify the list of choices in the `Options`
     * field.
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * The type of the Field.  Valid types are the following:
     * * Text
     * * Number
     * * Date
     * * Currency
     * * Dropdown
     *
     * Attempting to create a field with any Type other than these will
     * return an error.
     *
     * For Dropdown Field, specify the list of choices in the `Options`
     * field.
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * The entity type of the Field, either `projects` or `tasks`.
     *
     * @return The field entityType
     */
    public @NotNull String getEntityType() { return this.entityType; }
    /**
     * The entity type of the Field, either `projects` or `tasks`.
     *
     * @param value The new value for entityType
     */
    public void setEntityType(@NotNull String value) { this.entityType = value; }
    /**
     * A list of options for use of this Field.  This is only valid if
     * the `Type` value is set to `Dropdown`.
     *
     * When a custom Field of type `DropDown` is shown to a user in the
     * application, they will be able to choose one of the `Options` in this
     * list.
     *
     * @return The field options
     */
    public @Nullable String[] getOptions() { return this.options; }
    /**
     * A list of options for use of this Field.  This is only valid if
     * the `Type` value is set to `Dropdown`.
     *
     * When a custom Field of type `DropDown` is shown to a user in the
     * application, they will be able to choose one of the `Options` in this
     * list.
     *
     * @param value The new value for options
     */
    public void setOptions(@Nullable String[] value) { this.options = value; }
    /**
     * The short Id of this field - human readable identity
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * The short Id of this field - human readable identity
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
};
