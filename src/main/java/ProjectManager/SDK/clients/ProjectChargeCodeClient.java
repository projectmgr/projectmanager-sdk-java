
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
import ProjectManager.SDK.models.ProjectChargeCodeDto;

/**
 * Contains all methods related to ProjectChargeCode
 */
public class ProjectChargeCodeClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectChargeCode API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
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
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectChargeCodeDto[]> retrieveChargeCodes()
    {
        RestRequest<AstroResult<ProjectChargeCodeDto[]>> r = new RestRequest<AstroResult<ProjectChargeCodeDto[]>>(this.client, "GET", "/api/data/projects/chargecodes");
        return r.Call(new TypeToken<AstroResult<ProjectChargeCodeDto[]>>() {}.getType());
    }
}
