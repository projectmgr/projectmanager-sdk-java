
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


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.RecurringTaskChangeSetDetailsChangeSetStatusDto;

import com.projectmanager.models.WeeklyRecurringSettingsDto;
import com.projectmanager.models.MonthlyRecurringSettingsDto;
import com.projectmanager.models.DailyRecurringSettingsDto;
import com.projectmanager.models.YearlyRecurringSettingsDto;
import com.projectmanager.models.ChangeSetStatusDto;
import com.projectmanager.models.RecurringTaskValidationResultDto;
import com.projectmanager.models.RecurringTaskSettingsDto;
import com.projectmanager.models.RecurringTaskChangeSetDetails;

/**
 * Contains all methods related to TaskRecurrency
 */
public class TaskRecurrencyClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskRecurrency API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskRecurrencyClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Changes an existing Task into a Recurring Task, so that it will recur regularly given the specified rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The weekly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto> createWeeklyRecurringTasks(@NotNull String taskId, @NotNull WeeklyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto> r = new RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/recurring/weekly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Changes an existing Task into a Recurring Task, so that it will recur regularly given the specified rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The monthly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto> createMonthlyRecurringTasks(@NotNull String taskId, @NotNull MonthlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto> r = new RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/recurring/monthly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Changes an existing Task into a Recurring Task, so that it will recur regularly given the specified rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The daily recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto> createDailyRecurringTasks(@NotNull String taskId, @NotNull DailyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto> r = new RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/recurring/daily");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Changes an existing Task into a Recurring Task, so that it will recur regularly given the specified rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The yearly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto> createYearlyRecurringTasks(@NotNull String taskId, @NotNull YearlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto> r = new RestRequest<RecurringTaskChangeSetDetailsChangeSetStatusDto>(this.client, "POST", "/api/data/tasks/{taskId}/recurring/yearly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetailsChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Removes one or more instances of a Recurring Task based on the `option` you specify: `this` means to remove
     * a single instance, `all` means to remove all instances, or `future` means to remove all future instances of
     * the Recurring Task.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param option Specify `this`, `all`, or `future` to indicate which task recurrnces to delete.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> deleteRecurringTasks(@NotNull String taskId, @NotNull String option)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/recurring/{option}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{option}", option == null ? "" : option.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }

    /**
     * Reviews potential updates to a Recurring Task and report back on the list of changes that would occur if this
     * Recurring Task was updated with these settings.
     *
     * When making changes to a Recurring Task, you may want to investigate the consequences of your changes first
     * before finalizing the changes.  You can use the Validate Recurring Tasks API to examine these changes.  When
     * you are happy with the changes, call Update Recurring Tasks to complete them.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskValidationResultDto> validateRecurringTasks(@NotNull String taskId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskValidationResultDto> r = new RestRequest<RecurringTaskValidationResultDto>(this.client, "POST", "/api/data/tasks/{taskId}/recurring/settings/validate");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskValidationResultDto>>() {}.getType());
    }

    /**
     * Updates the settings for a Recurring Task and re-generates occurrences of the Recurring Task from the new rules.
     *
     * When making changes to a Recurring Task, you may want to investigate the consequences of your changes first
     * before finalizing the changes.  You can use the Validate Recurring Tasks API to examine these changes.  When
     * you are happy with the changes, call Update Recurring Tasks to complete them.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Task
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> updateRecurringTasks(@NotNull String taskId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "PUT", "/api/data/tasks/{taskId}/recurring/settings");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }
}
