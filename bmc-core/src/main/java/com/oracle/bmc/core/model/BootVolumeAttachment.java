/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents an attachment between a boot volume and an instance.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
    builder = BootVolumeAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BootVolumeAttachment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "bootVolumeId",
        "compartmentId",
        "displayName",
        "id",
        "instanceId",
        "lifecycleState",
        "timeCreated",
        "isPvEncryptionInTransitEnabled",
        "encryptionInTransitType"
    })
    public BootVolumeAttachment(
            String availabilityDomain,
            String bootVolumeId,
            String compartmentId,
            String displayName,
            String id,
            String instanceId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            Boolean isPvEncryptionInTransitEnabled,
            EncryptionInTransitType encryptionInTransitType) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.bootVolumeId = bootVolumeId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.instanceId = instanceId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.encryptionInTransitType = encryptionInTransitType;
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

        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
        private String bootVolumeId;

        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = bootVolumeId;
            this.__explicitlySet__.add("bootVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
        private EncryptionInTransitType encryptionInTransitType;

        public Builder encryptionInTransitType(EncryptionInTransitType encryptionInTransitType) {
            this.encryptionInTransitType = encryptionInTransitType;
            this.__explicitlySet__.add("encryptionInTransitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BootVolumeAttachment build() {
            BootVolumeAttachment __instance__ =
                    new BootVolumeAttachment(
                            availabilityDomain,
                            bootVolumeId,
                            compartmentId,
                            displayName,
                            id,
                            instanceId,
                            lifecycleState,
                            timeCreated,
                            isPvEncryptionInTransitEnabled,
                            encryptionInTransitType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BootVolumeAttachment o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .bootVolumeId(o.getBootVolumeId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .instanceId(o.getInstanceId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled())
                            .encryptionInTransitType(o.getEncryptionInTransitType());

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
     * The availability domain of an instance.
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
     * The OCID of the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
    private final String bootVolumeId;

    public String getBootVolumeId() {
        return bootVolumeId;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
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
     * The OCID of the boot volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the instance the boot volume is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The current state of the boot volume attachment.
     **/
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

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
     * The current state of the boot volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the boot volume was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
     * Whether in-transit encryption for the boot volume's paravirtualized attachment is enabled or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    /**
     * Refer the top-level definition of encryptionInTransitType.
     * The default value is NONE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
    private final EncryptionInTransitType encryptionInTransitType;

    public EncryptionInTransitType getEncryptionInTransitType() {
        return encryptionInTransitType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BootVolumeAttachment(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", bootVolumeId=").append(String.valueOf(this.bootVolumeId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", encryptionInTransitType=")
                .append(String.valueOf(this.encryptionInTransitType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BootVolumeAttachment)) {
            return false;
        }

        BootVolumeAttachment other = (BootVolumeAttachment) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.bootVolumeId, other.bootVolumeId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(
                        this.encryptionInTransitType, other.encryptionInTransitType)
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
        result = (result * PRIME) + (this.bootVolumeId == null ? 43 : this.bootVolumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionInTransitType == null
                                ? 43
                                : this.encryptionInTransitType.hashCode());
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
