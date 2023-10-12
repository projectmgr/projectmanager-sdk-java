
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
 * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
 * for any integration purpose that is important to your business.  Each ProjectField has a data
 * type as well as options in how it is handled.  ProjectFields can be edited for each Project
 * within your Workspace.
 */
public class CreateProjectFieldDto
{
    private @NotNull String name;
    private @NotNull String type;

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
     * TODO - This object needs to support a list of options, in case dropdown is selected
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
     * TODO - This object needs to support a list of options, in case dropdown is selected
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
};
