
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
 * Task Metadata Search DTO
 */
public class TaskMetadataSearchDto
{
    private @NotNull String id;
    private @NotNull String projectId;
    private @NotNull Object metadata;

    /**
     * Task ID
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Task ID
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Project ID
     *
     * @return The field projectId
     */
    public @NotNull String getProjectId() { return this.projectId; }
    /**
     * Project ID
     *
     * @param value The new value for projectId
     */
    public void setProjectId(@NotNull String value) { this.projectId = value; }
    /**
     * Customer or system metadata
     *
     * @return The field metadata
     */
    public @NotNull Object getMetadata() { return this.metadata; }
    /**
     * Customer or system metadata
     *
     * @param value The new value for metadata
     */
    public void setMetadata(@NotNull Object value) { this.metadata = value; }
};
