/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Parameters are created and assigned values that can be configured for each integration task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Parameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Parameter extends TypedObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
        private Object rootObjectDefaultValue;

        public Builder rootObjectDefaultValue(Object rootObjectDefaultValue) {
            this.rootObjectDefaultValue = rootObjectDefaultValue;
            this.__explicitlySet__.add("rootObjectDefaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInput")
        private Boolean isInput;

        public Builder isInput(Boolean isInput) {
            this.isInput = isInput;
            this.__explicitlySet__.add("isInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
        private Boolean isOutput;

        public Builder isOutput(Boolean isOutput) {
            this.isOutput = isOutput;
            this.__explicitlySet__.add("isOutput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
        private OutputAggregationType outputAggregationType;

        public Builder outputAggregationType(OutputAggregationType outputAggregationType) {
            this.outputAggregationType = outputAggregationType;
            this.__explicitlySet__.add("outputAggregationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Parameter build() {
            Parameter __instance__ =
                    new Parameter(
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            objectStatus,
                            name,
                            description,
                            type,
                            defaultValue,
                            rootObjectDefaultValue,
                            isInput,
                            isOutput,
                            outputAggregationType,
                            typeName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Parameter o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .name(o.getName())
                            .description(o.getDescription())
                            .type(o.getType())
                            .defaultValue(o.getDefaultValue())
                            .rootObjectDefaultValue(o.getRootObjectDefaultValue())
                            .isInput(o.getIsInput())
                            .isOutput(o.getIsOutput())
                            .outputAggregationType(o.getOutputAggregationType())
                            .typeName(o.getTypeName());

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
    public Parameter(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            BaseType type,
            Object defaultValue,
            Object rootObjectDefaultValue,
            Boolean isInput,
            Boolean isOutput,
            OutputAggregationType outputAggregationType,
            String typeName) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.type = type;
        this.defaultValue = defaultValue;
        this.rootObjectDefaultValue = rootObjectDefaultValue;
        this.isInput = isInput;
        this.isOutput = isOutput;
        this.outputAggregationType = outputAggregationType;
        this.typeName = typeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BaseType type;

    public BaseType getType() {
        return type;
    }

    /**
     * The default value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Object defaultValue;

    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * The default value of the parameter which can be an object in DIS, such as a data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
    private final Object rootObjectDefaultValue;

    public Object getRootObjectDefaultValue() {
        return rootObjectDefaultValue;
    }

    /**
     * Specifies whether the parameter is input value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInput")
    private final Boolean isInput;

    public Boolean getIsInput() {
        return isInput;
    }

    /**
     * Specifies whether the parameter is output value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
    private final Boolean isOutput;

    public Boolean getIsOutput() {
        return isOutput;
    }

    /**
     * The output aggregation type.
     **/
    public enum OutputAggregationType {
        Min("MIN"),
        Max("MAX"),
        Count("COUNT"),
        Sum("SUM"),
        ;

        private final String value;
        private static java.util.Map<String, OutputAggregationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputAggregationType v : OutputAggregationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputAggregationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputAggregationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputAggregationType: " + key);
        }
    };
    /**
     * The output aggregation type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
    private final OutputAggregationType outputAggregationType;

    public OutputAggregationType getOutputAggregationType() {
        return outputAggregationType;
    }

    /**
     * The type of value the parameter was created for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Parameter(");
        sb.append("super=").append(super.toString());
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", rootObjectDefaultValue=").append(String.valueOf(this.rootObjectDefaultValue));
        sb.append(", isInput=").append(String.valueOf(this.isInput));
        sb.append(", isOutput=").append(String.valueOf(this.isOutput));
        sb.append(", outputAggregationType=").append(String.valueOf(this.outputAggregationType));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parameter)) {
            return false;
        }

        Parameter other = (Parameter) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(
                        this.rootObjectDefaultValue, other.rootObjectDefaultValue)
                && java.util.Objects.equals(this.isInput, other.isInput)
                && java.util.Objects.equals(this.isOutput, other.isOutput)
                && java.util.Objects.equals(this.outputAggregationType, other.outputAggregationType)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.rootObjectDefaultValue == null
                                ? 43
                                : this.rootObjectDefaultValue.hashCode());
        result = (result * PRIME) + (this.isInput == null ? 43 : this.isInput.hashCode());
        result = (result * PRIME) + (this.isOutput == null ? 43 : this.isOutput.hashCode());
        result =
                (result * PRIME)
                        + (this.outputAggregationType == null
                                ? 43
                                : this.outputAggregationType.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
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
