
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

import com.projectmanager.models.TaskMetadataUpdateDto;
import com.projectmanager.models.TaskMetadataSearchDto;

/**
 * Contains all methods related to TaskMetadata
 */
public class TaskMetadataClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the TaskMetadata API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TaskMetadataClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Adds a metadata to a task
     *
     * @param taskId Task ID
     * @param isSystem If metadata is for system or customer, isSystem = true is only of ProjectManager
     * @param isOverride If false we merge with the keys
     * @param body The metadata
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> addMetadata(@NotNull String taskId, @Nullable Boolean isSystem, @Nullable Boolean isOverride, @NotNull TaskMetadataUpdateDto body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "PUT", "/api/data/tasks/{taskId}/metadata");
        r.AddPath("{taskId}", taskId == null ? "" : taskId.toString());
        if (isSystem != null) { r.AddQuery("isSystem", isSystem.toString()); }
        if (isOverride != null) { r.AddQuery("isOverride", isOverride.toString()); }
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     *
     * @param foreignKey Foreign Key ID
     * @param projectId Project ID
     * @param isSystem If metadata is for system or customer, isSystem = true is only of ProjectManager
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskMetadataSearchDto[]> gettasksbyprojectIDandforeignkeyID(@Nullable String foreignKey, @NotNull String projectId, @Nullable Boolean isSystem)
    {
        RestRequest<TaskMetadataSearchDto[]> r = new RestRequest<TaskMetadataSearchDto[]>(this.client, "GET", "/api/data/projects/{projectId}/tasks/metadata");
        if (foreignKey != null) { r.AddQuery("foreignKey", foreignKey.toString()); }
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (isSystem != null) { r.AddQuery("isSystem", isSystem.toString()); }
        return r.Call(new TypeToken<AstroResult<TaskMetadataSearchDto[]>>() {}.getType());
    }
}
