/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVolumeCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeVolumeCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails> {

    /**
     * The OCID of the volume.
     */
    private String volumeId;

    public String getVolumeId() {
        return volumeId;
    }
    /**
     * Request to change the compartment of given volume.
     */
    private com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails changeVolumeCompartmentDetails;

    public com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails
            getChangeVolumeCompartmentDetails() {
        return changeVolumeCompartmentDetails;
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

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails getBody$() {
        return changeVolumeCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVolumeCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String volumeId = null;

        /**
         * The OCID of the volume.
         * @return this builder instance
         */
        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        private com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails
                changeVolumeCompartmentDetails = null;

        /**
         * Request to change the compartment of given volume.
         * @return this builder instance
         */
        public Builder changeVolumeCompartmentDetails(
                com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails
                        changeVolumeCompartmentDetails) {
            this.changeVolumeCompartmentDetails = changeVolumeCompartmentDetails;
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
        public Builder copy(ChangeVolumeCompartmentRequest o) {
            volumeId(o.getVolumeId());
            changeVolumeCompartmentDetails(o.getChangeVolumeCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVolumeCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVolumeCompartmentRequest
         */
        public ChangeVolumeCompartmentRequest build() {
            ChangeVolumeCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ChangeVolumeCompartmentDetails body) {
            changeVolumeCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVolumeCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVolumeCompartmentRequest
         */
        public ChangeVolumeCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVolumeCompartmentRequest request = new ChangeVolumeCompartmentRequest();
            request.volumeId = volumeId;
            request.changeVolumeCompartmentDetails = changeVolumeCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeVolumeCompartmentRequest(volumeId, changeVolumeCompartmentDetails, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeId(volumeId)
                .changeVolumeCompartmentDetails(changeVolumeCompartmentDetails)
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
        sb.append(",volumeId=").append(String.valueOf(this.volumeId));
        sb.append(",changeVolumeCompartmentDetails=")
                .append(String.valueOf(this.changeVolumeCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeVolumeCompartmentRequest)) {
            return false;
        }

        ChangeVolumeCompartmentRequest other = (ChangeVolumeCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
                && java.util.Objects.equals(
                        this.changeVolumeCompartmentDetails, other.changeVolumeCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeVolumeCompartmentDetails == null
                                ? 43
                                : this.changeVolumeCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
