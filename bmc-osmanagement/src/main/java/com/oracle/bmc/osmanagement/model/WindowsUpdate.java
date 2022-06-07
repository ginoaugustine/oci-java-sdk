/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An update available for a Windows managed instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WindowsUpdate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WindowsUpdate {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "name",
        "description",
        "updateType",
        "sizeInBytes",
        "isEligibleForInstallation",
        "installationRequirements",
        "isRebootRequiredForInstallation",
        "kbArticleIds"
    })
    public WindowsUpdate(
            String displayName,
            String name,
            String description,
            UpdateTypes updateType,
            Long sizeInBytes,
            IsEligibleForInstallation isEligibleForInstallation,
            java.util.List<InstallationRequirements> installationRequirements,
            Boolean isRebootRequiredForInstallation,
            java.util.List<String> kbArticleIds) {
        super();
        this.displayName = displayName;
        this.name = name;
        this.description = description;
        this.updateType = updateType;
        this.sizeInBytes = sizeInBytes;
        this.isEligibleForInstallation = isEligibleForInstallation;
        this.installationRequirements = installationRequirements;
        this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
        this.kbArticleIds = kbArticleIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateTypes updateType;

        public Builder updateType(UpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
        private IsEligibleForInstallation isEligibleForInstallation;

        public Builder isEligibleForInstallation(
                IsEligibleForInstallation isEligibleForInstallation) {
            this.isEligibleForInstallation = isEligibleForInstallation;
            this.__explicitlySet__.add("isEligibleForInstallation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
        private java.util.List<InstallationRequirements> installationRequirements;

        public Builder installationRequirements(
                java.util.List<InstallationRequirements> installationRequirements) {
            this.installationRequirements = installationRequirements;
            this.__explicitlySet__.add("installationRequirements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
        private Boolean isRebootRequiredForInstallation;

        public Builder isRebootRequiredForInstallation(Boolean isRebootRequiredForInstallation) {
            this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
            this.__explicitlySet__.add("isRebootRequiredForInstallation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
        private java.util.List<String> kbArticleIds;

        public Builder kbArticleIds(java.util.List<String> kbArticleIds) {
            this.kbArticleIds = kbArticleIds;
            this.__explicitlySet__.add("kbArticleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WindowsUpdate build() {
            WindowsUpdate __instance__ =
                    new WindowsUpdate(
                            displayName,
                            name,
                            description,
                            updateType,
                            sizeInBytes,
                            isEligibleForInstallation,
                            installationRequirements,
                            isRebootRequiredForInstallation,
                            kbArticleIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WindowsUpdate o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .name(o.getName())
                            .description(o.getDescription())
                            .updateType(o.getUpdateType())
                            .sizeInBytes(o.getSizeInBytes())
                            .isEligibleForInstallation(o.getIsEligibleForInstallation())
                            .installationRequirements(o.getInstallationRequirements())
                            .isRebootRequiredForInstallation(o.getIsRebootRequiredForInstallation())
                            .kbArticleIds(o.getKbArticleIds());

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
     * Windows Update name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Unique identifier for the Windows update. NOTE - This is not an OCID,
     * but is a unique identifier assigned by Microsoft.
     * Example: {@code 6981d463-cd91-4a26-b7c4-ea4ded9183ed}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Information about the Windows Update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The purpose of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateTypes updateType;

    public UpdateTypes getUpdateType() {
        return updateType;
    }

    /**
     * size of the package in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Indicates whether the update can be installed using OSMS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
    private final IsEligibleForInstallation isEligibleForInstallation;

    public IsEligibleForInstallation getIsEligibleForInstallation() {
        return isEligibleForInstallation;
    }

    /**
     **/
    public enum InstallationRequirements {
        EulaAcceptanceRequired("EULA_ACCEPTANCE_REQUIRED"),
        SoftwareMediaRequired("SOFTWARE_MEDIA_REQUIRED"),
        UserInteractionRequired("USER_INTERACTION_REQUIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InstallationRequirements.class);

        private final String value;
        private static java.util.Map<String, InstallationRequirements> map;

        static {
            map = new java.util.HashMap<>();
            for (InstallationRequirements v : InstallationRequirements.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstallationRequirements(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstallationRequirements create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstallationRequirements', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * List of requirements forinstalling on a managed instances
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
    private final java.util.List<InstallationRequirements> installationRequirements;

    public java.util.List<InstallationRequirements> getInstallationRequirements() {
        return installationRequirements;
    }

    /**
     * Indicates whether a reboot may be required to complete installation of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
    private final Boolean isRebootRequiredForInstallation;

    public Boolean getIsRebootRequiredForInstallation() {
        return isRebootRequiredForInstallation;
    }

    /**
     * List of the Microsoft Knowledge Base Article Ids related to this Windows Update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
    private final java.util.List<String> kbArticleIds;

    public java.util.List<String> getKbArticleIds() {
        return kbArticleIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WindowsUpdate(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", isEligibleForInstallation=")
                .append(String.valueOf(this.isEligibleForInstallation));
        sb.append(", installationRequirements=")
                .append(String.valueOf(this.installationRequirements));
        sb.append(", isRebootRequiredForInstallation=")
                .append(String.valueOf(this.isRebootRequiredForInstallation));
        sb.append(", kbArticleIds=").append(String.valueOf(this.kbArticleIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WindowsUpdate)) {
            return false;
        }

        WindowsUpdate other = (WindowsUpdate) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(
                        this.isEligibleForInstallation, other.isEligibleForInstallation)
                && java.util.Objects.equals(
                        this.installationRequirements, other.installationRequirements)
                && java.util.Objects.equals(
                        this.isRebootRequiredForInstallation, other.isRebootRequiredForInstallation)
                && java.util.Objects.equals(this.kbArticleIds, other.kbArticleIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.isEligibleForInstallation == null
                                ? 43
                                : this.isEligibleForInstallation.hashCode());
        result =
                (result * PRIME)
                        + (this.installationRequirements == null
                                ? 43
                                : this.installationRequirements.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequiredForInstallation == null
                                ? 43
                                : this.isRebootRequiredForInstallation.hashCode());
        result = (result * PRIME) + (this.kbArticleIds == null ? 43 : this.kbArticleIds.hashCode());
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
