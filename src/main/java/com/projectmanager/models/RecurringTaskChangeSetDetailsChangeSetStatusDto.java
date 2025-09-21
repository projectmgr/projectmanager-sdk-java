
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
 * Returns the id of a specific ChangeSet
 */
public class RecurringTaskChangeSetDetailsChangeSetStatusDto
{
    private @NotNull String changeSetId;
    private @NotNull String id;
    private @NotNull RecurringTaskChangeSetDetails data;

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
    /**
     * Details about the changeset
     *
     * @return The field data
     */
    public @NotNull RecurringTaskChangeSetDetails getData() { return this.data; }
    /**
     * Details about the changeset
     *
     * @param value The new value for data
     */
    public void setData(@NotNull RecurringTaskChangeSetDetails value) { this.data = value; }
};
