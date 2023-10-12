
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
import ProjectManager.SDK.models.IntegrationCategoryDto;

/**
 * Contains all methods related to IntegrationCategory
 */
public class IntegrationCategoryClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the IntegrationCategory API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public IntegrationCategoryClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the list of available IntegrationProvider categories.
     *
     * An IntegrationProvider is the name of an external application or service that can be connected to ProjectManager.com.  The Integrations API is intended for use by ProjectManager and its business development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationCategoryDto[]> retrieveProviderCategories()
    {
        RestRequest<IntegrationCategoryDto[]> r = new RestRequest<IntegrationCategoryDto[]>(this.client, "GET", "/api/data/integrations/categories");
        return r.Call();
    }
}
