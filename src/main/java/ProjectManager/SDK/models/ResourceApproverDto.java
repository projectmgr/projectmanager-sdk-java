
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
 * When managing users, you can choose who will approve a person's Timesheets. This
 * is a ResourceApprover.  You can specify this person within the Resource object.
 */
public class ResourceApproverDto
{
    private @NotNull String id;
    private @Nullable String name;

    /**
     * The unique identifier of this ResourceApprover
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ResourceApprover
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ResourceApprover
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this ResourceApprover
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
