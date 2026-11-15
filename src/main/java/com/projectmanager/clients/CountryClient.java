
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
import com.projectmanager.models.CountryDto;
import com.projectmanager.models.StateDto;


/**
 * Contains all methods related to Country
 */
public class CountryClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Country API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public CountryClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * This method returns a list of all countries defined by [ISO3166](https://www.iso.org/iso-3166-country-codes.html).
     *
     * Each country includes its unique identifier (ISO3166-2 code) and name.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<CountryDto[]> listCountries()
    {
        RestRequest<CountryDto[]> r = new RestRequest<CountryDto[]>(this.client, "GET", "/api/data/countries");
        return r.Call(new TypeToken<AstroResult<CountryDto[]>>() {}.getType());
    }

    /**
     * This method returns a list of all states for the specified country as defined by [ISO3166](https://www.iso.org/iso-3166-country-codes.html).
     * Note that many countries may have administrative regions although not all countries require administrative
     * regions to be used when specifying an address.
     *
     * Each state includes its unique identifier, state code, and name.
     *
     * @param isoCode The ISO-3166-2 code of the country
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<StateDto[]> getStates(@NotNull String isoCode)
    {
        RestRequest<StateDto[]> r = new RestRequest<StateDto[]>(this.client, "GET", "/api/data/countries/{isoCode}/states");
        r.AddPath("{isoCode}", isoCode == null ? "" : isoCode.toString());
        return r.Call(new TypeToken<AstroResult<StateDto[]>>() {}.getType());
    }
}
