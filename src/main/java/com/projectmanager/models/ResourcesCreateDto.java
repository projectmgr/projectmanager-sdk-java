
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
 * The ResourcesCreate object allows you to create multiple Users with a single API call.
 * In ProjectManager.com, a User is a special class of Resource.
 *
 * A Resource represents a person, material, or tool that is used within your Projects.
 * When you attach a Resources to more than one Task, the software will schedule the usage
 * of your Resource so that it is not allocated to more than one Task at the same time.
 * The users in your Workspace are also considered Resources.  To invite a new User to your
 * Workspace, create a new Resource for that user.
 */
public class ResourcesCreateDto
{
    private @Nullable String[] projectIds;
    private @NotNull ResourceCreateDto[] users;

    /**
     * When creating a user they will also be added to the projectIds specified. If null or empty the user will be
     * invited but no access will be given to any projects.
     *
     * @return The field projectIds
     */
    public @Nullable String[] getProjectIds() { return this.projectIds; }
    /**
     * When creating a user they will also be added to the projectIds specified. If null or empty the user will be
     * invited but no access will be given to any projects.
     *
     * @param value The new value for projectIds
     */
    public void setProjectIds(@Nullable String[] value) { this.projectIds = value; }
    /**
     * A list of Users to create
     *
     * @return The field users
     */
    public @NotNull ResourceCreateDto[] getUsers() { return this.users; }
    /**
     * A list of Users to create
     *
     * @param value The new value for users
     */
    public void setUsers(@NotNull ResourceCreateDto[] value) { this.users = value; }
};
