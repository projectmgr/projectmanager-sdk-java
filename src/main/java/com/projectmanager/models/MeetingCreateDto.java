
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
 * A Meeting is a task that does not belong to the project. It is only visible to the person who created it, and the users assigned to it.
 *
 * Meeting's are a lightweight version of a project task.
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
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     *  time needs to be in 15-minute increments, valid values are 0, 15, 30, 45
     *
     * @return The field startDate
     */
    public @NotNull String getStartDate() { return this.startDate; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     *  time needs to be in 15-minute increments, valid values are 0, 15, 30, 45
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
     * Specify a list of resources to assign to this NPT
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * Specify a list of resources to assign to this NPT
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
