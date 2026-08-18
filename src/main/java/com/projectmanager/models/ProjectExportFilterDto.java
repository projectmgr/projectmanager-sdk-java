
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
 * Filter settings for Projects export
 */
public class ProjectExportFilterDto
{
    private @Nullable String groupId;
    private @NotNull Boolean favoritesOnly;
    private @Nullable String[] status;
    private @Nullable String[] manager;
    private @Nullable String[] customer;
    private @Nullable String[] chargeCode;
    private @Nullable String[] priority;

    /**
     * Specify the project group filter for the export
     *
     * @return The field groupId
     */
    public @Nullable String getGroupId() { return this.groupId; }
    /**
     * Specify the project group filter for the export
     *
     * @param value The new value for groupId
     */
    public void setGroupId(@Nullable String value) { this.groupId = value; }
    /**
     * Specify whether to include only favorite projects in the export
     *
     * @return The field favoritesOnly
     */
    public @NotNull Boolean getFavoritesOnly() { return this.favoritesOnly; }
    /**
     * Specify whether to include only favorite projects in the export
     *
     * @param value The new value for favoritesOnly
     */
    public void setFavoritesOnly(@NotNull Boolean value) { this.favoritesOnly = value; }
    /**
     * Specify the status filter for the export
     *
     * @return The field status
     */
    public @Nullable String[] getStatus() { return this.status; }
    /**
     * Specify the status filter for the export
     *
     * @param value The new value for status
     */
    public void setStatus(@Nullable String[] value) { this.status = value; }
    /**
     * Specify the project manager filter for the export
     *
     * @return The field manager
     */
    public @Nullable String[] getManager() { return this.manager; }
    /**
     * Specify the project manager filter for the export
     *
     * @param value The new value for manager
     */
    public void setManager(@Nullable String[] value) { this.manager = value; }
    /**
     * Specify the project customer filter for the export
     *
     * @return The field customer
     */
    public @Nullable String[] getCustomer() { return this.customer; }
    /**
     * Specify the project customer filter for the export
     *
     * @param value The new value for customer
     */
    public void setCustomer(@Nullable String[] value) { this.customer = value; }
    /**
     * Specify the project charge code filter for the export
     *
     * @return The field chargeCode
     */
    public @Nullable String[] getChargeCode() { return this.chargeCode; }
    /**
     * Specify the project charge code filter for the export
     *
     * @param value The new value for chargeCode
     */
    public void setChargeCode(@Nullable String[] value) { this.chargeCode = value; }
    /**
     * Specify the priority filter for the export
     *
     * @return The field priority
     */
    public @Nullable String[] getPriority() { return this.priority; }
    /**
     * Specify the priority filter for the export
     *
     * @param value The new value for priority
     */
    public void setPriority(@Nullable String[] value) { this.priority = value; }
};
