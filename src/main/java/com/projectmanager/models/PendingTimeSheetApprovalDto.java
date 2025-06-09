
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
 * Information about a pending timesheet approval
 */
public class PendingTimeSheetApprovalDto
{
    private @NotNull String resourceId;
    private @NotNull String date;
    private @NotNull String resourceName;

    /**
     * The resource whose timesheet is being approved
     *
     * @return The field resourceId
     */
    public @NotNull String getResourceId() { return this.resourceId; }
    /**
     * The resource whose timesheet is being approved
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@NotNull String value) { this.resourceId = value; }
    /**
     * The date of the week to which the timesheet applies
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * The date of the week to which the timesheet applies
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * The name of the resource
     *
     * @return The field resourceName
     */
    public @NotNull String getResourceName() { return this.resourceName; }
    /**
     * The name of the resource
     *
     * @param value The new value for resourceName
     */
    public void setResourceName(@NotNull String value) { this.resourceName = value; }
};
