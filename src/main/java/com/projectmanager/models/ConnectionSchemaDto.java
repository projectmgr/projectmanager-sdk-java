
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
 * This class contains the URL or AuthScheme to use to authenticate with the Integration Provider.
 */
public class ConnectionSchemaDto
{
    private @NotNull Boolean connected;
    private @Nullable String url;
    private @Nullable Object authScheme;

    /**
     * Whether or not the Integration Provider is connected.
     *
     * @return The field connected
     */
    public @NotNull Boolean getConnected() { return this.connected; }
    /**
     * Whether or not the Integration Provider is connected.
     *
     * @param value The new value for connected
     */
    public void setConnected(@NotNull Boolean value) { this.connected = value; }
    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @return The field url
     */
    public @Nullable String getUrl() { return this.url; }
    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @param value The new value for url
     */
    public void setUrl(@Nullable String value) { this.url = value; }
    /**
     * This class contains the AuthScheme to use to authenticate with the Integration Provider.
     *
     * @return The field authScheme
     */
    public @Nullable Object getAuthScheme() { return this.authScheme; }
    /**
     * This class contains the AuthScheme to use to authenticate with the Integration Provider.
     *
     * @param value The new value for authScheme
     */
    public void setAuthScheme(@Nullable Object value) { this.authScheme = value; }
};
