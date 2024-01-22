
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
 * Task Metadata DTO
 */
public class TaskMetadataUpdateDto
{
    private @Nullable Object data;

    /**
     * Customer or system metadata
     *
     * @return The field data
     */
    public @Nullable Object getData() { return this.data; }
    /**
     * Customer or system metadata
     *
     * @param value The new value for data
     */
    public void setData(@Nullable Object value) { this.data = value; }
};
