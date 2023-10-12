
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


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Tasks can have discussions attached to them.  These discussions can include text with simple
 * formatting.  Discussion comments are formatted using [Markdown](https://www.markdownguide.org/)
 * and users should be aware that HTML embedding is not permitted due to the risk of cross-site
 * attacks and other embedding challenges.
 */
public class DiscussionCreateDto
{
    private @Nullable String text;

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
};
