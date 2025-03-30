
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
import com.projectmanager.models.NptStatusDto;

/**
 * Contains all methods related to NptStatus
 */
public class NptStatusClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptStatus API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptStatusClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Get a list of task statuses that can be used by npt tasks.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NptStatusDto[]> getNptTaskStatuses()
    {
        RestRequest<NptStatusDto[]> r = new RestRequest<NptStatusDto[]>(this.client, "GET", "/api/data/non-project-tasks/statuses");
        return r.Call(new TypeToken<AstroResult<NptStatusDto[]>>() {}.getType());
    }
}
