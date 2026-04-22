
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
import com.projectmanager.models.BusinessRolesListDto;
import com.projectmanager.models.RoleDto;
import com.projectmanager.models.RoleCreateDto;

import com.projectmanager.models.RoleUpdateChangeItemDto;

/**
 * Contains all methods related to Security
 */
public class SecurityClient
{
    private ProjectManagerClient client;

    /**
     * Constructor for the Security API collection
     *
     * @param client A {@link com.projectmanager.ProjectManagerClient} platform client
     */
    public SecurityClient(@NotNull ProjectManagerClient client) {
        super();
        this.client = client;
    }

    /**
     * Returns every business role in the current workspace, including built-in and custom roles.
     *
     * Each role includes a permissions object with entitlement and grant state for the account security matrix.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<BusinessRolesListDto> listBusinessRoles()
    {
        RestRequest<BusinessRolesListDto> r = new RestRequest<BusinessRolesListDto>(this.client, "GET", "/api/data/security/businessroles");
        return r.Call(new TypeToken<AstroResult<BusinessRolesListDto>>() {}.getType());
    }

    /**
     * Chargebee entitlements are evaluated read-only when saving permission grants; this call does not change subscription state.
     *
     * @param body Role name, optional description, and permission settings for the new role.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RoleDto> createBusinessRole(@NotNull RoleCreateDto body)
    {
        RestRequest<RoleDto> r = new RestRequest<RoleDto>(this.client, "POST", "/api/data/security/businessroles");
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RoleDto>>() {}.getType());
    }

    /**
     * Send property change sets using the same pattern as other workspace batch-update APIs.
     *
     * For permissions, include a permissions property with a partial or full permissions object; omitted keys are merged with the current role.
     * Keys may use the same names as GET `permissions` (e.g. `editUsers`) or RetrieveMe / POST-create style (e.g. `editUser`).
     * The response body matches create when successful.
     *
     * @param roleId Business role identifier.
     * @param body List of property name and value pairs to apply.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<RoleDto> updateBusinessRole(@NotNull String roleId, @NotNull RoleUpdateChangeItemDto[] body)
    {
        RestRequest<RoleDto> r = new RestRequest<RoleDto>(this.client, "PUT", "/api/data/security/businessroles/{roleId}");
        r.AddPath("{roleId}", roleId == null ? "" : roleId.toString());
        if (body != null) { r.AddBody(body); }
        return r.Call(new TypeToken<AstroResult<RoleDto>>() {}.getType());
    }

    /**
     * Built-in roles cannot be deleted. Users assigned to the role may need to be reassigned before the role can be removed.
     *
     * @param roleId Identifier of the custom role to remove.
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> deleteBusinessRole(@NotNull String roleId)
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "DELETE", "/api/data/security/businessroles/{roleId}");
        r.AddPath("{roleId}", roleId == null ? "" : roleId.toString());
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }

    /**
     * Sends another validation email to the authenticated user's workspace email address.
     *
     * @return A {@link com.projectmanager.AstroResult} containing the results
     */
    public @NotNull AstroResult<Object> resendEmailValidation()
    {
        RestRequest<Object> r = new RestRequest<Object>(this.client, "GET", "/api/data/security/email/validation/resend");
        return r.Call(new TypeToken<AstroResult<Object>>() {}.getType());
    }
}
