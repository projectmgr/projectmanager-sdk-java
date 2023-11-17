
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

public class IEdmExpression
{
    private @NotNull String expressionKind;

    /**
     *
     * @return The field expressionKind
     */
    public @NotNull String getExpressionKind() { return this.expressionKind; }
    /**
     *
     * @param value The new value for expressionKind
     */
    public void setExpressionKind(@NotNull String value) { this.expressionKind = value; }
};
