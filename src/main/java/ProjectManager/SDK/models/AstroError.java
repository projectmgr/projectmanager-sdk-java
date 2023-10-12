
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
 * Information about an error that occurred within the ProjectManager API.
 */
public class AstroError
{
    private @Nullable String technicalError;
    private @Nullable String[] additionalErrors;
    private @Nullable String message;

    /**
     * A technical description of the error that occurred.  Not suitable for
     * display to end users.
     *
     * @return The field technicalError
     */
    public @Nullable String getTechnicalError() { return this.technicalError; }
    /**
     * A technical description of the error that occurred.  Not suitable for
     * display to end users.
     *
     * @param value The new value for technicalError
     */
    public void setTechnicalError(@Nullable String value) { this.technicalError = value; }
    /**
     * If additional errors beyond the main error in `Message` occurred, they will be
     * listed here as individual messages.
     *
     * @return The field additionalErrors
     */
    public @Nullable String[] getAdditionalErrors() { return this.additionalErrors; }
    /**
     * If additional errors beyond the main error in `Message` occurred, they will be
     * listed here as individual messages.
     *
     * @param value The new value for additionalErrors
     */
    public void setAdditionalErrors(@Nullable String[] value) { this.additionalErrors = value; }
    /**
     * A description of the error that occurred.  If your application has a user
     * interface, show this message to explain what went wrong.
     *
     * @return The field message
     */
    public @Nullable String getMessage() { return this.message; }
    /**
     * A description of the error that occurred.  If your application has a user
     * interface, show this message to explain what went wrong.
     *
     * @param value The new value for message
     */
    public void setMessage(@Nullable String value) { this.message = value; }
};
