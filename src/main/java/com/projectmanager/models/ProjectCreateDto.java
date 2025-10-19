
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
 *
 * Fields that cannot be selected during a CreateProject API call are not visible on this
 * data model.
 */
public class ProjectCreateDto
{
    private @NotNull String name;
    private @Nullable String description;
    private @Nullable String shortId;
    private @Nullable String shortName;
    private @Nullable String folderId;
    private @Nullable ProjectCreateAccessDto projectAccess;
    private @Nullable String customerId;
    private @Nullable String managerId;
    private @Nullable String chargeCodeId;
    private @Nullable String statusId;
    private @Nullable String priorityId;
    private @Nullable Double hourlyRate;
    private @Nullable Double budget;
    private @Nullable String statusUpdate;
    private @Nullable String templateId;
    private @Nullable Boolean template;
    private @Nullable String targetDate;
    private @Nullable Boolean favorite;
    private @Nullable Boolean updatePlannedWithActual;
    private @Nullable TaskStatusCreateDto[] taskStatusCreate;
    private @Nullable ProjectWorkingDaysDto workingDays;
    private @Nullable String externalReferenceId;
    private @Nullable Boolean weekStartsOnMonday;

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
     * Specify the shortId for this project. If left blank a shortId will be generated.
     *
     * A short identifier that uniquely identifies this Project within your Workspace
     * using a single letter followed by a number.  This code can be used for APIs
     * that accept Project unique identifiers.
     *
     * You can observe the short ID within the application by observing the URL of
     * the page you visit when you click on this project.  The page's URL will appear
     * in the form `https://pm.app.projectmanager.com/project/board/D16` - in this
     * example, the `ShortId` is `D16`.
     *
     * This id can only be set on creation, and can not be updated.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * Specify the shortId for this project. If left blank a shortId will be generated.
     *
     * A short identifier that uniquely identifies this Project within your Workspace
     * using a single letter followed by a number.  This code can be used for APIs
     * that accept Project unique identifiers.
     *
     * You can observe the short ID within the application by observing the URL of
     * the page you visit when you click on this project.  The page's URL will appear
     * in the form `https://pm.app.projectmanager.com/project/board/D16` - in this
     * example, the `ShortId` is `D16`.
     *
     * This id can only be set on creation, and can not be updated.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * An optional project short name. Up to 7 symbols
     *
     * @return The field shortName
     */
    public @Nullable String getShortName() { return this.shortName; }
    /**
     * An optional project short name. Up to 7 symbols
     *
     * @param value The new value for shortName
     */
    public void setShortName(@Nullable String value) { this.shortName = value; }
    /**
     * The unique identifier of the folder of this project, or null if not assigned.
     *
     * @return The field folderId
     */
    public @Nullable String getFolderId() { return this.folderId; }
    /**
     * The unique identifier of the folder of this project, or null if not assigned.
     *
     * @param value The new value for folderId
     */
    public void setFolderId(@Nullable String value) { this.folderId = value; }
    /**
     * If you wish to grant access to this Project to a selected list of people during creation,
     * provide a list of ProjectMembers here.  If you do not specify anyone, this Project will
     * be available to only yourself.
     *
     * @return The field projectAccess
     */
    public @Nullable ProjectCreateAccessDto getProjectAccess() { return this.projectAccess; }
    /**
     * If you wish to grant access to this Project to a selected list of people during creation,
     * provide a list of ProjectMembers here.  If you do not specify anyone, this Project will
     * be available to only yourself.
     *
     * @param value The new value for projectAccess
     */
    public void setProjectAccess(@Nullable ProjectCreateAccessDto value) { this.projectAccess = value; }
    /**
     * The unique identifier of the customer for this project, or null if not customer specific
     *
     * @return The field customerId
     */
    public @Nullable String getCustomerId() { return this.customerId; }
    /**
     * The unique identifier of the customer for this project, or null if not customer specific
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@Nullable String value) { this.customerId = value; }
    /**
     * The unique identifier of the manager of this project, or null if not assigned.
     *
     * @return The field managerId
     */
    public @Nullable String getManagerId() { return this.managerId; }
    /**
     * The unique identifier of the manager of this project, or null if not assigned.
     *
     * @param value The new value for managerId
     */
    public void setManagerId(@Nullable String value) { this.managerId = value; }
    /**
     * The unique identifier of the ChargeCode for this Project, if one has been selected.
     *
     * @return The field chargeCodeId
     */
    public @Nullable String getChargeCodeId() { return this.chargeCodeId; }
    /**
     * The unique identifier of the ChargeCode for this Project, if one has been selected.
     *
     * @param value The new value for chargeCodeId
     */
    public void setChargeCodeId(@Nullable String value) { this.chargeCodeId = value; }
    /**
     * The ProjectStatus chosen for this Project, if one has been selected.
     *
     * @return The field statusId
     */
    public @Nullable String getStatusId() { return this.statusId; }
    /**
     * The ProjectStatus chosen for this Project, if one has been selected.
     *
     * @param value The new value for statusId
     */
    public void setStatusId(@Nullable String value) { this.statusId = value; }
    /**
     * The ProjectPriority level of this Project, if one has been selected.
     *
     * @return The field priorityId
     */
    public @Nullable String getPriorityId() { return this.priorityId; }
    /**
     * The ProjectPriority level of this Project, if one has been selected.
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable String value) { this.priorityId = value; }
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
     * When creating a Project, you can optionally specify a Template to use to construct
     * the Project using a collection of pre-designed Tasks.
     *
     * Specifying a value in the TemplateId field will copy default settings for Tasks from
     * your template Project into the newly created Project.
     *
     * This field does not support custom templates.  You must choose from a list of
     * ProjectManager-supplied templates.
     *
     * @return The field templateId
     */
    public @Nullable String getTemplateId() { return this.templateId; }
    /**
     * When creating a Project, you can optionally specify a Template to use to construct
     * the Project using a collection of pre-designed Tasks.
     *
     * Specifying a value in the TemplateId field will copy default settings for Tasks from
     * your template Project into the newly created Project.
     *
     * This field does not support custom templates.  You must choose from a list of
     * ProjectManager-supplied templates.
     *
     * @param value The new value for templateId
     */
    public void setTemplateId(@Nullable String value) { this.templateId = value; }
    /**
     * True if this Project is a Template project. Template projects can be used as
     *
     * @return The field template
     */
    public @Nullable Boolean getTemplate() { return this.template; }
    /**
     * True if this Project is a Template project. Template projects can be used as
     *
     * @param value The new value for template
     */
    public void setTemplate(@Nullable Boolean value) { this.template = value; }
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
     * True if this Project is marked as favorite for current user
     *
     * @return The field favorite
     */
    public @Nullable Boolean getFavorite() { return this.favorite; }
    /**
     * True if this Project is marked as favorite for current user
     *
     * @param value The new value for favorite
     */
    public void setFavorite(@Nullable Boolean value) { this.favorite = value; }
    /**
     * True if allow actual dates to update planned dates
     *
     * @return The field updatePlannedWithActual
     */
    public @Nullable Boolean getUpdatePlannedWithActual() { return this.updatePlannedWithActual; }
    /**
     * True if allow actual dates to update planned dates
     *
     * @param value The new value for updatePlannedWithActual
     */
    public void setUpdatePlannedWithActual(@Nullable Boolean value) { this.updatePlannedWithActual = value; }
    /**
     * Create default task status upfront
     *
     * @return The field taskStatusCreate
     */
    public @Nullable TaskStatusCreateDto[] getTaskStatusCreate() { return this.taskStatusCreate; }
    /**
     * Create default task status upfront
     *
     * @param value The new value for taskStatusCreate
     */
    public void setTaskStatusCreate(@Nullable TaskStatusCreateDto[] value) { this.taskStatusCreate = value; }
    /**
     * Working days for the project. If not specified, the workspace working days will be used.
     * This value can be set when the project is created but may not be updated afterwards.
     *
     * @return The field workingDays
     */
    public @Nullable ProjectWorkingDaysDto getWorkingDays() { return this.workingDays; }
    /**
     * Working days for the project. If not specified, the workspace working days will be used.
     * This value can be set when the project is created but may not be updated afterwards.
     *
     * @param value The new value for workingDays
     */
    public void setWorkingDays(@Nullable ProjectWorkingDaysDto value) { this.workingDays = value; }
    /**
     * An optional external reference identifier for this Project.
     * This value can be used to link the Project to records in external systems,
     * such as ERP, CRM, or other integrations.
     *
     * @return The field externalReferenceId
     */
    public @Nullable String getExternalReferenceId() { return this.externalReferenceId; }
    /**
     * An optional external reference identifier for this Project.
     * This value can be used to link the Project to records in external systems,
     * such as ERP, CRM, or other integrations.
     *
     * @param value The new value for externalReferenceId
     */
    public void setExternalReferenceId(@Nullable String value) { this.externalReferenceId = value; }
    /**
     * Controls which day is considered the first day of the week for this project.
     * If not specified, this will be Sunday in the US and Monday everywhere else.
     * If true, the week starts on Monday. If false, the week starts on Sunday.
     *
     * @return The field weekStartsOnMonday
     */
    public @Nullable Boolean getWeekStartsOnMonday() { return this.weekStartsOnMonday; }
    /**
     * Controls which day is considered the first day of the week for this project.
     * If not specified, this will be Sunday in the US and Monday everywhere else.
     * If true, the week starts on Monday. If false, the week starts on Sunday.
     *
     * @param value The new value for weekStartsOnMonday
     */
    public void setWeekStartsOnMonday(@Nullable Boolean value) { this.weekStartsOnMonday = value; }
};
