
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
 * A resource can be allocated a team.
 */
public class CreateResourceTeamDto
{
    private @NotNull String name;

    /**
     * The name of this Team.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this Team.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
