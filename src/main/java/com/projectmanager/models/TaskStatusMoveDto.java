
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
 * A request to move a single Task into a TaskStatus.  The Task is placed at the specified
 * Position within the target TaskStatus, or at the end when no Position is given.  When the
 * Task is already in the target TaskStatus, only its position changes.
 */
public class TaskStatusMoveDto
{
    private @NotNull String taskId;
    private @Nullable Integer position;

    /**
     * The unique identifier of the Task to move.
     *
     * @return The field taskId
     */
    public @NotNull String getTaskId() { return this.taskId; }
    /**
     * The unique identifier of the Task to move.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@NotNull String value) { this.taskId = value; }
    /**
     * The zero-based position the Task should occupy within the target TaskStatus.  When not
     * specified, the Task is moved to the end of the TaskStatus.
     *
     * @return The field position
     */
    public @Nullable Integer getPosition() { return this.position; }
    /**
     * The zero-based position the Task should occupy within the target TaskStatus.  When not
     * specified, the Task is moved to the end of the TaskStatus.
     *
     * @param value The new value for position
     */
    public void setPosition(@Nullable Integer value) { this.position = value; }
};
