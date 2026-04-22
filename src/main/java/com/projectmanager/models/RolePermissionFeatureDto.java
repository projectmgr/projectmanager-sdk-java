
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
 * One cell in the workspace role permissions matrix: grant state plus subscription / feature metadata when the action is Chargebee-gated.
 */
public class RolePermissionFeatureDto
{
    private @NotNull Boolean isGranted;
    private @NotNull Boolean isEntitled;
    private @NotNull Boolean isFeatureEnabled;
    private @Nullable String featureId;
    private @Nullable String featureName;

    /**
     * Whether this permission is granted for the role in the workspace (persisted access).
     *
     * @return The field isGranted
     */
    public @NotNull Boolean getIsGranted() { return this.isGranted; }
    /**
     * Whether this permission is granted for the role in the workspace (persisted access).
     *
     * @param value The new value for isGranted
     */
    public void setIsGranted(@NotNull Boolean value) { this.isGranted = value; }
    /**
     * Whether the current workspace subscription entitles this action. May be false while isGranted is true for legacy data.
     *
     * @return The field isEntitled
     */
    public @NotNull Boolean getIsEntitled() { return this.isEntitled; }
    /**
     * Whether the current workspace subscription entitles this action. May be false while isGranted is true for legacy data.
     *
     * @param value The new value for isEntitled
     */
    public void setIsEntitled(@NotNull Boolean value) { this.isEntitled = value; }
    /**
     * Whether the feature flag for this permission is enabled for the workspace (display / upsell context).
     *
     * @return The field isFeatureEnabled
     */
    public @NotNull Boolean getIsFeatureEnabled() { return this.isFeatureEnabled; }
    /**
     * Whether the feature flag for this permission is enabled for the workspace (display / upsell context).
     *
     * @param value The new value for isFeatureEnabled
     */
    public void setIsFeatureEnabled(@NotNull Boolean value) { this.isFeatureEnabled = value; }
    /**
     * Primary Chargebee feature id used for entitlement (e.g. print-and-export), when applicable.
     *
     * @return The field featureId
     */
    public @Nullable String getFeatureId() { return this.featureId; }
    /**
     * Primary Chargebee feature id used for entitlement (e.g. print-and-export), when applicable.
     *
     * @param value The new value for featureId
     */
    public void setFeatureId(@Nullable String value) { this.featureId = value; }
    /**
     * Human-readable feature name for UI or documentation, when applicable.
     *
     * @return The field featureName
     */
    public @Nullable String getFeatureName() { return this.featureName; }
    /**
     * Human-readable feature name for UI or documentation, when applicable.
     *
     * @param value The new value for featureName
     */
    public void setFeatureName(@Nullable String value) { this.featureName = value; }
};
