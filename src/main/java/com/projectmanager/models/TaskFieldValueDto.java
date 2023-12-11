
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
 * A model that contains the value for a TaskField.
 */
public class TaskFieldValueDto
{
    private @NotNull String id;
    private @Nullable String shortId;
    private @Nullable String value;
    private @NotNull String createdDate;
    private @NotNull String modifiedDate;
    private @Nullable TaskFieldValueTaskDto task;

    /**
     * The unique identifier of this TaskField.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskField.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique Short Id of this TaskField.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * The unique Short Id of this TaskField.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The value currently set for this TaskFieldValue.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value currently set for this TaskFieldValue.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
    /**
     * Date and time (in UTC) that this TaskField was created.
     *
     * @return The field createdDate
     */
    public @NotNull String getCreatedDate() { return this.createdDate; }
    /**
     * Date and time (in UTC) that this TaskField was created.
     *
     * @param value The new value for createdDate
     */
    public void setCreatedDate(@NotNull String value) { this.createdDate = value; }
    /**
     * Date and time (in UTC) that this TaskField was last modified.
     *
     * @return The field modifiedDate
     */
    public @NotNull String getModifiedDate() { return this.modifiedDate; }
    /**
     * Date and time (in UTC) that this TaskField was last modified.
     *
     * @param value The new value for modifiedDate
     */
    public void setModifiedDate(@NotNull String value) { this.modifiedDate = value; }
    /**
     * The Task to which this Value belongs.
     *
     * @return The field task
     */
    public @Nullable TaskFieldValueTaskDto getTask() { return this.task; }
    /**
     * The Task to which this Value belongs.
     *
     * @param value The new value for task
     */
    public void setTask(@Nullable TaskFieldValueTaskDto value) { this.task = value; }
};
