
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


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
     * Returns a list of membership options for new projects.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveNewProjectMembers()
    {
        RestRequest<ProjectMemberDto[]> r = new RestRequest<ProjectMemberDto[]>(this.client, "GET", "/api/data/projects/members");
        return r.Call();
    }

    /**
     * Returns a list of membership options for existing members. Optionally include users who are not a member yet.
     *
     * @param projectId Reference to the project
     * @param includeAllUsers Set to true to include all users in the workspace
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto[]> retrieveProjectMembers(@NotNull String projectId, @Nullable Boolean includeAllUsers)
    {
        RestRequest<ProjectMemberDto[]> r = new RestRequest<ProjectMemberDto[]>(this.client, "GET", "/api/data/projects/{projectId}/members");
        r.AddPath("{projectId}", projectId.toString());
        r.AddQuery("includeAllUsers", includeAllUsers.toString());
        return r.Call();
    }

    /**
     * Return the membership of a project for a user.
     *
     * @param projectId Reference of Project
     * @param userId Reference of User
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> retrieveUserProjectMemberShip(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "GET", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        return r.Call();
    }

    /**
     * Creates a membership for a user in a project and assigns the user appropriate permissions
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to set
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> createUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "POST", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Update existing Project Access Control for user for project
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @param body The permission to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectMemberDto> updateUserProjectMembership(@NotNull String projectId, @NotNull String userId, @NotNull ProjectMemberRoleDto body)
    {
        RestRequest<ProjectMemberDto> r = new RestRequest<ProjectMemberDto>(this.client, "PUT", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Deletes Project Member
     *
     * @param projectId Reference to Project
     * @param userId Reference to User
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeUserProjectMembership(@NotNull String projectId, @NotNull String userId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/{projectId}/members/{userId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{userId}", userId.toString());
        return r.Call();
    }
}
