/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceLabelCondition
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
    builder = LogAnalyticsSourceLabelCondition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceLabelCondition {
    @Deprecated
    @java.beans.ConstructorProperties({
        "message",
        "isVisible",
        "blockConditionField",
        "blockConditionOperator",
        "blockConditionValue",
        "labelConditionValue",
        "labelConditionValues",
        "contentExample",
        "isEnabled",
        "fieldName",
        "labelConditionId",
        "isSystem",
        "labelConditionOperator",
        "sourceId",
        "labelDisplayName",
        "storageField",
        "labelName",
        "isInlineLabelExistingInDatabase"
    })
    public LogAnalyticsSourceLabelCondition(
            String message,
            Boolean isVisible,
            String blockConditionField,
            String blockConditionOperator,
            String blockConditionValue,
            String labelConditionValue,
            java.util.List<String> labelConditionValues,
            String contentExample,
            Boolean isEnabled,
            String fieldName,
            Long labelConditionId,
            Boolean isSystem,
            String labelConditionOperator,
            Long sourceId,
            String labelDisplayName,
            String storageField,
            String labelName,
            Boolean isInlineLabelExistingInDatabase) {
        super();
        this.message = message;
        this.isVisible = isVisible;
        this.blockConditionField = blockConditionField;
        this.blockConditionOperator = blockConditionOperator;
        this.blockConditionValue = blockConditionValue;
        this.labelConditionValue = labelConditionValue;
        this.labelConditionValues = labelConditionValues;
        this.contentExample = contentExample;
        this.isEnabled = isEnabled;
        this.fieldName = fieldName;
        this.labelConditionId = labelConditionId;
        this.isSystem = isSystem;
        this.labelConditionOperator = labelConditionOperator;
        this.sourceId = sourceId;
        this.labelDisplayName = labelDisplayName;
        this.storageField = storageField;
        this.labelName = labelName;
        this.isInlineLabelExistingInDatabase = isInlineLabelExistingInDatabase;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
        private Boolean isVisible;

        public Builder isVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            this.__explicitlySet__.add("isVisible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
        private String blockConditionField;

        public Builder blockConditionField(String blockConditionField) {
            this.blockConditionField = blockConditionField;
            this.__explicitlySet__.add("blockConditionField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
        private String blockConditionOperator;

        public Builder blockConditionOperator(String blockConditionOperator) {
            this.blockConditionOperator = blockConditionOperator;
            this.__explicitlySet__.add("blockConditionOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
        private String blockConditionValue;

        public Builder blockConditionValue(String blockConditionValue) {
            this.blockConditionValue = blockConditionValue;
            this.__explicitlySet__.add("blockConditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
        private String labelConditionValue;

        public Builder labelConditionValue(String labelConditionValue) {
            this.labelConditionValue = labelConditionValue;
            this.__explicitlySet__.add("labelConditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
        private java.util.List<String> labelConditionValues;

        public Builder labelConditionValues(java.util.List<String> labelConditionValues) {
            this.labelConditionValues = labelConditionValues;
            this.__explicitlySet__.add("labelConditionValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
        private String contentExample;

        public Builder contentExample(String contentExample) {
            this.contentExample = contentExample;
            this.__explicitlySet__.add("contentExample");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
        private Long labelConditionId;

        public Builder labelConditionId(Long labelConditionId) {
            this.labelConditionId = labelConditionId;
            this.__explicitlySet__.add("labelConditionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
        private String labelConditionOperator;

        public Builder labelConditionOperator(String labelConditionOperator) {
            this.labelConditionOperator = labelConditionOperator;
            this.__explicitlySet__.add("labelConditionOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
        private String labelDisplayName;

        public Builder labelDisplayName(String labelDisplayName) {
            this.labelDisplayName = labelDisplayName;
            this.__explicitlySet__.add("labelDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageField")
        private String storageField;

        public Builder storageField(String storageField) {
            this.storageField = storageField;
            this.__explicitlySet__.add("storageField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelName")
        private String labelName;

        public Builder labelName(String labelName) {
            this.labelName = labelName;
            this.__explicitlySet__.add("labelName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
        private Boolean isInlineLabelExistingInDatabase;

        public Builder isInlineLabelExistingInDatabase(Boolean isInlineLabelExistingInDatabase) {
            this.isInlineLabelExistingInDatabase = isInlineLabelExistingInDatabase;
            this.__explicitlySet__.add("isInlineLabelExistingInDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceLabelCondition build() {
            LogAnalyticsSourceLabelCondition __instance__ =
                    new LogAnalyticsSourceLabelCondition(
                            message,
                            isVisible,
                            blockConditionField,
                            blockConditionOperator,
                            blockConditionValue,
                            labelConditionValue,
                            labelConditionValues,
                            contentExample,
                            isEnabled,
                            fieldName,
                            labelConditionId,
                            isSystem,
                            labelConditionOperator,
                            sourceId,
                            labelDisplayName,
                            storageField,
                            labelName,
                            isInlineLabelExistingInDatabase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceLabelCondition o) {
            Builder copiedBuilder =
                    message(o.getMessage())
                            .isVisible(o.getIsVisible())
                            .blockConditionField(o.getBlockConditionField())
                            .blockConditionOperator(o.getBlockConditionOperator())
                            .blockConditionValue(o.getBlockConditionValue())
                            .labelConditionValue(o.getLabelConditionValue())
                            .labelConditionValues(o.getLabelConditionValues())
                            .contentExample(o.getContentExample())
                            .isEnabled(o.getIsEnabled())
                            .fieldName(o.getFieldName())
                            .labelConditionId(o.getLabelConditionId())
                            .isSystem(o.getIsSystem())
                            .labelConditionOperator(o.getLabelConditionOperator())
                            .sourceId(o.getSourceId())
                            .labelDisplayName(o.getLabelDisplayName())
                            .storageField(o.getStorageField())
                            .labelName(o.getLabelName())
                            .isInlineLabelExistingInDatabase(
                                    o.getIsInlineLabelExistingInDatabase());

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
     * The message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    public String getMessage() {
        return message;
    }

    /**
     * A flag indicating whether or not the label condition is visible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
    private final Boolean isVisible;

    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * The block condition field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionField")
    private final String blockConditionField;

    public String getBlockConditionField() {
        return blockConditionField;
    }

    /**
     * The block condition operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionOperator")
    private final String blockConditionOperator;

    public String getBlockConditionOperator() {
        return blockConditionOperator;
    }

    /**
     * The block condition value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockConditionValue")
    private final String blockConditionValue;

    public String getBlockConditionValue() {
        return blockConditionValue;
    }

    /**
     * The condition value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
    private final String labelConditionValue;

    public String getLabelConditionValue() {
        return labelConditionValue;
    }

    /**
     * A list of condition values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
    private final java.util.List<String> labelConditionValues;

    public java.util.List<String> getLabelConditionValues() {
        return labelConditionValues;
    }

    /**
     * The content example.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentExample")
    private final String contentExample;

    public String getContentExample() {
        return contentExample;
    }

    /**
     * A flag inidcating whether or not the condition is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The internal field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    public String getFieldName() {
        return fieldName;
    }

    /**
     * The unique identifier of the condition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionId")
    private final Long labelConditionId;

    public Long getLabelConditionId() {
        return labelConditionId;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The condition operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
    private final String labelConditionOperator;

    public String getLabelConditionOperator() {
        return labelConditionOperator;
    }

    /**
     * The unique identifier of the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    public Long getSourceId() {
        return sourceId;
    }

    /**
     * The label display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelDisplayName")
    private final String labelDisplayName;

    public String getLabelDisplayName() {
        return labelDisplayName;
    }

    /**
     * The label storage field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageField")
    private final String storageField;

    public String getStorageField() {
        return storageField;
    }

    /**
     * The label name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelName")
    private final String labelName;

    public String getLabelName() {
        return labelName;
    }

    /**
     * A flag indicating whether or not the inline label exists in the database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInlineLabelExistingInDatabase")
    private final Boolean isInlineLabelExistingInDatabase;

    public Boolean getIsInlineLabelExistingInDatabase() {
        return isInlineLabelExistingInDatabase;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsSourceLabelCondition(");
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", isVisible=").append(String.valueOf(this.isVisible));
        sb.append(", blockConditionField=").append(String.valueOf(this.blockConditionField));
        sb.append(", blockConditionOperator=").append(String.valueOf(this.blockConditionOperator));
        sb.append(", blockConditionValue=").append(String.valueOf(this.blockConditionValue));
        sb.append(", labelConditionValue=").append(String.valueOf(this.labelConditionValue));
        sb.append(", labelConditionValues=").append(String.valueOf(this.labelConditionValues));
        sb.append(", contentExample=").append(String.valueOf(this.contentExample));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", labelConditionId=").append(String.valueOf(this.labelConditionId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", labelConditionOperator=").append(String.valueOf(this.labelConditionOperator));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", labelDisplayName=").append(String.valueOf(this.labelDisplayName));
        sb.append(", storageField=").append(String.valueOf(this.storageField));
        sb.append(", labelName=").append(String.valueOf(this.labelName));
        sb.append(", isInlineLabelExistingInDatabase=")
                .append(String.valueOf(this.isInlineLabelExistingInDatabase));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceLabelCondition)) {
            return false;
        }

        LogAnalyticsSourceLabelCondition other = (LogAnalyticsSourceLabelCondition) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.isVisible, other.isVisible)
                && java.util.Objects.equals(this.blockConditionField, other.blockConditionField)
                && java.util.Objects.equals(
                        this.blockConditionOperator, other.blockConditionOperator)
                && java.util.Objects.equals(this.blockConditionValue, other.blockConditionValue)
                && java.util.Objects.equals(this.labelConditionValue, other.labelConditionValue)
                && java.util.Objects.equals(this.labelConditionValues, other.labelConditionValues)
                && java.util.Objects.equals(this.contentExample, other.contentExample)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.labelConditionId, other.labelConditionId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(
                        this.labelConditionOperator, other.labelConditionOperator)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.labelDisplayName, other.labelDisplayName)
                && java.util.Objects.equals(this.storageField, other.storageField)
                && java.util.Objects.equals(this.labelName, other.labelName)
                && java.util.Objects.equals(
                        this.isInlineLabelExistingInDatabase, other.isInlineLabelExistingInDatabase)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.isVisible == null ? 43 : this.isVisible.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionField == null
                                ? 43
                                : this.blockConditionField.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionOperator == null
                                ? 43
                                : this.blockConditionOperator.hashCode());
        result =
                (result * PRIME)
                        + (this.blockConditionValue == null
                                ? 43
                                : this.blockConditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValue == null
                                ? 43
                                : this.labelConditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValues == null
                                ? 43
                                : this.labelConditionValues.hashCode());
        result =
                (result * PRIME)
                        + (this.contentExample == null ? 43 : this.contentExample.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionId == null ? 43 : this.labelConditionId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionOperator == null
                                ? 43
                                : this.labelConditionOperator.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.labelDisplayName == null ? 43 : this.labelDisplayName.hashCode());
        result = (result * PRIME) + (this.storageField == null ? 43 : this.storageField.hashCode());
        result = (result * PRIME) + (this.labelName == null ? 43 : this.labelName.hashCode());
        result =
                (result * PRIME)
                        + (this.isInlineLabelExistingInDatabase == null
                                ? 43
                                : this.isInlineLabelExistingInDatabase.hashCode());
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
