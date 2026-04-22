
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
 * Contains information about whether a locked (closed or deleted) project can be re-opened.
 */
public class ProjectReopenStatusDto
{
    private @NotNull Boolean hasCostChanges;

    /**
     * Gets or sets a value indicating whether any of the PlannedProjectCosts or TimesheetCosts
     * have changed.
     * This is generally due to Rates changing since the project was closed, which would cause the
     * costs to be different after recalculation when the project is reopened.
     *
     * @return The field hasCostChanges
     */
    public @NotNull Boolean getHasCostChanges() { return this.hasCostChanges; }
    /**
     * Gets or sets a value indicating whether any of the PlannedProjectCosts or TimesheetCosts
     * have changed.
     * This is generally due to Rates changing since the project was closed, which would cause the
     * costs to be different after recalculation when the project is reopened.
     *
     * @param value The new value for hasCostChanges
     */
    public void setHasCostChanges(@NotNull Boolean value) { this.hasCostChanges = value; }
};
