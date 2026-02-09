
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
import com.projectmanager.models.HourlyRatePeriodDto;
import com.projectmanager.models.HourlyRatePeriodCreateDto;

/**
 * Contains all methods related to HourlyRatePeriod
 */
public class HourlyRatePeriodClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the HourlyRatePeriod API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public HourlyRatePeriodClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Gets a list of all rate periods in a work space
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRatePeriodDto[]> getRatePeriods()
    {
        RestRequest<HourlyRatePeriodDto[]> r = new RestRequest<HourlyRatePeriodDto[]>(this.client, "GET", "/api/data/hourly-rate-periods");
        return r.Call(new TypeToken<AstroResult<HourlyRatePeriodDto[]>>() {}.getType());
    }

    /**
     * Creates a rate period
     *
     * @param body The rate period start date.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRatePeriodDto> createRatePeriod(@NotNull HourlyRatePeriodCreateDto body)
    {
        RestRequest<HourlyRatePeriodDto> r = new RestRequest<HourlyRatePeriodDto>(this.client, "POST", "/api/data/hourly-rate-periods");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HourlyRatePeriodDto>>() {}.getType());
    }
}
