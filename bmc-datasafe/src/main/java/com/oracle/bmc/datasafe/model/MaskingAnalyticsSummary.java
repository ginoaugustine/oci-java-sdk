/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of masking analytics data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaskingAnalyticsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaskingAnalyticsSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"metricName", "dimensions", "count"})
    public MaskingAnalyticsSummary(
            MetricName metricName, MaskingAnalyticsDimensions dimensions, Long count) {
        super();
        this.metricName = metricName;
        this.dimensions = dimensions;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private MetricName metricName;

        public Builder metricName(MetricName metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private MaskingAnalyticsDimensions dimensions;

        public Builder dimensions(MaskingAnalyticsDimensions dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Long count;

        public Builder count(Long count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingAnalyticsSummary build() {
            MaskingAnalyticsSummary __instance__ =
                    new MaskingAnalyticsSummary(metricName, dimensions, count);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingAnalyticsSummary o) {
            Builder copiedBuilder =
                    metricName(o.getMetricName()).dimensions(o.getDimensions()).count(o.getCount());

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
     * The name of the aggregation metric.
     **/
    public enum MetricName {
        MaskingPolicy("MASKING_POLICY"),
        MaskingDatabase("MASKING_DATABASE"),
        MaskingWorkRequest("MASKING_WORK_REQUEST"),
        MaskedSensitiveType("MASKED_SENSITIVE_TYPE"),
        MaskedSchema("MASKED_SCHEMA"),
        MaskedTable("MASKED_TABLE"),
        MaskedColumn("MASKED_COLUMN"),
        MaskedDataValue("MASKED_DATA_VALUE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetricName.class);

        private final String value;
        private static java.util.Map<String, MetricName> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricName v : MetricName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetricName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetricName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The name of the aggregation metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final MetricName metricName;

    public MetricName getMetricName() {
        return metricName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final MaskingAnalyticsDimensions dimensions;

    public MaskingAnalyticsDimensions getDimensions() {
        return dimensions;
    }

    /**
     * The total count for the aggregation metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Long count;

    public Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MaskingAnalyticsSummary(");
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingAnalyticsSummary)) {
            return false;
        }

        MaskingAnalyticsSummary other = (MaskingAnalyticsSummary) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
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
