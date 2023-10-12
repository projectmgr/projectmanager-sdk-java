
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


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A TaskField is a custom field defined within your Workspace for a specific Project.  You can
 * define TaskFields for any integration purpose that is important to your business.  Each
 * TaskField has a data type as well as options in how it is handled.  TaskFields can be edited
 * for each Task inside this Project.
 */
public class GetTaskFieldsResponseDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String type;
    private @Nullable String[] options;

    /**
     * The unique identifier of this TaskField
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskField
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this TaskField
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this TaskField
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
     * Attempting to create a field with any Type other than these will
     * return an error.
     *
     * For Dropdown TaskFields, specify the list of choices in the `Options`
     * field.
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
     * Attempting to create a field with any Type other than these will
     * return an error.
     *
     * For Dropdown TaskFields, specify the list of choices in the `Options`
     * field.
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
};
