/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Database.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Database {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "characterSet",
        "ncharacterSet",
        "dbHomeId",
        "dbSystemId",
        "vmClusterId",
        "dbName",
        "pdbName",
        "dbWorkload",
        "dbUniqueName",
        "lifecycleDetails",
        "lifecycleState",
        "timeCreated",
        "lastBackupTimestamp",
        "dbBackupConfig",
        "freeformTags",
        "definedTags",
        "connectionStrings",
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "sourceDatabasePointInTimeRecoveryTimestamp",
        "databaseSoftwareImageId",
        "isCdb",
        "databaseManagementConfig",
        "sidPrefix"
    })
    public Database(
            String id,
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbHomeId,
            String dbSystemId,
            String vmClusterId,
            String dbName,
            String pdbName,
            String dbWorkload,
            String dbUniqueName,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date lastBackupTimestamp,
            DbBackupConfig dbBackupConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DatabaseConnectionStrings connectionStrings,
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            java.util.Date sourceDatabasePointInTimeRecoveryTimestamp,
            String databaseSoftwareImageId,
            Boolean isCdb,
            CloudDatabaseManagementConfig databaseManagementConfig,
            String sidPrefix) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.dbHomeId = dbHomeId;
        this.dbSystemId = dbSystemId;
        this.vmClusterId = vmClusterId;
        this.dbName = dbName;
        this.pdbName = pdbName;
        this.dbWorkload = dbWorkload;
        this.dbUniqueName = dbUniqueName;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.lastBackupTimestamp = lastBackupTimestamp;
        this.dbBackupConfig = dbBackupConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.connectionStrings = connectionStrings;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.sourceDatabasePointInTimeRecoveryTimestamp =
                sourceDatabasePointInTimeRecoveryTimestamp;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.isCdb = isCdb;
        this.databaseManagementConfig = databaseManagementConfig;
        this.sidPrefix = sidPrefix;
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private String dbWorkload;

        public Builder dbWorkload(String dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
        private java.util.Date lastBackupTimestamp;

        public Builder lastBackupTimestamp(java.util.Date lastBackupTimestamp) {
            this.lastBackupTimestamp = lastBackupTimestamp;
            this.__explicitlySet__.add("lastBackupTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
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

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private DatabaseConnectionStrings connectionStrings;

        public Builder connectionStrings(DatabaseConnectionStrings connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
        private java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

        public Builder sourceDatabasePointInTimeRecoveryTimestamp(
                java.util.Date sourceDatabasePointInTimeRecoveryTimestamp) {
            this.sourceDatabasePointInTimeRecoveryTimestamp =
                    sourceDatabasePointInTimeRecoveryTimestamp;
            this.__explicitlySet__.add("sourceDatabasePointInTimeRecoveryTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCdb")
        private Boolean isCdb;

        public Builder isCdb(Boolean isCdb) {
            this.isCdb = isCdb;
            this.__explicitlySet__.add("isCdb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private CloudDatabaseManagementConfig databaseManagementConfig;

        public Builder databaseManagementConfig(
                CloudDatabaseManagementConfig databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
        private String sidPrefix;

        public Builder sidPrefix(String sidPrefix) {
            this.sidPrefix = sidPrefix;
            this.__explicitlySet__.add("sidPrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Database build() {
            Database __instance__ =
                    new Database(
                            id,
                            compartmentId,
                            characterSet,
                            ncharacterSet,
                            dbHomeId,
                            dbSystemId,
                            vmClusterId,
                            dbName,
                            pdbName,
                            dbWorkload,
                            dbUniqueName,
                            lifecycleDetails,
                            lifecycleState,
                            timeCreated,
                            lastBackupTimestamp,
                            dbBackupConfig,
                            freeformTags,
                            definedTags,
                            connectionStrings,
                            kmsKeyId,
                            kmsKeyVersionId,
                            vaultId,
                            sourceDatabasePointInTimeRecoveryTimestamp,
                            databaseSoftwareImageId,
                            isCdb,
                            databaseManagementConfig,
                            sidPrefix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Database o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .characterSet(o.getCharacterSet())
                            .ncharacterSet(o.getNcharacterSet())
                            .dbHomeId(o.getDbHomeId())
                            .dbSystemId(o.getDbSystemId())
                            .vmClusterId(o.getVmClusterId())
                            .dbName(o.getDbName())
                            .pdbName(o.getPdbName())
                            .dbWorkload(o.getDbWorkload())
                            .dbUniqueName(o.getDbUniqueName())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .lastBackupTimestamp(o.getLastBackupTimestamp())
                            .dbBackupConfig(o.getDbBackupConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .connectionStrings(o.getConnectionStrings())
                            .kmsKeyId(o.getKmsKeyId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .vaultId(o.getVaultId())
                            .sourceDatabasePointInTimeRecoveryTimestamp(
                                    o.getSourceDatabasePointInTimeRecoveryTimestamp())
                            .databaseSoftwareImageId(o.getDatabaseSoftwareImageId())
                            .isCdb(o.getIsCdb())
                            .databaseManagementConfig(o.getDatabaseManagementConfig())
                            .sidPrefix(o.getSidPrefix());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    public String getDbHomeId() {
        return dbHomeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    public String getVmClusterId() {
        return vmClusterId;
    }

    /**
     * The database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    public String getDbName() {
        return dbName;
    }

    /**
     * The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    private final String pdbName;

    public String getPdbName() {
        return pdbName;
    }

    /**
     * The database workload type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final String dbWorkload;

    public String getDbWorkload() {
        return dbWorkload;
    }

    /**
     * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard group (a primary database and its standby databases). The unique name cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The current state of the database.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Upgrading("UPGRADING"),
        Converting("CONVERTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        RestoreFailed("RESTORE_FAILED"),
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
     * The current state of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the latest database backup was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
    private final java.util.Date lastBackupTimestamp;

    public java.util.Date getLastBackupTimestamp() {
        return lastBackupTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DbBackupConfig dbBackupConfig;

    public DbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
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
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The Connection strings used to connect to the Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final DatabaseConnectionStrings connectionStrings;

    public DatabaseConnectionStrings getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    public String getVaultId() {
        return vaultId;
    }

    /**
     * Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
    private final java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

    public java.util.Date getSourceDatabasePointInTimeRecoveryTimestamp() {
        return sourceDatabasePointInTimeRecoveryTimestamp;
    }

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /**
     * True if the database is a container database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCdb")
    private final Boolean isCdb;

    public Boolean getIsCdb() {
        return isCdb;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    private final CloudDatabaseManagementConfig databaseManagementConfig;

    public CloudDatabaseManagementConfig getDatabaseManagementConfig() {
        return databaseManagementConfig;
    }

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
    private final String sidPrefix;

    public String getSidPrefix() {
        return sidPrefix;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Database(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", pdbName=").append(String.valueOf(this.pdbName));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lastBackupTimestamp=").append(String.valueOf(this.lastBackupTimestamp));
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", sourceDatabasePointInTimeRecoveryTimestamp=")
                .append(String.valueOf(this.sourceDatabasePointInTimeRecoveryTimestamp));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", isCdb=").append(String.valueOf(this.isCdb));
        sb.append(", databaseManagementConfig=")
                .append(String.valueOf(this.databaseManagementConfig));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Database)) {
            return false;
        }

        Database other = (Database) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.pdbName, other.pdbName)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lastBackupTimestamp, other.lastBackupTimestamp)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.sourceDatabasePointInTimeRecoveryTimestamp,
                        other.sourceDatabasePointInTimeRecoveryTimestamp)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.isCdb, other.isCdb)
                && java.util.Objects.equals(
                        this.databaseManagementConfig, other.databaseManagementConfig)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.pdbName == null ? 43 : this.pdbName.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lastBackupTimestamp == null
                                ? 43
                                : this.lastBackupTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabasePointInTimeRecoveryTimestamp == null
                                ? 43
                                : this.sourceDatabasePointInTimeRecoveryTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result = (result * PRIME) + (this.isCdb == null ? 43 : this.isCdb.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConfig == null
                                ? 43
                                : this.databaseManagementConfig.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
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
