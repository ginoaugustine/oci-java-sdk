/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Condensed instance data when listing instances in a compute capacity reservation.
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
    builder = CapacityReservationInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CapacityReservationInstanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "availabilityDomain",
        "compartmentId",
        "faultDomain",
        "shapeConfig",
        "shape"
    })
    public CapacityReservationInstanceSummary(
            String id,
            String availabilityDomain,
            String compartmentId,
            String faultDomain,
            InstanceReservationShapeConfigDetails shapeConfig,
            String shape) {
        super();
        this.id = id;
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.faultDomain = faultDomain;
        this.shapeConfig = shapeConfig;
        this.shape = shape;
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

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private InstanceReservationShapeConfigDetails shapeConfig;

        public Builder shapeConfig(InstanceReservationShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CapacityReservationInstanceSummary build() {
            CapacityReservationInstanceSummary __instance__ =
                    new CapacityReservationInstanceSummary(
                            id, availabilityDomain, compartmentId, faultDomain, shapeConfig, shape);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CapacityReservationInstanceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .faultDomain(o.getFaultDomain())
                            .shapeConfig(o.getShapeConfig())
                            .shape(o.getShape());

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
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The availability domain the instance is running in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment that contains the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The fault domain the instance is running in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    public String getFaultDomain() {
        return faultDomain;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final InstanceReservationShapeConfigDetails shapeConfig;

    public InstanceReservationShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    /**
     * The shape of the instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listComputeCapacityReservationInstanceShapes(ListComputeCapacityReservationInstanceShapesRequest) listComputeCapacityReservationInstanceShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CapacityReservationInstanceSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityReservationInstanceSummary)) {
            return false;
        }

        CapacityReservationInstanceSummary other = (CapacityReservationInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
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
