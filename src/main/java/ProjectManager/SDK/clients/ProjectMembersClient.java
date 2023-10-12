
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package ProjectManager.SDK.clients;

import ProjectManager.SDK.ProjectManagerClient;
import ProjectManager.SDK.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ProjectManager.SDK.AstroResult;
import com.google.gson.reflect.TypeToken;
import ProjectManager.SDK.models.ProjectMemberDto;

import ProjectManager.SDK.models.ProjectMemberRoleDto;

/**
 * Contains all methods related to ProjectMembers
 */
public class ProjectMembersClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectMembers API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public ProjectMembersClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns a list of membership options for new projects.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveNewProjectMembers()
    {
        RestRequest<AstroResult<ProjectMemberDto[]>> r = new RestRequest<AstroResult<ProjectMemberDto[]>>(this.client, "GET", "/api/data/projects/members");
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto[]>>() {}.getType());
    }

    /**
     * Returns a list of membership options for existing members. Optionally include users who are not a member yet.
     *
     * @param projectId Reference to the project
     * @param includeAllUsers Set to true to include all users in the workspace
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveProjectMembers(@NotNull String projectId, @Nullable Boolean includeAllUsers)
    {
        RestRequest<AstroResult<ProjectMemberDto[]>> r = new RestRequest<AstroResult<ProjectMemberDto[]>>(this.client, "GET", "/api/data/projects/{projectId}/members");
        r.AddPath("{projectId}", projectId.toString());
        r.AddQuery("includeAllUsers", includeAllUsers.toString());
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto[]>>() {}.getType());
    }

    /**
     * Return the membership of a project for a user.
     *
     * @param projectId Reference of Project
     * @param userId Reference of User
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> retrieveUserProjectMemberShip(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<AstroResult<ProjectMemberDto>> r = new RestRequest<AstroResult<ProjectMemberDto>>(this.client, "GET", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Creates a membership for a user in a project and assigns the user appropriate permissions
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to set
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> createUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<AstroResult<ProjectMemberDto>> r = new RestRequest<AstroResult<ProjectMemberDto>>(this.client, "POST", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Update existing Project Access Control for user for project
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to update
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> updateUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<AstroResult<ProjectMemberDto>> r = new RestRequest<AstroResult<ProjectMemberDto>>(this.client, "PUT", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Deletes Project Member
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeUserProjectMembership(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<AstroResult<Object>> r = new RestRequest<AstroResult<Object>>(this.client, "DELETE", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
