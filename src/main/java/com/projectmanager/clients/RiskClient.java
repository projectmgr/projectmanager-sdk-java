
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
import com.projectmanager.models.RiskDetailsDto;

import com.projectmanager.models.RiskDto;
import com.projectmanager.models.RiskUpdateDto;
import com.projectmanager.models.RiskCreateDto;
import com.projectmanager.models.ExportDto;
import com.projectmanager.models.RiskExportSettingsDto;

/**
 * Contains all methods related to Risk
 */
public class RiskClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Risk API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public RiskClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a Risk by its unique identifier or by its short ID.
     * A Risk has both a unique identifier (GUID) and a short ID
     * that is unique within a Workspace.
     *
     * @param riskId The id of the risk
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RiskDetailsDto> getRisk(@NotNull String riskId)
    {
        RestRequest<RiskDetailsDto> r = new RestRequest<RiskDetailsDto>(this.client, "GET", "/api/data/risks/{riskId}");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        return r.Call(new TypeToken<AstroResult<RiskDetailsDto>>() {}.getType());
    }

    /**
     * Updates an existing Risk.
     *
     * Only the fields provided in the request body will be updated.
     * Fields omitted from the request will remain unchanged.
     *
     * Authorization is enforced to ensure the caller has access
     * to modify the specified Risk.
     *
     * @param riskId The id of the risk
     * @param body The fields to update
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RiskDto> updateRisk(@NotNull String riskId, @NotNull RiskUpdateDto body)
    {
        RestRequest<RiskDto> r = new RestRequest<RiskDto>(this.client, "PUT", "/api/data/risks/{riskId}");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RiskDto>>() {}.getType());
    }

    /**
     * Permanently removes the specified Risk.
     *
     * This operation cannot be undone. Any related references
     * (such as links, history, or notifications) will be handled
     * according to system rules.
     *
     * Authorization is enforced to ensure the caller has permission
     * to delete the Risk.
     *
     * @param riskId The id of the risk to remove
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeRisk(@NotNull String riskId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/risks/{riskId}");
        r.AddPath("{riskId}", riskId == null ? "" : riskId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Retrieves all Risks associated with the specified Project.
     *
     * This endpoint returns a flat list of Risk summaries (not details)
     * and does not use OData. Results are scoped to the Project and
     * respect feature flags such as Hourly Rates.
     *
     * @param projectId The id of the project
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RiskDetailsDto[]> getRisksforProject(@NotNull String projectId)
    {
        RestRequest<RiskDetailsDto[]> r = new RestRequest<RiskDetailsDto[]>(this.client, "GET", "/api/data/risks/projects/{projectId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        return r.Call(new TypeToken<AstroResult<RiskDetailsDto[]>>() {}.getType());
    }

    /**
     * Creates a new Risk within the specified Project.
     *
     * The Risk will inherit Project context such as access permissions
     * and workspace ownership. Validation is applied to ensure the
     * Project exists and the caller has permission to create Risks.
     *
     * @param projectId The id of the project
     * @param body The data used to create the Risk
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RiskDto> createRisk(@NotNull String projectId, @NotNull RiskCreateDto body)
    {
        RestRequest<RiskDto> r = new RestRequest<RiskDto>(this.client, "POST", "/api/data/risks/{projectId}");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RiskDto>>() {}.getType());
    }

    /**
     * Initiates a new Export action for Risks.
     *
     * Returns the identifier of this Risk Export.
     *
     * @param projectId The unique identifier of the Project for which to export Risks
     * @param body The settings to use for this export action
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ExportDto> createRiskExport(@NotNull String projectId, @NotNull RiskExportSettingsDto body)
    {
        RestRequest<ExportDto> r = new RestRequest<ExportDto>(this.client, "POST", "/api/data/projects/{projectId}/risks/export");
        r.AddPath("{projectId}", projectId == null ? "" : projectId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ExportDto>>() {}.getType());
    }

    /**
     * Retrieve a list of risks that match an [OData formatted query](https://www.odata.org/).
     *
     * A Risk represents a tracked item of concern for a project.  Risks may be categorized as Changes, Risks,
     * Assumptions, Issues, or Dependencies.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RiskDto[]> queryRisks(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<RiskDto[]> r = new RestRequest<RiskDto[]>(this.client, "GET", "/api/data/risks");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<RiskDto[]>>() {}.getType());
    }
}
