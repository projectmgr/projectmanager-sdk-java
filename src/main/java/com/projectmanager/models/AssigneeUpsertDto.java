
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
 * An AssigneeUpsert is a create-or-update process that will either create
 * a new assignment of effort to a TaskAssignee or update an existing effort
 * amount for an existing TaskAssignee.
 */
public class AssigneeUpsertDto
{
    private @NotNull String id;
    private @Nullable Integer assignedEffort;

    /**
     * The unique identifier of the TaskAssignee to which work is being assigned.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the TaskAssignee to which work is being assigned.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The new amount of effort to assign for this Resource. This value is measured in minutes.
     * If AssignedEffort is null, we try either use the existing AssignedEffort (if there is one),
     * or the Default Planned Effort.
     *
     * @return The field assignedEffort
     */
    public @Nullable Integer getAssignedEffort() { return this.assignedEffort; }
    /**
     * The new amount of effort to assign for this Resource. This value is measured in minutes.
     * If AssignedEffort is null, we try either use the existing AssignedEffort (if there is one),
     * or the Default Planned Effort.
     *
     * @param value The new value for assignedEffort
     */
    public void setAssignedEffort(@Nullable Integer value) { this.assignedEffort = value; }
};
