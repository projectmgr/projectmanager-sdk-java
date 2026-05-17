
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
 * Planned time for one resource assigned to the task.
 */
public class TaskPlannedResourceTimeDto
{
    private @NotNull String id;
    private @NotNull Integer totalMinutes;
    private @NotNull TaskPlannedAllocationDto[] allocations;

    /**
     * Resource identifier for this planned row.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Resource identifier for this planned row.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Total planned minutes for this resource (sum of allocations when broken down by day).
     *
     * @return The field totalMinutes
     */
    public @NotNull Integer getTotalMinutes() { return this.totalMinutes; }
    /**
     * Total planned minutes for this resource (sum of allocations when broken down by day).
     *
     * @param value The new value for totalMinutes
     */
    public void setTotalMinutes(@NotNull Integer value) { this.totalMinutes = value; }
    /**
     * Planned minutes grouped by calendar date for this resource.
     *
     * @return The field allocations
     */
    public @NotNull TaskPlannedAllocationDto[] getAllocations() { return this.allocations; }
    /**
     * Planned minutes grouped by calendar date for this resource.
     *
     * @param value The new value for allocations
     */
    public void setAllocations(@NotNull TaskPlannedAllocationDto[] value) { this.allocations = value; }
};
