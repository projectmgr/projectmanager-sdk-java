
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
 * Represents a state with its details.
 */
public class StateDto
{
    private @NotNull Integer id;
    private @NotNull String stateCode;
    private @NotNull String name;

    /**
     * Gets or sets the unique identifier for the state.
     *
     * @return The field id
     */
    public @NotNull Integer getId() { return this.id; }
    /**
     * Gets or sets the unique identifier for the state.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull Integer value) { this.id = value; }
    /**
     * Gets or sets the code of the state.
     *
     * @return The field stateCode
     */
    public @NotNull String getStateCode() { return this.stateCode; }
    /**
     * Gets or sets the code of the state.
     *
     * @param value The new value for stateCode
     */
    public void setStateCode(@NotNull String value) { this.stateCode = value; }
    /**
     * Gets or sets the name of the state.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * Gets or sets the name of the state.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
