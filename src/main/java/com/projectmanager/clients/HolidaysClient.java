
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


package com.projectmanager.clients;

import com.projectmanager.ProjectManagerClient;
import com.projectmanager.RestRequest;
import com.projectmanager.BlobRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.google.gson.reflect.TypeToken;
import com.projectmanager.AstroResult;
import com.projectmanager.models.HolidayListItemDto;
import com.projectmanager.models.HolidayDetailDto;
import com.projectmanager.models.HolidayCreateDto;

import com.projectmanager.models.HolidayUpdateDto;

/**
 * Contains all methods related to Holidays
 */
public class HolidaysClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Holidays API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public HolidaysClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns all Holidays defined in the current workspace, sorted by name.
     *
     * This "list" API returns basic information about Holidays and may be restricted to partial information. To
     * receive all information about a specific Holiday, use RetrieveHoliday.
     *
     * A Holiday is a defined date when one or more Resources are not available for work.  Holidays may be defined by
     * Workspace, by Country, or by Resource. A Workspace Holiday means that no Resources in the Workspace are working for
     * that date. A Country Holiday means that no Resources in the Workspace located within the country are working for
     * that date.  A Resource Holiday means that the specified Resource is not working on that date.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HolidayListItemDto[]> listHolidays()
    {
        RestRequest<HolidayListItemDto[]> r = new RestRequest<HolidayListItemDto[]>(this.client, "GET", "/api/data/holidays");
        return r.Call(new TypeToken<AstroResult<HolidayListItemDto[]>>() {}.getType());
    }

    /**
     * Creates one or more Holiday for a Resource, a Country, or the entire Workspace.
     *
     * A Holiday can be created based on multiple crtieria, including a date range, a list of Resource identifiers, and
     * a list of countries.  You may use one or more of these criteria when calling CreateHolidays, and the API will
     * expand your criteria into individual Holiday records for each combination of criteria.
     *
     * A Holiday is a defined date when one or more Resources are not available for work.  Holidays may be defined by
     * Workspace, by Country, or by Resource. A Workspace Holiday means that no Resources in the Workspace are working for
     * that date. A Country Holiday means that no Resources in the Workspace located within the country are working for
     * that date.  A Resource Holiday means that the specified Resource is not working on that date.
     *
     * @param body The information about the Holiday to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HolidayDetailDto[]> createHolidays(@NotNull HolidayCreateDto body)
    {
        RestRequest<HolidayDetailDto[]> r = new RestRequest<HolidayDetailDto[]>(this.client, "POST", "/api/data/holidays");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HolidayDetailDto[]>>() {}.getType());
    }

    /**
     * Retrieve all detail about a single Holiday defined by its unique identifier.
     *
     * A Holiday is a defined date when one or more Resources are not available for work.  Holidays may be defined by
     * Workspace, by Country, or by Resource. A Workspace Holiday means that no Resources in the Workspace are working for
     * that date. A Country Holiday means that no Resources in the Workspace located within the country are working for
     * that date.  A Resource Holiday means that the specified Resource is not working on that date.
     *
     * @param id Unique identifier of the holiday
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HolidayDetailDto> retrieveHoliday(@NotNull String id)
    {
        RestRequest<HolidayDetailDto> r = new RestRequest<HolidayDetailDto>(this.client, "GET", "/api/data/holidays/{id}");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<HolidayDetailDto>>() {}.getType());
    }

    /**
     * Update the name of a Holiday based on the information provided.
     *
     * The Holiday record has a "name" or "reason" that can be used to identify the name of the Holiday.  When a
     * Holiday is specific to an individual person, it may have a reason identifying why the resource is taking
     * paid time off.  You can update this name or reason, but you cannot change the other values for a Holiday.  To
     * change a Holiday's date, resource ID, or country, you must delete the Holiday and create a new one.
     *
     * A Holiday is a defined date when one or more Resources are not available for work.  Holidays may be defined by
     * Workspace, by Country, or by Resource. A Workspace Holiday means that no Resources in the Workspace are working for
     * that date. A Country Holiday means that no Resources in the Workspace located within the country are working for
     * that date.  A Resource Holiday means that the specified Resource is not working on that date.
     *
     * @param id Unique identifier of the holiday
     * @param body Information to be updated for the Holiday
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HolidayDetailDto> updateHolidayName(@NotNull String id, @NotNull HolidayUpdateDto body)
    {
        RestRequest<HolidayDetailDto> r = new RestRequest<HolidayDetailDto>(this.client, "PUT", "/api/data/holidays/{id}");
        r.AddPath("{id}", id == null ? "" : id.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HolidayDetailDto>>() {}.getType());
    }

    /**
     * Removes the Holiday identified by its unique identifier.
     *
     * Some information about a Holiday cannot be updated once the Holiday is created.  If you want to change the name
     * or reason for a Holiday, you can use `UpdateHoliday`.  To change other information, you should delete the old
     * Holiday and create a new one with the correct information.
     *
     * A Holiday is a defined date when one or more Resources are not available for work.  Holidays may be defined by
     * Workspace, by Country, or by Resource. A Workspace Holiday means that no Resources in the Workspace are working for
     * that date. A Country Holiday means that no Resources in the Workspace located within the country are working for
     * that date.  A Resource Holiday means that the specified Resource is not working on that date.
     *
     * @param id Unique identifier of the holiday
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteHoliday(@NotNull String id)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/holidays/{id}");
        r.AddPath("{id}", id == null ? "" : id.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
