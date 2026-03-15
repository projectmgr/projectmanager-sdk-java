
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
 * Represents a request to update the approval status of a Task.
 */
public class TaskApprovalStatusUpdateDto
{
    private @NotNull String status;

    /**
     * The approval status to apply to the Task.
     * Must be one of: Approved, Denied, or Pending.
     *
     * @return The field status
     */
    public @NotNull String getStatus() { return this.status; }
    /**
     * The approval status to apply to the Task.
     * Must be one of: Approved, Denied, or Pending.
     *
     * @param value The new value for status
     */
    public void setStatus(@NotNull String value) { this.status = value; }
};
