
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
 * The TaskFieldTask is a summary of the Task that this TaskFieldValue relates to.
 */
public class TaskFieldValueTaskDto
{
    private @NotNull String id;
    private @Nullable String shortId;
    private @Nullable String name;

    /**
     * The unique identifier of this Task.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Task.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique Short Id of this Task.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * The unique Short Id of this Task.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The common name of this Task.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The common name of this Task.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
