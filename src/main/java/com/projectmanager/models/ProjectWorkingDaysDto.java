
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
 * Indicate which days of the week are considered working days for this project.
 * This value can be set when the project is created but may not be updated afterwards.
 */
public class ProjectWorkingDaysDto
{
    private @NotNull Boolean monday;
    private @NotNull Boolean tuesday;
    private @NotNull Boolean wednesday;
    private @NotNull Boolean thursday;
    private @NotNull Boolean friday;
    private @NotNull Boolean saturday;
    private @NotNull Boolean sunday;

    /**
     * Set this value to true if Monday is considered a working day for this project.
     *
     * @return The field monday
     */
    public @NotNull Boolean getMonday() { return this.monday; }
    /**
     * Set this value to true if Monday is considered a working day for this project.
     *
     * @param value The new value for monday
     */
    public void setMonday(@NotNull Boolean value) { this.monday = value; }
    /**
     * Set this value to true if Tuesday is considered a working day for this project.
     *
     * @return The field tuesday
     */
    public @NotNull Boolean getTuesday() { return this.tuesday; }
    /**
     * Set this value to true if Tuesday is considered a working day for this project.
     *
     * @param value The new value for tuesday
     */
    public void setTuesday(@NotNull Boolean value) { this.tuesday = value; }
    /**
     * Set this value to true if Wednesday is considered a working day for this project.
     *
     * @return The field wednesday
     */
    public @NotNull Boolean getWednesday() { return this.wednesday; }
    /**
     * Set this value to true if Wednesday is considered a working day for this project.
     *
     * @param value The new value for wednesday
     */
    public void setWednesday(@NotNull Boolean value) { this.wednesday = value; }
    /**
     * Set this value to true if Thursday is considered a working day for this project.
     *
     * @return The field thursday
     */
    public @NotNull Boolean getThursday() { return this.thursday; }
    /**
     * Set this value to true if Thursday is considered a working day for this project.
     *
     * @param value The new value for thursday
     */
    public void setThursday(@NotNull Boolean value) { this.thursday = value; }
    /**
     * Set this value to true if Friday is considered a working day for this project.
     *
     * @return The field friday
     */
    public @NotNull Boolean getFriday() { return this.friday; }
    /**
     * Set this value to true if Friday is considered a working day for this project.
     *
     * @param value The new value for friday
     */
    public void setFriday(@NotNull Boolean value) { this.friday = value; }
    /**
     * Set this value to true if Saturday is considered a working day for this project.
     *
     * @return The field saturday
     */
    public @NotNull Boolean getSaturday() { return this.saturday; }
    /**
     * Set this value to true if Saturday is considered a working day for this project.
     *
     * @param value The new value for saturday
     */
    public void setSaturday(@NotNull Boolean value) { this.saturday = value; }
    /**
     * Set this value to true if Sunday is considered a working day for this project.
     *
     * @return The field sunday
     */
    public @NotNull Boolean getSunday() { return this.sunday; }
    /**
     * Set this value to true if Sunday is considered a working day for this project.
     *
     * @param value The new value for sunday
     */
    public void setSunday(@NotNull Boolean value) { this.sunday = value; }
};
