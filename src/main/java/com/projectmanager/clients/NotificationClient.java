
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


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.NotificationResponseDto;

import com.projectmanager.models.NotificationTotalCountDto;
import com.projectmanager.models.NotificationUnreadCountDto;
import com.projectmanager.models.NotificationTimestampDto;

/**
 * Contains all methods related to Notification
 */
public class NotificationClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Notification API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public NotificationClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Retrieve the most recent notifications for the current user, along with the amount of notifications.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * This API retrieves 500 notifications at a time.  To fetch more than 500 notifications, repeat this API call
     * using the parameter `lastId` of the oldest notification from each batch to fetch the next 500 notifications.
     *
     * @param lastId To continue loading more notifications in a series of requests, provide the ID of the oldest notification from the currently loaded batch as the `lastId` parameter
     * @param senderId Filter the notifications to only those sent by the user with the specified ID
     * @param notificationTypes Specifies the types of notifications to return. If not provided, all notifications will be returned.
     * @param asFlatList If set to true all notifications will be returned as a flat list, otherwise they will be grouped by parent in the same manner as displayed in the UI.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NotificationResponseDto> retrieveNotifications(@Nullable String lastId, @Nullable String senderId, @Nullable String[] notificationTypes, @Nullable Boolean asFlatList)
    {
        RestRequest<NotificationResponseDto> r = new RestRequest<NotificationResponseDto>(this.client, "GET", "/api/data/notifications");
        if (lastId != null) { r.AddQuery("lastId", lastId.toString()); }
        if (senderId != null) { r.AddQuery("senderId", senderId.toString()); }
        if (notificationTypes != null) { r.AddQuery("notificationTypes", notificationTypes.toString()); }
        if (asFlatList != null) { r.AddQuery("asFlatList", asFlatList.toString()); }
        return r.Call(new TypeToken<AstroResult<NotificationResponseDto>>() {}.getType());
    }

    /**
     * Retrieve the total count of pending notifications for the current user.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NotificationTotalCountDto> notificationCount()
    {
        RestRequest<NotificationTotalCountDto> r = new RestRequest<NotificationTotalCountDto>(this.client, "GET", "/api/data/notifications/count");
        return r.Call(new TypeToken<AstroResult<NotificationTotalCountDto>>() {}.getType());
    }

    /**
     * Retrieve the count of unread notifications for the current user.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NotificationUnreadCountDto> unreadNotificationCount()
    {
        RestRequest<NotificationUnreadCountDto> r = new RestRequest<NotificationUnreadCountDto>(this.client, "GET", "/api/data/notifications/unreadcount");
        return r.Call(new TypeToken<AstroResult<NotificationUnreadCountDto>>() {}.getType());
    }

    /**
     * Delete all pending notifications for the current user.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteAllNotifications()
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/notifications/deleteall");
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Marks a pending notification as read.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @param id The unique identifier of the notification to mark read
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NotificationTimestampDto> markNotificationRead(@NotNull String id)
    {
        RestRequest<NotificationTimestampDto> r = new RestRequest<NotificationTimestampDto>(this.client, "POST", "/api/data/notifications/{id}/markread");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<NotificationTimestampDto>>() {}.getType());
    }

    /**
     * Marks all pending notification for the current user as read.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<NotificationTimestampDto> readAllNotifications()
    {
        RestRequest<NotificationTimestampDto> r = new RestRequest<NotificationTimestampDto>(this.client, "POST", "/api/data/notifications/markallread");
        return r.Call(new TypeToken<AstroResult<NotificationTimestampDto>>() {}.getType());
    }

    /**
     * Deletes a pending notification that is no longer wanted.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @param id The unique identifier of the notification to mark read
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteNotification(@NotNull String id)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/notifications/delete/{id}");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Marks a pending notification as unread.
     *
     * A notification represents a message sent to a user to inform them of relevant actions or events within their
     * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
     * than 1,000 pending notifications some old notifications will be deleted automatically.
     *
     * @param id The unique identifier of the notification to mark read
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> markNotificationUnread(@NotNull String id)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "POST", "/api/data/notifications/{id}/markunread");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
