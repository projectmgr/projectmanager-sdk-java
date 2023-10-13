
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.TagDto;

import com.projectmanager.models.TagCreateDto;
import com.projectmanager.models.TagUpdateDto;

/**
 * Contains all methods related to Tag
 */
public class TagClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Tag API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TagClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve a list of Tags that match an [OData formatted query](https://www.odata.org/).
     *
     * A Tag is a named categorization you can use to distinguish objects from each other. Tags each have a unique identifier, a name, and a color.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param select Specify which properties should be returned
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TagDto[]> queryTags(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TagDto[]> r = new RestRequest<TagDto[]>(this.client, "GET", "/api/data/tags");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (select != null) { r.AddQuery("$select", select.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<TagDto[]>>() {}.getType());
    }

    /**
     * Creates a new Tag based on information you provide.
     *
     * A Tag is a named categorization you can use to distinguish objects from each other. Tags each have a unique identifier, a name, and a color.
     *
     * @param body The information for the new Tag to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TagDto> createTag(@NotNull TagCreateDto body)
    {
        RestRequest<TagDto> r = new RestRequest<TagDto>(this.client, "POST", "/api/data/tags");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TagDto>>() {}.getType());
    }

    /**
     * Updates a new Tag based on information you provide.
     *
     * A Tag is a named categorization you can use to distinguish objects from each other. Tags each have a unique identifier, a name, and a color.
     *
     * @param tagId The id of the tag
     * @param body The information to update the tag
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TagDto> updateTag(@NotNull String tagId, @NotNull TagUpdateDto body)
    {
        RestRequest<TagDto> r = new RestRequest<TagDto>(this.client, "PUT", "/api/data/tags/{tagId}");
        r.AddPath("{tagId}", tagId == null ? "" : tagId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TagDto>>() {}.getType());
    }
}
