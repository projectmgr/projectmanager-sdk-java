
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
import com.projectmanager.models.NptDto;

import com.projectmanager.models.NptUpdateDto;
import com.projectmanager.models.NptCreateDto;

/**
 * Contains all methods related to Npt
 */
public class NptClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Npt API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Gets a Npt
     *
     * @param nptId the id of the npt
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptDto> getNpt(@NotNull String nptId)
    {
        RestRequest<NptDto> r = new RestRequest<NptDto>(this.client, "GET", "/api/data/non-project-tasks/{nptId}");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        return r.Call(new TypeToken<AstroResult<NptDto>>() {}.getType());
    }

    /**
     * Update a Npt
     *
     * @param nptId the id of the npt
     * @param body the fields to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptDto> updateNpt(@NotNull String nptId, @NotNull NptUpdateDto body)
    {
        RestRequest<NptDto> r = new RestRequest<NptDto>(this.client, "PUT", "/api/data/non-project-tasks/{nptId}");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<NptDto>>() {}.getType());
    }

    /**
     * Remove Npt
     *
     * @param nptId the id of the npt to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeNpt(@NotNull String nptId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/{nptId}");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Creates a new Npt
     *
     * @param body The data used to create the Npt
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptDto> createNpt(@NotNull NptCreateDto body)
    {
        RestRequest<NptDto> r = new RestRequest<NptDto>(this.client, "POST", "/api/data/non-project-tasks");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<NptDto>>() {}.getType());
    }
}
