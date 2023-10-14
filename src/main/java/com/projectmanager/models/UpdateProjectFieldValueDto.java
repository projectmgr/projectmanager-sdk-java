
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
 * A model that contains a new value to be set for a ProjectField.
 */
public class UpdateProjectFieldValueDto
{
    private @Nullable String value;

    /**
     * The new value to be set for this ProjectField.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The new value to be set for this ProjectField.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
};
