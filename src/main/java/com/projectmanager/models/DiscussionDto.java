
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
public class DiscussionDto
{
    private @Nullable String text;
    private @NotNull String discussionCommentId;
    private @NotNull String authorId;
    private @Nullable String authorName;
    private @NotNull String createDate;
    private @Nullable String modifyDate;
    private @Nullable DiscussionEmoji[] emoji;

    /**
     * The text of the comment to add to the discussion, in Markdown format.
     *
     * Discussion comments are formatted using [Markdown](https://www.markdownguide.org/)
     * and users should be aware that HTML embedding is not permitted due to the risk of cross-site
     * attacks and other embedding challenges.
     *
     * @return The field text
     */
    public @Nullable String getText() { return this.text; }
    /**
     * The text of the comment to add to the discussion, in Markdown format.
     *
     * Discussion comments are formatted using [Markdown](https://www.markdownguide.org/)
     * and users should be aware that HTML embedding is not permitted due to the risk of cross-site
     * attacks and other embedding challenges.
     *
     * @param value The new value for text
     */
    public void setText(@Nullable String value) { this.text = value; }
    /**
     * The unique ID of the discussion comment.
     *
     * @return The field discussionCommentId
     */
    public @NotNull String getDiscussionCommentId() { return this.discussionCommentId; }
    /**
     * The unique ID of the discussion comment.
     *
     * @param value The new value for discussionCommentId
     */
    public void setDiscussionCommentId(@NotNull String value) { this.discussionCommentId = value; }
    /**
     * The unique ID of the resource that wrote this comment.
     *
     * @return The field authorId
     */
    public @NotNull String getAuthorId() { return this.authorId; }
    /**
     * The unique ID of the resource that wrote this comment.
     *
     * @param value The new value for authorId
     */
    public void setAuthorId(@NotNull String value) { this.authorId = value; }
    /**
     * The unique ID of the resource that wrote this comment.
     *
     * @return The field authorName
     */
    public @Nullable String getAuthorName() { return this.authorName; }
    /**
     * The unique ID of the resource that wrote this comment.
     *
     * @param value The new value for authorName
     */
    public void setAuthorName(@Nullable String value) { this.authorName = value; }
    /**
     * The timestamp when the comment was created.
     *
     * @return The field createDate
     */
    public @NotNull String getCreateDate() { return this.createDate; }
    /**
     * The timestamp when the comment was created.
     *
     * @param value The new value for createDate
     */
    public void setCreateDate(@NotNull String value) { this.createDate = value; }
    /**
     * The timestamp when the comment was modified, if it is different from the create date.
     *
     * @return The field modifyDate
     */
    public @Nullable String getModifyDate() { return this.modifyDate; }
    /**
     * The timestamp when the comment was modified, if it is different from the create date.
     *
     * @param value The new value for modifyDate
     */
    public void setModifyDate(@Nullable String value) { this.modifyDate = value; }
    /**
     * The list of emoji reactions to this discussion comment, if any.  This object will
     * be null if no emoji reactions have been recorded on this discussion comment.
     *
     * @return The field emoji
     */
    public @Nullable DiscussionEmoji[] getEmoji() { return this.emoji; }
    /**
     * The list of emoji reactions to this discussion comment, if any.  This object will
     * be null if no emoji reactions have been recorded on this discussion comment.
     *
     * @param value The new value for emoji
     */
    public void setEmoji(@Nullable DiscussionEmoji[] value) { this.emoji = value; }
};
