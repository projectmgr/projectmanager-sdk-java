
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
 * Task-level planned work (TotalPlannedMinutes from task Work), per-resource assigned
 * breakdown (Assigned / TotalAssignedMinutes), workspace-wide reported actual total
 * (TotalActualMinutes), per-resource reported timesheet rows (Actual), scoped by permission,
 * and HasTimeEntries (whether any logged minutes exist for the task in the workspace, regardless of Actual visibility).
 */
public class TaskTimeSummaryDto
{
    private @NotNull Integer totalPlannedMinutes;
    private @NotNull Integer totalAssignedMinutes;
    private @NotNull Integer totalActualMinutes;
    private @NotNull Boolean hasTimeEntries;
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
     * Sum of reported minutes on this task from all resources in the workspace (same merge as internal totals:
     * direct task id, original task id, and weekly timesheet-task links). This is not limited to the caller's own entries.
     *
     * @return The field totalActualMinutes
     */
    public @NotNull Integer getTotalActualMinutes() { return this.totalActualMinutes; }
    /**
     * Sum of reported minutes on this task from all resources in the workspace (same merge as internal totals:
     * direct task id, original task id, and weekly timesheet-task links). This is not limited to the caller's own entries.
     *
     * @param value The new value for totalActualMinutes
     */
    public void setTotalActualMinutes(@NotNull Integer value) { this.totalActualMinutes = value; }
    /**
     * True when at least one timesheet row for this task has non-zero reported minutes in the workspace
     * (same merge as Astro.Api.Dto.Tasks.TaskTimeSummaryDto.TotalActualMinutes). False when there are none. Unlike Astro.Api.Dto.Tasks.TaskTimeSummaryDto.Actual,
     * this does not depend on whether the caller can see other resources' entries.
     *
     * @return The field hasTimeEntries
     */
    public @NotNull Boolean getHasTimeEntries() { return this.hasTimeEntries; }
    /**
     * True when at least one timesheet row for this task has non-zero reported minutes in the workspace
     * (same merge as Astro.Api.Dto.Tasks.TaskTimeSummaryDto.TotalActualMinutes). False when there are none. Unlike Astro.Api.Dto.Tasks.TaskTimeSummaryDto.Actual,
     * this does not depend on whether the caller can see other resources' entries.
     *
     * @param value The new value for hasTimeEntries
     */
    public void setHasTimeEntries(@NotNull Boolean value) { this.hasTimeEntries = value; }
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
     * Reported timesheet time by resource, including individual timesheet rows. Callers with edit-all-projects or
     * edit-team-timesheets workspace permission see every resource returned by secured timesheet queries; otherwise
     * only the caller's own timesheet rows (same idea as the Edit all timesheets / team timesheet capability in roles).
     *
     * @return The field actual
     */
    public @NotNull TaskActualResourceTimeDto[] getActual() { return this.actual; }
    /**
     * Reported timesheet time by resource, including individual timesheet rows. Callers with edit-all-projects or
     * edit-team-timesheets workspace permission see every resource returned by secured timesheet queries; otherwise
     * only the caller's own timesheet rows (same idea as the Edit all timesheets / team timesheet capability in roles).
     *
     * @param value The new value for actual
     */
    public void setActual(@NotNull TaskActualResourceTimeDto[] value) { this.actual = value; }
};
