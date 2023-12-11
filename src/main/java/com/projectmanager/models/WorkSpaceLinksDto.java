
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A shortcut link within the currently logged in Workspace.
 */
public class WorkSpaceLinksDto
{
    private @Nullable String project;
    private @Nullable String workSpaceApi;

    /**
     * The name of the project for this link.
     *
     * @return The field project
     */
    public @Nullable String getProject() { return this.project; }
    /**
     * The name of the project for this link.
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable String value) { this.project = value; }
    /**
     * This is the link to the api for this business.  Some endpoints may need this value.
     *
     * @return The field workSpaceApi
     */
    public @Nullable String getWorkSpaceApi() { return this.workSpaceApi; }
    /**
     * This is the link to the api for this business.  Some endpoints may need this value.
     *
     * @param value The new value for workSpaceApi
     */
    public void setWorkSpaceApi(@Nullable String value) { this.workSpaceApi = value; }
};
