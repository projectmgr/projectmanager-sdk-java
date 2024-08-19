
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

/**
 * Risk Progress Filter Settings
 */
public class RiskExportProgressFilterDto
{
    private @Nullable Boolean isOpen;
    private @Nullable Boolean isClosed;

    /**
     * Include risks that are open
     *
     * @return The field isOpen
     */
    public @Nullable Boolean getIsOpen() { return this.isOpen; }
    /**
     * Include risks that are open
     *
     * @param value The new value for isOpen
     */
    public void setIsOpen(@Nullable Boolean value) { this.isOpen = value; }
    /**
     * Include risks that are closed
     *
     * @return The field isClosed
     */
    public @Nullable Boolean getIsClosed() { return this.isClosed; }
    /**
     * Include risks that are closed
     *
     * @param value The new value for isClosed
     */
    public void setIsClosed(@Nullable Boolean value) { this.isClosed = value; }
};
