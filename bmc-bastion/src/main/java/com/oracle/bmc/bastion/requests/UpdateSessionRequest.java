/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.requests;

import com.oracle.bmc.bastion.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bastion/UpdateSessionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSessionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
public class UpdateSessionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bastion.model.UpdateSessionDetails> {

    /**
     * The unique identifier (OCID) of the session.
     */
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }
    /**
     * The session information to be updated.
     */
    private com.oracle.bmc.bastion.model.UpdateSessionDetails updateSessionDetails;

    public com.oracle.bmc.bastion.model.UpdateSessionDetails getUpdateSessionDetails() {
        return updateSessionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.bastion.model.UpdateSessionDetails getBody$() {
        return updateSessionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSessionRequest, com.oracle.bmc.bastion.model.UpdateSessionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String sessionId = null;

        /**
         * The unique identifier (OCID) of the session.
         * @return this builder instance
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        private com.oracle.bmc.bastion.model.UpdateSessionDetails updateSessionDetails = null;

        /**
         * The session information to be updated.
         * @return this builder instance
         */
        public Builder updateSessionDetails(
                com.oracle.bmc.bastion.model.UpdateSessionDetails updateSessionDetails) {
            this.updateSessionDetails = updateSessionDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateSessionRequest o) {
            sessionId(o.getSessionId());
            updateSessionDetails(o.getUpdateSessionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSessionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSessionRequest
         */
        public UpdateSessionRequest build() {
            UpdateSessionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.bastion.model.UpdateSessionDetails body) {
            updateSessionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSessionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSessionRequest
         */
        public UpdateSessionRequest buildWithoutInvocationCallback() {
            UpdateSessionRequest request = new UpdateSessionRequest();
            request.sessionId = sessionId;
            request.updateSessionDetails = updateSessionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSessionRequest(sessionId, updateSessionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .sessionId(sessionId)
                .updateSessionDetails(updateSessionDetails)
                .ifMatch(ifMatch)
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
        sb.append(",sessionId=").append(String.valueOf(this.sessionId));
        sb.append(",updateSessionDetails=").append(String.valueOf(this.updateSessionDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSessionRequest)) {
            return false;
        }

        UpdateSessionRequest other = (UpdateSessionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sessionId, other.sessionId)
                && java.util.Objects.equals(this.updateSessionDetails, other.updateSessionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSessionDetails == null
                                ? 43
                                : this.updateSessionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
