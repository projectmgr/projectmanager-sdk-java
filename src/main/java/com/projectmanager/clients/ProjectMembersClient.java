
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
import com.projectmanager.models.ProjectMemberDto;
import com.projectmanager.models.ProjectAccessDto;

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
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to
     * the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveNewProjectMembers()
    {
        RestRequest<ProjectMemberDto[]> r = new RestRequest<ProjectMemberDto[]>(this.client, "GET", "/api/data/projects/members");
        return r.Call(new TypeToken<AstroResult<ProjectMemberDto[]>>() {}.getType());
    }

    /**
     * Returns a list of project permissions the user is a member of
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectAccessDto[]> retrieveProjectstheuserisamemberof()
    {
        RestRequest<ProjectAccessDto[]> r = new RestRequest<ProjectAccessDto[]>(this.client, "GET", "/api/data/projects/membership");
        return r.Call(new TypeToken<AstroResult<ProjectAccessDto[]>>() {}.getType());
    }

    /**
     * Returns a list of users that are currently members of a specified project, as well as their current project security roles and available project security roles.
     * Optionally include users who are not currently members of the project, but who can be added.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to
     * the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
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
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to
     * the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
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
     * Creates or updates (upserts) a user's membership in a specified project. If the user is not yet a member they
     * are added; if they are already a member their project security role is replaced.
     *
     * The role is optional. When the role is omitted for a new member, a default role is applied based on the user's
     * workspace access: users who can edit all projects become a Manager, guest users become a Guest, and everyone
     * else becomes an Editor. When the role is omitted for a user who is already a member, their current role is left
     * unchanged.
     *
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to
     * the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to set. The role is optional.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> createOrUpdateUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
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
     * A project member is a user who has access to a specific project. Project members are assigned a project security role, which controls the level of access they have to
     * the project. Possible project security roles include manage, edit, collaborate, creator, and guest.
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
