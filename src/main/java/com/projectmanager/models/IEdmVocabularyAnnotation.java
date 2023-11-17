
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

public class IEdmVocabularyAnnotation
{
    private @Nullable String qualifier;
    private @Nullable IEdmTerm term;
    private @Nullable IEdmVocabularyAnnotatable target;
    private @Nullable IEdmExpression value;

    /**
     *
     * @return The field qualifier
     */
    public @Nullable String getQualifier() { return this.qualifier; }
    /**
     *
     * @param value The new value for qualifier
     */
    public void setQualifier(@Nullable String value) { this.qualifier = value; }
    /**
     *
     * @return The field term
     */
    public @Nullable IEdmTerm getTerm() { return this.term; }
    /**
     *
     * @param value The new value for term
     */
    public void setTerm(@Nullable IEdmTerm value) { this.term = value; }
    /**
     *
     * @return The field target
     */
    public @Nullable IEdmVocabularyAnnotatable getTarget() { return this.target; }
    /**
     *
     * @param value The new value for target
     */
    public void setTarget(@Nullable IEdmVocabularyAnnotatable value) { this.target = value; }
    /**
     *
     * @return The field value
     */
    public @Nullable IEdmExpression getValue() { return this.value; }
    /**
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable IEdmExpression value) { this.value = value; }
};
