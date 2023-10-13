
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
 * A License represents a subscription to a particular product or bundle of products
 * within ProjectManager.
 */
public class LicenseDto
{
    private @NotNull String id;
    private @Nullable String licenseSku;
    private @Nullable String bundleSku;
    private @NotNull Boolean optional;

    /**
     * The unique identifier of this License.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this License.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The SKU code of this License, used for billing purposes.
     *
     * @return The field licenseSku
     */
    public @Nullable String getLicenseSku() { return this.licenseSku; }
    /**
     * The SKU code of this License, used for billing purposes.
     *
     * @param value The new value for licenseSku
     */
    public void setLicenseSku(@Nullable String value) { this.licenseSku = value; }
    /**
     * The SKU code of the bundle of this License, used for billing purposes.
     *
     * @return The field bundleSku
     */
    public @Nullable String getBundleSku() { return this.bundleSku; }
    /**
     * The SKU code of the bundle of this License, used for billing purposes.
     *
     * @param value The new value for bundleSku
     */
    public void setBundleSku(@Nullable String value) { this.bundleSku = value; }
    /**
     * True if this license is optional.
     *
     * @return The field optional
     */
    public @NotNull Boolean getOptional() { return this.optional; }
    /**
     * True if this license is optional.
     *
     * @param value The new value for optional
     */
    public void setOptional(@NotNull Boolean value) { this.optional = value; }
};
