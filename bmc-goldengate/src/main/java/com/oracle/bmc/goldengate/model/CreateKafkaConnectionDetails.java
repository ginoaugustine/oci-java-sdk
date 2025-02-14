/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Kafka Connection. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateKafkaConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateKafkaConnectionDetails extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The Kafka technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private KafkaConnection.TechnologyType technologyType;

        /**
         * The Kafka technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(KafkaConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * stream pool being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
        private String streamPoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * stream pool being referenced.
         *
         * @param streamPoolId the value to set
         * @return this builder
         */
        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            this.__explicitlySet__.add("streamPoolId");
            return this;
        }
        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
         * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
         * connection to the Kafka cluster. Example: {@code
         * "server1.example.com:9092,server2.example.com:9092"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private java.util.List<KafkaBootstrapServer> bootstrapServers;

        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
         * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
         * connection to the Kafka cluster. Example: {@code
         * "server1.example.com:9092,server2.example.com:9092"}
         *
         * @param bootstrapServers the value to set
         * @return this builder
         */
        public Builder bootstrapServers(java.util.List<KafkaBootstrapServer> bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }
        /** Security Type for Kafka. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private KafkaConnection.SecurityProtocol securityProtocol;

        /**
         * Security Type for Kafka.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(KafkaConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The password Oracle GoldenGate uses to connect the associated system of the given
         * technology. It must conform to the specific security requirements including length, case
         * sensitivity, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated system of the given
         * technology. It must conform to the specific security requirements including length, case
         * sensitivity, and so on.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** The base64 encoded content of the TrustStore file. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the TrustStore file.
         *
         * @param trustStore the value to set
         * @return this builder
         */
        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }
        /** The TrustStore password. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * The TrustStore password.
         *
         * @param trustStorePassword the value to set
         * @return this builder
         */
        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }
        /** The base64 encoded content of the KeyStore file. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private String keyStore;

        /**
         * The base64 encoded content of the KeyStore file.
         *
         * @param keyStore the value to set
         * @return this builder
         */
        public Builder keyStore(String keyStore) {
            this.keyStore = keyStore;
            this.__explicitlySet__.add("keyStore");
            return this;
        }
        /** The KeyStore password. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * The KeyStore password.
         *
         * @param keyStorePassword the value to set
         * @return this builder
         */
        public Builder keyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }
        /**
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private String sslKeyPassword;

        /**
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided.
         *
         * @param sslKeyPassword the value to set
         * @return this builder
         */
        public Builder sslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            this.__explicitlySet__.add("sslKeyPassword");
            return this;
        }
        /** The base64 encoded content of the consumer.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumerProperties")
        private String consumerProperties;

        /**
         * The base64 encoded content of the consumer.properties file.
         *
         * @param consumerProperties the value to set
         * @return this builder
         */
        public Builder consumerProperties(String consumerProperties) {
            this.consumerProperties = consumerProperties;
            this.__explicitlySet__.add("consumerProperties");
            return this;
        }
        /** The base64 encoded content of the producer.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("producerProperties")
        private String producerProperties;

        /**
         * The base64 encoded content of the producer.properties file.
         *
         * @param producerProperties the value to set
         * @return this builder
         */
        public Builder producerProperties(String producerProperties) {
            this.producerProperties = producerProperties;
            this.__explicitlySet__.add("producerProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateKafkaConnectionDetails build() {
            CreateKafkaConnectionDetails model =
                    new CreateKafkaConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.nsgIds,
                            this.technologyType,
                            this.streamPoolId,
                            this.bootstrapServers,
                            this.securityProtocol,
                            this.username,
                            this.password,
                            this.trustStore,
                            this.trustStorePassword,
                            this.keyStore,
                            this.keyStorePassword,
                            this.sslKeyPassword,
                            this.consumerProperties,
                            this.producerProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKafkaConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("streamPoolId")) {
                this.streamPoolId(model.getStreamPoolId());
            }
            if (model.wasPropertyExplicitlySet("bootstrapServers")) {
                this.bootstrapServers(model.getBootstrapServers());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("trustStore")) {
                this.trustStore(model.getTrustStore());
            }
            if (model.wasPropertyExplicitlySet("trustStorePassword")) {
                this.trustStorePassword(model.getTrustStorePassword());
            }
            if (model.wasPropertyExplicitlySet("keyStore")) {
                this.keyStore(model.getKeyStore());
            }
            if (model.wasPropertyExplicitlySet("keyStorePassword")) {
                this.keyStorePassword(model.getKeyStorePassword());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPassword")) {
                this.sslKeyPassword(model.getSslKeyPassword());
            }
            if (model.wasPropertyExplicitlySet("consumerProperties")) {
                this.consumerProperties(model.getConsumerProperties());
            }
            if (model.wasPropertyExplicitlySet("producerProperties")) {
                this.producerProperties(model.getProducerProperties());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateKafkaConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<String> nsgIds,
            KafkaConnection.TechnologyType technologyType,
            String streamPoolId,
            java.util.List<KafkaBootstrapServer> bootstrapServers,
            KafkaConnection.SecurityProtocol securityProtocol,
            String username,
            String password,
            String trustStore,
            String trustStorePassword,
            String keyStore,
            String keyStorePassword,
            String sslKeyPassword,
            String consumerProperties,
            String producerProperties) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                subnetId,
                nsgIds);
        this.technologyType = technologyType;
        this.streamPoolId = streamPoolId;
        this.bootstrapServers = bootstrapServers;
        this.securityProtocol = securityProtocol;
        this.username = username;
        this.password = password;
        this.trustStore = trustStore;
        this.trustStorePassword = trustStorePassword;
        this.keyStore = keyStore;
        this.keyStorePassword = keyStorePassword;
        this.sslKeyPassword = sslKeyPassword;
        this.consumerProperties = consumerProperties;
        this.producerProperties = producerProperties;
    }

    /** The Kafka technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final KafkaConnection.TechnologyType technologyType;

    /**
     * The Kafka technology type.
     *
     * @return the value
     */
    public KafkaConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * stream pool being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
    private final String streamPoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * stream pool being referenced.
     *
     * @return the value
     */
    public String getStreamPoolId() {
        return streamPoolId;
    }

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
     * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
     * connection to the Kafka cluster. Example: {@code
     * "server1.example.com:9092,server2.example.com:9092"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final java.util.List<KafkaBootstrapServer> bootstrapServers;

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
     * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
     * connection to the Kafka cluster. Example: {@code
     * "server1.example.com:9092,server2.example.com:9092"}
     *
     * @return the value
     */
    public java.util.List<KafkaBootstrapServer> getBootstrapServers() {
        return bootstrapServers;
    }

    /** Security Type for Kafka. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final KafkaConnection.SecurityProtocol securityProtocol;

    /**
     * Security Type for Kafka.
     *
     * @return the value
     */
    public KafkaConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and
     * so on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and
     * so on.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /** The base64 encoded content of the TrustStore file. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the TrustStore file.
     *
     * @return the value
     */
    public String getTrustStore() {
        return trustStore;
    }

    /** The TrustStore password. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * The TrustStore password.
     *
     * @return the value
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /** The base64 encoded content of the KeyStore file. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final String keyStore;

    /**
     * The base64 encoded content of the KeyStore file.
     *
     * @return the value
     */
    public String getKeyStore() {
        return keyStore;
    }

    /** The KeyStore password. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * The KeyStore password.
     *
     * @return the value
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final String sslKeyPassword;

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided.
     *
     * @return the value
     */
    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    /** The base64 encoded content of the consumer.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumerProperties")
    private final String consumerProperties;

    /**
     * The base64 encoded content of the consumer.properties file.
     *
     * @return the value
     */
    public String getConsumerProperties() {
        return consumerProperties;
    }

    /** The base64 encoded content of the producer.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("producerProperties")
    private final String producerProperties;

    /**
     * The base64 encoded content of the producer.properties file.
     *
     * @return the value
     */
    public String getProducerProperties() {
        return producerProperties;
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
        sb.append("CreateKafkaConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", streamPoolId=").append(String.valueOf(this.streamPoolId));
        sb.append(", bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", trustStore=").append(String.valueOf(this.trustStore));
        sb.append(", trustStorePassword=").append("<redacted>");
        sb.append(", keyStore=").append(String.valueOf(this.keyStore));
        sb.append(", keyStorePassword=").append("<redacted>");
        sb.append(", sslKeyPassword=").append("<redacted>");
        sb.append(", consumerProperties=").append(String.valueOf(this.consumerProperties));
        sb.append(", producerProperties=").append(String.valueOf(this.producerProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKafkaConnectionDetails)) {
            return false;
        }

        CreateKafkaConnectionDetails other = (CreateKafkaConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.streamPoolId, other.streamPoolId)
                && java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.trustStorePassword, other.trustStorePassword)
                && java.util.Objects.equals(this.keyStore, other.keyStore)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(this.sslKeyPassword, other.sslKeyPassword)
                && java.util.Objects.equals(this.consumerProperties, other.consumerProperties)
                && java.util.Objects.equals(this.producerProperties, other.producerProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.streamPoolId == null ? 43 : this.streamPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.trustStore == null ? 43 : this.trustStore.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePassword == null
                                ? 43
                                : this.trustStorePassword.hashCode());
        result = (result * PRIME) + (this.keyStore == null ? 43 : this.keyStore.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePassword == null ? 43 : this.keyStorePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPassword == null ? 43 : this.sslKeyPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerProperties == null
                                ? 43
                                : this.consumerProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.producerProperties == null
                                ? 43
                                : this.producerProperties.hashCode());
        return result;
    }
}
