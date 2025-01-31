
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
 * A TaskStatus is a named status level used by your business to determine how to measure the
 * progress of Tasks.  You can define your own named status levels that are appropriate for
 * your business and determine which status levels are considered done.
 */
public class TaskStatusDto
{
    private @NotNull String id;
    private @NotNull String projectId;
    private @Nullable String name;
    private @NotNull Integer order;
    private @NotNull Boolean isDone;

    /**
     * The unique identifier of this TaskStatus.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskStatus.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the Project to which this TaskStatus belongs.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the Project to which this TaskStatus belongs.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * The name of this TaskStatus.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this TaskStatus.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A numerical value that can be used to sort TaskStatus values according to the
     * needs of your business.
     *
     * @return The field order
     */
    public @NotNull Integer getOrder() { return this.order; }
    /**
     * A numerical value that can be used to sort TaskStatus values according to the
     * needs of your business.
     *
     * @param value The new value for order
     */
    public void setOrder(@NotNull Integer value) { this.order = value; }
    /**
     * True if a Task in this TaskStatus is considered done.
     *
     * @return The field isDone
     */
    public @NotNull Boolean getIsDone() { return this.isDone; }
    /**
     * True if a Task in this TaskStatus is considered done.
     *
     * @param value The new value for isDone
     */
    public void setIsDone(@NotNull Boolean value) { this.isDone = value; }
};
