
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


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Resource represents a person, material, or tool that is used within your Projects.
 * When you attach a Resources to more than one Task, the software will schedule the usage
 * of your Resource so that it is not allocated to more than one Task at the same time.
 * The users in your Workspace are also considered Resources.  To invite a new User to your
 * Workspace, create a new Resource for that user.
 */
public class ResourceCreateDto
{
    private @NotNull String firstName;
    private @Nullable String lastName;
    private @Nullable String email;
    private @Nullable Double hourlyRate;
    private @Nullable String phone;
    private @Nullable String city;
    private @Nullable String state;
    private @Nullable String countryCode;
    private @Nullable String notes;
    private @Nullable String roleId;
    private @Nullable String[] teamIds;
    private @Nullable String[] skillIds;

    /**
     * The first name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field firstName
     */
    public @NotNull String getFirstName() { return this.firstName; }
    /**
     * The first name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for firstName
     */
    public void setFirstName(@NotNull String value) { this.firstName = value; }
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
     * The email address of this Resource.
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     * The email address of this Resource.
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
     * The Role Id associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @return The field roleId
     */
    public @Nullable String getRoleId() { return this.roleId; }
    /**
     * The Role Id associated with this Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for roleId
     */
    public void setRoleId(@Nullable String value) { this.roleId = value; }
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
};
