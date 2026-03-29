
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
import com.projectmanager.models.TaskTagDto;

import com.projectmanager.models.NameDto;

/**
 * Contains all methods related to MeetingTag
 */
public class MeetingTagClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the MeetingTag API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public MeetingTagClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Replaces the existing tags on a Meeting with a newly provided list.
     * A tag is a connection between a Meeting and a Tag. Each Meeting can have zero, one or many tags.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The replacement list of tags for this Meeting
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> replaceMeetingTags(@NotNull String meetingId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "POST", "/api/data/meetings/{meetingId}/tags");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Add one or more tags to a Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The tags to add
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> addtagstoMeeting(@NotNull String meetingId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "PUT", "/api/data/meetings/{meetingId}/tags");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Removes one or more tags from a Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @param body The tags to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removetagsfromMeeting(@NotNull String meetingId, @NotNull NameDto[] body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/meetings/{meetingId}/tags");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Returns the list of tags assigned to the specified Meeting.
     *
     * @param meetingId The unique identifier of the Meeting
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> retrievetagsforaMeeting(@NotNull String meetingId)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "GET", "/api/data/meetings/{meetingId}/tags");
        r.AddPath("{meetingId}", meetingId == null ? "" : meetingId.toString());
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }
}
