
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
 * A Risk represents an item of potential impact or uncertainty.
 * It is visible to the creator and users assigned to manage or review it.
 *
 * Risks share many characteristics with tasks but are tracked independently
 * from project execution work.
 */
public class RiskDetailsDto
{
    private @NotNull String id;
    private @NotNull String projectId;
    private @NotNull String name;
    private @Nullable String dueDate;
    private @NotNull Integer percentComplete;
    private @Nullable Integer priority;
    private @Nullable Integer impact;
    private @Nullable Integer likelihood;
    private @Nullable Integer responseId;
    private @Nullable String resolution;
    private @Nullable String notes;
    private @NotNull String createDate;
    private @NotNull String modifyDate;
    private @NotNull Integer version;
    private @Nullable String shortId;
    private @NotNull Integer taskTypeId;
    private @NotNull RiskAssignmentDto[] assignments;
    private @NotNull TaskTagDto[] tags;
    private @NotNull TaskOwnerDto owner;
    private @Nullable Integer filesCount;
    private @Nullable Integer commentsCount;
    private @NotNull Integer riskTypeId;
    private @Nullable RiskProjectDto project;
    private @Nullable DiscussionDataDto discussionData;
    private @Nullable FileDataDto fileData;
    private @Nullable Boolean recurring;
    private @Nullable String recurringParentTaskId;
    private @Nullable RecurringTaskSettingsDto recurringSettings;

    /**
     * The unique identifier of this risk.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this risk.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the Project to which this Task belongs.
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The unique identifier of the Project to which this Task belongs.
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
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
     * The date when work on this risk is expected to complete.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * @return The field dueDate
     */
    public @Nullable String getDueDate() { return this.dueDate; }
    /**
     * The date when work on this risk is expected to complete.
     *
     * This value contains only the date in year-month-day format.  For display, this
     * date will always be shown as this same year-month-day regardless of time zone.
     * For reporting purposes, this date is calculated against the official time zone
     * of the Workspace.
     *
     * @param value The new value for dueDate
     */
    public void setDueDate(@Nullable String value) { this.dueDate = value; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this risk.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * @return The field percentComplete
     */
    public @NotNull Integer getPercentComplete() { return this.percentComplete; }
    /**
     * The numerical percentage, from 0-100, representing the percentage completion
     * for this risk.  Any numbers below zero or above 100 will be clamped to the
     * minimum or maximum value.
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@NotNull Integer value) { this.percentComplete = value; }
    /**
     * Indicates the level of importance assigned to a risk, with 500 being standard priority; the higher the number, the higher the priority.
     *
     * @return The field priority
     */
    public @Nullable Integer getPriority() { return this.priority; }
    /**
     * Indicates the level of importance assigned to a risk, with 500 being standard priority; the higher the number, the higher the priority.
     *
     * @param value The new value for priority
     */
    public void setPriority(@Nullable Integer value) { this.priority = value; }
    /**
     * The potential effect of the risk.
     *
     * @return The field impact
     */
    public @Nullable Integer getImpact() { return this.impact; }
    /**
     * The potential effect of the risk.
     *
     * @param value The new value for impact
     */
    public void setImpact(@Nullable Integer value) { this.impact = value; }
    /**
     * Probability or chance of the risk occurring.
     *
     * @return The field likelihood
     */
    public @Nullable Integer getLikelihood() { return this.likelihood; }
    /**
     * Probability or chance of the risk occurring.
     *
     * @param value The new value for likelihood
     */
    public void setLikelihood(@Nullable Integer value) { this.likelihood = value; }
    /**
     * The planned or implemented response to address the identified risk.
     * Avoid, Mitigate, Transfer, Accept
     *
     * @return The field responseId
     */
    public @Nullable Integer getResponseId() { return this.responseId; }
    /**
     * The planned or implemented response to address the identified risk.
     * Avoid, Mitigate, Transfer, Accept
     *
     * @param value The new value for responseId
     */
    public void setResponseId(@Nullable Integer value) { this.responseId = value; }
    /**
     * The actions or strategy planned or taken to mitigate or eliminate the risk.
     *
     * @return The field resolution
     */
    public @Nullable String getResolution() { return this.resolution; }
    /**
     * The actions or strategy planned or taken to mitigate or eliminate the risk.
     *
     * @param value The new value for resolution
     */
    public void setResolution(@Nullable String value) { this.resolution = value; }
    /**
     * Any additional comments, observations, or details related to the risk.
     *
     * @return The field notes
     */
    public @Nullable String getNotes() { return this.notes; }
    /**
     * Any additional comments, observations, or details related to the risk.
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable String value) { this.notes = value; }
    /**
     * The timestamp in UTC when this risk was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when this risk was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The timestamp in UTC when this risk was most recently modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when this risk was most recently modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The risk version.
     *
     * @return The field version
     */
    public @NotNull Integer getVersion() { return this.version; }
    /**
     * The risk version.
     *
     * @param value The new value for version
     */
    public void setVersion(@NotNull Integer value) { this.version = value; }
    /**
     * A short ID that can be used to refer to this risk. This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * A short ID that can be used to refer to this risk. This short ID is
     * guaranteed to be unique within your Workspace.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * Risk has a taskTypeId of 31
     *
     * @return The field taskTypeId
     */
    public @NotNull Integer getTaskTypeId() { return this.taskTypeId; }
    /**
     * Risk has a taskTypeId of 31
     *
     * @param value The new value for taskTypeId
     */
    public void setTaskTypeId(@NotNull Integer value) { this.taskTypeId = value; }
    /**
     * Users assigned to the risk.
     *
     * @return The field assignments
     */
    public @NotNull RiskAssignmentDto[] getAssignments() { return this.assignments; }
    /**
     * Users assigned to the risk.
     *
     * @param value The new value for assignments
     */
    public void setAssignments(@NotNull RiskAssignmentDto[] value) { this.assignments = value; }
    /**
     * Tags applied to the risk.
     *
     * @return The field tags
     */
    public @NotNull TaskTagDto[] getTags() { return this.tags; }
    /**
     * Tags applied to the risk.
     *
     * @param value The new value for tags
     */
    public void setTags(@NotNull TaskTagDto[] value) { this.tags = value; }
    /**
     * The user which created the risk.
     *
     * @return The field owner
     */
    public @NotNull TaskOwnerDto getOwner() { return this.owner; }
    /**
     * The user which created the risk.
     *
     * @param value The new value for owner
     */
    public void setOwner(@NotNull TaskOwnerDto value) { this.owner = value; }
    /**
     * The number of files attached to the risk.
     *
     * @return The field filesCount
     */
    public @Nullable Integer getFilesCount() { return this.filesCount; }
    /**
     * The number of files attached to the risk.
     *
     * @param value The new value for filesCount
     */
    public void setFilesCount(@Nullable Integer value) { this.filesCount = value; }
    /**
     * The number of comments added to the risk.
     *
     * @return The field commentsCount
     */
    public @Nullable Integer getCommentsCount() { return this.commentsCount; }
    /**
     * The number of comments added to the risk.
     *
     * @param value The new value for commentsCount
     */
    public void setCommentsCount(@Nullable Integer value) { this.commentsCount = value; }
    /**
     * The id of the Risk Type
     * Risk = 1
     * Assumption = 2
     * Issue = 3
     * Dependency = 4
     * Change = 5
     *
     * @return The field riskTypeId
     */
    public @NotNull Integer getRiskTypeId() { return this.riskTypeId; }
    /**
     * The id of the Risk Type
     * Risk = 1
     * Assumption = 2
     * Issue = 3
     * Dependency = 4
     * Change = 5
     *
     * @param value The new value for riskTypeId
     */
    public void setRiskTypeId(@NotNull Integer value) { this.riskTypeId = value; }
    /**
     * The Project to which this Risk belongs.
     *
     * @return The field project
     */
    public @Nullable RiskProjectDto getProject() { return this.project; }
    /**
     * The Project to which this Risk belongs.
     *
     * @param value The new value for project
     */
    public void setProject(@Nullable RiskProjectDto value) { this.project = value; }
    /**
     * Discussion data – number of comments, last read time
     *
     * @return The field discussionData
     */
    public @Nullable DiscussionDataDto getDiscussionData() { return this.discussionData; }
    /**
     * Discussion data – number of comments, last read time
     *
     * @param value The new value for discussionData
     */
    public void setDiscussionData(@Nullable DiscussionDataDto value) { this.discussionData = value; }
    /**
     * File data – number of files, last read time
     *
     * @return The field fileData
     */
    public @Nullable FileDataDto getFileData() { return this.fileData; }
    /**
     * File data – number of files, last read time
     *
     * @param value The new value for fileData
     */
    public void setFileData(@Nullable FileDataDto value) { this.fileData = value; }
    /**
     * Indicates whether this risk is recurring
     *
     * @return The field recurring
     */
    public @Nullable Boolean getRecurring() { return this.recurring; }
    /**
     * Indicates whether this risk is recurring
     *
     * @param value The new value for recurring
     */
    public void setRecurring(@Nullable Boolean value) { this.recurring = value; }
    /**
     * The parent risk in a recurring risk sequence
     *
     * @return The field recurringParentTaskId
     */
    public @Nullable String getRecurringParentTaskId() { return this.recurringParentTaskId; }
    /**
     * The parent risk in a recurring risk sequence
     *
     * @param value The new value for recurringParentTaskId
     */
    public void setRecurringParentTaskId(@Nullable String value) { this.recurringParentTaskId = value; }
    /**
     * Recurring risk configuration
     *
     * @return The field recurringSettings
     */
    public @Nullable RecurringTaskSettingsDto getRecurringSettings() { return this.recurringSettings; }
    /**
     * Recurring risk configuration
     *
     * @param value The new value for recurringSettings
     */
    public void setRecurringSettings(@Nullable RecurringTaskSettingsDto value) { this.recurringSettings = value; }
};
