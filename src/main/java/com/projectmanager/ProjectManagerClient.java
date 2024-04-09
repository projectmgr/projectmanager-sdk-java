/***
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 *             
 * @copyright  2023-2024 ProjectManager.com, Inc.
 * @version    107.0.3368
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager;

import com.projectmanager.clients.ApiKeyClient;
import com.projectmanager.clients.ChangesetClient;
import com.projectmanager.clients.DashboardClient;
import com.projectmanager.clients.DiscussionClient;
import com.projectmanager.clients.FileClient;
import com.projectmanager.clients.HolidayClient;
import com.projectmanager.clients.HomeFileClient;
import com.projectmanager.clients.IntegrationClient;
import com.projectmanager.clients.IntegrationCategoryClient;
import com.projectmanager.clients.IntegrationProviderClient;
import com.projectmanager.clients.LicenseClient;
import com.projectmanager.clients.MeClient;
import com.projectmanager.clients.NptFilesClient;
import com.projectmanager.clients.ProjectClient;
import com.projectmanager.clients.ProjectChargeCodeClient;
import com.projectmanager.clients.ProjectCustomerClient;
import com.projectmanager.clients.ProjectFieldClient;
import com.projectmanager.clients.ProjectFileClient;
import com.projectmanager.clients.ProjectFolderClient;
import com.projectmanager.clients.ProjectMembersClient;
import com.projectmanager.clients.ProjectPriorityClient;
import com.projectmanager.clients.ProjectStatusClient;
import com.projectmanager.clients.ProjectTemplateClient;
import com.projectmanager.clients.ResourceClient;
import com.projectmanager.clients.ResourceSkillClient;
import com.projectmanager.clients.ResourceTeamClient;
import com.projectmanager.clients.TagClient;
import com.projectmanager.clients.TaskClient;
import com.projectmanager.clients.TaskAssigneeClient;
import com.projectmanager.clients.TaskFieldClient;
import com.projectmanager.clients.TaskFileClient;
import com.projectmanager.clients.TaskMetadataClient;
import com.projectmanager.clients.TaskStatusClient;
import com.projectmanager.clients.TaskTagClient;
import com.projectmanager.clients.TeamsClient;
import com.projectmanager.clients.TimesheetClient;
import com.projectmanager.clients.UserRoleClient;
import com.projectmanager.clients.WorkSpaceClient;

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
    private HolidayClient holiday;
    private HomeFileClient homeFile;
    private IntegrationClient integration;
    private IntegrationCategoryClient integrationCategory;
    private IntegrationProviderClient integrationProvider;
    private LicenseClient license;
    private MeClient me;
    private NptFilesClient nptFiles;
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
    private TaskMetadataClient taskMetadata;
    private TaskStatusClient taskStatus;
    private TaskTagClient taskTag;
    private TeamsClient teams;
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
        this.holiday = new HolidayClient(this);
        this.homeFile = new HomeFileClient(this);
        this.integration = new IntegrationClient(this);
        this.integrationCategory = new IntegrationCategoryClient(this);
        this.integrationProvider = new IntegrationProviderClient(this);
        this.license = new LicenseClient(this);
        this.me = new MeClient(this);
        this.nptFiles = new NptFilesClient(this);
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
        this.taskMetadata = new TaskMetadataClient(this);
        this.taskStatus = new TaskStatusClient(this);
        this.taskTag = new TaskTagClient(this);
        this.teams = new TeamsClient(this);
        this.timesheet = new TimesheetClient(this);
        this.userRole = new UserRoleClient(this);
        this.workSpace = new WorkSpaceClient(this);
    }

    /**
     * A collection of API methods relating to ApiKey
     *
     * @return A collection containing the {@link com.projectmanager.clients.ApiKeyClient client} methods in the API.
     */
    public @NotNull ApiKeyClient getApiKeyClient() { return this.apiKey; }
    /**
     * A collection of API methods relating to Changeset
     *
     * @return A collection containing the {@link com.projectmanager.clients.ChangesetClient client} methods in the API.
     */
    public @NotNull ChangesetClient getChangesetClient() { return this.changeset; }
    /**
     * A collection of API methods relating to Dashboard
     *
     * @return A collection containing the {@link com.projectmanager.clients.DashboardClient client} methods in the API.
     */
    public @NotNull DashboardClient getDashboardClient() { return this.dashboard; }
    /**
     * A collection of API methods relating to Discussion
     *
     * @return A collection containing the {@link com.projectmanager.clients.DiscussionClient client} methods in the API.
     */
    public @NotNull DiscussionClient getDiscussionClient() { return this.discussion; }
    /**
     * A collection of API methods relating to File
     *
     * @return A collection containing the {@link com.projectmanager.clients.FileClient client} methods in the API.
     */
    public @NotNull FileClient getFileClient() { return this.file; }
    /**
     * A collection of API methods relating to Holiday
     *
     * @return A collection containing the {@link com.projectmanager.clients.HolidayClient client} methods in the API.
     */
    public @NotNull HolidayClient getHolidayClient() { return this.holiday; }
    /**
     * A collection of API methods relating to HomeFile
     *
     * @return A collection containing the {@link com.projectmanager.clients.HomeFileClient client} methods in the API.
     */
    public @NotNull HomeFileClient getHomeFileClient() { return this.homeFile; }
    /**
     * A collection of API methods relating to Integration
     *
     * @return A collection containing the {@link com.projectmanager.clients.IntegrationClient client} methods in the API.
     */
    public @NotNull IntegrationClient getIntegrationClient() { return this.integration; }
    /**
     * A collection of API methods relating to IntegrationCategory
     *
     * @return A collection containing the {@link com.projectmanager.clients.IntegrationCategoryClient client} methods in the API.
     */
    public @NotNull IntegrationCategoryClient getIntegrationCategoryClient() { return this.integrationCategory; }
    /**
     * A collection of API methods relating to IntegrationProvider
     *
     * @return A collection containing the {@link com.projectmanager.clients.IntegrationProviderClient client} methods in the API.
     */
    public @NotNull IntegrationProviderClient getIntegrationProviderClient() { return this.integrationProvider; }
    /**
     * A collection of API methods relating to License
     *
     * @return A collection containing the {@link com.projectmanager.clients.LicenseClient client} methods in the API.
     */
    public @NotNull LicenseClient getLicenseClient() { return this.license; }
    /**
     * A collection of API methods relating to Me
     *
     * @return A collection containing the {@link com.projectmanager.clients.MeClient client} methods in the API.
     */
    public @NotNull MeClient getMeClient() { return this.me; }
    /**
     * A collection of API methods relating to NptFiles
     *
     * @return A collection containing the {@link com.projectmanager.clients.NptFilesClient client} methods in the API.
     */
    public @NotNull NptFilesClient getNptFilesClient() { return this.nptFiles; }
    /**
     * A collection of API methods relating to Project
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectClient client} methods in the API.
     */
    public @NotNull ProjectClient getProjectClient() { return this.project; }
    /**
     * A collection of API methods relating to ProjectChargeCode
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectChargeCodeClient client} methods in the API.
     */
    public @NotNull ProjectChargeCodeClient getProjectChargeCodeClient() { return this.projectChargeCode; }
    /**
     * A collection of API methods relating to ProjectCustomer
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectCustomerClient client} methods in the API.
     */
    public @NotNull ProjectCustomerClient getProjectCustomerClient() { return this.projectCustomer; }
    /**
     * A collection of API methods relating to ProjectField
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectFieldClient client} methods in the API.
     */
    public @NotNull ProjectFieldClient getProjectFieldClient() { return this.projectField; }
    /**
     * A collection of API methods relating to ProjectFile
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectFileClient client} methods in the API.
     */
    public @NotNull ProjectFileClient getProjectFileClient() { return this.projectFile; }
    /**
     * A collection of API methods relating to ProjectFolder
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectFolderClient client} methods in the API.
     */
    public @NotNull ProjectFolderClient getProjectFolderClient() { return this.projectFolder; }
    /**
     * A collection of API methods relating to ProjectMembers
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectMembersClient client} methods in the API.
     */
    public @NotNull ProjectMembersClient getProjectMembersClient() { return this.projectMembers; }
    /**
     * A collection of API methods relating to ProjectPriority
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectPriorityClient client} methods in the API.
     */
    public @NotNull ProjectPriorityClient getProjectPriorityClient() { return this.projectPriority; }
    /**
     * A collection of API methods relating to ProjectStatus
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectStatusClient client} methods in the API.
     */
    public @NotNull ProjectStatusClient getProjectStatusClient() { return this.projectStatus; }
    /**
     * A collection of API methods relating to ProjectTemplate
     *
     * @return A collection containing the {@link com.projectmanager.clients.ProjectTemplateClient client} methods in the API.
     */
    public @NotNull ProjectTemplateClient getProjectTemplateClient() { return this.projectTemplate; }
    /**
     * A collection of API methods relating to Resource
     *
     * @return A collection containing the {@link com.projectmanager.clients.ResourceClient client} methods in the API.
     */
    public @NotNull ResourceClient getResourceClient() { return this.resource; }
    /**
     * A collection of API methods relating to ResourceSkill
     *
     * @return A collection containing the {@link com.projectmanager.clients.ResourceSkillClient client} methods in the API.
     */
    public @NotNull ResourceSkillClient getResourceSkillClient() { return this.resourceSkill; }
    /**
     * A collection of API methods relating to ResourceTeam
     *
     * @return A collection containing the {@link com.projectmanager.clients.ResourceTeamClient client} methods in the API.
     */
    public @NotNull ResourceTeamClient getResourceTeamClient() { return this.resourceTeam; }
    /**
     * A collection of API methods relating to Tag
     *
     * @return A collection containing the {@link com.projectmanager.clients.TagClient client} methods in the API.
     */
    public @NotNull TagClient getTagClient() { return this.tag; }
    /**
     * A collection of API methods relating to Task
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskClient client} methods in the API.
     */
    public @NotNull TaskClient getTaskClient() { return this.task; }
    /**
     * A collection of API methods relating to TaskAssignee
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskAssigneeClient client} methods in the API.
     */
    public @NotNull TaskAssigneeClient getTaskAssigneeClient() { return this.taskAssignee; }
    /**
     * A collection of API methods relating to TaskField
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskFieldClient client} methods in the API.
     */
    public @NotNull TaskFieldClient getTaskFieldClient() { return this.taskField; }
    /**
     * A collection of API methods relating to TaskFile
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskFileClient client} methods in the API.
     */
    public @NotNull TaskFileClient getTaskFileClient() { return this.taskFile; }
    /**
     * A collection of API methods relating to TaskMetadata
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskMetadataClient client} methods in the API.
     */
    public @NotNull TaskMetadataClient getTaskMetadataClient() { return this.taskMetadata; }
    /**
     * A collection of API methods relating to TaskStatus
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskStatusClient client} methods in the API.
     */
    public @NotNull TaskStatusClient getTaskStatusClient() { return this.taskStatus; }
    /**
     * A collection of API methods relating to TaskTag
     *
     * @return A collection containing the {@link com.projectmanager.clients.TaskTagClient client} methods in the API.
     */
    public @NotNull TaskTagClient getTaskTagClient() { return this.taskTag; }
    /**
     * A collection of API methods relating to Teams
     *
     * @return A collection containing the {@link com.projectmanager.clients.TeamsClient client} methods in the API.
     */
    public @NotNull TeamsClient getTeamsClient() { return this.teams; }
    /**
     * A collection of API methods relating to Timesheet
     *
     * @return A collection containing the {@link com.projectmanager.clients.TimesheetClient client} methods in the API.
     */
    public @NotNull TimesheetClient getTimesheetClient() { return this.timesheet; }
    /**
     * A collection of API methods relating to UserRole
     *
     * @return A collection containing the {@link com.projectmanager.clients.UserRoleClient client} methods in the API.
     */
    public @NotNull UserRoleClient getUserRoleClient() { return this.userRole; }
    /**
     * A collection of API methods relating to WorkSpace
     *
     * @return A collection containing the {@link com.projectmanager.clients.WorkSpaceClient client} methods in the API.
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
