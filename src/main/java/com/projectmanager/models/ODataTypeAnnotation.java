
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

public class ODataTypeAnnotation
{
    private @Nullable String typeName;

    /**
     *
     * @return The field typeName
     */
    public @Nullable String getTypeName() { return this.typeName; }
    /**
     *
     * @param value The new value for typeName
     */
    public void setTypeName(@Nullable String value) { this.typeName = value; }
};
