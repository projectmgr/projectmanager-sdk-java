
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

public class ProjectVersionChangeDataDto
{
    private @Nullable String type;
    private @Nullable String method;
    private @Nullable String property;
    private @Nullable String value;

    /**
     *
     * @return The field type
     */
    public @Nullable String getType() { return this.type; }
    /**
     *
     * @param value The new value for type
     */
    public void setType(@Nullable String value) { this.type = value; }
    /**
     *
     * @return The field method
     */
    public @Nullable String getMethod() { return this.method; }
    /**
     *
     * @param value The new value for method
     */
    public void setMethod(@Nullable String value) { this.method = value; }
    /**
     *
     * @return The field property
     */
    public @Nullable String getProperty() { return this.property; }
    /**
     *
     * @param value The new value for property
     */
    public void setProperty(@Nullable String value) { this.property = value; }
    /**
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
};
