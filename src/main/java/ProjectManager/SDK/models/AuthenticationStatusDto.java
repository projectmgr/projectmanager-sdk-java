
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
 * Set the connection status of an integration
 */
public class AuthenticationStatusDto
{
    private @NotNull Boolean connected;

    /**
     * Set to true if the connection was successful. False is not supported right now.
     *
     * @return The field connected
     */
    public @NotNull Boolean getConnected() { return this.connected; }
    /**
     * Set to true if the connection was successful. False is not supported right now.
     *
     * @param value The new value for connected
     */
    public void setConnected(@NotNull Boolean value) { this.connected = value; }
};
