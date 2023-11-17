
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

public class ODataServiceDocument
{
    private @Nullable ODataTypeAnnotation typeAnnotation;
    private @Nullable ODataEntitySetInfo[] entitySets;
    private @Nullable ODataSingletonInfo[] singletons;
    private @Nullable ODataFunctionImportInfo[] functionImports;

    /**
     *
     * @return The field typeAnnotation
     */
    public @Nullable ODataTypeAnnotation getTypeAnnotation() { return this.typeAnnotation; }
    /**
     *
     * @param value The new value for typeAnnotation
     */
    public void setTypeAnnotation(@Nullable ODataTypeAnnotation value) { this.typeAnnotation = value; }
    /**
     *
     * @return The field entitySets
     */
    public @Nullable ODataEntitySetInfo[] getEntitySets() { return this.entitySets; }
    /**
     *
     * @param value The new value for entitySets
     */
    public void setEntitySets(@Nullable ODataEntitySetInfo[] value) { this.entitySets = value; }
    /**
     *
     * @return The field singletons
     */
    public @Nullable ODataSingletonInfo[] getSingletons() { return this.singletons; }
    /**
     *
     * @param value The new value for singletons
     */
    public void setSingletons(@Nullable ODataSingletonInfo[] value) { this.singletons = value; }
    /**
     *
     * @return The field functionImports
     */
    public @Nullable ODataFunctionImportInfo[] getFunctionImports() { return this.functionImports; }
    /**
     *
     * @param value The new value for functionImports
     */
    public void setFunctionImports(@Nullable ODataFunctionImportInfo[] value) { this.functionImports = value; }
};
