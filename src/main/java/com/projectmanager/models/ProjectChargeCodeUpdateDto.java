
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


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Charge code is a code used to identify costs within your Projects.  Each
 * Charge code has a name and a unique identifier.  ChargeCodes are defined per
 * Workspace and are shared among Projects.
 */
public class ProjectChargeCodeUpdateDto
{
    private @NotNull String name;

    /**
     * The name of this Project Charge Code
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this Project Charge Code
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
