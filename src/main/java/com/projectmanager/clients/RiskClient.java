
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
}
