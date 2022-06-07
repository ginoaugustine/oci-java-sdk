/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * Capacity limits for the instance pool.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capacity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Capacity {
    @Deprecated
    @java.beans.ConstructorProperties({"max", "min", "initial"})
    public Capacity(Integer max, Integer min, Integer initial) {
        super();
        this.max = max;
        this.min = min;
        this.initial = initial;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Integer max;

        public Builder max(Integer max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initial")
        private Integer initial;

        public Builder initial(Integer initial) {
            this.initial = initial;
            this.__explicitlySet__.add("initial");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capacity build() {
            Capacity __instance__ = new Capacity(max, min, initial);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capacity o) {
            Builder copiedBuilder = max(o.getMax()).min(o.getMin()).initial(o.getInitial());

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
     * For a threshold-based autoscaling policy, this value is the maximum number of instances the instance pool is allowed
     * to increase to (scale out).
     * <p>
     * For a schedule-based autoscaling policy, this value is not used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Integer max;

    public Integer getMax() {
        return max;
    }

    /**
     * For a threshold-based autoscaling policy, this value is the minimum number of instances the instance pool is allowed
     * to decrease to (scale in).
     * <p>
     * For a schedule-based autoscaling policy, this value is not used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Integer min;

    public Integer getMin() {
        return min;
    }

    /**
     * For a threshold-based autoscaling policy, this value is the initial number of instances to launch in the instance pool
     * immediately after autoscaling is enabled. After autoscaling retrieves performance metrics, the number of
     * instances is automatically adjusted from this initial number to a number that is based on the limits that
     * you set.
     * <p>
     * For a schedule-based autoscaling policy, this value is the target pool size to scale to when executing the schedule
     * that's defined in the autoscaling policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initial")
    private final Integer initial;

    public Integer getInitial() {
        return initial;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Capacity(");
        sb.append("max=").append(String.valueOf(this.max));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append(", initial=").append(String.valueOf(this.initial));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Capacity)) {
            return false;
        }

        Capacity other = (Capacity) o;
        return java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.initial, other.initial)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.initial == null ? 43 : this.initial.hashCode());
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
