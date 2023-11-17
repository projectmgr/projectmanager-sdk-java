
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

public class IEdmEntityContainerElement
{
    private @NotNull String containerElementKind;
    private @Nullable IEdmEntityContainer container;
    private @Nullable String name;

    /**
     *
     * @return The field containerElementKind
     */
    public @NotNull String getContainerElementKind() { return this.containerElementKind; }
    /**
     *
     * @param value The new value for containerElementKind
     */
    public void setContainerElementKind(@NotNull String value) { this.containerElementKind = value; }
    /**
     *
     * @return The field container
     */
    public @Nullable IEdmEntityContainer getContainer() { return this.container; }
    /**
     *
     * @param value The new value for container
     */
    public void setContainer(@Nullable IEdmEntityContainer value) { this.container = value; }
    /**
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
