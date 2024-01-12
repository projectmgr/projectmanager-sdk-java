
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
import com.projectmanager.models.ProjectCustomerDto;

/**
 * Contains all methods related to ProjectCustomer
 */
public class ProjectCustomerClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectCustomer API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectCustomerClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectCustomers defined within your Workspace.
     *
     * A ProjectCustomer is a code used to identify customers associated with your Projects.  Each ProjectCustomer has a name and a unique identifier.  ProjectCustomers are defined per Workspace and are shared among Projects.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectCustomerDto[]> retrieveProjectCustomers()
    {
        RestRequest<ProjectCustomerDto[]> r = new RestRequest<ProjectCustomerDto[]>(this.client, "GET", "/api/data/projects/customers");
        return r.Call(new TypeToken<AstroResult<ProjectCustomerDto[]>>() {}.getType());
    }
}
