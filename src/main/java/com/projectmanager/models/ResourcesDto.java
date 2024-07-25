
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
public class ResourcesDto
{
    private @Nullable ResourceDto[] resources;
    private @Nullable UserError[] errors;

    /**
     *
     * @return The field resources
     */
    public @Nullable ResourceDto[] getResources() { return this.resources; }
    /**
     *
     * @param value The new value for resources
     */
    public void setResources(@Nullable ResourceDto[] value) { this.resources = value; }
    /**
     *
     * @return The field errors
     */
    public @Nullable UserError[] getErrors() { return this.errors; }
    /**
     *
     * @param value The new value for errors
     */
    public void setErrors(@Nullable UserError[] value) { this.errors = value; }
};
