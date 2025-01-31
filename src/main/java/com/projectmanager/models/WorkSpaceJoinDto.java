
/**
 * ProjectManager API for Java
 *
 * (c) ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Workspace represents a single business subscription to the ProjectManager.com service.  You
 * can be a member of multiple Workspaces.  Each Workspace is completely separate from all other
 * Workspaces and a user cannot log in to multiple Workspaces at the same time.
 */
public class WorkSpaceJoinDto
{
    private @NotNull String businessUserId;

    /**
     * The unique identifier of the BusinessUser to invite to this Workspace.
     *
     * @return The field businessUserId
     */
    public @NotNull String getBusinessUserId() { return this.businessUserId; }
    /**
     * The unique identifier of the BusinessUser to invite to this Workspace.
     *
     * @param value The new value for businessUserId
     */
    public void setBusinessUserId(@NotNull String value) { this.businessUserId = value; }
};
