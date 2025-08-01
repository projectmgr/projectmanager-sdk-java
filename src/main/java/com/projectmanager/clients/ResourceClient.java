
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
import com.projectmanager.models.ResourceDto;
import com.projectmanager.models.ResourceCreateDto;

import com.projectmanager.models.ResourceUpdateDto;
import com.projectmanager.models.ResourcesDto;
import com.projectmanager.models.ResourcesCreateDto;

/**
 * Contains all methods related to Resource
 */
public class ResourceClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Resource API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ResourceClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Create a new Resource within your Workspace.
     *
     * A Resource represents a person, material, or tool that is used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param body The details for the new Resource to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceDto> createResource(@NotNull ResourceCreateDto body)
    {
        RestRequest<ResourceDto> r = new RestRequest<ResourceDto>(this.client, "POST", "/api/data/resources");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceDto>>() {}.getType());
    }

    /**
     * Retrieve a list of Resources that match an [OData formatted query](https://www.odata.org/).
     *
     * A Resource represents a person, material, or tool that is used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceDto[]> queryResources(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ResourceDto[]> r = new RestRequest<ResourceDto[]>(this.client, "GET", "/api/data/resources");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<ResourceDto[]>>() {}.getType());
    }

    /**
     * Updates an existing Resource based on information you provide.
     *
     * A Resource represents a person, material, or tool that is used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param resourceId The id of the resource
     * @param body The information to update the resource
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceDto> updateResource(@NotNull String resourceId, @NotNull ResourceUpdateDto body)
    {
        RestRequest<ResourceDto> r = new RestRequest<ResourceDto>(this.client, "PUT", "/api/data/resources/{resourceId}");
        r.AddPath("{resourceId}", resourceId == null ? "" : resourceId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceDto>>() {}.getType());
    }

    /**
     * Retrieve the Resource matching the specified unique ID.
     *
     * A Resource represents a person, material, or tool that is used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param resourceId The id of the Resource
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceDto> retrieveResource(@NotNull String resourceId)
    {
        RestRequest<ResourceDto> r = new RestRequest<ResourceDto>(this.client, "GET", "/api/data/resources/{resourceId}");
        r.AddPath("{resourceId}", resourceId == null ? "" : resourceId.toString());
        return r.Call(new TypeToken<AstroResult<ResourceDto>>() {}.getType());
    }

    /**
     * Deletes an existing Resource based on information you provide.
     *
     * A Resource represents a person, material, or tool used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param resourceId The id of the resource
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceDto> deleteResource(@NotNull String resourceId)
    {
        RestRequest<ResourceDto> r = new RestRequest<ResourceDto>(this.client, "DELETE", "/api/data/resources/{resourceId}");
        r.AddPath("{resourceId}", resourceId == null ? "" : resourceId.toString());
        return r.Call(new TypeToken<AstroResult<ResourceDto>>() {}.getType());
    }

    /**
     * Create new Resources within your Workspace.
     *
     * A Resource represents a person, material, or tool that is used within your Projects.
     * When you attach a Resources to more than one Task, the software will schedule the usage
     * of your Resource so that it is not allocated to more than one Task at the same time.
     * The users in your Workspace are also considered Resources.  To invite a new User to your
     * Workspace, create a new Resource for that user.
     *
     * @param body The details for the new Resources to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourcesDto> createManyResources(@NotNull ResourcesCreateDto body)
    {
        RestRequest<ResourcesDto> r = new RestRequest<ResourcesDto>(this.client, "POST", "/api/data/resources/bulk");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourcesDto>>() {}.getType());
    }

    /**
     * Resend Invite Email to a Resource within your Workspace.
     *
     * When you create a Resource that is a person, ProjectManager sends that person an email inviting them to join
     * your Workspace.  If that email is accidentally deleted or sent to a spam folder, you can request this email
     * be sent again using this API.
     *
     * @param resourceId The unique identifier of the Resource to send an invitation email
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> resendInviteEmail(@NotNull String resourceId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "GET", "/api/data/resources/{resourceId}/resendinvite");
        r.AddPath("{resourceId}", resourceId == null ? "" : resourceId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
