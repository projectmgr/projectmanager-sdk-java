
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
import com.projectmanager.models.ProjectVersionDto;


/**
 * Contains all methods related to ProjectVersion
 */
public class ProjectVersionClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectVersion API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectVersionClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns projects versions including version, user who made changes
     *
     * @param projectId The unique identifier of the Project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectVersionDto[]> retrieveProjectVersions(@NotNull String projectId)
    {
        RestRequest<ProjectVersionDto[]> r = new RestRequest<ProjectVersionDto[]>(this.client, "GET", "/api/data/projects/{projectId}/versions");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<ProjectVersionDto[]>>() {}.getType());
    }

    /**
     * Exports and returns project version as an MS Project XML attachment
     *
     * @param projectChangeId Project change Guid
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<byte[]> downloadMSProjectXml(@NotNull String projectChangeId)
    {
        BlobRequest r = new BlobRequest(this.client, "GET", "/api/data/projects/{projectChangeId}/version/download");
        r.AddPath("{projectChangeId}", projectChangeId == null ? "" : projectChangeId.toString());
        return r.Call(new TypeToken<AstroResult<byte[]>>() {}.getType());
    }

    /**
     * Restores a Project to the state it was in at a specific Version in time.
     *
     * If successful, all changes made to the Project since this Version will be undone and the Project will
     * return to its former state.
     *
     * @param projectId The unique identifier of the Project to restore
     * @param version The version number to restore to
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> restoreProjectVersion(@NotNull String projectId, @NotNull Integer version)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "POST", "/api/data/projects/{projectId}/version/{version}/restore");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{version}", version == null ? "" : version.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Create a Copy of a Project as of a specific Version, optionally moving it to a new Timezone.
     *
     * @param projectId The unique identifier of the Project to copy
     * @param version The version number of the Project to copy
     * @param timezoneOffset If specified, sets the default timezone of the newly copied Project to this specified timezone
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> copyProjectVersion(@NotNull String projectId, @NotNull Integer version, @Nullable Integer timezoneOffset)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "POST", "/api/data/projects/{projectId}/version/{version}/copy");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        r.AddPath("{version}", version == null ? "" : version.toString());
        if (timezoneOffset != null) { r.AddQuery("timezoneOffset", timezoneOffset.toString()); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
