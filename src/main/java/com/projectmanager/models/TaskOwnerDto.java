
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
 * A Resource represents a person, material, or tool that is used within your Projects.
 * When you attach a Resources to more than one Task, the software will schedule the usage
 * of your Resource so that it is not allocated to more than one Task at the same time.
 * The users in your Workspace are also considered Resources.  To invite a new User to your
 * Workspace, create a new Resource for that user.
 */
public class TaskOwnerDto
{
    private @NotNull String id;
    private @NotNull String initials;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String email;
    private @NotNull Boolean isActive;
    private @Nullable String color;
    private @Nullable String avatarUrl;

    /**
     * The unique identifier of this Resource.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Resource.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The resource initials.
     *
     * @return The field initials
     */
    public @NotNull String getInitials() { return this.initials; }
    /**
     * The resource initials.
     *
     * @param value The new value for initials
     */
    public void setInitials(@NotNull String value) { this.initials = value; }
    /**
     * The first name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field firstName
     */
    public @Nullable String getFirstName() { return this.firstName; }
    /**
     * The first name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for firstName
     */
    public void setFirstName(@Nullable String value) { this.firstName = value; }
    /**
     * The last name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field lastName
     */
    public @Nullable String getLastName() { return this.lastName; }
    /**
     * The last name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for lastName
     */
    public void setLastName(@Nullable String value) { this.lastName = value; }
    /**
     * If this Resource is a person who can log on to ProjectManager.com, this value should be the email address of the
     * person.  If this Resource is not a person, but you wish to receive email alerts for usage of this Resource, you
     * can also add an email address here and notifications will be sent when this Resource is used.
     *
     * Otherwise this value should be `null`.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * If this Resource is a person who can log on to ProjectManager.com, this value should be the email address of the
     * person.  If this Resource is not a person, but you wish to receive email alerts for usage of this Resource, you
     * can also add an email address here and notifications will be sent when this Resource is used.
     *
     * Otherwise this value should be `null`.
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     * True if this Resource is currently active and valid.  If this value is false,
     * this Resource is considered to be deactivated and not available for further use.
     *
     * For personnel Resources, setting this value to False will make this user unable
     * to access this Workspace.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * True if this Resource is currently active and valid.  If this value is false,
     * this Resource is considered to be deactivated and not available for further use.
     *
     * For personnel Resources, setting this value to False will make this user unable
     * to access this Workspace.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * Read only Hex code of the ColorName
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * Read only Hex code of the ColorName
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
    /**
     * The resources avatar url, if any.
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * The resources avatar url, if any.
     *
     * @param value The new value for avatarUrl
     */
    public void setAvatarUrl(@Nullable String value) { this.avatarUrl = value; }
};
