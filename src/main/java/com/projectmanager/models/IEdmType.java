
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

public class IEdmType
{
    private @NotNull String typeKind;

    /**
     *
     * @return The field typeKind
     */
    public @NotNull String getTypeKind() { return this.typeKind; }
    /**
     *
     * @param value The new value for typeKind
     */
    public void setTypeKind(@NotNull String value) { this.typeKind = value; }
};
