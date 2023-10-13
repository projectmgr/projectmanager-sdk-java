
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
 * TODO - What is this?
 */
public class WorkSpaceUserInfoDto
{
    private @Nullable WorkSpaceLinksDto links;
    private @Nullable String emailAddress;
    private @NotNull String id;
    private @Nullable String fullName;
    private @Nullable String workSpaceName;

    /**
     * TODO - What is this?
     *
     * @return The field links
     */
    public @Nullable WorkSpaceLinksDto getLinks() { return this.links; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for links
     */
    public void setLinks(@Nullable WorkSpaceLinksDto value) { this.links = value; }
    /**
     * TODO - What is this?
     *
     * @return The field emailAddress
     */
    public @Nullable String getEmailAddress() { return this.emailAddress; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for emailAddress
     */
    public void setEmailAddress(@Nullable String value) { this.emailAddress = value; }
    /**
     * TODO - What is this?
     *
     * @return The field id
     */
    public @NotNull String getId() { return this.id; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for id
     */
    public void setId(@NotNull String value) { this.id = value; }
    /**
     * TODO - What is this?
     *
     * @return The field fullName
     */
    public @Nullable String getFullName() { return this.fullName; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for fullName
     */
    public void setFullName(@Nullable String value) { this.fullName = value; }
    /**
     * TODO - What is this?
     *
     * @return The field workSpaceName
     */
    public @Nullable String getWorkSpaceName() { return this.workSpaceName; }
    /**
     * TODO - What is this?
     *
     * @param value The new value for workSpaceName
     */
    public void setWorkSpaceName(@Nullable String value) { this.workSpaceName = value; }
};
