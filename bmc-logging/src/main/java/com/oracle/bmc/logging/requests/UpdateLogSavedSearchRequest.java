/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/UpdateLogSavedSearchExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLogSavedSearchRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class UpdateLogSavedSearchRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails> {

    /**
     * OCID of the logSavedSearch
     *
     */
    private String logSavedSearchId;

    public String getLogSavedSearchId() {
        return logSavedSearchId;
    }
    /**
     * Updates to the saved search.
     */
    private com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails updateLogSavedSearchDetails;

    public com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails
            getUpdateLogSavedSearchDetails() {
        return updateLogSavedSearchDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails getBody$() {
        return updateLogSavedSearchDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLogSavedSearchRequest,
                    com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String logSavedSearchId = null;

        /**
         * OCID of the logSavedSearch
         *
         * @return this builder instance
         */
        public Builder logSavedSearchId(String logSavedSearchId) {
            this.logSavedSearchId = logSavedSearchId;
            return this;
        }

        private com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails
                updateLogSavedSearchDetails = null;

        /**
         * Updates to the saved search.
         * @return this builder instance
         */
        public Builder updateLogSavedSearchDetails(
                com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails
                        updateLogSavedSearchDetails) {
            this.updateLogSavedSearchDetails = updateLogSavedSearchDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
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
        public Builder copy(UpdateLogSavedSearchRequest o) {
            logSavedSearchId(o.getLogSavedSearchId());
            updateLogSavedSearchDetails(o.getUpdateLogSavedSearchDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLogSavedSearchRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLogSavedSearchRequest
         */
        public UpdateLogSavedSearchRequest build() {
            UpdateLogSavedSearchRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.logging.model.UpdateLogSavedSearchDetails body) {
            updateLogSavedSearchDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLogSavedSearchRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLogSavedSearchRequest
         */
        public UpdateLogSavedSearchRequest buildWithoutInvocationCallback() {
            UpdateLogSavedSearchRequest request = new UpdateLogSavedSearchRequest();
            request.logSavedSearchId = logSavedSearchId;
            request.updateLogSavedSearchDetails = updateLogSavedSearchDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateLogSavedSearchRequest(logSavedSearchId, updateLogSavedSearchDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .logSavedSearchId(logSavedSearchId)
                .updateLogSavedSearchDetails(updateLogSavedSearchDetails)
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
        sb.append(",logSavedSearchId=").append(String.valueOf(this.logSavedSearchId));
        sb.append(",updateLogSavedSearchDetails=")
                .append(String.valueOf(this.updateLogSavedSearchDetails));
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
        if (!(o instanceof UpdateLogSavedSearchRequest)) {
            return false;
        }

        UpdateLogSavedSearchRequest other = (UpdateLogSavedSearchRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logSavedSearchId, other.logSavedSearchId)
                && java.util.Objects.equals(
                        this.updateLogSavedSearchDetails, other.updateLogSavedSearchDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.logSavedSearchId == null ? 43 : this.logSavedSearchId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLogSavedSearchDetails == null
                                ? 43
                                : this.updateLogSavedSearchDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
