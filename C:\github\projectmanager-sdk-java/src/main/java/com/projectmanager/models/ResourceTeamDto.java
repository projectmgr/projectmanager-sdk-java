
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
 * A ResourceTeam is a group of Resources that can be referred to as a group.  You can use a
 * ResourceTeam as a shortcut to quickly assign or allocate multiple Resources quickly.
 */
public class ResourceTeamDto
{
    private @NotNull String id;
    private @NotNull String name;

    /**
     * The unique identifier of this ResourceTeam
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ResourceTeam
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ResourceTeam
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this ResourceTeam
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
