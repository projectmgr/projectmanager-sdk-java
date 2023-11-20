
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
 * A model that contains the value for a TaskField.
 */
public class TaskFieldDto
{
    private @Nullable String shortId;
    private @Nullable String value;

    /**
     * The unique Short Id of this TaskField.
     *
     * @return The field shortId
     */
    public @Nullable String getShortId() { return this.shortId; }
    /**
     * The unique Short Id of this TaskField.
     *
     * @param value The new value for shortId
     */
    public void setShortId(@Nullable String value) { this.shortId = value; }
    /**
     * The value currently set for this TaskField for this Task.
     *
     * @return The field value
     */
    public @Nullable String getValue() { return this.value; }
    /**
     * The value currently set for this TaskField for this Task.
     *
     * @param value The new value for value
     */
    public void setValue(@Nullable String value) { this.value = value; }
};
