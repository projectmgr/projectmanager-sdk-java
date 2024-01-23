
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

/**
 * Information about a Category of ProjectTemplates.
 */
public class ProjectTemplateCategoryDto
{
    private @NotNull String id;
    private @Nullable String name;
    private @NotNull Integer order;
    private @Nullable ProjectTemplateDto[] templates;

    /**
     * The unique identifier of this ProjectTemplate Category.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectTemplate Category.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * A friendly name for this ProjectTemplate Category.
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * A friendly name for this ProjectTemplate Category.
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
    /**
     * The overall order of this ProjectTemplate Category
     *
     * @return The field order
     */
    public @NotNull Integer getOrder() { return this.order; }
    /**
     * The overall order of this ProjectTemplate Category
     *
     * @param value The new value for order
     */
    public void setOrder(@NotNull Integer value) { this.order = value; }
    /**
     * A list of templates in this category
     *
     * @return The field templates
     */
    public @Nullable ProjectTemplateDto[] getTemplates() { return this.templates; }
    /**
     * A list of templates in this category
     *
     * @param value The new value for templates
     */
    public void setTemplates(@Nullable ProjectTemplateDto[] value) { this.templates = value; }
};
