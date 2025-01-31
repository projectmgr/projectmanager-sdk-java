
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
 * Due Date Filter Settings
 */
public class ExportDueDateFilterDto
{
    private @Nullable Boolean includeNoDueDate;
    private @Nullable Boolean includeOverdue;
    private @Nullable Boolean includeToday;
    private @Nullable Boolean includeThisWeek;
    private @Nullable Boolean includeNextWeek;
    private @Nullable Boolean includeLater;

    /**
     * Include items without a due date
     *
     * @return The field includeNoDueDate
     */
    public @Nullable Boolean getIncludeNoDueDate() { return this.includeNoDueDate; }
    /**
     * Include items without a due date
     *
     * @param value The new value for includeNoDueDate
     */
    public void setIncludeNoDueDate(@Nullable Boolean value) { this.includeNoDueDate = value; }
    /**
     * Include items with a due date in the past
     *
     * @return The field includeOverdue
     */
    public @Nullable Boolean getIncludeOverdue() { return this.includeOverdue; }
    /**
     * Include items with a due date in the past
     *
     * @param value The new value for includeOverdue
     */
    public void setIncludeOverdue(@Nullable Boolean value) { this.includeOverdue = value; }
    /**
     * Include items with a due date of today
     *
     * @return The field includeToday
     */
    public @Nullable Boolean getIncludeToday() { return this.includeToday; }
    /**
     * Include items with a due date of today
     *
     * @param value The new value for includeToday
     */
    public void setIncludeToday(@Nullable Boolean value) { this.includeToday = value; }
    /**
     * Include items due within the current week
     *
     * @return The field includeThisWeek
     */
    public @Nullable Boolean getIncludeThisWeek() { return this.includeThisWeek; }
    /**
     * Include items due within the current week
     *
     * @param value The new value for includeThisWeek
     */
    public void setIncludeThisWeek(@Nullable Boolean value) { this.includeThisWeek = value; }
    /**
     * Include items due within the next week
     *
     * @return The field includeNextWeek
     */
    public @Nullable Boolean getIncludeNextWeek() { return this.includeNextWeek; }
    /**
     * Include items due within the next week
     *
     * @param value The new value for includeNextWeek
     */
    public void setIncludeNextWeek(@Nullable Boolean value) { this.includeNextWeek = value; }
    /**
     * Include items due later
     *
     * @return The field includeLater
     */
    public @Nullable Boolean getIncludeLater() { return this.includeLater; }
    /**
     * Include items due later
     *
     * @param value The new value for includeLater
     */
    public void setIncludeLater(@Nullable Boolean value) { this.includeLater = value; }
};
