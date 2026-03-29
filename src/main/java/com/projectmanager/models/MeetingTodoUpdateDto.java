
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
 * The properties for updating a MeetingTodo.
 */
public class MeetingTodoUpdateDto
{
    private @Nullable String text;
    private @Nullable Boolean complete;

    /**
     * The full description of this MeetingTodo.
     *
     * @return The field text
     */
    public @Nullable String getText() { return this.text; }
    /**
     * The full description of this MeetingTodo.
     *
     * @param value The new value for text
     */
    public void setText(@Nullable String value) { this.text = value; }
    /**
     * True if this MeetingTodo is complete.
     *
     * @return The field complete
     */
    public @Nullable Boolean getComplete() { return this.complete; }
    /**
     * True if this MeetingTodo is complete.
     *
     * @param value The new value for complete
     */
    public void setComplete(@Nullable Boolean value) { this.complete = value; }
};
