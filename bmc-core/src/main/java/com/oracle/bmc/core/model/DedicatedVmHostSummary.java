/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A dedicated virtual machine (VM) host lets you host multiple instances on a dedicated server that is not shared with other tenancies.
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
    builder = DedicatedVmHostSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DedicatedVmHostSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "dedicatedVmHostShape",
        "displayName",
        "faultDomain",
        "id",
        "lifecycleState",
        "timeCreated",
        "remainingOcpus",
        "totalOcpus",
        "totalMemoryInGBs",
        "remainingMemoryInGBs"
    })
    public DedicatedVmHostSummary(
            String availabilityDomain,
            String compartmentId,
            String dedicatedVmHostShape,
            String displayName,
            String faultDomain,
            String id,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            Float remainingOcpus,
            Float totalOcpus,
            Float totalMemoryInGBs,
            Float remainingMemoryInGBs) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.dedicatedVmHostShape = dedicatedVmHostShape;
        this.displayName = displayName;
        this.faultDomain = faultDomain;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.remainingOcpus = remainingOcpus;
        this.totalOcpus = totalOcpus;
        this.totalMemoryInGBs = totalMemoryInGBs;
        this.remainingMemoryInGBs = remainingMemoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
        private String dedicatedVmHostShape;

        public Builder dedicatedVmHostShape(String dedicatedVmHostShape) {
            this.dedicatedVmHostShape = dedicatedVmHostShape;
            this.__explicitlySet__.add("dedicatedVmHostShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
        private Float remainingOcpus;

        public Builder remainingOcpus(Float remainingOcpus) {
            this.remainingOcpus = remainingOcpus;
            this.__explicitlySet__.add("remainingOcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
        private Float totalOcpus;

        public Builder totalOcpus(Float totalOcpus) {
            this.totalOcpus = totalOcpus;
            this.__explicitlySet__.add("totalOcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
        private Float totalMemoryInGBs;

        public Builder totalMemoryInGBs(Float totalMemoryInGBs) {
            this.totalMemoryInGBs = totalMemoryInGBs;
            this.__explicitlySet__.add("totalMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
        private Float remainingMemoryInGBs;

        public Builder remainingMemoryInGBs(Float remainingMemoryInGBs) {
            this.remainingMemoryInGBs = remainingMemoryInGBs;
            this.__explicitlySet__.add("remainingMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedVmHostSummary build() {
            DedicatedVmHostSummary __instance__ =
                    new DedicatedVmHostSummary(
                            availabilityDomain,
                            compartmentId,
                            dedicatedVmHostShape,
                            displayName,
                            faultDomain,
                            id,
                            lifecycleState,
                            timeCreated,
                            remainingOcpus,
                            totalOcpus,
                            totalMemoryInGBs,
                            remainingMemoryInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedVmHostSummary o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .dedicatedVmHostShape(o.getDedicatedVmHostShape())
                            .displayName(o.getDisplayName())
                            .faultDomain(o.getFaultDomain())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .remainingOcpus(o.getRemainingOcpus())
                            .totalOcpus(o.getTotalOcpus())
                            .totalMemoryInGBs(o.getTotalMemoryInGBs())
                            .remainingMemoryInGBs(o.getRemainingMemoryInGBs());

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
     * The availability domain the dedicated VM host is running in.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment that contains the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The shape of the dedicated VM host. The shape determines the number of CPUs and
     * other resources available for VMs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
    private final String dedicatedVmHostShape;

    public String getDedicatedVmHostShape() {
        return dedicatedVmHostShape;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The fault domain for the dedicated VM host's assigned instances. For more information, see Fault Domains.
     * <p>
     * If you do not specify the fault domain, the system selects one for you. To change the fault domain for a dedicated VM host,
     * delete it and create a new dedicated VM host in the preferred fault domain.
     * <p>
     * To get a list of fault domains, use the ListFaultDomains operation in the Identity and Access Management Service API.
     * <p>
     * Example: {@code FAULT-DOMAIN-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The current state of the dedicated VM host.
     *
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
     * The current state of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the dedicated VM host was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current available OCPUs of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
    private final Float remainingOcpus;

    public Float getRemainingOcpus() {
        return remainingOcpus;
    }

    /**
     * The current total OCPUs of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
    private final Float totalOcpus;

    public Float getTotalOcpus() {
        return totalOcpus;
    }

    /**
     * The current total memory of the dedicated VM host, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    private final Float totalMemoryInGBs;

    public Float getTotalMemoryInGBs() {
        return totalMemoryInGBs;
    }

    /**
     * The current available memory of the dedicated VM host, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
    private final Float remainingMemoryInGBs;

    public Float getRemainingMemoryInGBs() {
        return remainingMemoryInGBs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DedicatedVmHostSummary(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dedicatedVmHostShape=").append(String.valueOf(this.dedicatedVmHostShape));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", remainingOcpus=").append(String.valueOf(this.remainingOcpus));
        sb.append(", totalOcpus=").append(String.valueOf(this.totalOcpus));
        sb.append(", totalMemoryInGBs=").append(String.valueOf(this.totalMemoryInGBs));
        sb.append(", remainingMemoryInGBs=").append(String.valueOf(this.remainingMemoryInGBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedVmHostSummary)) {
            return false;
        }

        DedicatedVmHostSummary other = (DedicatedVmHostSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dedicatedVmHostShape, other.dedicatedVmHostShape)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.remainingOcpus, other.remainingOcpus)
                && java.util.Objects.equals(this.totalOcpus, other.totalOcpus)
                && java.util.Objects.equals(this.totalMemoryInGBs, other.totalMemoryInGBs)
                && java.util.Objects.equals(this.remainingMemoryInGBs, other.remainingMemoryInGBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostShape == null
                                ? 43
                                : this.dedicatedVmHostShape.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingOcpus == null ? 43 : this.remainingOcpus.hashCode());
        result = (result * PRIME) + (this.totalOcpus == null ? 43 : this.totalOcpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryInGBs == null ? 43 : this.totalMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingMemoryInGBs == null
                                ? 43
                                : this.remainingMemoryInGBs.hashCode());
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
