
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
import ProjectManager.SDK.models.DashboardSettingDto;
import ProjectManager.SDK.models.DashboardSettingCreateDto;

/**
 * Contains all methods related to Dashboard
 */
public class DashboardClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Dashboard API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public DashboardClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns user dashboard settings
     *
     * @param type The dashboard type that is not custom
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<DashboardSettingDto> retrieveDashboardUserSettings(@NotNull String type)
    {
        RestRequest<DashboardSettingDto> r = new RestRequest<DashboardSettingDto>(this.client, "GET", "/api/data/dashboards/settings/{type}");
        r.AddPath("{type}", type.toString());
        return r.Call();
    }

    /**
     * Create or Update User Dashboard Settings
     *
     * @param body User dashboard settings object
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<DashboardSettingDto> createorUpdateUserDashboardSettings(@NotNull DashboardSettingCreateDto body)
    {
        RestRequest<DashboardSettingDto> r = new RestRequest<DashboardSettingDto>(this.client, "POST", "/api/data/dashboards/settings");
        r.AddBody(body);
        return r.Call();
    }
}
