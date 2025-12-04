
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
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class IntegrationDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String description;
    private @NotNull String shortId;
    private @NotNull Boolean isMultiInstance;
    private @NotNull String[] licenseSkus;
    private @NotNull IntegrationInstanceDto[] instances;
    private @NotNull Boolean enabled;
    private @NotNull Boolean authenticated;
    private @NotNull Boolean autoEnabled;
    private @NotNull Boolean noAdminPermission;

    /**
     * The unique identifier of this Integration
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Integration
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The friendly name of this Integration
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The friendly name of this Integration
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * A description of this Integration that can be shared with users
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * A description of this Integration that can be shared with users
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
    /**
     * A short ID that uniquely identifies this Integration
     *
     * @return The field shortId
     */
    public @NotNull String getShortId() { return this.shortId; }
    /**
     * A short ID that uniquely identifies this Integration
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * True if this Integration allows multiple Instances.
     *
     * An example of a multi-Instance Integration is one that can be connected to many
     * different folders or channels within a remote application.
     *
     * @return The field isMultiInstance
     */
    public @NotNull Boolean getIsMultiInstance() { return this.isMultiInstance; }
    /**
     * True if this Integration allows multiple Instances.
     *
     * An example of a multi-Instance Integration is one that can be connected to many
     * different folders or channels within a remote application.
     *
     * @param value The new value for isMultiInstance
     */
    public void setIsMultiInstance(@NotNull Boolean value) { this.isMultiInstance = value; }
    /**
     * The list of SKUS for this Integration.
     *
     * @return The field licenseSkus
     */
    public @NotNull String[] getLicenseSkus() { return this.licenseSkus; }
    /**
     * The list of SKUS for this Integration.
     *
     * @param value The new value for licenseSkus
     */
    public void setLicenseSkus(@NotNull String[] value) { this.licenseSkus = value; }
    /**
     * For multi-Instance Integrations, this contains the list of IntegrationInstances.
     *
     * @return The field instances
     */
    public @NotNull IntegrationInstanceDto[] getInstances() { return this.instances; }
    /**
     * For multi-Instance Integrations, this contains the list of IntegrationInstances.
     *
     * @param value The new value for instances
     */
    public void setInstances(@NotNull IntegrationInstanceDto[] value) { this.instances = value; }
    /**
     * True if this Integration is enabled for the current Workspace.
     *
     * @return The field enabled
     */
    public @NotNull Boolean getEnabled() { return this.enabled; }
    /**
     * True if this Integration is enabled for the current Workspace.
     *
     * @param value The new value for enabled
     */
    public void setEnabled(@NotNull Boolean value) { this.enabled = value; }
    /**
     * True if the user has authenticated
     *
     * @return The field authenticated
     */
    public @NotNull Boolean getAuthenticated() { return this.authenticated; }
    /**
     * True if the user has authenticated
     *
     * @param value The new value for authenticated
     */
    public void setAuthenticated(@NotNull Boolean value) { this.authenticated = value; }
    /**
     * True if the integration is auto-enabled
     *
     * @return The field autoEnabled
     */
    public @NotNull Boolean getAutoEnabled() { return this.autoEnabled; }
    /**
     * True if the integration is auto-enabled
     *
     * @param value The new value for autoEnabled
     */
    public void setAutoEnabled(@NotNull Boolean value) { this.autoEnabled = value; }
    /**
     * No Admin Permission
     *
     * @return The field noAdminPermission
     */
    public @NotNull Boolean getNoAdminPermission() { return this.noAdminPermission; }
    /**
     * No Admin Permission
     *
     * @param value The new value for noAdminPermission
     */
    public void setNoAdminPermission(@NotNull Boolean value) { this.noAdminPermission = value; }
};
