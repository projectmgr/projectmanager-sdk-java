
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
 * User dashboard create or update dto
 */
public class DashboardSettingCreateDto
{
    private @Nullable String id;
    private @Nullable String userId;
    private @NotNull String type;
    private @Nullable ReactGridLayoutDto reactGridLayout;

    /**
     * Unique ID
     *
     * @return The field id
     */
    public @Nullable String getId() { return this.id; }
    /**
     * Unique ID
     *
     * @param value The new value for id
     */
    public void setId(@Nullable String value) { this.id = value; }
    /**
     * User ID
     *
     * @return The field userId
     */
    public @Nullable String getUserId() { return this.userId; }
    /**
     * User ID
     *
     * @param value The new value for userId
     */
    public void setUserId(@Nullable String value) { this.userId = value; }
    /**
     * Either custom or one of DashboardType enum
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * Either custom or one of DashboardType enum
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * React grid layout configuration
     *
     * @return The field reactGridLayout
     */
    public @Nullable ReactGridLayoutDto getReactGridLayout() { return this.reactGridLayout; }
    /**
     * React grid layout configuration
     *
     * @param value The new value for reactGridLayout
     */
    public void setReactGridLayout(@Nullable ReactGridLayoutDto value) { this.reactGridLayout = value; }
};
