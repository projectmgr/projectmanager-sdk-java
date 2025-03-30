
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
 * A NptAssignee is a Resource to whom a Npt is assigned. A single Npt
 * can be assigned to multiple NptAssignee.
 */
public class NptAssigneeDto
{
    private @NotNull String id;
    private @NotNull String initials;
    private @Nullable String name;
    private @Nullable String description;
    private @NotNull Boolean isActive;
    private @Nullable String colorName;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String shortName;
    private @Nullable String avatarUrl;
    private @Nullable String email;

    /**
     * The unique identifier of this Resource
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Resource
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * A shortened set of initials to use when representing this NptAssignee visually
     * in small areas.  The initials may be used in small icons or other overlays.
     *
     * @return The field initials
     */
    public @NotNull String getInitials() { return this.initials; }
    /**
     * A shortened set of initials to use when representing this NptAssignee visually
     * in small areas.  The initials may be used in small icons or other overlays.
     *
     * @param value The new value for initials
     */
    public void setInitials(@NotNull String value) { this.initials = value; }
    /**
     * The name of this NptAssignee
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this NptAssignee
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A more complete description of the NptAssignee.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A more complete description of the NptAssignee.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * True if this NptAssignee is currently active with the Project.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * True if this NptAssignee is currently active with the Project.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * Collaboration Color for this resource.
     *
     * eg. teal, cyan, lightblue, blurple, purple, pink, orange, gray
     *
     * @return The field colorName
     */
    public @Nullable String getColorName() { return this.colorName; }
    /**
     * Collaboration Color for this resource.
     *
     * eg. teal, cyan, lightblue, blurple, purple, pink, orange, gray
     *
     * @param value The new value for colorName
     */
    public void setColorName(@Nullable String value) { this.colorName = value; }
    /**
     * The first or given name of this NptAssignee.
     *
     * For personnel NptAssignees only.
     *
     * @return The field firstName
     */
    public @Nullable String getFirstName() { return this.firstName; }
    /**
     * The first or given name of this NptAssignee.
     *
     * For personnel NptAssignees only.
     *
     * @param value The new value for firstName
     */
    public void setFirstName(@Nullable String value) { this.firstName = value; }
    /**
     * The last or family name of this NptAssignee.
     *
     * For personnel NptAssignees only.
     *
     * @return The field lastName
     */
    public @Nullable String getLastName() { return this.lastName; }
    /**
     * The last or family name of this NptAssignee.
     *
     * For personnel NptAssignees only.
     *
     * @param value The new value for lastName
     */
    public void setLastName(@Nullable String value) { this.lastName = value; }
    /**
     * A shortened version of the name of this NptAssignee.  This is used in areas
     * where the Initials are too short but the full name is too long.
     *
     * @return The field shortName
     */
    public @Nullable String getShortName() { return this.shortName; }
    /**
     * A shortened version of the name of this NptAssignee.  This is used in areas
     * where the Initials are too short but the full name is too long.
     *
     * @param value The new value for shortName
     */
    public void setShortName(@Nullable String value) { this.shortName = value; }
    /**
     * A link to an Avatar for this NptAssignee.  Avatars are small images or representations
     * that can be used to visually identify this NptAssignee at a glance.
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * A link to an Avatar for this NptAssignee.  Avatars are small images or representations
     * that can be used to visually identify this NptAssignee at a glance.
     *
     * @param value The new value for avatarUrl
     */
    public void setAvatarUrl(@Nullable String value) { this.avatarUrl = value; }
    /**
     * The email address for the resource. It can be empty if the resource does not have a login.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The email address for the resource. It can be empty if the resource does not have a login.
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
};
