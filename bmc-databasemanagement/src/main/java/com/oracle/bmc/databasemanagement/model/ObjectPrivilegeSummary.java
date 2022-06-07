/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of object privileges.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectPrivilegeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectPrivilegeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "schemaType",
        "owner",
        "grantor",
        "hierarchy",
        "object",
        "grantOption",
        "common",
        "inherited"
    })
    public ObjectPrivilegeSummary(
            String name,
            String schemaType,
            String owner,
            String grantor,
            Hierarchy hierarchy,
            String object,
            GrantOption grantOption,
            Common common,
            Inherited inherited) {
        super();
        this.name = name;
        this.schemaType = schemaType;
        this.owner = owner;
        this.grantor = grantor;
        this.hierarchy = hierarchy;
        this.object = object;
        this.grantOption = grantOption;
        this.common = common;
        this.inherited = inherited;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
        private String schemaType;

        public Builder schemaType(String schemaType) {
            this.schemaType = schemaType;
            this.__explicitlySet__.add("schemaType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("grantor")
        private String grantor;

        public Builder grantor(String grantor) {
            this.grantor = grantor;
            this.__explicitlySet__.add("grantor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hierarchy")
        private Hierarchy hierarchy;

        public Builder hierarchy(Hierarchy hierarchy) {
            this.hierarchy = hierarchy;
            this.__explicitlySet__.add("hierarchy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
        private GrantOption grantOption;

        public Builder grantOption(GrantOption grantOption) {
            this.grantOption = grantOption;
            this.__explicitlySet__.add("grantOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectPrivilegeSummary build() {
            ObjectPrivilegeSummary __instance__ =
                    new ObjectPrivilegeSummary(
                            name,
                            schemaType,
                            owner,
                            grantor,
                            hierarchy,
                            object,
                            grantOption,
                            common,
                            inherited);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectPrivilegeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .schemaType(o.getSchemaType())
                            .owner(o.getOwner())
                            .grantor(o.getGrantor())
                            .hierarchy(o.getHierarchy())
                            .object(o.getObject())
                            .grantOption(o.getGrantOption())
                            .common(o.getCommon())
                            .inherited(o.getInherited());

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
     * The name of the privilege on the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The type of object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaType")
    private final String schemaType;

    public String getSchemaType() {
        return schemaType;
    }

    /**
     * The owner of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    public String getOwner() {
        return owner;
    }

    /**
     * The name of the user who granted the object privilege.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantor")
    private final String grantor;

    public String getGrantor() {
        return grantor;
    }

    /**
     * Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO).
     **/
    public enum Hierarchy {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Hierarchy.class);

        private final String value;
        private static java.util.Map<String, Hierarchy> map;

        static {
            map = new java.util.HashMap<>();
            for (Hierarchy v : Hierarchy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Hierarchy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Hierarchy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Hierarchy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the privilege is granted with the HIERARCHY OPTION (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchy")
    private final Hierarchy hierarchy;

    public Hierarchy getHierarchy() {
        return hierarchy;
    }

    /**
     * The name of the object. The object can be any object, including tables, packages, indexes, sequences, and so on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    public String getObject() {
        return object;
    }

    /**
     * Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO).
     **/
    public enum GrantOption {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GrantOption.class);

        private final String value;
        private static java.util.Map<String, GrantOption> map;

        static {
            map = new java.util.HashMap<>();
            for (GrantOption v : GrantOption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GrantOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GrantOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GrantOption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the privilege is granted with the GRANT OPTION (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantOption")
    private final GrantOption grantOption;

    public GrantOption getGrantOption() {
        return grantOption;
    }

    /**
     * Indicates how the object privilege was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     **/
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Common.class);

        private final String value;
        private static java.util.Map<String, Common> map;

        static {
            map = new java.util.HashMap<>();
            for (Common v : Common.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Common(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Common create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Common', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the object privilege was granted. Possible values:
     * YES if the role is granted commonly (CONTAINER=ALL is used)
     * NO if the role is granted locally (CONTAINER=ALL is not used)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    private final Common common;

    public Common getCommon() {
        return common;
    }

    /**
     * Indicates whether the granted privilege is inherited from another container (YES) or not (NO).
     **/
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Inherited.class);

        private final String value;
        private static java.util.Map<String, Inherited> map;

        static {
            map = new java.util.HashMap<>();
            for (Inherited v : Inherited.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Inherited(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Inherited create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Inherited', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the granted privilege is inherited from another container (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    private final Inherited inherited;

    public Inherited getInherited() {
        return inherited;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ObjectPrivilegeSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", schemaType=").append(String.valueOf(this.schemaType));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", grantor=").append(String.valueOf(this.grantor));
        sb.append(", hierarchy=").append(String.valueOf(this.hierarchy));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(", grantOption=").append(String.valueOf(this.grantOption));
        sb.append(", common=").append(String.valueOf(this.common));
        sb.append(", inherited=").append(String.valueOf(this.inherited));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectPrivilegeSummary)) {
            return false;
        }

        ObjectPrivilegeSummary other = (ObjectPrivilegeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.schemaType, other.schemaType)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.grantor, other.grantor)
                && java.util.Objects.equals(this.hierarchy, other.hierarchy)
                && java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.grantOption, other.grantOption)
                && java.util.Objects.equals(this.common, other.common)
                && java.util.Objects.equals(this.inherited, other.inherited)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.schemaType == null ? 43 : this.schemaType.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.grantor == null ? 43 : this.grantor.hashCode());
        result = (result * PRIME) + (this.hierarchy == null ? 43 : this.hierarchy.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + (this.grantOption == null ? 43 : this.grantOption.hashCode());
        result = (result * PRIME) + (this.common == null ? 43 : this.common.hashCode());
        result = (result * PRIME) + (this.inherited == null ? 43 : this.inherited.hashCode());
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
