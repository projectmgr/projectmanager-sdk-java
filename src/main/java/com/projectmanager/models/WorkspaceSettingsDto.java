
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
 * Workspace-level scheduling defaults returned with a workspace.
 */
public class WorkspaceSettingsDto
{
    private @NotNull Double defaultPlannedHours;
    private @NotNull WorkspaceWorkingDaysDto workingDays;

    /**
     * Default planned hours per day for new resources (0–24).
     *
     * @return The field defaultPlannedHours
     */
    public @NotNull Double getDefaultPlannedHours() { return this.defaultPlannedHours; }
    /**
     * Default planned hours per day for new resources (0–24).
     *
     * @param value The new value for defaultPlannedHours
     */
    public void setDefaultPlannedHours(@NotNull Double value) { this.defaultPlannedHours = value; }
    /**
     * Default working hours per weekday for the workspace calendar.
     *
     * @return The field workingDays
     */
    public @NotNull WorkspaceWorkingDaysDto getWorkingDays() { return this.workingDays; }
    /**
     * Default working hours per weekday for the workspace calendar.
     *
     * @param value The new value for workingDays
     */
    public void setWorkingDays(@NotNull WorkspaceWorkingDaysDto value) { this.workingDays = value; }
};
