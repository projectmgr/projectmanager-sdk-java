
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
 * Represents a task that links or depends on another task
 */
public class TaskReferenceDto
{
    private @NotNull String predecessorId;
    private @NotNull String successorId;

    /**
     * The unique identifier for the predecessor task.
     *
     * @return The field predecessorId
     */
    public @NotNull String getPredecessorId() { return this.predecessorId; }
    /**
     * The unique identifier for the predecessor task.
     *
     * @param value The new value for predecessorId
     */
    public void setPredecessorId(@NotNull String value) { this.predecessorId = value; }
    /**
     * The unique identifier for the successor task.
     *
     * @return The field successorId
     */
    public @NotNull String getSuccessorId() { return this.successorId; }
    /**
     * The unique identifier for the successor task.
     *
     * @param value The new value for successorId
     */
    public void setSuccessorId(@NotNull String value) { this.successorId = value; }
};
