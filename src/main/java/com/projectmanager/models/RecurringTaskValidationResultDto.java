
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

/**
 * RecurringTaskValidationResult
 */
public class RecurringTaskValidationResultDto
{
    private @NotNull String[] deletedTaskIds;

    /**
     * Primary constructor
     */
    public RecurringTaskValidationResultDto() {
    }

    /**
     * The Deleted Task Ids
     *
     * @return The field deletedTaskIds
     */
    public @NotNull String[] getDeletedTaskIds() { return this.deletedTaskIds; }
    /**
     * The Deleted Task Ids
     *
     * @param value The new value for deletedTaskIds
     */
    public void setDeletedTaskIds(@NotNull String[] value) { this.deletedTaskIds = value; }
};
