
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Integrations API is intended for use by ProjectManager and its business
 * development partners.  Please contact ProjectManager's sales team to request use of this API.
 */
public class NewIntegrationInstanceDto
{
    private @NotNull String id;

    /**
     * The unique identifier of the newly created IntegrationInstance.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of the newly created IntegrationInstance.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
