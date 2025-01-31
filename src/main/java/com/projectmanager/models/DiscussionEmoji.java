
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
 * A reaction to a specific comment within a discussion thread.
 */
public class DiscussionEmoji
{
    private @NotNull String name;
    private @NotNull String[] userIds;

    /**
     * The name of the emoji
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of the emoji
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The list of user IDs of the users who tagged these emoji
     *
     * @return The field userIds
     */
    public @NotNull String[] getUserIds() { return this.userIds; }
    /**
     * The list of user IDs of the users who tagged these emoji
     *
     * @param value The new value for userIds
     */
    public void setUserIds(@NotNull String[] value) { this.userIds = value; }
};
