
/**
 * ProjectManager API for Java
 *
 * (c) 2023-2023 ProjectManager.com, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     ProjectManager.com <support@projectmanager.com>
 * @copyright  2023-2023 ProjectManager.com, Inc.
 * @link       https://github.com/projectmgr/projectmanager-sdk-java
 */


package com.projectmanager.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IEdmTypeReference
{
    private @NotNull Boolean isNullable;
    private @Nullable IEdmType definition;

    /**
     *
     * @return The field isNullable
     */
    public @NotNull Boolean getIsNullable() { return this.isNullable; }
    /**
     *
     * @param value The new value for isNullable
     */
    public void setIsNullable(@NotNull Boolean value) { this.isNullable = value; }
    /**
     *
     * @return The field definition
     */
    public @Nullable IEdmType getDefinition() { return this.definition; }
    /**
     *
     * @param value The new value for definition
     */
    public void setDefinition(@Nullable IEdmType value) { this.definition = value; }
};
