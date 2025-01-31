
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
 * Priority filter settings
 */
public class ExportPriorityFilterDto
{
    private @Nullable Boolean isNone;
    private @Nullable Boolean isVeryLow;
    private @Nullable Boolean isLow;
    private @Nullable Boolean isMedium;
    private @Nullable Boolean isHigh;
    private @Nullable Boolean isVeryHigh;
    private @Nullable Boolean isCritical;

    /**
     * Include items with no priority
     *
     * @return The field isNone
     */
    public @Nullable Boolean getIsNone() { return this.isNone; }
    /**
     * Include items with no priority
     *
     * @param value The new value for isNone
     */
    public void setIsNone(@Nullable Boolean value) { this.isNone = value; }
    /**
     * Include items with very low priority
     *
     * @return The field isVeryLow
     */
    public @Nullable Boolean getIsVeryLow() { return this.isVeryLow; }
    /**
     * Include items with very low priority
     *
     * @param value The new value for isVeryLow
     */
    public void setIsVeryLow(@Nullable Boolean value) { this.isVeryLow = value; }
    /**
     * Include items with low priority
     *
     * @return The field isLow
     */
    public @Nullable Boolean getIsLow() { return this.isLow; }
    /**
     * Include items with low priority
     *
     * @param value The new value for isLow
     */
    public void setIsLow(@Nullable Boolean value) { this.isLow = value; }
    /**
     * Include items with medium priority
     *
     * @return The field isMedium
     */
    public @Nullable Boolean getIsMedium() { return this.isMedium; }
    /**
     * Include items with medium priority
     *
     * @param value The new value for isMedium
     */
    public void setIsMedium(@Nullable Boolean value) { this.isMedium = value; }
    /**
     * Include items with high priority
     *
     * @return The field isHigh
     */
    public @Nullable Boolean getIsHigh() { return this.isHigh; }
    /**
     * Include items with high priority
     *
     * @param value The new value for isHigh
     */
    public void setIsHigh(@Nullable Boolean value) { this.isHigh = value; }
    /**
     * Include items with very high priority
     *
     * @return The field isVeryHigh
     */
    public @Nullable Boolean getIsVeryHigh() { return this.isVeryHigh; }
    /**
     * Include items with very high priority
     *
     * @param value The new value for isVeryHigh
     */
    public void setIsVeryHigh(@Nullable Boolean value) { this.isVeryHigh = value; }
    /**
     * Include items with critical priority
     *
     * @return The field isCritical
     */
    public @Nullable Boolean getIsCritical() { return this.isCritical; }
    /**
     * Include items with critical priority
     *
     * @param value The new value for isCritical
     */
    public void setIsCritical(@Nullable Boolean value) { this.isCritical = value; }
};
