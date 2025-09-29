
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
 * Task assignee dto
 */
public class AssigneeDto
{
    private @NotNull String resourceId;
    private @Nullable Double percentAssignment;

    /**
     * Assignee resource id
     *
     * @return The field resourceId
     */
    public @NotNull String getResourceId() { return this.resourceId; }
    /**
     * Assignee resource id
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@NotNull String value) { this.resourceId = value; }
    /**
     * Percent of work assigned to task
     *
     * @return The field percentAssignment
     */
    public @Nullable Double getPercentAssignment() { return this.percentAssignment; }
    /**
     * Percent of work assigned to task
     *
     * @param value The new value for percentAssignment
     */
    public void setPercentAssignment(@Nullable Double value) { this.percentAssignment = value; }
};
