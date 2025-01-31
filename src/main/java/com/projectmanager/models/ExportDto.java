
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
 * Represents an export queue object. Use this ID to check the status of the export.
 */
public class ExportDto
{
    private @NotNull String id;

    /**
     * Id of the export
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Id of the export
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
};
