
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
import com.projectmanager.models.RecurringTaskChangeSetDetails;

import com.projectmanager.models.WeeklyRecurringSettingsDto;
import com.projectmanager.models.MonthlyRecurringSettingsDto;
import com.projectmanager.models.DailyRecurringSettingsDto;
import com.projectmanager.models.YearlyRecurringSettingsDto;
import com.projectmanager.models.DeletedTasksDto;

/**
 * Contains all methods related to NptRecurrency
 */
public class NptRecurrencyClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptRecurrency API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptRecurrencyClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Create Weekly Recurring Npts
     *
     * @param taskId The unique identifier or short ID of the Npt Tasks
     * @param body The weekly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createWeeklyRecurringNpts(@NotNull String taskId, @NotNull WeeklyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/npt/{taskId}/recurring/weekly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Create Monthly Recurring Npts
     *
     * @param taskId The unique identifier or short ID of the Npt Tasks
     * @param body The monthly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createMonthlyRecurringNpts(@NotNull String taskId, @NotNull MonthlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/npt/{taskId}/recurring/monthly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Create Daily Recurring Npts
     *
     * @param taskId The unique identifier or short ID of the Npt Tasks
     * @param body The daily recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createDailyRecurringNpts(@NotNull String taskId, @NotNull DailyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/npt/{taskId}/recurring/daily");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Create Yearly Recurring Npts
     *
     * @param taskId The unique identifier or short ID of the Npt Tasks
     * @param body The yearly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createYearlyRecurringNpts(@NotNull String taskId, @NotNull YearlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/npt/{taskId}/recurring/yearly");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Delete Recurring Npts
     *
     * @param taskId The unique identifier or short ID of the Npt Tasks
     * @param option The options for the deletion
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<DeletedTasksDto> deleteRecurringNpts(@NotNull String taskId, @NotNull String option)
    {
        RestRequest<DeletedTasksDto> r = new RestRequest<DeletedTasksDto>(this.client, "DELETE", "/api/data/npt/{taskId}/recurring/{option}");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        r.AddPath("{option}", option == null ? "" : option.toString());
        return r.Call(new TypeToken<AstroResult<DeletedTasksDto>>() {}.getType());
    }
}
