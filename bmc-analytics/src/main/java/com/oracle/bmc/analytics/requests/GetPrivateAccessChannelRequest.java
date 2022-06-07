/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/GetPrivateAccessChannelExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetPrivateAccessChannelRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class GetPrivateAccessChannelRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier key of the Private Access Channel.
     *
     */
    private String privateAccessChannelKey;

    public String getPrivateAccessChannelKey() {
        return privateAccessChannelKey;
    }
    /**
     * The OCID of the AnalyticsInstance.
     *
     */
    private String analyticsInstanceId;

    public String getAnalyticsInstanceId() {
        return analyticsInstanceId;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPrivateAccessChannelRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String privateAccessChannelKey = null;

        /**
         * The unique identifier key of the Private Access Channel.
         *
         * @return this builder instance
         */
        public Builder privateAccessChannelKey(String privateAccessChannelKey) {
            this.privateAccessChannelKey = privateAccessChannelKey;
            return this;
        }

        private String analyticsInstanceId = null;

        /**
         * The OCID of the AnalyticsInstance.
         *
         * @return this builder instance
         */
        public Builder analyticsInstanceId(String analyticsInstanceId) {
            this.analyticsInstanceId = analyticsInstanceId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPrivateAccessChannelRequest o) {
            privateAccessChannelKey(o.getPrivateAccessChannelKey());
            analyticsInstanceId(o.getAnalyticsInstanceId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPrivateAccessChannelRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetPrivateAccessChannelRequest
         */
        public GetPrivateAccessChannelRequest build() {
            GetPrivateAccessChannelRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetPrivateAccessChannelRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPrivateAccessChannelRequest
         */
        public GetPrivateAccessChannelRequest buildWithoutInvocationCallback() {
            GetPrivateAccessChannelRequest request = new GetPrivateAccessChannelRequest();
            request.privateAccessChannelKey = privateAccessChannelKey;
            request.analyticsInstanceId = analyticsInstanceId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetPrivateAccessChannelRequest(privateAccessChannelKey, analyticsInstanceId, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .privateAccessChannelKey(privateAccessChannelKey)
                .analyticsInstanceId(analyticsInstanceId)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",privateAccessChannelKey=").append(String.valueOf(this.privateAccessChannelKey));
        sb.append(",analyticsInstanceId=").append(String.valueOf(this.analyticsInstanceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPrivateAccessChannelRequest)) {
            return false;
        }

        GetPrivateAccessChannelRequest other = (GetPrivateAccessChannelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.privateAccessChannelKey, other.privateAccessChannelKey)
                && java.util.Objects.equals(this.analyticsInstanceId, other.analyticsInstanceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateAccessChannelKey == null
                                ? 43
                                : this.privateAccessChannelKey.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticsInstanceId == null
                                ? 43
                                : this.analyticsInstanceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
