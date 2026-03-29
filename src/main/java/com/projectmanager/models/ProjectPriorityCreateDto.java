
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
 * A ProjectPriority is a named priority level used by your business to determine how to decide
 * which Tasks are the most important.  You can name your ProjectPriority levels anything you like
 * and you can reorganize the order of the ProjectPriority levels at any time.
 */
public class ProjectPriorityCreateDto
{
    private @NotNull String name;

    /**
     * The name of this ProjectPriority
     *
     * @return The field name
     */
    public @NotNull String getName() { return this.name; }
    /**
     * The name of this ProjectPriority
     *
     * @param value The new value for name
     */
    public void setName(@NotNull String value) { this.name = value; }
};
