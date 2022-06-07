/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdatePipelineExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePipelineRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class UpdatePipelineRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.UpdatePipelineDetails> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The pipeline key.
     */
    private String pipelineKey;

    public String getPipelineKey() {
        return pipelineKey;
    }
    /**
     * The details needed to updated a pipeline.
     */
    private com.oracle.bmc.dataintegration.model.UpdatePipelineDetails updatePipelineDetails;

    public com.oracle.bmc.dataintegration.model.UpdatePipelineDetails getUpdatePipelineDetails() {
        return updatePipelineDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataintegration.model.UpdatePipelineDetails getBody$() {
        return updatePipelineDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePipelineRequest,
                    com.oracle.bmc.dataintegration.model.UpdatePipelineDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String workspaceId = null;

        /**
         * The workspace ID.
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        private String pipelineKey = null;

        /**
         * The pipeline key.
         * @return this builder instance
         */
        public Builder pipelineKey(String pipelineKey) {
            this.pipelineKey = pipelineKey;
            return this;
        }

        private com.oracle.bmc.dataintegration.model.UpdatePipelineDetails updatePipelineDetails =
                null;

        /**
         * The details needed to updated a pipeline.
         * @return this builder instance
         */
        public Builder updatePipelineDetails(
                com.oracle.bmc.dataintegration.model.UpdatePipelineDetails updatePipelineDetails) {
            this.updatePipelineDetails = updatePipelineDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdatePipelineRequest o) {
            workspaceId(o.getWorkspaceId());
            pipelineKey(o.getPipelineKey());
            updatePipelineDetails(o.getUpdatePipelineDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePipelineRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePipelineRequest
         */
        public UpdatePipelineRequest build() {
            UpdatePipelineRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataintegration.model.UpdatePipelineDetails body) {
            updatePipelineDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePipelineRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePipelineRequest
         */
        public UpdatePipelineRequest buildWithoutInvocationCallback() {
            UpdatePipelineRequest request = new UpdatePipelineRequest();
            request.workspaceId = workspaceId;
            request.pipelineKey = pipelineKey;
            request.updatePipelineDetails = updatePipelineDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePipelineRequest(workspaceId, pipelineKey, updatePipelineDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .pipelineKey(pipelineKey)
                .updatePipelineDetails(updatePipelineDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",pipelineKey=").append(String.valueOf(this.pipelineKey));
        sb.append(",updatePipelineDetails=").append(String.valueOf(this.updatePipelineDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePipelineRequest)) {
            return false;
        }

        UpdatePipelineRequest other = (UpdatePipelineRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.pipelineKey, other.pipelineKey)
                && java.util.Objects.equals(this.updatePipelineDetails, other.updatePipelineDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.pipelineKey == null ? 43 : this.pipelineKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePipelineDetails == null
                                ? 43
                                : this.updatePipelineDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
