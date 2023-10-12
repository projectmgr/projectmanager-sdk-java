
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


package ProjectManager.SDK.clients;

import ProjectManager.SDK.ProjectManagerClient;
import ProjectManager.SDK.RestRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ProjectManager.SDK.AstroResult;
import ProjectManager.SDK.models.TimesheetResponseDto;
import ProjectManager.SDK.models.TimesheetCreateRequestDto;
import ProjectManager.SDK.models.TimesheetDto;

import ProjectManager.SDK.models.TimesheetUpdateRequestDto;
import ProjectManager.SDK.models.TimesheetAdminTypeDto;

/**
 * Contains all methods related to Timesheet
 */
public class TimesheetClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Timesheet API collection
     *
     * @param client A {@link ProjectManager.SDK.ProjectManagerClient} platform client
     */
    public TimesheetClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Creates new time entry for given resource on given day.
     *
     * @param body Payload
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetResponseDto> createtimeentry(@NotNull TimesheetCreateRequestDto body)
    {
        RestRequest<TimesheetResponseDto> r = new RestRequest<TimesheetResponseDto>(this.client, "POST", "/api/data/timesheets");
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Retrieve a list of TimeSheets that match an [OData formatted query](https://www.odata.org/).
     *
     * Time Sheets is a list of times per task
     *
     * @param $top The number of records to return
     * @param $skip Skips the given number of records and then returns $top records
     * @param $filter Filter the expression according to oData queries
     * @param $select Specify which properties should be returned
     * @param $orderby Order collection by this field.
     * @param $expand Include related data in the response
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetDto[]> queryTimeSheets(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String select, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TimesheetDto[]> r = new RestRequest<TimesheetDto[]>(this.client, "GET", "/api/data/timesheets");
        r.AddQuery("$top", top.toString());
        r.AddQuery("$skip", skip.toString());
        r.AddQuery("$filter", filter.toString());
        r.AddQuery("$select", select.toString());
        r.AddQuery("$orderby", orderby.toString());
        r.AddQuery("$expand", expand.toString());
        return r.Call();
    }

    /**
     * Delete time entry by id.
     *
     * @param timesheetId time entry id
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deletetimeentry(@NotNull String timesheetId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/timesheets/{timesheetId}");
        r.AddPath("{timesheetId}", timesheetId.toString());
        return r.Call();
    }

    /**
     * Updates a time entry by its unique identifier.
     *
     * @param timesheetId time entry id
     * @param body payload
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetResponseDto> updatetimeentry(@NotNull String timesheetId, @NotNull TimesheetUpdateRequestDto body)
    {
        RestRequest<TimesheetResponseDto> r = new RestRequest<TimesheetResponseDto>(this.client, "PUT", "/api/data/timesheets/{timesheetId}");
        r.AddPath("{timesheetId}", timesheetId.toString());
        r.AddBody(body);
        return r.Call();
    }

    /**
     * Returns active admin tasks that are used to report time not related to work on projects. I.e. annual/sick leave etc
     *
     * @return A {@link ProjectManager.SDK.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetAdminTypeDto[]> returnsactiveadmintasksthatareusedtoreporttime()
    {
        RestRequest<TimesheetAdminTypeDto[]> r = new RestRequest<TimesheetAdminTypeDto[]>(this.client, "GET", "/api/data/timesheets/admin-tasks");
        return r.Call();
    }
}
