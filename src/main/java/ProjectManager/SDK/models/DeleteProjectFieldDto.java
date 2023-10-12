
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
public class DeleteProjectFieldDto
{
    private @Nullable String id;
    private @Nullable String name;

    /**
     * The unique identifier of the ProjectField being deleted
     *
     * @return The field id
     */
    public @Nullable String getId() { return this.id; }
    /**
     * The unique identifier of the ProjectField being deleted
     *
     * @param value The new value for id
     */
    public void setId(@Nullable String value) { this.id = value; }
    /**
     * The name of the ProjectField being deleted
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the ProjectField being deleted
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
