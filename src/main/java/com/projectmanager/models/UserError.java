
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

public class UserError
{
    private @Nullable String email;
    private @Nullable String reason;
    private @NotNull String statusCode;

    /**
     *
     * @return The field email
     */
    public @Nullable String getEmail() { return this.email; }
    /**
     *
     * @param value The new value for email
     */
    public void setEmail(@Nullable String value) { this.email = value; }
    /**
     *
     * @return The field reason
     */
    public @Nullable String getReason() { return this.reason; }
    /**
     *
     * @param value The new value for reason
     */
    public void setReason(@Nullable String value) { this.reason = value; }
    /**
     *
     * @return The field statusCode
     */
    public @NotNull String getStatusCode() { return this.statusCode; }
    /**
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@NotNull String value) { this.statusCode = value; }
};
