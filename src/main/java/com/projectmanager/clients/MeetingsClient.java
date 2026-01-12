
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
import com.projectmanager.models.MeetingDetailsDto;

import com.projectmanager.models.MeetingDto;
import com.projectmanager.models.MeetingUpdateDto;
import com.projectmanager.models.MeetingCreateDto;
import com.projectmanager.models.RecurringTaskChangeSetDetails;
import com.projectmanager.models.WeeklyRecurringSettingsDto;
import com.projectmanager.models.MonthlyRecurringSettingsDto;
import com.projectmanager.models.DailyRecurringSettingsDto;
import com.projectmanager.models.YearlyRecurringSettingsDto;
import com.projectmanager.models.DeletedTasksDto;
import com.projectmanager.models.RecurringTaskValidationResultDto;
import com.projectmanager.models.RecurringTaskSettingsDto;

/**
 * Contains all methods related to Meetings
 */
public class MeetingsClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Meetings API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public MeetingsClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a Meeting by its unique identifier or by its short ID.
     * A Meeting has both a unique identifier, which is a GUID, and a short ID, which is a small text label that is unique only within your Workspace.
     *
     * @param meetingId the id of the meeting
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingDetailsDto> getMeeting(@NotNull String meetingId)
    {
        RestRequest<MeetingDetailsDto> r = new RestRequest<MeetingDetailsDto>(this.client, "GET", "/api/data/meetings/{meetingId}");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        return r.Call(new TypeToken<AstroResult<MeetingDetailsDto>>() {}.getType());
    }

    /**
     * Updates a Meeting by its unique identifier, which is a GUID.
     *
     * @param meetingId the id of the meeting
     * @param body the fields to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingDto> updateMeeting(@NotNull String meetingId, @NotNull MeetingUpdateDto body)
    {
        RestRequest<MeetingDto> r = new RestRequest<MeetingDto>(this.client, "PUT", "/api/data/meetings/{meetingId}");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<MeetingDto>>() {}.getType());
    }

    /**
     * Removes a Meeting by its unique identifier, which is a GUID.
     *
     * @param meetingId the id of the meeting to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeMeeting(@NotNull String meetingId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/meetings/{meetingId}");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Creates a new Meeting for the current user.
     * If you specify an assignee for this Meeting, that user will be assigned to it.
     * If you do not specify an assignee, the Meeting will be automatically assigned to you.
     *
     * @param body The data used to create the Meeting
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingDto> createMeeting(@NotNull MeetingCreateDto body)
    {
        RestRequest<MeetingDto> r = new RestRequest<MeetingDto>(this.client, "POST", "/api/data/meetings");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<MeetingDto>>() {}.getType());
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
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
     * Changes an existing Non-Project Task into a Recurring Task, so that it will recur regularly given the specified
     * rules.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
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
     * Removes one or more instances of a Recurring Non-Project Task based on the `option` you specify: `this` means
     * to remove a single instance, `all` means to remove all instances, or `future` means to remove all future
     * instances of the Recurring Task.
     *
     * A Recurring Task is one that must be completed on a specific regular frequency, such as Daily, Weekly, Monthly,
     * or Yearly.  To create a Recurring Task, you must first create a regular Task with the necessary information,
     * then call one of the Create Recurring Task APIs.  To remove an instance of a Recurring Task, call Delete
     * Recurring Task and specify one or more instances of the Recurring Task.
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
