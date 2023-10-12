
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
 * TODO - What is this?
 */
public class WorkSpaceLinksDto
{
    private @Nullable String project;
    private @Nullable String workSpaceApi;

    /**
     * TODO - What is this?
     *
     * @return The field project
     */
    public @Nullable String getProject() { return this.project; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable String value) { this.project = value; }
    /**
     * This is the link to the api for this business, some legacy endpoints may need this.
     *
     * @return The field workSpaceApi
     */
    public @Nullable String getWorkSpaceApi() { return this.workSpaceApi; }
    /**
     * This is the link to the api for this business, some legacy endpoints may need this.
     *
     * @param value The new value for workSpaceApi
     */
    public void setWorkSpaceApi(@Nullable String value) { this.workSpaceApi = value; }
};
