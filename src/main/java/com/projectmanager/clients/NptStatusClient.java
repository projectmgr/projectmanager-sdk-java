
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
import com.projectmanager.models.NptStatusDto;
import com.projectmanager.models.NptStatusCreateDto;

import com.projectmanager.models.NptStatusUpdateDto;

/**
 * Contains all methods related to NptStatus
 */
public class NptStatusClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptStatus API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptStatusClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Get a list of task statuses that can be used by non-protect tasks.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptStatusDto[]> getNptTaskStatuses()
    {
        RestRequest<NptStatusDto[]> r = new RestRequest<NptStatusDto[]>(this.client, "GET", "/api/data/non-project-tasks/statuses");
        return r.Call(new TypeToken<AstroResult<NptStatusDto[]>>() {}.getType());
    }

    /**
     * Creates a new status level for non-project tasks.
     *
     * @param body Information about the new status level to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptStatusDto> createNptTaskStatus(@NotNull NptStatusCreateDto body)
    {
        RestRequest<NptStatusDto> r = new RestRequest<NptStatusDto>(this.client, "POST", "/api/data/non-project-tasks/statuses");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<NptStatusDto>>() {}.getType());
    }

    /**
     * Updates an existing status level for non-project tasks.
     *
     * @param nptStatusId The unique identifier of the status to update
     * @param body Information about the status level to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptStatusDto> updateNptTaskStatus(@NotNull String nptStatusId, @NotNull NptStatusUpdateDto body)
    {
        RestRequest<NptStatusDto> r = new RestRequest<NptStatusDto>(this.client, "PUT", "/api/data/non-project-tasks/statuses/{nptStatusId}");
        r.AddPath("{nptStatusId}", nptStatusId == null ? "" : nptStatusId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<NptStatusDto>>() {}.getType());
    }

    /**
     * Deletes an existing status level for non-project tasks.
     *
     * You will not be able to delete a status if there are tasks assigned to it
     * or if it is the default status level.
     *
     * @param nptStatusId The unique identifier of the status to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteNptTaskStatus(@NotNull String nptStatusId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/statuses/{nptStatusId}");
        r.AddPath("{nptStatusId}", nptStatusId == null ? "" : nptStatusId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
