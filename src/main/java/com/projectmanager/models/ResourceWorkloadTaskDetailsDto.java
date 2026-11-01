
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
 * Basic details of the Task a workload entry belongs to. Only populated when the request specifies
 * `include=task`.
 */
public class ResourceWorkloadTaskDetailsDto
{
    private @NotNull String id;
    private @Nullable String projectId;
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable Integer percentComplete;
    private @NotNull String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @Nullable TaskStatusDto status;
    private @NotNull TaskTagDto[] tags;

    /**
     * Primary constructor
     */
    public ResourceWorkloadTaskDetailsDto() {
    }

    /**
     * The unique identifier of the Task.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Task.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the Project this Task belongs to.
     *
     * @return The field projectId
     */
    public @Nullable String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the Project this Task belongs to.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@Nullable String value) { this.projectId = value; }
    /**
     * The name of the Task.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the Task.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The Task's description, in markdown format.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * The Task's description, in markdown format.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The percentage of the task duration completed.
     *
     * @return The field percentComplete
     */
    public @Nullable Integer getPercentComplete() { return this.percentComplete; }
    /**
     * The percentage of the task duration completed.
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@Nullable Integer value) { this.percentComplete = value; }
    /**
     * The planned start date of the Task.
     *
     * @return The field plannedStartDate
     */
    public @NotNull String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The planned start date of the Task.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@NotNull String value) { this.plannedStartDate = value; }
    /**
     * The planned finish date of the Task.
     *
     * @return The field plannedFinishDate
     */
    public @Nullable String getPlannedFinishDate() { return this.plannedFinishDate; }
    /**
     * The planned finish date of the Task.
     *
     * @param value The new value for plannedFinishDate
     */
    public void setPlannedFinishDate(@Nullable String value) { this.plannedFinishDate = value; }
    /**
     * The actual start date of the Task.
     *
     * @return The field actualStartDate
     */
    public @Nullable String getActualStartDate() { return this.actualStartDate; }
    /**
     * The actual start date of the Task.
     *
     * @param value The new value for actualStartDate
     */
    public void setActualStartDate(@Nullable String value) { this.actualStartDate = value; }
    /**
     * The actual finish date of the Task.
     *
     * @return The field actualFinishDate
     */
    public @Nullable String getActualFinishDate() { return this.actualFinishDate; }
    /**
     * The actual finish date of the Task.
     *
     * @param value The new value for actualFinishDate
     */
    public void setActualFinishDate(@Nullable String value) { this.actualFinishDate = value; }
    /**
     * The Task's current status (board column).
     *
     * @return The field status
     */
    public @Nullable TaskStatusDto getStatus() { return this.status; }
    /**
     * The Task's current status (board column).
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable TaskStatusDto value) { this.status = value; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @return The field tags
     */
    public @NotNull TaskTagDto[] getTags() { return this.tags; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @param value The new value for tags
     */
    public void setTags(@NotNull TaskTagDto[] value) { this.tags = value; }
};
