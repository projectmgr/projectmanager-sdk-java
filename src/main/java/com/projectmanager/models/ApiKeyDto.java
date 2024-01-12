
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
 * Represents api access key entity
 */
public class ApiKeyDto
{
    private @NotNull String id;
    private @NotNull String createdBy;
    private @NotNull String expires;
    private @Nullable String apiKey;
    private @Nullable String name;

    /**
     * Internal access token id
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Internal access token id
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Created by user id
     *
     * @return The field createdBy
     */
    public @NotNull String getCreatedBy() { return this.createdBy; }
    /**
     * Created by user id
     *
     * @param value The new value for createdBy
     */
    public void setCreatedBy(@NotNull String value) { this.createdBy = value; }
    /**
     * Expires date
     *
     * @return The field expires
     */
    public @NotNull String getExpires() { return this.expires; }
    /**
     * Expires date
     *
     * @param value The new value for expires
     */
    public void setExpires(@NotNull String value) { this.expires = value; }
    /**
     * Bearer Key
     *
     * @return The field apiKey
     */
    public @Nullable String getApiKey() { return this.apiKey; }
    /**
     * Bearer Key
     *
     * @param value The new value for apiKey
     */
    public void setApiKey(@Nullable String value) { this.apiKey = value; }
    /**
     * Name of token
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * Name of token
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
