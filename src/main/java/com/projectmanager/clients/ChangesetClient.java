
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
import com.projectmanager.models.ChangesetGetResponseDto;


/**
 * Contains all methods related to Changeset
 */
public class ChangesetClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Changeset API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ChangesetClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a Changeset by its unique ID.
     *
     * A Changeset is an individual edit that has been made to a project.  Since multiple users can edit a project at the same time, individual Changesets are applied in a sequential fashion. If a Changeset causes a conflict or cannot be applied, it will be rejected.  You can examine a Changeset to determine its conflict resolution status.
     *
     * When checking the status of a Changeset, you can call either RetrieveChangeset or RetrieveCompletedChangeset.  Using RetrieveChangeset will give you the immediate status of the Changeset.  Using RetrieveCompletedChangeset will delay the response until the Changeset has finished processing.
     *
     * @param changeSetId The unique ID number of the Changeset to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangesetGetResponseDto> retrieveChangeset(@NotNull String changeSetId)
    {
        RestRequest<ChangesetGetResponseDto> r = new RestRequest<ChangesetGetResponseDto>(this.client, "GET", "/api/data/changesets/{changeSetId}");
        r.AddPath("{changeSetId}", changeSetId == null ? "" : changeSetId.toString());
        return r.Call(new TypeToken<AstroResult<ChangesetGetResponseDto>>() {}.getType());
    }

    /**
     * Retrieve a Changeset by its unique ID. This endpoint waits for the Changeset to complete its processing prior to returning a result.
     *
     * A Changeset is an individual edit that has been made to a project.  Since multiple users can edit a project at the same time, individual Changesets are applied in a sequential fashion. If a Changeset causes a conflict or cannot be applied, it will be rejected.  You can examine a Changeset to determine its conflict resolution status.
     *
     * When checking the status of a Changeset, you can call either RetrieveChangeset or RetrieveCompletedChangeset.  Using RetrieveChangeset will give you the immediate status of the Changeset.  Using RetrieveCompletedChangeset will delay the response until the Changeset has finished processing.
     *
     * Although most Changesets complete instantly, some Changesets may need additional time to complete.  If the Changeset cannot be processed within a reasonable length of time, this API call may fail.  If this API fails, it will return a status error indicating the Changeset is still being processed.
     *
     * @param changeSetId The unique ID number of the Changeset to retrieve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ChangesetGetResponseDto> retrieveCompletedChangeset(@NotNull String changeSetId)
    {
        RestRequest<ChangesetGetResponseDto> r = new RestRequest<ChangesetGetResponseDto>(this.client, "GET", "/api/data/changesets/{changeSetId}/poll");
        r.AddPath("{changeSetId}", changeSetId == null ? "" : changeSetId.toString());
        return r.Call(new TypeToken<AstroResult<ChangesetGetResponseDto>>() {}.getType());
    }
}
