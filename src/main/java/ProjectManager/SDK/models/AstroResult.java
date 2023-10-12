
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
 * An API result that contains different values depending on whether the API call succeeded or failed.
 * Use the `Success` value to determine if the API call succeeded.  If the API call failed, you can
 * examine the `Error` value to determine what went wrong.
 */
public class AstroResult
{
    private @Nullable AstroError error;
    private @NotNull Boolean success;
    private @NotNull Boolean hasError;
    private @NotNull HttpStatusCode statusCode;

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
    public @NotNull HttpStatusCode getStatusCode() { return this.statusCode; }
    /**
     * The HTTP code of the response.
     *
     * @param value The new value for statusCode
     */
    public void setStatusCode(@NotNull HttpStatusCode value) { this.statusCode = value; }
};
