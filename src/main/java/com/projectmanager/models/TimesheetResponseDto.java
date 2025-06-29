
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
 * Time entry representation
 */
public class TimesheetResponseDto
{
    private @NotNull String id;
    private @Nullable String taskId;
    private @Nullable String projectId;
    private @Nullable String resourceId;
    private @Nullable String timesheetAdminTypeId;
    private @NotNull String date;
    private @Nullable String notes;
    private @NotNull Boolean approved;
    private @Nullable Double hours;
    private @Nullable Integer minutes;
    private @NotNull Boolean isCopied;
    private @Nullable String lastUpdatedDate;

    /**
     * TimesheetId
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * TimesheetId
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * associated task id
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * associated task id
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * associated project id
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * associated project id
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * resource id time entry entered
     *
     * @return The field resourceId
     */
    public @Nullable String getResourceId() { return this.resourceId; }
    /**
     * resource id time entry entered
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@Nullable String value) { this.resourceId = value; }
    /**
     * admin task id
     *
     * @return The field timesheetAdminTypeId
     */
    public @Nullable String getTimesheetAdminTypeId() { return this.timesheetAdminTypeId; }
    /**
     * admin task id
     *
     * @param value The new value for timesheetAdminTypeId
     */
    public void setTimesheetAdminTypeId(@Nullable String value) { this.timesheetAdminTypeId = value; }
    /**
     * Date of time entry
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * Date of time entry
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * Notes
     *
     * @return The field notes
     */
    public @Nullable String getNotes() { return this.notes; }
    /**
     * Notes
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable String value) { this.notes = value; }
    /**
     * Shows if timesheet approved
     *
     * @return The field approved
     */
    public @NotNull Boolean getApproved() { return this.approved; }
    /**
     * Shows if timesheet approved
     *
     * @param value The new value for approved
     */
    public void setApproved(@NotNull Boolean value) { this.approved = value; }
    /**
     * Total Hours
     *
     * @return The field hours
     */
    public @Nullable Double getHours() { return this.hours; }
    /**
     * Total Hours
     *
     * @param value The new value for hours
     */
    public void setHours(@Nullable Double value) { this.hours = value; }
    /**
     * Total Minutes
     *
     * @return The field minutes
     */
    public @Nullable Integer getMinutes() { return this.minutes; }
    /**
     * Total Minutes
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@Nullable Integer value) { this.minutes = value; }
    /**
     * Is the timesheet entry copied from another week?
     *
     * @return The field isCopied
     */
    public @NotNull Boolean getIsCopied() { return this.isCopied; }
    /**
     * Is the timesheet entry copied from another week?
     *
     * @param value The new value for isCopied
     */
    public void setIsCopied(@NotNull Boolean value) { this.isCopied = value; }
    /**
     * Is the last timesheet modified by the user
     *
     * @return The field lastUpdatedDate
     */
    public @Nullable String getLastUpdatedDate() { return this.lastUpdatedDate; }
    /**
     * Is the last timesheet modified by the user
     *
     * @param value The new value for lastUpdatedDate
     */
    public void setLastUpdatedDate(@Nullable String value) { this.lastUpdatedDate = value; }
};
