
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
 * Task Metadata DTO
 */
public class TaskMetadataUpdateDto
{
    private @NotNull Object data;

    /**
     * Customer or system metadata
     *
     * @return The field data
     */
    public @NotNull Object getData() { return this.data; }
    /**
     * Customer or system metadata
     *
     * @param value The new value for data
     */
    public void setData(@NotNull Object value) { this.data = value; }
};
