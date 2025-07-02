
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
 * Export Settings for Risk Export
 */
public class RiskExportSettingsDto
{
    private @Nullable String name;
    private @NotNull String format;
    private @NotNull String[] columns;
    private @NotNull String orderBy;
    private @NotNull String orderDirection;
    private @NotNull Integer timeZoneOffset;
    private @Nullable ExportDueDateFilterDto dueDateFilter;
    private @Nullable ExportPriorityFilterDto priorityFilter;
    private @Nullable RiskExportProgressFilterDto progressFilter;
    private @Nullable String[] assignees;
    private @Nullable String[] tags;

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
     *  * Csv
     *  * excel
     *
     * @return The field format
     */
    public @NotNull String getFormat() { return this.format; }
    /**
     * Format to export to, currently csv and excel are supported
     *
     *  Valid options are:
     *  * Csv
     *  * excel
     *
     * @param value The new value for format
     */
    public void setFormat(@NotNull String value) { this.format = value; }
    /**
     * The list of column names to export, if blank all columns will be exported
     *
     * @return The field columns
     */
    public @NotNull String[] getColumns() { return this.columns; }
    /**
     * The list of column names to export, if blank all columns will be exported
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
    public @NotNull String getOrderBy() { return this.orderBy; }
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
    public void setOrderBy(@NotNull String value) { this.orderBy = value; }
    /**
     * Specifies the direction of the order. Valid values are "asc" and "desc"
     *
     *  Valid options are:
     *  * asc
     *  * desc
     *
     * @return The field orderDirection
     */
    public @NotNull String getOrderDirection() { return this.orderDirection; }
    /**
     * Specifies the direction of the order. Valid values are "asc" and "desc"
     *
     *  Valid options are:
     *  * asc
     *  * desc
     *
     * @param value The new value for orderDirection
     */
    public void setOrderDirection(@NotNull String value) { this.orderDirection = value; }
    /**
     * Timezone offset in minutes
     *
     * @return The field timeZoneOffset
     */
    public @NotNull Integer getTimeZoneOffset() { return this.timeZoneOffset; }
    /**
     * Timezone offset in minutes
     *
     * @param value The new value for timeZoneOffset
     */
    public void setTimeZoneOffset(@NotNull Integer value) { this.timeZoneOffset = value; }
    /**
     * Specify the due date filter for the export. If left null, no due date filter will be applied
     *
     * @return The field dueDateFilter
     */
    public @Nullable ExportDueDateFilterDto getDueDateFilter() { return this.dueDateFilter; }
    /**
     * Specify the due date filter for the export. If left null, no due date filter will be applied
     *
     * @param value The new value for dueDateFilter
     */
    public void setDueDateFilter(@Nullable ExportDueDateFilterDto value) { this.dueDateFilter = value; }
    /**
     * Specify the priority filter for the export. If left null, no priority filter will be applied
     *
     * @return The field priorityFilter
     */
    public @Nullable ExportPriorityFilterDto getPriorityFilter() { return this.priorityFilter; }
    /**
     * Specify the priority filter for the export. If left null, no priority filter will be applied
     *
     * @param value The new value for priorityFilter
     */
    public void setPriorityFilter(@Nullable ExportPriorityFilterDto value) { this.priorityFilter = value; }
    /**
     * Specify the progress filter for the export. If left null, no progress filter will be applied
     *
     * @return The field progressFilter
     */
    public @Nullable RiskExportProgressFilterDto getProgressFilter() { return this.progressFilter; }
    /**
     * Specify the progress filter for the export. If left null, no progress filter will be applied
     *
     * @param value The new value for progressFilter
     */
    public void setProgressFilter(@Nullable RiskExportProgressFilterDto value) { this.progressFilter = value; }
    /**
     * A list of resourceIds to filter the risks by assignees. If left null or empty this will be ignored
     *
     * @return The field assignees
     */
    public @Nullable String[] getAssignees() { return this.assignees; }
    /**
     * A list of resourceIds to filter the risks by assignees. If left null or empty this will be ignored
     *
     * @param value The new value for assignees
     */
    public void setAssignees(@Nullable String[] value) { this.assignees = value; }
    /**
     * A list of tagIds to filter the risks by tags. If left null or empty this will be ignored
     *
     * @return The field tags
     */
    public @Nullable String[] getTags() { return this.tags; }
    /**
     * A list of tagIds to filter the risks by tags. If left null or empty this will be ignored
     *
     * @param value The new value for tags
     */
    public void setTags(@Nullable String[] value) { this.tags = value; }
};
