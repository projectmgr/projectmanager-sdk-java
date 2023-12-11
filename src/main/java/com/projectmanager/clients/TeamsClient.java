
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
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;


/**
 * Contains all methods related to Teams
 */
public class TeamsClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Teams API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TeamsClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves zip file for teams integrations.
     *
     * The Teams API is intended for use by ProjectManager and its business development partners.  Please
     * contact ProjectManager's sales team to request use of this API.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<byte[]> retrievezipfileforTeamsIntegrations()
    {
        BlobRequest r = new BlobRequest(this.client, "GET", "/api/data/integrations/teams/application");
        return r.Call(new TypeToken<AstroResult<byte[]>>() {}.getType());
    }
}
