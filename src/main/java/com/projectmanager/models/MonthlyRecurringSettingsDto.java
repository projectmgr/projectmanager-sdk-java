
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
 * Settings for Monthly Recurring Tasks
 */
public class MonthlyRecurringSettingsDto
{
    private @Nullable String recurringEndDate;
    private @Nullable Integer endAfterNumberOfOccurences;
    private @NotNull Integer repeatOnEveryNumberOfMonths;
    private @Nullable Integer repeatOnMonthDay;
    private @Nullable Integer repeatOnMonthWeek;
    private @Nullable Integer repeatOnWeekDay;

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
     * RepeatOnEveryNumberOfMonths
     *
     * @return The field repeatOnEveryNumberOfMonths
     */
    public @NotNull Integer getRepeatOnEveryNumberOfMonths() { return this.repeatOnEveryNumberOfMonths; }
    /**
     * RepeatOnEveryNumberOfMonths
     *
     * @param value The new value for repeatOnEveryNumberOfMonths
     */
    public void setRepeatOnEveryNumberOfMonths(@NotNull Integer value) { this.repeatOnEveryNumberOfMonths = value; }
    /**
     * RepeatOnMonthDay
     *
     * @return The field repeatOnMonthDay
     */
    public @Nullable Integer getRepeatOnMonthDay() { return this.repeatOnMonthDay; }
    /**
     * RepeatOnMonthDay
     *
     * @param value The new value for repeatOnMonthDay
     */
    public void setRepeatOnMonthDay(@Nullable Integer value) { this.repeatOnMonthDay = value; }
    /**
     * RepeatOnMonthWeek
     *
     * @return The field repeatOnMonthWeek
     */
    public @Nullable Integer getRepeatOnMonthWeek() { return this.repeatOnMonthWeek; }
    /**
     * RepeatOnMonthWeek
     *
     * @param value The new value for repeatOnMonthWeek
     */
    public void setRepeatOnMonthWeek(@Nullable Integer value) { this.repeatOnMonthWeek = value; }
    /**
     * RepeatOnWeekDay
     *
     * @return The field repeatOnWeekDay
     */
    public @Nullable Integer getRepeatOnWeekDay() { return this.repeatOnWeekDay; }
    /**
     * RepeatOnWeekDay
     *
     * @param value The new value for repeatOnWeekDay
     */
    public void setRepeatOnWeekDay(@Nullable Integer value) { this.repeatOnWeekDay = value; }
};
