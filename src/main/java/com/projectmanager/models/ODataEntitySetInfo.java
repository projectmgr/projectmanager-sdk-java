
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

public class ODataEntitySetInfo
{
    private @Nullable ODataTypeAnnotation typeAnnotation;
    private @Nullable String url;
    private @Nullable String name;
    private @Nullable String title;

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
     * @return The field url
     */
    public @Nullable String getUrl() { return this.url; }
    /**
     *
     * @param value The new value for url
     */
    public void setUrl(@Nullable String value) { this.url = value; }
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
    /**
     *
     * @return The field title
     */
    public @Nullable String getTitle() { return this.title; }
    /**
     *
     * @param value The new value for title
     */
    public void setTitle(@Nullable String value) { this.title = value; }
};
