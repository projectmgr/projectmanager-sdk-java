
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
 * A ProjectChange is an individual edit that has been made to a project.  Since multiple users
 * can edit a project at the same time, individual ProjectChanges are applied in a sequential
 * fashion. If a ProjectChange causes a conflict or cannot be applied, it will be rejected.
 * You can examine a ProjectChange to determine its conflict resolution status.
 */
public class ProjectChangeStatusDto
{
    private @NotNull String id;
    private @Nullable Boolean success;
    private @NotNull String state;

    /**
     * The unique identifier of this ProjectChange.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectChange.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * True if this ProjectChange was successfully applied.  If the ProjectChange has not been
     * applied, this value is null.
     *
     * @return The field success
     */
    public @Nullable Boolean getSuccess() { return this.success; }
    /**
     * True if this ProjectChange was successfully applied.  If the ProjectChange has not been
     * applied, this value is null.
     *
     * @param value The new value for success
     */
    public void setSuccess(@Nullable Boolean value) { this.success = value; }
    /**
     * A status flag that indicates the progress of the ProjectChange through resolution.
     *
     * @return The field state
     */
    public @NotNull String getState() { return this.state; }
    /**
     * A status flag that indicates the progress of the ProjectChange through resolution.
     *
     * @param value The new value for state
     */
    public void setState(@NotNull String value) { this.state = value; }
};
