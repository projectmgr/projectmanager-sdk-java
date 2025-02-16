
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
     * A single User may have access to multiple Workspaces, although they can only be logged on
     * to one Workspace at a time.  This API lists all Workspaces to which the currently logged on
     * user is entitled to access.  To determine which Workspace a user is currently logged on
     * use the `/api/data/me` endpoint.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<WorkSpaceDto[]> retrieveWorkspaces()
    {
        RestRequest<WorkSpaceDto[]> r = new RestRequest<WorkSpaceDto[]>(this.client, "GET", "/api/data/workspaces");
        return r.Call(new TypeToken<AstroResult<WorkSpaceDto[]>>() {}.getType());
    }
}
