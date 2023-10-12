
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
 * Dto To Describe a ProjectMember Role
 */
public class ProjectMemberRoleDto
{
    private @NotNull String role;

    /**
     * Role to apply
     *
     * @return The field role
     */
    public @NotNull String getRole() { return this.role; }
    /**
     * Role to apply
     *
     * @param value The new value for role
     */
    public void setRole(@NotNull String value) { this.role = value; }
};
