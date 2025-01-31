
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
import com.projectmanager.models.UserRoleDto;

/**
 * Contains all methods related to UserRole
 */
public class UserRoleClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the UserRole API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public UserRoleClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the list of UserRoles defined within this Workspace.
     *
     * A UserRole is a name for a privilege level granted to a specific User.  The 'Global Admin'
     * UserRole is granted to the owner of the Workspace, and this UserRole cannot be changed.
     * You can choose which UserRole applies to a User within your Workspace.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<UserRoleDto[]> retrieveUserRoles()
    {
        RestRequest<UserRoleDto[]> r = new RestRequest<UserRoleDto[]>(this.client, "GET", "/api/data/users/roles");
        return r.Call(new TypeToken<AstroResult<UserRoleDto[]>>() {}.getType());
    }
}
