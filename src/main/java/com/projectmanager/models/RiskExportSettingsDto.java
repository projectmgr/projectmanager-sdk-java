
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
 * Export Settings for Risk Export
 */
public class RiskExportSettingsDto
{
    private @Nullable String name;
    private @Nullable String format;
    private @NotNull String[] columns;
    private @Nullable String orderBy;
    private @Nullable String orderDirection;

    /**
     * the name used by the export
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * the name used by the export
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * Format to export to, currently csv and excel are supported
     *
     *  Valid options are:
     *  * csv
     *  * excel
     *
     * @return The field format
     */
    public @Nullable String getFormat() { return this.format; }
    /**
     * Format to export to, currently csv and excel are supported
     *
     *  Valid options are:
     *  * csv
     *  * excel
     *
     * @param value The new value for format
     */
    public void setFormat(@Nullable String value) { this.format = value; }
    /**
     * The list of column names to export
     *
     * @return The field columns
     */
    public @NotNull String[] getColumns() { return this.columns; }
    /**
     * The list of column names to export
     *
     * @param value The new value for columns
     */
    public void setColumns(@NotNull String[] value) { this.columns = value; }
    /**
     * Which column should be used to order the data
     *
     *  Valid options are:
     *  * name
     *  * createDate
     *  * assignees
     *  * dueDate
     *  * impact
     *  * level
     *  * likelihood
     *  * openClosed
     *  * priority
     *  * response
     *  * tags
     *  * description
     *  * resolution
     *
     * @return The field orderBy
     */
    public @Nullable String getOrderBy() { return this.orderBy; }
    /**
     * Which column should be used to order the data
     *
     *  Valid options are:
     *  * name
     *  * createDate
     *  * assignees
     *  * dueDate
     *  * impact
     *  * level
     *  * likelihood
     *  * openClosed
     *  * priority
     *  * response
     *  * tags
     *  * description
     *  * resolution
     *
     * @param value The new value for orderBy
     */
    public void setOrderBy(@Nullable String value) { this.orderBy = value; }
    /**
     * Specifies the direction of the order. Valid values are "asc" and "desc"
     *
     *  Valid options are:
     *  * asc
     *  * desc
     *
     * @return The field orderDirection
     */
    public @Nullable String getOrderDirection() { return this.orderDirection; }
    /**
     * Specifies the direction of the order. Valid values are "asc" and "desc"
     *
     *  Valid options are:
     *  * asc
     *  * desc
     *
     * @param value The new value for orderDirection
     */
    public void setOrderDirection(@Nullable String value) { this.orderDirection = value; }
};
