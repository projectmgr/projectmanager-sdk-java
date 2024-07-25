
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
 * Information about notifications for the current user.
 *
 * A notification represents a message sent to a user to inform them of relevant actions or events within their
 * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
 * than 1,000 pending notifications some old notifications will be deleted automatically.
 */
public class NotificationResponseDto
{
    private @Nullable NotificationDto[] items;
    private @NotNull Integer totalCount;
    private @NotNull Integer unreadCount;

    /**
     * The most recent notifications pending for the current user.  If no notifications are pending for the current
     * user, this will be an empty array.  If there are more than 1,000 notifications this list may be truncated to
     * only the 1,000 most recent notifications.
     *
     * @return The field items
     */
    public @Nullable NotificationDto[] getItems() { return this.items; }
    /**
     * The most recent notifications pending for the current user.  If no notifications are pending for the current
     * user, this will be an empty array.  If there are more than 1,000 notifications this list may be truncated to
     * only the 1,000 most recent notifications.
     *
     * @param value The new value for items
     */
    public void setItems(@Nullable NotificationDto[] value) { this.items = value; }
    /**
     * The total number of pending notifications for the current user, including both read and unread.
     *
     * @return The field totalCount
     */
    public @NotNull Integer getTotalCount() { return this.totalCount; }
    /**
     * The total number of pending notifications for the current user, including both read and unread.
     *
     * @param value The new value for totalCount
     */
    public void setTotalCount(@NotNull Integer value) { this.totalCount = value; }
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
