
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
 * The payload to update a hourly rate
 */
public class HourlyRateValueUpdateDto
{
    private @NotNull Double value;

    /**
     * The hourly rate value
     *
     * @return The field value
     */
    public @NotNull Double getValue() { return this.value; }
    /**
     * The hourly rate value
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull Double value) { this.value = value; }
};
