
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
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class IntegrationInstanceDto
{
    private @NotNull String id;
    private @NotNull String integrationShortId;
    private @NotNull String enabledBy;
    private @NotNull String createDate;
    private @NotNull String modifyDate;
    private @NotNull String projectId;
    private @NotNull String providerItemId;
    private @NotNull String providerItemName;

    /**
     * The unique identifier of this IntegrationInstance
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this IntegrationInstance
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * A short ID that uniquely identifies this IntegrationInstance
     *
     * @return The field integrationShortId
     */
    public @NotNull String getIntegrationShortId() { return this.integrationShortId; }
    /**
     * A short ID that uniquely identifies this IntegrationInstance
     *
     * @param value The new value for integrationShortId
     */
    public void setIntegrationShortId(@NotNull String value) { this.integrationShortId = value; }
    /**
     * The unique identifier of the user who enabled this IntegrationInstance
     *
     * @return The field enabledBy
     */
    public @NotNull String getEnabledBy() { return this.enabledBy; }
    /**
     * The unique identifier of the user who enabled this IntegrationInstance
     *
     * @param value The new value for enabledBy
     */
    public void setEnabledBy(@NotNull String value) { this.enabledBy = value; }
    /**
     * Timestamp when this record was created
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Timestamp when this record was created
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * Timestamp when this record was most recently modified
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * Timestamp when this record was most recently modified
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
    /**
     * The id of the project manager project this instance is related to
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * The id of the project manager project this instance is related to
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * The identifier in the integration provider, could be a reference to a file, task, project.
     *
     * @return The field providerItemId
     */
    public @NotNull String getProviderItemId() { return this.providerItemId; }
    /**
     * The identifier in the integration provider, could be a reference to a file, task, project.
     *
     * @param value The new value for providerItemId
     */
    public void setProviderItemId(@NotNull String value) { this.providerItemId = value; }
    /**
     * The name of the item in the integration provider.
     *
     * @return The field providerItemName
     */
    public @NotNull String getProviderItemName() { return this.providerItemName; }
    /**
     * The name of the item in the integration provider.
     *
     * @param value The new value for providerItemName
     */
    public void setProviderItemName(@NotNull String value) { this.providerItemName = value; }
};
