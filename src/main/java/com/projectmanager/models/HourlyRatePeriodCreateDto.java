
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
 * The payload to create a hourly rate period
 */
public class HourlyRatePeriodCreateDto
{
    private @NotNull String startDate;

    /**
     * The rate period state date
     *
     * @return The field startDate
     */
    public @NotNull String getStartDate() { return this.startDate; }
    /**
     * The rate period state date
     *
     * @param value The new value for startDate
     */
    public void setStartDate(@NotNull String value) { this.startDate = value; }
};
