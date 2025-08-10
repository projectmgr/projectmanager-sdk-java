
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
import com.projectmanager.models.DiscussionCommentDto;

import com.projectmanager.models.DiscussionCommentCreateResponseDto;
import com.projectmanager.models.DiscussionCommentCreateDto;

/**
 * Contains all methods related to NptDiscussion
 */
public class NptDiscussionClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the NptDiscussion API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NptDiscussionClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve all comments written about a Npt
     *
     * @param nptId The unique ID number of the Npt to retrieve comments
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<DiscussionCommentDto[]> retrieveNptComments(@NotNull String nptId)
    {
        RestRequest<DiscussionCommentDto[]> r = new RestRequest<DiscussionCommentDto[]>(this.client, "GET", "/api/data/non-project-tasks/{nptId}/comments");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        return r.Call(new TypeToken<AstroResult<DiscussionCommentDto[]>>() {}.getType());
    }

    /**
     * Adds a Markdown-formatted comment to a Npt.
     *
     * Npts can have discussions attached to them.  These discussions can include text with simple
     * formatting.  Discussion comments are formatted using [Markdown](https://www.markdownguide.org/)
     * and users should be aware that HTML embedding is not permitted due to the risk of cross-site
     * attacks and other embedding challenges.
     *
     * @param nptId The unique ID number of the Npt being commented upon
     * @param body The Markdown-formatted text of the comment
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<DiscussionCommentCreateResponseDto> createNptComments(@NotNull String nptId, @NotNull DiscussionCommentCreateDto body)
    {
        RestRequest<DiscussionCommentCreateResponseDto> r = new RestRequest<DiscussionCommentCreateResponseDto>(this.client, "POST", "/api/data/non-project-tasks/{nptId}/comments");
        r.AddPath("{nptId}", nptId == null ? "" : nptId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<DiscussionCommentCreateResponseDto>>() {}.getType());
    }

    /**
     * Puts a thumbsup on a comment
     *
     * @param commentId the id of the comment
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> likeacomment(@NotNull String commentId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "POST", "/api/data/non-project-tasks/comments/{commentId}/like");
        r.AddPath("{commentId}", commentId == null ? "" : commentId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Unlike a comment that was previously liked
     *
     * @param commentId the id of the comment
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removesathumbsupfromacomment(@NotNull String commentId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/comments/{commentId}/like");
        r.AddPath("{commentId}", commentId == null ? "" : commentId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Removes a comment by it's id
     *
     * @param commentId Remove a comment
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> removeacomment(@NotNull String commentId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/non-project-tasks/comments/{commentId}");
        r.AddPath("{commentId}", commentId == null ? "" : commentId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
