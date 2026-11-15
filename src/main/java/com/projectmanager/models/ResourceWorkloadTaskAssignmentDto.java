
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

/**
 * Details about the TaskAssignment a workload allocation belongs to. Only populated when the request
 * specifies `include=taskAssignment`.
 */
public class ResourceWorkloadTaskAssignmentDto
{
    private @NotNull String id;
    private @NotNull Integer totalAssignedMinutes;

    /**
     * Primary constructor
     */
    public ResourceWorkloadTaskAssignmentDto() {
    }

    /**
     * The unique identifier of the TaskAssignment.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the TaskAssignment.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The total number of minutes assigned to this Resource across all of this TaskAssignment's allocations.
     *
     * @return The field totalAssignedMinutes
     */
    public @NotNull Integer getTotalAssignedMinutes() { return this.totalAssignedMinutes; }
    /**
     * The total number of minutes assigned to this Resource across all of this TaskAssignment's allocations.
     *
     * @param value The new value for totalAssignedMinutes
     */
    public void setTotalAssignedMinutes(@NotNull Integer value) { this.totalAssignedMinutes = value; }
};
