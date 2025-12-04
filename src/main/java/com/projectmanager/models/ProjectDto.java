
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
public class ProjectDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull String shortCode;
    private @NotNull String shortId;
    private @Nullable ProjectFolderDto folder;
    private @NotNull ProjectStatusDto status;
    private @Nullable String startDate;
    private @Nullable String endDate;
    private @Nullable String targetDate;
    private @Nullable String plannedStartDate;
    private @Nullable String plannedFinishDate;
    private @Nullable String actualStartDate;
    private @Nullable String actualFinishDate;
    private @NotNull ProjectPriorityDto priority;
    private @Nullable ProjectChargeCodeDto chargeCode;
    private @Nullable ProjectManagerDto manager;
    private @Nullable ProjectCustomerDto customer;
    private @Nullable Double budget;
    private @Nullable Double hourlyRate;
    private @Nullable String statusUpdate;
    private @NotNull String modifyDate;
    private @NotNull String createDate;
    private @NotNull Boolean isTemplate;
    private @NotNull Boolean favorite;
    private @Nullable String creationTemplateId;
    private @Nullable ProjectMemberDto[] members;
    private @Nullable ProjectFieldValueDto[] fieldValues;
    private @Nullable ProjectFileDto[] files;
    private @Nullable Integer percentComplete;
    private @NotNull Boolean updatePlannedWithActual;
    private @Nullable String externalReferenceId;
    private @Nullable String ownerId;
    private @NotNull ProjectWorkingDaysDto workingDays;

    /**
     * The unique identifier of the Project.  This value is set by the system and cannot
     * be set with a CreateProject or changed with an UpdateProject call.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Project.  This value is set by the system and cannot
     * be set with a CreateProject or changed with an UpdateProject call.
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
     * This code is assigned on creation and cannot be changed.
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
     * This code is assigned on creation and cannot be changed.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * If this Project is grouped within a ProjectFolder, this contains the ProjectFolder information.
     *
     * @return The field folder
     */
    public @Nullable ProjectFolderDto getFolder() { return this.folder; }
    /**
     * If this Project is grouped within a ProjectFolder, this contains the ProjectFolder information.
     *
     * @param value The new value for folder
     */
    public void setFolder(@Nullable ProjectFolderDto value) { this.folder = value; }
    /**
     * The ProjectStatus chosen for this Project.
     *
     * @return The field status
     */
    public @NotNull ProjectStatusDto getStatus() { return this.status; }
    /**
     * The ProjectStatus chosen for this Project.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull ProjectStatusDto value) { this.status = value; }
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
     * A calculated field of the estimated date on which this Project is
     * expected to start.
     *
     * This date is calculated based on the earliest estimated start date for
     * a Task within this Project. This value is null if no Tasks have an
     * estimated start date within this Project.
     *
     * @return The field plannedStartDate
     */
    public @Nullable String getPlannedStartDate() { return this.plannedStartDate; }
    /**
     * A calculated field of the estimated date on which this Project is
     * expected to start.
     *
     * This date is calculated based on the earliest estimated start date for
     * a Task within this Project. This value is null if no Tasks have an
     * estimated start date within this Project.
     *
     * @param value The new value for plannedStartDate
     */
    public void setPlannedStartDate(@Nullable String value) { this.plannedStartDate = value; }
    /**
     * A calculated field of the estimated date on which this Project is
     * expected to finish.
     *
     * This date is calculated based on the latest planned finish date for a
     * Task within this Project. This value is null if no Tasks have an
     * estimated finish date within this Project.
     *
     * @return The field plannedFinishDate
     */
    public @Nullable String getPlannedFinishDate() { return this.plannedFinishDate; }
    /**
     * A calculated field of the estimated date on which this Project is
     * expected to finish.
     *
     * This date is calculated based on the latest planned finish date for a
     * Task within this Project. This value is null if no Tasks have an
     * estimated finish date within this Project.
     *
     * @param value The new value for plannedFinishDate
     */
    public void setPlannedFinishDate(@Nullable String value) { this.plannedFinishDate = value; }
    /**
     * A calculated field of the actual date on which this Project started.
     *
     * This date is calculated based on the earliest actual start date for a
     * Task within this Project. This value is null if no Tasks have an actual
     * start date within this Project.
     *
     * @return The field actualStartDate
     */
    public @Nullable String getActualStartDate() { return this.actualStartDate; }
    /**
     * A calculated field of the actual date on which this Project started.
     *
     * This date is calculated based on the earliest actual start date for a
     * Task within this Project. This value is null if no Tasks have an actual
     * start date within this Project.
     *
     * @param value The new value for actualStartDate
     */
    public void setActualStartDate(@Nullable String value) { this.actualStartDate = value; }
    /**
     * A calculated field of the actual date on which this Project finished.
     *
     *  This date is calculated based on the latest actual finish date for a
     *  Task within this Project. This value is null if no Tasks have an
     *  actual finish date within this Project.
     *
     * @return The field actualFinishDate
     */
    public @Nullable String getActualFinishDate() { return this.actualFinishDate; }
    /**
     * A calculated field of the actual date on which this Project finished.
     *
     *  This date is calculated based on the latest actual finish date for a
     *  Task within this Project. This value is null if no Tasks have an
     *  actual finish date within this Project.
     *
     * @param value The new value for actualFinishDate
     */
    public void setActualFinishDate(@Nullable String value) { this.actualFinishDate = value; }
    /**
     * The ProjectPriority level of this Project, if defined.
     *
     * @return The field priority
     */
    public @NotNull ProjectPriorityDto getPriority() { return this.priority; }
    /**
     * The ProjectPriority level of this Project, if defined.
     *
     * @param value The new value for priority
     */
    public void setPriority(@NotNull ProjectPriorityDto value) { this.priority = value; }
    /**
     * The ChargeCode of this Project, if defined.
     *
     * @return The field chargeCode
     */
    public @Nullable ProjectChargeCodeDto getChargeCode() { return this.chargeCode; }
    /**
     * The ChargeCode of this Project, if defined.
     *
     * @param value The new value for chargeCode
     */
    public void setChargeCode(@Nullable ProjectChargeCodeDto value) { this.chargeCode = value; }
    /**
     * Information about the manager of this project, if one has been assigned.
     *
     * @return The field manager
     */
    public @Nullable ProjectManagerDto getManager() { return this.manager; }
    /**
     * Information about the manager of this project, if one has been assigned.
     *
     * @param value The new value for manager
     */
    public void setManager(@Nullable ProjectManagerDto value) { this.manager = value; }
    /**
     * Information about the manager of this project, if one has been specified.
     *
     * @return The field customer
     */
    public @Nullable ProjectCustomerDto getCustomer() { return this.customer; }
    /**
     * Information about the manager of this project, if one has been specified.
     *
     * @param value The new value for customer
     */
    public void setCustomer(@Nullable ProjectCustomerDto value) { this.customer = value; }
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
     * This field is automatically determined by the system when this Project is modified
     * and cannot be directly changed by the user.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when the Project was most recently modified.
     *
     * This field is automatically determined by the system when this Project is modified
     * and cannot be directly changed by the user.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The timestamp in UTC when the Project was created.
     *
     * This field is automatically determined by the system when this Project is created
     * and cannot be changed by the user.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when the Project was created.
     *
     * This field is automatically determined by the system when this Project is created
     * and cannot be changed by the user.
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
    /**
     * True if this Project is marked as favorite for current user
     *
     * @return The field favorite
     */
    public @NotNull Boolean getFavorite() { return this.favorite; }
    /**
     * True if this Project is marked as favorite for current user
     *
     * @param value The new value for favorite
     */
    public void setFavorite(@NotNull Boolean value) { this.favorite = value; }
    /**
     * The TemplateId that this project was created from.
     * Will be null if no template was selected at project creation.
     *
     * @return The field creationTemplateId
     */
    public @Nullable String getCreationTemplateId() { return this.creationTemplateId; }
    /**
     * The TemplateId that this project was created from.
     * Will be null if no template was selected at project creation.
     *
     * @param value The new value for creationTemplateId
     */
    public void setCreationTemplateId(@Nullable String value) { this.creationTemplateId = value; }
    /**
     * The members of the project
     *
     * @return The field members
     */
    public @Nullable ProjectMemberDto[] getMembers() { return this.members; }
    /**
     * The members of the project
     *
     * @param value The new value for members
     */
    public void setMembers(@Nullable ProjectMemberDto[] value) { this.members = value; }
    /**
     * Project fields array with values
     *
     * @return The field fieldValues
     */
    public @Nullable ProjectFieldValueDto[] getFieldValues() { return this.fieldValues; }
    /**
     * Project fields array with values
     *
     * @param value The new value for fieldValues
     */
    public void setFieldValues(@Nullable ProjectFieldValueDto[] value) { this.fieldValues = value; }
    /**
     * The list of files associated with this Project, if any.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @return The field files
     */
    public @Nullable ProjectFileDto[] getFiles() { return this.files; }
    /**
     * The list of files associated with this Project, if any.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @param value The new value for files
     */
    public void setFiles(@Nullable ProjectFileDto[] value) { this.files = value; }
    /**
     * The percentage of the project tasks completed
     *
     * @return The field percentComplete
     */
    public @Nullable Integer getPercentComplete() { return this.percentComplete; }
    /**
     * The percentage of the project tasks completed
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@Nullable Integer value) { this.percentComplete = value; }
    /**
     * True if allow actual dates to update planned dates
     *
     * @return The field updatePlannedWithActual
     */
    public @NotNull Boolean getUpdatePlannedWithActual() { return this.updatePlannedWithActual; }
    /**
     * True if allow actual dates to update planned dates
     *
     * @param value The new value for updatePlannedWithActual
     */
    public void setUpdatePlannedWithActual(@NotNull Boolean value) { this.updatePlannedWithActual = value; }
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
     * Represents the unique identifier of the owner associated with the Project.
     * This may be used to identify the user or entity responsible for the Project.
     *
     * @return The field ownerId
     */
    public @Nullable String getOwnerId() { return this.ownerId; }
    /**
     * Represents the unique identifier of the owner associated with the Project.
     * This may be used to identify the user or entity responsible for the Project.
     *
     * @param value The new value for ownerId
     */
    public void setOwnerId(@Nullable String value) { this.ownerId = value; }
    /**
     * Represents the configuration of working days for the project, indicating which days of the week
     * are considered as working days.
     * This allows for customization of scheduling and availability based on the project's requirements.
     *
     * @return The field workingDays
     */
    public @NotNull ProjectWorkingDaysDto getWorkingDays() { return this.workingDays; }
    /**
     * Represents the configuration of working days for the project, indicating which days of the week
     * are considered as working days.
     * This allows for customization of scheduling and availability based on the project's requirements.
     *
     * @param value The new value for workingDays
     */
    public void setWorkingDays(@NotNull ProjectWorkingDaysDto value) { this.workingDays = value; }
};
