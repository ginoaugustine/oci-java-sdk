/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional settings for Oracle GoldenGate processes
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GoldenGateSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GoldenGateSettings {
    @Deprecated
    @java.beans.ConstructorProperties({"extract", "replicat", "acceptableLag"})
    public GoldenGateSettings(Extract extract, Replicat replicat, Integer acceptableLag) {
        super();
        this.extract = extract;
        this.replicat = replicat;
        this.acceptableLag = acceptableLag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private Extract extract;

        public Builder extract(Extract extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicat")
        private Replicat replicat;

        public Builder replicat(Replicat replicat) {
            this.replicat = replicat;
            this.__explicitlySet__.add("replicat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
        private Integer acceptableLag;

        public Builder acceptableLag(Integer acceptableLag) {
            this.acceptableLag = acceptableLag;
            this.__explicitlySet__.add("acceptableLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GoldenGateSettings build() {
            GoldenGateSettings __instance__ =
                    new GoldenGateSettings(extract, replicat, acceptableLag);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GoldenGateSettings o) {
            Builder copiedBuilder =
                    extract(o.getExtract())
                            .replicat(o.getReplicat())
                            .acceptableLag(o.getAcceptableLag());

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

    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    private final Extract extract;

    public Extract getExtract() {
        return extract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicat")
    private final Replicat replicat;

    public Replicat getReplicat() {
        return replicat;
    }

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
    private final Integer acceptableLag;

    public Integer getAcceptableLag() {
        return acceptableLag;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GoldenGateSettings(");
        sb.append("extract=").append(String.valueOf(this.extract));
        sb.append(", replicat=").append(String.valueOf(this.replicat));
        sb.append(", acceptableLag=").append(String.valueOf(this.acceptableLag));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoldenGateSettings)) {
            return false;
        }

        GoldenGateSettings other = (GoldenGateSettings) o;
        return java.util.Objects.equals(this.extract, other.extract)
                && java.util.Objects.equals(this.replicat, other.replicat)
                && java.util.Objects.equals(this.acceptableLag, other.acceptableLag)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.extract == null ? 43 : this.extract.hashCode());
        result = (result * PRIME) + (this.replicat == null ? 43 : this.replicat.hashCode());
        result =
                (result * PRIME)
                        + (this.acceptableLag == null ? 43 : this.acceptableLag.hashCode());
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
