/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The filter for Bitbucket Cloud events.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BitbucketCloudFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "triggerSource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BitbucketCloudFilter extends Filter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("events")
        private java.util.List<Events> events;

        public Builder events(java.util.List<Events> events) {
            this.events = events;
            this.__explicitlySet__.add("events");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("include")
        private BitbucketCloudFilterAttributes include;

        public Builder include(BitbucketCloudFilterAttributes include) {
            this.include = include;
            this.__explicitlySet__.add("include");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BitbucketCloudFilter build() {
            BitbucketCloudFilter __instance__ = new BitbucketCloudFilter(events, include);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BitbucketCloudFilter o) {
            Builder copiedBuilder = events(o.getEvents()).include(o.getInclude());

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

    @Deprecated
    public BitbucketCloudFilter(
            java.util.List<Events> events, BitbucketCloudFilterAttributes include) {
        super();
        this.events = events;
        this.include = include;
    }

    /**
     **/
    public enum Events {
        Push("PUSH"),
        PullRequestCreated("PULL_REQUEST_CREATED"),
        PullRequestUpdated("PULL_REQUEST_UPDATED"),
        PullRequestMerged("PULL_REQUEST_MERGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Events.class);

        private final String value;
        private static java.util.Map<String, Events> map;

        static {
            map = new java.util.HashMap<>();
            for (Events v : Events.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Events(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Events create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Events', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The events, for example, PUSH, PULL_REQUEST_MERGE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    private final java.util.List<Events> events;

    public java.util.List<Events> getEvents() {
        return events;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("include")
    private final BitbucketCloudFilterAttributes include;

    public BitbucketCloudFilterAttributes getInclude() {
        return include;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BitbucketCloudFilter(");
        sb.append("super=").append(super.toString());
        sb.append(", events=").append(String.valueOf(this.events));
        sb.append(", include=").append(String.valueOf(this.include));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BitbucketCloudFilter)) {
            return false;
        }

        BitbucketCloudFilter other = (BitbucketCloudFilter) o;
        return java.util.Objects.equals(this.events, other.events)
                && java.util.Objects.equals(this.include, other.include)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.events == null ? 43 : this.events.hashCode());
        result = (result * PRIME) + (this.include == null ? 43 : this.include.hashCode());
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
