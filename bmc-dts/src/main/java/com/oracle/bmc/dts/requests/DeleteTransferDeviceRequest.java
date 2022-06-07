/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/DeleteTransferDeviceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteTransferDeviceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class DeleteTransferDeviceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * ID of the Transfer Job
     */
    private String id;

    public String getId() {
        return id;
    }
    /**
     * Label of the Transfer Device
     */
    private String transferDeviceLabel;

    public String getTransferDeviceLabel() {
        return transferDeviceLabel;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteTransferDeviceRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String id = null;

        /**
         * ID of the Transfer Job
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        private String transferDeviceLabel = null;

        /**
         * Label of the Transfer Device
         * @return this builder instance
         */
        public Builder transferDeviceLabel(String transferDeviceLabel) {
            this.transferDeviceLabel = transferDeviceLabel;
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
        public Builder copy(DeleteTransferDeviceRequest o) {
            id(o.getId());
            transferDeviceLabel(o.getTransferDeviceLabel());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteTransferDeviceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteTransferDeviceRequest
         */
        public DeleteTransferDeviceRequest build() {
            DeleteTransferDeviceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteTransferDeviceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteTransferDeviceRequest
         */
        public DeleteTransferDeviceRequest buildWithoutInvocationCallback() {
            DeleteTransferDeviceRequest request = new DeleteTransferDeviceRequest();
            request.id = id;
            request.transferDeviceLabel = transferDeviceLabel;
            return request;
            // new DeleteTransferDeviceRequest(id, transferDeviceLabel);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().id(id).transferDeviceLabel(transferDeviceLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",transferDeviceLabel=").append(String.valueOf(this.transferDeviceLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteTransferDeviceRequest)) {
            return false;
        }

        DeleteTransferDeviceRequest other = (DeleteTransferDeviceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.transferDeviceLabel, other.transferDeviceLabel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.transferDeviceLabel == null
                                ? 43
                                : this.transferDeviceLabel.hashCode());
        return result;
    }
}
