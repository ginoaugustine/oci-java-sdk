/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains common summary statistics.
 *
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
    builder = SummaryStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummaryStatistics {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minimum",
        "maximum",
        "average",
        "median",
        "lowerQuartile",
        "upperQuartile"
    })
    public SummaryStatistics(
            Double minimum,
            Double maximum,
            Double average,
            Double median,
            Double lowerQuartile,
            Double upperQuartile) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;
        this.median = median;
        this.lowerQuartile = lowerQuartile;
        this.upperQuartile = upperQuartile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Double minimum;

        public Builder minimum(Double minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Double maximum;

        public Builder maximum(Double maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("average")
        private Double average;

        public Builder average(Double average) {
            this.average = average;
            this.__explicitlySet__.add("average");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private Double median;

        public Builder median(Double median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
        private Double lowerQuartile;

        public Builder lowerQuartile(Double lowerQuartile) {
            this.lowerQuartile = lowerQuartile;
            this.__explicitlySet__.add("lowerQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
        private Double upperQuartile;

        public Builder upperQuartile(Double upperQuartile) {
            this.upperQuartile = upperQuartile;
            this.__explicitlySet__.add("upperQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummaryStatistics build() {
            SummaryStatistics __instance__ =
                    new SummaryStatistics(
                            minimum, maximum, average, median, lowerQuartile, upperQuartile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummaryStatistics o) {
            Builder copiedBuilder =
                    minimum(o.getMinimum())
                            .maximum(o.getMaximum())
                            .average(o.getAverage())
                            .median(o.getMedian())
                            .lowerQuartile(o.getLowerQuartile())
                            .upperQuartile(o.getUpperQuartile());

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
     * The smallest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final Double minimum;

    public Double getMinimum() {
        return minimum;
    }

    /**
     * The largest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private final Double maximum;

    public Double getMaximum() {
        return maximum;
    }

    /**
     * The average number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("average")
    private final Double average;

    public Double getAverage() {
        return average;
    }

    /**
     * The middle number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    private final Double median;

    public Double getMedian() {
        return median;
    }

    /**
     * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    private final Double lowerQuartile;

    public Double getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    private final Double upperQuartile;

    public Double getUpperQuartile() {
        return upperQuartile;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SummaryStatistics(");
        sb.append("minimum=").append(String.valueOf(this.minimum));
        sb.append(", maximum=").append(String.valueOf(this.maximum));
        sb.append(", average=").append(String.valueOf(this.average));
        sb.append(", median=").append(String.valueOf(this.median));
        sb.append(", lowerQuartile=").append(String.valueOf(this.lowerQuartile));
        sb.append(", upperQuartile=").append(String.valueOf(this.upperQuartile));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummaryStatistics)) {
            return false;
        }

        SummaryStatistics other = (SummaryStatistics) o;
        return java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.maximum, other.maximum)
                && java.util.Objects.equals(this.average, other.average)
                && java.util.Objects.equals(this.median, other.median)
                && java.util.Objects.equals(this.lowerQuartile, other.lowerQuartile)
                && java.util.Objects.equals(this.upperQuartile, other.upperQuartile)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
        result = (result * PRIME) + (this.maximum == null ? 43 : this.maximum.hashCode());
        result = (result * PRIME) + (this.average == null ? 43 : this.average.hashCode());
        result = (result * PRIME) + (this.median == null ? 43 : this.median.hashCode());
        result =
                (result * PRIME)
                        + (this.lowerQuartile == null ? 43 : this.lowerQuartile.hashCode());
        result =
                (result * PRIME)
                        + (this.upperQuartile == null ? 43 : this.upperQuartile.hashCode());
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
