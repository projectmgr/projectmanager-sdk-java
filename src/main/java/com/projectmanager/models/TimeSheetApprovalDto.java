
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
 * Represents a timesheet approval request
 */
public class TimeSheetApprovalDto
{
    private @Nullable String resourceId;
    private @NotNull String date;

    /**
     * The id for the resource, if null it indicates the request is for the current logged-in user
     *
     * @return The field resourceId
     */
    public @Nullable String getResourceId() { return this.resourceId; }
    /**
     * The id for the resource, if null it indicates the request is for the current logged-in user
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@Nullable String value) { this.resourceId = value; }
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
};
