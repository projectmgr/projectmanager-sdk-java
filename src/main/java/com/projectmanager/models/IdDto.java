
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
 * When uploading a list of unique identifiers to the API, this data structure
 * represents one individual unique identifier within the list.
 */
public class IdDto
{
    private @NotNull String id;

    /**
     * A unique identifier.  To determine the meaning of this unique identifier,
     * see the field to which this value is attached.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * A unique identifier.  To determine the meaning of this unique identifier,
     * see the field to which this value is attached.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
