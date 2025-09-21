
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
     * Create Weekly Recurring Tasks
     *
     * @param taskId The unique identifier or short ID of the Task
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
     * Create Monthly Recurring Tasks
     *
     * @param taskId The unique identifier or short ID of the Task
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
     * Create Daily Recurring Tasks
     *
     * @param taskId The unique identifier or short ID of the Task
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
     * Create Yearly Recurring Tasks
     *
     * @param taskId The unique identifier or short ID of the Task
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
     * Delete Recurring Tasks
     *
     * @param taskId The unique identifier or short ID of the Task
     * @param option The options for the deletion
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangeSetStatusDto> deleteRecurringTasks(@NotNull String taskId, @NotNull String option)
    {
        RestRequest<ChangeSetStatusDto> r = new RestRequest<ChangeSetStatusDto>(this.client, "DELETE", "/api/data/tasks/{taskId}/recurring/{option}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{option}", option == null ? "" : option.toString());
        return r.Call(new TypeToken<AstroResult<ChangeSetStatusDto>>() {}.getType());
    }
}
