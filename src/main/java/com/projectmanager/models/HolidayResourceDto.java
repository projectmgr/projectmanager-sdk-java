
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
 * A resource affected by a holiday. Additional fields may be added later.
 */
public class HolidayResourceDto
{
    private @NotNull String id;

    /**
     * The resource identifier.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The resource identifier.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
