
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
 * Holds the list of pending timesheet approvals
 */
public class TimeSheetApprovalResponseDto
{
    private @NotNull PendingTimeSheetApprovalDto[] pendingApprovals;

    /**
     * A list of pending timesheet approvals
     *
     * @return The field pendingApprovals
     */
    public @NotNull PendingTimeSheetApprovalDto[] getPendingApprovals() { return this.pendingApprovals; }
    /**
     * A list of pending timesheet approvals
     *
     * @param value The new value for pendingApprovals
     */
    public void setPendingApprovals(@NotNull PendingTimeSheetApprovalDto[] value) { this.pendingApprovals = value; }
};
