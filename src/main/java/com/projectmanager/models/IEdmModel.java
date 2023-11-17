
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

public class IEdmModel
{
    private @Nullable IEdmSchemaElement[] schemaElements;
    private @Nullable IEdmVocabularyAnnotation[] vocabularyAnnotations;
    private @Nullable IEdmModel[] referencedModels;
    private @Nullable String[] declaredNamespaces;
    private @Nullable IEdmDirectValueAnnotationsManager directValueAnnotationsManager;
    private @Nullable IEdmEntityContainer entityContainer;

    /**
     *
     * @return The field schemaElements
     */
    public @Nullable IEdmSchemaElement[] getSchemaElements() { return this.schemaElements; }
    /**
     *
     * @param value The new value for schemaElements
     */
    public void setSchemaElements(@Nullable IEdmSchemaElement[] value) { this.schemaElements = value; }
    /**
     *
     * @return The field vocabularyAnnotations
     */
    public @Nullable IEdmVocabularyAnnotation[] getVocabularyAnnotations() { return this.vocabularyAnnotations; }
    /**
     *
     * @param value The new value for vocabularyAnnotations
     */
    public void setVocabularyAnnotations(@Nullable IEdmVocabularyAnnotation[] value) { this.vocabularyAnnotations = value; }
    /**
     *
     * @return The field referencedModels
     */
    public @Nullable IEdmModel[] getReferencedModels() { return this.referencedModels; }
    /**
     *
     * @param value The new value for referencedModels
     */
    public void setReferencedModels(@Nullable IEdmModel[] value) { this.referencedModels = value; }
    /**
     *
     * @return The field declaredNamespaces
     */
    public @Nullable String[] getDeclaredNamespaces() { return this.declaredNamespaces; }
    /**
     *
     * @param value The new value for declaredNamespaces
     */
    public void setDeclaredNamespaces(@Nullable String[] value) { this.declaredNamespaces = value; }
    /**
     *
     * @return The field directValueAnnotationsManager
     */
    public @Nullable IEdmDirectValueAnnotationsManager getDirectValueAnnotationsManager() { return this.directValueAnnotationsManager; }
    /**
     *
     * @param value The new value for directValueAnnotationsManager
     */
    public void setDirectValueAnnotationsManager(@Nullable IEdmDirectValueAnnotationsManager value) { this.directValueAnnotationsManager = value; }
    /**
     *
     * @return The field entityContainer
     */
    public @Nullable IEdmEntityContainer getEntityContainer() { return this.entityContainer; }
    /**
     *
     * @param value The new value for entityContainer
     */
    public void setEntityContainer(@Nullable IEdmEntityContainer value) { this.entityContainer = value; }
};
