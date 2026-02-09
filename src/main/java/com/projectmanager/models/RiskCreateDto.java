
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
 * Represents the data required to create a new Risk within a Project.
 *
 * A Risk identifies a potential issue or uncertainty that may impact
 * project outcomes. This DTO captures descriptive information,
 * risk assessment metrics (such as impact and likelihood),
 * and optional ownership via assignees.
 */
public class RiskCreateDto
{
    private @NotNull String name;
    private @Nullable String description;
    private @NotNull Integer percentComplete;
    private @Nullable Integer priority;
    private @Nullable Integer impact;
    private @Nullable Integer likelihood;
    private @Nullable Integer responseId;
    private @Nullable String resolution;
    private @Nullable String[] assignees;

    /**
     * The common name of this Risk.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The common name of this Risk.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * A description of the work to be performed in this Risk.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A description of the work to be performed in this Risk.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
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
     * A list of unique identifiers of Assignees to be assigned to this Risk
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * A list of unique identifiers of Assignees to be assigned to this Risk
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
};
