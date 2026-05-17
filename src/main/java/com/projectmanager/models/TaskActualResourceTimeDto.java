
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
 * Reported (timesheet) time for one resource on the task.
 */
public class TaskActualResourceTimeDto
{
    private @NotNull String id;
    private @NotNull Integer totalMinutes;
    private @NotNull TaskActualTimeEntryDto[] timeEntries;

    /**
     * Resource identifier for this actual row.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Resource identifier for this actual row.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Total reported minutes for this resource (sum of Astro.Api.Dto.Tasks.TaskActualResourceTimeDto.TimeEntries).
     *
     * @return The field totalMinutes
     */
    public @NotNull Integer getTotalMinutes() { return this.totalMinutes; }
    /**
     * Total reported minutes for this resource (sum of Astro.Api.Dto.Tasks.TaskActualResourceTimeDto.TimeEntries).
     *
     * @param value The new value for totalMinutes
     */
    public void setTotalMinutes(@NotNull Integer value) { this.totalMinutes = value; }
    /**
     * Individual timesheet entries contributing to totalMinutes.
     *
     * @return The field timeEntries
     */
    public @NotNull TaskActualTimeEntryDto[] getTimeEntries() { return this.timeEntries; }
    /**
     * Individual timesheet entries contributing to totalMinutes.
     *
     * @param value The new value for timeEntries
     */
    public void setTimeEntries(@NotNull TaskActualTimeEntryDto[] value) { this.timeEntries = value; }
};
