
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
 * Request body for updating workspace-level scheduling defaults.
 * Omit properties to leave existing values unchanged.
 */
public class WorkspaceSettingsUpdateDto
{
    private @Nullable Double defaultPlannedHours;
    private @Nullable WorkspaceWorkingDaysDto workingDays;

    /**
     * Default planned hours per day for new resources (0–24).
     *
     * @return The field defaultPlannedHours
     */
    public @Nullable Double getDefaultPlannedHours() { return this.defaultPlannedHours; }
    /**
     * Default planned hours per day for new resources (0–24).
     *
     * @param value The new value for defaultPlannedHours
     */
    public void setDefaultPlannedHours(@Nullable Double value) { this.defaultPlannedHours = value; }
    /**
     * Default working hours per weekday for the workspace calendar.
     *
     * @return The field workingDays
     */
    public @Nullable WorkspaceWorkingDaysDto getWorkingDays() { return this.workingDays; }
    /**
     * Default working hours per weekday for the workspace calendar.
     *
     * @param value The new value for workingDays
     */
    public void setWorkingDays(@Nullable WorkspaceWorkingDaysDto value) { this.workingDays = value; }
};
