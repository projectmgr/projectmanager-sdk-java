
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
import com.projectmanager.models.WorkSpaceDto;
import com.projectmanager.models.WorkspaceSettingsUpdateDto;

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
     * Returns the workspace the user is currently logged on to as a single-item list.
     *
     * This endpoint does not return every workspace the user can access. To switch workspaces
     * or list all accessible workspaces, use workspace selection flows (for example `/api/data/me`
     * and the workspace selector).
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<WorkSpaceDto[]> retrievecurrentworkspace()
    {
        RestRequest<WorkSpaceDto[]> r = new RestRequest<WorkSpaceDto[]>(this.client, "GET", "/api/data/workspaces");
        return r.Call(new TypeToken<AstroResult<WorkSpaceDto[]>>() {}.getType());
    }

    /**
     * Updates workspace-level scheduling defaults for the workspace the user is currently logged on to,
     * including default planned hours and working-day hours (Monday through Sunday).
     *
     * Only properties included in the request body are updated; omitted properties are left unchanged.
     * When workingDays is provided, only the weekdays included in that object are updated.
     *
     * Values must be between 0 and 24.
     *
     * @param body Workspace settings to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<WorkSpaceDto> updatecurrentworkspacesettings(@NotNull WorkspaceSettingsUpdateDto body)
    {
        RestRequest<WorkSpaceDto> r = new RestRequest<WorkSpaceDto>(this.client, "PUT", "/api/data/workspaces/settings");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<WorkSpaceDto>>() {}.getType());
    }
}
