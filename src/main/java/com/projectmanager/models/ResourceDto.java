
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
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
public class ResourceDto
{
    private @NotNull String id;
    private @NotNull String initials;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String email;
    private @Nullable Double hourlyRate;
    private @Nullable String phone;
    private @Nullable String city;
    private @Nullable String state;
    private @Nullable String country;
    private @Nullable String countryName;
    private @Nullable String notes;
    private @Nullable ResourceApproverDto approver;
    private @NotNull ResourceTeamDto[] teams;
    private @NotNull ResourceSkillDto[] skills;
    private @Nullable String onlineDateTime;
    private @Nullable String role;
    private @NotNull Boolean isActive;
    private @Nullable String createdDate;
    private @Nullable String createdBy;
    private @Nullable String modifiedDate;
    private @Nullable String modifiedBy;
    private @Nullable String colorName;
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
     * The basic hourly rate for this Resource.
     *
     * @return The field hourlyRate
     */
    public @Nullable Double getHourlyRate() { return this.hourlyRate; }
    /**
     * The basic hourly rate for this Resource.
     *
     * @param value The new value for hourlyRate
     */
    public void setHourlyRate(@Nullable Double value) { this.hourlyRate = value; }
    /**
     * The phone number associated with this Resource.
     *
     * @return The field phone
     */
    public @Nullable String getPhone() { return this.phone; }
    /**
     * The phone number associated with this Resource.
     *
     * @param value The new value for phone
     */
    public void setPhone(@Nullable String value) { this.phone = value; }
    /**
     * The city where this Resource is located.
     *
     * @return The field city
     */
    public @Nullable String getCity() { return this.city; }
    /**
     * The city where this Resource is located.
     *
     * @param value The new value for city
     */
    public void setCity(@Nullable String value) { this.city = value; }
    /**
     * The state or region where this Resource is located.  This value is not constrained
     * to a list of known states or regions.
     *
     * @return The field state
     */
    public @Nullable String getState() { return this.state; }
    /**
     * The state or region where this Resource is located.  This value is not constrained
     * to a list of known states or regions.
     *
     * @param value The new value for state
     */
    public void setState(@Nullable String value) { this.state = value; }
    /**
     * A text field indicating the country in which this Resource is located.  This value
     * is not constrained to the list of known ISO 3166 country names or codes.
     *
     * @return The field country
     */
    public @Nullable String getCountry() { return this.country; }
    /**
     * A text field indicating the country in which this Resource is located.  This value
     * is not constrained to the list of known ISO 3166 country names or codes.
     *
     * @param value The new value for country
     */
    public void setCountry(@Nullable String value) { this.country = value; }
    /**
     * Returns the name of the country
     *
     * @return The field countryName
     */
    public @Nullable String getCountryName() { return this.countryName; }
    /**
     * Returns the name of the country
     *
     * @param value The new value for countryName
     */
    public void setCountryName(@Nullable String value) { this.countryName = value; }
    /**
     * Free-form text notes about this Resource.  You may use this field to store extra
     * information about the Resource.
     *
     * @return The field notes
     */
    public @Nullable String getNotes() { return this.notes; }
    /**
     * Free-form text notes about this Resource.  You may use this field to store extra
     * information about the Resource.
     *
     * @param value The new value for notes
     */
    public void setNotes(@Nullable String value) { this.notes = value; }
    /**
     * When managing users, you can choose who will approve a person's Timesheets. This
     * is a ResourceApprover.  You can specify this person within the Resource object.
     *
     * @return The field approver
     */
    public @Nullable ResourceApproverDto getApprover() { return this.approver; }
    /**
     * When managing users, you can choose who will approve a person's Timesheets. This
     * is a ResourceApprover.  You can specify this person within the Resource object.
     *
     * @param value The new value for approver
     */
    public void setApprover(@Nullable ResourceApproverDto value) { this.approver = value; }
    /**
     * The list of ResourceTeams to which this Resource belongs.
     *
     * @return The field teams
     */
    public @NotNull ResourceTeamDto[] getTeams() { return this.teams; }
    /**
     * The list of ResourceTeams to which this Resource belongs.
     *
     * @param value The new value for teams
     */
    public void setTeams(@NotNull ResourceTeamDto[] value) { this.teams = value; }
    /**
     * The list of ResourceSkills possessed by this Resource.
     *
     * @return The field skills
     */
    public @NotNull ResourceSkillDto[] getSkills() { return this.skills; }
    /**
     * The list of ResourceSkills possessed by this Resource.
     *
     * @param value The new value for skills
     */
    public void setSkills(@NotNull ResourceSkillDto[] value) { this.skills = value; }
    /**
     * The last time when this Resource was online.
     *
     * Applies to personnel Resources only.
     *
     * @return The field onlineDateTime
     */
    public @Nullable String getOnlineDateTime() { return this.onlineDateTime; }
    /**
     * The last time when this Resource was online.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for onlineDateTime
     */
    public void setOnlineDateTime(@Nullable String value) { this.onlineDateTime = value; }
    /**
     * The Role privileges associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field role
     */
    public @Nullable String getRole() { return this.role; }
    /**
     * The Role privileges associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for role
     */
    public void setRole(@Nullable String value) { this.role = value; }
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
     * The date this resource was created
     *
     * @return The field createdDate
     */
    public @Nullable String getCreatedDate() { return this.createdDate; }
    /**
     * The date this resource was created
     *
     * @param value The new value for createdDate
     */
    public void setCreatedDate(@Nullable String value) { this.createdDate = value; }
    /**
     * Set to a unique identifier of the user who created this Resource.
     *
     * @return The field createdBy
     */
    public @Nullable String getCreatedBy() { return this.createdBy; }
    /**
     * Set to a unique identifier of the user who created this Resource.
     *
     * @param value The new value for createdBy
     */
    public void setCreatedBy(@Nullable String value) { this.createdBy = value; }
    /**
     * The date this resource was last modified
     *
     * @return The field modifiedDate
     */
    public @Nullable String getModifiedDate() { return this.modifiedDate; }
    /**
     * The date this resource was last modified
     *
     * @param value The new value for modifiedDate
     */
    public void setModifiedDate(@Nullable String value) { this.modifiedDate = value; }
    /**
     * Set to a unique identifier of the user who last modified this Resource.
     *
     * @return The field modifiedBy
     */
    public @Nullable String getModifiedBy() { return this.modifiedBy; }
    /**
     * Set to a unique identifier of the user who last modified this Resource.
     *
     * @param value The new value for modifiedBy
     */
    public void setModifiedBy(@Nullable String value) { this.modifiedBy = value; }
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
