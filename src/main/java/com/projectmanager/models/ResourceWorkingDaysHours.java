
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
 * Whole hours per weekday for scheduling (matches workspace/resource calendar rows).
 * Property order is Monday through Sunday for documentation and OpenAPI schema clarity.
 * On read, all seven values are set. On create/update, omit a property (or send null) to leave that day
 * unchanged; specified values merge over workspace defaults when building the resource calendar.
 */
public class ResourceWorkingDaysHours
{
    private @Nullable Double monday;
    private @Nullable Double tuesday;
    private @Nullable Double wednesday;
    private @Nullable Double thursday;
    private @Nullable Double friday;
    private @Nullable Double saturday;
    private @Nullable Double sunday;

    /**
     * Hours available on Monday.
     *
     * @return The field monday
     */
    public @Nullable Double getMonday() { return this.monday; }
    /**
     * Hours available on Monday.
     *
     * @param value The new value for monday
     */
    public void setMonday(@Nullable Double value) { this.monday = value; }
    /**
     * Hours available on Tuesday.
     *
     * @return The field tuesday
     */
    public @Nullable Double getTuesday() { return this.tuesday; }
    /**
     * Hours available on Tuesday.
     *
     * @param value The new value for tuesday
     */
    public void setTuesday(@Nullable Double value) { this.tuesday = value; }
    /**
     * Hours available on Wednesday.
     *
     * @return The field wednesday
     */
    public @Nullable Double getWednesday() { return this.wednesday; }
    /**
     * Hours available on Wednesday.
     *
     * @param value The new value for wednesday
     */
    public void setWednesday(@Nullable Double value) { this.wednesday = value; }
    /**
     * Hours available on Thursday.
     *
     * @return The field thursday
     */
    public @Nullable Double getThursday() { return this.thursday; }
    /**
     * Hours available on Thursday.
     *
     * @param value The new value for thursday
     */
    public void setThursday(@Nullable Double value) { this.thursday = value; }
    /**
     * Hours available on Friday.
     *
     * @return The field friday
     */
    public @Nullable Double getFriday() { return this.friday; }
    /**
     * Hours available on Friday.
     *
     * @param value The new value for friday
     */
    public void setFriday(@Nullable Double value) { this.friday = value; }
    /**
     * Hours available on Saturday.
     *
     * @return The field saturday
     */
    public @Nullable Double getSaturday() { return this.saturday; }
    /**
     * Hours available on Saturday.
     *
     * @param value The new value for saturday
     */
    public void setSaturday(@Nullable Double value) { this.saturday = value; }
    /**
     * Hours available on Sunday.
     *
     * @return The field sunday
     */
    public @Nullable Double getSunday() { return this.sunday; }
    /**
     * Hours available on Sunday.
     *
     * @param value The new value for sunday
     */
    public void setSunday(@Nullable Double value) { this.sunday = value; }
};
