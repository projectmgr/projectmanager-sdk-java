
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
 * A ProjectTemplate is a named document that contains default Project details.
 *
 * Project Templates are defined for the system and are shared among Projects.
 */
public class ProjectTemplateDto
{
    private @NotNull String id;
    private @NotNull String name;
    private @NotNull String title;
    private @NotNull String description;
    private @NotNull String icon;
    private @NotNull String previewImage;
    private @NotNull Integer order;
    private @NotNull Boolean isCustom;
    private @NotNull String defaultView;

    /**
     * The unique identifier of this ProjectTemplate.
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ProjectTemplate.
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ProjectTemplate.
     *
     * Name can de used as a unique text reference for Project Templates.
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this ProjectTemplate.
     *
     * Name can de used as a unique text reference for Project Templates.
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
    /**
     * The title of this ProjectTemplate.
     *
     * Title can be used as a description text for Project Templates.
     *
     * @return The field title
     */
    public @NotNull String getTitle() { return this.title; }
    /**
     * The title of this ProjectTemplate.
     *
     * Title can be used as a description text for Project Templates.
     *
     * @param value The new value for title
     */
    public void setTitle(@NotNull String value) { this.title = value; }
    /**
     * The full text description of this ProjectTemplate.
     *
     * @return The field description
     */
    public @NotNull String getDescription() { return this.description; }
    /**
     * The full text description of this ProjectTemplate.
     *
     * @param value The new value for description
     */
    public void setDescription(@NotNull String value) { this.description = value; }
    /**
     * The icon path for this ProjectTemplate.
     *
     * @return The field icon
     */
    public @NotNull String getIcon() { return this.icon; }
    /**
     * The icon path for this ProjectTemplate.
     *
     * @param value The new value for icon
     */
    public void setIcon(@NotNull String value) { this.icon = value; }
    /**
     * The preview image path for this ProjectTemplate.
     *
     * @return The field previewImage
     */
    public @NotNull String getPreviewImage() { return this.previewImage; }
    /**
     * The preview image path for this ProjectTemplate.
     *
     * @param value The new value for previewImage
     */
    public void setPreviewImage(@NotNull String value) { this.previewImage = value; }
    /**
     * The overall order of this ProjectTemplate.
     *
     * This order only applies to non-Custom ProjectTemplates
     *
     * @return The field order
     */
    public @NotNull Integer getOrder() { return this.order; }
    /**
     * The overall order of this ProjectTemplate.
     *
     * This order only applies to non-Custom ProjectTemplates
     *
     * @param value The new value for order
     */
    public void setOrder(@NotNull Integer value) { this.order = value; }
    /**
     * Is this ProjectTemplate a custom template.
     *
     * Custom templates are Templates that have been created from existing
     * Project definitions.
     *
     * @return The field isCustom
     */
    public @NotNull Boolean getIsCustom() { return this.isCustom; }
    /**
     * Is this ProjectTemplate a custom template.
     *
     * Custom templates are Templates that have been created from existing
     * Project definitions.
     *
     * @param value The new value for isCustom
     */
    public void setIsCustom(@NotNull Boolean value) { this.isCustom = value; }
    /**
     * The web default view of the template.
     *
     * @return The field defaultView
     */
    public @NotNull String getDefaultView() { return this.defaultView; }
    /**
     * The web default view of the template.
     *
     * @param value The new value for defaultView
     */
    public void setDefaultView(@NotNull String value) { this.defaultView = value; }
};
