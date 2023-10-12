
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
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class CreateIntegrationInstanceDto
{
    private @Nullable Object config;

    /**
     * Extra metadata required by this Integration Instance.
     *
     * @return The field config
     */
    public @Nullable Object getConfig() { return this.config; }
    /**
     * Extra metadata required by this Integration Instance.
     *
     * @param value The new value for config
     */
    public void setConfig(@Nullable Object value) { this.config = value; }
};
