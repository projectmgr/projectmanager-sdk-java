
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
 * A Task is an individual element of work that must be performed to complete a Project.  A
 * Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to
 * indicate whether they have a dependency or a connection.
 */
public class TimesheetTaskDto
{
    private @NotNull String id;
    private @NotNull String projectId;
    private @NotNull String shortId;
    private @NotNull String name;
    private @NotNull String description;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @NotNull String modifyDate;
    private @NotNull String createDate;
    private @NotNull Integer percentComplete;
    private @NotNull Boolean isSummary;
    private @Nullable Integer priorityId;
    private @Nullable String wbs;
    private @Nullable String color;
    private @Nullable Double actualCost;
    private @Nullable Double actualResourceCost;
    private @Nullable Integer actualEffort;
    private @Nullable Double plannedCost;
    private @Nullable Double plannedResourceCost;
    private @Nullable Integer plannedEffort;

    /**
     * The unique identifier of this Task.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Task.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the Project to which this Task belongs.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the Project to which this Task belongs.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @return The field shortId
     */
    public @NotNull String getShortId() { return this.shortId; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * The common name of this Task.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The common name of this Task.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
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
     * If set, this is the actual date when work was completed on this Task.
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
     * If set, this is the actual date when work was completed on this Task.
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
     * The timestamp in UTC when this Task was most recently modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when this Task was most recently modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The timestamp in UTC when this Task was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when this Task was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
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
    public @NotNull Integer getPercentComplete() { return this.percentComplete; }
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
    public void setPercentComplete(@NotNull Integer value) { this.percentComplete = value; }
    /**
     * True if this Task is the parent of multiple Tasks underneath it.  A parent Task
     * is a "rolled-up" view of multiple children that allows you to view a section of
     * work at a glance.
     *
     * You can create a summary Task in the Gantt chart view of the application by
     * adding child tasks underneath a parent Task.
     *
     * @return The field isSummary
     */
    public @NotNull Boolean getIsSummary() { return this.isSummary; }
    /**
     * True if this Task is the parent of multiple Tasks underneath it.  A parent Task
     * is a "rolled-up" view of multiple children that allows you to view a section of
     * work at a glance.
     *
     * You can create a summary Task in the Gantt chart view of the application by
     * adding child tasks underneath a parent Task.
     *
     * @param value The new value for isSummary
     */
    public void setIsSummary(@NotNull Boolean value) { this.isSummary = value; }
    /**
     * Return the priority of a task
     *
     * @return The field priorityId
     */
    public @Nullable Integer getPriorityId() { return this.priorityId; }
    /**
     * Return the priority of a task
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable Integer value) { this.priorityId = value; }
    /**
     * The WBS (Work Breakdown Structure) number for this task within the Gantt chart hierarchy.  See [What
     * Is a Work Breakdown Structure (WBS)?](https://www.projectmanager.com/guides/work-breakdown-structure)
     * on Project Manager for more information. The WBS number is an outline number in the form `#.#.#.#`
     * which indicates how tasks are organized and sorted.
     *
     * The WBS value is only available to users at certain edition levels.  This value can only be changed
     * if you are a Project Editor.
     *
     * @return The field wbs
     */
    public @Nullable String getWbs() { return this.wbs; }
    /**
     * The WBS (Work Breakdown Structure) number for this task within the Gantt chart hierarchy.  See [What
     * Is a Work Breakdown Structure (WBS)?](https://www.projectmanager.com/guides/work-breakdown-structure)
     * on Project Manager for more information. The WBS number is an outline number in the form `#.#.#.#`
     * which indicates how tasks are organized and sorted.
     *
     * The WBS value is only available to users at certain edition levels.  This value can only be changed
     * if you are a Project Editor.
     *
     * @param value The new value for wbs
     */
    public void setWbs(@Nullable String value) { this.wbs = value; }
    /**
     * Task Color as set in the Gantt
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * Task Color as set in the Gantt
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
    /**
     * The actual cost of this Task, if known.
     *
     * @return The field actualCost
     */
    public @Nullable Double getActualCost() { return this.actualCost; }
    /**
     * The actual cost of this Task, if known.
     *
     * @param value The new value for actualCost
     */
    public void setActualCost(@Nullable Double value) { this.actualCost = value; }
    /**
     * The actual resource cost of this Task
     *
     * @return The field actualResourceCost
     */
    public @Nullable Double getActualResourceCost() { return this.actualResourceCost; }
    /**
     * The actual resource cost of this Task
     *
     * @param value The new value for actualResourceCost
     */
    public void setActualResourceCost(@Nullable Double value) { this.actualResourceCost = value; }
    /**
     * The actual effort (in minutes) of this task, if known.
     *
     * @return The field actualEffort
     */
    public @Nullable Integer getActualEffort() { return this.actualEffort; }
    /**
     * The actual effort (in minutes) of this task, if known.
     *
     * @param value The new value for actualEffort
     */
    public void setActualEffort(@Nullable Integer value) { this.actualEffort = value; }
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
     * The planned resource cost of this Task
     *
     * @return The field plannedResourceCost
     */
    public @Nullable Double getPlannedResourceCost() { return this.plannedResourceCost; }
    /**
     * The planned resource cost of this Task
     *
     * @param value The new value for plannedResourceCost
     */
    public void setPlannedResourceCost(@Nullable Double value) { this.plannedResourceCost = value; }
    /**
     * The planned effort (in minutes) of this task, if known.
     *
     * @return The field plannedEffort
     */
    public @Nullable Integer getPlannedEffort() { return this.plannedEffort; }
    /**
     * The planned effort (in minutes) of this task, if known.
     *
     * @param value The new value for plannedEffort
     */
    public void setPlannedEffort(@Nullable Integer value) { this.plannedEffort = value; }
};
