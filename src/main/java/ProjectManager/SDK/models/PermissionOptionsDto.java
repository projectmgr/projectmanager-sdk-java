
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


package ProjectManager.SDK.models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Specifies the permissions a member can be changed to on a project.
 * This objects values can change based on the logged in user and the role they have.
 */
public class PermissionOptionsDto
{
    private @NotNull Boolean none;
    private @NotNull Boolean collaborate;
    private @NotNull Boolean guest;
    private @NotNull Boolean editor;
    private @NotNull Boolean manager;

    /**
     * If true, the users access can be removed
     *
     * @return The field none
     */
    public @NotNull Boolean getNone() { return this.none; }
    /**
     * If true, the users access can be removed
     *
     * @param value The new value for none
     */
    public void setNone(@NotNull Boolean value) { this.none = value; }
    /**
     * If true the user can be changed to collaborator
     *
     * @return The field collaborate
     */
    public @NotNull Boolean getCollaborate() { return this.collaborate; }
    /**
     * If true the user can be changed to collaborator
     *
     * @param value The new value for collaborate
     */
    public void setCollaborate(@NotNull Boolean value) { this.collaborate = value; }
    /**
     * If true a user can be set as guest, a guest can only be Guest or None
     *
     * @return The field guest
     */
    public @NotNull Boolean getGuest() { return this.guest; }
    /**
     * If true a user can be set as guest, a guest can only be Guest or None
     *
     * @param value The new value for guest
     */
    public void setGuest(@NotNull Boolean value) { this.guest = value; }
    /**
     * If true the user can be changed to editor
     *
     * @return The field editor
     */
    public @NotNull Boolean getEditor() { return this.editor; }
    /**
     * If true the user can be changed to editor
     *
     * @param value The new value for editor
     */
    public void setEditor(@NotNull Boolean value) { this.editor = value; }
    /**
     * If true the user can be changed to Manager
     *
     * @return The field manager
     */
    public @NotNull Boolean getManager() { return this.manager; }
    /**
     * If true the user can be changed to Manager
     *
     * @param value The new value for manager
     */
    public void setManager(@NotNull Boolean value) { this.manager = value; }
};
