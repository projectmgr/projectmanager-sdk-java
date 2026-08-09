
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
public class MeetingCreateDto
{
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull String startDate;
    private @Nullable Integer durationMinutes;
    private @Nullable String[] assignees;
    private @Nullable Integer priority;
    private @Nullable String projectId;

    /**
     * The common name of this Meeting.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The common name of this Meeting.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
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
     * The planned start date/time for this Meeting, in UTC.
     * Time must be on a 15-minute boundary (0, 15, 30, or 45 minutes).
     * Clients should convert to local time only when displaying to the user.
     *
     * @return The field startDate
     */
    public @NotNull String getStartDate() { return this.startDate; }
    /**
     * The planned start date/time for this Meeting, in UTC.
     * Time must be on a 15-minute boundary (0, 15, 30, or 45 minutes).
     * Clients should convert to local time only when displaying to the user.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@NotNull String value) { this.startDate = value; }
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
     * Specify a list of resources to assign to this Meeting
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * Specify a list of resources to assign to this Meeting
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
    /**
     * The numeric of the Priority for this Meeting
     *
     * @return The field priority
     */
    public @Nullable Integer getPriority() { return this.priority; }
    /**
     * The numeric of the Priority for this Meeting
     *
     * @param value The new value for priority
     */
    public void setPriority(@Nullable Integer value) { this.priority = value; }
    /**
     * The unique identifier of the Project for this Meeting
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the Project for this Meeting
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
};
