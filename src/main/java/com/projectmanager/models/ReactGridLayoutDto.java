
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A setting for react grid layout sizes
 */
public class ReactGridLayoutDto
{
    private @Nullable ReactGridLayoutItemDto[] lg;
    private @Nullable ReactGridLayoutItemDto[] md;
    private @Nullable ReactGridLayoutItemDto[] sm;
    private @Nullable ReactGridLayoutItemDto[] xs;
    private @Nullable ReactGridLayoutItemDto[] xxs;

    /**
     * Used for large screen size (1200)
     *
     * @return The field lg
     */
    public @Nullable ReactGridLayoutItemDto[] getLg() { return this.lg; }
    /**
     * Used for large screen size (1200)
     *
     * @param value The new value for lg
     */
    public void setLg(@Nullable ReactGridLayoutItemDto[] value) { this.lg = value; }
    /**
     * Used for medium screen size (996)
     *
     * @return The field md
     */
    public @Nullable ReactGridLayoutItemDto[] getMd() { return this.md; }
    /**
     * Used for medium screen size (996)
     *
     * @param value The new value for md
     */
    public void setMd(@Nullable ReactGridLayoutItemDto[] value) { this.md = value; }
    /**
     * Used for small screen size (768)
     *
     * @return The field sm
     */
    public @Nullable ReactGridLayoutItemDto[] getSm() { return this.sm; }
    /**
     * Used for small screen size (768)
     *
     * @param value The new value for sm
     */
    public void setSm(@Nullable ReactGridLayoutItemDto[] value) { this.sm = value; }
    /**
     * Used for extra small screen size (480)
     *
     * @return The field xs
     */
    public @Nullable ReactGridLayoutItemDto[] getXs() { return this.xs; }
    /**
     * Used for extra small screen size (480)
     *
     * @param value The new value for xs
     */
    public void setXs(@Nullable ReactGridLayoutItemDto[] value) { this.xs = value; }
    /**
     * Used for super small screen size (0)
     *
     * @return The field xxs
     */
    public @Nullable ReactGridLayoutItemDto[] getXxs() { return this.xxs; }
    /**
     * Used for super small screen size (0)
     *
     * @param value The new value for xxs
     */
    public void setXxs(@Nullable ReactGridLayoutItemDto[] value) { this.xxs = value; }
};
