
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
 * A Meeting is a task that does not belong to the project or is part of a project. It is only visible to the person who created it, and the users assigned to it.
 *
 * Meeting's are a lightweight version of a project task.
 */
public class MeetingUpdateDto
{
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable Integer priorityId;
    private @Nullable String plannedStartDate;
    private @Nullable Integer durationMinutes;
    private @Nullable String[] assignees;
    private @Nullable Boolean recurring;

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
     * The duration (in 15-minute increments) for this Meeting.
     *
     * @return The field durationMinutes
     */
    public @Nullable Integer getDurationMinutes() { return this.durationMinutes; }
    /**
     * The duration (in 15-minute increments) for this Meeting.
     *
     * @param value The new value for durationMinutes
     */
    public void setDurationMinutes(@Nullable Integer value) { this.durationMinutes = value; }
    /**
     * If specified, replaces the list of resources assigned to this meeting.
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * If specified, replaces the list of resources assigned to this meeting.
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
    /**
     * Indicates whether this task participates in a recurring series.
     * true if the task is part of a recurrence (series parent when is, or a child otherwise);
     * false if it is a standalone task.
     * When saved as false during an update, the service layer detaches the task
     * from its series, which clears parent/child relationships including
     * and recurringSettings.
     *
     * @return The field recurring
     */
    public @Nullable Boolean getRecurring() { return this.recurring; }
    /**
     * Indicates whether this task participates in a recurring series.
     * true if the task is part of a recurrence (series parent when is, or a child otherwise);
     * false if it is a standalone task.
     * When saved as false during an update, the service layer detaches the task
     * from its series, which clears parent/child relationships including
     * and recurringSettings.
     *
     * @param value The new value for recurring
     */
    public void setRecurring(@Nullable Boolean value) { this.recurring = value; }
};
