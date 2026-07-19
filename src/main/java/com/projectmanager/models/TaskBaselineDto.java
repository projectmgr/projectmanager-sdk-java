
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
 * Baseline schedule and cost values captured for a Task when a project baseline is set.
 */
public class TaskBaselineDto
{
    private @NotNull String id;
    private @NotNull Integer number;
    private @Nullable Integer duration;
    private @Nullable Integer effort;
    private @NotNull String start;
    private @Nullable String finish;
    private @Nullable Double cost;
    private @Nullable String durationFormat;
    private @Nullable String effortFormat;

    /**
     * The unique identifier of this baseline record.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this baseline record.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The baseline number for this Task.
     *
     * @return The field number
     */
    public @NotNull Integer getNumber() { return this.number; }
    /**
     * The baseline number for this Task.
     *
     * @param value The new value for number
     */
    public void setNumber(@NotNull Integer value) { this.number = value; }
    /**
     * The baselined duration (in minutes) for this Task.
     *
     * @return The field duration
     */
    public @Nullable Integer getDuration() { return this.duration; }
    /**
     * The baselined duration (in minutes) for this Task.
     *
     * @param value The new value for duration
     */
    public void setDuration(@Nullable Integer value) { this.duration = value; }
    /**
     * The baselined effort (in minutes) for this Task.
     *
     * @return The field effort
     */
    public @Nullable Integer getEffort() { return this.effort; }
    /**
     * The baselined effort (in minutes) for this Task.
     *
     * @param value The new value for effort
     */
    public void setEffort(@Nullable Integer value) { this.effort = value; }
    /**
     * The baselined start date for this Task.
     *
     * @return The field start
     */
    public @NotNull String getStart() { return this.start; }
    /**
     * The baselined start date for this Task.
     *
     * @param value The new value for start
     */
    public void setStart(@NotNull String value) { this.start = value; }
    /**
     * The baselined finish date for this Task.
     *
     * @return The field finish
     */
    public @Nullable String getFinish() { return this.finish; }
    /**
     * The baselined finish date for this Task.
     *
     * @param value The new value for finish
     */
    public void setFinish(@Nullable String value) { this.finish = value; }
    /**
     * The baselined cost for this Task.
     *
     * @return The field cost
     */
    public @Nullable Double getCost() { return this.cost; }
    /**
     * The baselined cost for this Task.
     *
     * @param value The new value for cost
     */
    public void setCost(@Nullable Double value) { this.cost = value; }
    /**
     * The duration format for this baseline value.
     *
     * @return The field durationFormat
     */
    public @Nullable String getDurationFormat() { return this.durationFormat; }
    /**
     * The duration format for this baseline value.
     *
     * @param value The new value for durationFormat
     */
    public void setDurationFormat(@Nullable String value) { this.durationFormat = value; }
    /**
     * The effort format for this baseline value.
     *
     * @return The field effortFormat
     */
    public @Nullable String getEffortFormat() { return this.effortFormat; }
    /**
     * The effort format for this baseline value.
     *
     * @param value The new value for effortFormat
     */
    public void setEffortFormat(@Nullable String value) { this.effortFormat = value; }
};
