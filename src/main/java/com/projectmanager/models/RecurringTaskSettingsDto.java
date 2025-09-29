
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
 * Recurring settings for a task
 */
public class RecurringTaskSettingsDto
{
    private @NotNull Integer type;
    private @Nullable Integer repeatEvery;
    private @NotNull Integer[] repeatOn;
    private @Nullable Integer repeatOn2Level;
    private @Nullable String endsOn;
    private @Nullable Integer endsAfter;

    /**
     * Type
     *
     * @return The field type
     */
    public @NotNull Integer getType() { return this.type; }
    /**
     * Type
     *
     * @param value The new value for type
     */
    public void setType(@NotNull Integer value) { this.type = value; }
    /**
     * RepeatEvery
     *
     * @return The field repeatEvery
     */
    public @Nullable Integer getRepeatEvery() { return this.repeatEvery; }
    /**
     * RepeatEvery
     *
     * @param value The new value for repeatEvery
     */
    public void setRepeatEvery(@Nullable Integer value) { this.repeatEvery = value; }
    /**
     * RepeatOn
     *
     * @return The field repeatOn
     */
    public @NotNull Integer[] getRepeatOn() { return this.repeatOn; }
    /**
     * RepeatOn
     *
     * @param value The new value for repeatOn
     */
    public void setRepeatOn(@NotNull Integer[] value) { this.repeatOn = value; }
    /**
     * RepeatOn2Level
     *
     * @return The field repeatOn2Level
     */
    public @Nullable Integer getRepeatOn2Level() { return this.repeatOn2Level; }
    /**
     * RepeatOn2Level
     *
     * @param value The new value for repeatOn2Level
     */
    public void setRepeatOn2Level(@Nullable Integer value) { this.repeatOn2Level = value; }
    /**
     * EndsOn
     *
     * @return The field endsOn
     */
    public @Nullable String getEndsOn() { return this.endsOn; }
    /**
     * EndsOn
     *
     * @param value The new value for endsOn
     */
    public void setEndsOn(@Nullable String value) { this.endsOn = value; }
    /**
     * EndsAfter
     *
     * @return The field endsAfter
     */
    public @Nullable Integer getEndsAfter() { return this.endsAfter; }
    /**
     * EndsAfter
     *
     * @param value The new value for endsAfter
     */
    public void setEndsAfter(@Nullable Integer value) { this.endsAfter = value; }
};
