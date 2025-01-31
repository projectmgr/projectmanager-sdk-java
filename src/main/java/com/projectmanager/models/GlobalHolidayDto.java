
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
 * Global holiday entry
 */
public class GlobalHolidayDto
{
    private @NotNull String id;
    private @NotNull String date;

    /**
     * Holiday id
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Holiday id
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Date of holiday
     *
     * @return The field date
     */
    public @NotNull String getDate() { return this.date; }
    /**
     * Date of holiday
     *
     * @param value The new value for date
     */
    public void setDate(@NotNull String value) { this.date = value; }
};
