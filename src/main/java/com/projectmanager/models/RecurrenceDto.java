
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
 * A single recurrence instance created by a recurring Task, NPT, or Meeting action
 */
public class RecurrenceDto
{
    private @NotNull String id;
    private @NotNull String startDate;
    private @NotNull String endDate;

    /**
     * The unique identifier of the created recurrence instance
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the created recurrence instance
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The occurrence start (UTC). For Meetings this carries the meeting time.
     *
     * @return The field startDate
     */
    public @NotNull String getStartDate() { return this.startDate; }
    /**
     * The occurrence start (UTC). For Meetings this carries the meeting time.
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@NotNull String value) { this.startDate = value; }
    /**
     * The occurrence finish (UTC)
     *
     * @return The field endDate
     */
    public @NotNull String getEndDate() { return this.endDate; }
    /**
     * The occurrence finish (UTC)
     *
     * @param value The new value for endDate
     */
    public void setEndDate(@NotNull String value) { this.endDate = value; }
};
