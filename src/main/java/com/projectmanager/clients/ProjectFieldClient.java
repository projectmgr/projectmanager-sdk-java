
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
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.GetProjectFieldsResponseDto;
import com.projectmanager.models.CreateProjectFieldResponseDto;
import com.projectmanager.models.CreateProjectFieldDto;
import com.projectmanager.models.DeleteProjectFieldDto;

import com.projectmanager.models.UpdateProjectFieldValueDto;
import com.projectmanager.models.ProjectFieldsValueResponseDto;

/**
 * Contains all methods related to ProjectField
 */
public class ProjectFieldClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectField API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectFieldClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectFields defined within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<GetProjectFieldsResponseDto[]> retrieveProjectFields(@Nullable Object xintegrationname)
    {
        RestRequest<GetProjectFieldsResponseDto[]> r = new RestRequest<GetProjectFieldsResponseDto[]>(this.client, "GET", "/api/data/projects/fields");
        return r.Call(new TypeToken<AstroResult<GetProjectFieldsResponseDto[]>>() {}.getType());
    }

    /**
     * Creates a new ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body Information about the ProjectField to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<CreateProjectFieldResponseDto> createProjectField(@Nullable Object xintegrationname, @NotNull CreateProjectFieldDto body)
    {
        RestRequest<CreateProjectFieldResponseDto> r = new RestRequest<CreateProjectFieldResponseDto>(this.client, "POST", "/api/data/projects/fields");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<CreateProjectFieldResponseDto>>() {}.getType());
    }

    /**
     * Deletes an existing ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body The identity of the ProjectField to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProjectField(@Nullable Object xintegrationname, @NotNull DeleteProjectFieldDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/fields");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Updates an existing ProjectField with new information.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param projectId The unique identifier of the Project that contains this ProjectField
     * @param fieldId The unique identifier of this ProjectField
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body The new information for this ProjectField
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateProjectField(@NotNull String projectId, @NotNull String fieldId, @Nullable Object xintegrationname, @NotNull UpdateProjectFieldValueDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/projects/{projectId}/fields/{fieldId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves the current ProjectField value for a particular Project and ProjectField.
     *
     * @param projectId The unique identifier of the Project of the value to retrieve
     * @param fieldId The unique identifier of the ProjectField of the value to retrieve
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldsValueResponseDto> retrieveProjectFieldValue(@NotNull String projectId, @NotNull String fieldId, @Nullable Object xintegrationname)
    {
        RestRequest<ProjectFieldsValueResponseDto> r = new RestRequest<ProjectFieldsValueResponseDto>(this.client, "GET", "/api/data/projects/{projectId}/fields/{fieldId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectFieldsValueResponseDto>>() {}.getType());
    }

    /**
     * Retrieves all ProjectField values for a particular Project.
     *
     * @param projectId The unique identifier of the Project for which we want ProjectField values
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldsValueResponseDto[]> retrieveAllProjectFieldValues(@NotNull String projectId, @Nullable Object xintegrationname)
    {
        RestRequest<ProjectFieldsValueResponseDto[]> r = new RestRequest<ProjectFieldsValueResponseDto[]>(this.client, "GET", "/api/data/projects/{projectId}/fields");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectFieldsValueResponseDto[]>>() {}.getType());
    }
}
