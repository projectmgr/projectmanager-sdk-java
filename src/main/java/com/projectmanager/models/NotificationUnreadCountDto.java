
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
 * Information about notifications for the current user.
 *
 * A notification represents a message sent to a user to inform them of relevant actions or events within their
 * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
 * than 1,000 pending notifications some old notifications will be deleted automatically.
 */
public class NotificationUnreadCountDto
{
    private @NotNull Integer unreadCount;

    /**
     * The number of unread notifications for the current user.
     *
     * @return The field unreadCount
     */
    public @NotNull Integer getUnreadCount() { return this.unreadCount; }
    /**
     * The number of unread notifications for the current user.
     *
     * @param value The new value for unreadCount
     */
    public void setUnreadCount(@NotNull Integer value) { this.unreadCount = value; }
};
