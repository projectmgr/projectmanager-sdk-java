
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Payload to create time entry
 */
public class TimesheetCreateRequestDto
{
    private @NotNull String date;
    private @NotNull Double hours;
    private @NotNull Integer minutes;
    private @Nullable String taskId;
    private @Nullable String adminTypeId;
    private @Nullable String resourceId;
    private @Nullable String notes;

    /**
     * Time entry date
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * Time entry date
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * Reported hours. If minutes is specified this property is ignored
     *
     * @return The field hours
     */
    public @NotNull Double getHours() { return this.hours; }
    /**
     * Reported hours. If minutes is specified this property is ignored
     *
     * @param value The new value for hours
     */
    public void setHours(@NotNull Double value) { this.hours = value; }
    /**
     * Specify the time in minutes. This overrides the Hours property.
     *
     * @return The field minutes
     */
    public @NotNull Integer getMinutes() { return this.minutes; }
    /**
     * Specify the time in minutes. This overrides the Hours property.
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@NotNull Integer value) { this.minutes = value; }
    /**
     * Task id that time reported to
     *
     * @return The field taskId
     */
    public @Nullable String getTaskId() { return this.taskId; }
    /**
     * Task id that time reported to
     *
     * @param value The new value for taskId
     */
    public void setTaskId(@Nullable String value) { this.taskId = value; }
    /**
     * Admin task id that time reported to
     *
     * @return The field adminTypeId
     */
    public @Nullable String getAdminTypeId() { return this.adminTypeId; }
    /**
     * Admin task id that time reported to
     *
     * @param value The new value for adminTypeId
     */
    public void setAdminTypeId(@Nullable String value) { this.adminTypeId = value; }
    /**
     * Resource id that time reported to
     *
     * @return The field resourceId
     */
    public @Nullable String getResourceId() { return this.resourceId; }
    /**
     * Resource id that time reported to
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@Nullable String value) { this.resourceId = value; }
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
};
