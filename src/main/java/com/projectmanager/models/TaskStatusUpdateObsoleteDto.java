
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

public class TaskStatusUpdateObsoleteDto
{
    private @Nullable String name;
    private @Nullable Integer order;
    private @NotNull String id;

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
};
