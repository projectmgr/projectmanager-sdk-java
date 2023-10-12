
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
import ProjectManager.SDK.models.GetProjectFieldsResponseDto;
import ProjectManager.SDK.models.CreateProjectFieldResponseDto;
import ProjectManager.SDK.models.CreateProjectFieldDto;
import ProjectManager.SDK.models.DeleteProjectFieldDto;

import ProjectManager.SDK.models.UpdateProjectFieldValueDto;

/**
 * Contains all methods related to ProjectField
 */
public class ProjectFieldClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectField API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
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
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<GetProjectFieldsResponseDto[]> retrieveProjectFields()
    {
        RestRequest<AstroResult<GetProjectFieldsResponseDto[]>> r = new RestRequest<AstroResult<GetProjectFieldsResponseDto[]>>(this.client, "GET", "/api/data/projects/fields");
        return r.Call(new TypeToken<AstroResult<GetProjectFieldsResponseDto[]>>() {}.getType());
    }

    /**
     * Creates a new ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param body Information about the ProjectField to create
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<CreateProjectFieldResponseDto> createProjectField(@NotNull CreateProjectFieldDto body)
    {
        RestRequest<AstroResult<CreateProjectFieldResponseDto>> r = new RestRequest<AstroResult<CreateProjectFieldResponseDto>>(this.client, "POST", "/api/data/projects/fields");
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<CreateProjectFieldResponseDto>>() {}.getType());
    }

    /**
     * Deletes an existing ProjectField within your Workspace.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param body The identity of the ProjectField to delete
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteProjectField(@NotNull DeleteProjectFieldDto body)
    {
        RestRequest<AstroResult<Object>> r = new RestRequest<AstroResult<Object>>(this.client, "DELETE", "/api/data/projects/fields");
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Updates an existing ProjectField with new information.
     *
     * A ProjectField is a custom field defined within your Workspace.  You can define ProjectFields for any integration purpose that is important to your business.  Each ProjectField has a data type as well as options in how it is handled.  ProjectFields can be edited for each Project within your Workspace.
     *
     * @param projectId The unique identifier of the Project that contains this ProjectField
     * @param fieldId The unique identifier of this ProjectField
     * @param body The new information for this ProjectField
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> updateProjectField(@NotNull String projectId, @NotNull String fieldId, @NotNull UpdateProjectFieldValueDto body)
    {
        RestRequest<AstroResult<Object>> r = new RestRequest<AstroResult<Object>>(this.client, "PUT", "/api/data/projects/{projectId}/fields/{fieldId}");
        r.AddPath("{projectId}", projectId.toString());
        r.AddPath("{fieldId}", fieldId.toString());
        r.AddBody(body);
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
