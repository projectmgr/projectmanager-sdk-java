
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
 * A ProjectVersion is a snapshot of a Project at a specific moment in time.  Information on
 * the ProjectVersion record keeps track of the unique identity of this version, plus the name
 * and details of the user who created this version, and the changes that were made.
 */
public class ProjectVersionDto
{
    private @NotNull String id;
    private @NotNull Integer version;
    private @Nullable String initials;
    private @Nullable String name;
    private @Nullable String avatarUrl;
    private @Nullable String color;
    private @NotNull String createDate;
    private @NotNull String userId;
    private @Nullable String groupId;
    private @Nullable ProjectVersionChangeDataDto changeData;

    /**
     * The unique identifier of the project version.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the project version.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Version of the Project
     *
     * @return The field version
     */
    public @NotNull Integer getVersion() { return this.version; }
    /**
     * Version of the Project
     *
     * @param value The new value for version
     */
    public void setVersion(@NotNull Integer value) { this.version = value; }
    /**
     * the initials of the user
     *
     * @return The field initials
     */
    public @Nullable String getInitials() { return this.initials; }
    /**
     * the initials of the user
     *
     * @param value The new value for initials
     */
    public void setInitials(@Nullable String value) { this.initials = value; }
    /**
     * The display name of the user
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The display name of the user
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Avatar URL
     *
     * @return The field avatarUrl
     */
    public @Nullable String getAvatarUrl() { return this.avatarUrl; }
    /**
     * Avatar URL
     *
     * @param value The new value for avatarUrl
     */
    public void setAvatarUrl(@Nullable String value) { this.avatarUrl = value; }
    /**
     * The color for their avatar
     *
     * @return The field color
     */
    public @Nullable String getColor() { return this.color; }
    /**
     * The color for their avatar
     *
     * @param value The new value for color
     */
    public void setColor(@Nullable String value) { this.color = value; }
    /**
     * Version datetime
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * Version datetime
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The unique identifier of user who created backup
     *
     * @return The field userId
     */
    public @NotNull String getUserId() { return this.userId; }
    /**
     * The unique identifier of user who created backup
     *
     * @param value The new value for userId
     */
    public void setUserId(@NotNull String value) { this.userId = value; }
    /**
     * The group version belongs to
     *
     * @return The field groupId
     */
    public @Nullable String getGroupId() { return this.groupId; }
    /**
     * The group version belongs to
     *
     * @param value The new value for groupId
     */
    public void setGroupId(@Nullable String value) { this.groupId = value; }
    /**
     * Subset of the changes related to this ProjectVersion
     *
     * @return The field changeData
     */
    public @Nullable ProjectVersionChangeDataDto getChangeData() { return this.changeData; }
    /**
     * Subset of the changes related to this ProjectVersion
     *
     * @param value The new value for changeData
     */
    public void setChangeData(@Nullable ProjectVersionChangeDataDto value) { this.changeData = value; }
};
