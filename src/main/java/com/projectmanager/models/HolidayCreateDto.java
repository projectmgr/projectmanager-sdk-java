
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
 * Request body for creating a holiday. One occurrence per calendar day from DateFrom through DateTo (inclusive).
 * Omit both lists for a global holiday; set ResourceIds for people scope; set CountryId for country scope (ISO 3166-1 alpha-2).
 */
public class HolidayCreateDto
{
    private @NotNull String reason;
    private @NotNull String dateFrom;
    private @NotNull String dateTo;
    private @Nullable String[] resourceIds;
    private @Nullable String[] countryId;

    /**
     * Reason or label for the holiday (for example, public holiday name or company shutdown).
     *
     * @return The field reason
     */
    public @NotNull String getReason() { return this.reason; }
    /**
     * Reason or label for the holiday (for example, public holiday name or company shutdown).
     *
     * @param value The new value for reason
     */
    public void setReason(@NotNull String value) { this.reason = value; }
    /**
     * First calendar day of the holiday (inclusive).
     *
     * @return The field dateFrom
     */
    public @NotNull String getDateFrom() { return this.dateFrom; }
    /**
     * First calendar day of the holiday (inclusive).
     *
     * @param value The new value for dateFrom
     */
    public void setDateFrom(@NotNull String value) { this.dateFrom = value; }
    /**
     * Last calendar day of the holiday (inclusive). Must be on or after DateFrom.
     *
     * @return The field dateTo
     */
    public @NotNull String getDateTo() { return this.dateTo; }
    /**
     * Last calendar day of the holiday (inclusive). Must be on or after DateFrom.
     *
     * @param value The new value for dateTo
     */
    public void setDateTo(@NotNull String value) { this.dateTo = value; }
    /**
     * Resources this holiday applies to (people scope). Mutually exclusive with CountryId.
     *
     * @return The field resourceIds
     */
    public @Nullable String[] getResourceIds() { return this.resourceIds; }
    /**
     * Resources this holiday applies to (people scope). Mutually exclusive with CountryId.
     *
     * @param value The new value for resourceIds
     */
    public void setResourceIds(@Nullable String[] value) { this.resourceIds = value; }
    /**
     * ISO 3166-1 alpha-2 country identifiers this holiday applies to (country scope). Mutually exclusive with ResourceIds.
     *
     * @return The field countryId
     */
    public @Nullable String[] getCountryId() { return this.countryId; }
    /**
     * ISO 3166-1 alpha-2 country identifiers this holiday applies to (country scope). Mutually exclusive with ResourceIds.
     *
     * @param value The new value for countryId
     */
    public void setCountryId(@Nullable String[] value) { this.countryId = value; }
};
