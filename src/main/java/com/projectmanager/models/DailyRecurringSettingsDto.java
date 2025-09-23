
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
 * Settings for Daily Recurring Tasks
 */
public class DailyRecurringSettingsDto
{
    private @Nullable String recurringEndDate;
    private @Nullable Integer endAfterNumberOfOccurences;
    private @NotNull Integer repeatOnEveryNumberOfWeekDays;

    /**
     * RecurringEndDate
     *
     * @return The field recurringEndDate
     */
    public @Nullable String getRecurringEndDate() { return this.recurringEndDate; }
    /**
     * RecurringEndDate
     *
     * @param value The new value for recurringEndDate
     */
    public void setRecurringEndDate(@Nullable String value) { this.recurringEndDate = value; }
    /**
     * EndAfterNumberOfOccurences
     *
     * @return The field endAfterNumberOfOccurences
     */
    public @Nullable Integer getEndAfterNumberOfOccurences() { return this.endAfterNumberOfOccurences; }
    /**
     * EndAfterNumberOfOccurences
     *
     * @param value The new value for endAfterNumberOfOccurences
     */
    public void setEndAfterNumberOfOccurences(@Nullable Integer value) { this.endAfterNumberOfOccurences = value; }
    /**
     * RepeatOnEveryNumberOfWeekDays
     *
     * @return The field repeatOnEveryNumberOfWeekDays
     */
    public @NotNull Integer getRepeatOnEveryNumberOfWeekDays() { return this.repeatOnEveryNumberOfWeekDays; }
    /**
     * RepeatOnEveryNumberOfWeekDays
     *
     * @param value The new value for repeatOnEveryNumberOfWeekDays
     */
    public void setRepeatOnEveryNumberOfWeekDays(@NotNull Integer value) { this.repeatOnEveryNumberOfWeekDays = value; }
};
