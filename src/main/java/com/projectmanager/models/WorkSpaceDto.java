
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
 * A Workspace represents a single business subscription to the ProjectManager.com service.  You
 * can be a member of multiple Workspaces.  Each Workspace is completely separate from all other
 * Workspaces and a user cannot log in to multiple Workspaces at the same time.
 */
public class WorkSpaceDto
{
    private @NotNull String id;
    private @NotNull String company;
    private @NotNull String customProductDomain;
    private @NotNull Boolean isOwner;
    private @NotNull String organizationId;
    private @NotNull String color;
    private @NotNull String roleName;
    private @NotNull String registerDate;
    private @Nullable String businessUserId;
    private @NotNull Boolean isPaid;

    /**
     * The unique identifier of this Workspace.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Workspace.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this Workspace.
     *
     * @return The field company
     */
    public @NotNull String getCompany() { return this.company; }
    /**
     * The name of this Workspace.
     *
     * @param value The new value for company
     */
    public void setCompany(@NotNull String value) { this.company = value; }
    /**
     * The unique DNS domain of this Workspace.
     *
     * @return The field customProductDomain
     */
    public @NotNull String getCustomProductDomain() { return this.customProductDomain; }
    /**
     * The unique DNS domain of this Workspace.
     *
     * @param value The new value for customProductDomain
     */
    public void setCustomProductDomain(@NotNull String value) { this.customProductDomain = value; }
    /**
     * This value is set to true if the user who retrieves this Workspace object via an API call is
     * the owner of this Workspace.
     *
     * @return The field isOwner
     */
    public @NotNull Boolean getIsOwner() { return this.isOwner; }
    /**
     * This value is set to true if the user who retrieves this Workspace object via an API call is
     * the owner of this Workspace.
     *
     * @param value The new value for isOwner
     */
    public void setIsOwner(@NotNull Boolean value) { this.isOwner = value; }
    /**
     * The organization code used for authentication systems for this Workspace.
     *
     * @return The field organizationId
     */
    public @NotNull String getOrganizationId() { return this.organizationId; }
    /**
     * The organization code used for authentication systems for this Workspace.
     *
     * @param value The new value for organizationId
     */
    public void setOrganizationId(@NotNull String value) { this.organizationId = value; }
    /**
     * The RGB color in the format `#RRGGBB` for this Workspace.
     *
     * @return The field color
     */
    public @NotNull String getColor() { return this.color; }
    /**
     * The RGB color in the format `#RRGGBB` for this Workspace.
     *
     * @param value The new value for color
     */
    public void setColor(@NotNull String value) { this.color = value; }
    /**
     * The role of the current user within this Workspace.
     *
     * @return The field roleName
     */
    public @NotNull String getRoleName() { return this.roleName; }
    /**
     * The role of the current user within this Workspace.
     *
     * @param value The new value for roleName
     */
    public void setRoleName(@NotNull String value) { this.roleName = value; }
    /**
     * The timestamp when the Workspace was created.
     *
     * @return The field registerDate
     */
    public @NotNull String getRegisterDate() { return this.registerDate; }
    /**
     * The timestamp when the Workspace was created.
     *
     * @param value The new value for registerDate
     */
    public void setRegisterDate(@NotNull String value) { this.registerDate = value; }
    /**
     * The unique identifier of the BusinessUser that is the owner of this Workspace.
     *
     * @return The field businessUserId
     */
    public @Nullable String getBusinessUserId() { return this.businessUserId; }
    /**
     * The unique identifier of the BusinessUser that is the owner of this Workspace.
     *
     * @param value The new value for businessUserId
     */
    public void setBusinessUserId(@Nullable String value) { this.businessUserId = value; }
    /**
     * True if this Workspace has an active subscription; false if this is a free trial.
     *
     * @return The field isPaid
     */
    public @NotNull Boolean getIsPaid() { return this.isPaid; }
    /**
     * True if this Workspace has an active subscription; false if this is a free trial.
     *
     * @param value The new value for isPaid
     */
    public void setIsPaid(@NotNull Boolean value) { this.isPaid = value; }
};
