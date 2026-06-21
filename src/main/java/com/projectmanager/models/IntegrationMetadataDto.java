
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
 * A key-value pair of metadata stored against an Integration.
 * Values are stored as comma-separated strings to support multiple values (e.g. a list of IDs,
 * names, or reference values).
 */
public class IntegrationMetadataDto
{
    private @NotNull String key;
    private @NotNull String value;

    /**
     * The metadata key (e.g. "ProjectStatus").
     *
     * @return The field key
     */
    public @NotNull String getKey() { return this.key; }
    /**
     * The metadata key (e.g. "ProjectStatus").
     *
     * @param value The new value for key
     */
    public void setKey(@NotNull String value) { this.key = value; }
    /**
     * The metadata value, stored as a comma-separated string to support multiple values.
     *
     * @return The field value
     */
    public @NotNull String getValue() { return this.value; }
    /**
     * The metadata value, stored as a comma-separated string to support multiple values.
     *
     * @param value The new value for value
     */
    public void setValue(@NotNull String value) { this.value = value; }
};
