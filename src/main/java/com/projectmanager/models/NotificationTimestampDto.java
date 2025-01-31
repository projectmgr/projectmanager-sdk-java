
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
 * A notification represents a message sent to a user to inform them of relevant actions or events within their
 * workspace. Notifications are ephemeral and may be deleted when they are no longer needed.  When a user has more
 * than 1,000 pending notifications some old notifications will be deleted automatically.
 */
public class NotificationTimestampDto
{
    private @NotNull String timestamp;

    /**
     * The timestamp of the notification action
     *
     * @return The field timestamp
     */
    public @NotNull String getTimestamp() { return this.timestamp; }
    /**
     * The timestamp of the notification action
     *
     * @param value The new value for timestamp
     */
    public void setTimestamp(@NotNull String value) { this.timestamp = value; }
};
