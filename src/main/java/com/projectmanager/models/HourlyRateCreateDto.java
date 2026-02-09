
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
 * The payload to create a hourly rate
 */
public class HourlyRateCreateDto
{
    private @Nullable String resourceId;
    private @Nullable String skillId;
    private @Nullable String projectId;
    private @Nullable Double hourlyRate;
    private @Nullable String copyFromRateId;

    /**
     * The ResourceId that the rate is for
     *
     * @return The field resourceId
     */
    public @Nullable String getResourceId() { return this.resourceId; }
    /**
     * The ResourceId that the rate is for
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@Nullable String value) { this.resourceId = value; }
    /**
     * The SkillId that the rate is for
     *
     * @return The field skillId
     */
    public @Nullable String getSkillId() { return this.skillId; }
    /**
     * The SkillId that the rate is for
     *
     * @param value The new value for skillId
     */
    public void setSkillId(@Nullable String value) { this.skillId = value; }
    /**
     * The ProjectId that the rate is for
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * The ProjectId that the rate is for
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * The hourly rate value, the rate will be created for all periods with this value.
     *
     * Either hourlyRate or copyFromRateId has to be specified but not both.
     *
     * @return The field hourlyRate
     */
    public @Nullable Double getHourlyRate() { return this.hourlyRate; }
    /**
     * The hourly rate value, the rate will be created for all periods with this value.
     *
     * Either hourlyRate or copyFromRateId has to be specified but not both.
     *
     * @param value The new value for hourlyRate
     */
    public void setHourlyRate(@Nullable Double value) { this.hourlyRate = value; }
    /**
     * The rateId to copy from. The values for each rate period will match the values for the source rate.
     *
     * Either hourlyRate or copyFromRateId has to be specified but not both.
     *
     * @return The field copyFromRateId
     */
    public @Nullable String getCopyFromRateId() { return this.copyFromRateId; }
    /**
     * The rateId to copy from. The values for each rate period will match the values for the source rate.
     *
     * Either hourlyRate or copyFromRateId has to be specified but not both.
     *
     * @param value The new value for copyFromRateId
     */
    public void setCopyFromRateId(@Nullable String value) { this.copyFromRateId = value; }
};
