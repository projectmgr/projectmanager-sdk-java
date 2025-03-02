
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
 * Represents a country with its details.
 */
public class CountryDto
{
    private @NotNull String id;
    private @NotNull String name;

    /**
     * Gets or sets the unique identifier for the country. This should translate to the ISO2 code
     * for that country.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * Gets or sets the unique identifier for the country. This should translate to the ISO2 code
     * for that country.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * Gets or sets the name of the country.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * Gets or sets the name of the country.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
