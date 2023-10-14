
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
 * A TaskStatus is a named status level used by your business to determine how to measure the
 * progress of Tasks.  You can define your own named status levels that are appropriate for
 * your business and determine which status levels are considered done.
 */
public class TaskStatusUpdateDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable Integer order;

    /**
     * The unique identifier of this TaskStatus.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this TaskStatus.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this TaskStatus.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this TaskStatus.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A numerical value that can be used to sort TaskStatus values according to the
     * needs of your business.
     *
     * @return The field order
     */
    public @Nullable Integer getOrder() { return this.order; }
    /**
     * A numerical value that can be used to sort TaskStatus values according to the
     * needs of your business.
     *
     * @param value The new value for order
     */
    public void setOrder(@Nullable Integer value) { this.order = value; }
};
