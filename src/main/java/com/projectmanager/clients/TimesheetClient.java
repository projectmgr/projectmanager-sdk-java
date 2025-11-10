
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
import com.projectmanager.models.TimesheetResponseDto;
import com.projectmanager.models.TimesheetCreateRequestDto;
import com.projectmanager.models.TimesheetDto;

import com.projectmanager.models.TimesheetUpdateRequestDto;
import com.projectmanager.models.TimesheetAdminTypeDto;
import com.projectmanager.models.TimeSheetApprovalResponseDto;
import com.projectmanager.models.TimeSheetApprovalDto;
import com.projectmanager.models.TimeSheetApprovalRejectDto;

/**
 * Contains all methods related to Timesheet
 */
public class TimesheetClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Timesheet API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public TimesheetClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Creates new time entry for Resource on a given day.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param body The time entry you wish to create
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetResponseDto> createTimeEntry(@NotNull TimesheetCreateRequestDto body)
    {
        RestRequest<TimesheetResponseDto> r = new RestRequest<TimesheetResponseDto>(this.client, "POST", "/api/data/timesheets");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TimesheetResponseDto>>() {}.getType());
    }

    /**
     * Retrieve a list of time entries that match an [OData formatted query](https://www.odata.org/).
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param top The number of records to return
     * @param skip Skips the given number of records and then returns $top records
     * @param filter Filter the expression according to oData queries
     * @param orderby Order collection by this field.
     * @param expand Include related data in the response
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetDto[]> queryTimeEntries(@Nullable Integer top, @Nullable Integer skip, @Nullable String filter, @Nullable String orderby, @Nullable String expand)
    {
        RestRequest<TimesheetDto[]> r = new RestRequest<TimesheetDto[]>(this.client, "GET", "/api/data/timesheets");
        if (top != null) { r.AddQuery("$top", top.toString()); }
        if (skip != null) { r.AddQuery("$skip", skip.toString()); }
        if (filter != null) { r.AddQuery("$filter", filter.toString()); }
        if (orderby != null) { r.AddQuery("$orderby", orderby.toString()); }
        if (expand != null) { r.AddQuery("$expand", expand.toString()); }
        return r.Call(new TypeToken<AstroResult<TimesheetDto[]>>() {}.getType());
    }

    /**
     * Delete time entry by its unique identifier.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param timesheetId The unique identifier of the time entry to delete
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteTimeEntry(@NotNull String timesheetId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/timesheets/{timesheetId}");
        r.AddPath("{timesheetId}", timesheetId == null ? "" : timesheetId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Updates a time entry by its unique identifier.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param timesheetId The unique identifier of the time entry to update
     * @param body The new information that should replace the previous time entry
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetResponseDto> updateTimeEntry(@NotNull String timesheetId, @NotNull TimesheetUpdateRequestDto body)
    {
        RestRequest<TimesheetResponseDto> r = new RestRequest<TimesheetResponseDto>(this.client, "PUT", "/api/data/timesheets/{timesheetId}");
        r.AddPath("{timesheetId}", timesheetId == null ? "" : timesheetId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TimesheetResponseDto>>() {}.getType());
    }

    /**
     * Retrieves a list of Administrative Tasks that are defined for use within your Workspace.
     *
     * Administrative tasks are a list of regular, recurring non-Task actions that are typically associated with
     * overhead, such as sick leave, travel, or attending meetings.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimesheetAdminTypeDto[]> retrieveAdministrativeTasks()
    {
        RestRequest<TimesheetAdminTypeDto[]> r = new RestRequest<TimesheetAdminTypeDto[]>(this.client, "GET", "/api/data/timesheets/admin-tasks");
        return r.Call(new TypeToken<AstroResult<TimesheetAdminTypeDto[]>>() {}.getType());
    }

    /**
     * Submit a Timesheet for approval for a specific Resource and week.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param body The Timesheet to be submitted for approval
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimeSheetApprovalResponseDto> submitTimeSheet(@NotNull TimeSheetApprovalDto body)
    {
        RestRequest<TimeSheetApprovalResponseDto> r = new RestRequest<TimeSheetApprovalResponseDto>(this.client, "POST", "/api/data/timesheets/approvals");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TimeSheetApprovalResponseDto>>() {}.getType());
    }

    /**
     * Approve an existing Timesheet approval request.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param body The Timesheet to approve
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimeSheetApprovalResponseDto> approveTimeSheet(@NotNull TimeSheetApprovalDto body)
    {
        RestRequest<TimeSheetApprovalResponseDto> r = new RestRequest<TimeSheetApprovalResponseDto>(this.client, "POST", "/api/data/timesheets/approvals/approve");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TimeSheetApprovalResponseDto>>() {}.getType());
    }

    /**
     * Rejects a specific resource's Timesheet approval request for a specific week.
     *
     * A Timesheet is a collection of time entries for a particular Resource for a specific week.  Each time
     * entry records the number of whole minutes spent by this Resource on an activity. An activity can be a Task
     * in any project that Resource can access, or the activity can be an administrative task such as "Sick
     * Leave" or "Meetings".  When a time entry is linked to a Task, the number of minutes spent on the time entry
     * are recorded as time spent on the Task.  Time entries linked to an administrative tasks are grouped for
     * reporting but are not added to any Task within your Workspace.
     *
     * Time entries are recorded in whole minutes.  If you specify a time entry in fractional hours, either using
     * the API or via the web application, the amount you specify will be converted to minutes and rounded to the
     * nearest neighbor using the rounding algorithm Midpoint-Away-From-Zero.
     *
     * When a Timesheet is submitted for approval or approved, users are no longer permitted to create, update, or
     * delete time entries for that week.  Users with Global Admin level access can override this restriction and
     * continue to make changes to a Timesheet after approval.
     *
     * @param body Information about the Timesheet approval request to be rejected
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<TimeSheetApprovalResponseDto> rejectTimeSheet(@NotNull TimeSheetApprovalRejectDto body)
    {
        RestRequest<TimeSheetApprovalResponseDto> r = new RestRequest<TimeSheetApprovalResponseDto>(this.client, "POST", "/api/data/timesheets/approvals/reject");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<TimeSheetApprovalResponseDto>>() {}.getType());
    }
}
