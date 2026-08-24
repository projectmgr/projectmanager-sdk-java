
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
    private @NotNull Boolean breakRecurrency;
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
     * Set this to true to break this Meeting out of its recurring series as part of this update.
     *
     * The Meeting is detached from its series, clearing its parent/child relationship and its
     * recurrence settings.  Any other changes in the same update are then applied to this
     * Meeting alone rather than being propagated across the rest of the series.
     *
     * This has no effect if the Meeting is not part of a recurring series.  A Meeting can only
     * be made recurring through the MeetingRecurrency endpoints.
     *
     * @return The field breakRecurrency
     */
    public @NotNull Boolean getBreakRecurrency() { return this.breakRecurrency; }
    /**
     * Set this to true to break this Meeting out of its recurring series as part of this update.
     *
     * The Meeting is detached from its series, clearing its parent/child relationship and its
     * recurrence settings.  Any other changes in the same update are then applied to this
     * Meeting alone rather than being propagated across the rest of the series.
     *
     * This has no effect if the Meeting is not part of a recurring series.  A Meeting can only
     * be made recurring through the MeetingRecurrency endpoints.
     *
     * @param value The new value for breakRecurrency
     */
    public void setBreakRecurrency(@NotNull Boolean value) { this.breakRecurrency = value; }
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
