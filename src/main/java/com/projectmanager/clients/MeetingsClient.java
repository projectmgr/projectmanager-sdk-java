
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
import com.projectmanager.models.MeetingDto;

import com.projectmanager.models.MeetingCreateDto;
import com.projectmanager.models.MeetingDetailsDto;
import com.projectmanager.models.MeetingUpdateDto;

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
     * Retrieve a list of Meetings.
     *
     * This endpoint does not use OData. If `projectId` is provided, results are limited to that Project.
     *
     * @param projectId Optional project id to scope results
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<MeetingDto[]> getMeetings(@Nullable String projectId)
    {
        RestRequest<MeetingDto[]> r = new RestRequest<MeetingDto[]>(this.client, "GET", "/api/data/meetings");
        if (projectId != null) { r.AddQuery("projectId", projectId.toString()); }
        return r.Call(new TypeToken<AstroResult<MeetingDto[]>>() {}.getType());
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
}
