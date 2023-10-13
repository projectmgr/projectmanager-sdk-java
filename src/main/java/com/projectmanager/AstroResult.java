
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


package com.projectmanager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * An API result that contains different values depending on whether the API call succeeded or failed.
 * Use the `Success` value to determine if the API call succeeded.  If the API call failed, you can
 * examine the `Error` value to determine what went wrong.
 */
public class AstroResult<T>
{
    private @Nullable AstroError error;
    private @NotNull Boolean success;
    private @NotNull Boolean hasError;
    private @NotNull int statusCode;
    private @Nullable T data;

    /**
     * If the API call failed, this will contain information about the error that occurred.
     *
     * @return The field error
     */
    public @Nullable AstroError getError() { return this.error; }
    /**
     * If the API call failed, this will contain information about the error that occurred.
     *
     * @param value The new value for error
     */
    public void setError(@Nullable AstroError value) { this.error = value; }
    /**
     * True if the API call succeeded; false otherwise.
     *
     * @return The field success
     */
    public @NotNull Boolean getSuccess() { return this.success; }
    /**
     * True if the API call succeeded; false otherwise.
     *
     * @param value The new value for success
     */
    public void setSuccess(@NotNull Boolean value) { this.success = value; }
    /**
     * True if the API call failed.
     *
     * @return The field hasError
     */
    public @NotNull Boolean getHasError() { return this.hasError; }
    /**
     * True if the API call failed.
     *
     * @param value The new value for hasError
     */
    public void setHasError(@NotNull Boolean value) { this.hasError = value; }
    /**
     * The HTTP code of the response.
     *
     * @return The field statusCode
     */
    public @NotNull int getStatusCode() { return this.statusCode; }
    /**
     * The HTTP code of the response.
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@NotNull int value) { this.statusCode = value; }
    /**
     * If the API call succeeded, this value contains the response from the server.
     *
     * @return The data returned from the server
     */
    public @Nullable T getData() { return this.data; }
    /**
     * If the API call succeeded, this value contains the response from the server.
     *
     * @param value The data returned from the server
     */
    public void setData(@Nullable T value) { this.data = value; }

    /**
     * Parse response from the server
     */
    public void Parse(String content, int code, long serverDuration, long roundTripTime)
    {
        this.statusCode = code;
        Gson gson = new Gson();
        if (code >= 200 && code < 300) {
            this.success = true;
            this.data = gson.fromJson(content, new TypeToken<T>() {}.getType());
        } else if (code == -1) {
            // special case for exceptions
            this.success = false;
            this.data = null;
            this.error = new AstroError();
            this.error.setMessage(content);
        } else {
            this.success = false;
            this.error = gson.fromJson(content, new TypeToken<AstroError>() {}.getType());
        }
    }
};
