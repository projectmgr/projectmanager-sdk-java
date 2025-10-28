
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The permissions available to the role
 */
public class UserRolePermissionsDto
{
    private @NotNull UserRolePermissionDto invitePeople;
    private @NotNull UserRolePermissionDto editAccountPage;
    private @NotNull UserRolePermissionDto editSecurityPage;
    private @NotNull UserRolePermissionDto seeHourlyRatesCostsBudgets;
    private @NotNull UserRolePermissionDto setTeamHolidays;
    private @NotNull UserRolePermissionDto editTagsSkillsTeams;
    private @NotNull UserRolePermissionDto editTeamTimesheets;
    private @NotNull UserRolePermissionDto approveTimesheets;
    private @NotNull UserRolePermissionDto editImportantProjectInfo;
    private @NotNull UserRolePermissionDto seeExportProject;
    private @NotNull UserRolePermissionDto seeManageUsers;
    private @NotNull UserRolePermissionDto manageIntegrations;
    private @NotNull UserRolePermissionDto createProjectAndProjectGroups;
    private @NotNull UserRolePermissionDto editUsers;
    private @NotNull UserRolePermissionDto viewPersonalBoard;
    private @NotNull UserRolePermissionDto editAllProjects;
    private @NotNull UserRolePermissionDto changeOwnEmail;

    /**
     * Add people to the account
     *
     * @return The field invitePeople
     */
    public @NotNull UserRolePermissionDto getInvitePeople() { return this.invitePeople; }
    /**
     * Add people to the account
     *
     * @param value The new value for invitePeople
     */
    public void setInvitePeople(@NotNull UserRolePermissionDto value) { this.invitePeople = value; }
    /**
     * Edit accounts and billing page
     *
     * @return The field editAccountPage
     */
    public @NotNull UserRolePermissionDto getEditAccountPage() { return this.editAccountPage; }
    /**
     * Edit accounts and billing page
     *
     * @param value The new value for editAccountPage
     */
    public void setEditAccountPage(@NotNull UserRolePermissionDto value) { this.editAccountPage = value; }
    /**
     * Edit role security settings
     *
     * @return The field editSecurityPage
     */
    public @NotNull UserRolePermissionDto getEditSecurityPage() { return this.editSecurityPage; }
    /**
     * Edit role security settings
     *
     * @param value The new value for editSecurityPage
     */
    public void setEditSecurityPage(@NotNull UserRolePermissionDto value) { this.editSecurityPage = value; }
    /**
     * See hourly rates, costs and budgets
     *
     * @return The field seeHourlyRatesCostsBudgets
     */
    public @NotNull UserRolePermissionDto getSeeHourlyRatesCostsBudgets() { return this.seeHourlyRatesCostsBudgets; }
    /**
     * See hourly rates, costs and budgets
     *
     * @param value The new value for seeHourlyRatesCostsBudgets
     */
    public void setSeeHourlyRatesCostsBudgets(@NotNull UserRolePermissionDto value) { this.seeHourlyRatesCostsBudgets = value; }
    /**
     * Set team holidays
     *
     * @return The field setTeamHolidays
     */
    public @NotNull UserRolePermissionDto getSetTeamHolidays() { return this.setTeamHolidays; }
    /**
     * Set team holidays
     *
     * @param value The new value for setTeamHolidays
     */
    public void setSetTeamHolidays(@NotNull UserRolePermissionDto value) { this.setTeamHolidays = value; }
    /**
     * Create and edit tags, skills and teams
     *
     * @return The field editTagsSkillsTeams
     */
    public @NotNull UserRolePermissionDto getEditTagsSkillsTeams() { return this.editTagsSkillsTeams; }
    /**
     * Create and edit tags, skills and teams
     *
     * @param value The new value for editTagsSkillsTeams
     */
    public void setEditTagsSkillsTeams(@NotNull UserRolePermissionDto value) { this.editTagsSkillsTeams = value; }
    /**
     * Edit team timesheets
     *
     * @return The field editTeamTimesheets
     */
    public @NotNull UserRolePermissionDto getEditTeamTimesheets() { return this.editTeamTimesheets; }
    /**
     * Edit team timesheets
     *
     * @param value The new value for editTeamTimesheets
     */
    public void setEditTeamTimesheets(@NotNull UserRolePermissionDto value) { this.editTeamTimesheets = value; }
    /**
     * Approve timesheets
     *
     * @return The field approveTimesheets
     */
    public @NotNull UserRolePermissionDto getApproveTimesheets() { return this.approveTimesheets; }
    /**
     * Approve timesheets
     *
     * @param value The new value for approveTimesheets
     */
    public void setApproveTimesheets(@NotNull UserRolePermissionDto value) { this.approveTimesheets = value; }
    /**
     * Manage project portfolio
     *
     * @return The field editImportantProjectInfo
     */
    public @NotNull UserRolePermissionDto getEditImportantProjectInfo() { return this.editImportantProjectInfo; }
    /**
     * Manage project portfolio
     *
     * @param value The new value for editImportantProjectInfo
     */
    public void setEditImportantProjectInfo(@NotNull UserRolePermissionDto value) { this.editImportantProjectInfo = value; }
    /**
     * Ability to export projects
     *
     * @return The field seeExportProject
     */
    public @NotNull UserRolePermissionDto getSeeExportProject() { return this.seeExportProject; }
    /**
     * Ability to export projects
     *
     * @param value The new value for seeExportProject
     */
    public void setSeeExportProject(@NotNull UserRolePermissionDto value) { this.seeExportProject = value; }
    /**
     * Access the Manage Users page
     *
     * @return The field seeManageUsers
     */
    public @NotNull UserRolePermissionDto getSeeManageUsers() { return this.seeManageUsers; }
    /**
     * Access the Manage Users page
     *
     * @param value The new value for seeManageUsers
     */
    public void setSeeManageUsers(@NotNull UserRolePermissionDto value) { this.seeManageUsers = value; }
    /**
     * Manage integrations
     *
     * @return The field manageIntegrations
     */
    public @NotNull UserRolePermissionDto getManageIntegrations() { return this.manageIntegrations; }
    /**
     * Manage integrations
     *
     * @param value The new value for manageIntegrations
     */
    public void setManageIntegrations(@NotNull UserRolePermissionDto value) { this.manageIntegrations = value; }
    /**
     * Create Projects
     *
     * @return The field createProjectAndProjectGroups
     */
    public @NotNull UserRolePermissionDto getCreateProjectAndProjectGroups() { return this.createProjectAndProjectGroups; }
    /**
     * Create Projects
     *
     * @param value The new value for createProjectAndProjectGroups
     */
    public void setCreateProjectAndProjectGroups(@NotNull UserRolePermissionDto value) { this.createProjectAndProjectGroups = value; }
    /**
     * Edit user profiles, roles and emails
     *
     * @return The field editUsers
     */
    public @NotNull UserRolePermissionDto getEditUsers() { return this.editUsers; }
    /**
     * Edit user profiles, roles and emails
     *
     * @param value The new value for editUsers
     */
    public void setEditUsers(@NotNull UserRolePermissionDto value) { this.editUsers = value; }
    /**
     * View personal board
     *
     * @return The field viewPersonalBoard
     */
    public @NotNull UserRolePermissionDto getViewPersonalBoard() { return this.viewPersonalBoard; }
    /**
     * View personal board
     *
     * @param value The new value for viewPersonalBoard
     */
    public void setViewPersonalBoard(@NotNull UserRolePermissionDto value) { this.viewPersonalBoard = value; }
    /**
     * Access all projects and timesheets
     *
     * @return The field editAllProjects
     */
    public @NotNull UserRolePermissionDto getEditAllProjects() { return this.editAllProjects; }
    /**
     * Access all projects and timesheets
     *
     * @param value The new value for editAllProjects
     */
    public void setEditAllProjects(@NotNull UserRolePermissionDto value) { this.editAllProjects = value; }
    /**
     * Edit own email address
     *
     * @return The field changeOwnEmail
     */
    public @NotNull UserRolePermissionDto getChangeOwnEmail() { return this.changeOwnEmail; }
    /**
     * Edit own email address
     *
     * @param value The new value for changeOwnEmail
     */
    public void setChangeOwnEmail(@NotNull UserRolePermissionDto value) { this.changeOwnEmail = value; }
};
