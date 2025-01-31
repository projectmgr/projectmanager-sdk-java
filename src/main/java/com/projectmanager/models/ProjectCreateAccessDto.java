
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
 * Specify who has access to a newly created project
 */
public class ProjectCreateAccessDto
{
    private @NotNull Boolean everyone;
    private @Nullable ProjectCreateAccessMemberDto[] members;

    /**
     * If set to true every user will get access to this project
     *
     * @return The field everyone
     */
    public @NotNull Boolean getEveryone() { return this.everyone; }
    /**
     * If set to true every user will get access to this project
     *
     * @param value The new value for everyone
     */
    public void setEveryone(@NotNull Boolean value) { this.everyone = value; }
    /**
     * If everyone is set to false the list of members will be used to give people access
     *
     * @return The field members
     */
    public @Nullable ProjectCreateAccessMemberDto[] getMembers() { return this.members; }
    /**
     * If everyone is set to false the list of members will be used to give people access
     *
     * @param value The new value for members
     */
    public void setMembers(@Nullable ProjectCreateAccessMemberDto[] value) { this.members = value; }
};
