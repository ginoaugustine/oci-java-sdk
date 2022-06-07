/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of a role fetched from the database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoleSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "roleName",
        "authenticationType",
        "isPasswordRequired",
        "isCommon",
        "isOracleMaintained",
        "isInherited",
        "isImplicit"
    })
    public RoleSummary(
            String roleName,
            String authenticationType,
            Boolean isPasswordRequired,
            Boolean isCommon,
            Boolean isOracleMaintained,
            Boolean isInherited,
            Boolean isImplicit) {
        super();
        this.roleName = roleName;
        this.authenticationType = authenticationType;
        this.isPasswordRequired = isPasswordRequired;
        this.isCommon = isCommon;
        this.isOracleMaintained = isOracleMaintained;
        this.isInherited = isInherited;
        this.isImplicit = isImplicit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("roleName")
        private String roleName;

        public Builder roleName(String roleName) {
            this.roleName = roleName;
            this.__explicitlySet__.add("roleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private String authenticationType;

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPasswordRequired")
        private Boolean isPasswordRequired;

        public Builder isPasswordRequired(Boolean isPasswordRequired) {
            this.isPasswordRequired = isPasswordRequired;
            this.__explicitlySet__.add("isPasswordRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCommon")
        private Boolean isCommon;

        public Builder isCommon(Boolean isCommon) {
            this.isCommon = isCommon;
            this.__explicitlySet__.add("isCommon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
        private Boolean isOracleMaintained;

        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = isOracleMaintained;
            this.__explicitlySet__.add("isOracleMaintained");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
        private Boolean isInherited;

        public Builder isInherited(Boolean isInherited) {
            this.isInherited = isInherited;
            this.__explicitlySet__.add("isInherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
        private Boolean isImplicit;

        public Builder isImplicit(Boolean isImplicit) {
            this.isImplicit = isImplicit;
            this.__explicitlySet__.add("isImplicit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoleSummary build() {
            RoleSummary __instance__ =
                    new RoleSummary(
                            roleName,
                            authenticationType,
                            isPasswordRequired,
                            isCommon,
                            isOracleMaintained,
                            isInherited,
                            isImplicit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleSummary o) {
            Builder copiedBuilder =
                    roleName(o.getRoleName())
                            .authenticationType(o.getAuthenticationType())
                            .isPasswordRequired(o.getIsPasswordRequired())
                            .isCommon(o.getIsCommon())
                            .isOracleMaintained(o.getIsOracleMaintained())
                            .isInherited(o.getIsInherited())
                            .isImplicit(o.getIsImplicit());

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
     * Name of the role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roleName")
    private final String roleName;

    public String getRoleName() {
        return roleName;
    }

    /**
     * Type of authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final String authenticationType;

    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Is password required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPasswordRequired")
    private final Boolean isPasswordRequired;

    public Boolean getIsPasswordRequired() {
        return isPasswordRequired;
    }

    /**
     * Is the role common.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCommon")
    private final Boolean isCommon;

    public Boolean getIsCommon() {
        return isCommon;
    }

    /**
     * Is the role oracle maintained.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleMaintained")
    private final Boolean isOracleMaintained;

    public Boolean getIsOracleMaintained() {
        return isOracleMaintained;
    }

    /**
     * Is the role inherited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
    private final Boolean isInherited;

    public Boolean getIsInherited() {
        return isInherited;
    }

    /**
     * Is the role implicit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
    private final Boolean isImplicit;

    public Boolean getIsImplicit() {
        return isImplicit;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RoleSummary(");
        sb.append("roleName=").append(String.valueOf(this.roleName));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", isPasswordRequired=").append(String.valueOf(this.isPasswordRequired));
        sb.append(", isCommon=").append(String.valueOf(this.isCommon));
        sb.append(", isOracleMaintained=").append(String.valueOf(this.isOracleMaintained));
        sb.append(", isInherited=").append(String.valueOf(this.isInherited));
        sb.append(", isImplicit=").append(String.valueOf(this.isImplicit));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleSummary)) {
            return false;
        }

        RoleSummary other = (RoleSummary) o;
        return java.util.Objects.equals(this.roleName, other.roleName)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.isPasswordRequired, other.isPasswordRequired)
                && java.util.Objects.equals(this.isCommon, other.isCommon)
                && java.util.Objects.equals(this.isOracleMaintained, other.isOracleMaintained)
                && java.util.Objects.equals(this.isInherited, other.isInherited)
                && java.util.Objects.equals(this.isImplicit, other.isImplicit)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.roleName == null ? 43 : this.roleName.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result =
                (result * PRIME)
                        + (this.isPasswordRequired == null
                                ? 43
                                : this.isPasswordRequired.hashCode());
        result = (result * PRIME) + (this.isCommon == null ? 43 : this.isCommon.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleMaintained == null
                                ? 43
                                : this.isOracleMaintained.hashCode());
        result = (result * PRIME) + (this.isInherited == null ? 43 : this.isInherited.hashCode());
        result = (result * PRIME) + (this.isImplicit == null ? 43 : this.isImplicit.hashCode());
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
