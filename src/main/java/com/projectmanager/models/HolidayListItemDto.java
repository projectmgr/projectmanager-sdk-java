
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
 * Summary information for a holiday, as returned from the list endpoint.
 */
public class HolidayListItemDto
{
    private @NotNull String id;
    private @NotNull String reason;
    private @NotNull String type;
    private @Nullable String dateFrom;
    private @Nullable String dateTo;
    private @NotNull String[] countryId;
    private @NotNull HolidayResourceDto[] resources;

    /**
     * The public identifier of the holiday.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The public identifier of the holiday.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Reason or label for the holiday.
     *
     * @return The field reason
     */
    public @NotNull String getReason() { return this.reason; }
    /**
     * Reason or label for the holiday.
     *
     * @param value The new value for reason
     */
    public void setReason(@NotNull String value) { this.reason = value; }
    /**
     * Holiday scope: global, people, or country.
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * Holiday scope: global, people, or country.
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * Start of the holiday date span (metadata).
     *
     * @return The field dateFrom
     */
    public @Nullable String getDateFrom() { return this.dateFrom; }
    /**
     * Start of the holiday date span (metadata).
     *
     * @param value The new value for dateFrom
     */
    public void setDateFrom(@Nullable String value) { this.dateFrom = value; }
    /**
     * End of the holiday date span (metadata).
     *
     * @return The field dateTo
     */
    public @Nullable String getDateTo() { return this.dateTo; }
    /**
     * End of the holiday date span (metadata).
     *
     * @param value The new value for dateTo
     */
    public void setDateTo(@Nullable String value) { this.dateTo = value; }
    /**
     * ISO 3166-1 alpha-2 country identifiers when Type is country; otherwise empty.
     *
     * @return The field countryId
     */
    public @NotNull String[] getCountryId() { return this.countryId; }
    /**
     * ISO 3166-1 alpha-2 country identifiers when Type is country; otherwise empty.
     *
     * @param value The new value for countryId
     */
    public void setCountryId(@NotNull String[] value) { this.countryId = value; }
    /**
     * Affected resources. For country and global holidays, all active non-guest resources in scope; for people holidays, the assigned resource(s).
     *
     * @return The field resources
     */
    public @NotNull HolidayResourceDto[] getResources() { return this.resources; }
    /**
     * Affected resources. For country and global holidays, all active non-guest resources in scope; for people holidays, the assigned resource(s).
     *
     * @param value The new value for resources
     */
    public void setResources(@NotNull HolidayResourceDto[] value) { this.resources = value; }
};
