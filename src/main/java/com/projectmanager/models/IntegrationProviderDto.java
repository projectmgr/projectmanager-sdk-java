
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class IntegrationProviderDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String shortId;
    private @Nullable String summary;
    private @Nullable String description;
    private @Nullable String[] licenseSkus;
    private @Nullable String[] categoryShortIds;
    private @NotNull Boolean activated;
    private @NotNull Boolean authenticated;
    private @Nullable IntegrationDto[] integrations;
    private @Nullable IntegrationAuthSetupDto authSetup;

    /**
     * The unique identifier of this Provider.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Provider.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The friendly name of this Provider.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The friendly name of this Provider.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A short ID that uniquely identifies this Provider.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * A short ID that uniquely identifies this Provider.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * A short summary of this Provider and their service.
     *
     * @return The field summary
     */
    public @Nullable String getSummary() { return this.summary; }
    /**
     * A short summary of this Provider and their service.
     *
     * @param value The new value for summary
     */
    public void setSummary(@Nullable String value) { this.summary = value; }
    /**
     * A longer description of this Provider and their service.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A longer description of this Provider and their service.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * A list of available license SKUs for this Provider.
     *
     * @return The field licenseSkus
     */
    public @Nullable String[] getLicenseSkus() { return this.licenseSkus; }
    /**
     * A list of available license SKUs for this Provider.
     *
     * @param value The new value for licenseSkus
     */
    public void setLicenseSkus(@Nullable String[] value) { this.licenseSkus = value; }
    /**
     * A list of category IDs that this Provider exists within.
     *
     * @return The field categoryShortIds
     */
    public @Nullable String[] getCategoryShortIds() { return this.categoryShortIds; }
    /**
     * A list of category IDs that this Provider exists within.
     *
     * @param value The new value for categoryShortIds
     */
    public void setCategoryShortIds(@Nullable String[] value) { this.categoryShortIds = value; }
    /**
     * True if this Provider is available for use.
     *
     * @return The field activated
     */
    public @NotNull Boolean getActivated() { return this.activated; }
    /**
     * True if this Provider is available for use.
     *
     * @param value The new value for activated
     */
    public void setActivated(@NotNull Boolean value) { this.activated = value; }
    /**
     * True if this Provider requires authentication.
     *
     * @return The field authenticated
     */
    public @NotNull Boolean getAuthenticated() { return this.authenticated; }
    /**
     * True if this Provider requires authentication.
     *
     * @param value The new value for authenticated
     */
    public void setAuthenticated(@NotNull Boolean value) { this.authenticated = value; }
    /**
     * The list of available Integrations for this Provider.
     *
     * @return The field integrations
     */
    public @Nullable IntegrationDto[] getIntegrations() { return this.integrations; }
    /**
     * The list of available Integrations for this Provider.
     *
     * @param value The new value for integrations
     */
    public void setIntegrations(@Nullable IntegrationDto[] value) { this.integrations = value; }
    /**
     * The list of available AuthSetup for this Provider.
     *
     * @return The field authSetup
     */
    public @Nullable IntegrationAuthSetupDto getAuthSetup() { return this.authSetup; }
    /**
     * The list of available AuthSetup for this Provider.
     *
     * @param value The new value for authSetup
     */
    public void setAuthSetup(@Nullable IntegrationAuthSetupDto value) { this.authSetup = value; }
};
