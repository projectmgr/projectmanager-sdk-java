
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
 * Request to grant project access to all active people on a business team.
 */
public class AddProjectTeamMembersRequestDto
{
    private @NotNull Boolean addAsEditor;

    /**
     * When true, new teammates receive editor-level access (subject to workspace role rules).
     * When false, they receive collaborator access (again subject to role rules, e.g. guests).
     *
     * @return The field addAsEditor
     */
    public @NotNull Boolean getAddAsEditor() { return this.addAsEditor; }
    /**
     * When true, new teammates receive editor-level access (subject to workspace role rules).
     * When false, they receive collaborator access (again subject to role rules, e.g. guests).
     *
     * @param value The new value for addAsEditor
     */
    public void setAddAsEditor(@NotNull Boolean value) { this.addAsEditor = value; }
};
