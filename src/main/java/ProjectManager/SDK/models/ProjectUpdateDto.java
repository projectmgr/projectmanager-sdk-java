
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


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Project is a collection of Tasks that contributes towards a goal.  Within a Project, Tasks
 * represent individual items of work that team members must complete.  The sum total of Tasks
 * within a Project represents the work to be completed for that Project.
 */
public class ProjectUpdateDto
{
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable String targetDate;
    private @Nullable String folderId;
    private @Nullable String customerId;
    private @Nullable String managerId;
    private @Nullable String chargeCodeId;
    private @Nullable String statusId;
    private @Nullable String priorityId;
    private @Nullable Double hourlyRate;
    private @Nullable Double budget;
    private @Nullable String statusUpdate;
    private @Nullable Boolean favorite;

    /**
     * The name of the Project.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of the Project.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * An optional description of the Project
     *
     * @return The field description
     */
    public @Nullable String getDescription() { return this.description; }
    /**
     * An optional description of the Project
     *
     * @param value The new value for description
     */
    public void setDescription(@Nullable String value) { this.description = value; }
    /**
     * The target planned completion date for this Project, or null if one has
     * not been selected.  This value can be updated in the Project Settings
     * page or the Portfolio Project page within the application.
     *
     * @return The field targetDate
     */
    public @Nullable String getTargetDate() { return this.targetDate; }
    /**
     * The target planned completion date for this Project, or null if one has
     * not been selected.  This value can be updated in the Project Settings
     * page or the Portfolio Project page within the application.
     *
     * @param value The new value for targetDate
     */
    public void setTargetDate(@Nullable String value) { this.targetDate = value; }
    /**
     * To move this Project into a ProjectFolder, set this to the unique identifier of the
     * ProjectFolder.
     *
     * @return The field folderId
     */
    public @Nullable String getFolderId() { return this.folderId; }
    /**
     * To move this Project into a ProjectFolder, set this to the unique identifier of the
     * ProjectFolder.
     *
     * @param value The new value for folderId
     */
    public void setFolderId(@Nullable String value) { this.folderId = value; }
    /**
     * To assign this Project to a ProjectCustomer, set this to the unique identifier of the
     * ProjectCustomer.
     *
     * @return The field customerId
     */
    public @Nullable String getCustomerId() { return this.customerId; }
    /**
     * To assign this Project to a ProjectCustomer, set this to the unique identifier of the
     * ProjectCustomer.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(@Nullable String value) { this.customerId = value; }
    /**
     * To assign this Project to a ProjectManager, set this to the unique identifier of the
     * ProjectManager.
     *
     * @return The field managerId
     */
    public @Nullable String getManagerId() { return this.managerId; }
    /**
     * To assign this Project to a ProjectManager, set this to the unique identifier of the
     * ProjectManager.
     *
     * @param value The new value for managerId
     */
    public void setManagerId(@Nullable String value) { this.managerId = value; }
    /**
     * To set the ChargeCode for this Project, set this to the unique identifier of the
     * ChargeCode to use for this Project.
     *
     * @return The field chargeCodeId
     */
    public @Nullable String getChargeCodeId() { return this.chargeCodeId; }
    /**
     * To set the ChargeCode for this Project, set this to the unique identifier of the
     * ChargeCode to use for this Project.
     *
     * @param value The new value for chargeCodeId
     */
    public void setChargeCodeId(@Nullable String value) { this.chargeCodeId = value; }
    /**
     * To change the ProjectStatus of this Project, set this to the unique identifier of the
     * ProjectStatus.
     *
     * @return The field statusId
     */
    public @Nullable String getStatusId() { return this.statusId; }
    /**
     * To change the ProjectStatus of this Project, set this to the unique identifier of the
     * ProjectStatus.
     *
     * @param value The new value for statusId
     */
    public void setStatusId(@Nullable String value) { this.statusId = value; }
    /**
     * To change the ProjectPriority of this Project, set this to the unique identifier of the
     * ProjectPriority.
     *
     * @return The field priorityId
     */
    public @Nullable String getPriorityId() { return this.priorityId; }
    /**
     * To change the ProjectPriority of this Project, set this to the unique identifier of the
     * ProjectPriority.
     *
     * @param value The new value for priorityId
     */
    public void setPriorityId(@Nullable String value) { this.priorityId = value; }
    /**
     * To change the hourly rate of this Project, set this to the new amount.
     *
     * @return The field hourlyRate
     */
    public @Nullable Double getHourlyRate() { return this.hourlyRate; }
    /**
     * To change the hourly rate of this Project, set this to the new amount.
     *
     * @param value The new value for hourlyRate
     */
    public void setHourlyRate(@Nullable Double value) { this.hourlyRate = value; }
    /**
     * To change the budget of this Project, set this to the new amount.
     *
     * @return The field budget
     */
    public @Nullable Double getBudget() { return this.budget; }
    /**
     * To change the budget of this Project, set this to the new amount.
     *
     * @param value The new value for budget
     */
    public void setBudget(@Nullable Double value) { this.budget = value; }
    /**
     * To update the Project's status text, set this to the new status text.
     *
     * @return The field statusUpdate
     */
    public @Nullable String getStatusUpdate() { return this.statusUpdate; }
    /**
     * To update the Project's status text, set this to the new status text.
     *
     * @param value The new value for statusUpdate
     */
    public void setStatusUpdate(@Nullable String value) { this.statusUpdate = value; }
    /**
     * Mark this project as favorite for the logged in user.
     *
     * @return The field favorite
     */
    public @Nullable Boolean getFavorite() { return this.favorite; }
    /**
     * Mark this project as favorite for the logged in user.
     *
     * @param value The new value for favorite
     */
    public void setFavorite(@Nullable Boolean value) { this.favorite = value; }
};
