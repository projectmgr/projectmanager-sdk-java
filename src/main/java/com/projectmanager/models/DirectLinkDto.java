
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
 * This class contains the URL to use to authenticate with the Integration Provider.
 */
public class DirectLinkDto
{
    private @Nullable String url;

    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @return The field url
     */
    public @Nullable String getUrl() { return this.url; }
    /**
     * The URL to use to authenticate with the Integration Provider.
     *
     * @param value The new value for url
     */
    public void setUrl(@Nullable String value) { this.url = value; }
};
