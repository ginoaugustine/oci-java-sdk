/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsImportCustomChangeList
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsImportCustomChangeList.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsImportCustomChangeList {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createdParserNames",
        "updatedParserNames",
        "createdSourceNames",
        "updatedSourceNames",
        "createdFieldDisplayNames",
        "updatedFieldDisplayNames",
        "conflictParserNames",
        "conflictSourceNames",
        "conflictFieldDisplayNames"
    })
    public LogAnalyticsImportCustomChangeList(
            java.util.List<String> createdParserNames,
            java.util.List<String> updatedParserNames,
            java.util.List<String> createdSourceNames,
            java.util.List<String> updatedSourceNames,
            java.util.List<String> createdFieldDisplayNames,
            java.util.List<String> updatedFieldDisplayNames,
            java.util.List<String> conflictParserNames,
            java.util.List<String> conflictSourceNames,
            java.util.List<String> conflictFieldDisplayNames) {
        super();
        this.createdParserNames = createdParserNames;
        this.updatedParserNames = updatedParserNames;
        this.createdSourceNames = createdSourceNames;
        this.updatedSourceNames = updatedSourceNames;
        this.createdFieldDisplayNames = createdFieldDisplayNames;
        this.updatedFieldDisplayNames = updatedFieldDisplayNames;
        this.conflictParserNames = conflictParserNames;
        this.conflictSourceNames = conflictSourceNames;
        this.conflictFieldDisplayNames = conflictFieldDisplayNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("createdParserNames")
        private java.util.List<String> createdParserNames;

        public Builder createdParserNames(java.util.List<String> createdParserNames) {
            this.createdParserNames = createdParserNames;
            this.__explicitlySet__.add("createdParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedParserNames")
        private java.util.List<String> updatedParserNames;

        public Builder updatedParserNames(java.util.List<String> updatedParserNames) {
            this.updatedParserNames = updatedParserNames;
            this.__explicitlySet__.add("updatedParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdSourceNames")
        private java.util.List<String> createdSourceNames;

        public Builder createdSourceNames(java.util.List<String> createdSourceNames) {
            this.createdSourceNames = createdSourceNames;
            this.__explicitlySet__.add("createdSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedSourceNames")
        private java.util.List<String> updatedSourceNames;

        public Builder updatedSourceNames(java.util.List<String> updatedSourceNames) {
            this.updatedSourceNames = updatedSourceNames;
            this.__explicitlySet__.add("updatedSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdFieldDisplayNames")
        private java.util.List<String> createdFieldDisplayNames;

        public Builder createdFieldDisplayNames(java.util.List<String> createdFieldDisplayNames) {
            this.createdFieldDisplayNames = createdFieldDisplayNames;
            this.__explicitlySet__.add("createdFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedFieldDisplayNames")
        private java.util.List<String> updatedFieldDisplayNames;

        public Builder updatedFieldDisplayNames(java.util.List<String> updatedFieldDisplayNames) {
            this.updatedFieldDisplayNames = updatedFieldDisplayNames;
            this.__explicitlySet__.add("updatedFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictParserNames")
        private java.util.List<String> conflictParserNames;

        public Builder conflictParserNames(java.util.List<String> conflictParserNames) {
            this.conflictParserNames = conflictParserNames;
            this.__explicitlySet__.add("conflictParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictSourceNames")
        private java.util.List<String> conflictSourceNames;

        public Builder conflictSourceNames(java.util.List<String> conflictSourceNames) {
            this.conflictSourceNames = conflictSourceNames;
            this.__explicitlySet__.add("conflictSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictFieldDisplayNames")
        private java.util.List<String> conflictFieldDisplayNames;

        public Builder conflictFieldDisplayNames(java.util.List<String> conflictFieldDisplayNames) {
            this.conflictFieldDisplayNames = conflictFieldDisplayNames;
            this.__explicitlySet__.add("conflictFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsImportCustomChangeList build() {
            LogAnalyticsImportCustomChangeList __instance__ =
                    new LogAnalyticsImportCustomChangeList(
                            createdParserNames,
                            updatedParserNames,
                            createdSourceNames,
                            updatedSourceNames,
                            createdFieldDisplayNames,
                            updatedFieldDisplayNames,
                            conflictParserNames,
                            conflictSourceNames,
                            conflictFieldDisplayNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsImportCustomChangeList o) {
            Builder copiedBuilder =
                    createdParserNames(o.getCreatedParserNames())
                            .updatedParserNames(o.getUpdatedParserNames())
                            .createdSourceNames(o.getCreatedSourceNames())
                            .updatedSourceNames(o.getUpdatedSourceNames())
                            .createdFieldDisplayNames(o.getCreatedFieldDisplayNames())
                            .updatedFieldDisplayNames(o.getUpdatedFieldDisplayNames())
                            .conflictParserNames(o.getConflictParserNames())
                            .conflictSourceNames(o.getConflictSourceNames())
                            .conflictFieldDisplayNames(o.getConflictFieldDisplayNames());

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
     * An array of created parser names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdParserNames")
    private final java.util.List<String> createdParserNames;

    public java.util.List<String> getCreatedParserNames() {
        return createdParserNames;
    }

    /**
     * An array of updated parser names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedParserNames")
    private final java.util.List<String> updatedParserNames;

    public java.util.List<String> getUpdatedParserNames() {
        return updatedParserNames;
    }

    /**
     * An array of created source names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdSourceNames")
    private final java.util.List<String> createdSourceNames;

    public java.util.List<String> getCreatedSourceNames() {
        return createdSourceNames;
    }

    /**
     * An array of updated source names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedSourceNames")
    private final java.util.List<String> updatedSourceNames;

    public java.util.List<String> getUpdatedSourceNames() {
        return updatedSourceNames;
    }

    /**
     * An array of created field display names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdFieldDisplayNames")
    private final java.util.List<String> createdFieldDisplayNames;

    public java.util.List<String> getCreatedFieldDisplayNames() {
        return createdFieldDisplayNames;
    }

    /**
     * An array of updated field display names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedFieldDisplayNames")
    private final java.util.List<String> updatedFieldDisplayNames;

    public java.util.List<String> getUpdatedFieldDisplayNames() {
        return updatedFieldDisplayNames;
    }

    /**
     * A list of parser names with conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictParserNames")
    private final java.util.List<String> conflictParserNames;

    public java.util.List<String> getConflictParserNames() {
        return conflictParserNames;
    }

    /**
     * A list of source names with conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictSourceNames")
    private final java.util.List<String> conflictSourceNames;

    public java.util.List<String> getConflictSourceNames() {
        return conflictSourceNames;
    }

    /**
     * A list of field display names with conflicts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictFieldDisplayNames")
    private final java.util.List<String> conflictFieldDisplayNames;

    public java.util.List<String> getConflictFieldDisplayNames() {
        return conflictFieldDisplayNames;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsImportCustomChangeList(");
        sb.append("createdParserNames=").append(String.valueOf(this.createdParserNames));
        sb.append(", updatedParserNames=").append(String.valueOf(this.updatedParserNames));
        sb.append(", createdSourceNames=").append(String.valueOf(this.createdSourceNames));
        sb.append(", updatedSourceNames=").append(String.valueOf(this.updatedSourceNames));
        sb.append(", createdFieldDisplayNames=")
                .append(String.valueOf(this.createdFieldDisplayNames));
        sb.append(", updatedFieldDisplayNames=")
                .append(String.valueOf(this.updatedFieldDisplayNames));
        sb.append(", conflictParserNames=").append(String.valueOf(this.conflictParserNames));
        sb.append(", conflictSourceNames=").append(String.valueOf(this.conflictSourceNames));
        sb.append(", conflictFieldDisplayNames=")
                .append(String.valueOf(this.conflictFieldDisplayNames));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsImportCustomChangeList)) {
            return false;
        }

        LogAnalyticsImportCustomChangeList other = (LogAnalyticsImportCustomChangeList) o;
        return java.util.Objects.equals(this.createdParserNames, other.createdParserNames)
                && java.util.Objects.equals(this.updatedParserNames, other.updatedParserNames)
                && java.util.Objects.equals(this.createdSourceNames, other.createdSourceNames)
                && java.util.Objects.equals(this.updatedSourceNames, other.updatedSourceNames)
                && java.util.Objects.equals(
                        this.createdFieldDisplayNames, other.createdFieldDisplayNames)
                && java.util.Objects.equals(
                        this.updatedFieldDisplayNames, other.updatedFieldDisplayNames)
                && java.util.Objects.equals(this.conflictParserNames, other.conflictParserNames)
                && java.util.Objects.equals(this.conflictSourceNames, other.conflictSourceNames)
                && java.util.Objects.equals(
                        this.conflictFieldDisplayNames, other.conflictFieldDisplayNames)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.createdParserNames == null
                                ? 43
                                : this.createdParserNames.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedParserNames == null
                                ? 43
                                : this.updatedParserNames.hashCode());
        result =
                (result * PRIME)
                        + (this.createdSourceNames == null
                                ? 43
                                : this.createdSourceNames.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedSourceNames == null
                                ? 43
                                : this.updatedSourceNames.hashCode());
        result =
                (result * PRIME)
                        + (this.createdFieldDisplayNames == null
                                ? 43
                                : this.createdFieldDisplayNames.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedFieldDisplayNames == null
                                ? 43
                                : this.updatedFieldDisplayNames.hashCode());
        result =
                (result * PRIME)
                        + (this.conflictParserNames == null
                                ? 43
                                : this.conflictParserNames.hashCode());
        result =
                (result * PRIME)
                        + (this.conflictSourceNames == null
                                ? 43
                                : this.conflictSourceNames.hashCode());
        result =
                (result * PRIME)
                        + (this.conflictFieldDisplayNames == null
                                ? 43
                                : this.conflictFieldDisplayNames.hashCode());
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
