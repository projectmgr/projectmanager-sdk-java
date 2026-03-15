
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
import com.projectmanager.models.ProjectFieldDto;
import com.projectmanager.models.ProjectFieldCreateDto;

import com.projectmanager.models.UpdateProjectFieldValueDto;
import com.projectmanager.models.ProjectFieldValueDto;

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
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldDto[]> retrieveProjectFields()
    {
        RestRequest<ProjectFieldDto[]> r = new RestRequest<ProjectFieldDto[]>(this.client, "GET", "/api/data/projects/fields");
        return r.Call(new TypeToken<AstroResult<ProjectFieldDto[]>>() {}.getType());
    }

    /**
     * Creates a new ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @param body Information about the ProjectField to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldDto> createProjectField(@NotNull ProjectFieldCreateDto body)
    {
        RestRequest<ProjectFieldDto> r = new RestRequest<ProjectFieldDto>(this.client, "POST", "/api/data/projects/fields");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ProjectFieldDto>>() {}.getType());
    }

    /**
     * Deletes an existing ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @param fieldId The unique identifier or short ID of this ProjectField
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProjectField(@NotNull String fieldId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/projects/fields/{fieldId}");
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Sets or replaces the value of a ProjectField for a specific Project within your Workspace.
     * This updates the stored value (e.g. "High", "123", "2025-01-15") for that project–field combination,
     * not the field definition itself. Use UpdateProjectField or UpdateProjectFieldOptions to change
     * the field's name or dropdown options.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @param projectId The unique identifier of the Project for which to set this field value
     * @param fieldId The unique identifier or short ID of the ProjectField
     * @param body The new value for this ProjectField on the specified Project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateProjectFieldValue(@NotNull String projectId, @NotNull String fieldId, @NotNull UpdateProjectFieldValueDto body)
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
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @param projectId The unique identifier of the Project of the value to retrieve
     * @param fieldId The unique identifier or short ID of the ProjectField of the value to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldValueDto> retrieveProjectFieldValue(@NotNull String projectId, @NotNull String fieldId)
    {
        RestRequest<ProjectFieldValueDto> r = new RestRequest<ProjectFieldValueDto>(this.client, "GET", "/api/data/projects/{projectId}/fields/{fieldId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{fieldId}", fieldId == null ? "" : fieldId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectFieldValueDto>>() {}.getType());
    }

    /**
     * Retrieves all ProjectField values for a particular Project.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields
     * for any integration purpose that is important to your business.  Each ProjectField has a data
     * type as well as options in how it is handled.  ProjectFields can be edited for each Project
     * within your Workspace.
     *
     * @param projectId The unique identifier of the Project for which we want ProjectField values
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectFieldValueDto[]> retrieveAllProjectFieldValues(@NotNull String projectId)
    {
        RestRequest<ProjectFieldValueDto[]> r = new RestRequest<ProjectFieldValueDto[]>(this.client, "GET", "/api/data/projects/{projectId}/fields");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectFieldValueDto[]>>() {}.getType());
    }
}
