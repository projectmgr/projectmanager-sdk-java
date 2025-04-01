
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
 * This is the projectId being restored to
 */
public class ProjectRestoreProjectDto
{
    private @NotNull String id;

    /**
     * The unique identifier of the Project.  This value is set by the system and cannot
     * be set with a CreateProject or changed with an UpdateProject call.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the Project.  This value is set by the system and cannot
     * be set with a CreateProject or changed with an UpdateProject call.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
