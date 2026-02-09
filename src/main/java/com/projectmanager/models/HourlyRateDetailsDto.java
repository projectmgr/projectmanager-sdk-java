
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
 * Detailed information about a specific hourly rate, including task and resource counts.
 */
public class HourlyRateDetailsDto
{
    private @NotNull String id;
    private @NotNull String createBy;
    private @NotNull String createDate;
    private @NotNull String modifyBy;
    private @NotNull String modifyDate;
    private @NotNull String rateType;
    private @Nullable String projectId;
    private @Nullable TaskProjectDto project;
    private @Nullable String resourceId;
    private @Nullable PartialResourceDto resource;
    private @Nullable String skillId;
    private @Nullable ResourceSkillDto skill;
    private @NotNull HourlyRateValueDto[] values;
    private @NotNull Boolean isActive;
    private @Nullable Integer taskCount;
    private @Nullable Integer resourceCount;
    private @Nullable Integer hourlyRateTimesheetCount;

    /**
     * The unique identifier of the Hourly Rate.  This value is set by the system and cannot
     * be set with a CreateHourlyRate or changed with an UpdateHourlyRate call.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Hourly Rate.  This value is set by the system and cannot
     * be set with a CreateHourlyRate or changed with an UpdateHourlyRate call.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Who created the Hourly rate
     *
     * @return The field createBy
     */
    public @NotNull String getCreateBy() { return this.createBy; }
    /**
     * Who created the Hourly rate
     *
     * @param value The new value for createBy
     */
    public void setCreateBy(@NotNull String value) { this.createBy = value; }
    /**
     * The timestamp in UTC when the Hourly Rate was created.
     *
     * This field is automatically determined by the system when this Hourly Rate is created
     * and cannot be changed by the user.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when the Hourly Rate was created.
     *
     * This field is automatically determined by the system when this Hourly Rate is created
     * and cannot be changed by the user.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * Who last modified the Hourly rate
     *
     * @return The field modifyBy
     */
    public @NotNull String getModifyBy() { return this.modifyBy; }
    /**
     * Who last modified the Hourly rate
     *
     * @param value The new value for modifyBy
     */
    public void setModifyBy(@NotNull String value) { this.modifyBy = value; }
    /**
     * The timestamp in UTC when the Hourly Rate was most recently modified.
     *
     * This field is automatically determined by the system when this Hourly Rate is modified
     * and cannot be directly changed by the user.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when the Hourly Rate was most recently modified.
     *
     * This field is automatically determined by the system when this Hourly Rate is modified
     * and cannot be directly changed by the user.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The type of the rate
     *
     * @return The field rateType
     */
    public @NotNull String getRateType() { return this.rateType; }
    /**
     * The type of the rate
     *
     * @param value The new value for rateType
     */
    public void setRateType(@NotNull String value) { this.rateType = value; }
    /**
     * The ProjectId the rate is for
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * The ProjectId the rate is for
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * The Project the rate is for
     *
     * @return The field project
     */
    public @Nullable TaskProjectDto getProject() { return this.project; }
    /**
     * The Project the rate is for
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable TaskProjectDto value) { this.project = value; }
    /**
     * The ResourceId the rate is for
     *
     * @return The field resourceId
     */
    public @Nullable String getResourceId() { return this.resourceId; }
    /**
     * The ResourceId the rate is for
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@Nullable String value) { this.resourceId = value; }
    /**
     * The Resource the rate is for
     *
     * @return The field resource
     */
    public @Nullable PartialResourceDto getResource() { return this.resource; }
    /**
     * The Resource the rate is for
     *
     * @param value The new value for resource
     */
    public void setResource(@Nullable PartialResourceDto value) { this.resource = value; }
    /**
     * The SkillId the rate is for
     *
     * @return The field skillId
     */
    public @Nullable String getSkillId() { return this.skillId; }
    /**
     * The SkillId the rate is for
     *
     * @param value The new value for skillId
     */
    public void setSkillId(@Nullable String value) { this.skillId = value; }
    /**
     * The Skill the rate is for
     *
     * @return The field skill
     */
    public @Nullable ResourceSkillDto getSkill() { return this.skill; }
    /**
     * The Skill the rate is for
     *
     * @param value The new value for skill
     */
    public void setSkill(@Nullable ResourceSkillDto value) { this.skill = value; }
    /**
     * A list of all rates for each rate period
     *
     * @return The field values
     */
    public @NotNull HourlyRateValueDto[] getValues() { return this.values; }
    /**
     * A list of all rates for each rate period
     *
     * @param value The new value for values
     */
    public void setValues(@NotNull HourlyRateValueDto[] value) { this.values = value; }
    /**
     * If this is an archived rate
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * If this is an archived rate
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * Total number of tasks with at least 1 association to this rate
     *
     * @return The field taskCount
     */
    public @Nullable Integer getTaskCount() { return this.taskCount; }
    /**
     * Total number of tasks with at least 1 association to this rate
     *
     * @param value The new value for taskCount
     */
    public void setTaskCount(@Nullable Integer value) { this.taskCount = value; }
    /**
     * Total number of resources using this rate
     *
     * @return The field resourceCount
     */
    public @Nullable Integer getResourceCount() { return this.resourceCount; }
    /**
     * Total number of resources using this rate
     *
     * @param value The new value for resourceCount
     */
    public void setResourceCount(@Nullable Integer value) { this.resourceCount = value; }
    /**
     * Total number of timesheets using this rate
     *
     * @return The field hourlyRateTimesheetCount
     */
    public @Nullable Integer getHourlyRateTimesheetCount() { return this.hourlyRateTimesheetCount; }
    /**
     * Total number of timesheets using this rate
     *
     * @param value The new value for hourlyRateTimesheetCount
     */
    public void setHourlyRateTimesheetCount(@Nullable Integer value) { this.hourlyRateTimesheetCount = value; }
};
