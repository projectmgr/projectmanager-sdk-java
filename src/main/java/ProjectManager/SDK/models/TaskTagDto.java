
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
 * A TaskTag is a connection between a Task and a Tag.  Each Task can have zero, one or many
 * TaskTags associated with it.  TaskTags can be assigned and removed from the Task to help you
 * classify your Tasks and prioritize work.
 */
public class TaskTagDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String color;

    /**
     * The unique identifier of this TaskTag.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskTag.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The common name of this TaskTag.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this TaskTag.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The color that will be used to represent this Tag visually.  This color
     * is automatically chosen by the application when a user creates a Tag.
     *
     * You can choose specify any color that can be represented using HTML RGB
     * syntax such as `#0088FF`, in the format `RRGGBB`.  You may not use names
     * for colors.
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * The color that will be used to represent this Tag visually.  This color
     * is automatically chosen by the application when a user creates a Tag.
     *
     * You can choose specify any color that can be represented using HTML RGB
     * syntax such as `#0088FF`, in the format `RRGGBB`.  You may not use names
     * for colors.
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
};
