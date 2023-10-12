
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
import ProjectManager.SDK.models.ResourceSkillDto;

import ProjectManager.SDK.models.CreateResourceSkillDto;
import ProjectManager.SDK.models.UpdateResourceSkillDto;

/**
 * Contains all methods related to ResourceSkill
 */
public class ResourceSkillClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ResourceSkill API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
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
     * @param $top The number of records to return
     * @param $skip Skips the given number of records and then returns $top records
     * @param $filter Filter the expression according to oData queries
     * @param $select Specify which properties should be returned
     * @param $orderby Order collection by this field.
     * @param $expand Include related data in the response
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto[]> retrieveResourceSkills(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<ResourceSkillDto[]> r = new RestRequest<ResourceSkillDto[]>(this.client, "GET", "/api/data/resources/skills");
        r.AddQuery("$top", top.toString());
        r.AddQuery("$skip", skip.toString());
        r.AddQuery("$filter", filter.toString());
        r.AddQuery("$select", select.toString());
        r.AddQuery("$orderby", orderby.toString());
        r.AddQuery("$expand", expand.toString());
        return r.Call();
    }

    /**
     * Create a Resource Skill.
     *
     * @param body The name of the skill to create.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto> createResourceSkill(@NotNull CreateResourceSkillDto body)
    {
        RestRequest<ResourceSkillDto> r = new RestRequest<ResourceSkillDto>(this.client, "POST", "/api/data/resources/skills");
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Update a Resource Skill.
     *
     * @param skillId The id of the skill to update.
     * @param body The data of the skill to update.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<ResourceSkillDto> updateResourceSkill(@NotNull String skillId, @NotNull UpdateResourceSkillDto body)
    {
        RestRequest<ResourceSkillDto> r = new RestRequest<ResourceSkillDto>(this.client, "PUT", "/api/data/resources/skills/{skillId}");
        r.AddPath("{skillId}", skillId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * The endpoint is used to delete a resource skill. Users assigned to this skill will no longer be assigned thereafter.
     *
     * @param resourceSkillId The Id of the skill to be removed.
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteResourceSkill(@NotNull String resourceSkillId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/resources/skills/{resourceSkillId}");
        r.AddPath("{resourceSkillId}", resourceSkillId.toString());
        return r.Call();
    }
}
