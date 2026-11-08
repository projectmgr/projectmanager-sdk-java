
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

/**
 * Represents an update to the type and/or lag of an existing link (dependency) between two Tasks.
 */
public class TaskLinkUpdateDto
{
    private @NotNull String linkType;
    private @NotNull Integer lag;

    /**
     * Primary constructor
     */
    public TaskLinkUpdateDto() {
    }

    /**
     * The type of dependency between the two Tasks. Case-insensitive; stored and returned in camelCase.
     *
     * Valid values: finishToStart, startToStart, finishToFinish, startToFinish.
     *
     * @return The field linkType
     */
    public @NotNull String getLinkType() { return this.linkType; }
    /**
     * The type of dependency between the two Tasks. Case-insensitive; stored and returned in camelCase.
     *
     * Valid values: finishToStart, startToStart, finishToFinish, startToFinish.
     *
     * @param value The new value for linkType
     */
    public void setLinkType(@NotNull String value) { this.linkType = value; }
    /**
     * The number of days of lag (or lead, if negative) between the two Tasks.
     *
     * @return The field lag
     */
    public @NotNull Integer getLag() { return this.lag; }
    /**
     * The number of days of lag (or lead, if negative) between the two Tasks.
     *
     * @param value The new value for lag
     */
    public void setLag(@NotNull Integer value) { this.lag = value; }
};
