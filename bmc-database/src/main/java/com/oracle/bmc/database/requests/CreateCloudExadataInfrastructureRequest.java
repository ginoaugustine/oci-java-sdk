/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateCloudExadataInfrastructureRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateCloudExadataInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails> {

    /**
     * Request to create a cloud Exadata infrastructure resource in an [Exadata Cloud Service](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm) instance.
     *
     */
    private com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails
            createCloudExadataInfrastructureDetails;

    public com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails
            getCreateCloudExadataInfrastructureDetails() {
        return createCloudExadataInfrastructureDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails getBody$() {
        return createCloudExadataInfrastructureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCloudExadataInfrastructureRequest,
                    com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails
                createCloudExadataInfrastructureDetails = null;

        /**
         * Request to create a cloud Exadata infrastructure resource in an [Exadata Cloud Service](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm) instance.
         *
         * @return this builder instance
         */
        public Builder createCloudExadataInfrastructureDetails(
                com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails
                        createCloudExadataInfrastructureDetails) {
            this.createCloudExadataInfrastructureDetails = createCloudExadataInfrastructureDetails;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(CreateCloudExadataInfrastructureRequest o) {
            createCloudExadataInfrastructureDetails(o.getCreateCloudExadataInfrastructureDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCloudExadataInfrastructureRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateCloudExadataInfrastructureRequest
         */
        public CreateCloudExadataInfrastructureRequest build() {
            CreateCloudExadataInfrastructureRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.database.model.CreateCloudExadataInfrastructureDetails body) {
            createCloudExadataInfrastructureDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCloudExadataInfrastructureRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCloudExadataInfrastructureRequest
         */
        public CreateCloudExadataInfrastructureRequest buildWithoutInvocationCallback() {
            CreateCloudExadataInfrastructureRequest request =
                    new CreateCloudExadataInfrastructureRequest();
            request.createCloudExadataInfrastructureDetails =
                    createCloudExadataInfrastructureDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateCloudExadataInfrastructureRequest(createCloudExadataInfrastructureDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .createCloudExadataInfrastructureDetails(createCloudExadataInfrastructureDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createCloudExadataInfrastructureDetails=")
                .append(String.valueOf(this.createCloudExadataInfrastructureDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCloudExadataInfrastructureRequest)) {
            return false;
        }

        CreateCloudExadataInfrastructureRequest other = (CreateCloudExadataInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createCloudExadataInfrastructureDetails,
                        other.createCloudExadataInfrastructureDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createCloudExadataInfrastructureDetails == null
                                ? 43
                                : this.createCloudExadataInfrastructureDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
