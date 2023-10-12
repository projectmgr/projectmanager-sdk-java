
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class IntegrationInstanceDto
{
    private @NotNull String id;
    private @Nullable String integrationShortId;
    private @Nullable Object config;
    private @NotNull String enabledBy;
    private @NotNull String createDate;
    private @NotNull String modifyDate;

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
    public @Nullable String getIntegrationShortId() { return this.integrationShortId; }
    /**
     * A short ID that uniquely identifies this IntegrationInstance
     *
     * @param value The new value for integrationShortId
     */
    public void setIntegrationShortId(@Nullable String value) { this.integrationShortId = value; }
    /**
     * Metadata for this IntegrationInstance
     *
     * @return The field config
     */
    public @Nullable Object getConfig() { return this.config; }
    /**
     * Metadata for this IntegrationInstance
     *
     * @param value The new value for config
     */
    public void setConfig(@Nullable Object value) { this.config = value; }
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
};
