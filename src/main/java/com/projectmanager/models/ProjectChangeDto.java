
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
 * The specific change action made against a project
 */
public class ProjectChangeDto
{
    private @NotNull String id;
    private @NotNull String businessId;
    private @NotNull String projectId;
    private @NotNull Integer version;
    private @NotNull String createBy;
    private @NotNull String createDate;
    private @Nullable String processDate;
    private @NotNull Integer status;
    private @Nullable Object changeData;

    /**
     * Project Change ID
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Project Change ID
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Workspace ID
     *
     * @return The field businessId
     */
    public @NotNull String getBusinessId() { return this.businessId; }
    /**
     * Workspace ID
     *
     * @param value The new value for businessId
     */
    public void setBusinessId(@NotNull String value) { this.businessId = value; }
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
     * Version of this Project Change
     *
     * @return The field version
     */
    public @NotNull Integer getVersion() { return this.version; }
    /**
     * Version of this Project Change
     *
     * @param value The new value for version
     */
    public void setVersion(@NotNull Integer value) { this.version = value; }
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
     * The status of the Project Change
     *
     * @return The field status
     */
    public @NotNull Integer getStatus() { return this.status; }
    /**
     * The status of the Project Change
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull Integer value) { this.status = value; }
    /**
     * Project Change as JSON data
     *
     * @return The field changeData
     */
    public @Nullable Object getChangeData() { return this.changeData; }
    /**
     * Project Change as JSON data
     *
     * @param value The new value for changeData
     */
    public void setChangeData(@Nullable Object value) { this.changeData = value; }
};
