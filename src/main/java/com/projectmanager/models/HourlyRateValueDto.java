
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
 * Represents the value of an hourly rate for a specific period, including audit information and references to the rate definition and period.
 */
public class HourlyRateValueDto
{
    private @NotNull String id;
    private @NotNull String createBy;
    private @NotNull String createDate;
    private @NotNull String modifyBy;
    private @NotNull String modifyDate;
    private @NotNull String hourlyRateDefinitionId;
    private @NotNull String hourlyRatePeriodId;
    private @Nullable String periodStartDate;
    private @Nullable String periodFinishDate;
    private @NotNull Double value;

    /**
     * Gets or sets the unique identifier for this hourly rate value entry.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Gets or sets the unique identifier for this hourly rate value entry.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Gets or sets the identifier of the user or resource who created this hourly rate value.
     *
     * @return The field createBy
     */
    public @NotNull String getCreateBy() { return this.createBy; }
    /**
     * Gets or sets the identifier of the user or resource who created this hourly rate value.
     *
     * @param value The new value for createBy
     */
    public void setCreateBy(@NotNull String value) { this.createBy = value; }
    /**
     * Gets or sets the date and time when this hourly rate value was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Gets or sets the date and time when this hourly rate value was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * Gets or sets the identifier of the user or resource who last modified this hourly rate value.
     *
     * @return The field modifyBy
     */
    public @NotNull String getModifyBy() { return this.modifyBy; }
    /**
     * Gets or sets the identifier of the user or resource who last modified this hourly rate value.
     *
     * @param value The new value for modifyBy
     */
    public void setModifyBy(@NotNull String value) { this.modifyBy = value; }
    /**
     * Gets or sets the date and time when this hourly rate value was last modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * Gets or sets the date and time when this hourly rate value was last modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * Gets or sets the unique identifier of the hourly rate definition to which this value belongs.
     *
     * @return The field hourlyRateDefinitionId
     */
    public @NotNull String getHourlyRateDefinitionId() { return this.hourlyRateDefinitionId; }
    /**
     * Gets or sets the unique identifier of the hourly rate definition to which this value belongs.
     *
     * @param value The new value for hourlyRateDefinitionId
     */
    public void setHourlyRateDefinitionId(@NotNull String value) { this.hourlyRateDefinitionId = value; }
    /**
     * Gets or sets the unique identifier of the hourly rate period to which this value applies.
     *
     * @return The field hourlyRatePeriodId
     */
    public @NotNull String getHourlyRatePeriodId() { return this.hourlyRatePeriodId; }
    /**
     * Gets or sets the unique identifier of the hourly rate period to which this value applies.
     *
     * @param value The new value for hourlyRatePeriodId
     */
    public void setHourlyRatePeriodId(@NotNull String value) { this.hourlyRatePeriodId = value; }
    /**
     * Gets or sets the start date of the hourly rate period for which this value applies.
     * This value is sourced from the associated HourlyRatePeriod.
     *
     * @return The field periodStartDate
     */
    public @Nullable String getPeriodStartDate() { return this.periodStartDate; }
    /**
     * Gets or sets the start date of the hourly rate period for which this value applies.
     * This value is sourced from the associated HourlyRatePeriod.
     *
     * @param value The new value for periodStartDate
     */
    public void setPeriodStartDate(@Nullable String value) { this.periodStartDate = value; }
    /**
     * Gets or sets the finish date of the hourly rate period for which this value applies.
     * This value is sourced from the associated HourlyRatePeriod.
     *
     * @return The field periodFinishDate
     */
    public @Nullable String getPeriodFinishDate() { return this.periodFinishDate; }
    /**
     * Gets or sets the finish date of the hourly rate period for which this value applies.
     * This value is sourced from the associated HourlyRatePeriod.
     *
     * @param value The new value for periodFinishDate
     */
    public void setPeriodFinishDate(@Nullable String value) { this.periodFinishDate = value; }
    /**
     * Gets or sets the value of the hourly rate for the specified period.
     *
     * @return The field value
     */
    public @NotNull Double getValue() { return this.value; }
    /**
     * Gets or sets the value of the hourly rate for the specified period.
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull Double value) { this.value = value; }
};
