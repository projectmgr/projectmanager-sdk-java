
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
public class WorkSpaceUserInfoDto
{
    private @NotNull WorkSpaceLinksDto links;
    private @NotNull String emailAddress;
    private @NotNull String id;
    private @NotNull String fullName;
    private @NotNull String workSpaceId;
    private @NotNull String workSpaceName;
    private @NotNull String roleName;
    private @Nullable Boolean isGlobalAdmin;
    private @Nullable Boolean isAccountAdministrator;
    private @NotNull WorkSpacePermissionsDto permissions;
    private @NotNull String workSpaceStatus;
    private @NotNull Boolean workSpaceIsActive;
    private @NotNull String workSpaceCountry;
    private @NotNull String workSpaceCountryCode;
    private @NotNull String location;

    /**
     * A collection of shortcut links for the currently logged in Workspace.
     *
     * @return The field links
     */
    public @NotNull WorkSpaceLinksDto getLinks() { return this.links; }
    /**
     * A collection of shortcut links for the currently logged in Workspace.
     *
     * @param value The new value for links
     */
    public void setLinks(@NotNull WorkSpaceLinksDto value) { this.links = value; }
    /**
     * The email address of the currently logged in user.
     *
     * @return The field emailAddress
     */
    public @NotNull String getEmailAddress() { return this.emailAddress; }
    /**
     * The email address of the currently logged in user.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@NotNull String value) { this.emailAddress = value; }
    /**
     * The unique identity of the currently logged in user.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identity of the currently logged in user.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The full name of the currently logged in user.
     *
     * @return The field fullName
     */
    public @NotNull String getFullName() { return this.fullName; }
    /**
     * The full name of the currently logged in user.
     *
     * @param value The new value for fullName
     */
    public void setFullName(@NotNull String value) { this.fullName = value; }
    /**
     * The id of the workspace the user is currently logged into.
     *
     * @return The field workSpaceId
     */
    public @NotNull String getWorkSpaceId() { return this.workSpaceId; }
    /**
     * The id of the workspace the user is currently logged into.
     *
     * @param value The new value for workSpaceId
     */
    public void setWorkSpaceId(@NotNull String value) { this.workSpaceId = value; }
    /**
     * The name of the Workspace that the current user has logged onto.  For most companies, the workspace
     * name will be the name of the business.
     *
     * @return The field workSpaceName
     */
    public @NotNull String getWorkSpaceName() { return this.workSpaceName; }
    /**
     * The name of the Workspace that the current user has logged onto.  For most companies, the workspace
     * name will be the name of the business.
     *
     * @param value The new value for workSpaceName
     */
    public void setWorkSpaceName(@NotNull String value) { this.workSpaceName = value; }
    /**
     * The user's role within the current Workspace.
     *
     * @return The field roleName
     */
    public @NotNull String getRoleName() { return this.roleName; }
    /**
     * The user's role within the current Workspace.
     *
     * @param value The new value for roleName
     */
    public void setRoleName(@NotNull String value) { this.roleName = value; }
    /**
     * True if this user is considered a global administrator of the current Workspace.
     *
     * @return The field isGlobalAdmin
     */
    public @Nullable Boolean getIsGlobalAdmin() { return this.isGlobalAdmin; }
    /**
     * True if this user is considered a global administrator of the current Workspace.
     *
     * @param value The new value for isGlobalAdmin
     */
    public void setIsGlobalAdmin(@Nullable Boolean value) { this.isGlobalAdmin = value; }
    /**
     * True if this user is considered an account administrator of the current Workspace.
     *
     * @return The field isAccountAdministrator
     */
    public @Nullable Boolean getIsAccountAdministrator() { return this.isAccountAdministrator; }
    /**
     * True if this user is considered an account administrator of the current Workspace.
     *
     * @param value The new value for isAccountAdministrator
     */
    public void setIsAccountAdministrator(@Nullable Boolean value) { this.isAccountAdministrator = value; }
    /**
     * Workspace Permissions that the user has within the current Workspace.
     *
     * @return The field permissions
     */
    public @NotNull WorkSpacePermissionsDto getPermissions() { return this.permissions; }
    /**
     * Workspace Permissions that the user has within the current Workspace.
     *
     * @param value The new value for permissions
     */
    public void setPermissions(@NotNull WorkSpacePermissionsDto value) { this.permissions = value; }
    /**
     * The current account status of this WorkSpace. This can be one of four statuses:
     *  - Trial
     *  - Active
     *  - Cancelled
     *  - Expired
     *
     * @return The field workSpaceStatus
     */
    public @NotNull String getWorkSpaceStatus() { return this.workSpaceStatus; }
    /**
     * The current account status of this WorkSpace. This can be one of four statuses:
     *  - Trial
     *  - Active
     *  - Cancelled
     *  - Expired
     *
     * @param value The new value for workSpaceStatus
     */
    public void setWorkSpaceStatus(@NotNull String value) { this.workSpaceStatus = value; }
    /**
     * This is true if the WorkSpace is in the Active or Trial state.
     *
     * @return The field workSpaceIsActive
     */
    public @NotNull Boolean getWorkSpaceIsActive() { return this.workSpaceIsActive; }
    /**
     * This is true if the WorkSpace is in the Active or Trial state.
     *
     * @param value The new value for workSpaceIsActive
     */
    public void setWorkSpaceIsActive(@NotNull Boolean value) { this.workSpaceIsActive = value; }
    /**
     * The name of the country that the current Workspace is located in.
     *
     * @return The field workSpaceCountry
     */
    public @NotNull String getWorkSpaceCountry() { return this.workSpaceCountry; }
    /**
     * The name of the country that the current Workspace is located in.
     *
     * @param value The new value for workSpaceCountry
     */
    public void setWorkSpaceCountry(@NotNull String value) { this.workSpaceCountry = value; }
    /**
     * Returns the iso country code for the current workspace.
     *
     * @return The field workSpaceCountryCode
     */
    public @NotNull String getWorkSpaceCountryCode() { return this.workSpaceCountryCode; }
    /**
     * Returns the iso country code for the current workspace.
     *
     * @param value The new value for workSpaceCountryCode
     */
    public void setWorkSpaceCountryCode(@NotNull String value) { this.workSpaceCountryCode = value; }
    /**
     * The location of the user, which is a combination of city, state (US Only), and country.
     *
     * @return The field location
     */
    public @NotNull String getLocation() { return this.location; }
    /**
     * The location of the user, which is a combination of city, state (US Only), and country.
     *
     * @param value The new value for location
     */
    public void setLocation(@NotNull String value) { this.location = value; }
};
