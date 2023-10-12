
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
import ProjectManager.SDK.models.ProjectCustomerDto;

/**
 * Contains all methods related to ProjectCustomer
 */
public class ProjectCustomerClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectCustomer API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public ProjectCustomerClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectCustomers defined within your Workspace.
     *
     * A ProjectCustomer is a code used to identify costs within your Projects.  Each ProjectCustomer has a name and a unique identifier.  ChargeCodes are defined per Workspace and are shared among Projects.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectCustomerDto[]> retrieveProjectCustomers()
    {
        RestRequest<AstroResult<ProjectCustomerDto[]>> r = new RestRequest<AstroResult<ProjectCustomerDto[]>>(this.client, "GET", "/api/data/projects/customers");
        return r.Call(new TypeToken<AstroResult<ProjectCustomerDto[]>>() {}.getType());
    }
}
