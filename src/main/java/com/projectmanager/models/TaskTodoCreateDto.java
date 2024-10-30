
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
 * The properties for creating a TaskTodo.
 */
public class TaskTodoCreateDto
{
    private @NotNull String text;
    private @NotNull Boolean complete;

    /**
     * The full description of this TaskTodo.
     *
     * @return The field text
     */
    public @NotNull String getText() { return this.text; }
    /**
     * The full description of this TaskTodo.
     *
     * @param value The new value for text
     */
    public void setText(@NotNull String value) { this.text = value; }
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
};
