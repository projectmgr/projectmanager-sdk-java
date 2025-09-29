
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
 * Contains details of recurring NPT task deletions.
 */
public class DeletedTasksDto
{
    private @NotNull Integer deletedCount;
    private @NotNull String[] deletedTaskIds;

    /**
     * The total number of tasks that were deleted.
     *
     * @return The field deletedCount
     */
    public @NotNull Integer getDeletedCount() { return this.deletedCount; }
    /**
     * The total number of tasks that were deleted.
     *
     * @param value The new value for deletedCount
     */
    public void setDeletedCount(@NotNull Integer value) { this.deletedCount = value; }
    /**
     * The unique identifiers of the tasks that were deleted.
     *
     * @return The field deletedTaskIds
     */
    public @NotNull String[] getDeletedTaskIds() { return this.deletedTaskIds; }
    /**
     * The unique identifiers of the tasks that were deleted.
     *
     * @param value The new value for deletedTaskIds
     */
    public void setDeletedTaskIds(@NotNull String[] value) { this.deletedTaskIds = value; }
};
