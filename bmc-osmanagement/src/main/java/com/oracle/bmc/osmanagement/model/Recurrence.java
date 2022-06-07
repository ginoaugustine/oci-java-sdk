/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An object for representing a recurrence time interval
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recurrence.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Recurrence {
    @Deprecated
    @java.beans.ConstructorProperties({"intervalType", "intervalValue"})
    public Recurrence(IntervalType intervalType, String intervalValue) {
        super();
        this.intervalType = intervalType;
        this.intervalValue = intervalValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
        private IntervalType intervalType;

        public Builder intervalType(IntervalType intervalType) {
            this.intervalType = intervalType;
            this.__explicitlySet__.add("intervalType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
        private String intervalValue;

        public Builder intervalValue(String intervalValue) {
            this.intervalValue = intervalValue;
            this.__explicitlySet__.add("intervalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recurrence build() {
            Recurrence __instance__ = new Recurrence(intervalType, intervalValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recurrence o) {
            Builder copiedBuilder =
                    intervalType(o.getIntervalType()).intervalValue(o.getIntervalValue());

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
     * the interval period for the recurrence
     **/
    public enum IntervalType {
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),
        Weeks("WEEKS"),
        ;

        private final String value;
        private static java.util.Map<String, IntervalType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntervalType v : IntervalType.values()) {
                map.put(v.getValue(), v);
            }
        }

        IntervalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntervalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IntervalType: " + key);
        }
    };
    /**
     * the interval period for the recurrence
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalType")
    private final IntervalType intervalType;

    public IntervalType getIntervalType() {
        return intervalType;
    }

    /**
     * the value for the interval period for the recurrence
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalValue")
    private final String intervalValue;

    public String getIntervalValue() {
        return intervalValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Recurrence(");
        sb.append("intervalType=").append(String.valueOf(this.intervalType));
        sb.append(", intervalValue=").append(String.valueOf(this.intervalValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recurrence)) {
            return false;
        }

        Recurrence other = (Recurrence) o;
        return java.util.Objects.equals(this.intervalType, other.intervalType)
                && java.util.Objects.equals(this.intervalValue, other.intervalValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.intervalType == null ? 43 : this.intervalType.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalValue == null ? 43 : this.intervalValue.hashCode());
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
