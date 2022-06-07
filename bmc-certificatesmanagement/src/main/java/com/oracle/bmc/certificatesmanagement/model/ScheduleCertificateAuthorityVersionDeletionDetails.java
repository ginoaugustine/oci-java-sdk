/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the request to schedule the deletion of the specified certificate authority (CA) version.
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
    builder = ScheduleCertificateAuthorityVersionDeletionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduleCertificateAuthorityVersionDeletionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"timeOfDeletion"})
    public ScheduleCertificateAuthorityVersionDeletionDetails(java.util.Date timeOfDeletion) {
        super();
        this.timeOfDeletion = timeOfDeletion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleCertificateAuthorityVersionDeletionDetails build() {
            ScheduleCertificateAuthorityVersionDeletionDetails __instance__ =
                    new ScheduleCertificateAuthorityVersionDeletionDetails(timeOfDeletion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleCertificateAuthorityVersionDeletionDetails o) {
            Builder copiedBuilder = timeOfDeletion(o.getTimeOfDeletion());

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
     * An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScheduleCertificateAuthorityVersionDeletionDetails(");
        sb.append("timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleCertificateAuthorityVersionDeletionDetails)) {
            return false;
        }

        ScheduleCertificateAuthorityVersionDeletionDetails other =
                (ScheduleCertificateAuthorityVersionDeletionDetails) o;
        return java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
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
