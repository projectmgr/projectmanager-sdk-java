
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
 * Request body for updating a holiday. Only the reason can be changed.
 */
public class HolidayUpdateDto
{
    private @NotNull String reason;

    /**
     * Updated reason or label for the holiday.
     *
     * @return The field reason
     */
    public @NotNull String getReason() { return this.reason; }
    /**
     * Updated reason or label for the holiday.
     *
     * @param value The new value for reason
     */
    public void setReason(@NotNull String value) { this.reason = value; }
};
