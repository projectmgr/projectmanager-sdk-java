
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
 * Represents admin task to track time
 */
public class TimesheetAdminTypeDto
{
    private @NotNull String id;
    private @Nullable String name;

    /**
     * admin task id
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * admin task id
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * admin task name
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * admin task name
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
