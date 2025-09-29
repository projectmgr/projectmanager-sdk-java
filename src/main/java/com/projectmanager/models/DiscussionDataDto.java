
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
 * Task discussion data
 */
public class DiscussionDataDto
{
    private @NotNull Integer count;
    private @Nullable String lastUpdatedDate;
    private @Nullable String lastReadDate;

    /**
     * Count of task comments
     *
     * @return The field count
     */
    public @NotNull Integer getCount() { return this.count; }
    /**
     * Count of task comments
     *
     * @param value The new value for count
     */
    public void setCount(@NotNull Integer value) { this.count = value; }
    /**
     * Last update date
     *
     * @return The field lastUpdatedDate
     */
    public @Nullable String getLastUpdatedDate() { return this.lastUpdatedDate; }
    /**
     * Last update date
     *
     * @param value The new value for lastUpdatedDate
     */
    public void setLastUpdatedDate(@Nullable String value) { this.lastUpdatedDate = value; }
    /**
     * Last read date
     *
     * @return The field lastReadDate
     */
    public @Nullable String getLastReadDate() { return this.lastReadDate; }
    /**
     * Last read date
     *
     * @param value The new value for lastReadDate
     */
    public void setLastReadDate(@Nullable String value) { this.lastReadDate = value; }
};
