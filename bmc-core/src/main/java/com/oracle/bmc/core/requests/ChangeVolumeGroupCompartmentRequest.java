/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVolumeGroupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeVolumeGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails> {

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group.
     */
    private String volumeGroupId;

    public String getVolumeGroupId() {
        return volumeGroupId;
    }
    /**
     * Request to change the compartment of given volume group.
     */
    private com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails
            changeVolumeGroupCompartmentDetails;

    public com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails
            getChangeVolumeGroupCompartmentDetails() {
        return changeVolumeGroupCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails getBody$() {
        return changeVolumeGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVolumeGroupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String volumeGroupId = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group.
         * @return this builder instance
         */
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            return this;
        }

        private com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails
                changeVolumeGroupCompartmentDetails = null;

        /**
         * Request to change the compartment of given volume group.
         * @return this builder instance
         */
        public Builder changeVolumeGroupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails
                        changeVolumeGroupCompartmentDetails) {
            this.changeVolumeGroupCompartmentDetails = changeVolumeGroupCompartmentDetails;
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
        public Builder copy(ChangeVolumeGroupCompartmentRequest o) {
            volumeGroupId(o.getVolumeGroupId());
            changeVolumeGroupCompartmentDetails(o.getChangeVolumeGroupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVolumeGroupCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVolumeGroupCompartmentRequest
         */
        public ChangeVolumeGroupCompartmentRequest build() {
            ChangeVolumeGroupCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ChangeVolumeGroupCompartmentDetails body) {
            changeVolumeGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVolumeGroupCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVolumeGroupCompartmentRequest
         */
        public ChangeVolumeGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVolumeGroupCompartmentRequest request = new ChangeVolumeGroupCompartmentRequest();
            request.volumeGroupId = volumeGroupId;
            request.changeVolumeGroupCompartmentDetails = changeVolumeGroupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeVolumeGroupCompartmentRequest(volumeGroupId, changeVolumeGroupCompartmentDetails, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeGroupId(volumeGroupId)
                .changeVolumeGroupCompartmentDetails(changeVolumeGroupCompartmentDetails)
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
        sb.append(",volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(",changeVolumeGroupCompartmentDetails=")
                .append(String.valueOf(this.changeVolumeGroupCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeVolumeGroupCompartmentRequest)) {
            return false;
        }

        ChangeVolumeGroupCompartmentRequest other = (ChangeVolumeGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(
                        this.changeVolumeGroupCompartmentDetails,
                        other.changeVolumeGroupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeVolumeGroupCompartmentDetails == null
                                ? 43
                                : this.changeVolumeGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
