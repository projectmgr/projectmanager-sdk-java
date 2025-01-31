
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
 * Information about a currently logged in user.
 *
 * You can call the RetrieveMe API to gather information about the current user.
 */
public class WorkSpacePermissionsDto
{
    private @Nullable Boolean inviteUser;
    private @Nullable Boolean editAccount;
    private @Nullable Boolean editRole;
    private @Nullable Boolean editAllProjects;
    private @Nullable Boolean editCost;
    private @Nullable Boolean editHoliday;
    private @Nullable Boolean editUserField;
    private @Nullable Boolean editAllTimesheets;
    private @Nullable Boolean approveTimesheet;
    private @Nullable Boolean setUpBoardWorkflow;
    private @Nullable Boolean editProjectField;
    private @Nullable Boolean exportProject;
    private @Nullable Boolean viewUser;
    private @Nullable Boolean editIntegration;
    private @Nullable Boolean createProject;
    private @Nullable Boolean editUser;
    private @Nullable Boolean viewMyBoard;

    /**
     * True if this user can Add people to the account
     *
     * @return The field inviteUser
     */
    public @Nullable Boolean getInviteUser() { return this.inviteUser; }
    /**
     * True if this user can Add people to the account
     *
     * @param value The new value for inviteUser
     */
    public void setInviteUser(@Nullable Boolean value) { this.inviteUser = value; }
    /**
     * True if this user can Edit the accounts and billing page
     *
     * @return The field editAccount
     */
    public @Nullable Boolean getEditAccount() { return this.editAccount; }
    /**
     * True if this user can Edit the accounts and billing page
     *
     * @param value The new value for editAccount
     */
    public void setEditAccount(@Nullable Boolean value) { this.editAccount = value; }
    /**
     * True if this user can Edit role security settings
     *
     * @return The field editRole
     */
    public @Nullable Boolean getEditRole() { return this.editRole; }
    /**
     * True if this user can Edit role security settings
     *
     * @param value The new value for editRole
     */
    public void setEditRole(@Nullable Boolean value) { this.editRole = value; }
    /**
     * True if this user can Access all account data
     *
     * @return The field editAllProjects
     */
    public @Nullable Boolean getEditAllProjects() { return this.editAllProjects; }
    /**
     * True if this user can Access all account data
     *
     * @param value The new value for editAllProjects
     */
    public void setEditAllProjects(@Nullable Boolean value) { this.editAllProjects = value; }
    /**
     * True if this user can See hourly rates, costs and budgets
     *
     * @return The field editCost
     */
    public @Nullable Boolean getEditCost() { return this.editCost; }
    /**
     * True if this user can See hourly rates, costs and budgets
     *
     * @param value The new value for editCost
     */
    public void setEditCost(@Nullable Boolean value) { this.editCost = value; }
    /**
     * True if this user can Set team holidays
     *
     * @return The field editHoliday
     */
    public @Nullable Boolean getEditHoliday() { return this.editHoliday; }
    /**
     * True if this user can Set team holidays
     *
     * @param value The new value for editHoliday
     */
    public void setEditHoliday(@Nullable Boolean value) { this.editHoliday = value; }
    /**
     * True if this user can Create and edit tags, skills, and teams
     *
     * @return The field editUserField
     */
    public @Nullable Boolean getEditUserField() { return this.editUserField; }
    /**
     * True if this user can Create and edit tags, skills, and teams
     *
     * @param value The new value for editUserField
     */
    public void setEditUserField(@Nullable Boolean value) { this.editUserField = value; }
    /**
     * True if this user can Edit team timesheets
     *
     * @return The field editAllTimesheets
     */
    public @Nullable Boolean getEditAllTimesheets() { return this.editAllTimesheets; }
    /**
     * True if this user can Edit team timesheets
     *
     * @param value The new value for editAllTimesheets
     */
    public void setEditAllTimesheets(@Nullable Boolean value) { this.editAllTimesheets = value; }
    /**
     * True if this user can Approve timesheets
     *
     * @return The field approveTimesheet
     */
    public @Nullable Boolean getApproveTimesheet() { return this.approveTimesheet; }
    /**
     * True if this user can Approve timesheets
     *
     * @param value The new value for approveTimesheet
     */
    public void setApproveTimesheet(@Nullable Boolean value) { this.approveTimesheet = value; }
    /**
     * True if this user can Set up board workflow
     *
     * @return The field setUpBoardWorkflow
     */
    public @Nullable Boolean getSetUpBoardWorkflow() { return this.setUpBoardWorkflow; }
    /**
     * True if this user can Set up board workflow
     *
     * @param value The new value for setUpBoardWorkflow
     */
    public void setSetUpBoardWorkflow(@Nullable Boolean value) { this.setUpBoardWorkflow = value; }
    /**
     * True if this user can Edit project and portfolio settings
     *
     * @return The field editProjectField
     */
    public @Nullable Boolean getEditProjectField() { return this.editProjectField; }
    /**
     * True if this user can Edit project and portfolio settings
     *
     * @param value The new value for editProjectField
     */
    public void setEditProjectField(@Nullable Boolean value) { this.editProjectField = value; }
    /**
     * True if this user can Export projects
     *
     * @return The field exportProject
     */
    public @Nullable Boolean getExportProject() { return this.exportProject; }
    /**
     * True if this user can Export projects
     *
     * @param value The new value for exportProject
     */
    public void setExportProject(@Nullable Boolean value) { this.exportProject = value; }
    /**
     * True if this user can Access the Manage Users page
     *
     * @return The field viewUser
     */
    public @Nullable Boolean getViewUser() { return this.viewUser; }
    /**
     * True if this user can Access the Manage Users page
     *
     * @param value The new value for viewUser
     */
    public void setViewUser(@Nullable Boolean value) { this.viewUser = value; }
    /**
     * True if this user can Manage Integrations
     *
     * @return The field editIntegration
     */
    public @Nullable Boolean getEditIntegration() { return this.editIntegration; }
    /**
     * True if this user can Manage Integrations
     *
     * @param value The new value for editIntegration
     */
    public void setEditIntegration(@Nullable Boolean value) { this.editIntegration = value; }
    /**
     * True if this user Can create projects and groups
     *
     * @return The field createProject
     */
    public @Nullable Boolean getCreateProject() { return this.createProject; }
    /**
     * True if this user Can create projects and groups
     *
     * @param value The new value for createProject
     */
    public void setCreateProject(@Nullable Boolean value) { this.createProject = value; }
    /**
     * True if this user can Edit user profiles, roles and emails
     *
     * @return The field editUser
     */
    public @Nullable Boolean getEditUser() { return this.editUser; }
    /**
     * True if this user can Edit user profiles, roles and emails
     *
     * @param value The new value for editUser
     */
    public void setEditUser(@Nullable Boolean value) { this.editUser = value; }
    /**
     * True if this user can View personal board
     *
     * @return The field viewMyBoard
     */
    public @Nullable Boolean getViewMyBoard() { return this.viewMyBoard; }
    /**
     * True if this user can View personal board
     *
     * @param value The new value for viewMyBoard
     */
    public void setViewMyBoard(@Nullable Boolean value) { this.viewMyBoard = value; }
};
