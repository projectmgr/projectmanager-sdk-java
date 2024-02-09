
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

public class ProjectFileDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String url;
    private @Nullable ProjectFileTaskDto task;
    private @Nullable ProjectFileFolderDto folder;

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
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the file
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The url of the file which can be used for downloading
     *
     * @return The field url
     */
    public @Nullable String getUrl() { return this.url; }
    /**
     * The url of the file which can be used for downloading
     *
     * @param value The new value for url
     */
    public void setUrl(@Nullable String value) { this.url = value; }
    /**
     * The project task that this file relates to.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @return The field task
     */
    public @Nullable ProjectFileTaskDto getTask() { return this.task; }
    /**
     * The project task that this file relates to.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @param value The new value for task
     */
    public void setTask(@Nullable ProjectFileTaskDto value) { this.task = value; }
    /**
     * The folder that this file relates to.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @return The field folder
     */
    public @Nullable ProjectFileFolderDto getFolder() { return this.folder; }
    /**
     * The folder that this file relates to.
     *
     * This field will be present when you fetch a single object.
     * When you query for multiple objects, this field is not included in results by default.
     * To expand this field, specify the name of this field in the `$expand` parameter.
     *
     * @param value The new value for folder
     */
    public void setFolder(@Nullable ProjectFileFolderDto value) { this.folder = value; }
};
