
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

/**
 * A ResourceSkill is a capability possessed by this Resource that can be used to
 * determine appropriate assignments.  Some Resources may have ResourceSkills that
 * are in high demand and some Tasks may have a requirement for Resources with particular
 * ResourceSkills.
 */
public class ResourceSkillDto
{
    private @NotNull String id;
    private @Nullable String name;

    /**
     * The unique identifier of this ResourceSkill
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * The unique identifier of this ResourceSkill
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * The name of this ResourceSkill
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this ResourceSkill
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
