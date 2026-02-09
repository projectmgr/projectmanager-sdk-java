
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
 * Represents a period of time for which a specific hourly rate is applicable.
 */
public class HourlyRatePeriodDto
{
    private @NotNull String id;
    private @Nullable String startDate;
    private @Nullable String finishDate;
    private @NotNull Boolean isCurrent;
    private @Nullable String createBy;
    private @NotNull String createDate;
    private @Nullable String modifyBy;
    private @Nullable String modifyDate;
    private @NotNull HourlyRateValueDto[] values;

    /**
     * The unique identifier of the hourly rate period.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the hourly rate period.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The start date of the hourly rate period. If null this is the first period.
     *
     * @return The field startDate
     */
    public @Nullable String getStartDate() { return this.startDate; }
    /**
     * The start date of the hourly rate period. If null this is the first period.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@Nullable String value) { this.startDate = value; }
    /**
     * The finish date of the hourly rate period. If null this is the last period.
     *
     * @return The field finishDate
     */
    public @Nullable String getFinishDate() { return this.finishDate; }
    /**
     * The finish date of the hourly rate period. If null this is the last period.
     *
     * @param value The new value for finishDate
     */
    public void setFinishDate(@Nullable String value) { this.finishDate = value; }
    /**
     * Indicates whether the hourly rate period is the current period.
     *
     * @return The field isCurrent
     */
    public @NotNull Boolean getIsCurrent() { return this.isCurrent; }
    /**
     * Indicates whether the hourly rate period is the current period.
     *
     * @param value The new value for isCurrent
     */
    public void setIsCurrent(@NotNull Boolean value) { this.isCurrent = value; }
    /**
     * The resourceId who created the hourly rate period.
     *
     * @return The field createBy
     */
    public @Nullable String getCreateBy() { return this.createBy; }
    /**
     * The resourceId who created the hourly rate period.
     *
     * @param value The new value for createBy
     */
    public void setCreateBy(@Nullable String value) { this.createBy = value; }
    /**
     * The date and time the hourly rate period was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The date and time the hourly rate period was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The resourceId who last modified the hourly rate period.
     *
     * @return The field modifyBy
     */
    public @Nullable String getModifyBy() { return this.modifyBy; }
    /**
     * The resourceId who last modified the hourly rate period.
     *
     * @param value The new value for modifyBy
     */
    public void setModifyBy(@Nullable String value) { this.modifyBy = value; }
    /**
     * The date and time the hourly rate period was last modified.
     *
     * @return The field modifyDate
     */
    public @Nullable String getModifyDate() { return this.modifyDate; }
    /**
     * The date and time the hourly rate period was last modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@Nullable String value) { this.modifyDate = value; }
    /**
     * A list of all the rates for the rate period
     *
     * @return The field values
     */
    public @NotNull HourlyRateValueDto[] getValues() { return this.values; }
    /**
     * A list of all the rates for the rate period
     *
     * @param value The new value for values
     */
    public void setValues(@NotNull HourlyRateValueDto[] value) { this.values = value; }
};
