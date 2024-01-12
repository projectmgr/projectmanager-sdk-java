
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
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
import com.projectmanager.models.WorkSpaceDto;

import com.projectmanager.models.WorkSpaceJoinDto;

/**
 * Contains all methods related to WorkSpace
 */
public class WorkSpaceClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the WorkSpace API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public WorkSpaceClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve the list of Workspaces to which the currently logged on user has access.
     *
     * A single User may have access to multiple Workspaces, although they can only be logged on to one Workspace at a time.  This API lists all Workspaces to which the currently logged on user is entitled to access.  To determine which Workspace a user is currently logged on use the `/api/data/me` endpoint.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<WorkSpaceDto[]> retrieveWorkspaces()
    {
        RestRequest<WorkSpaceDto[]> r = new RestRequest<WorkSpaceDto[]>(this.client, "GET", "/api/data/workspaces");
        return r.Call(new TypeToken<AstroResult<WorkSpaceDto[]>>() {}.getType());
    }

    /**
     * Invite a specific user to join a Workspace to which the current user has administrator rights.
     *
     * A single User may have access to multiple Workspaces, although they can only be logged on to one Workspace at a time.  This API lists all Workspaces to which the currently logged on user is entitled to access.  To determine which Workspace a user is currently logged on use the `/api/data/me` endpoint.
     *
     * This API allows you to invite a specific  an invitation to join a specific Workspace.
     *
     * @param organizationId The unique identifier of the Organization that you are inviting a User to joi
     * @param body Information about the user which will receive the invitation
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> invitetoWorkspace(@NotNull String organizationId, @NotNull WorkSpaceJoinDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "POST", "/api/data/workspaces/{organizationId}/join");
        r.AddPath("{organizationId}", organizationId == null ? "" : organizationId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
