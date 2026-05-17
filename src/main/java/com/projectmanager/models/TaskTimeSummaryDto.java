
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
 * Task-level planned work (Astro.Api.Dto.Tasks.TaskTimeSummaryDto.TotalPlannedMinutes from task Work), per-resource assigned
 * breakdown (Astro.Api.Dto.Tasks.TaskTimeSummaryDto.Assigned / Astro.Api.Dto.Tasks.TaskTimeSummaryDto.TotalAssignedMinutes), and reported timesheet time (Astro.Api.Dto.Tasks.TaskTimeSummaryDto.Actual).
 */
public class TaskTimeSummaryDto
{
    private @NotNull Integer totalPlannedMinutes;
    private @NotNull Integer totalAssignedMinutes;
    private @NotNull Integer totalActualMinutes;
    private @NotNull TaskPlannedResourceTimeDto[] assigned;
    private @NotNull TaskActualResourceTimeDto[] actual;

    /**
     * The task's planned work (Work), in minutes — same as the Gantt "Work" / planned effort on the task.
     *
     * @return The field totalPlannedMinutes
     */
    public @NotNull Integer getTotalPlannedMinutes() { return this.totalPlannedMinutes; }
    /**
     * The task's planned work (Work), in minutes — same as the Gantt "Work" / planned effort on the task.
     *
     * @param value The new value for totalPlannedMinutes
     */
    public void setTotalPlannedMinutes(@NotNull Integer value) { this.totalPlannedMinutes = value; }
    /**
     * Sum of minutes assigned (per-resource assigned/planned effort from allocations or assignment split).
     *
     * @return The field totalAssignedMinutes
     */
    public @NotNull Integer getTotalAssignedMinutes() { return this.totalAssignedMinutes; }
    /**
     * Sum of minutes assigned (per-resource assigned/planned effort from allocations or assignment split).
     *
     * @param value The new value for totalAssignedMinutes
     */
    public void setTotalAssignedMinutes(@NotNull Integer value) { this.totalAssignedMinutes = value; }
    /**
     * Sum of reported minutes across all resources in actual.
     *
     * @return The field totalActualMinutes
     */
    public @NotNull Integer getTotalActualMinutes() { return this.totalActualMinutes; }
    /**
     * Sum of reported minutes across all resources in actual.
     *
     * @param value The new value for totalActualMinutes
     */
    public void setTotalActualMinutes(@NotNull Integer value) { this.totalActualMinutes = value; }
    /**
     * Planned effort by resource, including per-day allocation breakdown where available.
     *
     * @return The field assigned
     */
    public @NotNull TaskPlannedResourceTimeDto[] getAssigned() { return this.assigned; }
    /**
     * Planned effort by resource, including per-day allocation breakdown where available.
     *
     * @param value The new value for assigned
     */
    public void setAssigned(@NotNull TaskPlannedResourceTimeDto[] value) { this.assigned = value; }
    /**
     * Reported timesheet time by resource, including individual timesheet rows.
     *
     * @return The field actual
     */
    public @NotNull TaskActualResourceTimeDto[] getActual() { return this.actual; }
    /**
     * Reported timesheet time by resource, including individual timesheet rows.
     *
     * @param value The new value for actual
     */
    public void setActual(@NotNull TaskActualResourceTimeDto[] value) { this.actual = value; }
};
