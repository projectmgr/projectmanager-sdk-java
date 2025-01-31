
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
 * Represents a file associated with a Task in project manager
 */
public class TaskFileDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String url;

    /**
     * The identifier for this file
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The identifier for this file
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of the file
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the file
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The url of the file which can be used for downloading
     *
     * @return The field url
     */
    public @NotNull String getUrl() { return this.url; }
    /**
     * The url of the file which can be used for downloading
     *
     * @param value The new value for url
     */
    public void setUrl(@NotNull String value) { this.url = value; }
};
