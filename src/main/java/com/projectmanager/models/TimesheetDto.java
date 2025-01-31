
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
 * A Timesheet entry is a single record that contains information about time spent by a person on a task.  Each
 * Timesheet entry object contains information about one task/day/person combination.  A fully completed Timesheet
 * will often contain multiple records for the same date range which must be combined to produce a finished
 * Timesheet.
 */
public class TimesheetDto
{
    private @NotNull String id;
    private @NotNull String resourceId;
    private @NotNull String taskId;
    private @NotNull String projectId;
    private @NotNull String date;
    private @Nullable String notes;
    private @NotNull Boolean approved;
    private @NotNull Double hours;
    private @NotNull Integer minutes;
    private @NotNull String modifiedDate;
    private @Nullable TimesheetTaskDto task;
    private @Nullable TimeSheetProjectDto project;
    private @Nullable TimesheetResourceDto resource;
    private @Nullable TimesheetAdminTypeDto adminType;
    private @Nullable TimesheetFileDto[] files;

    /**
     * A unique identifier of a timesheet data entry
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * A unique identifier of a timesheet data entry
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the resource who is preparing this Timesheet.  You can filter on this value to measure
     * the total work performed by this specific Resource.
     *
     * @return The field resourceId
     */
    public @NotNull String getResourceId() { return this.resourceId; }
    /**
     * The unique identifier of the resource who is preparing this Timesheet.  You can filter on this value to measure
     * the total work performed by this specific Resource.
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@NotNull String value) { this.resourceId = value; }
    /**
     * The unique identifier of the task worked on for this Timesheet.  You can filter on this value to measure the
     * total work performed against a specific Task.
     *
     * @return The field taskId
     */
    public @NotNull String getTaskId() { return this.taskId; }
    /**
     * The unique identifier of the task worked on for this Timesheet.  You can filter on this value to measure the
     * total work performed against a specific Task.
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@NotNull String value) { this.taskId = value; }
    /**
     * The unique identifier of the project worked on for this Timesheet.  You can filter on this value to measure the
     * total work performed against a specific Project.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the project worked on for this Timesheet.  You can filter on this value to measure the
     * total work performed against a specific Project.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * The date of this time entry record.  You can filter on this value to obtain Timesheet data for a specific date
     * range.
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * The date of this time entry record.  You can filter on this value to obtain Timesheet data for a specific date
     * range.
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * Notes associated with this Timesheet, if any
     *
     * @return The field notes
     */
    public @Nullable String getNotes() { return this.notes; }
    /**
     * Notes associated with this Timesheet, if any
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable String value) { this.notes = value; }
    /**
     * True if this Timesheet was approved by a person with the role of a Timesheet approver
     *
     * @return The field approved
     */
    public @NotNull Boolean getApproved() { return this.approved; }
    /**
     * True if this Timesheet was approved by a person with the role of a Timesheet approver
     *
     * @param value The new value for approved
     */
    public void setApproved(@NotNull Boolean value) { this.approved = value; }
    /**
     * Total Hours spent on this Task by this Resource on this specific Date
     *
     * @return The field hours
     */
    public @NotNull Double getHours() { return this.hours; }
    /**
     * Total Hours spent on this Task by this Resource on this specific Date
     *
     * @param value The new value for hours
     */
    public void setHours(@NotNull Double value) { this.hours = value; }
    /**
     * Total minutes spent on this Task by this Resource on this specific Date
     *
     * @return The field minutes
     */
    public @NotNull Integer getMinutes() { return this.minutes; }
    /**
     * Total minutes spent on this Task by this Resource on this specific Date
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@NotNull Integer value) { this.minutes = value; }
    /**
     * Date and time (in UTC) that this timesheet entry was last modified.
     *
     * @return The field modifiedDate
     */
    public @NotNull String getModifiedDate() { return this.modifiedDate; }
    /**
     * Date and time (in UTC) that this timesheet entry was last modified.
     *
     * @param value The new value for modifiedDate
     */
    public void setModifiedDate(@NotNull String value) { this.modifiedDate = value; }
    /**
     * The task associated with this timesheet entry
     *
     * @return The field task
     */
    public @Nullable TimesheetTaskDto getTask() { return this.task; }
    /**
     * The task associated with this timesheet entry
     *
     * @param value The new value for task
     */
    public void setTask(@Nullable TimesheetTaskDto value) { this.task = value; }
    /**
     * The project associated with this timesheet entry
     *
     * @return The field project
     */
    public @Nullable TimeSheetProjectDto getProject() { return this.project; }
    /**
     * The project associated with this timesheet entry
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable TimeSheetProjectDto value) { this.project = value; }
    /**
     * The resource associated with this timesheet entry
     *
     * @return The field resource
     */
    public @Nullable TimesheetResourceDto getResource() { return this.resource; }
    /**
     * The resource associated with this timesheet entry
     *
     * @param value The new value for resource
     */
    public void setResource(@Nullable TimesheetResourceDto value) { this.resource = value; }
    /**
     * The administration type associated with this timesheet entry
     *
     * @return The field adminType
     */
    public @Nullable TimesheetAdminTypeDto getAdminType() { return this.adminType; }
    /**
     * The administration type associated with this timesheet entry
     *
     * @param value The new value for adminType
     */
    public void setAdminType(@Nullable TimesheetAdminTypeDto value) { this.adminType = value; }
    /**
     * The list of files associated with this Timesheet, if any.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @return The field files
     */
    public @Nullable TimesheetFileDto[] getFiles() { return this.files; }
    /**
     * The list of files associated with this Timesheet, if any.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @param value The new value for files
     */
    public void setFiles(@Nullable TimesheetFileDto[] value) { this.files = value; }
};
