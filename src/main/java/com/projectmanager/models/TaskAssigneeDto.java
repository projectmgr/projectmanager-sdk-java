
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
 * A TaskAssignee is the person to whom a Task is assigned.  A single Task
 * can be assigned to multiple TaskAssignees.
 */
public class TaskAssigneeDto
{
    private @NotNull String id;
    private @NotNull String initials;
    private @Nullable String name;
    private @Nullable String description;
    private @NotNull Boolean isActive;
    private @Nullable String color;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String shortName;
    private @Nullable String avatarUrl;
    private @Nullable String email;
    private @Nullable Integer allocatedEffort;

    /**
     * The unique identifier of this TaskAssignee
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskAssignee
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * A shortened set of initials to use when representing this TaskAssignee visually
     * in small areas.  The initials may be used in small icons or other overlays.
     *
     * @return The field initials
     */
    public @NotNull String getInitials() { return this.initials; }
    /**
     * A shortened set of initials to use when representing this TaskAssignee visually
     * in small areas.  The initials may be used in small icons or other overlays.
     *
     * @param value The new value for initials
     */
    public void setInitials(@NotNull String value) { this.initials = value; }
    /**
     * The name of this TaskAssignee
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this TaskAssignee
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A more complete description of the TaskAssignee.
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * A more complete description of the TaskAssignee.
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * True if this TaskAssignee is currently active with the Project.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * True if this TaskAssignee is currently active with the Project.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
    /**
     * The color that will be used to represent this TaskAssignee visually.
     *
     * You can choose specify any color that can be represented using HTML RGB
     * syntax such as `#0088FF`, in the format `RRGGBB`.  You may not use names
     * for colors.
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * The color that will be used to represent this TaskAssignee visually.
     *
     * You can choose specify any color that can be represented using HTML RGB
     * syntax such as `#0088FF`, in the format `RRGGBB`.  You may not use names
     * for colors.
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
    /**
     * The first or given name of this TaskAssignee.
     *
     * For personnel TaskAssignees only.
     *
     * @return The field firstName
     */
    public @Nullable String getFirstName() { return this.firstName; }
    /**
     * The first or given name of this TaskAssignee.
     *
     * For personnel TaskAssignees only.
     *
     * @param value The new value for firstName
     */
    public void setFirstName(@Nullable String value) { this.firstName = value; }
    /**
     * The last or family name of this TaskAssignee.
     *
     * For personnel TaskAssignees only.
     *
     * @return The field lastName
     */
    public @Nullable String getLastName() { return this.lastName; }
    /**
     * The last or family name of this TaskAssignee.
     *
     * For personnel TaskAssignees only.
     *
     * @param value The new value for lastName
     */
    public void setLastName(@Nullable String value) { this.lastName = value; }
    /**
     * A shortened version of the name of this TaskAssignee.  This is used in areas
     * where the Initials are too short but the full name is too long.
     *
     * @return The field shortName
     */
    public @Nullable String getShortName() { return this.shortName; }
    /**
     * A shortened version of the name of this TaskAssignee.  This is used in areas
     * where the Initials are too short but the full name is too long.
     *
     * @param value The new value for shortName
     */
    public void setShortName(@Nullable String value) { this.shortName = value; }
    /**
     * A link to an Avatar for this TaskAssignee.  Avatars are small images or representations
     * that can be used to visually identify this TaskAssignee at a glance.
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * A link to an Avatar for this TaskAssignee.  Avatars are small images or representations
     * that can be used to visually identify this TaskAssignee at a glance.
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
    /**
     * The allocated effort (in minutes) for this Task and Assignee.
     *
     * @return The field allocatedEffort
     */
    public @Nullable Integer getAllocatedEffort() { return this.allocatedEffort; }
    /**
     * The allocated effort (in minutes) for this Task and Assignee.
     *
     * @param value The new value for allocatedEffort
     */
    public void setAllocatedEffort(@Nullable Integer value) { this.allocatedEffort = value; }
};
