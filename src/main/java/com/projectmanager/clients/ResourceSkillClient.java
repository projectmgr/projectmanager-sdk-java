
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
import com.projectmanager.models.ResourceSkillDto;

import com.projectmanager.models.CreateResourceSkillDto;
import com.projectmanager.models.UpdateResourceSkillDto;

/**
 * Contains all methods related to ResourceSkill
 */
public class ResourceSkillClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ResourceSkill API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ResourceSkillClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ResourceSkills defined within your Workspace.
     *
     * A ResourceSkill is a capability possessed by a Resource that can be used to distinguish different classes of Resources suitable for use by a Task.  You can specify that a Task requires a Resource with a particular set of ResourceSkills and then allocate Resources based on whether or not they have the suitable ResourceSkills.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param select Specify which properties should be returned
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto[]> retrieveResourceSkills(@Nullable Object xintegrationname, @Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ResourceSkillDto[]> r = new RestRequest<ResourceSkillDto[]>(this.client, "GET", "/api/data/resources/skills");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (select != null) { r.AddQuery("$select", select.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<ResourceSkillDto[]>>() {}.getType());
    }

    /**
     * Create a Resource Skill.
     *
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body The name of the skill to create.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto> createResourceSkill(@Nullable Object xintegrationname, @NotNull CreateResourceSkillDto body)
    {
        RestRequest<ResourceSkillDto> r = new RestRequest<ResourceSkillDto>(this.client, "POST", "/api/data/resources/skills");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceSkillDto>>() {}.getType());
    }

    /**
     * Update a Resource Skill.
     *
     * @param skillId The id of the skill to update.
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @param body The data of the skill to update.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto> updateResourceSkill(@NotNull String skillId, @Nullable Object xintegrationname, @NotNull UpdateResourceSkillDto body)
    {
        RestRequest<ResourceSkillDto> r = new RestRequest<ResourceSkillDto>(this.client, "PUT", "/api/data/resources/skills/{skillId}");
        r.AddPath("{skillId}", skillId == null ? "" : skillId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<ResourceSkillDto>>() {}.getType());
    }

    /**
     * The endpoint is used to delete a resource skill. Users assigned to this skill will no longer be assigned thereafter.
     *
     * @param resourceSkillId The Id of the skill to be removed.
     * @param xintegrationname The name of the calling system passed along as a header parameter
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteResourceSkill(@NotNull String resourceSkillId, @Nullable Object xintegrationname)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/resources/skills/{resourceSkillId}");
        r.AddPath("{resourceSkillId}", resourceSkillId == null ? "" : resourceSkillId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
