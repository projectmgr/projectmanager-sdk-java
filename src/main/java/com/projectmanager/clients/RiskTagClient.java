
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
import com.projectmanager.models.TaskTagDto;

import com.projectmanager.models.NameDto;

/**
 * Contains all methods related to RiskTag
 */
public class RiskTagClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the RiskTag API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public RiskTagClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Replaces the existing tags on a Risk with a newly provided list.
     * A tag is a connection between a Risk and a Tag. Each Risk can have zero, one or many tags.
     *
     * @param riskId The unique identifier of the Risk
     * @param body The replacement list of tags for this Risk
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> replaceRiskTags(@NotNull String riskId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "POST", "/api/data/risks/{riskId}/tags");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Add one or more tags to a Risk.
     *
     * @param riskId The unique identifier of the Risk
     * @param body The tags to add
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> addtagstoRisk(@NotNull String riskId, @NotNull NameDto[] body)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "PUT", "/api/data/risks/{riskId}/tags");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }

    /**
     * Removes one or more tags from a Risk.
     *
     * @param riskId The unique identifier of the Risk
     * @param body The tags to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removetagsfromRisk(@NotNull String riskId, @NotNull NameDto[] body)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/risks/{riskId}/tags");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Returns the list of tags assigned to the specified Risk.
     *
     * @param riskId The unique identifier of the Risk
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TaskTagDto[]> retrievetagsforaRisk(@NotNull String riskId)
    {
        RestRequest<TaskTagDto[]> r = new RestRequest<TaskTagDto[]>(this.client, "GET", "/api/data/risks/{riskId}/tags");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        return r.Call(new TypeToken<AstroResult<TaskTagDto[]>>() {}.getType());
    }
}
