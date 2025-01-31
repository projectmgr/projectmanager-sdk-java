
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
 * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
 * represent individual items of work that team members must complete.  The sum total of Tasks
 * within a Project represents the work to be completed for that Project.
 */
public class TaskProjectDto
{
    private @NotNull String id;
    private @NotNull String shortId;
    private @NotNull String name;

    /**
     * The unique identifier of this Project.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Project.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The ShortId of this Project.
     *
     * @return The field shortId
     */
    public @NotNull String getShortId() { return this.shortId; }
    /**
     * The ShortId of this Project.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@NotNull String value) { this.shortId = value; }
    /**
     * The common name of this Project.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The common name of this Project.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
