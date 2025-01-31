
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
 * A ProjectFolder is a named storage location that can contain Projects.
 */
public class ProjectFolderDto
{
    private @NotNull String id;
    private @NotNull String name;

    /**
     * The unique identifier of this ProjectFolder.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectFolder.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ProjectFolder.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this ProjectFolder.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
