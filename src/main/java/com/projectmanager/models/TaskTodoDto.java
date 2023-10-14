
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
 * A TaskTodo is a sub-task that represents a unit of work on the Task.  You can use
 * TaskTodo to represent individual items for a larger piece of work.
 */
public class TaskTodoDto
{
    private @NotNull String id;
    private @Nullable String text;
    private @NotNull Boolean complete;
    private @NotNull String createDate;
    private @NotNull String modifyDate;

    /**
     * The unique identifier of this TaskTodo.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskTodo.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The full description of this TaskTodo.
     *
     * @return The field text
     */
    public @Nullable String getText() { return this.text; }
    /**
     * The full description of this TaskTodo.
     *
     * @param value The new value for text
     */
    public void setText(@Nullable String value) { this.text = value; }
    /**
     * True if this TaskTodo is complete.
     *
     * @return The field complete
     */
    public @NotNull Boolean getComplete() { return this.complete; }
    /**
     * True if this TaskTodo is complete.
     *
     * @param value The new value for complete
     */
    public void setComplete(@NotNull Boolean value) { this.complete = value; }
    /**
     * The timestamp in UTC when this object was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp in UTC when this object was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The timestamp in UTC when this object was last modified.
     *
     * @return The field modifyDate
     */
    public @NotNull String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp in UTC when this object was last modified.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@NotNull String value) { this.modifyDate = value; }
};
