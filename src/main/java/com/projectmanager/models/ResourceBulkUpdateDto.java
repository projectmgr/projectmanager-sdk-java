
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
 * Represents the values to apply to a single Resource as part of a bulk Resource update API call.
 *
 * This is a deliberately reduced version of Astro.Api.Dto.Resources.ResourceUpdateDto. Only fields that are
 * sensible to update across many Resources at once are included. The following fields are intentionally
 * omitted because they represent per-person identity or carry per-Resource side effects that should not
 * be applied in bulk:
 *
 * - Email: cannot be changed once assigned and is unique per person.
 * - RoleId: triggers invite-permission, account-owner and last-global-admin logic.
 * - IsActive: triggers last-global-admin and license-count logic.
 * - HourlyRate: triggers workspace-wide hourly rate recalculations.
 * - ClearAvatar: removes the stored avatar image and deletes the asset from S3.
 */
public class ResourceBulkUpdateDto
{
    private @NotNull String resourceId;
    private @Nullable String firstName;
    private @Nullable String lastName;
    private @Nullable String phone;
    private @Nullable String city;
    private @Nullable String state;
    private @Nullable String countryCode;
    private @Nullable String notes;
    private @Nullable String[] teamIds;
    private @Nullable String[] skillIds;
    private @Nullable String approverId;
    private @Nullable String colorName;
    private @Nullable String language;
    private @Nullable Integer publicAvatarId;
    private @Nullable Double defaultPlannedHours;
    private @Nullable ResourceWorkingDaysHours workingDays;

    /**
     * The unique identifier of the Resource to update.
     *
     * @return The field resourceId
     */
    public @NotNull String getResourceId() { return this.resourceId; }
    /**
     * The unique identifier of the Resource to update.
     *
     * @param value The new value for resourceId
     */
    public void setResourceId(@NotNull String value) { this.resourceId = value; }
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
     * A text field indicating the country in which this Resource is located.
     * This value must be one of the following: US, NZ, AU.
     *
     * @return The field countryCode
     */
    public @Nullable String getCountryCode() { return this.countryCode; }
    /**
     * A text field indicating the country in which this Resource is located.
     * This value must be one of the following: US, NZ, AU.
     *
     * @param value The new value for countryCode
     */
    public void setCountryCode(@Nullable String value) { this.countryCode = value; }
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
     * The list of ResourceTeams to which this Resource belongs.
     *
     * @return The field teamIds
     */
    public @Nullable String[] getTeamIds() { return this.teamIds; }
    /**
     * The list of ResourceTeams to which this Resource belongs.
     *
     * @param value The new value for teamIds
     */
    public void setTeamIds(@Nullable String[] value) { this.teamIds = value; }
    /**
     * The list of ResourceSkills possessed by this Resource.
     *
     * @return The field skillIds
     */
    public @Nullable String[] getSkillIds() { return this.skillIds; }
    /**
     * The list of ResourceSkills possessed by this Resource.
     *
     * @param value The new value for skillIds
     */
    public void setSkillIds(@Nullable String[] value) { this.skillIds = value; }
    /**
     * The Approver Id associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field approverId
     */
    public @Nullable String getApproverId() { return this.approverId; }
    /**
     * The Approver Id associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for approverId
     */
    public void setApproverId(@Nullable String value) { this.approverId = value; }
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
     * Translation Language for this resource.
     *
     * e.g. en-US, en-GB, fr-FR, es-ES
     *
     * @return The field language
     */
    public @Nullable String getLanguage() { return this.language; }
    /**
     * Translation Language for this resource.
     *
     * e.g. en-US, en-GB, fr-FR, es-ES
     *
     * @param value The new value for language
     */
    public void setLanguage(@Nullable String value) { this.language = value; }
    /**
     * Public avatar image index (1-42). The avatar URL is generated as /assets/images/avatars/{index:000}.png.
     * Only numeric public avatars are accepted; custom URLs are not supported.
     *
     * @return The field publicAvatarId
     */
    public @Nullable Integer getPublicAvatarId() { return this.publicAvatarId; }
    /**
     * Public avatar image index (1-42). The avatar URL is generated as /assets/images/avatars/{index:000}.png.
     * Only numeric public avatars are accepted; custom URLs are not supported.
     *
     * @param value The new value for publicAvatarId
     */
    public void setPublicAvatarId(@Nullable Integer value) { this.publicAvatarId = value; }
    /**
     * Default planned effort in hours. When set, updates the resource; when omitted, existing value is unchanged.
     *
     * @return The field defaultPlannedHours
     */
    public @Nullable Double getDefaultPlannedHours() { return this.defaultPlannedHours; }
    /**
     * Default planned effort in hours. When set, updates the resource; when omitted, existing value is unchanged.
     *
     * @param value The new value for defaultPlannedHours
     */
    public void setDefaultPlannedHours(@Nullable Double value) { this.defaultPlannedHours = value; }
    /**
     * Per-day working hours. When non-null, updates or creates the resource calendar; set only days to change—they merge over workspace defaults.
     *
     * @return The field workingDays
     */
    public @Nullable ResourceWorkingDaysHours getWorkingDays() { return this.workingDays; }
    /**
     * Per-day working hours. When non-null, updates or creates the resource calendar; set only days to change—they merge over workspace defaults.
     *
     * @param value The new value for workingDays
     */
    public void setWorkingDays(@Nullable ResourceWorkingDaysHours value) { this.workingDays = value; }
};
