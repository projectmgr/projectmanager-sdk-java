
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Task is an individual element of work that must be performed to complete a Project.  A
 * Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to
 * indicate whether they have a dependency or a connection.
 */
public class TaskUpdateDto
{
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable Integer percentComplete;
    private @Nullable String statusId;
    private @Nullable Integer priorityId;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable Integer plannedDuration;
    private @Nullable Integer plannedEffort;
    private @Nullable Double plannedCost;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @Nullable Double actualCost;
    private @Nullable String theme;
    private @Nullable Boolean isLocked;
    private @Nullable Boolean isMilestone;

    /**
     * The common name of this Task.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this Task.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this Task.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * This value can be edited manually in the Gantt chart view of the application,
     * or can be selected on the Task Detail page within the Kanban board.
     *
     * @return The field percentComplete
     */
    public @Nullable Integer getPercentComplete() { return this.percentComplete; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this Task.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * This value can be edited manually in the Gantt chart view of the application,
     * or can be selected on the Task Detail page within the Kanban board.
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@Nullable Integer value) { this.percentComplete = value; }
    /**
     * The TaskStatus assigned to this Task.
     *
     * @return The field statusId
     */
    public @Nullable String getStatusId() { return this.statusId; }
    /**
     * The TaskStatus assigned to this Task.
     *
     * @param value The new value for statusId
     */
    public void setStatusId(@Nullable String value) { this.statusId = value; }
    /**
     * The unique identifier of the TaskPriority
     *
     * @return The field priorityId
     */
    public @Nullable Integer getPriorityId() { return this.priorityId; }
    /**
     * The unique identifier of the TaskPriority
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable Integer value) { this.priorityId = value; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @return The field plannedStartDate
     */
    public @Nullable String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@Nullable String value) { this.plannedStartDate = value; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @return The field plannedFinishDate
     */
    public @Nullable String getPlannedFinishDate() { return this.plannedFinishDate; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @param value The new value for plannedFinishDate
     */
    public void setPlannedFinishDate(@Nullable String value) { this.plannedFinishDate = value; }
    /**
     * The planned duration (in minutes) for this Task.  Cannot be negative.
     *
     * @return The field plannedDuration
     */
    public @Nullable Integer getPlannedDuration() { return this.plannedDuration; }
    /**
     * The planned duration (in minutes) for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedDuration
     */
    public void setPlannedDuration(@Nullable Integer value) { this.plannedDuration = value; }
    /**
     * The planned effort (in minutes) for this Task.  Cannot be negative.
     *
     * @return The field plannedEffort
     */
    public @Nullable Integer getPlannedEffort() { return this.plannedEffort; }
    /**
     * The planned effort (in minutes) for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedEffort
     */
    public void setPlannedEffort(@Nullable Integer value) { this.plannedEffort = value; }
    /**
     * The planned cost for this Task.  Cannot be negative.
     *
     * @return The field plannedCost
     */
    public @Nullable Double getPlannedCost() { return this.plannedCost; }
    /**
     * The planned cost for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedCost
     */
    public void setPlannedCost(@Nullable Double value) { this.plannedCost = value; }
    /**
     * If set, this is the actual date when work began on the Task.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @return The field actualStartDate
     */
    public @Nullable String getActualStartDate() { return this.actualStartDate; }
    /**
     * If set, this is the actual date when work began on the Task.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @param value The new value for actualStartDate
     */
    public void setActualStartDate(@Nullable String value) { this.actualStartDate = value; }
    /**
     * If set, this is the actual date when work was completed on the Task.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @return The field actualFinishDate
     */
    public @Nullable String getActualFinishDate() { return this.actualFinishDate; }
    /**
     * If set, this is the actual date when work was completed on the Task.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * For example: A Task has a planned completion date of July 5, 2023 in a Workspace
     * that has a time zone of US Pacific Time (GMT-7 or GMT-8, depending on daylight
     * savings time).  This project is considered overdue on 12:01 AM July 6th 2023 in
     * US Pacific time.
     *
     * @param value The new value for actualFinishDate
     */
    public void setActualFinishDate(@Nullable String value) { this.actualFinishDate = value; }
    /**
     * If set, this represents the actual tracked cost for this Task.
     *
     * @return The field actualCost
     */
    public @Nullable Double getActualCost() { return this.actualCost; }
    /**
     * If set, this represents the actual tracked cost for this Task.
     *
     * @param value The new value for actualCost
     */
    public void setActualCost(@Nullable Double value) { this.actualCost = value; }
    /**
     * Color theme definition for this task.
     *
     * eg. Blue, Brown, DarkBlue, DarkGrey, Gold, Green, Grey, LightBrown, LightGreen,
     * LightGrey, LightPurple, LightYellow, Magenta, Mauve, Navy, Orange, Purple, Red.
     *
     * @return The field theme
     */
    public @Nullable String getTheme() { return this.theme; }
    /**
     * Color theme definition for this task.
     *
     * eg. Blue, Brown, DarkBlue, DarkGrey, Gold, Green, Grey, LightBrown, LightGreen,
     * LightGrey, LightPurple, LightYellow, Magenta, Mauve, Navy, Orange, Purple, Red.
     *
     * @param value The new value for theme
     */
    public void setTheme(@Nullable String value) { this.theme = value; }
    /**
     * Unlocked tasks can be adjusted by changes to their dependencies, resource leveling, or other factors.
     *
     * All tasks are unlocked by default.
     *
     * If a task is set to `IsLocked` = `true`, the dates and assigned resources are locked for this task and will not
     * be automatically changed by any process.
     *
     * @return The field isLocked
     */
    public @Nullable Boolean getIsLocked() { return this.isLocked; }
    /**
     * Unlocked tasks can be adjusted by changes to their dependencies, resource leveling, or other factors.
     *
     * All tasks are unlocked by default.
     *
     * If a task is set to `IsLocked` = `true`, the dates and assigned resources are locked for this task and will not
     * be automatically changed by any process.
     *
     * @param value The new value for isLocked
     */
    public void setIsLocked(@Nullable Boolean value) { this.isLocked = value; }
    /**
     * True if this task is a milestone.  Milestones represent a specific point in time for the project.  When a
     * milestone is locked, it represents a fixed time within the project that can be used to relate to other tasks.
     *
     * @return The field isMilestone
     */
    public @Nullable Boolean getIsMilestone() { return this.isMilestone; }
    /**
     * True if this task is a milestone.  Milestones represent a specific point in time for the project.  When a
     * milestone is locked, it represents a fixed time within the project that can be used to relate to other tasks.
     *
     * @param value The new value for isMilestone
     */
    public void setIsMilestone(@Nullable Boolean value) { this.isMilestone = value; }
};
