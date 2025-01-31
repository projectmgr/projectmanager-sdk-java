
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
 * This class contains the URL to use to authenticate with the Integration Provider.
 */
public class DirectLinkDto
{
    private @NotNull String url;

    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @return The field url
     */
    public @NotNull String getUrl() { return this.url; }
    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @param value The new value for url
     */
    public void setUrl(@NotNull String value) { this.url = value; }
};
