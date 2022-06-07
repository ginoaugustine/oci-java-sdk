/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the association.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssociationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssociationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "timeCreated",
        "lifecycleState",
        "certificatesResourceId",
        "associatedResourceId",
        "compartmentId",
        "associationType"
    })
    public AssociationSummary(
            String id,
            String name,
            java.util.Date timeCreated,
            AssociationLifecycleState lifecycleState,
            String certificatesResourceId,
            String associatedResourceId,
            String compartmentId,
            AssociationType associationType) {
        super();
        this.id = id;
        this.name = name;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.certificatesResourceId = certificatesResourceId;
        this.associatedResourceId = associatedResourceId;
        this.compartmentId = compartmentId;
        this.associationType = associationType;
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssociationLifecycleState lifecycleState;

        public Builder lifecycleState(AssociationLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificatesResourceId")
        private String certificatesResourceId;

        public Builder certificatesResourceId(String certificatesResourceId) {
            this.certificatesResourceId = certificatesResourceId;
            this.__explicitlySet__.add("certificatesResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
        private String associatedResourceId;

        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            this.__explicitlySet__.add("associatedResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private AssociationType associationType;

        public Builder associationType(AssociationType associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociationSummary build() {
            AssociationSummary __instance__ =
                    new AssociationSummary(
                            id,
                            name,
                            timeCreated,
                            lifecycleState,
                            certificatesResourceId,
                            associatedResourceId,
                            compartmentId,
                            associationType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .certificatesResourceId(o.getCertificatesResourceId())
                            .associatedResourceId(o.getAssociatedResourceId())
                            .compartmentId(o.getCompartmentId())
                            .associationType(o.getAssociationType());

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
     * The OCID of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * A user-friendly name generated by the service for the association. Name format follows the pattern [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current lifecycle state of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AssociationLifecycleState lifecycleState;

    public AssociationLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatesResourceId")
    private final String certificatesResourceId;

    public String getCertificatesResourceId() {
        return certificatesResourceId;
    }

    /**
     * The OCID of the associated resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
    private final String associatedResourceId;

    public String getAssociatedResourceId() {
        return associatedResourceId;
    }

    /**
     * The compartment OCID of the association. This is strongly tied to the compartment OCID of the certificate-related resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final AssociationType associationType;

    public AssociationType getAssociationType() {
        return associationType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AssociationSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", certificatesResourceId=").append(String.valueOf(this.certificatesResourceId));
        sb.append(", associatedResourceId=").append(String.valueOf(this.associatedResourceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociationSummary)) {
            return false;
        }

        AssociationSummary other = (AssociationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.certificatesResourceId, other.certificatesResourceId)
                && java.util.Objects.equals(this.associatedResourceId, other.associatedResourceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatesResourceId == null
                                ? 43
                                : this.certificatesResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceId == null
                                ? 43
                                : this.associatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
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
