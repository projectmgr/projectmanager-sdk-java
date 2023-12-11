
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
public class CreateTaskFieldDto
{
    private @Nullable String name;
    private @Nullable String type;
    private @Nullable String[] options;
    private @Nullable String shortId;

    /**
     * The name of the TaskField
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the TaskField
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
     * * DropdownSingle
     * * DropdownMulti
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
     * * DropdownSingle
     * * DropdownMulti
     *
     * @param value The new value for type
     */
    public void setType(@Nullable String value) { this.type = value; }
    /**
     * A list of options for use of this TaskField.  This is only valid if
     * the `Type` value is set to `Dropdown`.
     *
     * When a custom TaskField of type `DropDown` is shown to a user in the
     * application, they will be able to choose one of the `Options` in this
     * list.
     *
     * @return The field options
     */
    public @Nullable String[] getOptions() { return this.options; }
    /**
     * A list of options for use of this TaskField.  This is only valid if
     * the `Type` value is set to `Dropdown`.
     *
     * When a custom TaskField of type `DropDown` is shown to a user in the
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
