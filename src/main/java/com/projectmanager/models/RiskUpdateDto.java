
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
 * Risks share many characteristics with tasks but are tracked independently
 * of project execution work.
 */
public class RiskUpdateDto
{
    private @Nullable String name;
    private @Nullable String dueDate;
    private @Nullable Integer percentComplete;
    private @Nullable Integer priority;
    private @Nullable Integer impact;
    private @Nullable Integer likelihood;
    private @Nullable Integer responseId;
    private @Nullable String resolution;
    private @Nullable String description;
    private @Nullable String[] assignees;
    private @Nullable String[] tagIds;
    private @Nullable Integer riskTypeId;

    /**
     * The common name of this Risk.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this Risk.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The date when this risk is expected to be resolved.
     *
     * @return The field dueDate
     */
    public @Nullable String getDueDate() { return this.dueDate; }
    /**
     * The date when this risk is expected to be resolved.
     *
     * @param value The new value for dueDate
     */
    public void setDueDate(@Nullable String value) { this.dueDate = value; }
    /**
     * Percentage completion (0–100).
     *
     * @return The field percentComplete
     */
    public @Nullable Integer getPercentComplete() { return this.percentComplete; }
    /**
     * Percentage completion (0–100).
     *
     * @param value The new value for percentComplete
     */
    public void setPercentComplete(@Nullable Integer value) { this.percentComplete = value; }
    /**
     * Priority of the risk.
     *
     * @return The field priority
     */
    public @Nullable Integer getPriority() { return this.priority; }
    /**
     * Priority of the risk.
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
     * Probability of the risk occurring.
     *
     * @return The field likelihood
     */
    public @Nullable Integer getLikelihood() { return this.likelihood; }
    /**
     * Probability of the risk occurring.
     *
     * @param value The new value for likelihood
     */
    public void setLikelihood(@Nullable Integer value) { this.likelihood = value; }
    /**
     * Planned or implemented response.
     * Avoid it, Mitigate, Transfer, Accept
     *
     * @return The field responseId
     */
    public @Nullable Integer getResponseId() { return this.responseId; }
    /**
     * Planned or implemented response.
     * Avoid it, Mitigate, Transfer, Accept
     *
     * @param value The new value for responseId
     */
    public void setResponseId(@Nullable Integer value) { this.responseId = value; }
    /**
     * Actions taken or planned to address the risk.
     *
     * @return The field resolution
     */
    public @Nullable String getResolution() { return this.resolution; }
    /**
     * Actions taken or planned to address the risk.
     *
     * @param value The new value for resolution
     */
    public void setResolution(@Nullable String value) { this.resolution = value; }
    /**
     * Additional comments or observations.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * Additional comments or observations.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * Users assigned to the risk.
     * Replaces existing assignments when provided.
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * Users assigned to the risk.
     * Replaces existing assignments when provided.
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
    /**
     * Tags applied to the risk.
     * Replaces existing tags when provided.
     *
     * @return The field tagIds
     */
    public @Nullable String[] getTagIds() { return this.tagIds; }
    /**
     * Tags applied to the risk.
     * Replaces existing tags when provided.
     *
     * @param value The new value for tagIds
     */
    public void setTagIds(@Nullable String[] value) { this.tagIds = value; }
    /**
     * The type of risk.
     * Risk = 1
     * Assumption = 2
     * Issue = 3
     * Dependency = 4
     * Change = 5
     *
     * @return The field riskTypeId
     */
    public @Nullable Integer getRiskTypeId() { return this.riskTypeId; }
    /**
     * The type of risk.
     * Risk = 1
     * Assumption = 2
     * Issue = 3
     * Dependency = 4
     * Change = 5
     *
     * @param value The new value for riskTypeId
     */
    public void setRiskTypeId(@Nullable Integer value) { this.riskTypeId = value; }
};
