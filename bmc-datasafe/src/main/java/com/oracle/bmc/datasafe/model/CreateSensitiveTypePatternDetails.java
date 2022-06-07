/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new sensitive type with regular expressions.
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
    builder = CreateSensitiveTypePatternDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSensitiveTypePatternDetails extends CreateSensitiveTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortName")
        private String shortName;

        public Builder shortName(String shortName) {
            this.shortName = shortName;
            this.__explicitlySet__.add("shortName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentCategoryId")
        private String parentCategoryId;

        public Builder parentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            this.__explicitlySet__.add("parentCategoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
        private String namePattern;

        public Builder namePattern(String namePattern) {
            this.namePattern = namePattern;
            this.__explicitlySet__.add("namePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
        private String commentPattern;

        public Builder commentPattern(String commentPattern) {
            this.commentPattern = commentPattern;
            this.__explicitlySet__.add("commentPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
        private String dataPattern;

        public Builder dataPattern(String dataPattern) {
            this.dataPattern = dataPattern;
            this.__explicitlySet__.add("dataPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchType")
        private SensitiveTypePattern.SearchType searchType;

        public Builder searchType(SensitiveTypePattern.SearchType searchType) {
            this.searchType = searchType;
            this.__explicitlySet__.add("searchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
        private String defaultMaskingFormatId;

        public Builder defaultMaskingFormatId(String defaultMaskingFormatId) {
            this.defaultMaskingFormatId = defaultMaskingFormatId;
            this.__explicitlySet__.add("defaultMaskingFormatId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSensitiveTypePatternDetails build() {
            CreateSensitiveTypePatternDetails __instance__ =
                    new CreateSensitiveTypePatternDetails(
                            displayName,
                            compartmentId,
                            shortName,
                            description,
                            parentCategoryId,
                            freeformTags,
                            definedTags,
                            namePattern,
                            commentPattern,
                            dataPattern,
                            searchType,
                            defaultMaskingFormatId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSensitiveTypePatternDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .shortName(o.getShortName())
                            .description(o.getDescription())
                            .parentCategoryId(o.getParentCategoryId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .namePattern(o.getNamePattern())
                            .commentPattern(o.getCommentPattern())
                            .dataPattern(o.getDataPattern())
                            .searchType(o.getSearchType())
                            .defaultMaskingFormatId(o.getDefaultMaskingFormatId());

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
    public CreateSensitiveTypePatternDetails(
            String displayName,
            String compartmentId,
            String shortName,
            String description,
            String parentCategoryId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String namePattern,
            String commentPattern,
            String dataPattern,
            SensitiveTypePattern.SearchType searchType,
            String defaultMaskingFormatId) {
        super(
                displayName,
                compartmentId,
                shortName,
                description,
                parentCategoryId,
                freeformTags,
                definedTags);
        this.namePattern = namePattern;
        this.commentPattern = commentPattern;
        this.dataPattern = dataPattern;
        this.searchType = searchType;
        this.defaultMaskingFormatId = defaultMaskingFormatId;
    }

    /**
     * A regular expression to be used by data discovery for matching column names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
    private final String namePattern;

    public String getNamePattern() {
        return namePattern;
    }

    /**
     * A regular expression to be used by data discovery for matching column comments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
    private final String commentPattern;

    public String getCommentPattern() {
        return commentPattern;
    }

    /**
     * A regular expression to be used by data discovery for matching column data values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
    private final String dataPattern;

    public String getDataPattern() {
        return dataPattern;
    }

    /**
     * The search type indicating how the column name, comment and data patterns should be used by data discovery.
     * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchType")
    private final SensitiveTypePattern.SearchType searchType;

    public SensitiveTypePattern.SearchType getSearchType() {
        return searchType;
    }

    /**
     * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
    private final String defaultMaskingFormatId;

    public String getDefaultMaskingFormatId() {
        return defaultMaskingFormatId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSensitiveTypePatternDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", namePattern=").append(String.valueOf(this.namePattern));
        sb.append(", commentPattern=").append(String.valueOf(this.commentPattern));
        sb.append(", dataPattern=").append(String.valueOf(this.dataPattern));
        sb.append(", searchType=").append(String.valueOf(this.searchType));
        sb.append(", defaultMaskingFormatId=").append(String.valueOf(this.defaultMaskingFormatId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSensitiveTypePatternDetails)) {
            return false;
        }

        CreateSensitiveTypePatternDetails other = (CreateSensitiveTypePatternDetails) o;
        return java.util.Objects.equals(this.namePattern, other.namePattern)
                && java.util.Objects.equals(this.commentPattern, other.commentPattern)
                && java.util.Objects.equals(this.dataPattern, other.dataPattern)
                && java.util.Objects.equals(this.searchType, other.searchType)
                && java.util.Objects.equals(
                        this.defaultMaskingFormatId, other.defaultMaskingFormatId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namePattern == null ? 43 : this.namePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.commentPattern == null ? 43 : this.commentPattern.hashCode());
        result = (result * PRIME) + (this.dataPattern == null ? 43 : this.dataPattern.hashCode());
        result = (result * PRIME) + (this.searchType == null ? 43 : this.searchType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultMaskingFormatId == null
                                ? 43
                                : this.defaultMaskingFormatId.hashCode());
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
