
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
 * The Resources object represents the results of a bulk Resource creation API call.
 *
 * A Resource represents a person, material, or tool that is used within your Projects.
 * When you attach a Resources to more than one Task, the software will schedule the usage
 * of your Resource so that it is not allocated to more than one Task at the same time.
 * The users in your Workspace are also considered Resources.  To invite a new User to your
 * Workspace, create a new Resource for that user.
 */
public class ResourcesDto
{
    private @NotNull ResourceDto[] resources;
    private @Nullable UserError[] errors;

    /**
     * The list of the Resources created by this API call.
     *
     * @return The field resources
     */
    public @NotNull ResourceDto[] getResources() { return this.resources; }
    /**
     * The list of the Resources created by this API call.
     *
     * @param value The new value for resources
     */
    public void setResources(@NotNull ResourceDto[] value) { this.resources = value; }
    /**
     * The list of errors that occurred for Resources that could not be created.
     *
     * @return The field errors
     */
    public @Nullable UserError[] getErrors() { return this.errors; }
    /**
     * The list of errors that occurred for Resources that could not be created.
     *
     * @param value The new value for errors
     */
    public void setErrors(@Nullable UserError[] value) { this.errors = value; }
};
