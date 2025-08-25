
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
 * ProjectAccessDto
 */
public class ProjectAccessDto
{
    private @NotNull String userId;
    private @NotNull String projectId;
    private @Nullable String role;
    private @NotNull Boolean hasJoined;

    /**
     * The unique identifier of the user of this ProjectMember.
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The unique identifier of the user of this ProjectMember.
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
    /**
     * The unique identifier of the user of this Project.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the user of this Project.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * The role of the user in the project
     *
     * @return The field role
     */
    public @Nullable String getRole() { return this.role; }
    /**
     * The role of the user in the project
     *
     * @param value The new value for role
     */
    public void setRole(@Nullable String value) { this.role = value; }
    /**
     * If set to true, the user has joined the project.
     * If set to false, the user may still have access due to the access all projects permission.
     * In the UI only projects that the user has joined will be shown in the navigation on the left
     *
     * @return The field hasJoined
     */
    public @NotNull Boolean getHasJoined() { return this.hasJoined; }
    /**
     * If set to true, the user has joined the project.
     * If set to false, the user may still have access due to the access all projects permission.
     * In the UI only projects that the user has joined will be shown in the navigation on the left
     *
     * @param value The new value for hasJoined
     */
    public void setHasJoined(@NotNull Boolean value) { this.hasJoined = value; }
};
