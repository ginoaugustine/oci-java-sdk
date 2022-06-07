/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in connection create operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateConnectionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "typeKey",
        "customPropertyMembers",
        "properties",
        "encProperties",
        "isDefault"
    })
    public CreateConnectionDetails(
            String description,
            String displayName,
            String typeKey,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties,
            java.util.Map<String, java.util.Map<String, String>> encProperties,
            Boolean isDefault) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.typeKey = typeKey;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
        this.encProperties = encProperties;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encProperties")
        private java.util.Map<String, java.util.Map<String, String>> encProperties;

        public Builder encProperties(
                java.util.Map<String, java.util.Map<String, String>> encProperties) {
            this.encProperties = encProperties;
            this.__explicitlySet__.add("encProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectionDetails build() {
            CreateConnectionDetails __instance__ =
                    new CreateConnectionDetails(
                            description,
                            displayName,
                            typeKey,
                            customPropertyMembers,
                            properties,
                            encProperties,
                            isDefault);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConnectionDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .typeKey(o.getTypeKey())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .properties(o.getProperties())
                            .encProperties(o.getEncProperties())
                            .isDefault(o.getIsDefault());

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
     * A description of the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The key of the object type. Type key's can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    public String getTypeKey() {
        return typeKey;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the connection type. Each connection type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * connections have required properties within the "default" category. To determine the set of optional and
     * required properties for a connection type, a query can be done on '/types?type=connection' that returns a
     * collection of all connection types. The appropriate connection type, which will include definitions of all
     * of it's properties, can be identified from this collection.
     * Example: {@code {"properties": { "default": { "username": "user1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /**
     * A map of maps that contains the encrypted values for sensitive properties which are specific to the
     * connection type. Each connection type definition defines it's set of required and optional properties.
     * The map keys are category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most connections have required properties within the "default" category.
     * To determine the set of optional and required properties for a connection type, a query can be done
     * on '/types?type=connection' that returns a collection of all connection types. The appropriate connection
     * type, which will include definitions of all of it's properties, can be identified from this collection.
     * Example: {@code {"encProperties": { "default": { "password": "example-password"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encProperties")
    private final java.util.Map<String, java.util.Map<String, String>> encProperties;

    public java.util.Map<String, java.util.Map<String, String>> getEncProperties() {
        return encProperties;
    }

    /**
     * Indicates whether this connection is the default connection. The first connection of a data asset defaults
     * to being the default, subsequent connections default to not being the default. If a default connection already
     * exists, then trying to create a connection as the default will fail. In this case the default connection would
     * need to be updated not to be the default and then the new connection can then be created as the default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    public Boolean getIsDefault() {
        return isDefault;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateConnectionDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", encProperties=").append(String.valueOf(this.encProperties));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectionDetails)) {
            return false;
        }

        CreateConnectionDetails other = (CreateConnectionDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.encProperties, other.encProperties)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.encProperties == null ? 43 : this.encProperties.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
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
