/***
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 *             
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @version    96.0.2110
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package ProjectManager.SDK;

import ProjectManager.SDK.clients.ApiKeyClient;
import ProjectManager.SDK.clients.ChangesetClient;
import ProjectManager.SDK.clients.DashboardClient;
import ProjectManager.SDK.clients.DiscussionClient;
import ProjectManager.SDK.clients.FileClient;
import ProjectManager.SDK.clients.HomeFileClient;
import ProjectManager.SDK.clients.IntegrationClient;
import ProjectManager.SDK.clients.IntegrationCategoryClient;
import ProjectManager.SDK.clients.IntegrationProviderClient;
import ProjectManager.SDK.clients.LicenseClient;
import ProjectManager.SDK.clients.MeClient;
import ProjectManager.SDK.clients.ProjectClient;
import ProjectManager.SDK.clients.ProjectChargeCodeClient;
import ProjectManager.SDK.clients.ProjectCustomerClient;
import ProjectManager.SDK.clients.ProjectFieldClient;
import ProjectManager.SDK.clients.ProjectFileClient;
import ProjectManager.SDK.clients.ProjectFolderClient;
import ProjectManager.SDK.clients.ProjectMembersClient;
import ProjectManager.SDK.clients.ProjectPriorityClient;
import ProjectManager.SDK.clients.ProjectStatusClient;
import ProjectManager.SDK.clients.ProjectTemplateClient;
import ProjectManager.SDK.clients.ResourceClient;
import ProjectManager.SDK.clients.ResourceSkillClient;
import ProjectManager.SDK.clients.ResourceTeamClient;
import ProjectManager.SDK.clients.TagClient;
import ProjectManager.SDK.clients.TaskClient;
import ProjectManager.SDK.clients.TaskAssigneeClient;
import ProjectManager.SDK.clients.TaskFieldClient;
import ProjectManager.SDK.clients.TaskFileClient;
import ProjectManager.SDK.clients.TaskStatusClient;
import ProjectManager.SDK.clients.TaskTagClient;
import ProjectManager.SDK.clients.TimesheetClient;
import ProjectManager.SDK.clients.UserRoleClient;
import ProjectManager.SDK.clients.WorkSpaceClient;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A client object that can be used to work with the API
 */
public class ProjectManagerClient {
    private String serverUri;
    private String bearerToken;
    private String appName;

    private ApiKeyClient apiKey;
    private ChangesetClient changeset;
    private DashboardClient dashboard;
    private DiscussionClient discussion;
    private FileClient file;
    private HomeFileClient homeFile;
    private IntegrationClient integration;
    private IntegrationCategoryClient integrationCategory;
    private IntegrationProviderClient integrationProvider;
    private LicenseClient license;
    private MeClient me;
    private ProjectClient project;
    private ProjectChargeCodeClient projectChargeCode;
    private ProjectCustomerClient projectCustomer;
    private ProjectFieldClient projectField;
    private ProjectFileClient projectFile;
    private ProjectFolderClient projectFolder;
    private ProjectMembersClient projectMembers;
    private ProjectPriorityClient projectPriority;
    private ProjectStatusClient projectStatus;
    private ProjectTemplateClient projectTemplate;
    private ResourceClient resource;
    private ResourceSkillClient resourceSkill;
    private ResourceTeamClient resourceTeam;
    private TagClient tag;
    private TaskClient task;
    private TaskAssigneeClient taskAssignee;
    private TaskFieldClient taskField;
    private TaskFileClient taskFile;
    private TaskStatusClient taskStatus;
    private TaskTagClient taskTag;
    private TimesheetClient timesheet;
    private UserRoleClient userRole;
    private WorkSpaceClient workSpace;

    private ProjectManagerClient(@NotNull String serverUri)
    {
        this.serverUri = serverUri;

        this.apiKey = new ApiKeyClient(this);
        this.changeset = new ChangesetClient(this);
        this.dashboard = new DashboardClient(this);
        this.discussion = new DiscussionClient(this);
        this.file = new FileClient(this);
        this.homeFile = new HomeFileClient(this);
        this.integration = new IntegrationClient(this);
        this.integrationCategory = new IntegrationCategoryClient(this);
        this.integrationProvider = new IntegrationProviderClient(this);
        this.license = new LicenseClient(this);
        this.me = new MeClient(this);
        this.project = new ProjectClient(this);
        this.projectChargeCode = new ProjectChargeCodeClient(this);
        this.projectCustomer = new ProjectCustomerClient(this);
        this.projectField = new ProjectFieldClient(this);
        this.projectFile = new ProjectFileClient(this);
        this.projectFolder = new ProjectFolderClient(this);
        this.projectMembers = new ProjectMembersClient(this);
        this.projectPriority = new ProjectPriorityClient(this);
        this.projectStatus = new ProjectStatusClient(this);
        this.projectTemplate = new ProjectTemplateClient(this);
        this.resource = new ResourceClient(this);
        this.resourceSkill = new ResourceSkillClient(this);
        this.resourceTeam = new ResourceTeamClient(this);
        this.tag = new TagClient(this);
        this.task = new TaskClient(this);
        this.taskAssignee = new TaskAssigneeClient(this);
        this.taskField = new TaskFieldClient(this);
        this.taskFile = new TaskFileClient(this);
        this.taskStatus = new TaskStatusClient(this);
        this.taskTag = new TaskTagClient(this);
        this.timesheet = new TimesheetClient(this);
        this.userRole = new UserRoleClient(this);
        this.workSpace = new WorkSpaceClient(this);
    }

    /**
     * A collection of API methods relating to ApiKey
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ApiKeyClient client} methods in the API.
     */
    public @NotNull ApiKeyClient getApiKeyClient() { return this.apiKey; }
    /**
     * A collection of API methods relating to Changeset
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ChangesetClient client} methods in the API.
     */
    public @NotNull ChangesetClient getChangesetClient() { return this.changeset; }
    /**
     * A collection of API methods relating to Dashboard
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.DashboardClient client} methods in the API.
     */
    public @NotNull DashboardClient getDashboardClient() { return this.dashboard; }
    /**
     * A collection of API methods relating to Discussion
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.DiscussionClient client} methods in the API.
     */
    public @NotNull DiscussionClient getDiscussionClient() { return this.discussion; }
    /**
     * A collection of API methods relating to File
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.FileClient client} methods in the API.
     */
    public @NotNull FileClient getFileClient() { return this.file; }
    /**
     * A collection of API methods relating to HomeFile
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.HomeFileClient client} methods in the API.
     */
    public @NotNull HomeFileClient getHomeFileClient() { return this.homeFile; }
    /**
     * A collection of API methods relating to Integration
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.IntegrationClient client} methods in the API.
     */
    public @NotNull IntegrationClient getIntegrationClient() { return this.integration; }
    /**
     * A collection of API methods relating to IntegrationCategory
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.IntegrationCategoryClient client} methods in the API.
     */
    public @NotNull IntegrationCategoryClient getIntegrationCategoryClient() { return this.integrationCategory; }
    /**
     * A collection of API methods relating to IntegrationProvider
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.IntegrationProviderClient client} methods in the API.
     */
    public @NotNull IntegrationProviderClient getIntegrationProviderClient() { return this.integrationProvider; }
    /**
     * A collection of API methods relating to License
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.LicenseClient client} methods in the API.
     */
    public @NotNull LicenseClient getLicenseClient() { return this.license; }
    /**
     * A collection of API methods relating to Me
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.MeClient client} methods in the API.
     */
    public @NotNull MeClient getMeClient() { return this.me; }
    /**
     * A collection of API methods relating to Project
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectClient client} methods in the API.
     */
    public @NotNull ProjectClient getProjectClient() { return this.project; }
    /**
     * A collection of API methods relating to ProjectChargeCode
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectChargeCodeClient client} methods in the API.
     */
    public @NotNull ProjectChargeCodeClient getProjectChargeCodeClient() { return this.projectChargeCode; }
    /**
     * A collection of API methods relating to ProjectCustomer
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectCustomerClient client} methods in the API.
     */
    public @NotNull ProjectCustomerClient getProjectCustomerClient() { return this.projectCustomer; }
    /**
     * A collection of API methods relating to ProjectField
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectFieldClient client} methods in the API.
     */
    public @NotNull ProjectFieldClient getProjectFieldClient() { return this.projectField; }
    /**
     * A collection of API methods relating to ProjectFile
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectFileClient client} methods in the API.
     */
    public @NotNull ProjectFileClient getProjectFileClient() { return this.projectFile; }
    /**
     * A collection of API methods relating to ProjectFolder
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectFolderClient client} methods in the API.
     */
    public @NotNull ProjectFolderClient getProjectFolderClient() { return this.projectFolder; }
    /**
     * A collection of API methods relating to ProjectMembers
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectMembersClient client} methods in the API.
     */
    public @NotNull ProjectMembersClient getProjectMembersClient() { return this.projectMembers; }
    /**
     * A collection of API methods relating to ProjectPriority
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectPriorityClient client} methods in the API.
     */
    public @NotNull ProjectPriorityClient getProjectPriorityClient() { return this.projectPriority; }
    /**
     * A collection of API methods relating to ProjectStatus
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectStatusClient client} methods in the API.
     */
    public @NotNull ProjectStatusClient getProjectStatusClient() { return this.projectStatus; }
    /**
     * A collection of API methods relating to ProjectTemplate
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ProjectTemplateClient client} methods in the API.
     */
    public @NotNull ProjectTemplateClient getProjectTemplateClient() { return this.projectTemplate; }
    /**
     * A collection of API methods relating to Resource
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ResourceClient client} methods in the API.
     */
    public @NotNull ResourceClient getResourceClient() { return this.resource; }
    /**
     * A collection of API methods relating to ResourceSkill
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ResourceSkillClient client} methods in the API.
     */
    public @NotNull ResourceSkillClient getResourceSkillClient() { return this.resourceSkill; }
    /**
     * A collection of API methods relating to ResourceTeam
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.ResourceTeamClient client} methods in the API.
     */
    public @NotNull ResourceTeamClient getResourceTeamClient() { return this.resourceTeam; }
    /**
     * A collection of API methods relating to Tag
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TagClient client} methods in the API.
     */
    public @NotNull TagClient getTagClient() { return this.tag; }
    /**
     * A collection of API methods relating to Task
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskClient client} methods in the API.
     */
    public @NotNull TaskClient getTaskClient() { return this.task; }
    /**
     * A collection of API methods relating to TaskAssignee
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskAssigneeClient client} methods in the API.
     */
    public @NotNull TaskAssigneeClient getTaskAssigneeClient() { return this.taskAssignee; }
    /**
     * A collection of API methods relating to TaskField
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskFieldClient client} methods in the API.
     */
    public @NotNull TaskFieldClient getTaskFieldClient() { return this.taskField; }
    /**
     * A collection of API methods relating to TaskFile
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskFileClient client} methods in the API.
     */
    public @NotNull TaskFileClient getTaskFileClient() { return this.taskFile; }
    /**
     * A collection of API methods relating to TaskStatus
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskStatusClient client} methods in the API.
     */
    public @NotNull TaskStatusClient getTaskStatusClient() { return this.taskStatus; }
    /**
     * A collection of API methods relating to TaskTag
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TaskTagClient client} methods in the API.
     */
    public @NotNull TaskTagClient getTaskTagClient() { return this.taskTag; }
    /**
     * A collection of API methods relating to Timesheet
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.TimesheetClient client} methods in the API.
     */
    public @NotNull TimesheetClient getTimesheetClient() { return this.timesheet; }
    /**
     * A collection of API methods relating to UserRole
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.UserRoleClient client} methods in the API.
     */
    public @NotNull UserRoleClient getUserRoleClient() { return this.userRole; }
    /**
     * A collection of API methods relating to WorkSpace
     *
     * @return A collection containing the {@link ProjectManager.SDK.clients.WorkSpaceClient client} methods in the API.
     */
    public @NotNull WorkSpaceClient getWorkSpaceClient() { return this.workSpace; }
  
    /**
     * Construct a new API client to target the specific environment.
     *
     * @param env The environment to use, either "prd" for production or "sbx" for sandbox.
     * @return The API client to use
     */
    public static @NotNull ProjectManagerClient withEnvironment(@NotNull String env)
    {
        String url = env;
        switch (env)
        {
            case "production":
                url = "https://api.projectmanager.com";
                break;
        }
        return new ProjectManagerClient(url);
    }

    /**
     * Construct an unsafe client that uses a non-standard server; this can be necessary
     * when using proxy servers or an API gateway.  Please be careful when using this
     * mode.  You should prefer to use `withEnvironment()` instead wherever possible.
     *
     * @param unsafeUrl The custom environment URL to use for this client
     * @return The API client to use
     */
    public static @NotNull ProjectManagerClient withCustomEnvironment(@NotNull String unsafeUrl)
    {
        return new ProjectManagerClient(unsafeUrl);
    }

    /**
     * Configure this API client to use a JWT bearer token.
     *
     * 
     *
     * @param token The JWT bearer token to use for this API session
     * @return The API client to use
     */
    public @NotNull ProjectManagerClient withBearerToken(@NotNull String token)
    {
        this.bearerToken = token;
        return this;
    }

    /**
     * Configures this API client to use an application name.
     * 
     * @param appName The Application name to use for this API session
     * @return The API client to use
     */
    public @NotNull ProjectManagerClient withApplicationName(@NotNull String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * The server URI to which this client connects
     *
     * @return The server URI
     */
    public @NotNull String getServerUri() {
        return this.serverUri;
    }

    /**
     * Returns the currently selected bearer token
     *
     * @return The bearer token
     */
    public @Nullable String getBearerToken() {
        return this.bearerToken;
    }

    /**
     * Returns the currently selected application name
     * 
     * @return The application name
     */
    public @Nullable String getAppName() {
        return this.appName;
    }
}
