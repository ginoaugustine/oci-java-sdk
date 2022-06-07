/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Sql Stats type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlStats {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlIdentifier",
        "planHashValue",
        "timeCollected",
        "instanceName",
        "lastActiveTime",
        "parseCalls",
        "diskReads",
        "directReads",
        "directWrites",
        "bufferGets",
        "rowsProcessed",
        "serializableAborts",
        "fetches",
        "executions",
        "avoidedExecutions",
        "endOfFetchCount",
        "loads",
        "versionCount",
        "invalidations",
        "obsoleteCount",
        "pxServersExecutions",
        "cpuTimeInUs",
        "elapsedTimeInUs",
        "avgHardParseTimeInUs",
        "concurrencyWaitTimeInUs",
        "applicationWaitTimeInUs",
        "clusterWaitTimeInUs",
        "userIoWaitTimeInUs",
        "plsqlExecTimeInUs",
        "javaExecTimeInUs",
        "sorts",
        "sharableMem",
        "totalSharableMem",
        "typeCheckMem",
        "ioCellOffloadEligibleBytes",
        "ioInterconnectBytes",
        "physicalReadRequests",
        "physicalReadBytes",
        "physicalWriteRequests",
        "physicalWriteBytes",
        "exactMatchingSignature",
        "forceMatchingSignature",
        "ioCellUncompressedBytes",
        "ioCellOffloadReturnedBytes",
        "childNumber",
        "commandType",
        "usersOpening",
        "usersExecuting",
        "optimizerCost",
        "fullPlanHashValue",
        "module",
        "service",
        "action",
        "sqlProfile",
        "sqlPatch",
        "sqlPlanBaseline",
        "deltaExecutionCount",
        "deltaCpuTime",
        "deltaIoBytes",
        "deltaCpuRank",
        "deltaExecsRank",
        "sharableMemRank",
        "deltaIoRank",
        "harmonicSum",
        "wtHarmonicSum",
        "totalSqlCount"
    })
    public SqlStats(
            String sqlIdentifier,
            Long planHashValue,
            java.util.Date timeCollected,
            String instanceName,
            String lastActiveTime,
            Long parseCalls,
            Long diskReads,
            Long directReads,
            Long directWrites,
            Long bufferGets,
            Long rowsProcessed,
            Long serializableAborts,
            Long fetches,
            Long executions,
            Long avoidedExecutions,
            Long endOfFetchCount,
            Long loads,
            Long versionCount,
            Long invalidations,
            Long obsoleteCount,
            Long pxServersExecutions,
            Long cpuTimeInUs,
            Long elapsedTimeInUs,
            Long avgHardParseTimeInUs,
            Long concurrencyWaitTimeInUs,
            Long applicationWaitTimeInUs,
            Long clusterWaitTimeInUs,
            Long userIoWaitTimeInUs,
            Long plsqlExecTimeInUs,
            Long javaExecTimeInUs,
            Long sorts,
            Long sharableMem,
            Long totalSharableMem,
            Long typeCheckMem,
            Long ioCellOffloadEligibleBytes,
            Long ioInterconnectBytes,
            Long physicalReadRequests,
            Long physicalReadBytes,
            Long physicalWriteRequests,
            Long physicalWriteBytes,
            String exactMatchingSignature,
            String forceMatchingSignature,
            Long ioCellUncompressedBytes,
            Long ioCellOffloadReturnedBytes,
            Long childNumber,
            Long commandType,
            Long usersOpening,
            Long usersExecuting,
            Long optimizerCost,
            String fullPlanHashValue,
            String module,
            String service,
            String action,
            String sqlProfile,
            String sqlPatch,
            String sqlPlanBaseline,
            Long deltaExecutionCount,
            Long deltaCpuTime,
            Long deltaIoBytes,
            Long deltaCpuRank,
            Long deltaExecsRank,
            Long sharableMemRank,
            Long deltaIoRank,
            Long harmonicSum,
            Long wtHarmonicSum,
            Long totalSqlCount) {
        super();
        this.sqlIdentifier = sqlIdentifier;
        this.planHashValue = planHashValue;
        this.timeCollected = timeCollected;
        this.instanceName = instanceName;
        this.lastActiveTime = lastActiveTime;
        this.parseCalls = parseCalls;
        this.diskReads = diskReads;
        this.directReads = directReads;
        this.directWrites = directWrites;
        this.bufferGets = bufferGets;
        this.rowsProcessed = rowsProcessed;
        this.serializableAborts = serializableAborts;
        this.fetches = fetches;
        this.executions = executions;
        this.avoidedExecutions = avoidedExecutions;
        this.endOfFetchCount = endOfFetchCount;
        this.loads = loads;
        this.versionCount = versionCount;
        this.invalidations = invalidations;
        this.obsoleteCount = obsoleteCount;
        this.pxServersExecutions = pxServersExecutions;
        this.cpuTimeInUs = cpuTimeInUs;
        this.elapsedTimeInUs = elapsedTimeInUs;
        this.avgHardParseTimeInUs = avgHardParseTimeInUs;
        this.concurrencyWaitTimeInUs = concurrencyWaitTimeInUs;
        this.applicationWaitTimeInUs = applicationWaitTimeInUs;
        this.clusterWaitTimeInUs = clusterWaitTimeInUs;
        this.userIoWaitTimeInUs = userIoWaitTimeInUs;
        this.plsqlExecTimeInUs = plsqlExecTimeInUs;
        this.javaExecTimeInUs = javaExecTimeInUs;
        this.sorts = sorts;
        this.sharableMem = sharableMem;
        this.totalSharableMem = totalSharableMem;
        this.typeCheckMem = typeCheckMem;
        this.ioCellOffloadEligibleBytes = ioCellOffloadEligibleBytes;
        this.ioInterconnectBytes = ioInterconnectBytes;
        this.physicalReadRequests = physicalReadRequests;
        this.physicalReadBytes = physicalReadBytes;
        this.physicalWriteRequests = physicalWriteRequests;
        this.physicalWriteBytes = physicalWriteBytes;
        this.exactMatchingSignature = exactMatchingSignature;
        this.forceMatchingSignature = forceMatchingSignature;
        this.ioCellUncompressedBytes = ioCellUncompressedBytes;
        this.ioCellOffloadReturnedBytes = ioCellOffloadReturnedBytes;
        this.childNumber = childNumber;
        this.commandType = commandType;
        this.usersOpening = usersOpening;
        this.usersExecuting = usersExecuting;
        this.optimizerCost = optimizerCost;
        this.fullPlanHashValue = fullPlanHashValue;
        this.module = module;
        this.service = service;
        this.action = action;
        this.sqlProfile = sqlProfile;
        this.sqlPatch = sqlPatch;
        this.sqlPlanBaseline = sqlPlanBaseline;
        this.deltaExecutionCount = deltaExecutionCount;
        this.deltaCpuTime = deltaCpuTime;
        this.deltaIoBytes = deltaIoBytes;
        this.deltaCpuRank = deltaCpuRank;
        this.deltaExecsRank = deltaExecsRank;
        this.sharableMemRank = sharableMemRank;
        this.deltaIoRank = deltaIoRank;
        this.harmonicSum = harmonicSum;
        this.wtHarmonicSum = wtHarmonicSum;
        this.totalSqlCount = totalSqlCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
        private Long planHashValue;

        public Builder planHashValue(Long planHashValue) {
            this.planHashValue = planHashValue;
            this.__explicitlySet__.add("planHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
        private String lastActiveTime;

        public Builder lastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            this.__explicitlySet__.add("lastActiveTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
        private Long parseCalls;

        public Builder parseCalls(Long parseCalls) {
            this.parseCalls = parseCalls;
            this.__explicitlySet__.add("parseCalls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
        private Long diskReads;

        public Builder diskReads(Long diskReads) {
            this.diskReads = diskReads;
            this.__explicitlySet__.add("diskReads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("directReads")
        private Long directReads;

        public Builder directReads(Long directReads) {
            this.directReads = directReads;
            this.__explicitlySet__.add("directReads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
        private Long directWrites;

        public Builder directWrites(Long directWrites) {
            this.directWrites = directWrites;
            this.__explicitlySet__.add("directWrites");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
        private Long bufferGets;

        public Builder bufferGets(Long bufferGets) {
            this.bufferGets = bufferGets;
            this.__explicitlySet__.add("bufferGets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
        private Long rowsProcessed;

        public Builder rowsProcessed(Long rowsProcessed) {
            this.rowsProcessed = rowsProcessed;
            this.__explicitlySet__.add("rowsProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
        private Long serializableAborts;

        public Builder serializableAborts(Long serializableAborts) {
            this.serializableAborts = serializableAborts;
            this.__explicitlySet__.add("serializableAborts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetches")
        private Long fetches;

        public Builder fetches(Long fetches) {
            this.fetches = fetches;
            this.__explicitlySet__.add("fetches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private Long executions;

        public Builder executions(Long executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
        private Long avoidedExecutions;

        public Builder avoidedExecutions(Long avoidedExecutions) {
            this.avoidedExecutions = avoidedExecutions;
            this.__explicitlySet__.add("avoidedExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
        private Long endOfFetchCount;

        public Builder endOfFetchCount(Long endOfFetchCount) {
            this.endOfFetchCount = endOfFetchCount;
            this.__explicitlySet__.add("endOfFetchCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loads")
        private Long loads;

        public Builder loads(Long loads) {
            this.loads = loads;
            this.__explicitlySet__.add("loads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
        private Long versionCount;

        public Builder versionCount(Long versionCount) {
            this.versionCount = versionCount;
            this.__explicitlySet__.add("versionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
        private Long invalidations;

        public Builder invalidations(Long invalidations) {
            this.invalidations = invalidations;
            this.__explicitlySet__.add("invalidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
        private Long obsoleteCount;

        public Builder obsoleteCount(Long obsoleteCount) {
            this.obsoleteCount = obsoleteCount;
            this.__explicitlySet__.add("obsoleteCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
        private Long pxServersExecutions;

        public Builder pxServersExecutions(Long pxServersExecutions) {
            this.pxServersExecutions = pxServersExecutions;
            this.__explicitlySet__.add("pxServersExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
        private Long cpuTimeInUs;

        public Builder cpuTimeInUs(Long cpuTimeInUs) {
            this.cpuTimeInUs = cpuTimeInUs;
            this.__explicitlySet__.add("cpuTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
        private Long elapsedTimeInUs;

        public Builder elapsedTimeInUs(Long elapsedTimeInUs) {
            this.elapsedTimeInUs = elapsedTimeInUs;
            this.__explicitlySet__.add("elapsedTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
        private Long avgHardParseTimeInUs;

        public Builder avgHardParseTimeInUs(Long avgHardParseTimeInUs) {
            this.avgHardParseTimeInUs = avgHardParseTimeInUs;
            this.__explicitlySet__.add("avgHardParseTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
        private Long concurrencyWaitTimeInUs;

        public Builder concurrencyWaitTimeInUs(Long concurrencyWaitTimeInUs) {
            this.concurrencyWaitTimeInUs = concurrencyWaitTimeInUs;
            this.__explicitlySet__.add("concurrencyWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
        private Long applicationWaitTimeInUs;

        public Builder applicationWaitTimeInUs(Long applicationWaitTimeInUs) {
            this.applicationWaitTimeInUs = applicationWaitTimeInUs;
            this.__explicitlySet__.add("applicationWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
        private Long clusterWaitTimeInUs;

        public Builder clusterWaitTimeInUs(Long clusterWaitTimeInUs) {
            this.clusterWaitTimeInUs = clusterWaitTimeInUs;
            this.__explicitlySet__.add("clusterWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
        private Long userIoWaitTimeInUs;

        public Builder userIoWaitTimeInUs(Long userIoWaitTimeInUs) {
            this.userIoWaitTimeInUs = userIoWaitTimeInUs;
            this.__explicitlySet__.add("userIoWaitTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
        private Long plsqlExecTimeInUs;

        public Builder plsqlExecTimeInUs(Long plsqlExecTimeInUs) {
            this.plsqlExecTimeInUs = plsqlExecTimeInUs;
            this.__explicitlySet__.add("plsqlExecTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
        private Long javaExecTimeInUs;

        public Builder javaExecTimeInUs(Long javaExecTimeInUs) {
            this.javaExecTimeInUs = javaExecTimeInUs;
            this.__explicitlySet__.add("javaExecTimeInUs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sorts")
        private Long sorts;

        public Builder sorts(Long sorts) {
            this.sorts = sorts;
            this.__explicitlySet__.add("sorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
        private Long sharableMem;

        public Builder sharableMem(Long sharableMem) {
            this.sharableMem = sharableMem;
            this.__explicitlySet__.add("sharableMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
        private Long totalSharableMem;

        public Builder totalSharableMem(Long totalSharableMem) {
            this.totalSharableMem = totalSharableMem;
            this.__explicitlySet__.add("totalSharableMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
        private Long typeCheckMem;

        public Builder typeCheckMem(Long typeCheckMem) {
            this.typeCheckMem = typeCheckMem;
            this.__explicitlySet__.add("typeCheckMem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
        private Long ioCellOffloadEligibleBytes;

        public Builder ioCellOffloadEligibleBytes(Long ioCellOffloadEligibleBytes) {
            this.ioCellOffloadEligibleBytes = ioCellOffloadEligibleBytes;
            this.__explicitlySet__.add("ioCellOffloadEligibleBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
        private Long ioInterconnectBytes;

        public Builder ioInterconnectBytes(Long ioInterconnectBytes) {
            this.ioInterconnectBytes = ioInterconnectBytes;
            this.__explicitlySet__.add("ioInterconnectBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
        private Long physicalReadRequests;

        public Builder physicalReadRequests(Long physicalReadRequests) {
            this.physicalReadRequests = physicalReadRequests;
            this.__explicitlySet__.add("physicalReadRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
        private Long physicalReadBytes;

        public Builder physicalReadBytes(Long physicalReadBytes) {
            this.physicalReadBytes = physicalReadBytes;
            this.__explicitlySet__.add("physicalReadBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
        private Long physicalWriteRequests;

        public Builder physicalWriteRequests(Long physicalWriteRequests) {
            this.physicalWriteRequests = physicalWriteRequests;
            this.__explicitlySet__.add("physicalWriteRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
        private Long physicalWriteBytes;

        public Builder physicalWriteBytes(Long physicalWriteBytes) {
            this.physicalWriteBytes = physicalWriteBytes;
            this.__explicitlySet__.add("physicalWriteBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
        private String exactMatchingSignature;

        public Builder exactMatchingSignature(String exactMatchingSignature) {
            this.exactMatchingSignature = exactMatchingSignature;
            this.__explicitlySet__.add("exactMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
        private String forceMatchingSignature;

        public Builder forceMatchingSignature(String forceMatchingSignature) {
            this.forceMatchingSignature = forceMatchingSignature;
            this.__explicitlySet__.add("forceMatchingSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
        private Long ioCellUncompressedBytes;

        public Builder ioCellUncompressedBytes(Long ioCellUncompressedBytes) {
            this.ioCellUncompressedBytes = ioCellUncompressedBytes;
            this.__explicitlySet__.add("ioCellUncompressedBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
        private Long ioCellOffloadReturnedBytes;

        public Builder ioCellOffloadReturnedBytes(Long ioCellOffloadReturnedBytes) {
            this.ioCellOffloadReturnedBytes = ioCellOffloadReturnedBytes;
            this.__explicitlySet__.add("ioCellOffloadReturnedBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
        private Long childNumber;

        public Builder childNumber(Long childNumber) {
            this.childNumber = childNumber;
            this.__explicitlySet__.add("childNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandType")
        private Long commandType;

        public Builder commandType(Long commandType) {
            this.commandType = commandType;
            this.__explicitlySet__.add("commandType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
        private Long usersOpening;

        public Builder usersOpening(Long usersOpening) {
            this.usersOpening = usersOpening;
            this.__explicitlySet__.add("usersOpening");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
        private Long usersExecuting;

        public Builder usersExecuting(Long usersExecuting) {
            this.usersExecuting = usersExecuting;
            this.__explicitlySet__.add("usersExecuting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
        private Long optimizerCost;

        public Builder optimizerCost(Long optimizerCost) {
            this.optimizerCost = optimizerCost;
            this.__explicitlySet__.add("optimizerCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
        private String fullPlanHashValue;

        public Builder fullPlanHashValue(String fullPlanHashValue) {
            this.fullPlanHashValue = fullPlanHashValue;
            this.__explicitlySet__.add("fullPlanHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("module")
        private String module;

        public Builder module(String module) {
            this.module = module;
            this.__explicitlySet__.add("module");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
        private String sqlProfile;

        public Builder sqlProfile(String sqlProfile) {
            this.sqlProfile = sqlProfile;
            this.__explicitlySet__.add("sqlProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
        private String sqlPatch;

        public Builder sqlPatch(String sqlPatch) {
            this.sqlPatch = sqlPatch;
            this.__explicitlySet__.add("sqlPatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
        private String sqlPlanBaseline;

        public Builder sqlPlanBaseline(String sqlPlanBaseline) {
            this.sqlPlanBaseline = sqlPlanBaseline;
            this.__explicitlySet__.add("sqlPlanBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
        private Long deltaExecutionCount;

        public Builder deltaExecutionCount(Long deltaExecutionCount) {
            this.deltaExecutionCount = deltaExecutionCount;
            this.__explicitlySet__.add("deltaExecutionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
        private Long deltaCpuTime;

        public Builder deltaCpuTime(Long deltaCpuTime) {
            this.deltaCpuTime = deltaCpuTime;
            this.__explicitlySet__.add("deltaCpuTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
        private Long deltaIoBytes;

        public Builder deltaIoBytes(Long deltaIoBytes) {
            this.deltaIoBytes = deltaIoBytes;
            this.__explicitlySet__.add("deltaIoBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
        private Long deltaCpuRank;

        public Builder deltaCpuRank(Long deltaCpuRank) {
            this.deltaCpuRank = deltaCpuRank;
            this.__explicitlySet__.add("deltaCpuRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
        private Long deltaExecsRank;

        public Builder deltaExecsRank(Long deltaExecsRank) {
            this.deltaExecsRank = deltaExecsRank;
            this.__explicitlySet__.add("deltaExecsRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
        private Long sharableMemRank;

        public Builder sharableMemRank(Long sharableMemRank) {
            this.sharableMemRank = sharableMemRank;
            this.__explicitlySet__.add("sharableMemRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
        private Long deltaIoRank;

        public Builder deltaIoRank(Long deltaIoRank) {
            this.deltaIoRank = deltaIoRank;
            this.__explicitlySet__.add("deltaIoRank");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
        private Long harmonicSum;

        public Builder harmonicSum(Long harmonicSum) {
            this.harmonicSum = harmonicSum;
            this.__explicitlySet__.add("harmonicSum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
        private Long wtHarmonicSum;

        public Builder wtHarmonicSum(Long wtHarmonicSum) {
            this.wtHarmonicSum = wtHarmonicSum;
            this.__explicitlySet__.add("wtHarmonicSum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
        private Long totalSqlCount;

        public Builder totalSqlCount(Long totalSqlCount) {
            this.totalSqlCount = totalSqlCount;
            this.__explicitlySet__.add("totalSqlCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStats build() {
            SqlStats __instance__ =
                    new SqlStats(
                            sqlIdentifier,
                            planHashValue,
                            timeCollected,
                            instanceName,
                            lastActiveTime,
                            parseCalls,
                            diskReads,
                            directReads,
                            directWrites,
                            bufferGets,
                            rowsProcessed,
                            serializableAborts,
                            fetches,
                            executions,
                            avoidedExecutions,
                            endOfFetchCount,
                            loads,
                            versionCount,
                            invalidations,
                            obsoleteCount,
                            pxServersExecutions,
                            cpuTimeInUs,
                            elapsedTimeInUs,
                            avgHardParseTimeInUs,
                            concurrencyWaitTimeInUs,
                            applicationWaitTimeInUs,
                            clusterWaitTimeInUs,
                            userIoWaitTimeInUs,
                            plsqlExecTimeInUs,
                            javaExecTimeInUs,
                            sorts,
                            sharableMem,
                            totalSharableMem,
                            typeCheckMem,
                            ioCellOffloadEligibleBytes,
                            ioInterconnectBytes,
                            physicalReadRequests,
                            physicalReadBytes,
                            physicalWriteRequests,
                            physicalWriteBytes,
                            exactMatchingSignature,
                            forceMatchingSignature,
                            ioCellUncompressedBytes,
                            ioCellOffloadReturnedBytes,
                            childNumber,
                            commandType,
                            usersOpening,
                            usersExecuting,
                            optimizerCost,
                            fullPlanHashValue,
                            module,
                            service,
                            action,
                            sqlProfile,
                            sqlPatch,
                            sqlPlanBaseline,
                            deltaExecutionCount,
                            deltaCpuTime,
                            deltaIoBytes,
                            deltaCpuRank,
                            deltaExecsRank,
                            sharableMemRank,
                            deltaIoRank,
                            harmonicSum,
                            wtHarmonicSum,
                            totalSqlCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStats o) {
            Builder copiedBuilder =
                    sqlIdentifier(o.getSqlIdentifier())
                            .planHashValue(o.getPlanHashValue())
                            .timeCollected(o.getTimeCollected())
                            .instanceName(o.getInstanceName())
                            .lastActiveTime(o.getLastActiveTime())
                            .parseCalls(o.getParseCalls())
                            .diskReads(o.getDiskReads())
                            .directReads(o.getDirectReads())
                            .directWrites(o.getDirectWrites())
                            .bufferGets(o.getBufferGets())
                            .rowsProcessed(o.getRowsProcessed())
                            .serializableAborts(o.getSerializableAborts())
                            .fetches(o.getFetches())
                            .executions(o.getExecutions())
                            .avoidedExecutions(o.getAvoidedExecutions())
                            .endOfFetchCount(o.getEndOfFetchCount())
                            .loads(o.getLoads())
                            .versionCount(o.getVersionCount())
                            .invalidations(o.getInvalidations())
                            .obsoleteCount(o.getObsoleteCount())
                            .pxServersExecutions(o.getPxServersExecutions())
                            .cpuTimeInUs(o.getCpuTimeInUs())
                            .elapsedTimeInUs(o.getElapsedTimeInUs())
                            .avgHardParseTimeInUs(o.getAvgHardParseTimeInUs())
                            .concurrencyWaitTimeInUs(o.getConcurrencyWaitTimeInUs())
                            .applicationWaitTimeInUs(o.getApplicationWaitTimeInUs())
                            .clusterWaitTimeInUs(o.getClusterWaitTimeInUs())
                            .userIoWaitTimeInUs(o.getUserIoWaitTimeInUs())
                            .plsqlExecTimeInUs(o.getPlsqlExecTimeInUs())
                            .javaExecTimeInUs(o.getJavaExecTimeInUs())
                            .sorts(o.getSorts())
                            .sharableMem(o.getSharableMem())
                            .totalSharableMem(o.getTotalSharableMem())
                            .typeCheckMem(o.getTypeCheckMem())
                            .ioCellOffloadEligibleBytes(o.getIoCellOffloadEligibleBytes())
                            .ioInterconnectBytes(o.getIoInterconnectBytes())
                            .physicalReadRequests(o.getPhysicalReadRequests())
                            .physicalReadBytes(o.getPhysicalReadBytes())
                            .physicalWriteRequests(o.getPhysicalWriteRequests())
                            .physicalWriteBytes(o.getPhysicalWriteBytes())
                            .exactMatchingSignature(o.getExactMatchingSignature())
                            .forceMatchingSignature(o.getForceMatchingSignature())
                            .ioCellUncompressedBytes(o.getIoCellUncompressedBytes())
                            .ioCellOffloadReturnedBytes(o.getIoCellOffloadReturnedBytes())
                            .childNumber(o.getChildNumber())
                            .commandType(o.getCommandType())
                            .usersOpening(o.getUsersOpening())
                            .usersExecuting(o.getUsersExecuting())
                            .optimizerCost(o.getOptimizerCost())
                            .fullPlanHashValue(o.getFullPlanHashValue())
                            .module(o.getModule())
                            .service(o.getService())
                            .action(o.getAction())
                            .sqlProfile(o.getSqlProfile())
                            .sqlPatch(o.getSqlPatch())
                            .sqlPlanBaseline(o.getSqlPlanBaseline())
                            .deltaExecutionCount(o.getDeltaExecutionCount())
                            .deltaCpuTime(o.getDeltaCpuTime())
                            .deltaIoBytes(o.getDeltaIoBytes())
                            .deltaCpuRank(o.getDeltaCpuRank())
                            .deltaExecsRank(o.getDeltaExecsRank())
                            .sharableMemRank(o.getSharableMemRank())
                            .deltaIoRank(o.getDeltaIoRank())
                            .harmonicSum(o.getHarmonicSum())
                            .wtHarmonicSum(o.getWtHarmonicSum())
                            .totalSqlCount(o.getTotalSqlCount());

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
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /**
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    private final Long planHashValue;

    public Long getPlanHashValue() {
        return planHashValue;
    }

    /**
     * Collection timestamp
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /**
     * Name of Database Instance
     * Example: {@code "DB10902_1"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    public String getInstanceName() {
        return instanceName;
    }

    /**
     * last_active_time
     * Example: {@code "0000000099CCE300"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastActiveTime")
    private final String lastActiveTime;

    public String getLastActiveTime() {
        return lastActiveTime;
    }

    /**
     * Total integer of parse calls
     *  Example: {@code 60}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parseCalls")
    private final Long parseCalls;

    public Long getParseCalls() {
        return parseCalls;
    }

    /**
     * Number of disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
    private final Long diskReads;

    public Long getDiskReads() {
        return diskReads;
    }

    /**
     * Number of direct reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directReads")
    private final Long directReads;

    public Long getDirectReads() {
        return directReads;
    }

    /**
     * Number of Direct writes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
    private final Long directWrites;

    public Long getDirectWrites() {
        return directWrites;
    }

    /**
     * Number of Buffer Gets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
    private final Long bufferGets;

    public Long getBufferGets() {
        return bufferGets;
    }

    /**
     * Number of row processed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowsProcessed")
    private final Long rowsProcessed;

    public Long getRowsProcessed() {
        return rowsProcessed;
    }

    /**
     * Number of serializable aborts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serializableAborts")
    private final Long serializableAborts;

    public Long getSerializableAborts() {
        return serializableAborts;
    }

    /**
     * Number of fetches
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetches")
    private final Long fetches;

    public Long getFetches() {
        return fetches;
    }

    /**
     * Number of executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    private final Long executions;

    public Long getExecutions() {
        return executions;
    }

    /**
     * Number of executions attempted on this object, but prevented due to the SQL statement being in quarantine
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avoidedExecutions")
    private final Long avoidedExecutions;

    public Long getAvoidedExecutions() {
        return avoidedExecutions;
    }

    /**
     * Number of times this cursor was fully executed since the cursor was brought into the library cache
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfFetchCount")
    private final Long endOfFetchCount;

    public Long getEndOfFetchCount() {
        return endOfFetchCount;
    }

    /**
     * Number of times the object was either loaded or reloaded
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loads")
    private final Long loads;

    public Long getLoads() {
        return loads;
    }

    /**
     * Number of cursors present in the cache with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionCount")
    private final Long versionCount;

    public Long getVersionCount() {
        return versionCount;
    }

    /**
     * Number of times this child cursor has been invalidated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invalidations")
    private final Long invalidations;

    public Long getInvalidations() {
        return invalidations;
    }

    /**
     * Number of times that a parent cursor became obsolete
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("obsoleteCount")
    private final Long obsoleteCount;

    public Long getObsoleteCount() {
        return obsoleteCount;
    }

    /**
     * Total number of executions performed by parallel execution servers (0 when the statement has never been executed in parallel)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pxServersExecutions")
    private final Long pxServersExecutions;

    public Long getPxServersExecutions() {
        return pxServersExecutions;
    }

    /**
     * CPU time (in microseconds) used by this cursor for parsing, executing, and fetching
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTimeInUs")
    private final Long cpuTimeInUs;

    public Long getCpuTimeInUs() {
        return cpuTimeInUs;
    }

    /**
     * Elapsed time (in microseconds) used by this cursor for parsing, executing, and fetching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInUs")
    private final Long elapsedTimeInUs;

    public Long getElapsedTimeInUs() {
        return elapsedTimeInUs;
    }

    /**
     * Average hard parse time (in microseconds) used by this cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgHardParseTimeInUs")
    private final Long avgHardParseTimeInUs;

    public Long getAvgHardParseTimeInUs() {
        return avgHardParseTimeInUs;
    }

    /**
     * Concurrency wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("concurrencyWaitTimeInUs")
    private final Long concurrencyWaitTimeInUs;

    public Long getConcurrencyWaitTimeInUs() {
        return concurrencyWaitTimeInUs;
    }

    /**
     * Application wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationWaitTimeInUs")
    private final Long applicationWaitTimeInUs;

    public Long getApplicationWaitTimeInUs() {
        return applicationWaitTimeInUs;
    }

    /**
     * Cluster wait time (in microseconds). This value is specific to Oracle RAC
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterWaitTimeInUs")
    private final Long clusterWaitTimeInUs;

    public Long getClusterWaitTimeInUs() {
        return clusterWaitTimeInUs;
    }

    /**
     * User I/O wait time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userIoWaitTimeInUs")
    private final Long userIoWaitTimeInUs;

    public Long getUserIoWaitTimeInUs() {
        return userIoWaitTimeInUs;
    }

    /**
     * PL/SQL execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plsqlExecTimeInUs")
    private final Long plsqlExecTimeInUs;

    public Long getPlsqlExecTimeInUs() {
        return plsqlExecTimeInUs;
    }

    /**
     * Java execution time (in microseconds)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaExecTimeInUs")
    private final Long javaExecTimeInUs;

    public Long getJavaExecTimeInUs() {
        return javaExecTimeInUs;
    }

    /**
     * Number of sorts that were done for the child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sorts")
    private final Long sorts;

    public Long getSorts() {
        return sorts;
    }

    /**
     * Total shared memory (in bytes) currently occupied by all cursors with this SQL text and plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMem")
    private final Long sharableMem;

    public Long getSharableMem() {
        return sharableMem;
    }

    /**
     * Total shared memory (in bytes) occupied by all cursors with this SQL text and plan if they were to be fully loaded in the shared pool (that is, cursor size)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSharableMem")
    private final Long totalSharableMem;

    public Long getTotalSharableMem() {
        return totalSharableMem;
    }

    /**
     * Typecheck memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeCheckMem")
    private final Long typeCheckMem;

    public Long getTypeCheckMem() {
        return typeCheckMem;
    }

    /**
     * Number of I/O bytes which can be filtered by the Exadata storage system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadEligibleBytes")
    private final Long ioCellOffloadEligibleBytes;

    public Long getIoCellOffloadEligibleBytes() {
        return ioCellOffloadEligibleBytes;
    }

    /**
     * Number of I/O bytes exchanged between Oracle Database and the storage system. Typically used for Cache Fusion or parallel queries
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioInterconnectBytes")
    private final Long ioInterconnectBytes;

    public Long getIoInterconnectBytes() {
        return ioInterconnectBytes;
    }

    /**
     * Number of physical read I/O requests issued by the monitored SQL. The requests may not be disk reads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadRequests")
    private final Long physicalReadRequests;

    public Long getPhysicalReadRequests() {
        return physicalReadRequests;
    }

    /**
     * Number of bytes read from disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalReadBytes")
    private final Long physicalReadBytes;

    public Long getPhysicalReadBytes() {
        return physicalReadBytes;
    }

    /**
     * Number of physical write I/O requests issued by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteRequests")
    private final Long physicalWriteRequests;

    public Long getPhysicalWriteRequests() {
        return physicalWriteRequests;
    }

    /**
     * Number of bytes written to disks by the monitored SQL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalWriteBytes")
    private final Long physicalWriteBytes;

    public Long getPhysicalWriteBytes() {
        return physicalWriteBytes;
    }

    /**
     * exact_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exactMatchingSignature")
    private final String exactMatchingSignature;

    public String getExactMatchingSignature() {
        return exactMatchingSignature;
    }

    /**
     * force_matching_signature
     * Example: {@code "18067345456756876713"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceMatchingSignature")
    private final String forceMatchingSignature;

    public String getForceMatchingSignature() {
        return forceMatchingSignature;
    }

    /**
     * Number of uncompressed bytes (that is, size after decompression) that are offloaded to the Exadata cells
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellUncompressedBytes")
    private final Long ioCellUncompressedBytes;

    public Long getIoCellUncompressedBytes() {
        return ioCellUncompressedBytes;
    }

    /**
     * Number of bytes that are returned by Exadata cell through the regular I/O path
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCellOffloadReturnedBytes")
    private final Long ioCellOffloadReturnedBytes;

    public Long getIoCellOffloadReturnedBytes() {
        return ioCellOffloadReturnedBytes;
    }

    /**
     * Number of this child cursor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childNumber")
    private final Long childNumber;

    public Long getChildNumber() {
        return childNumber;
    }

    /**
     * Oracle command type definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandType")
    private final Long commandType;

    public Long getCommandType() {
        return commandType;
    }

    /**
     * Number of users that have any of the child cursors open
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersOpening")
    private final Long usersOpening;

    public Long getUsersOpening() {
        return usersOpening;
    }

    /**
     * Number of users executing the statement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usersExecuting")
    private final Long usersExecuting;

    public Long getUsersExecuting() {
        return usersExecuting;
    }

    /**
     * Cost of this query given by the optimizer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerCost")
    private final Long optimizerCost;

    public Long getOptimizerCost() {
        return optimizerCost;
    }

    /**
     * Total Number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fullPlanHashValue")
    private final String fullPlanHashValue;

    public String getFullPlanHashValue() {
        return fullPlanHashValue;
    }

    /**
     * Module name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("module")
    private final String module;

    public String getModule() {
        return module;
    }

    /**
     * Service name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    public String getService() {
        return service;
    }

    /**
     * Contains the name of the action that was executing when the SQL statement was first parsed, which is set by calling DBMS_APPLICATION_INFO.SET_ACTION
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    public String getAction() {
        return action;
    }

    /**
     * SQL profile used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlProfile")
    private final String sqlProfile;

    public String getSqlProfile() {
        return sqlProfile;
    }

    /**
     * SQL patch used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPatch")
    private final String sqlPatch;

    public String getSqlPatch() {
        return sqlPatch;
    }

    /**
     * SQL plan baseline used for this statement, if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPlanBaseline")
    private final String sqlPlanBaseline;

    public String getSqlPlanBaseline() {
        return sqlPlanBaseline;
    }

    /**
     * Number of executions for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecutionCount")
    private final Long deltaExecutionCount;

    public Long getDeltaExecutionCount() {
        return deltaExecutionCount;
    }

    /**
     * CPU time (in microseconds) for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuTime")
    private final Long deltaCpuTime;

    public Long getDeltaCpuTime() {
        return deltaCpuTime;
    }

    /**
     * Number of I/O bytes exchanged between the Oracle database and the storage system for the cursor since the last AWR snapshot
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoBytes")
    private final Long deltaIoBytes;

    public Long getDeltaIoBytes() {
        return deltaIoBytes;
    }

    /**
     * Rank based on CPU Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaCpuRank")
    private final Long deltaCpuRank;

    public Long getDeltaCpuRank() {
        return deltaCpuRank;
    }

    /**
     * Rank based on number of execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaExecsRank")
    private final Long deltaExecsRank;

    public Long getDeltaExecsRank() {
        return deltaExecsRank;
    }

    /**
     * Rank based on sharable memory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharableMemRank")
    private final Long sharableMemRank;

    public Long getSharableMemRank() {
        return sharableMemRank;
    }

    /**
     * Rank based on I/O Consumption
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deltaIoRank")
    private final Long deltaIoRank;

    public Long getDeltaIoRank() {
        return deltaIoRank;
    }

    /**
     * Harmonic sum based on ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harmonicSum")
    private final Long harmonicSum;

    public Long getHarmonicSum() {
        return harmonicSum;
    }

    /**
     * Weight based harmonic sum of ranking parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wtHarmonicSum")
    private final Long wtHarmonicSum;

    public Long getWtHarmonicSum() {
        return wtHarmonicSum;
    }

    /**
     * Total number of rows in SQLStats table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqlCount")
    private final Long totalSqlCount;

    public Long getTotalSqlCount() {
        return totalSqlCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlStats(");
        sb.append("sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", planHashValue=").append(String.valueOf(this.planHashValue));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", lastActiveTime=").append(String.valueOf(this.lastActiveTime));
        sb.append(", parseCalls=").append(String.valueOf(this.parseCalls));
        sb.append(", diskReads=").append(String.valueOf(this.diskReads));
        sb.append(", directReads=").append(String.valueOf(this.directReads));
        sb.append(", directWrites=").append(String.valueOf(this.directWrites));
        sb.append(", bufferGets=").append(String.valueOf(this.bufferGets));
        sb.append(", rowsProcessed=").append(String.valueOf(this.rowsProcessed));
        sb.append(", serializableAborts=").append(String.valueOf(this.serializableAborts));
        sb.append(", fetches=").append(String.valueOf(this.fetches));
        sb.append(", executions=").append(String.valueOf(this.executions));
        sb.append(", avoidedExecutions=").append(String.valueOf(this.avoidedExecutions));
        sb.append(", endOfFetchCount=").append(String.valueOf(this.endOfFetchCount));
        sb.append(", loads=").append(String.valueOf(this.loads));
        sb.append(", versionCount=").append(String.valueOf(this.versionCount));
        sb.append(", invalidations=").append(String.valueOf(this.invalidations));
        sb.append(", obsoleteCount=").append(String.valueOf(this.obsoleteCount));
        sb.append(", pxServersExecutions=").append(String.valueOf(this.pxServersExecutions));
        sb.append(", cpuTimeInUs=").append(String.valueOf(this.cpuTimeInUs));
        sb.append(", elapsedTimeInUs=").append(String.valueOf(this.elapsedTimeInUs));
        sb.append(", avgHardParseTimeInUs=").append(String.valueOf(this.avgHardParseTimeInUs));
        sb.append(", concurrencyWaitTimeInUs=")
                .append(String.valueOf(this.concurrencyWaitTimeInUs));
        sb.append(", applicationWaitTimeInUs=")
                .append(String.valueOf(this.applicationWaitTimeInUs));
        sb.append(", clusterWaitTimeInUs=").append(String.valueOf(this.clusterWaitTimeInUs));
        sb.append(", userIoWaitTimeInUs=").append(String.valueOf(this.userIoWaitTimeInUs));
        sb.append(", plsqlExecTimeInUs=").append(String.valueOf(this.plsqlExecTimeInUs));
        sb.append(", javaExecTimeInUs=").append(String.valueOf(this.javaExecTimeInUs));
        sb.append(", sorts=").append(String.valueOf(this.sorts));
        sb.append(", sharableMem=").append(String.valueOf(this.sharableMem));
        sb.append(", totalSharableMem=").append(String.valueOf(this.totalSharableMem));
        sb.append(", typeCheckMem=").append(String.valueOf(this.typeCheckMem));
        sb.append(", ioCellOffloadEligibleBytes=")
                .append(String.valueOf(this.ioCellOffloadEligibleBytes));
        sb.append(", ioInterconnectBytes=").append(String.valueOf(this.ioInterconnectBytes));
        sb.append(", physicalReadRequests=").append(String.valueOf(this.physicalReadRequests));
        sb.append(", physicalReadBytes=").append(String.valueOf(this.physicalReadBytes));
        sb.append(", physicalWriteRequests=").append(String.valueOf(this.physicalWriteRequests));
        sb.append(", physicalWriteBytes=").append(String.valueOf(this.physicalWriteBytes));
        sb.append(", exactMatchingSignature=").append(String.valueOf(this.exactMatchingSignature));
        sb.append(", forceMatchingSignature=").append(String.valueOf(this.forceMatchingSignature));
        sb.append(", ioCellUncompressedBytes=")
                .append(String.valueOf(this.ioCellUncompressedBytes));
        sb.append(", ioCellOffloadReturnedBytes=")
                .append(String.valueOf(this.ioCellOffloadReturnedBytes));
        sb.append(", childNumber=").append(String.valueOf(this.childNumber));
        sb.append(", commandType=").append(String.valueOf(this.commandType));
        sb.append(", usersOpening=").append(String.valueOf(this.usersOpening));
        sb.append(", usersExecuting=").append(String.valueOf(this.usersExecuting));
        sb.append(", optimizerCost=").append(String.valueOf(this.optimizerCost));
        sb.append(", fullPlanHashValue=").append(String.valueOf(this.fullPlanHashValue));
        sb.append(", module=").append(String.valueOf(this.module));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", sqlProfile=").append(String.valueOf(this.sqlProfile));
        sb.append(", sqlPatch=").append(String.valueOf(this.sqlPatch));
        sb.append(", sqlPlanBaseline=").append(String.valueOf(this.sqlPlanBaseline));
        sb.append(", deltaExecutionCount=").append(String.valueOf(this.deltaExecutionCount));
        sb.append(", deltaCpuTime=").append(String.valueOf(this.deltaCpuTime));
        sb.append(", deltaIoBytes=").append(String.valueOf(this.deltaIoBytes));
        sb.append(", deltaCpuRank=").append(String.valueOf(this.deltaCpuRank));
        sb.append(", deltaExecsRank=").append(String.valueOf(this.deltaExecsRank));
        sb.append(", sharableMemRank=").append(String.valueOf(this.sharableMemRank));
        sb.append(", deltaIoRank=").append(String.valueOf(this.deltaIoRank));
        sb.append(", harmonicSum=").append(String.valueOf(this.harmonicSum));
        sb.append(", wtHarmonicSum=").append(String.valueOf(this.wtHarmonicSum));
        sb.append(", totalSqlCount=").append(String.valueOf(this.totalSqlCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStats)) {
            return false;
        }

        SqlStats other = (SqlStats) o;
        return java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.planHashValue, other.planHashValue)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.lastActiveTime, other.lastActiveTime)
                && java.util.Objects.equals(this.parseCalls, other.parseCalls)
                && java.util.Objects.equals(this.diskReads, other.diskReads)
                && java.util.Objects.equals(this.directReads, other.directReads)
                && java.util.Objects.equals(this.directWrites, other.directWrites)
                && java.util.Objects.equals(this.bufferGets, other.bufferGets)
                && java.util.Objects.equals(this.rowsProcessed, other.rowsProcessed)
                && java.util.Objects.equals(this.serializableAborts, other.serializableAborts)
                && java.util.Objects.equals(this.fetches, other.fetches)
                && java.util.Objects.equals(this.executions, other.executions)
                && java.util.Objects.equals(this.avoidedExecutions, other.avoidedExecutions)
                && java.util.Objects.equals(this.endOfFetchCount, other.endOfFetchCount)
                && java.util.Objects.equals(this.loads, other.loads)
                && java.util.Objects.equals(this.versionCount, other.versionCount)
                && java.util.Objects.equals(this.invalidations, other.invalidations)
                && java.util.Objects.equals(this.obsoleteCount, other.obsoleteCount)
                && java.util.Objects.equals(this.pxServersExecutions, other.pxServersExecutions)
                && java.util.Objects.equals(this.cpuTimeInUs, other.cpuTimeInUs)
                && java.util.Objects.equals(this.elapsedTimeInUs, other.elapsedTimeInUs)
                && java.util.Objects.equals(this.avgHardParseTimeInUs, other.avgHardParseTimeInUs)
                && java.util.Objects.equals(
                        this.concurrencyWaitTimeInUs, other.concurrencyWaitTimeInUs)
                && java.util.Objects.equals(
                        this.applicationWaitTimeInUs, other.applicationWaitTimeInUs)
                && java.util.Objects.equals(this.clusterWaitTimeInUs, other.clusterWaitTimeInUs)
                && java.util.Objects.equals(this.userIoWaitTimeInUs, other.userIoWaitTimeInUs)
                && java.util.Objects.equals(this.plsqlExecTimeInUs, other.plsqlExecTimeInUs)
                && java.util.Objects.equals(this.javaExecTimeInUs, other.javaExecTimeInUs)
                && java.util.Objects.equals(this.sorts, other.sorts)
                && java.util.Objects.equals(this.sharableMem, other.sharableMem)
                && java.util.Objects.equals(this.totalSharableMem, other.totalSharableMem)
                && java.util.Objects.equals(this.typeCheckMem, other.typeCheckMem)
                && java.util.Objects.equals(
                        this.ioCellOffloadEligibleBytes, other.ioCellOffloadEligibleBytes)
                && java.util.Objects.equals(this.ioInterconnectBytes, other.ioInterconnectBytes)
                && java.util.Objects.equals(this.physicalReadRequests, other.physicalReadRequests)
                && java.util.Objects.equals(this.physicalReadBytes, other.physicalReadBytes)
                && java.util.Objects.equals(this.physicalWriteRequests, other.physicalWriteRequests)
                && java.util.Objects.equals(this.physicalWriteBytes, other.physicalWriteBytes)
                && java.util.Objects.equals(
                        this.exactMatchingSignature, other.exactMatchingSignature)
                && java.util.Objects.equals(
                        this.forceMatchingSignature, other.forceMatchingSignature)
                && java.util.Objects.equals(
                        this.ioCellUncompressedBytes, other.ioCellUncompressedBytes)
                && java.util.Objects.equals(
                        this.ioCellOffloadReturnedBytes, other.ioCellOffloadReturnedBytes)
                && java.util.Objects.equals(this.childNumber, other.childNumber)
                && java.util.Objects.equals(this.commandType, other.commandType)
                && java.util.Objects.equals(this.usersOpening, other.usersOpening)
                && java.util.Objects.equals(this.usersExecuting, other.usersExecuting)
                && java.util.Objects.equals(this.optimizerCost, other.optimizerCost)
                && java.util.Objects.equals(this.fullPlanHashValue, other.fullPlanHashValue)
                && java.util.Objects.equals(this.module, other.module)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.sqlProfile, other.sqlProfile)
                && java.util.Objects.equals(this.sqlPatch, other.sqlPatch)
                && java.util.Objects.equals(this.sqlPlanBaseline, other.sqlPlanBaseline)
                && java.util.Objects.equals(this.deltaExecutionCount, other.deltaExecutionCount)
                && java.util.Objects.equals(this.deltaCpuTime, other.deltaCpuTime)
                && java.util.Objects.equals(this.deltaIoBytes, other.deltaIoBytes)
                && java.util.Objects.equals(this.deltaCpuRank, other.deltaCpuRank)
                && java.util.Objects.equals(this.deltaExecsRank, other.deltaExecsRank)
                && java.util.Objects.equals(this.sharableMemRank, other.sharableMemRank)
                && java.util.Objects.equals(this.deltaIoRank, other.deltaIoRank)
                && java.util.Objects.equals(this.harmonicSum, other.harmonicSum)
                && java.util.Objects.equals(this.wtHarmonicSum, other.wtHarmonicSum)
                && java.util.Objects.equals(this.totalSqlCount, other.totalSqlCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.planHashValue == null ? 43 : this.planHashValue.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result =
                (result * PRIME)
                        + (this.lastActiveTime == null ? 43 : this.lastActiveTime.hashCode());
        result = (result * PRIME) + (this.parseCalls == null ? 43 : this.parseCalls.hashCode());
        result = (result * PRIME) + (this.diskReads == null ? 43 : this.diskReads.hashCode());
        result = (result * PRIME) + (this.directReads == null ? 43 : this.directReads.hashCode());
        result = (result * PRIME) + (this.directWrites == null ? 43 : this.directWrites.hashCode());
        result = (result * PRIME) + (this.bufferGets == null ? 43 : this.bufferGets.hashCode());
        result =
                (result * PRIME)
                        + (this.rowsProcessed == null ? 43 : this.rowsProcessed.hashCode());
        result =
                (result * PRIME)
                        + (this.serializableAborts == null
                                ? 43
                                : this.serializableAborts.hashCode());
        result = (result * PRIME) + (this.fetches == null ? 43 : this.fetches.hashCode());
        result = (result * PRIME) + (this.executions == null ? 43 : this.executions.hashCode());
        result =
                (result * PRIME)
                        + (this.avoidedExecutions == null ? 43 : this.avoidedExecutions.hashCode());
        result =
                (result * PRIME)
                        + (this.endOfFetchCount == null ? 43 : this.endOfFetchCount.hashCode());
        result = (result * PRIME) + (this.loads == null ? 43 : this.loads.hashCode());
        result = (result * PRIME) + (this.versionCount == null ? 43 : this.versionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.invalidations == null ? 43 : this.invalidations.hashCode());
        result =
                (result * PRIME)
                        + (this.obsoleteCount == null ? 43 : this.obsoleteCount.hashCode());
        result =
                (result * PRIME)
                        + (this.pxServersExecutions == null
                                ? 43
                                : this.pxServersExecutions.hashCode());
        result = (result * PRIME) + (this.cpuTimeInUs == null ? 43 : this.cpuTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.elapsedTimeInUs == null ? 43 : this.elapsedTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.avgHardParseTimeInUs == null
                                ? 43
                                : this.avgHardParseTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.concurrencyWaitTimeInUs == null
                                ? 43
                                : this.concurrencyWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationWaitTimeInUs == null
                                ? 43
                                : this.applicationWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterWaitTimeInUs == null
                                ? 43
                                : this.clusterWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.userIoWaitTimeInUs == null
                                ? 43
                                : this.userIoWaitTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.plsqlExecTimeInUs == null ? 43 : this.plsqlExecTimeInUs.hashCode());
        result =
                (result * PRIME)
                        + (this.javaExecTimeInUs == null ? 43 : this.javaExecTimeInUs.hashCode());
        result = (result * PRIME) + (this.sorts == null ? 43 : this.sorts.hashCode());
        result = (result * PRIME) + (this.sharableMem == null ? 43 : this.sharableMem.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSharableMem == null ? 43 : this.totalSharableMem.hashCode());
        result = (result * PRIME) + (this.typeCheckMem == null ? 43 : this.typeCheckMem.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellOffloadEligibleBytes == null
                                ? 43
                                : this.ioCellOffloadEligibleBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.ioInterconnectBytes == null
                                ? 43
                                : this.ioInterconnectBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalReadRequests == null
                                ? 43
                                : this.physicalReadRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalReadBytes == null ? 43 : this.physicalReadBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalWriteRequests == null
                                ? 43
                                : this.physicalWriteRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalWriteBytes == null
                                ? 43
                                : this.physicalWriteBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.exactMatchingSignature == null
                                ? 43
                                : this.exactMatchingSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.forceMatchingSignature == null
                                ? 43
                                : this.forceMatchingSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellUncompressedBytes == null
                                ? 43
                                : this.ioCellUncompressedBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.ioCellOffloadReturnedBytes == null
                                ? 43
                                : this.ioCellOffloadReturnedBytes.hashCode());
        result = (result * PRIME) + (this.childNumber == null ? 43 : this.childNumber.hashCode());
        result = (result * PRIME) + (this.commandType == null ? 43 : this.commandType.hashCode());
        result = (result * PRIME) + (this.usersOpening == null ? 43 : this.usersOpening.hashCode());
        result =
                (result * PRIME)
                        + (this.usersExecuting == null ? 43 : this.usersExecuting.hashCode());
        result =
                (result * PRIME)
                        + (this.optimizerCost == null ? 43 : this.optimizerCost.hashCode());
        result =
                (result * PRIME)
                        + (this.fullPlanHashValue == null ? 43 : this.fullPlanHashValue.hashCode());
        result = (result * PRIME) + (this.module == null ? 43 : this.module.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.sqlProfile == null ? 43 : this.sqlProfile.hashCode());
        result = (result * PRIME) + (this.sqlPatch == null ? 43 : this.sqlPatch.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlPlanBaseline == null ? 43 : this.sqlPlanBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaExecutionCount == null
                                ? 43
                                : this.deltaExecutionCount.hashCode());
        result = (result * PRIME) + (this.deltaCpuTime == null ? 43 : this.deltaCpuTime.hashCode());
        result = (result * PRIME) + (this.deltaIoBytes == null ? 43 : this.deltaIoBytes.hashCode());
        result = (result * PRIME) + (this.deltaCpuRank == null ? 43 : this.deltaCpuRank.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaExecsRank == null ? 43 : this.deltaExecsRank.hashCode());
        result =
                (result * PRIME)
                        + (this.sharableMemRank == null ? 43 : this.sharableMemRank.hashCode());
        result = (result * PRIME) + (this.deltaIoRank == null ? 43 : this.deltaIoRank.hashCode());
        result = (result * PRIME) + (this.harmonicSum == null ? 43 : this.harmonicSum.hashCode());
        result =
                (result * PRIME)
                        + (this.wtHarmonicSum == null ? 43 : this.wtHarmonicSum.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSqlCount == null ? 43 : this.totalSqlCount.hashCode());
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
