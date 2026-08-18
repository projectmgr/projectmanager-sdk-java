
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
 * A summary of the paid user licenses for the workspace the current user is logged on to.
 */
public class WorkspaceLicensesDto
{
    private @NotNull Integer purchased;
    private @NotNull Integer used;
    private @NotNull Integer guestUsed;
    private @NotNull Integer remaining;

    /**
     * The number of paid user licenses purchased for this workspace.
     *
     * @return The field purchased
     */
    public @NotNull Integer getPurchased() { return this.purchased; }
    /**
     * The number of paid user licenses purchased for this workspace.
     *
     * @param value The new value for purchased
     */
    public void setPurchased(@NotNull Integer value) { this.purchased = value; }
    /**
     * The number of paid user licenses currently in use by active (non-guest) users.
     *
     * @return The field used
     */
    public @NotNull Integer getUsed() { return this.used; }
    /**
     * The number of paid user licenses currently in use by active (non-guest) users.
     *
     * @param value The new value for used
     */
    public void setUsed(@NotNull Integer value) { this.used = value; }
    /**
     * The number of active guest users in this workspace.
     *
     * @return The field guestUsed
     */
    public @NotNull Integer getGuestUsed() { return this.guestUsed; }
    /**
     * The number of active guest users in this workspace.
     *
     * @param value The new value for guestUsed
     */
    public void setGuestUsed(@NotNull Integer value) { this.guestUsed = value; }
    /**
     * The number of purchased licenses still available. This can be negative when the workspace
     * has more active users than purchased licenses.
     *
     * @return The field remaining
     */
    public @NotNull Integer getRemaining() { return this.remaining; }
    /**
     * The number of purchased licenses still available. This can be negative when the workspace
     * has more active users than purchased licenses.
     *
     * @param value The new value for remaining
     */
    public void setRemaining(@NotNull Integer value) { this.remaining = value; }
};
