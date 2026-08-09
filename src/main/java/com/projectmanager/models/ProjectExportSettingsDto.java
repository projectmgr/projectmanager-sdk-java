
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
 * Export settings for Projects export
 */
public class ProjectExportSettingsDto
{
    private @NotNull String type;
    private @NotNull Boolean includeClosed;
    private @NotNull Object columns;
    private @NotNull ProjectExportFilterDto filters;
    private @NotNull String[] order;

    /**
     * Format to export to, currently csv and excel are supported
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * Format to export to, currently csv and excel are supported
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * Include closed projects to export
     *
     * @return The field includeClosed
     */
    public @NotNull Boolean getIncludeClosed() { return this.includeClosed; }
    /**
     * Include closed projects to export
     *
     * @param value The new value for includeClosed
     */
    public void setIncludeClosed(@NotNull Boolean value) { this.includeClosed = value; }
    /**
     * The list of column names to export
     *
     * @return The field columns
     */
    public @NotNull Object getColumns() { return this.columns; }
    /**
     * The list of column names to export
     *
     * @param value The new value for columns
     */
    public void setColumns(@NotNull Object value) { this.columns = value; }
    /**
     * Export filters
     *
     * @return The field filters
     */
    public @NotNull ProjectExportFilterDto getFilters() { return this.filters; }
    /**
     * Export filters
     *
     * @param value The new value for filters
     */
    public void setFilters(@NotNull ProjectExportFilterDto value) { this.filters = value; }
    /**
     * Order of columns to export
     *
     * @return The field order
     */
    public @NotNull String[] getOrder() { return this.order; }
    /**
     * Order of columns to export
     *
     * @param value The new value for order
     */
    public void setOrder(@NotNull String[] value) { this.order = value; }
};
