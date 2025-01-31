
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
 * When uploading a list of names to an API, this data structure represents an
 * individual name within the list.
 */
public class NameDto
{
    private @NotNull String name;

    /**
     * A name.  To determine the meaning of this name, see the field to which this
     * value is attached in the parent object.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * A name.  To determine the meaning of this name, see the field to which this
     * value is attached in the parent object.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
