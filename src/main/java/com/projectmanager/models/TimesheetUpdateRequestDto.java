
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
 * Payload to update time entry
 */
public class TimesheetUpdateRequestDto
{
    private @Nullable Double hours;
    private @Nullable Integer minutes;
    private @Nullable String notes;
    private @Nullable String[] documentIds;

    /**
     * Reported hours. If minutes is specified this property is ignored
     *
     * @return The field hours
     */
    public @Nullable Double getHours() { return this.hours; }
    /**
     * Reported hours. If minutes is specified this property is ignored
     *
     * @param value The new value for hours
     */
    public void setHours(@Nullable Double value) { this.hours = value; }
    /**
     * Specify the time in minutes. This overrides the Hours property.
     *
     * @return The field minutes
     */
    public @Nullable Integer getMinutes() { return this.minutes; }
    /**
     * Specify the time in minutes. This overrides the Hours property.
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@Nullable Integer value) { this.minutes = value; }
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
    /**
     * Document Ids
     *
     * @return The field documentIds
     */
    public @Nullable String[] getDocumentIds() { return this.documentIds; }
    /**
     * Document Ids
     *
     * @param value The new value for documentIds
     */
    public void setDocumentIds(@Nullable String[] value) { this.documentIds = value; }
};
