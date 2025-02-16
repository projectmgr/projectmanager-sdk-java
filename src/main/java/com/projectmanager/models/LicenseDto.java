
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
 * A License represents a subscription to a particular product or bundle of products
 * within ProjectManager.
 */
public class LicenseDto
{
    private @NotNull String id;
    private @NotNull String licenseSku;
    private @Nullable String bundleSku;

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
    public @NotNull String getLicenseSku() { return this.licenseSku; }
    /**
     * The SKU code of this License, used for billing purposes.
     *
     * @param value The new value for licenseSku
     */
    public void setLicenseSku(@NotNull String value) { this.licenseSku = value; }
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
};
