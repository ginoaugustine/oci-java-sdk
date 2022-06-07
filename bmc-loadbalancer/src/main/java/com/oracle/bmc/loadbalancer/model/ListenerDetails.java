/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The listener's configuration details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListenerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ListenerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultBackendSetName",
        "port",
        "protocol",
        "hostnameNames",
        "pathRouteSetName",
        "sslConfiguration",
        "connectionConfiguration",
        "routingPolicyName",
        "ruleSetNames"
    })
    public ListenerDetails(
            String defaultBackendSetName,
            Integer port,
            String protocol,
            java.util.List<String> hostnameNames,
            String pathRouteSetName,
            SSLConfigurationDetails sslConfiguration,
            ConnectionConfiguration connectionConfiguration,
            String routingPolicyName,
            java.util.List<String> ruleSetNames) {
        super();
        this.defaultBackendSetName = defaultBackendSetName;
        this.port = port;
        this.protocol = protocol;
        this.hostnameNames = hostnameNames;
        this.pathRouteSetName = pathRouteSetName;
        this.sslConfiguration = sslConfiguration;
        this.connectionConfiguration = connectionConfiguration;
        this.routingPolicyName = routingPolicyName;
        this.ruleSetNames = ruleSetNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        public Builder defaultBackendSetName(String defaultBackendSetName) {
            this.defaultBackendSetName = defaultBackendSetName;
            this.__explicitlySet__.add("defaultBackendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
        private java.util.List<String> hostnameNames;

        public Builder hostnameNames(java.util.List<String> hostnameNames) {
            this.hostnameNames = hostnameNames;
            this.__explicitlySet__.add("hostnameNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
        private String pathRouteSetName;

        public Builder pathRouteSetName(String pathRouteSetName) {
            this.pathRouteSetName = pathRouteSetName;
            this.__explicitlySet__.add("pathRouteSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public Builder sslConfiguration(SSLConfigurationDetails sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
        private ConnectionConfiguration connectionConfiguration;

        public Builder connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
            this.connectionConfiguration = connectionConfiguration;
            this.__explicitlySet__.add("connectionConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
        private String routingPolicyName;

        public Builder routingPolicyName(String routingPolicyName) {
            this.routingPolicyName = routingPolicyName;
            this.__explicitlySet__.add("routingPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
        private java.util.List<String> ruleSetNames;

        public Builder ruleSetNames(java.util.List<String> ruleSetNames) {
            this.ruleSetNames = ruleSetNames;
            this.__explicitlySet__.add("ruleSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListenerDetails build() {
            ListenerDetails __instance__ =
                    new ListenerDetails(
                            defaultBackendSetName,
                            port,
                            protocol,
                            hostnameNames,
                            pathRouteSetName,
                            sslConfiguration,
                            connectionConfiguration,
                            routingPolicyName,
                            ruleSetNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListenerDetails o) {
            Builder copiedBuilder =
                    defaultBackendSetName(o.getDefaultBackendSetName())
                            .port(o.getPort())
                            .protocol(o.getProtocol())
                            .hostnameNames(o.getHostnameNames())
                            .pathRouteSetName(o.getPathRouteSetName())
                            .sslConfiguration(o.getSslConfiguration())
                            .connectionConfiguration(o.getConnectionConfiguration())
                            .routingPolicyName(o.getRoutingPolicyName())
                            .ruleSetNames(o.getRuleSetNames());

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
     * The name of the associated backend set.
     * <p>
     * Example: {@code example_backend_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    private final String defaultBackendSetName;

    public String getDefaultBackendSetName() {
        return defaultBackendSetName;
    }

    /**
     * The communication port for the listener.
     * <p>
     * Example: {@code 80}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    public Integer getPort() {
        return port;
    }

    /**
     * The protocol on which the listener accepts connection requests.
     * To get a list of valid protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols}
     * operation.
     * <p>
     * Example: {@code HTTP}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    public String getProtocol() {
        return protocol;
    }

    /**
     * An array of hostname resource names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
    private final java.util.List<String> hostnameNames;

    public java.util.List<String> getHostnameNames() {
        return hostnameNames;
    }

    /**
     * Deprecated. Please use {@code routingPolicies} instead.
     * <p>
     * The name of the set of path-based routing rules, {@link PathRouteSet},
     * applied to this listener's traffic.
     * <p>
     * Example: {@code example_path_route_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
    private final String pathRouteSetName;

    public String getPathRouteSetName() {
        return pathRouteSetName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    private final SSLConfigurationDetails sslConfiguration;

    public SSLConfigurationDetails getSslConfiguration() {
        return sslConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
    private final ConnectionConfiguration connectionConfiguration;

    public ConnectionConfiguration getConnectionConfiguration() {
        return connectionConfiguration;
    }

    /**
     * The name of the routing policy applied to this listener's traffic.
     * <p>
     * Example: {@code example_routing_policy}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
    private final String routingPolicyName;

    public String getRoutingPolicyName() {
        return routingPolicyName;
    }

    /**
     * The names of the {@link RuleSet} to apply to the listener.
     * <p>
     * Example: ["example_rule_set"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
    private final java.util.List<String> ruleSetNames;

    public java.util.List<String> getRuleSetNames() {
        return ruleSetNames;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListenerDetails(");
        sb.append("defaultBackendSetName=").append(String.valueOf(this.defaultBackendSetName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", hostnameNames=").append(String.valueOf(this.hostnameNames));
        sb.append(", pathRouteSetName=").append(String.valueOf(this.pathRouteSetName));
        sb.append(", sslConfiguration=").append(String.valueOf(this.sslConfiguration));
        sb.append(", connectionConfiguration=")
                .append(String.valueOf(this.connectionConfiguration));
        sb.append(", routingPolicyName=").append(String.valueOf(this.routingPolicyName));
        sb.append(", ruleSetNames=").append(String.valueOf(this.ruleSetNames));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListenerDetails)) {
            return false;
        }

        ListenerDetails other = (ListenerDetails) o;
        return java.util.Objects.equals(this.defaultBackendSetName, other.defaultBackendSetName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.hostnameNames, other.hostnameNames)
                && java.util.Objects.equals(this.pathRouteSetName, other.pathRouteSetName)
                && java.util.Objects.equals(this.sslConfiguration, other.sslConfiguration)
                && java.util.Objects.equals(
                        this.connectionConfiguration, other.connectionConfiguration)
                && java.util.Objects.equals(this.routingPolicyName, other.routingPolicyName)
                && java.util.Objects.equals(this.ruleSetNames, other.ruleSetNames)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultBackendSetName == null
                                ? 43
                                : this.defaultBackendSetName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameNames == null ? 43 : this.hostnameNames.hashCode());
        result =
                (result * PRIME)
                        + (this.pathRouteSetName == null ? 43 : this.pathRouteSetName.hashCode());
        result =
                (result * PRIME)
                        + (this.sslConfiguration == null ? 43 : this.sslConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionConfiguration == null
                                ? 43
                                : this.connectionConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.routingPolicyName == null ? 43 : this.routingPolicyName.hashCode());
        result = (result * PRIME) + (this.ruleSetNames == null ? 43 : this.ruleSetNames.hashCode());
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
