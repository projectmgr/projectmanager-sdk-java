
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created Time entry response data
 */
public class TimesheetDto
{
    private @NotNull String id;
    private @NotNull String date;
    private @Nullable String notes;
    private @NotNull Boolean approved;
    private @NotNull Double hours;
    private @Nullable TimesheetTaskDto task;
    private @Nullable TimeSheetProjectDto project;
    private @Nullable TimesheetResourceDto resource;

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
    public @NotNull Double getHours() { return this.hours; }
    /**
     * Total Hours
     *
     * @param value The new value for hours
     */
    public void setHours(@NotNull Double value) { this.hours = value; }
    /**
     * associated tasks with time sheet
     *
     * @return The field task
     */
    public @Nullable TimesheetTaskDto getTask() { return this.task; }
    /**
     * associated tasks with time sheet
     *
     * @param value The new value for task
     */
    public void setTask(@Nullable TimesheetTaskDto value) { this.task = value; }
    /**
     * associated projects with timesheet
     *
     * @return The field project
     */
    public @Nullable TimeSheetProjectDto getProject() { return this.project; }
    /**
     * associated projects with timesheet
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
};
