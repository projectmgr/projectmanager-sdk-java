
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
 * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
 * represent individual items of work that team members must complete.  The sum total of Tasks
 * within a Project represents the work to be completed for that Project.
 */
public class TimeSheetProjectDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull String shortCode;
    private @NotNull String shortId;
    private @Nullable String startDate;
    private @Nullable String endDate;
    private @Nullable String targetDate;
    private @Nullable Double budget;
    private @Nullable Double hourlyRate;
    private @Nullable String statusUpdate;
    private @NotNull String modifyDate;
    private @NotNull String createDate;
    private @NotNull Boolean isTemplate;

    /**
     * The unique identifier of the Project.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Project.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of the Project.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the Project.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * An optional description of the Project
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * An optional description of the Project
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * A shortened name that will be used when reporting on Projects.  This short
     * name can be edited in the Project Settings page within the application
     * and can be any text you wish.
     *
     * @return The field shortCode
     */
    public @NotNull String getShortCode() { return this.shortCode; }
    /**
     * A shortened name that will be used when reporting on Projects.  This short
     * name can be edited in the Project Settings page within the application
     * and can be any text you wish.
     *
     * @param value The new value for shortCode
     */
    public void setShortCode(@NotNull String value) { this.shortCode = value; }
    /**
     * A short identifier that uniquely identifies this Project within your Workspace
     * using a single letter followed by a number.  This code can be used for APIs
     * that accept Project unique identifiers.
     *
     * You can observe the short ID within the application by observing the URL of
     * the page you visit when you click on this project.  The page's URL will appear
     * in the form `https://pm.app.projectmanager.com/project/board/D16` - in this
     * example, the `ShortId` is `D16`.
     *
     * This code is automatically assigned for you and cannot be changed.
     *
     * @return The field shortId
     */
    public @NotNull String getShortId() { return this.shortId; }
    /**
     * A short identifier that uniquely identifies this Project within your Workspace
     * using a single letter followed by a number.  This code can be used for APIs
     * that accept Project unique identifiers.
     *
     * You can observe the short ID within the application by observing the URL of
     * the page you visit when you click on this project.  The page's URL will appear
     * in the form `https://pm.app.projectmanager.com/project/board/D16` - in this
     * example, the `ShortId` is `D16`.
     *
     * This code is automatically assigned for you and cannot be changed.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * The earliest planned or actual start date of tasks on the project.
     *
     * This field is calculated automatically and cannot be changed.
     *
     * @return The field startDate
     */
    public @Nullable String getStartDate() { return this.startDate; }
    /**
     * The earliest planned or actual start date of tasks on the project.
     *
     * This field is calculated automatically and cannot be changed.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@Nullable String value) { this.startDate = value; }
    /**
     * The latest planned or actual finish date of tasks on the project.
     *
     * This field is calculated automatically and cannot be changed.
     *
     * @return The field endDate
     */
    public @Nullable String getEndDate() { return this.endDate; }
    /**
     * The latest planned or actual finish date of tasks on the project.
     *
     * This field is calculated automatically and cannot be changed.
     *
     * @param value The new value for endDate
     */
    public void setEndDate(@Nullable String value) { this.endDate = value; }
    /**
     * The target planned completion date for this Project, or null if one has
     * not been selected.  This value can be updated in the Project Settings
     * page or the Portfolio Project page within the application.
     *
     * @return The field targetDate
     */
    public @Nullable String getTargetDate() { return this.targetDate; }
    /**
     * The target planned completion date for this Project, or null if one has
     * not been selected.  This value can be updated in the Project Settings
     * page or the Portfolio Project page within the application.
     *
     * @param value The new value for targetDate
     */
    public void setTargetDate(@Nullable String value) { this.targetDate = value; }
    /**
     * The proposed budget for this Project.
     *
     * @return The field budget
     */
    public @Nullable Double getBudget() { return this.budget; }
    /**
     * The proposed budget for this Project.
     *
     * @param value The new value for budget
     */
    public void setBudget(@Nullable Double value) { this.budget = value; }
    /**
     * The default hourly rate for work on this Project.  This rate will be used
     * if an assignee working on this Project does not have an hourly rate configured
     * in their profile.
     *
     * @return The field hourlyRate
     */
    public @Nullable Double getHourlyRate() { return this.hourlyRate; }
    /**
     * The default hourly rate for work on this Project.  This rate will be used
     * if an assignee working on this Project does not have an hourly rate configured
     * in their profile.
     *
     * @param value The new value for hourlyRate
     */
    public void setHourlyRate(@Nullable Double value) { this.hourlyRate = value; }
    /**
     * Contains an optional status update for Projects that can be used to summarize
     * the status of multiple Projects at a glance.
     *
     * You can edit the StatusUpdate field on the Portfolio page of the application.
     *
     * @return The field statusUpdate
     */
    public @Nullable String getStatusUpdate() { return this.statusUpdate; }
    /**
     * Contains an optional status update for Projects that can be used to summarize
     * the status of multiple Projects at a glance.
     *
     * You can edit the StatusUpdate field on the Portfolio page of the application.
     *
     * @param value The new value for statusUpdate
     */
    public void setStatusUpdate(@Nullable String value) { this.statusUpdate = value; }
    /**
     * The timestamp in UTC when the Project was most recently modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when the Project was most recently modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The timestamp in UTC when the Project was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when the Project was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * True if this Project is a template that will be reused as a framework
     * for future Projects.
     *
     * @return The field isTemplate
     */
    public @NotNull Boolean getIsTemplate() { return this.isTemplate; }
    /**
     * True if this Project is a template that will be reused as a framework
     * for future Projects.
     *
     * @param value The new value for isTemplate
     */
    public void setIsTemplate(@NotNull Boolean value) { this.isTemplate = value; }
};
