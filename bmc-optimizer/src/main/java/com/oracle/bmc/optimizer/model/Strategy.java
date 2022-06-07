/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the strategy. The strategy is the method used to apply the recommendation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Strategy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Strategy {
    @Deprecated
    @java.beans.ConstructorProperties({"strategyName", "isDefault", "parametersDefinition"})
    public Strategy(
            String strategyName,
            Boolean isDefault,
            java.util.List<StrategyParameter> parametersDefinition) {
        super();
        this.strategyName = strategyName;
        this.isDefault = isDefault;
        this.parametersDefinition = parametersDefinition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
        private String strategyName;

        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            this.__explicitlySet__.add("strategyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parametersDefinition")
        private java.util.List<StrategyParameter> parametersDefinition;

        public Builder parametersDefinition(
                java.util.List<StrategyParameter> parametersDefinition) {
            this.parametersDefinition = parametersDefinition;
            this.__explicitlySet__.add("parametersDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Strategy build() {
            Strategy __instance__ = new Strategy(strategyName, isDefault, parametersDefinition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Strategy o) {
            Builder copiedBuilder =
                    strategyName(o.getStrategyName())
                            .isDefault(o.getIsDefault())
                            .parametersDefinition(o.getParametersDefinition());

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
     * The name of the strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
    private final String strategyName;

    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Whether this is the default recommendation strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The list of strategies for the parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersDefinition")
    private final java.util.List<StrategyParameter> parametersDefinition;

    public java.util.List<StrategyParameter> getParametersDefinition() {
        return parametersDefinition;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Strategy(");
        sb.append("strategyName=").append(String.valueOf(this.strategyName));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", parametersDefinition=").append(String.valueOf(this.parametersDefinition));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Strategy)) {
            return false;
        }

        Strategy other = (Strategy) o;
        return java.util.Objects.equals(this.strategyName, other.strategyName)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.parametersDefinition, other.parametersDefinition)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.strategyName == null ? 43 : this.strategyName.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersDefinition == null
                                ? 43
                                : this.parametersDefinition.hashCode());
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
