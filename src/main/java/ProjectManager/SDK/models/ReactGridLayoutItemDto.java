
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
 * React grid layout item object
 */
public class ReactGridLayoutItemDto
{
    private @NotNull Integer w;
    private @NotNull Integer h;
    private @NotNull Integer x;
    private @NotNull Integer y;
    private @Nullable String i;
    private @NotNull Boolean moved;
    private @NotNull Boolean static;

    /**
     * Width
     *
     * @return The field w
     */
    public @NotNull Integer getW() { return this.w; }
    /**
     * Width
     *
     * @param value The new value for w
     */
    public void setW(@NotNull Integer value) { this.w = value; }
    /**
     * Height
     *
     * @return The field h
     */
    public @NotNull Integer getH() { return this.h; }
    /**
     * Height
     *
     * @param value The new value for h
     */
    public void setH(@NotNull Integer value) { this.h = value; }
    /**
     * X position
     *
     * @return The field x
     */
    public @NotNull Integer getX() { return this.x; }
    /**
     * X position
     *
     * @param value The new value for x
     */
    public void setX(@NotNull Integer value) { this.x = value; }
    /**
     * Y position
     *
     * @return The field y
     */
    public @NotNull Integer getY() { return this.y; }
    /**
     * Y position
     *
     * @param value The new value for y
     */
    public void setY(@NotNull Integer value) { this.y = value; }
    /**
     * ID
     *
     * @return The field i
     */
    public @Nullable String getI() { return this.i; }
    /**
     * ID
     *
     * @param value The new value for i
     */
    public void setI(@Nullable String value) { this.i = value; }
    /**
     * Moved indicator
     *
     * @return The field moved
     */
    public @NotNull Boolean getMoved() { return this.moved; }
    /**
     * Moved indicator
     *
     * @param value The new value for moved
     */
    public void setMoved(@NotNull Boolean value) { this.moved = value; }
    /**
     * If true, equal to `isDraggable: false, isResizable: false`
     *
     * @return The field static
     */
    public @NotNull Boolean getStatic() { return this.static; }
    /**
     * If true, equal to `isDraggable: false, isResizable: false`
     *
     * @param value The new value for static
     */
    public void setStatic(@NotNull Boolean value) { this.static = value; }
};
