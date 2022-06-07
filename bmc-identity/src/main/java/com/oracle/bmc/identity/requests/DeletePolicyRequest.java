/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/DeletePolicyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeletePolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeletePolicyRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the policy.
     */
    private String policyId;

    public String getPolicyId() {
        return policyId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeletePolicyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String policyId = null;

        /**
         * The OCID of the policy.
         * @return this builder instance
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(DeletePolicyRequest o) {
            policyId(o.getPolicyId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeletePolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeletePolicyRequest
         */
        public DeletePolicyRequest build() {
            DeletePolicyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeletePolicyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeletePolicyRequest
         */
        public DeletePolicyRequest buildWithoutInvocationCallback() {
            DeletePolicyRequest request = new DeletePolicyRequest();
            request.policyId = policyId;
            request.ifMatch = ifMatch;
            return request;
            // new DeletePolicyRequest(policyId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().policyId(policyId).ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",policyId=").append(String.valueOf(this.policyId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeletePolicyRequest)) {
            return false;
        }

        DeletePolicyRequest other = (DeletePolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.policyId, other.policyId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
