
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
 * A Changeset is an individual edit that has been made to a project.  Since multiple users can
 * edit a project at the same time, individual Changesets are applied in a sequential fashion. If
 * a Changeset causes a conflict or cannot be applied, it will be rejected.  You can examine a
 * Changeset to determine its conflict resolution status.
 */
public class ChangesetGetResponseDto
{
    private @NotNull String id;
    private @Nullable Boolean success;
    private @NotNull String state;

    /**
     * The unique identifier of this Changeset.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Changeset.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * True if this Changeset was successfully applied.  If the Changeset has not been applied,
     * this value is null.
     *
     * @return The field success
     */
    public @Nullable Boolean getSuccess() { return this.success; }
    /**
     * True if this Changeset was successfully applied.  If the Changeset has not been applied,
     * this value is null.
     *
     * @param value The new value for success
     */
    public void setSuccess(@Nullable Boolean value) { this.success = value; }
    /**
     * A status flag that indicates the progress of the Changeset through resolution.
     *
     * @return The field state
     */
    public @NotNull String getState() { return this.state; }
    /**
     * A status flag that indicates the progress of the Changeset through resolution.
     *
     * @param value The new value for state
     */
    public void setState(@NotNull String value) { this.state = value; }
};
