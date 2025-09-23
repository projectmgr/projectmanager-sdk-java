
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
 * Settings for Yearly Recurring Tasks
 */
public class YearlyRecurringSettingsDto
{
    private @Nullable String recurringEndDate;
    private @Nullable Integer endAfterNumberOfOccurences;
    private @NotNull Integer repeatOnEveryNumberOfYears;
    private @NotNull Integer repeatOnMonth;
    private @NotNull Integer repeatOnDay;

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
     * RepeatOnEveryNumberOfYears
     *
     * @return The field repeatOnEveryNumberOfYears
     */
    public @NotNull Integer getRepeatOnEveryNumberOfYears() { return this.repeatOnEveryNumberOfYears; }
    /**
     * RepeatOnEveryNumberOfYears
     *
     * @param value The new value for repeatOnEveryNumberOfYears
     */
    public void setRepeatOnEveryNumberOfYears(@NotNull Integer value) { this.repeatOnEveryNumberOfYears = value; }
    /**
     * RepeatOnMonth
     *
     * @return The field repeatOnMonth
     */
    public @NotNull Integer getRepeatOnMonth() { return this.repeatOnMonth; }
    /**
     * RepeatOnMonth
     *
     * @param value The new value for repeatOnMonth
     */
    public void setRepeatOnMonth(@NotNull Integer value) { this.repeatOnMonth = value; }
    /**
     * RepeatOnDay
     *
     * @return The field repeatOnDay
     */
    public @NotNull Integer getRepeatOnDay() { return this.repeatOnDay; }
    /**
     * RepeatOnDay
     *
     * @param value The new value for repeatOnDay
     */
    public void setRepeatOnDay(@NotNull Integer value) { this.repeatOnDay = value; }
};
