
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
 * A ProjectStatus is a named condition used by your business to categorize the completion level
 * of Tasks and Projects within your Workspace.  You can name your ProjectStatus levels anything
 * you like and you can reorganize the order of the ProjectPriority levels at any time.
 */
public class ProjectStatusDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @NotNull Boolean isDeleted;

    /**
     * The unique identifier of this ProjectStatus.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectStatus.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ProjectStatus.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this ProjectStatus.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Is this a deleted status
     *
     * @return The field isDeleted
     */
    public @NotNull Boolean getIsDeleted() { return this.isDeleted; }
    /**
     * Is this a deleted status
     *
     * @param value The new value for isDeleted
     */
    public void setIsDeleted(@NotNull Boolean value) { this.isDeleted = value; }
};
