
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
 * Working hours per weekday (0 = non-working day).
 * On update, omit a property (or send null) to leave that day unchanged.
 */
public class WorkspaceWorkingDaysDto
{
    private @Nullable Double monday;
    private @Nullable Double tuesday;
    private @Nullable Double wednesday;
    private @Nullable Double thursday;
    private @Nullable Double friday;
    private @Nullable Double saturday;
    private @Nullable Double sunday;

    /**
     * Working hours on Monday.
     *
     * @return The field monday
     */
    public @Nullable Double getMonday() { return this.monday; }
    /**
     * Working hours on Monday.
     *
     * @param value The new value for monday
     */
    public void setMonday(@Nullable Double value) { this.monday = value; }
    /**
     * Working hours on Tuesday.
     *
     * @return The field tuesday
     */
    public @Nullable Double getTuesday() { return this.tuesday; }
    /**
     * Working hours on Tuesday.
     *
     * @param value The new value for tuesday
     */
    public void setTuesday(@Nullable Double value) { this.tuesday = value; }
    /**
     * Working hours on Wednesday.
     *
     * @return The field wednesday
     */
    public @Nullable Double getWednesday() { return this.wednesday; }
    /**
     * Working hours on Wednesday.
     *
     * @param value The new value for wednesday
     */
    public void setWednesday(@Nullable Double value) { this.wednesday = value; }
    /**
     * Working hours on Thursday.
     *
     * @return The field thursday
     */
    public @Nullable Double getThursday() { return this.thursday; }
    /**
     * Working hours on Thursday.
     *
     * @param value The new value for thursday
     */
    public void setThursday(@Nullable Double value) { this.thursday = value; }
    /**
     * Working hours on Friday.
     *
     * @return The field friday
     */
    public @Nullable Double getFriday() { return this.friday; }
    /**
     * Working hours on Friday.
     *
     * @param value The new value for friday
     */
    public void setFriday(@Nullable Double value) { this.friday = value; }
    /**
     * Working hours on Saturday.
     *
     * @return The field saturday
     */
    public @Nullable Double getSaturday() { return this.saturday; }
    /**
     * Working hours on Saturday.
     *
     * @param value The new value for saturday
     */
    public void setSaturday(@Nullable Double value) { this.saturday = value; }
    /**
     * Working hours on Sunday.
     *
     * @return The field sunday
     */
    public @Nullable Double getSunday() { return this.sunday; }
    /**
     * Working hours on Sunday.
     *
     * @param value The new value for sunday
     */
    public void setSunday(@Nullable Double value) { this.sunday = value; }
};
