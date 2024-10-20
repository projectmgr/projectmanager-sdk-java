
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
 * A ProjectManager is a person who manages a Project.
 */
public class ProjectManagerDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String initials;
    private @Nullable String avatarUrl;

    /**
     * The unique identifier of this ProjectManager
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectManager
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ProjectManager
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this ProjectManager
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * Manager initials
     *
     * @return The field initials
     */
    public @NotNull String getInitials() { return this.initials; }
    /**
     * Manager initials
     *
     * @param value The new value for initials
     */
    public void setInitials(@NotNull String value) { this.initials = value; }
    /**
     * Avatar's url
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * Avatar's url
     *
     * @param value The new value for avatarUrl
     */
    public void setAvatarUrl(@Nullable String value) { this.avatarUrl = value; }
};
