
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
 * Represents a single entitlement for the current Workspace.
 */
public class EntitlementDto
{
    private @NotNull String shortId;
    private @NotNull String name;
    private @NotNull String type;
    private @Nullable Boolean enabled;
    private @Nullable Double limit;

    /**
     * The unique identifier for this entitlement.
     *
     * @return The field shortId
     */
    public @NotNull String getShortId() { return this.shortId; }
    /**
     * The unique identifier for this entitlement.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * The human-readable name of the entitlement.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The human-readable name of the entitlement.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * Indicates whether this is a boolean toggle ("switch") or a numeric cap ("limit").
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * Indicates whether this is a boolean toggle ("switch") or a numeric cap ("limit").
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * For switch-type entitlements, indicates whether the feature is enabled.
     * Null for limit-type entitlements.
     *
     * @return The field enabled
     */
    public @Nullable Boolean getEnabled() { return this.enabled; }
    /**
     * For switch-type entitlements, indicates whether the feature is enabled.
     * Null for limit-type entitlements.
     *
     * @param value The new value for enabled
     */
    public void setEnabled(@Nullable Boolean value) { this.enabled = value; }
    /**
     * For limit-type entitlements, the numeric cap value.
     * Null for switch-type entitlements.
     *
     * @return The field limit
     */
    public @Nullable Double getLimit() { return this.limit; }
    /**
     * For limit-type entitlements, the numeric cap value.
     * Null for switch-type entitlements.
     *
     * @param value The new value for limit
     */
    public void setLimit(@Nullable Double value) { this.limit = value; }
};
