
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
 * User assigned to task or risk
 */
public class AssignmentDto
{
    private @NotNull String taskId;
    private @Nullable String projectId;
    private @NotNull String resourceId;

    /**
     * Task or risk the user is assigned to
     *
     * @return The field taskId
     */
    public @NotNull String getTaskId() { return this.taskId; }
    /**
     * Task or risk the user is assigned to
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@NotNull String value) { this.taskId = value; }
    /**
     * The task or risk project Id
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * The task or risk project Id
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * Resource identifier
     *
     * @return The field resourceId
     */
    public @NotNull String getResourceId() { return this.resourceId; }
    /**
     * Resource identifier
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@NotNull String value) { this.resourceId = value; }
};
