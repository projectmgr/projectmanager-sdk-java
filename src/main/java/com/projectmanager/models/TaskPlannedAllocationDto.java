
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
 * Planned minutes attributed to a single calendar day for a resource.
 */
public class TaskPlannedAllocationDto
{
    private @NotNull String date;
    private @NotNull Integer minutes;

    /**
     * Calendar date for this planned segment (date-only; workspace calendar applies).
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * Calendar date for this planned segment (date-only; workspace calendar applies).
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
    /**
     * Planned minutes on date for this resource.
     *
     * @return The field minutes
     */
    public @NotNull Integer getMinutes() { return this.minutes; }
    /**
     * Planned minutes on date for this resource.
     *
     * @param value The new value for minutes
     */
    public void setMinutes(@NotNull Integer value) { this.minutes = value; }
};
