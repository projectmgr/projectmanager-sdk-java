
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
 * A Task is an individual element of work that must be performed to complete a Project.  A
 * Task can have one or more Resources assigned to it.  Tasks can be linked to other Tasks to
 * indicate whether they have a dependency or a connection.
 */
public class TaskCreateDto
{
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable Integer percentComplete;
    private @Nullable String statusId;
    private @Nullable Integer priorityId;
    private @Nullable String[] assignees;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable Integer plannedDuration;
    private @Nullable Integer plannedEffort;
    private @Nullable Double plannedCost;
    private @Nullable String actualStartDate;
    private @Nullable Double actualCost;
    private @Nullable String theme;
    private @Nullable Boolean isLocked;
    private @Nullable Boolean isMilestone;
    private @Nullable String parentId;
    private @Nullable Integer index;

    /**
     * The common name of this Task.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The common name of this Task.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
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
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this Task.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * This value can be edited manually in the Gantt chart view of the application,
     * or can be selected on the Task Detail page within the Kanban board.
     *
     * @return The field percentComplete
     */
    public @Nullable Integer getPercentComplete() { return this.percentComplete; }
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
    public void setPercentComplete(@Nullable Integer value) { this.percentComplete = value; }
    /**
     * The unique identifier of the TaskStatus for this Task
     *
     * @return The field statusId
     */
    public @Nullable String getStatusId() { return this.statusId; }
    /**
     * The unique identifier of the TaskStatus for this Task
     *
     * @param value The new value for statusId
     */
    public void setStatusId(@Nullable String value) { this.statusId = value; }
    /**
     * A numerical value representing the Priority of this Task
     *
     * @return The field priorityId
     */
    public @Nullable Integer getPriorityId() { return this.priorityId; }
    /**
     * A numerical value representing the Priority of this Task
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable Integer value) { this.priorityId = value; }
    /**
     * A list of unique identifiers of TaskAssignees to be assigned to this Task
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * A list of unique identifiers of TaskAssignees to be assigned to this Task
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * @return The field plannedStartDate
     */
    public @Nullable String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * The date when work on this Task is planned to begin.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@Nullable String value) { this.plannedStartDate = value; }
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
     * The planned duration (in minutes) for this Task.  Cannot be negative.
     *
     * @return The field plannedDuration
     */
    public @Nullable Integer getPlannedDuration() { return this.plannedDuration; }
    /**
     * The planned duration (in minutes) for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedDuration
     */
    public void setPlannedDuration(@Nullable Integer value) { this.plannedDuration = value; }
    /**
     * The planned effort (in minutes) for this Task.  Cannot be negative.
     *
     * @return The field plannedEffort
     */
    public @Nullable Integer getPlannedEffort() { return this.plannedEffort; }
    /**
     * The planned effort (in minutes) for this Task.  Cannot be negative.
     *
     * @param value The new value for plannedEffort
     */
    public void setPlannedEffort(@Nullable Integer value) { this.plannedEffort = value; }
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
    /**
     * The date when work on this Task actually started, if known.
     *
     * @return The field actualStartDate
     */
    public @Nullable String getActualStartDate() { return this.actualStartDate; }
    /**
     * The date when work on this Task actually started, if known.
     *
     * @param value The new value for actualStartDate
     */
    public void setActualStartDate(@Nullable String value) { this.actualStartDate = value; }
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
     * Color theme definition for this task.
     *
     * eg. Blue, Brown, DarkBlue, DarkGrey, Gold, Green, Grey, LightBrown, LightGreen,
     * LightGrey, LightPurple, LightYellow, Magenta, Mauve, Navy, Orange, Purple, Red.
     *
     * @return The field theme
     */
    public @Nullable String getTheme() { return this.theme; }
    /**
     * Color theme definition for this task.
     *
     * eg. Blue, Brown, DarkBlue, DarkGrey, Gold, Green, Grey, LightBrown, LightGreen,
     * LightGrey, LightPurple, LightYellow, Magenta, Mauve, Navy, Orange, Purple, Red.
     *
     * @param value The new value for theme
     */
    public void setTheme(@Nullable String value) { this.theme = value; }
    /**
     * Unlocked tasks can be adjusted by changes to their dependencies, resource leveling, or other factors.
     *
     * All tasks are unlocked by default.
     *
     * If a task is set to `IsLocked` = `true`, the dates and assigned resources are locked for this task and will not
     * be automatically changed by any process.
     *
     * @return The field isLocked
     */
    public @Nullable Boolean getIsLocked() { return this.isLocked; }
    /**
     * Unlocked tasks can be adjusted by changes to their dependencies, resource leveling, or other factors.
     *
     * All tasks are unlocked by default.
     *
     * If a task is set to `IsLocked` = `true`, the dates and assigned resources are locked for this task and will not
     * be automatically changed by any process.
     *
     * @param value The new value for isLocked
     */
    public void setIsLocked(@Nullable Boolean value) { this.isLocked = value; }
    /**
     * True if this task is a milestone.  Milestones represent a specific point in time for the project.  When a
     * milestone is locked, it represents a fixed time within the project that can be used to relate to other tasks.
     *
     * @return The field isMilestone
     */
    public @Nullable Boolean getIsMilestone() { return this.isMilestone; }
    /**
     * True if this task is a milestone.  Milestones represent a specific point in time for the project.  When a
     * milestone is locked, it represents a fixed time within the project that can be used to relate to other tasks.
     *
     * @param value The new value for isMilestone
     */
    public void setIsMilestone(@Nullable Boolean value) { this.isMilestone = value; }
    /**
     * Gets or sets the unique identifier of the parent task.
     * If set, this task will be a child of the specified parent task, supporting task hierarchies and sub-tasks.
     *
     * @return The field parentId
     */
    public @Nullable String getParentId() { return this.parentId; }
    /**
     * Gets or sets the unique identifier of the parent task.
     * If set, this task will be a child of the specified parent task, supporting task hierarchies and sub-tasks.
     *
     * @param value The new value for parentId
     */
    public void setParentId(@Nullable String value) { this.parentId = value; }
    /**
     * Gets or sets the position of the task within the list of project tasks.
     * Used to determine the order of tasks in the project with the first task being 1.
     *
     * @return The field index
     */
    public @Nullable Integer getIndex() { return this.index; }
    /**
     * Gets or sets the position of the task within the list of project tasks.
     * Used to determine the order of tasks in the project with the first task being 1.
     *
     * @param value The new value for index
     */
    public void setIndex(@Nullable Integer value) { this.index = value; }
};
