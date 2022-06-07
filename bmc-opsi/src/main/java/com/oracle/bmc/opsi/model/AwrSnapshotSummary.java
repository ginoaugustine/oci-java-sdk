/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The AWR snapshot summary of one snapshot.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrSnapshotSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrSnapshotSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrSourceDatabaseId",
        "instanceNumber",
        "timeDbStartup",
        "timeSnapshotBegin",
        "timeSnapshotEnd",
        "snapshotIdentifier",
        "errorCount"
    })
    public AwrSnapshotSummary(
            String awrSourceDatabaseId,
            Integer instanceNumber,
            java.util.Date timeDbStartup,
            java.util.Date timeSnapshotBegin,
            java.util.Date timeSnapshotEnd,
            Integer snapshotIdentifier,
            Long errorCount) {
        super();
        this.awrSourceDatabaseId = awrSourceDatabaseId;
        this.instanceNumber = instanceNumber;
        this.timeDbStartup = timeDbStartup;
        this.timeSnapshotBegin = timeSnapshotBegin;
        this.timeSnapshotEnd = timeSnapshotEnd;
        this.snapshotIdentifier = snapshotIdentifier;
        this.errorCount = errorCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
        private java.util.Date timeDbStartup;

        public Builder timeDbStartup(java.util.Date timeDbStartup) {
            this.timeDbStartup = timeDbStartup;
            this.__explicitlySet__.add("timeDbStartup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
        private java.util.Date timeSnapshotBegin;

        public Builder timeSnapshotBegin(java.util.Date timeSnapshotBegin) {
            this.timeSnapshotBegin = timeSnapshotBegin;
            this.__explicitlySet__.add("timeSnapshotBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
        private java.util.Date timeSnapshotEnd;

        public Builder timeSnapshotEnd(java.util.Date timeSnapshotEnd) {
            this.timeSnapshotEnd = timeSnapshotEnd;
            this.__explicitlySet__.add("timeSnapshotEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
        private Integer snapshotIdentifier;

        public Builder snapshotIdentifier(Integer snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            this.__explicitlySet__.add("snapshotIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Long errorCount;

        public Builder errorCount(Long errorCount) {
            this.errorCount = errorCount;
            this.__explicitlySet__.add("errorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrSnapshotSummary build() {
            AwrSnapshotSummary __instance__ =
                    new AwrSnapshotSummary(
                            awrSourceDatabaseId,
                            instanceNumber,
                            timeDbStartup,
                            timeSnapshotBegin,
                            timeSnapshotEnd,
                            snapshotIdentifier,
                            errorCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrSnapshotSummary o) {
            Builder copiedBuilder =
                    awrSourceDatabaseId(o.getAwrSourceDatabaseId())
                            .instanceNumber(o.getInstanceNumber())
                            .timeDbStartup(o.getTimeDbStartup())
                            .timeSnapshotBegin(o.getTimeSnapshotBegin())
                            .timeSnapshotEnd(o.getTimeSnapshotEnd())
                            .snapshotIdentifier(o.getSnapshotIdentifier())
                            .errorCount(o.getErrorCount());

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
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    private final String awrSourceDatabaseId;

    public String getAwrSourceDatabaseId() {
        return awrSourceDatabaseId;
    }

    /**
     * The database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * The timestamp of the database startup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    private final java.util.Date timeDbStartup;

    public java.util.Date getTimeDbStartup() {
        return timeDbStartup;
    }

    /**
     * The start time of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
    private final java.util.Date timeSnapshotBegin;

    public java.util.Date getTimeSnapshotBegin() {
        return timeSnapshotBegin;
    }

    /**
     * The end time of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
    private final java.util.Date timeSnapshotEnd;

    public java.util.Date getTimeSnapshotEnd() {
        return timeSnapshotEnd;
    }

    /**
     * The identifier of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
    private final Integer snapshotIdentifier;

    public Integer getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * The total number of errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    private final Long errorCount;

    public Long getErrorCount() {
        return errorCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrSnapshotSummary(");
        sb.append("awrSourceDatabaseId=").append(String.valueOf(this.awrSourceDatabaseId));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", timeDbStartup=").append(String.valueOf(this.timeDbStartup));
        sb.append(", timeSnapshotBegin=").append(String.valueOf(this.timeSnapshotBegin));
        sb.append(", timeSnapshotEnd=").append(String.valueOf(this.timeSnapshotEnd));
        sb.append(", snapshotIdentifier=").append(String.valueOf(this.snapshotIdentifier));
        sb.append(", errorCount=").append(String.valueOf(this.errorCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrSnapshotSummary)) {
            return false;
        }

        AwrSnapshotSummary other = (AwrSnapshotSummary) o;
        return java.util.Objects.equals(this.awrSourceDatabaseId, other.awrSourceDatabaseId)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.timeDbStartup, other.timeDbStartup)
                && java.util.Objects.equals(this.timeSnapshotBegin, other.timeSnapshotBegin)
                && java.util.Objects.equals(this.timeSnapshotEnd, other.timeSnapshotEnd)
                && java.util.Objects.equals(this.snapshotIdentifier, other.snapshotIdentifier)
                && java.util.Objects.equals(this.errorCount, other.errorCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseId == null
                                ? 43
                                : this.awrSourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDbStartup == null ? 43 : this.timeDbStartup.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotBegin == null ? 43 : this.timeSnapshotBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotEnd == null ? 43 : this.timeSnapshotEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIdentifier == null
                                ? 43
                                : this.snapshotIdentifier.hashCode());
        result = (result * PRIME) + (this.errorCount == null ? 43 : this.errorCount.hashCode());
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
