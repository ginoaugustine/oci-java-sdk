/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The results returned by running an HTTP probe.  All times and durations are
 * returned in milliseconds. All times are relative to the POSIX epoch
 * (1970-01-01T00:00Z). Time properties conform to W3C Resource Timing.
 * For more information, see
 * [PerformanceResourceTiming](https://w3c.github.io/resource-timing/#sec-resource-timing)
 * interface.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HttpProbeResultSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HttpProbeResultSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "probeConfigurationId",
        "startTime",
        "target",
        "vantagePointName",
        "isTimedOut",
        "isHealthy",
        "errorCategory",
        "errorMessage",
        "protocol",
        "connection",
        "dns",
        "statusCode",
        "domainLookupStart",
        "domainLookupEnd",
        "connectStart",
        "secureConnectionStart",
        "connectEnd",
        "fetchStart",
        "requestStart",
        "responseStart",
        "responseEnd",
        "duration",
        "encodedBodySize"
    })
    public HttpProbeResultSummary(
            String key,
            String probeConfigurationId,
            Double startTime,
            String target,
            String vantagePointName,
            Boolean isTimedOut,
            Boolean isHealthy,
            ErrorCategory errorCategory,
            String errorMessage,
            HttpProbeProtocol protocol,
            TcpConnection connection,
            DNS dns,
            Integer statusCode,
            Double domainLookupStart,
            Double domainLookupEnd,
            Double connectStart,
            Double secureConnectionStart,
            Double connectEnd,
            Double fetchStart,
            Double requestStart,
            Double responseStart,
            Double responseEnd,
            Double duration,
            Integer encodedBodySize) {
        super();
        this.key = key;
        this.probeConfigurationId = probeConfigurationId;
        this.startTime = startTime;
        this.target = target;
        this.vantagePointName = vantagePointName;
        this.isTimedOut = isTimedOut;
        this.isHealthy = isHealthy;
        this.errorCategory = errorCategory;
        this.errorMessage = errorMessage;
        this.protocol = protocol;
        this.connection = connection;
        this.dns = dns;
        this.statusCode = statusCode;
        this.domainLookupStart = domainLookupStart;
        this.domainLookupEnd = domainLookupEnd;
        this.connectStart = connectStart;
        this.secureConnectionStart = secureConnectionStart;
        this.connectEnd = connectEnd;
        this.fetchStart = fetchStart;
        this.requestStart = requestStart;
        this.responseStart = responseStart;
        this.responseEnd = responseEnd;
        this.duration = duration;
        this.encodedBodySize = encodedBodySize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("probeConfigurationId")
        private String probeConfigurationId;

        public Builder probeConfigurationId(String probeConfigurationId) {
            this.probeConfigurationId = probeConfigurationId;
            this.__explicitlySet__.add("probeConfigurationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private Double startTime;

        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointName")
        private String vantagePointName;

        public Builder vantagePointName(String vantagePointName) {
            this.vantagePointName = vantagePointName;
            this.__explicitlySet__.add("vantagePointName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTimedOut")
        private Boolean isTimedOut;

        public Builder isTimedOut(Boolean isTimedOut) {
            this.isTimedOut = isTimedOut;
            this.__explicitlySet__.add("isTimedOut");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
        private Boolean isHealthy;

        public Builder isHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            this.__explicitlySet__.add("isHealthy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCategory")
        private ErrorCategory errorCategory;

        public Builder errorCategory(ErrorCategory errorCategory) {
            this.errorCategory = errorCategory;
            this.__explicitlySet__.add("errorCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private HttpProbeProtocol protocol;

        public Builder protocol(HttpProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private TcpConnection connection;

        public Builder connection(TcpConnection connection) {
            this.connection = connection;
            this.__explicitlySet__.add("connection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dns")
        private DNS dns;

        public Builder dns(DNS dns) {
            this.dns = dns;
            this.__explicitlySet__.add("dns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
        private Integer statusCode;

        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            this.__explicitlySet__.add("statusCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupStart")
        private Double domainLookupStart;

        public Builder domainLookupStart(Double domainLookupStart) {
            this.domainLookupStart = domainLookupStart;
            this.__explicitlySet__.add("domainLookupStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupEnd")
        private Double domainLookupEnd;

        public Builder domainLookupEnd(Double domainLookupEnd) {
            this.domainLookupEnd = domainLookupEnd;
            this.__explicitlySet__.add("domainLookupEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectStart")
        private Double connectStart;

        public Builder connectStart(Double connectStart) {
            this.connectStart = connectStart;
            this.__explicitlySet__.add("connectStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secureConnectionStart")
        private Double secureConnectionStart;

        public Builder secureConnectionStart(Double secureConnectionStart) {
            this.secureConnectionStart = secureConnectionStart;
            this.__explicitlySet__.add("secureConnectionStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectEnd")
        private Double connectEnd;

        public Builder connectEnd(Double connectEnd) {
            this.connectEnd = connectEnd;
            this.__explicitlySet__.add("connectEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetchStart")
        private Double fetchStart;

        public Builder fetchStart(Double fetchStart) {
            this.fetchStart = fetchStart;
            this.__explicitlySet__.add("fetchStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestStart")
        private Double requestStart;

        public Builder requestStart(Double requestStart) {
            this.requestStart = requestStart;
            this.__explicitlySet__.add("requestStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseStart")
        private Double responseStart;

        public Builder responseStart(Double responseStart) {
            this.responseStart = responseStart;
            this.__explicitlySet__.add("responseStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseEnd")
        private Double responseEnd;

        public Builder responseEnd(Double responseEnd) {
            this.responseEnd = responseEnd;
            this.__explicitlySet__.add("responseEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Double duration;

        public Builder duration(Double duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encodedBodySize")
        private Integer encodedBodySize;

        public Builder encodedBodySize(Integer encodedBodySize) {
            this.encodedBodySize = encodedBodySize;
            this.__explicitlySet__.add("encodedBodySize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpProbeResultSummary build() {
            HttpProbeResultSummary __instance__ =
                    new HttpProbeResultSummary(
                            key,
                            probeConfigurationId,
                            startTime,
                            target,
                            vantagePointName,
                            isTimedOut,
                            isHealthy,
                            errorCategory,
                            errorMessage,
                            protocol,
                            connection,
                            dns,
                            statusCode,
                            domainLookupStart,
                            domainLookupEnd,
                            connectStart,
                            secureConnectionStart,
                            connectEnd,
                            fetchStart,
                            requestStart,
                            responseStart,
                            responseEnd,
                            duration,
                            encodedBodySize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpProbeResultSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .probeConfigurationId(o.getProbeConfigurationId())
                            .startTime(o.getStartTime())
                            .target(o.getTarget())
                            .vantagePointName(o.getVantagePointName())
                            .isTimedOut(o.getIsTimedOut())
                            .isHealthy(o.getIsHealthy())
                            .errorCategory(o.getErrorCategory())
                            .errorMessage(o.getErrorMessage())
                            .protocol(o.getProtocol())
                            .connection(o.getConnection())
                            .dns(o.getDns())
                            .statusCode(o.getStatusCode())
                            .domainLookupStart(o.getDomainLookupStart())
                            .domainLookupEnd(o.getDomainLookupEnd())
                            .connectStart(o.getConnectStart())
                            .secureConnectionStart(o.getSecureConnectionStart())
                            .connectEnd(o.getConnectEnd())
                            .fetchStart(o.getFetchStart())
                            .requestStart(o.getRequestStart())
                            .responseStart(o.getResponseStart())
                            .responseEnd(o.getResponseEnd())
                            .duration(o.getDuration())
                            .encodedBodySize(o.getEncodedBodySize());

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
     * A value identifying this specific probe result. The key is only unique within
     * the results of its probe configuration. The key may be reused after 90 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * The OCID of the monitor or on-demand probe responsible for creating this result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("probeConfigurationId")
    private final String probeConfigurationId;

    public String getProbeConfigurationId() {
        return probeConfigurationId;
    }

    /**
     * The date and time the probe was executed, expressed in milliseconds since the
     * POSIX epoch. This field is defined by the PerformanceResourceTiming interface
     * of the W3C Resource Timing specification. For more information, see
     * [Resource Timing](https://w3c.github.io/resource-timing/#sec-resource-timing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Double startTime;

    public Double getStartTime() {
        return startTime;
    }

    /**
     * The target hostname or IP address of the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    public String getTarget() {
        return target;
    }

    /**
     * The name of the vantage point that executed the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointName")
    private final String vantagePointName;

    public String getVantagePointName() {
        return vantagePointName;
    }

    /**
     * True if the probe did not complete before the configured {@code timeoutInSeconds} value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimedOut")
    private final Boolean isTimedOut;

    public Boolean getIsTimedOut() {
        return isTimedOut;
    }

    /**
     * True if the probe result is determined to be healthy based on probe
     * type-specific criteria.  For HTTP probes, a probe result is considered
     * healthy if the HTTP response code is greater than or equal to 200 and
     * less than 300.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
    private final Boolean isHealthy;

    public Boolean getIsHealthy() {
        return isHealthy;
    }

    /**
     * The category of error if an error occurs executing the probe.
     * The {@code errorMessage} field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a "TLS certificate expired" error.
     * * NETWORK - Network-related errors, for example a "network unreachable" error.
     * * SYSTEM - Internal system errors.
     *
     **/
    public enum ErrorCategory {
        None("NONE"),
        Dns("DNS"),
        Transport("TRANSPORT"),
        Network("NETWORK"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ErrorCategory.class);

        private final String value;
        private static java.util.Map<String, ErrorCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (ErrorCategory v : ErrorCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ErrorCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ErrorCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ErrorCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The category of error if an error occurs executing the probe.
     * The {@code errorMessage} field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a "TLS certificate expired" error.
     * * NETWORK - Network-related errors, for example a "network unreachable" error.
     * * SYSTEM - Internal system errors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCategory")
    private final ErrorCategory errorCategory;

    public ErrorCategory getErrorCategory() {
        return errorCategory;
    }

    /**
     * The error information indicating why a probe execution failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final HttpProbeProtocol protocol;

    public HttpProbeProtocol getProtocol() {
        return protocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    private final TcpConnection connection;

    public TcpConnection getConnection() {
        return connection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    private final DNS dns;

    public DNS getDns() {
        return dns;
    }

    /**
     * The HTTP response status code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
    private final Integer statusCode;

    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * The time immediately before the vantage point starts the domain name lookup for
     * the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupStart")
    private final Double domainLookupStart;

    public Double getDomainLookupStart() {
        return domainLookupStart;
    }

    /**
     * The time immediately before the vantage point finishes the domain name lookup for
     * the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupEnd")
    private final Double domainLookupEnd;

    public Double getDomainLookupEnd() {
        return domainLookupEnd;
    }

    /**
     * The time immediately before the vantage point starts establishing the connection
     * to the server to retrieve the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectStart")
    private final Double connectStart;

    public Double getConnectStart() {
        return connectStart;
    }

    /**
     * The time immediately before the vantage point starts the handshake process to
     * secure the current connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secureConnectionStart")
    private final Double secureConnectionStart;

    public Double getSecureConnectionStart() {
        return secureConnectionStart;
    }

    /**
     * The time immediately after the vantage point finishes establishing the connection
     * to the server to retrieve the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectEnd")
    private final Double connectEnd;

    public Double getConnectEnd() {
        return connectEnd;
    }

    /**
     * The time immediately before the vantage point starts to fetch the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchStart")
    private final Double fetchStart;

    public Double getFetchStart() {
        return fetchStart;
    }

    /**
     * The time immediately before the vantage point starts requesting the resource from
     * the server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestStart")
    private final Double requestStart;

    public Double getRequestStart() {
        return requestStart;
    }

    /**
     * The time immediately after the vantage point's HTTP parser receives the first byte
     * of the response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseStart")
    private final Double responseStart;

    public Double getResponseStart() {
        return responseStart;
    }

    /**
     * The time immediately after the vantage point receives the last byte of the response
     * or immediately before the transport connection is closed, whichever comes first.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseEnd")
    private final Double responseEnd;

    public Double getResponseEnd() {
        return responseEnd;
    }

    /**
     * The total duration from start of request until response is fully consumed or the
     * connection is closed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Double duration;

    public Double getDuration() {
        return duration;
    }

    /**
     * The size, in octets, of the payload body prior to removing any applied
     * content-codings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encodedBodySize")
    private final Integer encodedBodySize;

    public Integer getEncodedBodySize() {
        return encodedBodySize;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HttpProbeResultSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", probeConfigurationId=").append(String.valueOf(this.probeConfigurationId));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", vantagePointName=").append(String.valueOf(this.vantagePointName));
        sb.append(", isTimedOut=").append(String.valueOf(this.isTimedOut));
        sb.append(", isHealthy=").append(String.valueOf(this.isHealthy));
        sb.append(", errorCategory=").append(String.valueOf(this.errorCategory));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", connection=").append(String.valueOf(this.connection));
        sb.append(", dns=").append(String.valueOf(this.dns));
        sb.append(", statusCode=").append(String.valueOf(this.statusCode));
        sb.append(", domainLookupStart=").append(String.valueOf(this.domainLookupStart));
        sb.append(", domainLookupEnd=").append(String.valueOf(this.domainLookupEnd));
        sb.append(", connectStart=").append(String.valueOf(this.connectStart));
        sb.append(", secureConnectionStart=").append(String.valueOf(this.secureConnectionStart));
        sb.append(", connectEnd=").append(String.valueOf(this.connectEnd));
        sb.append(", fetchStart=").append(String.valueOf(this.fetchStart));
        sb.append(", requestStart=").append(String.valueOf(this.requestStart));
        sb.append(", responseStart=").append(String.valueOf(this.responseStart));
        sb.append(", responseEnd=").append(String.valueOf(this.responseEnd));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", encodedBodySize=").append(String.valueOf(this.encodedBodySize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpProbeResultSummary)) {
            return false;
        }

        HttpProbeResultSummary other = (HttpProbeResultSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.probeConfigurationId, other.probeConfigurationId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.vantagePointName, other.vantagePointName)
                && java.util.Objects.equals(this.isTimedOut, other.isTimedOut)
                && java.util.Objects.equals(this.isHealthy, other.isHealthy)
                && java.util.Objects.equals(this.errorCategory, other.errorCategory)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.connection, other.connection)
                && java.util.Objects.equals(this.dns, other.dns)
                && java.util.Objects.equals(this.statusCode, other.statusCode)
                && java.util.Objects.equals(this.domainLookupStart, other.domainLookupStart)
                && java.util.Objects.equals(this.domainLookupEnd, other.domainLookupEnd)
                && java.util.Objects.equals(this.connectStart, other.connectStart)
                && java.util.Objects.equals(this.secureConnectionStart, other.secureConnectionStart)
                && java.util.Objects.equals(this.connectEnd, other.connectEnd)
                && java.util.Objects.equals(this.fetchStart, other.fetchStart)
                && java.util.Objects.equals(this.requestStart, other.requestStart)
                && java.util.Objects.equals(this.responseStart, other.responseStart)
                && java.util.Objects.equals(this.responseEnd, other.responseEnd)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.encodedBodySize, other.encodedBodySize)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.probeConfigurationId == null
                                ? 43
                                : this.probeConfigurationId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePointName == null ? 43 : this.vantagePointName.hashCode());
        result = (result * PRIME) + (this.isTimedOut == null ? 43 : this.isTimedOut.hashCode());
        result = (result * PRIME) + (this.isHealthy == null ? 43 : this.isHealthy.hashCode());
        result =
                (result * PRIME)
                        + (this.errorCategory == null ? 43 : this.errorCategory.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.connection == null ? 43 : this.connection.hashCode());
        result = (result * PRIME) + (this.dns == null ? 43 : this.dns.hashCode());
        result = (result * PRIME) + (this.statusCode == null ? 43 : this.statusCode.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLookupStart == null ? 43 : this.domainLookupStart.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLookupEnd == null ? 43 : this.domainLookupEnd.hashCode());
        result = (result * PRIME) + (this.connectStart == null ? 43 : this.connectStart.hashCode());
        result =
                (result * PRIME)
                        + (this.secureConnectionStart == null
                                ? 43
                                : this.secureConnectionStart.hashCode());
        result = (result * PRIME) + (this.connectEnd == null ? 43 : this.connectEnd.hashCode());
        result = (result * PRIME) + (this.fetchStart == null ? 43 : this.fetchStart.hashCode());
        result = (result * PRIME) + (this.requestStart == null ? 43 : this.requestStart.hashCode());
        result =
                (result * PRIME)
                        + (this.responseStart == null ? 43 : this.responseStart.hashCode());
        result = (result * PRIME) + (this.responseEnd == null ? 43 : this.responseEnd.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.encodedBodySize == null ? 43 : this.encodedBodySize.hashCode());
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
