
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
import com.projectmanager.models.ProjectMemberDto;

import com.projectmanager.models.ProjectMemberRoleDto;

/**
 * Contains all methods related to ProjectMembers
 */
public class ProjectMembersClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectMembers API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectMembersClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns a list of users that can be added as members of a new project, as well as their available project security roles.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveNewProjectMembers()
    {
        RestRequest<ProjectMemberDto[]> r = new RestRequest<ProjectMemberDto[]>(this.client, "GET", "/api/data/projects/members");
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto[]>>() {}.getType());
    }

    /**
     * Returns a list of users that are currently members of a specified project, as well as their current project security roles and available project security roles. Optionally include users who are not currently members of the project, but who are available to be added.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference to the project
     * @param includeAllUsers Set to true to include all users in the workspace
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveProjectMembers(@NotNull String projectId, @Nullable Boolean includeAllUsers)
    {
        RestRequest<ProjectMemberDto[]> r = new RestRequest<ProjectMemberDto[]>(this.client, "GET", "/api/data/projects/{projectId}/members");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (includeAllUsers != null) { r.AddQuery("includeAllUsers", includeAllUsers.toString()); }
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto[]>>() {}.getType());
    }

    /**
     * Returns the project security role in a specified project for a current project member.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference of Project
     * @param userId Reference of User
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> retrieveUserProjectMembership(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "GET", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{userId}", userId == null ? "" : userId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Creates a membership for a user in a specified project, and assigns the user the appropriate project access based on the specified project security role.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to set
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> createUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "POST", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{userId}", userId == null ? "" : userId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Updates the project access for a current member of a specified project by giving the user a new project security role.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> updateUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "PUT", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{userId}", userId == null ? "" : userId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto>>() {}.getType());
    }

    /**
     * Removes a current project member from a specified project. This removes the user's access to that project.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeUserProjectMembership(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{userId}", userId == null ? "" : userId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
