
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
 * A ProjectVersionChangeData is information about a change made to a Project that took
 * it from one Version to another.  The information in this object can help track the
 * details of changes made by the user.
 */
public class ProjectVersionChangeDataDto
{
    private @NotNull String type;
    private @NotNull String method;
    private @Nullable String property;
    private @Nullable String value;
    private @Nullable Integer restoreVersion;

    /**
     * The type of change made
     *
     * @return The field type
     */
    public @NotNull String getType() { return this.type; }
    /**
     * The type of change made
     *
     * @param value The new value for type
     */
    public void setType(@NotNull String value) { this.type = value; }
    /**
     * The method used to make the change
     *
     * @return The field method
     */
    public @NotNull String getMethod() { return this.method; }
    /**
     * The method used to make the change
     *
     * @param value The new value for method
     */
    public void setMethod(@NotNull String value) { this.method = value; }
    /**
     * The property that was changed, if any
     *
     * @return The field property
     */
    public @Nullable String getProperty() { return this.property; }
    /**
     * The property that was changed, if any
     *
     * @param value The new value for property
     */
    public void setProperty(@Nullable String value) { this.property = value; }
    /**
     * The new value of the property, or null if the property was cleared
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The new value of the property, or null if the property was cleared
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
    /**
     * The prior version number to restore to
     *
     * @return The field restoreVersion
     */
    public @Nullable Integer getRestoreVersion() { return this.restoreVersion; }
    /**
     * The prior version number to restore to
     *
     * @param value The new value for restoreVersion
     */
    public void setRestoreVersion(@Nullable Integer value) { this.restoreVersion = value; }
};
