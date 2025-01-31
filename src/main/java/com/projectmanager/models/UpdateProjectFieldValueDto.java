
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
 * A model that contains a new value to be set for a ProjectField.
 */
public class UpdateProjectFieldValueDto
{
    private @NotNull String value;

    /**
     * The new value to be set for this ProjectField.
     *
     * @return The field value
     */
    public @NotNull String getValue() { return this.value; }
    /**
     * The new value to be set for this ProjectField.
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull String value) { this.value = value; }
};
