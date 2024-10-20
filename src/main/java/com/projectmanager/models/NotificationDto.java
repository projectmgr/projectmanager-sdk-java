
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
 * A notification represents a message sent to a user to inform them of relevant actions or events within their
 * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
 * than 1,000 pending notifications some old notifications will be deleted automatically.
 */
public class NotificationDto
{
    private @NotNull String id;
    private @NotNull String senderId;
    private @Nullable NotificationDto[] children;
    private @NotNull String notificationType;
    private @NotNull String createDate;
    private @NotNull String subject;
    private @NotNull String message;
    private @Nullable String readDate;
    private @NotNull NotificationDataDto data;

    /**
     * The unique identifier of this notification
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this notification
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The unique identifier of the sender of this notification
     *
     * @return The field senderId
     */
    public @NotNull String getSenderId() { return this.senderId; }
    /**
     * The unique identifier of the sender of this notification
     *
     * @param value The new value for senderId
     */
    public void setSenderId(@NotNull String value) { this.senderId = value; }
    /**
     * If you received multiple notifications from the same user in a short period of time, they will be
     * grouped together.  For example, if you receive multiple notifications about users joining the same
     * project, they will be grouped together in the Children element.
     *
     * @return The field children
     */
    public @Nullable NotificationDto[] getChildren() { return this.children; }
    /**
     * If you received multiple notifications from the same user in a short period of time, they will be
     * grouped together.  For example, if you receive multiple notifications about users joining the same
     * project, they will be grouped together in the Children element.
     *
     * @param value The new value for children
     */
    public void setChildren(@Nullable NotificationDto[] value) { this.children = value; }
    /**
     * A friendly category or type for this notification
     *
     * @return The field notificationType
     */
    public @NotNull String getNotificationType() { return this.notificationType; }
    /**
     * A friendly category or type for this notification
     *
     * @param value The new value for notificationType
     */
    public void setNotificationType(@NotNull String value) { this.notificationType = value; }
    /**
     * Timestamp when the notification was sent
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Timestamp when the notification was sent
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * User readable subject line for the notification
     *
     * @return The field subject
     */
    public @NotNull String getSubject() { return this.subject; }
    /**
     * User readable subject line for the notification
     *
     * @param value The new value for subject
     */
    public void setSubject(@NotNull String value) { this.subject = value; }
    /**
     * User readable message content for the notification
     *
     * @return The field message
     */
    public @NotNull String getMessage() { return this.message; }
    /**
     * User readable message content for the notification
     *
     * @param value The new value for message
     */
    public void setMessage(@NotNull String value) { this.message = value; }
    /**
     * Timestamp when the notification was acknowledged as read
     *
     * @return The field readDate
     */
    public @Nullable String getReadDate() { return this.readDate; }
    /**
     * Timestamp when the notification was acknowledged as read
     *
     * @param value The new value for readDate
     */
    public void setReadDate(@Nullable String value) { this.readDate = value; }
    /**
     * A string containing JSON-encoded extra data for the notification
     *
     * @return The field data
     */
    public @NotNull NotificationDataDto getData() { return this.data; }
    /**
     * A string containing JSON-encoded extra data for the notification
     *
     * @param value The new value for data
     */
    public void setData(@NotNull NotificationDataDto value) { this.data = value; }
};
