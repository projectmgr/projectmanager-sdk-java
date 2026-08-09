
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
 * Contains all methods related to MeetingRecurrency
 */
public class MeetingRecurrencyClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the MeetingRecurrency API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public MeetingRecurrencyClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Changes an existing Meeting into a Recurring Meeting, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The weekly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createWeeklyRecurringMeetings(@NotNull String meetingId, @NotNull WeeklyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/meetings/{meetingId}/recurring/weekly");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Changes an existing Meeting into a Recurring Meeting, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The monthly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createMonthlyRecurringMeetings(@NotNull String meetingId, @NotNull MonthlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/meetings/{meetingId}/recurring/monthly");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Changes an existing Meeting into a Recurring Meeting, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The daily recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createDailyRecurringMeetings(@NotNull String meetingId, @NotNull DailyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/meetings/{meetingId}/recurring/daily");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Changes an existing Meeting into a Recurring Meeting, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The yearly recurring settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> createYearlyRecurringMeetings(@NotNull String meetingId, @NotNull YearlyRecurringSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "POST", "/api/data/meetings/{meetingId}/recurring/yearly");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }

    /**
     * Removes one or more instances of a Recurring Meeting based on the `option` you specify: `this` means
     * to remove a single instance, `all` means to remove all instances, or `future` means to remove all future
     * instances of the Recurring Meeting.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Recurring Meeting
     * @param option The options for the deletion
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<DeletedTasksDto> deleteRecurringMeetings(@NotNull String meetingId, @NotNull String option)
    {
        RestRequest<DeletedTasksDto> r = new RestRequest<DeletedTasksDto>(this.client, "DELETE", "/api/data/meetings/{meetingId}/recurring/{option}");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        r.AddPath("{option}", option == null ? "" : option.toString());
        return r.Call(new TypeToken<AstroResult<DeletedTasksDto>>() {}.getType());
    }

    /**
     * Reviews potential updates to a Recurring Meeting and report back on the list of changes that would
     * occur if this Recurring Meeting was updated with these settings.
     *
     * When making changes to a Recurring Meeting, you may want to investigate the consequences of your changes first
     * before finalizing the changes. You can use the Validate Recurring Meetings API to examine these changes. When
     * you are happy with the changes, call Update Recurring Meetings to complete them.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskValidationResultDto> validateRecurringMeetingsettings(@NotNull String meetingId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskValidationResultDto> r = new RestRequest<RecurringTaskValidationResultDto>(this.client, "POST", "/api/data/meetings/{meetingId}/recurring/settings/validate");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskValidationResultDto>>() {}.getType());
    }

    /**
     * Updates the settings for a Recurring Meeting and regenerates occurrences of the Recurring Meeting
     * from the new rules.
     *
     * When making changes to a Recurring Meeting, you may want to investigate the consequences of your changes first
     * before finalizing the changes. You can use the Validate Recurring Meetings API to examine these changes. When
     * you are happy with the changes, call Update Recurring Meetings to complete them.
     *
     * A Recurring Meeting is one that occurs on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly. To create a Recurring Meeting, you must first create a regular Meeting with the necessary information,
     * then call one of the Create Recurring Meeting APIs. To remove an instance of a Recurring Meeting, call Delete
     * Recurring Meeting and specify one or more instances of the Recurring Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The new settings
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RecurringTaskChangeSetDetails> updateRecurringMeetingsettings(@NotNull String meetingId, @NotNull RecurringTaskSettingsDto body)
    {
        RestRequest<RecurringTaskChangeSetDetails> r = new RestRequest<RecurringTaskChangeSetDetails>(this.client, "PUT", "/api/data/meetings/{meetingId}/recurring/settings");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RecurringTaskChangeSetDetails>>() {}.getType());
    }
}
