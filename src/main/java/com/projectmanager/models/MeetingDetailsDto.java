
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
 * A Meeting is a task that either does not belong to a project or is part of a project. It is only visible to the person who created it, and the users assigned to it.
 *
 * Meetings are a lightweight version of a project task.
 */
public class MeetingDetailsDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable Integer plannedDuration;
    private @Nullable Integer plannedEffort;
    private @Nullable Integer priorityId;
    private @NotNull MeetingAssigneeDto[] assignees;
    private @Nullable String shortId;
    private @Nullable TaskTagDto[] tags;
    private @Nullable TaskTodoDto[] todos;
    private @NotNull String createDate;
    private @Nullable TaskOwnerDto owner;
    private @Nullable String ownerId;
    private @Nullable MeetingProjectDto project;
    private @Nullable DiscussionDataDto discussionData;
    private @Nullable FileDataDto fileData;
    private @Nullable Boolean recurring;
    private @Nullable String recurringParentTaskId;
    private @Nullable RecurringTaskSettingsDto recurringSettings;

    /**
     * The unique identifier of the Meeting
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Meeting
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
     * The list of resources assigned to this Meeting
     *
     * @return The field assignees
     */
    public @NotNull MeetingAssigneeDto[] getAssignees() { return this.assignees; }
    /**
     * The list of resources assigned to this Meeting
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@NotNull MeetingAssigneeDto[] value) { this.assignees = value; }
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
     * Timestamp when the Meeting was created
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Timestamp when the Meeting was created
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
     * The project this meeting belongs to
     *
     * @return The field project
     */
    public @Nullable MeetingProjectDto getProject() { return this.project; }
    /**
     * The project this meeting belongs to
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable MeetingProjectDto value) { this.project = value; }
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
     * Indicates whether this meeting is part of a recurring meeting series
     *
     * @return The field recurring
     */
    public @Nullable Boolean getRecurring() { return this.recurring; }
    /**
     * Indicates whether this meeting is part of a recurring meeting series
     *
     * @param value The new value for recurring
     */
    public void setRecurring(@Nullable Boolean value) { this.recurring = value; }
    /**
     * The parent task in the recurring meeting series
     *
     * @return The field recurringParentTaskId
     */
    public @Nullable String getRecurringParentTaskId() { return this.recurringParentTaskId; }
    /**
     * The parent task in the recurring meeting series
     *
     * @param value The new value for recurringParentTaskId
     */
    public void setRecurringParentTaskId(@Nullable String value) { this.recurringParentTaskId = value; }
    /**
     * The meeting's recurrency settings
     *
     * @return The field recurringSettings
     */
    public @Nullable RecurringTaskSettingsDto getRecurringSettings() { return this.recurringSettings; }
    /**
     * The meeting's recurrency settings
     *
     * @param value The new value for recurringSettings
     */
    public void setRecurringSettings(@Nullable RecurringTaskSettingsDto value) { this.recurringSettings = value; }
};
