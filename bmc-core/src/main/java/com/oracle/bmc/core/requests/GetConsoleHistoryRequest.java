/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetConsoleHistoryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetConsoleHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetConsoleHistoryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the console history.
     */
    private String instanceConsoleHistoryId;

    public String getInstanceConsoleHistoryId() {
        return instanceConsoleHistoryId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetConsoleHistoryRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String instanceConsoleHistoryId = null;

        /**
         * The OCID of the console history.
         * @return this builder instance
         */
        public Builder instanceConsoleHistoryId(String instanceConsoleHistoryId) {
            this.instanceConsoleHistoryId = instanceConsoleHistoryId;
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
        public Builder copy(GetConsoleHistoryRequest o) {
            instanceConsoleHistoryId(o.getInstanceConsoleHistoryId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetConsoleHistoryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetConsoleHistoryRequest
         */
        public GetConsoleHistoryRequest build() {
            GetConsoleHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetConsoleHistoryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetConsoleHistoryRequest
         */
        public GetConsoleHistoryRequest buildWithoutInvocationCallback() {
            GetConsoleHistoryRequest request = new GetConsoleHistoryRequest();
            request.instanceConsoleHistoryId = instanceConsoleHistoryId;
            return request;
            // new GetConsoleHistoryRequest(instanceConsoleHistoryId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().instanceConsoleHistoryId(instanceConsoleHistoryId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",instanceConsoleHistoryId=")
                .append(String.valueOf(this.instanceConsoleHistoryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConsoleHistoryRequest)) {
            return false;
        }

        GetConsoleHistoryRequest other = (GetConsoleHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.instanceConsoleHistoryId, other.instanceConsoleHistoryId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceConsoleHistoryId == null
                                ? 43
                                : this.instanceConsoleHistoryId.hashCode());
        return result;
    }
}
