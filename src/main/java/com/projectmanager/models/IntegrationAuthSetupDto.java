
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2024 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2024 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Integration Auth Setup for Provider.
 */
public class IntegrationAuthSetupDto
{
    private @Nullable String masterConnection;
    private @Nullable String userConnection;
    private @Nullable Object masterConnectionSchema;

    /**
     * Master Connection for provider
     *
     * @return The field masterConnection
     */
    public @Nullable String getMasterConnection() { return this.masterConnection; }
    /**
     * Master Connection for provider
     *
     * @param value The new value for masterConnection
     */
    public void setMasterConnection(@Nullable String value) { this.masterConnection = value; }
    /**
     * UserConnection for Provider.
     *
     * @return The field userConnection
     */
    public @Nullable String getUserConnection() { return this.userConnection; }
    /**
     * UserConnection for Provider.
     *
     * @param value The new value for userConnection
     */
    public void setUserConnection(@Nullable String value) { this.userConnection = value; }
    /**
     * Master Connection scheme for Provider.
     *
     * @return The field masterConnectionSchema
     */
    public @Nullable Object getMasterConnectionSchema() { return this.masterConnectionSchema; }
    /**
     * Master Connection scheme for Provider.
     *
     * @param value The new value for masterConnectionSchema
     */
    public void setMasterConnectionSchema(@Nullable Object value) { this.masterConnectionSchema = value; }
};
