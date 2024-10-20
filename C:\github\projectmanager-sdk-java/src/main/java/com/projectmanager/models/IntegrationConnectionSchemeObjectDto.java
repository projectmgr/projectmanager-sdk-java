
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
 * Master Connection Scheme for Providers
 */
public class IntegrationConnectionSchemeObjectDto
{
    private @NotNull String value;
    private @NotNull String type;
    private @NotNull Boolean sendToClient;

    /**
     * The value of the property
     *
     * @return The field value
     */
    public @NotNull String getValue() { return this.value; }
    /**
     * The value of the property
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull String value) { this.value = value; }
    /**
     * The type of the property
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * The type of the property
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * Send to the client true/false
     *
     * @return The field sendToClient
     */
    public @NotNull Boolean getSendToClient() { return this.sendToClient; }
    /**
     * Send to the client true/false
     *
     * @param value The new value for sendToClient
     */
    public void setSendToClient(@NotNull Boolean value) { this.sendToClient = value; }
};
