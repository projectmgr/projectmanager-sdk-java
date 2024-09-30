
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
 * The DiscussionCommentFile represents a file that has been attached to a discussion
 * and is available for download.
 */
public class DiscussionCommentFileDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String url;

    /**
     * The identifier for this file
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The identifier for this file
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of the file
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the file
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The url of the DownloadFile API to retrieve this file
     *
     * @return The field url
     */
    public @Nullable String getUrl() { return this.url; }
    /**
     * The url of the DownloadFile API to retrieve this file
     *
     * @param value The new value for url
     */
    public void setUrl(@Nullable String value) { this.url = value; }
};
