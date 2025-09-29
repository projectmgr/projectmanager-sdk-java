
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
 * A Npt is a task that does not belong to the project. It is only visible to the person who created it, and the users assigned to it.
 *
 * NPT's are a lightweight version of a project task.
 */
public class NptDetailsDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @Nullable Integer actualEffort;
    private @Nullable Integer actualDuration;
    private @Nullable Double actualCost;
    private @Nullable Double plannedCost;
    private @Nullable Integer plannedDuration;
    private @Nullable Integer plannedEffort;
    private @Nullable Integer priorityId;
    private @NotNull Integer percentComplete;
    private @NotNull NptStatusDto status;
    private @NotNull NptAssigneeDto[] assignees;
    private @Nullable String shortId;
    private @Nullable TaskTagDto[] tags;
    private @Nullable TaskTodoDto[] todos;
    private @NotNull String createDate;
    private @Nullable TaskOwnerDto owner;
    private @Nullable String ownerId;
    private @Nullable DiscussionDataDto discussionData;
    private @Nullable FileDataDto fileData;
    private @Nullable Boolean recurring;
    private @Nullable String recurringParentTaskId;
    private @Nullable RecurringTaskSettingsDto recurringSettings;

    /**
     * The unique identifier of the NPT
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the NPT
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
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
     * This field contains the task's "Note" or "Description", which is a description of the work to be done to complete the task.
     *
     * Within the ProjectManager application, you can use this field as follows:
     * * When in the Board or List view, click on a task to open the task panel, then edit the "Description" field.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * This field contains the task's "Note" or "Description", which is a description of the work to be done to complete the task.
     *
     * Within the ProjectManager application, you can use this field as follows:
     * * When in the Board or List view, click on a task to open the task panel, then edit the "Description" field.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * This value contains only the date in year-month-day format. For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     *
     * @return The field plannedStartDate
     */
    public @Nullable String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * This value contains only the date in year-month-day format. For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@Nullable String value) { this.plannedStartDate = value; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * This value contains only the date in year-month-day format. For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     *
     * @return The field plannedFinishDate
     */
    public @Nullable String getPlannedFinishDate() { return this.plannedFinishDate; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * This value contains only the date in year-month-day format. For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
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
     * The actual effort (in minutes) for this Task.
     *
     * @return The field actualEffort
     */
    public @Nullable Integer getActualEffort() { return this.actualEffort; }
    /**
     * The actual effort (in minutes) for this Task.
     *
     * @param value The new value for actualEffort
     */
    public void setActualEffort(@Nullable Integer value) { this.actualEffort = value; }
    /**
     * The actual duration (in minutes) for this Task.
     *
     * @return The field actualDuration
     */
    public @Nullable Integer getActualDuration() { return this.actualDuration; }
    /**
     * The actual duration (in minutes) for this Task.
     *
     * @param value The new value for actualDuration
     */
    public void setActualDuration(@Nullable Integer value) { this.actualDuration = value; }
    /**
     * The actual cost of this Task to date, if known.
     *
     * @return The field actualCost
     */
    public @Nullable Double getActualCost() { return this.actualCost; }
    /**
     * The actual cost of this Task to date, if known.
     *
     * @param value The new value for actualCost
     */
    public void setActualCost(@Nullable Double value) { this.actualCost = value; }
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
     * The planned duration (in minutes) for this Task.
     *
     * @return The field plannedDuration
     */
    public @Nullable Integer getPlannedDuration() { return this.plannedDuration; }
    /**
     * The planned duration (in minutes) for this Task.
     *
     * @param value The new value for plannedDuration
     */
    public void setPlannedDuration(@Nullable Integer value) { this.plannedDuration = value; }
    /**
     * The planned effort (in minutes) for this Task.
     *
     * @return The field plannedEffort
     */
    public @Nullable Integer getPlannedEffort() { return this.plannedEffort; }
    /**
     * The planned effort (in minutes) for this Task.
     *
     * @param value The new value for plannedEffort
     */
    public void setPlannedEffort(@Nullable Integer value) { this.plannedEffort = value; }
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
     * The status assigned to this Npt
     *
     * @return The field status
     */
    public @NotNull NptStatusDto getStatus() { return this.status; }
    /**
     * The status assigned to this Npt
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull NptStatusDto value) { this.status = value; }
    /**
     * The list of resources assigned to this Npt
     *
     * @return The field assignees
     */
    public @NotNull NptAssigneeDto[] getAssignees() { return this.assignees; }
    /**
     * The list of resources assigned to this Npt
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@NotNull NptAssigneeDto[] value) { this.assignees = value; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @return The field tags
     */
    public @Nullable TaskTagDto[] getTags() { return this.tags; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @param value The new value for tags
     */
    public void setTags(@Nullable TaskTagDto[] value) { this.tags = value; }
    /**
     * A list of TaskTodo items, which are sub-tasks within this Task.
     *
     * @return The field todos
     */
    public @Nullable TaskTodoDto[] getTodos() { return this.todos; }
    /**
     * A list of TaskTodo items, which are sub-tasks within this Task.
     *
     * @param value The new value for todos
     */
    public void setTodos(@Nullable TaskTodoDto[] value) { this.todos = value; }
    /**
     * Timestamp when the NPT was created
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Timestamp when the NPT was created
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The owner of this Task.
     *
     * @return The field owner
     */
    public @Nullable TaskOwnerDto getOwner() { return this.owner; }
    /**
     * The owner of this Task.
     *
     * @param value The new value for owner
     */
    public void setOwner(@Nullable TaskOwnerDto value) { this.owner = value; }
    /**
     * The ownerId of this Task.
     *
     * @return The field ownerId
     */
    public @Nullable String getOwnerId() { return this.ownerId; }
    /**
     * The ownerId of this Task.
     *
     * @param value The new value for ownerId
     */
    public void setOwnerId(@Nullable String value) { this.ownerId = value; }
    /**
     * Task file data - number of comments, last read time
     *
     * @return The field discussionData
     */
    public @Nullable DiscussionDataDto getDiscussionData() { return this.discussionData; }
    /**
     * Task file data - number of comments, last read time
     *
     * @param value The new value for discussionData
     */
    public void setDiscussionData(@Nullable DiscussionDataDto value) { this.discussionData = value; }
    /**
     * Task file data - number of files, last read time
     *
     * @return The field fileData
     */
    public @Nullable FileDataDto getFileData() { return this.fileData; }
    /**
     * Task file data - number of files, last read time
     *
     * @param value The new value for fileData
     */
    public void setFileData(@Nullable FileDataDto value) { this.fileData = value; }
    /**
     * If this is a recurring Npt task
     *
     * @return The field recurring
     */
    public @Nullable Boolean getRecurring() { return this.recurring; }
    /**
     * If this is a recurring Npt task
     *
     * @param value The new value for recurring
     */
    public void setRecurring(@Nullable Boolean value) { this.recurring = value; }
    /**
     * The parent task in the recurring Npt task sequence
     *
     * @return The field recurringParentTaskId
     */
    public @Nullable String getRecurringParentTaskId() { return this.recurringParentTaskId; }
    /**
     * The parent task in the recurring Npt task sequence
     *
     * @param value The new value for recurringParentTaskId
     */
    public void setRecurringParentTaskId(@Nullable String value) { this.recurringParentTaskId = value; }
    /**
     * The  Npt Task Recurrency settings
     *
     * @return The field recurringSettings
     */
    public @Nullable RecurringTaskSettingsDto getRecurringSettings() { return this.recurringSettings; }
    /**
     * The  Npt Task Recurrency settings
     *
     * @param value The new value for recurringSettings
     */
    public void setRecurringSettings(@Nullable RecurringTaskSettingsDto value) { this.recurringSettings = value; }
};
