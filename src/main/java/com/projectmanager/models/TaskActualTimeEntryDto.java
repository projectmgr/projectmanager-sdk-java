
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
 * A single timesheet line for the task and resource.
 */
public class TaskActualTimeEntryDto
{
    private @NotNull String id;
    private @NotNull String date;
    private @NotNull Integer minutes;
    private @NotNull Boolean approved;
    private @NotNull Integer approvalStatusId;

    /**
     * Timesheet row identifier.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Timesheet row identifier.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Calendar date of the time entry (date-only).
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * Calendar date of the time entry (date-only).
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * Minutes reported on this timesheet row for the task.
     *
     * @return The field minutes
     */
    public @NotNull Integer getMinutes() { return this.minutes; }
    /**
     * Minutes reported on this timesheet row for the task.
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@NotNull Integer value) { this.minutes = value; }
    /**
     * True if this Timesheet was approved by a person with the role of a Timesheet approver
     *
     * @return The field approved
     */
    public @NotNull Boolean getApproved() { return this.approved; }
    /**
     * True if this Timesheet was approved by a person with the role of a Timesheet approver
     *
     * @param value The new value for approved
     */
    public void setApproved(@NotNull Boolean value) { this.approved = value; }
    /**
     * Approval status of the timesheet entry.
     * 1 = New (not submitted for approval)
     * 2 = Submitted (submitted for approval, pending review)
     * 3 = Approved (approved by the approver)
     * 4 = Declined (declined by the approver)
     *
     * @return The field approvalStatusId
     */
    public @NotNull Integer getApprovalStatusId() { return this.approvalStatusId; }
    /**
     * Approval status of the timesheet entry.
     * 1 = New (not submitted for approval)
     * 2 = Submitted (submitted for approval, pending review)
     * 3 = Approved (approved by the approver)
     * 4 = Declined (declined by the approver)
     *
     * @param value The new value for approvalStatusId
     */
    public void setApprovalStatusId(@NotNull Integer value) { this.approvalStatusId = value; }
};
