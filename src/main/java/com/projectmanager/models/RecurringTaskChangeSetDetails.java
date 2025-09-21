
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
 * RecurringTaskChangeSetDetails
 */
public class RecurringTaskChangeSetDetails
{
    private @NotNull String[] taskIds;

    /**
     * The created Task Ids
     *
     * @return The field taskIds
     */
    public @NotNull String[] getTaskIds() { return this.taskIds; }
    /**
     * The created Task Ids
     *
     * @param value The new value for taskIds
     */
    public void setTaskIds(@NotNull String[] value) { this.taskIds = value; }
};
