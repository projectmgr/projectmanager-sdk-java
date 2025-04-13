
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
 * This is a skill that can be allocated to a resource.
 */
public class UpdateResourceSkillDto
{
    private @Nullable String name;

    /**
     * The name of this Skill, if specified it will be updated
     *
     * @return The field name
     */
    public @Nullable String getName() { return this.name; }
    /**
     * The name of this Skill, if specified it will be updated
     *
     * @param value The new value for name
     */
    public void setName(@Nullable String value) { this.name = value; }
};
