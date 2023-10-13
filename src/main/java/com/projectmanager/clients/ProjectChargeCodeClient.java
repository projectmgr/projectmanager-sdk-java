
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
import com.projectmanager.models.ProjectChargeCodeDto;

/**
 * Contains all methods related to ProjectChargeCode
 */
public class ProjectChargeCodeClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectChargeCode API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectChargeCodeClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve all defined ChargeCodes that can be used when creating Tasks.
     *
     * A ChargeCode is a code used to identify costs within your Projects.  Each ChargeCode has a name and a unique identifier.  ChargeCodes are defined per Workspace and are shared among Projects.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectChargeCodeDto[]> retrieveChargeCodes()
    {
        RestRequest<ProjectChargeCodeDto[]> r = new RestRequest<ProjectChargeCodeDto[]>(this.client, "GET", "/api/data/projects/chargecodes");
        return r.Call(new TypeToken<AstroResult<ProjectChargeCodeDto[]>>() {}.getType());
    }
}
