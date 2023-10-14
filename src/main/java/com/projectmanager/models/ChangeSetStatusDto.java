
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Returns the id of a specific ChangeSet
 */
public class ChangeSetStatusDto
{
    private @NotNull String changeSetId;
    private @NotNull String id;

    /**
     * The unique identifier of this Changeset
     *
     * @return The field changeSetId
     */
    public @NotNull String getChangeSetId() { return this.changeSetId; }
    /**
     * The unique identifier of this Changeset
     *
     * @param value The new value for changeSetId
     */
    public void setChangeSetId(@NotNull String value) { this.changeSetId = value; }
    /**
     * The unique identifier of the entity affected by this Changeset.  For example, if this
     * Changeset was created for a Task, this value will be the unique identifier for the Task.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the entity affected by this Changeset.  For example, if this
     * Changeset was created for a Task, this value will be the unique identifier for the Task.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
