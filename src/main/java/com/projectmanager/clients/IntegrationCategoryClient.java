
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
import com.projectmanager.models.IntegrationCategoryDto;

/**
 * Contains all methods related to IntegrationCategory
 */
public class IntegrationCategoryClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the IntegrationCategory API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public IntegrationCategoryClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the list of available IntegrationProvider categories.
     *
     * An IntegrationProvider is the name of an external application or service that can be connected to
     * ProjectManager.com.  The Integrations API is intended for use by ProjectManager and its business
     * development partners.  Please contact ProjectManager's sales team to request use of this API.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<IntegrationCategoryDto[]> retrieveProviderCategories()
    {
        RestRequest<IntegrationCategoryDto[]> r = new RestRequest<IntegrationCategoryDto[]>(this.client, "GET", "/api/data/integrations/categories");
        return r.Call(new TypeToken<AstroResult<IntegrationCategoryDto[]>>() {}.getType());
    }
}
