
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
 * Information about a category of Integrations available on the Marketplace.
 */
public class IntegrationCategoryDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @Nullable String shortId;
    private @Nullable String[] integrationShortIds;

    /**
     * The unique identifier of this Integration Category.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this Integration Category.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * A friendly name for this Integration Category.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * A friendly name for this Integration Category.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * A short identifier that uniquely identifies this Integration Category.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * A short identifier that uniquely identifies this Integration Category.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * A list of short identifiers for Integrations available within this Integration Category.
     *
     * @return The field integrationShortIds
     */
    public @Nullable String[] getIntegrationShortIds() { return this.integrationShortIds; }
    /**
     * A list of short identifiers for Integrations available within this Integration Category.
     *
     * @param value The new value for integrationShortIds
     */
    public void setIntegrationShortIds(@Nullable String[] value) { this.integrationShortIds = value; }
};
