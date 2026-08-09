
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
 * A Meeting is a lightweight calendar event that may or may not belong to a project.
 * It is only visible to the person who created it and the users assigned to it.
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
    private @Nullable MoveTaskToProjectDto moveToProject;

    /**
     * The common name of this Meeting.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this Meeting.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * This field contains the Meeting's description.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * This field contains the Meeting's description.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Return the priority of a Meeting
     *
     * @return The field priorityId
     */
    public @Nullable Integer getPriorityId() { return this.priorityId; }
    /**
     * Return the priority of a Meeting
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable Integer value) { this.priorityId = value; }
    /**
     * The planned start date/time for this Meeting, in UTC.
     * Time must be on a 15-minute boundary (0, 15, 30, or 45 minutes).
     * Clients should convert to local time only when displaying to the user.
     *
     * @return The field plannedStartDate
     */
    public @Nullable String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The planned start date/time for this Meeting, in UTC.
     * Time must be on a 15-minute boundary (0, 15, 30, or 45 minutes).
     * Clients should convert to local time only when displaying to the user.
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
     * Indicates whether this Meeting participates in a recurring series.
     * true if the Meeting is part of a recurrence (series parent when is, or a child otherwise);
     * false if it is a standalone Meeting.
     * When saved as false during an update, the service layer detaches the Meeting
     * from its series, which clears parent/child relationships including
     * and recurringSettings.
     *
     * @return The field recurring
     */
    public @Nullable Boolean getRecurring() { return this.recurring; }
    /**
     * Indicates whether this Meeting participates in a recurring series.
     * true if the Meeting is part of a recurrence (series parent when is, or a child otherwise);
     * false if it is a standalone Meeting.
     * When saved as false during an update, the service layer detaches the Meeting
     * from its series, which clears parent/child relationships including
     * and recurringSettings.
     *
     * @param value The new value for recurring
     */
    public void setRecurring(@Nullable Boolean value) { this.recurring = value; }
    /**
     * Object contains data to move meeting to another project
     *
     * @return The field moveToProject
     */
    public @Nullable MoveTaskToProjectDto getMoveToProject() { return this.moveToProject; }
    /**
     * Object contains data to move meeting to another project
     *
     * @param value The new value for moveToProject
     */
    public void setMoveToProject(@Nullable MoveTaskToProjectDto value) { this.moveToProject = value; }
};
