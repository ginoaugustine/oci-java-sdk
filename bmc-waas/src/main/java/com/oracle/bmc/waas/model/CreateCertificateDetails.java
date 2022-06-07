/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The data used to create a new SSL certificate.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCertificateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCertificateDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "certificateData",
        "privateKeyData",
        "isTrustVerificationDisabled",
        "freeformTags",
        "definedTags"
    })
    public CreateCertificateDetails(
            String compartmentId,
            String displayName,
            String certificateData,
            String privateKeyData,
            Boolean isTrustVerificationDisabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.certificateData = certificateData;
        this.privateKeyData = privateKeyData;
        this.isTrustVerificationDisabled = isTrustVerificationDisabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
        private String certificateData;

        public Builder certificateData(String certificateData) {
            this.certificateData = certificateData;
            this.__explicitlySet__.add("certificateData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyData")
        private String privateKeyData;

        public Builder privateKeyData(String privateKeyData) {
            this.privateKeyData = privateKeyData;
            this.__explicitlySet__.add("privateKeyData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
        private Boolean isTrustVerificationDisabled;

        public Builder isTrustVerificationDisabled(Boolean isTrustVerificationDisabled) {
            this.isTrustVerificationDisabled = isTrustVerificationDisabled;
            this.__explicitlySet__.add("isTrustVerificationDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCertificateDetails build() {
            CreateCertificateDetails __instance__ =
                    new CreateCertificateDetails(
                            compartmentId,
                            displayName,
                            certificateData,
                            privateKeyData,
                            isTrustVerificationDisabled,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .certificateData(o.getCertificateData())
                            .privateKeyData(o.getPrivateKeyData())
                            .isTrustVerificationDisabled(o.getIsTrustVerificationDisabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to create the SSL certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the SSL certificate. The name can be changed and does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The data of the SSL certificate.
     * <p>
     *
     * **Note:** Many SSL certificate providers require an intermediate certificate chain to ensure a trusted status.
     * If your SSL certificate requires an intermediate certificate chain, please append the intermediate certificate
     * key in the {@code certificateData} field after the leaf certificate issued by the SSL certificate provider. If you
     * are unsure if your certificate requires an intermediate certificate chain, see your certificate
     * provider's documentation.
     * <p>
     *
     * The example below shows an intermediate certificate appended to a leaf certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
    private final String certificateData;

    public String getCertificateData() {
        return certificateData;
    }

    /**
     * The private key of the SSL certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyData")
    private final String privateKeyData;

    public String getPrivateKeyData() {
        return privateKeyData;
    }

    /**
     * Set to {@code true} if the SSL certificate is self-signed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
    private final Boolean isTrustVerificationDisabled;

    public Boolean getIsTrustVerificationDisabled() {
        return isTrustVerificationDisabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateCertificateDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", certificateData=").append(String.valueOf(this.certificateData));
        sb.append(", privateKeyData=").append(String.valueOf(this.privateKeyData));
        sb.append(", isTrustVerificationDisabled=")
                .append(String.valueOf(this.isTrustVerificationDisabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateDetails)) {
            return false;
        }

        CreateCertificateDetails other = (CreateCertificateDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.certificateData, other.certificateData)
                && java.util.Objects.equals(this.privateKeyData, other.privateKeyData)
                && java.util.Objects.equals(
                        this.isTrustVerificationDisabled, other.isTrustVerificationDisabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateData == null ? 43 : this.certificateData.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyData == null ? 43 : this.privateKeyData.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrustVerificationDisabled == null
                                ? 43
                                : this.isTrustVerificationDisabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
