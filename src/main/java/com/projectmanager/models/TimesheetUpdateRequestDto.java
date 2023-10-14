
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Payload to update time entry
 */
public class TimesheetUpdateRequestDto
{
    private @Nullable Double hours;
    private @Nullable String notes;

    /**
     * Reported hours
     *
     * @return The field hours
     */
    public @Nullable Double getHours() { return this.hours; }
    /**
     * Reported hours
     *
     * @param value The new value for hours
     */
    public void setHours(@Nullable Double value) { this.hours = value; }
    /**
     * Notes
     *
     * @return The field notes
     */
    public @Nullable String getNotes() { return this.notes; }
    /**
     * Notes
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable String value) { this.notes = value; }
};
