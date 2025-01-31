
/**
 * ProjectManager API for Java
 *
 * (c) ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a new api access key entity
 */
public class ApiKeyCreateDto
{
    private @NotNull String tokenName;

    /**
     * Name of token
     *
     * @return The field tokenName
     */
    public @NotNull String getTokenName() { return this.tokenName; }
    /**
     * Name of token
     *
     * @param value The new value for tokenName
     */
    public void setTokenName(@NotNull String value) { this.tokenName = value; }
};
