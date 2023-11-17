
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

public class IEdmSchemaElement
{
    private @NotNull String schemaElementKind;
    private @Nullable String namespace;
    private @Nullable String name;

    /**
     *
     * @return The field schemaElementKind
     */
    public @NotNull String getSchemaElementKind() { return this.schemaElementKind; }
    /**
     *
     * @param value The new value for schemaElementKind
     */
    public void setSchemaElementKind(@NotNull String value) { this.schemaElementKind = value; }
    /**
     *
     * @return The field namespace
     */
    public @Nullable String getNamespace() { return this.namespace; }
    /**
     *
     * @param value The new value for namespace
     */
    public void setNamespace(@Nullable String value) { this.namespace = value; }
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
