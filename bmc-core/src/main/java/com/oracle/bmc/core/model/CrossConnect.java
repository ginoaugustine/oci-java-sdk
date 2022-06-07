/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. A cross-connect represents a
 * physical connection between an existing network and Oracle. Customers who are colocated
 * with Oracle in a FastConnect location create and use cross-connects. For more
 * information, see [FastConnect Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
 * <p>
 * Oracle recommends you create each cross-connect in a
 * {@link CrossConnectGroup} so you can use link aggregation
 * with the connection.
 * <p>
 **Note:** If you're a provider who is setting up a physical connection to Oracle so customers
 * can use FastConnect over the connection, be aware that your connection is modeled the
 * same way as a colocated customer's (with {@code CrossConnect} and {@code CrossConnectGroup} objects, and so on).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CrossConnect.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CrossConnect {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "crossConnectGroupId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleState",
        "locationName",
        "portName",
        "portSpeedShapeName",
        "customerReferenceName",
        "timeCreated",
        "macsecProperties",
        "ociPhysicalDeviceName",
        "ociLogicalDeviceName"
    })
    public CrossConnect(
            String compartmentId,
            String crossConnectGroupId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            String locationName,
            String portName,
            String portSpeedShapeName,
            String customerReferenceName,
            java.util.Date timeCreated,
            MacsecProperties macsecProperties,
            String ociPhysicalDeviceName,
            String ociLogicalDeviceName) {
        super();
        this.compartmentId = compartmentId;
        this.crossConnectGroupId = crossConnectGroupId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.locationName = locationName;
        this.portName = portName;
        this.portSpeedShapeName = portSpeedShapeName;
        this.customerReferenceName = customerReferenceName;
        this.timeCreated = timeCreated;
        this.macsecProperties = macsecProperties;
        this.ociPhysicalDeviceName = ociPhysicalDeviceName;
        this.ociLogicalDeviceName = ociLogicalDeviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            this.__explicitlySet__.add("crossConnectGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        public Builder locationName(String locationName) {
            this.locationName = locationName;
            this.__explicitlySet__.add("locationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portName")
        private String portName;

        public Builder portName(String portName) {
            this.portName = portName;
            this.__explicitlySet__.add("portName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        public Builder portSpeedShapeName(String portSpeedShapeName) {
            this.portSpeedShapeName = portSpeedShapeName;
            this.__explicitlySet__.add("portSpeedShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
        private MacsecProperties macsecProperties;

        public Builder macsecProperties(MacsecProperties macsecProperties) {
            this.macsecProperties = macsecProperties;
            this.__explicitlySet__.add("macsecProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ociPhysicalDeviceName")
        private String ociPhysicalDeviceName;

        public Builder ociPhysicalDeviceName(String ociPhysicalDeviceName) {
            this.ociPhysicalDeviceName = ociPhysicalDeviceName;
            this.__explicitlySet__.add("ociPhysicalDeviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
        private String ociLogicalDeviceName;

        public Builder ociLogicalDeviceName(String ociLogicalDeviceName) {
            this.ociLogicalDeviceName = ociLogicalDeviceName;
            this.__explicitlySet__.add("ociLogicalDeviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnect build() {
            CrossConnect __instance__ =
                    new CrossConnect(
                            compartmentId,
                            crossConnectGroupId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            locationName,
                            portName,
                            portSpeedShapeName,
                            customerReferenceName,
                            timeCreated,
                            macsecProperties,
                            ociPhysicalDeviceName,
                            ociLogicalDeviceName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnect o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .crossConnectGroupId(o.getCrossConnectGroupId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .locationName(o.getLocationName())
                            .portName(o.getPortName())
                            .portSpeedShapeName(o.getPortSpeedShapeName())
                            .customerReferenceName(o.getCustomerReferenceName())
                            .timeCreated(o.getTimeCreated())
                            .macsecProperties(o.getMacsecProperties())
                            .ociPhysicalDeviceName(o.getOciPhysicalDeviceName())
                            .ociLogicalDeviceName(o.getOciLogicalDeviceName());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the cross-connect group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect group this cross-connect belongs to (if any).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    private final String crossConnectGroupId;

    public String getCrossConnectGroupId() {
        return crossConnectGroupId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The cross-connect's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The cross-connect's current state.
     **/
    public enum LifecycleState {
        PendingCustomer("PENDING_CUSTOMER"),
        Provisioning("PROVISIONING"),
        Provisioned("PROVISIONED"),
        Inactive("INACTIVE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The cross-connect's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The name of the FastConnect location where this cross-connect is installed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locationName")
    private final String locationName;

    public String getLocationName() {
        return locationName;
    }

    /**
     * A string identifying the meet-me room port for this cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portName")
    private final String portName;

    public String getPortName() {
        return portName;
    }

    /**
     * The port speed for this cross-connect.
     * <p>
     * Example: {@code 10 Gbps}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    private final String portSpeedShapeName;

    public String getPortSpeedShapeName() {
        return portSpeedShapeName;
    }

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    private final String customerReferenceName;

    public String getCustomerReferenceName() {
        return customerReferenceName;
    }

    /**
     * The date and time the cross-connect was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
    private final MacsecProperties macsecProperties;

    public MacsecProperties getMacsecProperties() {
        return macsecProperties;
    }

    /**
     * The FastConnect device that terminates the physical connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociPhysicalDeviceName")
    private final String ociPhysicalDeviceName;

    public String getOciPhysicalDeviceName() {
        return ociPhysicalDeviceName;
    }

    /**
     * The FastConnect device that terminates the logical connection.
     * This device might be different than the device that terminates the physical connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
    private final String ociLogicalDeviceName;

    public String getOciLogicalDeviceName() {
        return ociLogicalDeviceName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CrossConnect(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", crossConnectGroupId=").append(String.valueOf(this.crossConnectGroupId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", locationName=").append(String.valueOf(this.locationName));
        sb.append(", portName=").append(String.valueOf(this.portName));
        sb.append(", portSpeedShapeName=").append(String.valueOf(this.portSpeedShapeName));
        sb.append(", customerReferenceName=").append(String.valueOf(this.customerReferenceName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", macsecProperties=").append(String.valueOf(this.macsecProperties));
        sb.append(", ociPhysicalDeviceName=").append(String.valueOf(this.ociPhysicalDeviceName));
        sb.append(", ociLogicalDeviceName=").append(String.valueOf(this.ociLogicalDeviceName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnect)) {
            return false;
        }

        CrossConnect other = (CrossConnect) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.crossConnectGroupId, other.crossConnectGroupId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.locationName, other.locationName)
                && java.util.Objects.equals(this.portName, other.portName)
                && java.util.Objects.equals(this.portSpeedShapeName, other.portSpeedShapeName)
                && java.util.Objects.equals(this.customerReferenceName, other.customerReferenceName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.macsecProperties, other.macsecProperties)
                && java.util.Objects.equals(this.ociPhysicalDeviceName, other.ociPhysicalDeviceName)
                && java.util.Objects.equals(this.ociLogicalDeviceName, other.ociLogicalDeviceName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectGroupId == null
                                ? 43
                                : this.crossConnectGroupId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.locationName == null ? 43 : this.locationName.hashCode());
        result = (result * PRIME) + (this.portName == null ? 43 : this.portName.hashCode());
        result =
                (result * PRIME)
                        + (this.portSpeedShapeName == null
                                ? 43
                                : this.portSpeedShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReferenceName == null
                                ? 43
                                : this.customerReferenceName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.macsecProperties == null ? 43 : this.macsecProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.ociPhysicalDeviceName == null
                                ? 43
                                : this.ociPhysicalDeviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.ociLogicalDeviceName == null
                                ? 43
                                : this.ociLogicalDeviceName.hashCode());
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
