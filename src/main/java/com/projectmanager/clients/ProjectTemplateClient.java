
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
import com.projectmanager.AstroResult;
import com.projectmanager.models.ProjectTemplateDto;
import com.projectmanager.models.ProjectTemplateCategoryDto;

/**
 * Contains all methods related to ProjectTemplate
 */
public class ProjectTemplateClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the ProjectTemplate API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public ProjectTemplateClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves all ProjectTemplates defined in the system.
     *
     * A ProjectTemplate is a definition of default project related data (eg. Tasks) that can be applied to a new project when it is created.  ProjectTemplates are categorized using the TemplateCategory system.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectTemplateDto[]> retrieveProjectTemplates()
    {
        RestRequest<ProjectTemplateDto[]> r = new RestRequest<ProjectTemplateDto[]>(this.client, "GET", "/api/data/projects/templates");
        return r.Call();
    }

    /**
     * Retrieves all ProjectTemplate Categories defined in the system.
     *
     * A ProjectTemplate is a definition of default project related data (eg. Tasks) that can be applied to a new project when it is created.  ProjectTemplates are categorized using the TemplateCategory system.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<ProjectTemplateCategoryDto[]> retrieveTemplateCategories()
    {
        RestRequest<ProjectTemplateCategoryDto[]> r = new RestRequest<ProjectTemplateCategoryDto[]>(this.client, "GET", "/api/data/projects/templates/categories");
        return r.Call();
    }
}
