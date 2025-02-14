/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType",
        defaultImpl = CreateConnectionDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreatePostgresqlConnectionDetails.class,
            name = "POSTGRESQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateKafkaSchemaRegistryConnectionDetails.class,
            name = "KAFKA_SCHEMA_REGISTRY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateMicrosoftSqlserverConnectionDetails.class,
            name = "MICROSOFT_SQLSERVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateJavaMessageServiceConnectionDetails.class,
            name = "JAVA_MESSAGE_SERVICE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateSnowflakeConnectionDetails.class,
            name = "SNOWFLAKE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAzureDataLakeStorageConnectionDetails.class,
            name = "AZURE_DATA_LAKE_STORAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateMongoDbConnectionDetails.class,
            name = "MONGODB"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAmazonS3ConnectionDetails.class,
            name = "AMAZON_S3"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateHdfsConnectionDetails.class,
            name = "HDFS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateOciObjectStorageConnectionDetails.class,
            name = "OCI_OBJECT_STORAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAzureSynapseConnectionDetails.class,
            name = "AZURE_SYNAPSE_ANALYTICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateMysqlConnectionDetails.class,
            name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateKafkaConnectionDetails.class,
            name = "KAFKA"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateOracleConnectionDetails.class,
            name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateGoldenGateConnectionDetails.class,
            name = "GOLDENGATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateOracleNosqlConnectionDetails.class,
            name = "ORACLE_NOSQL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "vaultId",
        "keyId",
        "subnetId",
        "nsgIds"
    })
    protected CreateConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<String> nsgIds) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.vaultId = vaultId;
        this.keyId = keyId;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * Refers to the customer's vault OCID. If provided, it references a vault where GoldenGate can
     * manage secrets. Customers must add policies to permit GoldenGate to manage secrets contained
     * within this vault.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * Refers to the customer's master key OCID. If provided, it references a key to manage secrets.
     * Customers must add policies to permit GoldenGate to use this key.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet being referenced.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments
     * or Connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for either Deployments
     * or Connections.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
