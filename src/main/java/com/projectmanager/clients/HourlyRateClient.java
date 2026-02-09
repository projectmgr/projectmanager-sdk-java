
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
import com.projectmanager.models.HourlyRateDto;
import com.projectmanager.models.HourlyRateCreateDto;

import com.projectmanager.models.HourlyRateUpdateDto;
import com.projectmanager.models.HourlyRateDetailsDto;
import com.projectmanager.models.HourlyRateValueDto;
import com.projectmanager.models.HourlyRateValueUpdateDto;

/**
 * Contains all methods related to HourlyRate
 */
public class HourlyRateClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the HourlyRate API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public HourlyRateClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Create a hourly rate
     *
     * @param body The rate data.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRateDto> createHourlyRate(@NotNull HourlyRateCreateDto body)
    {
        RestRequest<HourlyRateDto> r = new RestRequest<HourlyRateDto>(this.client, "POST", "/api/data/hourly-rates");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HourlyRateDto>>() {}.getType());
    }

    /**
     * All hourly rates including Inactive rates
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRateDto[]> getHourlyRates()
    {
        RestRequest<HourlyRateDto[]> r = new RestRequest<HourlyRateDto[]>(this.client, "GET", "/api/data/hourly-rates");
        return r.Call(new TypeToken<AstroResult<HourlyRateDto[]>>() {}.getType());
    }

    /**
     * Update a hourly rate
     *
     * @param rateId the id of the rate
     * @param body the data to update the rate with
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRateDto> updateHourlyRate(@NotNull String rateId, @NotNull HourlyRateUpdateDto body)
    {
        RestRequest<HourlyRateDto> r = new RestRequest<HourlyRateDto>(this.client, "PUT", "/api/data/hourly-rates/{rateId}");
        r.AddPath("{rateId}", rateId == null ? "" : rateId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HourlyRateDto>>() {}.getType());
    }

    /**
     * Get Hourly Rate
     *
     * @param rateId The unique identifier for the rate
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRateDetailsDto> getHourlyRate(@NotNull String rateId)
    {
        RestRequest<HourlyRateDetailsDto> r = new RestRequest<HourlyRateDetailsDto>(this.client, "GET", "/api/data/hourly-rates/{rateId}");
        r.AddPath("{rateId}", rateId == null ? "" : rateId.toString());
        return r.Call(new TypeToken<AstroResult<HourlyRateDetailsDto>>() {}.getType());
    }

    /**
     * Delete a hourly rate
     *
     * @param rateId The rate Id.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteHourlyRate(@NotNull String rateId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/hourly-rates/{rateId}");
        r.AddPath("{rateId}", rateId == null ? "" : rateId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Update Hourly Rate Value
     *
     * @param rateValueId The rate valueId
     * @param body The rate value data
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<HourlyRateValueDto> updateHourlyRateValue(@NotNull String rateValueId, @NotNull HourlyRateValueUpdateDto body)
    {
        RestRequest<HourlyRateValueDto> r = new RestRequest<HourlyRateValueDto>(this.client, "PUT", "/api/data/hourly-rates/values/{rateValueId}");
        r.AddPath("{rateValueId}", rateValueId == null ? "" : rateValueId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<HourlyRateValueDto>>() {}.getType());
    }
}
