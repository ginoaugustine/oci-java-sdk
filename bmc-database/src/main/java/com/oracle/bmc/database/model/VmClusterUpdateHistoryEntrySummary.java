/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The record of a maintenance update action performed on a specified VM cluster. Applies to Exadata Cloud@Customer instances only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VmClusterUpdateHistoryEntrySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmClusterUpdateHistoryEntrySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "updateId",
        "updateAction",
        "updateType",
        "lifecycleState",
        "lifecycleDetails",
        "timeStarted",
        "timeCompleted"
    })
    public VmClusterUpdateHistoryEntrySummary(
            String id,
            String updateId,
            UpdateAction updateAction,
            UpdateType updateType,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeStarted,
            java.util.Date timeCompleted) {
        super();
        this.id = id;
        this.updateId = updateId;
        this.updateAction = updateAction;
        this.updateType = updateType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateId")
        private String updateId;

        public Builder updateId(String updateId) {
            this.updateId = updateId;
            this.__explicitlySet__.add("updateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
        private UpdateAction updateAction;

        public Builder updateAction(UpdateAction updateAction) {
            this.updateAction = updateAction;
            this.__explicitlySet__.add("updateAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateType updateType;

        public Builder updateType(UpdateType updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmClusterUpdateHistoryEntrySummary build() {
            VmClusterUpdateHistoryEntrySummary __instance__ =
                    new VmClusterUpdateHistoryEntrySummary(
                            id,
                            updateId,
                            updateAction,
                            updateType,
                            lifecycleState,
                            lifecycleDetails,
                            timeStarted,
                            timeCompleted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmClusterUpdateHistoryEntrySummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .updateId(o.getUpdateId())
                            .updateAction(o.getUpdateAction())
                            .updateType(o.getUpdateType())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeStarted(o.getTimeStarted())
                            .timeCompleted(o.getTimeCompleted());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update history entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateId")
    private final String updateId;

    public String getUpdateId() {
        return updateId;
    }

    /**
     * The update action performed using this maintenance update.
     **/
    public enum UpdateAction {
        RollingApply("ROLLING_APPLY"),
        Precheck("PRECHECK"),
        Rollback("ROLLBACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateAction.class);

        private final String value;
        private static java.util.Map<String, UpdateAction> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateAction v : UpdateAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The update action performed using this maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
    private final UpdateAction updateAction;

    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * The type of VM cluster maintenance update.
     **/
    public enum UpdateType {
        GiUpgrade("GI_UPGRADE"),
        GiPatch("GI_PATCH"),
        OsUpdate("OS_UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateType.class);

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of VM cluster maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateType updateType;

    public UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * The current lifecycle state of the maintenance update operation.
     **/
    public enum LifecycleState {
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycle state of the maintenance update operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Descriptive text providing additional details about the lifecycle state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time when the maintenance update action started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time when the maintenance update action completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VmClusterUpdateHistoryEntrySummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", updateId=").append(String.valueOf(this.updateId));
        sb.append(", updateAction=").append(String.valueOf(this.updateAction));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmClusterUpdateHistoryEntrySummary)) {
            return false;
        }

        VmClusterUpdateHistoryEntrySummary other = (VmClusterUpdateHistoryEntrySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.updateId, other.updateId)
                && java.util.Objects.equals(this.updateAction, other.updateAction)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.updateAction == null ? 43 : this.updateAction.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
