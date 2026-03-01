
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
 * DTO for updating a project field definition (e.g. rename).
 */
public class UpdateProjectFieldDto
{
    private @NotNull String name;

    /**
     * The new name of the field.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The new name of the field.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
