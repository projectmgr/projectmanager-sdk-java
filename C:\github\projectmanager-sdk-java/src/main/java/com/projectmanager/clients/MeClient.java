
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
import com.projectmanager.models.WorkSpaceUserInfoDto;

/**
 * Contains all methods related to Me
 */
public class MeClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Me API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public MeClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve information about the currently logged on user.
     *
     * This API call will always succeed with a 200 OK if called with valid authentication information.
     * If the authentication information provided is not valid, calling this API will return a 401
     * Authentication Failed error message.  If successful, this API returns information about the user
     * including its home URL, email address, user name, and workspace name.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<WorkSpaceUserInfoDto> retrieveMe()
    {
        RestRequest<WorkSpaceUserInfoDto> r = new RestRequest<WorkSpaceUserInfoDto>(this.client, "GET", "/api/data/me");
        return r.Call(new TypeToken<AstroResult<WorkSpaceUserInfoDto>>() {}.getType());
    }
}
