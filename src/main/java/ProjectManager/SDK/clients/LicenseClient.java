
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
import ProjectManager.SDK.models.LicenseDto;


/**
 * Contains all methods related to License
 */
public class LicenseClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the License API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public LicenseClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve information about the current licenses possessed by this Workspace.
     *
     * Licenses contain information about your current subscription level and features that have been enabled on your Workspace.  To modify the License information, please log on to the ProjectManager.com application and use the Account | Editions screen to review or update your Licenses.
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<LicenseDto[]> retrieveLicenses()
    {
        RestRequest<LicenseDto[]> r = new RestRequest<LicenseDto[]>(this.client, "GET", "/api/data/license");
        return r.Call();
    }

    /**
     * Adds a new License to the current Workspace.
     *
     * Licenses contain information about your current subscription level and features that have been enabled on your Workspace.  To modify the License information, please log on to the ProjectManager.com application and use the Account | Editions screen to review or update your Licenses.
     *
     * @param bundleSku Information about the SKU you wish to add to your Workspace
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<LicenseDto[]> addLicense(@NotNull String bundleSku)
    {
        RestRequest<LicenseDto[]> r = new RestRequest<LicenseDto[]>(this.client, "POST", "/api/data/license/{bundleSku}/try");
        r.AddPath("{bundleSku}", bundleSku.toString());
        return r.Call();
    }
}
