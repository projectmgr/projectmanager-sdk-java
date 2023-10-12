
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
 * A Tag is a named categorization you can use to distinguish objects from each other.
 * Tags each have a unique identifier, a name, and a color.
 */
public class TagCreateDto
{
    private @NotNull String name;
    private @Nullable String color;

    /**
     * The name of this Tag.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this Tag.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
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
