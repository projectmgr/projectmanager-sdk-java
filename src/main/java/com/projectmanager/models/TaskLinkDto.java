
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
 * Represents an existing link (dependency) from a Task to another Task.
 */
public class TaskLinkDto
{
    private @NotNull String successorTaskId;
    private @NotNull String linkType;
    private @Nullable Integer lag;

    /**
     * Primary constructor
     */
    public TaskLinkDto() {
    }

    /**
     * The unique identifier of the successor Task this link points to.
     *
     * @return The field successorTaskId
     */
    public @NotNull String getSuccessorTaskId() { return this.successorTaskId; }
    /**
     * The unique identifier of the successor Task this link points to.
     *
     * @param value The new value for successorTaskId
     */
    public void setSuccessorTaskId(@NotNull String value) { this.successorTaskId = value; }
    /**
     * The type of dependency between the two Tasks.
     *
     * One of: finishToStart, startToStart, finishToFinish, startToFinish.
     *
     * @return The field linkType
     */
    public @NotNull String getLinkType() { return this.linkType; }
    /**
     * The type of dependency between the two Tasks.
     *
     * One of: finishToStart, startToStart, finishToFinish, startToFinish.
     *
     * @param value The new value for linkType
     */
    public void setLinkType(@NotNull String value) { this.linkType = value; }
    /**
     * The number of days of lag (or lead, if negative) between the two Tasks.
     *
     * @return The field lag
     */
    public @Nullable Integer getLag() { return this.lag; }
    /**
     * The number of days of lag (or lead, if negative) between the two Tasks.
     *
     * @param value The new value for lag
     */
    public void setLag(@Nullable Integer value) { this.lag = value; }
};
