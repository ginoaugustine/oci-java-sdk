/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the required parameters for the creation of an Autonomous Container Database.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAutonomousContainerDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateAutonomousContainerDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
        private ServiceLevelAgreementType serviceLevelAgreementType;

        public Builder serviceLevelAgreementType(
                ServiceLevelAgreementType serviceLevelAgreementType) {
            this.serviceLevelAgreementType = serviceLevelAgreementType;
            this.__explicitlySet__.add("serviceLevelAgreementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
        private String autonomousExadataInfrastructureId;

        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            this.__explicitlySet__.add("autonomousExadataInfrastructureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

        public Builder patchModel(PatchModel patchModel) {
            this.patchModel = patchModel;
            this.__explicitlySet__.add("patchModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousContainerDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousContainerDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousContainerDatabaseDetails build() {
            CreateAutonomousContainerDatabaseDetails __instance__ =
                    new CreateAutonomousContainerDatabaseDetails(
                            displayName,
                            dbUniqueName,
                            serviceLevelAgreementType,
                            autonomousExadataInfrastructureId,
                            autonomousVmClusterId,
                            compartmentId,
                            patchModel,
                            maintenanceWindowDetails,
                            freeformTags,
                            definedTags,
                            backupConfig,
                            kmsKeyId,
                            kmsKeyVersionId,
                            vaultId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousContainerDatabaseDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .dbUniqueName(o.getDbUniqueName())
                            .serviceLevelAgreementType(o.getServiceLevelAgreementType())
                            .autonomousExadataInfrastructureId(
                                    o.getAutonomousExadataInfrastructureId())
                            .autonomousVmClusterId(o.getAutonomousVmClusterId())
                            .compartmentId(o.getCompartmentId())
                            .patchModel(o.getPatchModel())
                            .maintenanceWindowDetails(o.getMaintenanceWindowDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .backupConfig(o.getBackupConfig())
                            .kmsKeyId(o.getKmsKeyId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .vaultId(o.getVaultId());

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

    /**
     * The display name for the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The `DB_UNIQUE_NAME` of the Oracle Database being backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    String dbUniqueName;
    /**
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     **/
    public enum ServiceLevelAgreementType {
        Standard("STANDARD"),
        ;

        private final String value;
        private static java.util.Map<String, ServiceLevelAgreementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceLevelAgreementType v : ServiceLevelAgreementType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ServiceLevelAgreementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceLevelAgreementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ServiceLevelAgreementType: " + key);
        }
    };
    /**
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
    ServiceLevelAgreementType serviceLevelAgreementType;

    /**
     * The OCID of the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
    String autonomousExadataInfrastructureId;

    /**
     * The OCID of the Autonomous VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    String autonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
    /**
     * Database Patch model preference.
     **/
    public enum PatchModel {
        ReleaseUpdates("RELEASE_UPDATES"),
        ReleaseUpdateRevisions("RELEASE_UPDATE_REVISIONS"),
        ;

        private final String value;
        private static java.util.Map<String, PatchModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchModel v : PatchModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        PatchModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PatchModel: " + key);
        }
    };
    /**
     * Database Patch model preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    PatchModel patchModel;

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    MaintenanceWindow maintenanceWindowDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    AutonomousContainerDatabaseBackupConfig backupConfig;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    String kmsKeyVersionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    String vaultId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
