
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
 * The result of moving a single Task into a TaskStatus.  One result is returned per
 * requested Task move, in the same order as the request.
 */
public class TaskStatusMoveResultDto
{
    private @NotNull String taskId;
    private @NotNull Boolean success;
    private @Nullable String message;
    private @Nullable String changeSetId;

    /**
     * The unique identifier of the Task that was moved.
     *
     * @return The field taskId
     */
    public @NotNull String getTaskId() { return this.taskId; }
    /**
     * The unique identifier of the Task that was moved.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@NotNull String value) { this.taskId = value; }
    /**
     * Whether the move was accepted for this Task.
     *
     * @return The field success
     */
    public @NotNull Boolean getSuccess() { return this.success; }
    /**
     * Whether the move was accepted for this Task.
     *
     * @param value The new value for success
     */
    public void setSuccess(@NotNull Boolean value) { this.success = value; }
    /**
     * The reason the move was rejected, when Success is false.
     *
     * @return The field message
     */
    public @Nullable String getMessage() { return this.message; }
    /**
     * The reason the move was rejected, when Success is false.
     *
     * @param value The new value for message
     */
    public void setMessage(@Nullable String value) { this.message = value; }
    /**
     * When the Task belongs to a Project, the move is applied asynchronously as a Changeset
     * and this contains its unique identifier.  You can use RetrieveChangeset to check the
     * progress of the move.  This is null when the move was applied immediately.
     *
     * @return The field changeSetId
     */
    public @Nullable String getChangeSetId() { return this.changeSetId; }
    /**
     * When the Task belongs to a Project, the move is applied asynchronously as a Changeset
     * and this contains its unique identifier.  You can use RetrieveChangeset to check the
     * progress of the move.  This is null when the move was applied immediately.
     *
     * @param value The new value for changeSetId
     */
    public void setChangeSetId(@Nullable String value) { this.changeSetId = value; }
};
