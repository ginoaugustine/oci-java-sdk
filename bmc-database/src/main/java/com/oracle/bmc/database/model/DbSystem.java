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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystem {
    @Deprecated
    @java.beans.ConstructorProperties({
        "iormConfigCache",
        "id",
        "compartmentId",
        "displayName",
        "availabilityDomain",
        "faultDomains",
        "subnetId",
        "backupSubnetId",
        "nsgIds",
        "backupNetworkNsgIds",
        "memorySizeInGBs",
        "storageVolumePerformanceMode",
        "shape",
        "dbSystemOptions",
        "sshPublicKeys",
        "timeZone",
        "hostname",
        "domain",
        "kmsKeyId",
        "version",
        "cpuCoreCount",
        "clusterName",
        "dataStoragePercentage",
        "databaseEdition",
        "lastPatchHistoryEntryId",
        "listenerPort",
        "lifecycleState",
        "timeCreated",
        "lifecycleDetails",
        "diskRedundancy",
        "sparseDiskgroup",
        "scanIpIds",
        "vipIds",
        "scanDnsRecordId",
        "scanDnsName",
        "zoneId",
        "dataStorageSizeInGBs",
        "recoStorageSizeInGB",
        "nodeCount",
        "licenseModel",
        "maintenanceWindow",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "freeformTags",
        "definedTags",
        "sourceDbSystemId",
        "pointInTimeDataDiskCloneTimestamp"
    })
    public DbSystem(
            ExadataIormConfig iormConfigCache,
            String id,
            String compartmentId,
            String displayName,
            String availabilityDomain,
            java.util.List<String> faultDomains,
            String subnetId,
            String backupSubnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            Integer memorySizeInGBs,
            StorageVolumePerformanceMode storageVolumePerformanceMode,
            String shape,
            DbSystemOptions dbSystemOptions,
            java.util.List<String> sshPublicKeys,
            String timeZone,
            String hostname,
            String domain,
            String kmsKeyId,
            String version,
            Integer cpuCoreCount,
            String clusterName,
            Integer dataStoragePercentage,
            DatabaseEdition databaseEdition,
            String lastPatchHistoryEntryId,
            Integer listenerPort,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String lifecycleDetails,
            DiskRedundancy diskRedundancy,
            Boolean sparseDiskgroup,
            java.util.List<String> scanIpIds,
            java.util.List<String> vipIds,
            String scanDnsRecordId,
            String scanDnsName,
            String zoneId,
            Integer dataStorageSizeInGBs,
            Integer recoStorageSizeInGB,
            Integer nodeCount,
            LicenseModel licenseModel,
            MaintenanceWindow maintenanceWindow,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String sourceDbSystemId,
            java.util.Date pointInTimeDataDiskCloneTimestamp) {
        super();
        this.iormConfigCache = iormConfigCache;
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.availabilityDomain = availabilityDomain;
        this.faultDomains = faultDomains;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.memorySizeInGBs = memorySizeInGBs;
        this.storageVolumePerformanceMode = storageVolumePerformanceMode;
        this.shape = shape;
        this.dbSystemOptions = dbSystemOptions;
        this.sshPublicKeys = sshPublicKeys;
        this.timeZone = timeZone;
        this.hostname = hostname;
        this.domain = domain;
        this.kmsKeyId = kmsKeyId;
        this.version = version;
        this.cpuCoreCount = cpuCoreCount;
        this.clusterName = clusterName;
        this.dataStoragePercentage = dataStoragePercentage;
        this.databaseEdition = databaseEdition;
        this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
        this.listenerPort = listenerPort;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.diskRedundancy = diskRedundancy;
        this.sparseDiskgroup = sparseDiskgroup;
        this.scanIpIds = scanIpIds;
        this.vipIds = vipIds;
        this.scanDnsRecordId = scanDnsRecordId;
        this.scanDnsName = scanDnsName;
        this.zoneId = zoneId;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.recoStorageSizeInGB = recoStorageSizeInGB;
        this.nodeCount = nodeCount;
        this.licenseModel = licenseModel;
        this.maintenanceWindow = maintenanceWindow;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.sourceDbSystemId = sourceDbSystemId;
        this.pointInTimeDataDiskCloneTimestamp = pointInTimeDataDiskCloneTimestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("iormConfigCache")
        private ExadataIormConfig iormConfigCache;

        public Builder iormConfigCache(ExadataIormConfig iormConfigCache) {
            this.iormConfigCache = iormConfigCache;
            this.__explicitlySet__.add("iormConfigCache");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
        private StorageVolumePerformanceMode storageVolumePerformanceMode;

        public Builder storageVolumePerformanceMode(
                StorageVolumePerformanceMode storageVolumePerformanceMode) {
            this.storageVolumePerformanceMode = storageVolumePerformanceMode;
            this.__explicitlySet__.add("storageVolumePerformanceMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemOptions")
        private DbSystemOptions dbSystemOptions;

        public Builder dbSystemOptions(DbSystemOptions dbSystemOptions) {
            this.dbSystemOptions = dbSystemOptions;
            this.__explicitlySet__.add("dbSystemOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
        private Integer dataStoragePercentage;

        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = dataStoragePercentage;
            this.__explicitlySet__.add("dataStoragePercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
        private String lastPatchHistoryEntryId;

        public Builder lastPatchHistoryEntryId(String lastPatchHistoryEntryId) {
            this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
            this.__explicitlySet__.add("lastPatchHistoryEntryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
        private DiskRedundancy diskRedundancy;

        public Builder diskRedundancy(DiskRedundancy diskRedundancy) {
            this.diskRedundancy = diskRedundancy;
            this.__explicitlySet__.add("diskRedundancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sparseDiskgroup")
        private Boolean sparseDiskgroup;

        public Builder sparseDiskgroup(Boolean sparseDiskgroup) {
            this.sparseDiskgroup = sparseDiskgroup;
            this.__explicitlySet__.add("sparseDiskgroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
        private java.util.List<String> scanIpIds;

        public Builder scanIpIds(java.util.List<String> scanIpIds) {
            this.scanIpIds = scanIpIds;
            this.__explicitlySet__.add("scanIpIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
        private java.util.List<String> vipIds;

        public Builder vipIds(java.util.List<String> vipIds) {
            this.vipIds = vipIds;
            this.__explicitlySet__.add("vipIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
        private String scanDnsRecordId;

        public Builder scanDnsRecordId(String scanDnsRecordId) {
            this.scanDnsRecordId = scanDnsRecordId;
            this.__explicitlySet__.add("scanDnsRecordId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
        private String scanDnsName;

        public Builder scanDnsName(String scanDnsName) {
            this.scanDnsName = scanDnsName;
            this.__explicitlySet__.add("scanDnsName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGB")
        private Integer recoStorageSizeInGB;

        public Builder recoStorageSizeInGB(Integer recoStorageSizeInGB) {
            this.recoStorageSizeInGB = recoStorageSizeInGB;
            this.__explicitlySet__.add("recoStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbSystemId")
        private String sourceDbSystemId;

        public Builder sourceDbSystemId(String sourceDbSystemId) {
            this.sourceDbSystemId = sourceDbSystemId;
            this.__explicitlySet__.add("sourceDbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pointInTimeDataDiskCloneTimestamp")
        private java.util.Date pointInTimeDataDiskCloneTimestamp;

        public Builder pointInTimeDataDiskCloneTimestamp(
                java.util.Date pointInTimeDataDiskCloneTimestamp) {
            this.pointInTimeDataDiskCloneTimestamp = pointInTimeDataDiskCloneTimestamp;
            this.__explicitlySet__.add("pointInTimeDataDiskCloneTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystem build() {
            DbSystem __instance__ =
                    new DbSystem(
                            iormConfigCache,
                            id,
                            compartmentId,
                            displayName,
                            availabilityDomain,
                            faultDomains,
                            subnetId,
                            backupSubnetId,
                            nsgIds,
                            backupNetworkNsgIds,
                            memorySizeInGBs,
                            storageVolumePerformanceMode,
                            shape,
                            dbSystemOptions,
                            sshPublicKeys,
                            timeZone,
                            hostname,
                            domain,
                            kmsKeyId,
                            version,
                            cpuCoreCount,
                            clusterName,
                            dataStoragePercentage,
                            databaseEdition,
                            lastPatchHistoryEntryId,
                            listenerPort,
                            lifecycleState,
                            timeCreated,
                            lifecycleDetails,
                            diskRedundancy,
                            sparseDiskgroup,
                            scanIpIds,
                            vipIds,
                            scanDnsRecordId,
                            scanDnsName,
                            zoneId,
                            dataStorageSizeInGBs,
                            recoStorageSizeInGB,
                            nodeCount,
                            licenseModel,
                            maintenanceWindow,
                            lastMaintenanceRunId,
                            nextMaintenanceRunId,
                            freeformTags,
                            definedTags,
                            sourceDbSystemId,
                            pointInTimeDataDiskCloneTimestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystem o) {
            Builder copiedBuilder =
                    iormConfigCache(o.getIormConfigCache())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .faultDomains(o.getFaultDomains())
                            .subnetId(o.getSubnetId())
                            .backupSubnetId(o.getBackupSubnetId())
                            .nsgIds(o.getNsgIds())
                            .backupNetworkNsgIds(o.getBackupNetworkNsgIds())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .storageVolumePerformanceMode(o.getStorageVolumePerformanceMode())
                            .shape(o.getShape())
                            .dbSystemOptions(o.getDbSystemOptions())
                            .sshPublicKeys(o.getSshPublicKeys())
                            .timeZone(o.getTimeZone())
                            .hostname(o.getHostname())
                            .domain(o.getDomain())
                            .kmsKeyId(o.getKmsKeyId())
                            .version(o.getVersion())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .clusterName(o.getClusterName())
                            .dataStoragePercentage(o.getDataStoragePercentage())
                            .databaseEdition(o.getDatabaseEdition())
                            .lastPatchHistoryEntryId(o.getLastPatchHistoryEntryId())
                            .listenerPort(o.getListenerPort())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .diskRedundancy(o.getDiskRedundancy())
                            .sparseDiskgroup(o.getSparseDiskgroup())
                            .scanIpIds(o.getScanIpIds())
                            .vipIds(o.getVipIds())
                            .scanDnsRecordId(o.getScanDnsRecordId())
                            .scanDnsName(o.getScanDnsName())
                            .zoneId(o.getZoneId())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .recoStorageSizeInGB(o.getRecoStorageSizeInGB())
                            .nodeCount(o.getNodeCount())
                            .licenseModel(o.getLicenseModel())
                            .maintenanceWindow(o.getMaintenanceWindow())
                            .lastMaintenanceRunId(o.getLastMaintenanceRunId())
                            .nextMaintenanceRunId(o.getNextMaintenanceRunId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .sourceDbSystemId(o.getSourceDbSystemId())
                            .pointInTimeDataDiskCloneTimestamp(
                                    o.getPointInTimeDataDiskCloneTimestamp());

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

    @com.fasterxml.jackson.annotation.JsonProperty("iormConfigCache")
    private final ExadataIormConfig iormConfigCache;

    public ExadataIormConfig getIormConfigCache() {
        return iormConfigCache;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
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
     * The user-friendly name for the DB system. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the availability domain that the DB system is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * List of the Fault Domains in which this DB system is provisioned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    public java.util.List<String> getFaultDomains() {
        return faultDomains;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the DB system is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup network subnet the DB system is associated with. Applicable only to Exadata DB systems.
     * <p>
     **Subnet Restriction:** See the subnet restrictions information for **subnetId**.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    public String getBackupSubnetId() {
        return backupSubnetId;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /**
     * Memory allocated to the DB system, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
     *
     **/
    public enum StorageVolumePerformanceMode {
        Balanced("BALANCED"),
        HighPerformance("HIGH_PERFORMANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StorageVolumePerformanceMode.class);

        private final String value;
        private static java.util.Map<String, StorageVolumePerformanceMode> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageVolumePerformanceMode v : StorageVolumePerformanceMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageVolumePerformanceMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageVolumePerformanceMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageVolumePerformanceMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code HIGH_PERFORMANCE}. See [Block Volume Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm) for more information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
    private final StorageVolumePerformanceMode storageVolumePerformanceMode;

    public StorageVolumePerformanceMode getStorageVolumePerformanceMode() {
        return storageVolumePerformanceMode;
    }

    /**
     * The shape of the DB system. The shape determines resources to allocate to the DB system.
     * - For virtual machine shapes, the number of CPU cores and memory
     * - For bare metal and Exadata shapes, the number of CPU cores, storage, and memory
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemOptions")
    private final DbSystemOptions dbSystemOptions;

    public DbSystemOptions getDbSystemOptions() {
        return dbSystemOptions;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The time zone of the DB system. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The hostname for the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    public String getHostname() {
        return hostname;
    }

    /**
     * The domain name for the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    public String getDomain() {
        return domain;
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
     * The Oracle Database version of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * The number of CPU cores enabled on the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The cluster name for Exadata and 2-node RAC virtual machine DB systems. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    public String getClusterName() {
        return clusterName;
    }

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 40 and 80. The default is 80 percent assigned to DATA storage. Not applicable for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    private final Integer dataStoragePercentage;

    public Integer getDataStoragePercentage() {
        return dataStoragePercentage;
    }

    /**
     * The Oracle Database edition that applies to all the databases on the DB system.
     *
     **/
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseEdition.class);

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseEdition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database edition that applies to all the databases on the DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
    private final String lastPatchHistoryEntryId;

    public String getLastPatchHistoryEntryId() {
        return lastPatchHistoryEntryId;
    }

    /**
     * The port number configured for the listener on the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * The current state of the DB system.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        Migrated("MIGRATED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        NeedsAttention("NEEDS_ATTENTION"),
        Upgrading("UPGRADING"),

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
     * The current state of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the DB system was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
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
     * The type of redundancy configured for the DB system.
     * NORMAL is 2-way redundancy.
     * HIGH is 3-way redundancy.
     *
     **/
    public enum DiskRedundancy {
        High("HIGH"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DiskRedundancy.class);

        private final String value;
        private static java.util.Map<String, DiskRedundancy> map;

        static {
            map = new java.util.HashMap<>();
            for (DiskRedundancy v : DiskRedundancy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DiskRedundancy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiskRedundancy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiskRedundancy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of redundancy configured for the DB system.
     * NORMAL is 2-way redundancy.
     * HIGH is 3-way redundancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    private final DiskRedundancy diskRedundancy;

    public DiskRedundancy getDiskRedundancy() {
        return diskRedundancy;
    }

    /**
     * True, if Sparse Diskgroup is configured for Exadata dbsystem, False, if Sparse diskgroup was not configured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparseDiskgroup")
    private final Boolean sparseDiskgroup;

    public Boolean getSparseDiskgroup() {
        return sparseDiskgroup;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Single Client Access Name (SCAN) IP addresses associated with the DB system.
     * SCAN IP addresses are typically used for load balancing and are not assigned to any interface.
     * Oracle Clusterware directs the requests to the appropriate nodes in the cluster.
     * <p>
     **Note:** For a single-node DB system, this list is empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
    private final java.util.List<String> scanIpIds;

    public java.util.List<String> getScanIpIds() {
        return scanIpIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the virtual IP (VIP) addresses associated with the DB system.
     * The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the DB system to
     * enable failover. If one node fails, the VIP is reassigned to another active node in the cluster.
     * <p>
     **Note:** For a single-node DB system, this list is empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
    private final java.util.List<String> vipIds;

    public java.util.List<String> getVipIds() {
        return vipIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DNS record for the SCAN IP addresses that are associated with the DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
    private final String scanDnsRecordId;

    public String getScanDnsRecordId() {
        return scanDnsRecordId;
    }

    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
    private final String scanDnsName;

    public String getScanDnsName() {
        return scanDnsName;
    }

    /**
     * The OCID of the zone the DB system is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    public String getZoneId() {
        return zoneId;
    }

    /**
     * The data storage size, in gigabytes, that is currently available to the DB system. Applies only for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The RECO/REDO storage size, in gigabytes, that is currently allocated to the DB system. Applies only for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGB")
    private final Integer recoStorageSizeInGB;

    public Integer getRecoStorageSizeInGB() {
        return recoStorageSizeInGB;
    }

    /**
     * The number of nodes in the DB system. For RAC DB systems, the value is greater than 1.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is LICENSE_INCLUDED.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbSystemId")
    private final String sourceDbSystemId;

    public String getSourceDbSystemId() {
        return sourceDbSystemId;
    }

    /**
     * The point in time for a cloned database system when the data disks were cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pointInTimeDataDiskCloneTimestamp")
    private final java.util.Date pointInTimeDataDiskCloneTimestamp;

    public java.util.Date getPointInTimeDataDiskCloneTimestamp() {
        return pointInTimeDataDiskCloneTimestamp;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystem(");
        sb.append("iormConfigCache=").append(String.valueOf(this.iormConfigCache));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", storageVolumePerformanceMode=")
                .append(String.valueOf(this.storageVolumePerformanceMode));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", dbSystemOptions=").append(String.valueOf(this.dbSystemOptions));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", dataStoragePercentage=").append(String.valueOf(this.dataStoragePercentage));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", lastPatchHistoryEntryId=")
                .append(String.valueOf(this.lastPatchHistoryEntryId));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", diskRedundancy=").append(String.valueOf(this.diskRedundancy));
        sb.append(", sparseDiskgroup=").append(String.valueOf(this.sparseDiskgroup));
        sb.append(", scanIpIds=").append(String.valueOf(this.scanIpIds));
        sb.append(", vipIds=").append(String.valueOf(this.vipIds));
        sb.append(", scanDnsRecordId=").append(String.valueOf(this.scanDnsRecordId));
        sb.append(", scanDnsName=").append(String.valueOf(this.scanDnsName));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", recoStorageSizeInGB=").append(String.valueOf(this.recoStorageSizeInGB));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", sourceDbSystemId=").append(String.valueOf(this.sourceDbSystemId));
        sb.append(", pointInTimeDataDiskCloneTimestamp=")
                .append(String.valueOf(this.pointInTimeDataDiskCloneTimestamp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystem)) {
            return false;
        }

        DbSystem other = (DbSystem) o;
        return java.util.Objects.equals(this.iormConfigCache, other.iormConfigCache)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.storageVolumePerformanceMode, other.storageVolumePerformanceMode)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.dbSystemOptions, other.dbSystemOptions)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.dataStoragePercentage, other.dataStoragePercentage)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(
                        this.lastPatchHistoryEntryId, other.lastPatchHistoryEntryId)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.diskRedundancy, other.diskRedundancy)
                && java.util.Objects.equals(this.sparseDiskgroup, other.sparseDiskgroup)
                && java.util.Objects.equals(this.scanIpIds, other.scanIpIds)
                && java.util.Objects.equals(this.vipIds, other.vipIds)
                && java.util.Objects.equals(this.scanDnsRecordId, other.scanDnsRecordId)
                && java.util.Objects.equals(this.scanDnsName, other.scanDnsName)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.recoStorageSizeInGB, other.recoStorageSizeInGB)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.sourceDbSystemId, other.sourceDbSystemId)
                && java.util.Objects.equals(
                        this.pointInTimeDataDiskCloneTimestamp,
                        other.pointInTimeDataDiskCloneTimestamp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.iormConfigCache == null ? 43 : this.iormConfigCache.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSubnetId == null ? 43 : this.backupSubnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageVolumePerformanceMode == null
                                ? 43
                                : this.storageVolumePerformanceMode.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemOptions == null ? 43 : this.dbSystemOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStoragePercentage == null
                                ? 43
                                : this.dataStoragePercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.lastPatchHistoryEntryId == null
                                ? 43
                                : this.lastPatchHistoryEntryId.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.diskRedundancy == null ? 43 : this.diskRedundancy.hashCode());
        result =
                (result * PRIME)
                        + (this.sparseDiskgroup == null ? 43 : this.sparseDiskgroup.hashCode());
        result = (result * PRIME) + (this.scanIpIds == null ? 43 : this.scanIpIds.hashCode());
        result = (result * PRIME) + (this.vipIds == null ? 43 : this.vipIds.hashCode());
        result =
                (result * PRIME)
                        + (this.scanDnsRecordId == null ? 43 : this.scanDnsRecordId.hashCode());
        result = (result * PRIME) + (this.scanDnsName == null ? 43 : this.scanDnsName.hashCode());
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStorageSizeInGB == null
                                ? 43
                                : this.recoStorageSizeInGB.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.lastMaintenanceRunId == null
                                ? 43
                                : this.lastMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceRunId == null
                                ? 43
                                : this.nextMaintenanceRunId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDbSystemId == null ? 43 : this.sourceDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.pointInTimeDataDiskCloneTimestamp == null
                                ? 43
                                : this.pointInTimeDataDiskCloneTimestamp.hashCode());
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
