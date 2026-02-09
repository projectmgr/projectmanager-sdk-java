
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
public class HourlyRateUpdateDto
{
    private @NotNull Boolean isActive;

    /**
     * Update the status of the rate from Active to InActive.
     *
     * An InActive rate will still be used in calculating the cost of a project
     * but will not be displayed in the ui.
     *
     * @return The field isActive
     */
    public @NotNull Boolean getIsActive() { return this.isActive; }
    /**
     * Update the status of the rate from Active to InActive.
     *
     * An InActive rate will still be used in calculating the cost of a project
     * but will not be displayed in the ui.
     *
     * @param value The new value for isActive
     */
    public void setIsActive(@NotNull Boolean value) { this.isActive = value; }
};
