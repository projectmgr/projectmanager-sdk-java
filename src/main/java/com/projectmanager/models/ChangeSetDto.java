
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The project task change set
 */
public class ChangeSetDto
{
    private @NotNull Integer projectChangeSetId;
    private @NotNull String id;
    private @NotNull String projectId;
    private @Nullable Integer version;
    private @NotNull String createBy;
    private @NotNull String createDate;
    private @Nullable String actions;
    private @Nullable String changeSets;
    private @Nullable String processDate;
    private @Nullable Boolean success;
    private @Nullable String exception;
    private @Nullable String clientId;
    private @Nullable String jsonData;
    private @NotNull Boolean isUndo;
    private @NotNull Integer state;
    private @NotNull String businessId;

    /**
     * Project Changeset ID
     *
     * @return The field projectChangeSetId
     */
    public @NotNull Integer getProjectChangeSetId() { return this.projectChangeSetId; }
    /**
     * Project Changeset ID
     *
     * @param value The new value for projectChangeSetId
     */
    public void setProjectChangeSetId(@NotNull Integer value) { this.projectChangeSetId = value; }
    /**
     * The unique identifier of this Changeset
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Changeset
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Project ID
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * Project ID
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * Task version
     *
     * @return The field version
     */
    public @Nullable Integer getVersion() { return this.version; }
    /**
     * Task version
     *
     * @param value The new value for version
     */
    public void setVersion(@Nullable Integer value) { this.version = value; }
    /**
     * Created by GUID
     *
     * @return The field createBy
     */
    public @NotNull String getCreateBy() { return this.createBy; }
    /**
     * Created by GUID
     *
     * @param value The new value for createBy
     */
    public void setCreateBy(@NotNull String value) { this.createBy = value; }
    /**
     * Created date
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Created date
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * Change set action
     *
     * @return The field actions
     */
    public @Nullable String getActions() { return this.actions; }
    /**
     * Change set action
     *
     * @param value The new value for actions
     */
    public void setActions(@Nullable String value) { this.actions = value; }
    /**
     * Change set in json string
     *
     * @return The field changeSets
     */
    public @Nullable String getChangeSets() { return this.changeSets; }
    /**
     * Change set in json string
     *
     * @param value The new value for changeSets
     */
    public void setChangeSets(@Nullable String value) { this.changeSets = value; }
    /**
     * Processed date
     *
     * @return The field processDate
     */
    public @Nullable String getProcessDate() { return this.processDate; }
    /**
     * Processed date
     *
     * @param value The new value for processDate
     */
    public void setProcessDate(@Nullable String value) { this.processDate = value; }
    /**
     * If process was successful
     *
     * @return The field success
     */
    public @Nullable Boolean getSuccess() { return this.success; }
    /**
     * If process was successful
     *
     * @param value The new value for success
     */
    public void setSuccess(@Nullable Boolean value) { this.success = value; }
    /**
     * Error message
     *
     * @return The field exception
     */
    public @Nullable String getException() { return this.exception; }
    /**
     * Error message
     *
     * @param value The new value for exception
     */
    public void setException(@Nullable String value) { this.exception = value; }
    /**
     * UI ID
     *
     * @return The field clientId
     */
    public @Nullable String getClientId() { return this.clientId; }
    /**
     * UI ID
     *
     * @param value The new value for clientId
     */
    public void setClientId(@Nullable String value) { this.clientId = value; }
    /**
     * Changeset JSON data
     *
     * @return The field jsonData
     */
    public @Nullable String getJsonData() { return this.jsonData; }
    /**
     * Changeset JSON data
     *
     * @param value The new value for jsonData
     */
    public void setJsonData(@Nullable String value) { this.jsonData = value; }
    /**
     * Is change set from UNDO
     *
     * @return The field isUndo
     */
    public @NotNull Boolean getIsUndo() { return this.isUndo; }
    /**
     * Is change set from UNDO
     *
     * @param value The new value for isUndo
     */
    public void setIsUndo(@NotNull Boolean value) { this.isUndo = value; }
    /**
     * The state of the changeset
     *
     * @return The field state
     */
    public @NotNull Integer getState() { return this.state; }
    /**
     * The state of the changeset
     *
     * @param value The new value for state
     */
    public void setState(@NotNull Integer value) { this.state = value; }
    /**
     * Business ID
     *
     * @return The field businessId
     */
    public @NotNull String getBusinessId() { return this.businessId; }
    /**
     * Business ID
     *
     * @param value The new value for businessId
     */
    public void setBusinessId(@NotNull String value) { this.businessId = value; }
};
