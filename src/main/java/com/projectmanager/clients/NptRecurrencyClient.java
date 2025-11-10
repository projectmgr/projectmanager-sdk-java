
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
import com.projectmanager.models.RecurringTaskValidationResultDto;
import com.projectmanager.models.RecurringTaskSettingsDto;

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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
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
     * Removes one or more instances of a Recurring Non-Project Task based on the `option` you specify: `this` means
     * to remove a single instance, `all` means to remove all instances, or `future` means to remove all future
     * instances of the Recurring Task.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the Recurring Npt Tasks
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

    /**
     * Reviews potential updates to a Recurring Non-Project Task and report back on the list of changes that would
     * occur if this Recurring Non-Project Task was updated with these settings.
     *
     * When making changes to a Recurring Npt, you may want to investigate the consequences of your changes first
     * before finalizing the changes.  You can use the Validate Recurring Npts API to examine these changes.  When
     * you are happy with the changes, call Update Recurring Npts to complete them.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskValidationResultDto> validateRecurringNpts(@NotNull String taskId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskValidationResultDto> r = new RestRequest<RecurringTaskValidationResultDto>(this.client, "POST", "/api/data/npt/{taskId}/recurring/settings/validate");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskValidationResultDto>>() {}.getType());
    }

    /**
     * Updates the settings for a Recurring Non-Project Task and re-generates occurrences of the Recurring Non-Project
     * Task from the new rules.
     *
     * When making changes to a Recurring Npt, you may want to investigate the consequences of your changes first
     * before finalizing the changes.  You can use the Validate Recurring Npts API to examine these changes.  When
     * you are happy with the changes, call Update Recurring Npts to complete them.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
     *
     * @param taskId The unique identifier of the NPT Tasks
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> updateRecurringNpts(@NotNull String taskId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "PUT", "/api/data/npt/{taskId}/recurring/settings");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }
}
