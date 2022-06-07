/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A list of Web Application Firewall log entries. Each entry is a JSON object, including a timestamp property and other fields varying based on log type. Logs record what rules and countermeasures are triggered by requests and are used as a basis to move request handling into block mode. For more information about WAF logs, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WafLog {
    @Deprecated
    @java.beans.ConstructorProperties({
        "action",
        "captchaAction",
        "captchaExpected",
        "captchaReceived",
        "captchaFailCount",
        "clientAddress",
        "countryName",
        "userAgent",
        "domain",
        "protectionRuleDetections",
        "httpMethod",
        "requestUrl",
        "httpHeaders",
        "referrer",
        "responseCode",
        "responseSize",
        "incidentKey",
        "fingerprint",
        "device",
        "countryCode",
        "requestHeaders",
        "threatFeedKey",
        "accessRuleKey",
        "addressRateLimitingKey",
        "timestamp",
        "logType",
        "originAddress",
        "originResponseTime"
    })
    public WafLog(
            String action,
            String captchaAction,
            String captchaExpected,
            String captchaReceived,
            String captchaFailCount,
            String clientAddress,
            String countryName,
            String userAgent,
            String domain,
            java.util.Map<String, String> protectionRuleDetections,
            String httpMethod,
            String requestUrl,
            java.util.Map<String, String> httpHeaders,
            String referrer,
            Integer responseCode,
            Integer responseSize,
            String incidentKey,
            String fingerprint,
            String device,
            String countryCode,
            java.util.Map<String, String> requestHeaders,
            String threatFeedKey,
            String accessRuleKey,
            String addressRateLimitingKey,
            java.util.Date timestamp,
            String logType,
            String originAddress,
            String originResponseTime) {
        super();
        this.action = action;
        this.captchaAction = captchaAction;
        this.captchaExpected = captchaExpected;
        this.captchaReceived = captchaReceived;
        this.captchaFailCount = captchaFailCount;
        this.clientAddress = clientAddress;
        this.countryName = countryName;
        this.userAgent = userAgent;
        this.domain = domain;
        this.protectionRuleDetections = protectionRuleDetections;
        this.httpMethod = httpMethod;
        this.requestUrl = requestUrl;
        this.httpHeaders = httpHeaders;
        this.referrer = referrer;
        this.responseCode = responseCode;
        this.responseSize = responseSize;
        this.incidentKey = incidentKey;
        this.fingerprint = fingerprint;
        this.device = device;
        this.countryCode = countryCode;
        this.requestHeaders = requestHeaders;
        this.threatFeedKey = threatFeedKey;
        this.accessRuleKey = accessRuleKey;
        this.addressRateLimitingKey = addressRateLimitingKey;
        this.timestamp = timestamp;
        this.logType = logType;
        this.originAddress = originAddress;
        this.originResponseTime = originResponseTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
        private String captchaAction;

        public Builder captchaAction(String captchaAction) {
            this.captchaAction = captchaAction;
            this.__explicitlySet__.add("captchaAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
        private String captchaExpected;

        public Builder captchaExpected(String captchaExpected) {
            this.captchaExpected = captchaExpected;
            this.__explicitlySet__.add("captchaExpected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
        private String captchaReceived;

        public Builder captchaReceived(String captchaReceived) {
            this.captchaReceived = captchaReceived;
            this.__explicitlySet__.add("captchaReceived");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
        private String captchaFailCount;

        public Builder captchaFailCount(String captchaFailCount) {
            this.captchaFailCount = captchaFailCount;
            this.__explicitlySet__.add("captchaFailCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
        private String clientAddress;

        public Builder clientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
            this.__explicitlySet__.add("clientAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
        private String userAgent;

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            this.__explicitlySet__.add("userAgent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
        private java.util.Map<String, String> protectionRuleDetections;

        public Builder protectionRuleDetections(
                java.util.Map<String, String> protectionRuleDetections) {
            this.protectionRuleDetections = protectionRuleDetections;
            this.__explicitlySet__.add("protectionRuleDetections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
        private String httpMethod;

        public Builder httpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            this.__explicitlySet__.add("httpMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
        private String requestUrl;

        public Builder requestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            this.__explicitlySet__.add("requestUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
        private java.util.Map<String, String> httpHeaders;

        public Builder httpHeaders(java.util.Map<String, String> httpHeaders) {
            this.httpHeaders = httpHeaders;
            this.__explicitlySet__.add("httpHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referrer")
        private String referrer;

        public Builder referrer(String referrer) {
            this.referrer = referrer;
            this.__explicitlySet__.add("referrer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private Integer responseCode;

        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
        private Integer responseSize;

        public Builder responseSize(Integer responseSize) {
            this.responseSize = responseSize;
            this.__explicitlySet__.add("responseSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
        private String incidentKey;

        public Builder incidentKey(String incidentKey) {
            this.incidentKey = incidentKey;
            this.__explicitlySet__.add("incidentKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, String> requestHeaders;

        public Builder requestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
        private String threatFeedKey;

        public Builder threatFeedKey(String threatFeedKey) {
            this.threatFeedKey = threatFeedKey;
            this.__explicitlySet__.add("threatFeedKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
        private String accessRuleKey;

        public Builder accessRuleKey(String accessRuleKey) {
            this.accessRuleKey = accessRuleKey;
            this.__explicitlySet__.add("accessRuleKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
        private String addressRateLimitingKey;

        public Builder addressRateLimitingKey(String addressRateLimitingKey) {
            this.addressRateLimitingKey = addressRateLimitingKey;
            this.__explicitlySet__.add("addressRateLimitingKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private String logType;

        public Builder logType(String logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
        private String originAddress;

        public Builder originAddress(String originAddress) {
            this.originAddress = originAddress;
            this.__explicitlySet__.add("originAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
        private String originResponseTime;

        public Builder originResponseTime(String originResponseTime) {
            this.originResponseTime = originResponseTime;
            this.__explicitlySet__.add("originResponseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafLog build() {
            WafLog __instance__ =
                    new WafLog(
                            action,
                            captchaAction,
                            captchaExpected,
                            captchaReceived,
                            captchaFailCount,
                            clientAddress,
                            countryName,
                            userAgent,
                            domain,
                            protectionRuleDetections,
                            httpMethod,
                            requestUrl,
                            httpHeaders,
                            referrer,
                            responseCode,
                            responseSize,
                            incidentKey,
                            fingerprint,
                            device,
                            countryCode,
                            requestHeaders,
                            threatFeedKey,
                            accessRuleKey,
                            addressRateLimitingKey,
                            timestamp,
                            logType,
                            originAddress,
                            originResponseTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafLog o) {
            Builder copiedBuilder =
                    action(o.getAction())
                            .captchaAction(o.getCaptchaAction())
                            .captchaExpected(o.getCaptchaExpected())
                            .captchaReceived(o.getCaptchaReceived())
                            .captchaFailCount(o.getCaptchaFailCount())
                            .clientAddress(o.getClientAddress())
                            .countryName(o.getCountryName())
                            .userAgent(o.getUserAgent())
                            .domain(o.getDomain())
                            .protectionRuleDetections(o.getProtectionRuleDetections())
                            .httpMethod(o.getHttpMethod())
                            .requestUrl(o.getRequestUrl())
                            .httpHeaders(o.getHttpHeaders())
                            .referrer(o.getReferrer())
                            .responseCode(o.getResponseCode())
                            .responseSize(o.getResponseSize())
                            .incidentKey(o.getIncidentKey())
                            .fingerprint(o.getFingerprint())
                            .device(o.getDevice())
                            .countryCode(o.getCountryCode())
                            .requestHeaders(o.getRequestHeaders())
                            .threatFeedKey(o.getThreatFeedKey())
                            .accessRuleKey(o.getAccessRuleKey())
                            .addressRateLimitingKey(o.getAddressRateLimitingKey())
                            .timestamp(o.getTimestamp())
                            .logType(o.getLogType())
                            .originAddress(o.getOriginAddress())
                            .originResponseTime(o.getOriginResponseTime());

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
     * The action taken on the request, either {@code ALLOW}, {@code DETECT}, or {@code BLOCK}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    public String getAction() {
        return action;
    }

    /**
     * The CAPTCHA action taken on the request, {@code ALLOW} or {@code BLOCK}. For more information about
     * CAPTCHAs, see {@code UpdateCaptchas}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
    private final String captchaAction;

    public String getCaptchaAction() {
        return captchaAction;
    }

    /**
     * The CAPTCHA challenge answer that was expected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
    private final String captchaExpected;

    public String getCaptchaExpected() {
        return captchaExpected;
    }

    /**
     * The CAPTCHA challenge answer that was received.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
    private final String captchaReceived;

    public String getCaptchaReceived() {
        return captchaReceived;
    }

    /**
     * The number of times the CAPTCHA challenge was failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
    private final String captchaFailCount;

    public String getCaptchaFailCount() {
        return captchaFailCount;
    }

    /**
     * The IPv4 address of the requesting client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
    private final String clientAddress;

    public String getClientAddress() {
        return clientAddress;
    }

    /**
     * The name of the country where the request originated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    private final String countryName;

    public String getCountryName() {
        return countryName;
    }

    /**
     * The value of the request's {@code User-Agent} header field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    private final String userAgent;

    public String getUserAgent() {
        return userAgent;
    }

    /**
     * The {@code Host} header data of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    public String getDomain() {
        return domain;
    }

    /**
     * A map of protection rule keys to detection message details. Detections are
     * requests that matched the criteria of a protection rule but the rule's
     * action was set to {@code DETECT}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
    private final java.util.Map<String, String> protectionRuleDetections;

    public java.util.Map<String, String> getProtectionRuleDetections() {
        return protectionRuleDetections;
    }

    /**
     * The HTTP method of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
    private final String httpMethod;

    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * The path and query string of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
    private final String requestUrl;

    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * The map of the request's header names to their respective values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
    private final java.util.Map<String, String> httpHeaders;

    public java.util.Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * The {@code Referrer} header value of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    private final String referrer;

    public String getReferrer() {
        return referrer;
    }

    /**
     * The status code of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    private final Integer responseCode;

    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * The size in bytes of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
    private final Integer responseSize;

    public Integer getResponseSize() {
        return responseSize;
    }

    /**
     * The incident key of a request. An incident key is generated for
     * each request processed by the Web Application Firewall and is used to
     * idenitfy blocked requests in applicable logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
    private final String incidentKey;

    public String getIncidentKey() {
        return incidentKey;
    }

    /**
     * The hashed signature of the device's fingerprint. For more information,
     * see {@code DeviceFingerPrintChallenge}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * The type of device that the request was made from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    public String getDevice() {
        return device;
    }

    /**
     * ISO 3166-1 alpha-2 code of the country from which the request originated.
     * For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    /**
     * A map of header names to values of the request sent to the origin, including any headers
     * appended by the Web Application Firewall.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    private final java.util.Map<String, String> requestHeaders;

    public java.util.Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * The {@code ThreatFeed} key that matched the request. For more information about
     * threat feeds, see {@code UpdateThreatFeeds}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
    private final String threatFeedKey;

    public String getThreatFeedKey() {
        return threatFeedKey;
    }

    /**
     * The {@code AccessRule} key that matched the request. For more information about
     * access rules, see {@code UpdateAccessRules}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
    private final String accessRuleKey;

    public String getAccessRuleKey() {
        return accessRuleKey;
    }

    /**
     * The {@code AddressRateLimiting} key that matched the request. For more information
     * about address rate limiting, see {@code UpdateWafAddressRateLimiting}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
    private final String addressRateLimitingKey;

    public String getAddressRateLimitingKey() {
        return addressRateLimitingKey;
    }

    /**
     * The date and time the Web Application Firewall processed the request and logged it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The type of log of the request. For more about log types, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final String logType;

    public String getLogType() {
        return logType;
    }

    /**
     * The address of the origin server where the request was sent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
    private final String originAddress;

    public String getOriginAddress() {
        return originAddress;
    }

    /**
     * The amount of time it took the origin server to respond to the request, in seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
    private final String originResponseTime;

    public String getOriginResponseTime() {
        return originResponseTime;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WafLog(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", captchaAction=").append(String.valueOf(this.captchaAction));
        sb.append(", captchaExpected=").append(String.valueOf(this.captchaExpected));
        sb.append(", captchaReceived=").append(String.valueOf(this.captchaReceived));
        sb.append(", captchaFailCount=").append(String.valueOf(this.captchaFailCount));
        sb.append(", clientAddress=").append(String.valueOf(this.clientAddress));
        sb.append(", countryName=").append(String.valueOf(this.countryName));
        sb.append(", userAgent=").append(String.valueOf(this.userAgent));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", protectionRuleDetections=")
                .append(String.valueOf(this.protectionRuleDetections));
        sb.append(", httpMethod=").append(String.valueOf(this.httpMethod));
        sb.append(", requestUrl=").append(String.valueOf(this.requestUrl));
        sb.append(", httpHeaders=").append(String.valueOf(this.httpHeaders));
        sb.append(", referrer=").append(String.valueOf(this.referrer));
        sb.append(", responseCode=").append(String.valueOf(this.responseCode));
        sb.append(", responseSize=").append(String.valueOf(this.responseSize));
        sb.append(", incidentKey=").append(String.valueOf(this.incidentKey));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", device=").append(String.valueOf(this.device));
        sb.append(", countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", requestHeaders=").append(String.valueOf(this.requestHeaders));
        sb.append(", threatFeedKey=").append(String.valueOf(this.threatFeedKey));
        sb.append(", accessRuleKey=").append(String.valueOf(this.accessRuleKey));
        sb.append(", addressRateLimitingKey=").append(String.valueOf(this.addressRateLimitingKey));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", originAddress=").append(String.valueOf(this.originAddress));
        sb.append(", originResponseTime=").append(String.valueOf(this.originResponseTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WafLog)) {
            return false;
        }

        WafLog other = (WafLog) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.captchaAction, other.captchaAction)
                && java.util.Objects.equals(this.captchaExpected, other.captchaExpected)
                && java.util.Objects.equals(this.captchaReceived, other.captchaReceived)
                && java.util.Objects.equals(this.captchaFailCount, other.captchaFailCount)
                && java.util.Objects.equals(this.clientAddress, other.clientAddress)
                && java.util.Objects.equals(this.countryName, other.countryName)
                && java.util.Objects.equals(this.userAgent, other.userAgent)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(
                        this.protectionRuleDetections, other.protectionRuleDetections)
                && java.util.Objects.equals(this.httpMethod, other.httpMethod)
                && java.util.Objects.equals(this.requestUrl, other.requestUrl)
                && java.util.Objects.equals(this.httpHeaders, other.httpHeaders)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && java.util.Objects.equals(this.responseCode, other.responseCode)
                && java.util.Objects.equals(this.responseSize, other.responseSize)
                && java.util.Objects.equals(this.incidentKey, other.incidentKey)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.requestHeaders, other.requestHeaders)
                && java.util.Objects.equals(this.threatFeedKey, other.threatFeedKey)
                && java.util.Objects.equals(this.accessRuleKey, other.accessRuleKey)
                && java.util.Objects.equals(
                        this.addressRateLimitingKey, other.addressRateLimitingKey)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.originAddress, other.originAddress)
                && java.util.Objects.equals(this.originResponseTime, other.originResponseTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaAction == null ? 43 : this.captchaAction.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaExpected == null ? 43 : this.captchaExpected.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaReceived == null ? 43 : this.captchaReceived.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaFailCount == null ? 43 : this.captchaFailCount.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAddress == null ? 43 : this.clientAddress.hashCode());
        result = (result * PRIME) + (this.countryName == null ? 43 : this.countryName.hashCode());
        result = (result * PRIME) + (this.userAgent == null ? 43 : this.userAgent.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionRuleDetections == null
                                ? 43
                                : this.protectionRuleDetections.hashCode());
        result = (result * PRIME) + (this.httpMethod == null ? 43 : this.httpMethod.hashCode());
        result = (result * PRIME) + (this.requestUrl == null ? 43 : this.requestUrl.hashCode());
        result = (result * PRIME) + (this.httpHeaders == null ? 43 : this.httpHeaders.hashCode());
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result = (result * PRIME) + (this.responseCode == null ? 43 : this.responseCode.hashCode());
        result = (result * PRIME) + (this.responseSize == null ? 43 : this.responseSize.hashCode());
        result = (result * PRIME) + (this.incidentKey == null ? 43 : this.incidentKey.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result =
                (result * PRIME)
                        + (this.requestHeaders == null ? 43 : this.requestHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.threatFeedKey == null ? 43 : this.threatFeedKey.hashCode());
        result =
                (result * PRIME)
                        + (this.accessRuleKey == null ? 43 : this.accessRuleKey.hashCode());
        result =
                (result * PRIME)
                        + (this.addressRateLimitingKey == null
                                ? 43
                                : this.addressRateLimitingKey.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result =
                (result * PRIME)
                        + (this.originAddress == null ? 43 : this.originAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.originResponseTime == null
                                ? 43
                                : this.originResponseTime.hashCode());
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
