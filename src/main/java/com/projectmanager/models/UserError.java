
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
 * Represents an individual error for a specific Resource that could not be created in the context
 * of a bulk Resource creation API call.
 */
public class UserError
{
    private @NotNull String email;
    private @NotNull String reason;
    private @NotNull String statusCode;

    /**
     * The email of the Resource that could not be created
     *
     * @return The field email
     */
    public @NotNull String getEmail() { return this.email; }
    /**
     * The email of the Resource that could not be created
     *
     * @param value The new value for email
     */
    public void setEmail(@NotNull String value) { this.email = value; }
    /**
     * A description of the reason this Resource could not be created
     *
     * @return The field reason
     */
    public @NotNull String getReason() { return this.reason; }
    /**
     * A description of the reason this Resource could not be created
     *
     * @param value The new value for reason
     */
    public void setReason(@NotNull String value) { this.reason = value; }
    /**
     * A status code explaining the category of reason this Resource could not be created
     *
     * @return The field statusCode
     */
    public @NotNull String getStatusCode() { return this.statusCode; }
    /**
     * A status code explaining the category of reason this Resource could not be created
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@NotNull String value) { this.statusCode = value; }
};
