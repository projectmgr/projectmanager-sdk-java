
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Tasks can have discussions attached to them.  These discussions can include text with simple
 * formatting.  Discussion comments are formatted using [Markdown](https://www.markdownguide.org/)
 * and users should be aware that HTML embedding is not permitted due to the risk of cross-site
 * attacks and other embedding challenges.
 */
public class DiscussionCreateResponseDto
{
    private @NotNull String discussionCommentId;

    /**
     * The unique identifier of the discussion comment created.
     *
     * @return The field discussionCommentId
     */
    public @NotNull String getDiscussionCommentId() { return this.discussionCommentId; }
    /**
     * The unique identifier of the discussion comment created.
     *
     * @param value The new value for discussionCommentId
     */
    public void setDiscussionCommentId(@NotNull String value) { this.discussionCommentId = value; }
};
