
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Task is an individual element of work that must be performed to complete a Project.  A
 * Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to
 * indicate whether they have a dependency or a connection.
 */
public class TaskDetailsDto
{
    private @NotNull String id;
    private @Nullable TaskProjectDto project;
    private @Nullable TaskTagDto[] tags;
    private @Nullable TaskAssigneeDto[] assignees;
    private @Nullable TaskTodoDto[] todos;
    private @Nullable String shortId;
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable TaskStatusDto status;
    private @NotNull Integer priorityId;
    private @NotNull String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @NotNull String modifyDate;
    private @NotNull String createDate;
    private @NotNull Integer percentComplete;
    private @NotNull Boolean isSummary;
    private @Nullable String wbs;
    private @Nullable Double actualCost;
    private @Nullable Double plannedCost;

    /**
     * The unique identifier of this Task.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Task.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The Project to which this Task belongs.
     *
     * @return The field project
     */
    public @Nullable TaskProjectDto getProject() { return this.project; }
    /**
     * The Project to which this Task belongs.
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable TaskProjectDto value) { this.project = value; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @return The field tags
     */
    public @Nullable TaskTagDto[] getTags() { return this.tags; }
    /**
     * The TaskTags that apply to this Task.
     *
     * @param value The new value for tags
     */
    public void setTags(@Nullable TaskTagDto[] value) { this.tags = value; }
    /**
     * The list of assignees who are to work on this Task, if any.
     *
     * @return The field assignees
     */
    public @Nullable TaskAssigneeDto[] getAssignees() { return this.assignees; }
    /**
     * The list of assignees who are to work on this Task, if any.
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable TaskAssigneeDto[] value) { this.assignees = value; }
    /**
     * A list of TaskTodo items, which are sub-tasks within this Task.
     *
     * @return The field todos
     */
    public @Nullable TaskTodoDto[] getTodos() { return this.todos; }
    /**
     * A list of TaskTodo items, which are sub-tasks within this Task.
     *
     * @param value The new value for todos
     */
    public void setTodos(@Nullable TaskTodoDto[] value) { this.todos = value; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * A short ID that can be used to refer to this Task.  This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The common name of this Task.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this Task.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A description of the work to be performed in this Task.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The TaskStatus assigned to this Task.
     *
     * @return The field status
     */
    public @Nullable TaskStatusDto getStatus() { return this.status; }
    /**
     * The TaskStatus assigned to this Task.
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable TaskStatusDto value) { this.status = value; }
    /**
     * The unique identifier of the TaskPriority
     *
     * @return The field priorityId
     */
    public @NotNull Integer getPriorityId() { return this.priorityId; }
    /**
     * The unique identifier of the TaskPriority
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@NotNull Integer value) { this.priorityId = value; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * @return The field plannedStartDate
     */
    public @NotNull String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@NotNull String value) { this.plannedStartDate = value; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * @return The field plannedFinishDate
     */
    public @Nullable String getPlannedFinishDate() { return this.plannedFinishDate; }
    /**
     * The date when work on this Task is expected to complete.
     *
     * @param value The new value for plannedFinishDate
     */
    public void setPlannedFinishDate(@Nullable String value) { this.plannedFinishDate = value; }
    /**
     * If set, this is the actual date when work began on the Task.
     *
     * @return The field actualStartDate
     */
    public @Nullable String getActualStartDate() { return this.actualStartDate; }
    /**
     * If set, this is the actual date when work began on the Task.
     *
     * @param value The new value for actualStartDate
     */
    public void setActualStartDate(@Nullable String value) { this.actualStartDate = value; }
    /**
     * If set, this is the actual date when work was completed on this Task.
     *
     * @return The field actualFinishDate
     */
    public @Nullable String getActualFinishDate() { return this.actualFinishDate; }
    /**
     * If set, this is the actual date when work was completed on this Task.
     *
     * @param value The new value for actualFinishDate
     */
    public void setActualFinishDate(@Nullable String value) { this.actualFinishDate = value; }
    /**
     * The timestamp in UTC when this Task was most recently modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when this Task was most recently modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The timestamp in UTC when this Task was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when this Task was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this Task.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * This value can be edited manually in the Gantt chart view of the application,
     * or can be selected on the Task Detail page within the Kanban board.
     *
     * @return The field percentComplete
     */
    public @NotNull Integer getPercentComplete() { return this.percentComplete; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this Task.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * This value can be edited manually in the Gantt chart view of the application,
     * or can be selected on the Task Detail page within the Kanban board.
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@NotNull Integer value) { this.percentComplete = value; }
    /**
     * True if this Task is the parent of multiple Tasks underneath it.  A parent Task
     * is a "rolled-up" view of multiple children that allows you to view a section of
     * work at a glance.
     *
     * You can create a summary Task in the Gantt chart view of the application by
     * adding child tasks underneath a parent Task.
     *
     * @return The field isSummary
     */
    public @NotNull Boolean getIsSummary() { return this.isSummary; }
    /**
     * True if this Task is the parent of multiple Tasks underneath it.  A parent Task
     * is a "rolled-up" view of multiple children that allows you to view a section of
     * work at a glance.
     *
     * You can create a summary Task in the Gantt chart view of the application by
     * adding child tasks underneath a parent Task.
     *
     * @param value The new value for isSummary
     */
    public void setIsSummary(@NotNull Boolean value) { this.isSummary = value; }
    /**
     * The WBS (Work Breakdown Structure) number for this task within the Gantt chart hierarchy.  See [What
     * Is a Work Breakdown Structure (WBS)?](https://www.projectmanager.com/guides/work-breakdown-structure)
     * on Project Manager for more information. The WBS number is an outline number in the form `#.#.#.#`
     * which indicates how tasks are organized and sorted.
     *
     * The WBS value is only available to users at certain edition levels.  This value can only be changed
     * if you are a Project Editor.
     *
     * @return The field wbs
     */
    public @Nullable String getWbs() { return this.wbs; }
    /**
     * The WBS (Work Breakdown Structure) number for this task within the Gantt chart hierarchy.  See [What
     * Is a Work Breakdown Structure (WBS)?](https://www.projectmanager.com/guides/work-breakdown-structure)
     * on Project Manager for more information. The WBS number is an outline number in the form `#.#.#.#`
     * which indicates how tasks are organized and sorted.
     *
     * The WBS value is only available to users at certain edition levels.  This value can only be changed
     * if you are a Project Editor.
     *
     * @param value The new value for wbs
     */
    public void setWbs(@Nullable String value) { this.wbs = value; }
    /**
     * The actual cost of this Task to date, if known.
     *
     * @return The field actualCost
     */
    public @Nullable Double getActualCost() { return this.actualCost; }
    /**
     * The actual cost of this Task to date, if known.
     *
     * @param value The new value for actualCost
     */
    public void setActualCost(@Nullable Double value) { this.actualCost = value; }
    /**
     * The planned cost for this Task.  Cannot be negative.
     *
     * @return The field plannedCost
     */
    public @Nullable Double getPlannedCost() { return this.plannedCost; }
    /**
     * The planned cost for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedCost
     */
    public void setPlannedCost(@Nullable Double value) { this.plannedCost = value; }
};
