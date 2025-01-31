
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
public class TimesheetResourceDto
{
    private @NotNull String id;
    private @NotNull String firstName;
    private @NotNull String lastName;
    private @NotNull String email;
    private @Nullable Double hourlyRate;

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
    public @NotNull String getLastName() { return this.lastName; }
    /**
     * The last name of the person Resource.
     *
     * Applies to personnel Resources only.
     *
     * @param value The new value for lastName
     */
    public void setLastName(@NotNull String value) { this.lastName = value; }
    /**
     * The email address of this Resource.
     *
     * @return The field email
     */
    public @NotNull String getEmail() { return this.email; }
    /**
     * The email address of this Resource.
     *
     * @param value The new value for email
     */
    public void setEmail(@NotNull String value) { this.email = value; }
    /**
     * The default hourly rate of the resource.
     *
     * @return The field hourlyRate
     */
    public @Nullable Double getHourlyRate() { return this.hourlyRate; }
    /**
     * The default hourly rate of the resource.
     *
     * @param value The new value for hourlyRate
     */
    public void setHourlyRate(@Nullable Double value) { this.hourlyRate = value; }
};
