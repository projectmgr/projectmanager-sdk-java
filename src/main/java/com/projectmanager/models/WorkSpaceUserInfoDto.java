
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
    private @Nullable WorkSpaceLinksDto links;
    private @Nullable String emailAddress;
    private @NotNull String id;
    private @Nullable String fullName;
    private @Nullable String workSpaceName;
    private @Nullable String roleName;
    private @Nullable Boolean isGlobalAdmin;
    private @Nullable Boolean isAccountAdministrator;

    /**
     * A collection of shortcut links for the currently logged in Workspace.
     *
     * @return The field links
     */
    public @Nullable WorkSpaceLinksDto getLinks() { return this.links; }
    /**
     * A collection of shortcut links for the currently logged in Workspace.
     *
     * @param value The new value for links
     */
    public void setLinks(@Nullable WorkSpaceLinksDto value) { this.links = value; }
    /**
     * The email address of the currently logged in user.
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * The email address of the currently logged in user.
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
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
    public @Nullable String getFullName() { return this.fullName; }
    /**
     * The full name of the currently logged in user.
     *
     * @param value The new value for fullName
     */
    public void setFullName(@Nullable String value) { this.fullName = value; }
    /**
     * The name of the Workspace that the current user has logged onto.  For most companies, the workspace
     * name will be the name of the business.
     *
     * @return The field workSpaceName
     */
    public @Nullable String getWorkSpaceName() { return this.workSpaceName; }
    /**
     * The name of the Workspace that the current user has logged onto.  For most companies, the workspace
     * name will be the name of the business.
     *
     * @param value The new value for workSpaceName
     */
    public void setWorkSpaceName(@Nullable String value) { this.workSpaceName = value; }
    /**
     * The user's role within the current Workspace.
     *
     * @return The field roleName
     */
    public @Nullable String getRoleName() { return this.roleName; }
    /**
     * The user's role within the current Workspace.
     *
     * @param value The new value for roleName
     */
    public void setRoleName(@Nullable String value) { this.roleName = value; }
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
};
