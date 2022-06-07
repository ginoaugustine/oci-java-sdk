/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a data file.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Datafile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Datafile {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "onlineStatus",
        "isAutoExtensible",
        "lostWriteProtect",
        "shared",
        "instanceId",
        "maxSizeKB",
        "allocatedSizeKB",
        "userSizeKB",
        "incrementBy",
        "freeSpaceKB",
        "usedSpaceKB",
        "usedPercentAvailable",
        "usedPercentAllocated"
    })
    public Datafile(
            String name,
            Status status,
            OnlineStatus onlineStatus,
            Boolean isAutoExtensible,
            LostWriteProtect lostWriteProtect,
            Shared shared,
            java.math.BigDecimal instanceId,
            java.math.BigDecimal maxSizeKB,
            java.math.BigDecimal allocatedSizeKB,
            java.math.BigDecimal userSizeKB,
            java.math.BigDecimal incrementBy,
            java.math.BigDecimal freeSpaceKB,
            java.math.BigDecimal usedSpaceKB,
            Double usedPercentAvailable,
            Double usedPercentAllocated) {
        super();
        this.name = name;
        this.status = status;
        this.onlineStatus = onlineStatus;
        this.isAutoExtensible = isAutoExtensible;
        this.lostWriteProtect = lostWriteProtect;
        this.shared = shared;
        this.instanceId = instanceId;
        this.maxSizeKB = maxSizeKB;
        this.allocatedSizeKB = allocatedSizeKB;
        this.userSizeKB = userSizeKB;
        this.incrementBy = incrementBy;
        this.freeSpaceKB = freeSpaceKB;
        this.usedSpaceKB = usedSpaceKB;
        this.usedPercentAvailable = usedPercentAvailable;
        this.usedPercentAllocated = usedPercentAllocated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
        private OnlineStatus onlineStatus;

        public Builder onlineStatus(OnlineStatus onlineStatus) {
            this.onlineStatus = onlineStatus;
            this.__explicitlySet__.add("onlineStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
        private LostWriteProtect lostWriteProtect;

        public Builder lostWriteProtect(LostWriteProtect lostWriteProtect) {
            this.lostWriteProtect = lostWriteProtect;
            this.__explicitlySet__.add("lostWriteProtect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shared")
        private Shared shared;

        public Builder shared(Shared shared) {
            this.shared = shared;
            this.__explicitlySet__.add("shared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private java.math.BigDecimal instanceId;

        public Builder instanceId(java.math.BigDecimal instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
        private java.math.BigDecimal maxSizeKB;

        public Builder maxSizeKB(java.math.BigDecimal maxSizeKB) {
            this.maxSizeKB = maxSizeKB;
            this.__explicitlySet__.add("maxSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
        private java.math.BigDecimal allocatedSizeKB;

        public Builder allocatedSizeKB(java.math.BigDecimal allocatedSizeKB) {
            this.allocatedSizeKB = allocatedSizeKB;
            this.__explicitlySet__.add("allocatedSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
        private java.math.BigDecimal userSizeKB;

        public Builder userSizeKB(java.math.BigDecimal userSizeKB) {
            this.userSizeKB = userSizeKB;
            this.__explicitlySet__.add("userSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
        private java.math.BigDecimal incrementBy;

        public Builder incrementBy(java.math.BigDecimal incrementBy) {
            this.incrementBy = incrementBy;
            this.__explicitlySet__.add("incrementBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
        private java.math.BigDecimal freeSpaceKB;

        public Builder freeSpaceKB(java.math.BigDecimal freeSpaceKB) {
            this.freeSpaceKB = freeSpaceKB;
            this.__explicitlySet__.add("freeSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
        private java.math.BigDecimal usedSpaceKB;

        public Builder usedSpaceKB(java.math.BigDecimal usedSpaceKB) {
            this.usedSpaceKB = usedSpaceKB;
            this.__explicitlySet__.add("usedSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
        private Double usedPercentAvailable;

        public Builder usedPercentAvailable(Double usedPercentAvailable) {
            this.usedPercentAvailable = usedPercentAvailable;
            this.__explicitlySet__.add("usedPercentAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
        private Double usedPercentAllocated;

        public Builder usedPercentAllocated(Double usedPercentAllocated) {
            this.usedPercentAllocated = usedPercentAllocated;
            this.__explicitlySet__.add("usedPercentAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Datafile build() {
            Datafile __instance__ =
                    new Datafile(
                            name,
                            status,
                            onlineStatus,
                            isAutoExtensible,
                            lostWriteProtect,
                            shared,
                            instanceId,
                            maxSizeKB,
                            allocatedSizeKB,
                            userSizeKB,
                            incrementBy,
                            freeSpaceKB,
                            usedSpaceKB,
                            usedPercentAvailable,
                            usedPercentAllocated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Datafile o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .onlineStatus(o.getOnlineStatus())
                            .isAutoExtensible(o.getIsAutoExtensible())
                            .lostWriteProtect(o.getLostWriteProtect())
                            .shared(o.getShared())
                            .instanceId(o.getInstanceId())
                            .maxSizeKB(o.getMaxSizeKB())
                            .allocatedSizeKB(o.getAllocatedSizeKB())
                            .userSizeKB(o.getUserSizeKB())
                            .incrementBy(o.getIncrementBy())
                            .freeSpaceKB(o.getFreeSpaceKB())
                            .usedSpaceKB(o.getUsedSpaceKB())
                            .usedPercentAvailable(o.getUsedPercentAvailable())
                            .usedPercentAllocated(o.getUsedPercentAllocated());

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
     * The filename (including the path) of the data file or temp file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The status of the file. INVALID status is used when the file number is not in use, for example, a file in a tablespace that was removed.
     **/
    public enum Status {
        Available("AVAILABLE"),
        Invalid("INVALID"),
        Offline("OFFLINE"),
        Online("ONLINE"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the file. INVALID status is used when the file number is not in use, for example, a file in a tablespace that was removed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * The online status of the file.
     **/
    public enum OnlineStatus {
        Sysoff("SYSOFF"),
        System("SYSTEM"),
        Offline("OFFLINE"),
        Online("ONLINE"),
        Recover("RECOVER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OnlineStatus.class);

        private final String value;
        private static java.util.Map<String, OnlineStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OnlineStatus v : OnlineStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OnlineStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OnlineStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OnlineStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The online status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
    private final OnlineStatus onlineStatus;

    public OnlineStatus getOnlineStatus() {
        return onlineStatus;
    }

    /**
     * Indicates whether the data file is auto-extensible.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    private final Boolean isAutoExtensible;

    public Boolean getIsAutoExtensible() {
        return isAutoExtensible;
    }

    /**
     * The lost write protection status of the file.
     **/
    public enum LostWriteProtect {
        Enabled("ENABLED"),
        ProtectOff("PROTECT_OFF"),
        Suspend("SUSPEND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LostWriteProtect.class);

        private final String value;
        private static java.util.Map<String, LostWriteProtect> map;

        static {
            map = new java.util.HashMap<>();
            for (LostWriteProtect v : LostWriteProtect.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LostWriteProtect(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LostWriteProtect create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LostWriteProtect', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lost write protection status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
    private final LostWriteProtect lostWriteProtect;

    public LostWriteProtect getLostWriteProtect() {
        return lostWriteProtect;
    }

    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    public enum Shared {
        Shared("SHARED"),
        LocalForRim("LOCAL_FOR_RIM"),
        LocalForAll("LOCAL_FOR_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Shared.class);

        private final String value;
        private static java.util.Map<String, Shared> map;

        static {
            map = new java.util.HashMap<>();
            for (Shared v : Shared.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Shared(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Shared create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Shared', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shared")
    private final Shared shared;

    public Shared getShared() {
        return shared;
    }

    /**
     * Instance ID of the instance to which the temp file belongs. This column has a NULL value for temp files that belong to shared tablespaces.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final java.math.BigDecimal instanceId;

    public java.math.BigDecimal getInstanceId() {
        return instanceId;
    }

    /**
     * The maximum file size in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
    private final java.math.BigDecimal maxSizeKB;

    public java.math.BigDecimal getMaxSizeKB() {
        return maxSizeKB;
    }

    /**
     * The allocated file size in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
    private final java.math.BigDecimal allocatedSizeKB;

    public java.math.BigDecimal getAllocatedSizeKB() {
        return allocatedSizeKB;
    }

    /**
     * The size of the file available for user data in KB. The actual size of the file minus the USER_BYTES value is used to store file-related metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
    private final java.math.BigDecimal userSizeKB;

    public java.math.BigDecimal getUserSizeKB() {
        return userSizeKB;
    }

    /**
     * The number of blocks used as auto-extension increment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
    private final java.math.BigDecimal incrementBy;

    public java.math.BigDecimal getIncrementBy() {
        return incrementBy;
    }

    /**
     * The free space available in the data file in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
    private final java.math.BigDecimal freeSpaceKB;

    public java.math.BigDecimal getFreeSpaceKB() {
        return freeSpaceKB;
    }

    /**
     * The total space used in the data file in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
    private final java.math.BigDecimal usedSpaceKB;

    public java.math.BigDecimal getUsedSpaceKB() {
        return usedSpaceKB;
    }

    /**
     * The percentage of used space out of the maximum available space in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
    private final Double usedPercentAvailable;

    public Double getUsedPercentAvailable() {
        return usedPercentAvailable;
    }

    /**
     * The percentage of used space out of the total allocated space in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
    private final Double usedPercentAllocated;

    public Double getUsedPercentAllocated() {
        return usedPercentAllocated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Datafile(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", onlineStatus=").append(String.valueOf(this.onlineStatus));
        sb.append(", isAutoExtensible=").append(String.valueOf(this.isAutoExtensible));
        sb.append(", lostWriteProtect=").append(String.valueOf(this.lostWriteProtect));
        sb.append(", shared=").append(String.valueOf(this.shared));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", maxSizeKB=").append(String.valueOf(this.maxSizeKB));
        sb.append(", allocatedSizeKB=").append(String.valueOf(this.allocatedSizeKB));
        sb.append(", userSizeKB=").append(String.valueOf(this.userSizeKB));
        sb.append(", incrementBy=").append(String.valueOf(this.incrementBy));
        sb.append(", freeSpaceKB=").append(String.valueOf(this.freeSpaceKB));
        sb.append(", usedSpaceKB=").append(String.valueOf(this.usedSpaceKB));
        sb.append(", usedPercentAvailable=").append(String.valueOf(this.usedPercentAvailable));
        sb.append(", usedPercentAllocated=").append(String.valueOf(this.usedPercentAllocated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Datafile)) {
            return false;
        }

        Datafile other = (Datafile) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.onlineStatus, other.onlineStatus)
                && java.util.Objects.equals(this.isAutoExtensible, other.isAutoExtensible)
                && java.util.Objects.equals(this.lostWriteProtect, other.lostWriteProtect)
                && java.util.Objects.equals(this.shared, other.shared)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.maxSizeKB, other.maxSizeKB)
                && java.util.Objects.equals(this.allocatedSizeKB, other.allocatedSizeKB)
                && java.util.Objects.equals(this.userSizeKB, other.userSizeKB)
                && java.util.Objects.equals(this.incrementBy, other.incrementBy)
                && java.util.Objects.equals(this.freeSpaceKB, other.freeSpaceKB)
                && java.util.Objects.equals(this.usedSpaceKB, other.usedSpaceKB)
                && java.util.Objects.equals(this.usedPercentAvailable, other.usedPercentAvailable)
                && java.util.Objects.equals(this.usedPercentAllocated, other.usedPercentAllocated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.onlineStatus == null ? 43 : this.onlineStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoExtensible == null ? 43 : this.isAutoExtensible.hashCode());
        result =
                (result * PRIME)
                        + (this.lostWriteProtect == null ? 43 : this.lostWriteProtect.hashCode());
        result = (result * PRIME) + (this.shared == null ? 43 : this.shared.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.maxSizeKB == null ? 43 : this.maxSizeKB.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedSizeKB == null ? 43 : this.allocatedSizeKB.hashCode());
        result = (result * PRIME) + (this.userSizeKB == null ? 43 : this.userSizeKB.hashCode());
        result = (result * PRIME) + (this.incrementBy == null ? 43 : this.incrementBy.hashCode());
        result = (result * PRIME) + (this.freeSpaceKB == null ? 43 : this.freeSpaceKB.hashCode());
        result = (result * PRIME) + (this.usedSpaceKB == null ? 43 : this.usedSpaceKB.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAvailable == null
                                ? 43
                                : this.usedPercentAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAllocated == null
                                ? 43
                                : this.usedPercentAllocated.hashCode());
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
