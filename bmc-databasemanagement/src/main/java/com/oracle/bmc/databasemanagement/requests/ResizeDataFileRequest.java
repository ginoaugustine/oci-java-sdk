/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ResizeDataFileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ResizeDataFileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ResizeDataFileRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The name of the tablespace.
     */
    private String tablespaceName;

    public String getTablespaceName() {
        return tablespaceName;
    }
    /**
     * The details required to resize a data file or temp file within the tablespace.
     *
     */
    private com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails resizeDataFileDetails;

    public com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails
            getResizeDataFileDetails() {
        return resizeDataFileDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails getBody$() {
        return resizeDataFileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ResizeDataFileRequest,
                    com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        private String tablespaceName = null;

        /**
         * The name of the tablespace.
         * @return this builder instance
         */
        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            return this;
        }

        private com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails
                resizeDataFileDetails = null;

        /**
         * The details required to resize a data file or temp file within the tablespace.
         *
         * @return this builder instance
         */
        public Builder resizeDataFileDetails(
                com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails
                        resizeDataFileDetails) {
            this.resizeDataFileDetails = resizeDataFileDetails;
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

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ResizeDataFileRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            tablespaceName(o.getTablespaceName());
            resizeDataFileDetails(o.getResizeDataFileDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ResizeDataFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ResizeDataFileRequest
         */
        public ResizeDataFileRequest build() {
            ResizeDataFileRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.databasemanagement.model.ResizeDataFileDetails body) {
            resizeDataFileDetails(body);
            return this;
        }

        /**
         * Build the instance of ResizeDataFileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ResizeDataFileRequest
         */
        public ResizeDataFileRequest buildWithoutInvocationCallback() {
            ResizeDataFileRequest request = new ResizeDataFileRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.tablespaceName = tablespaceName;
            request.resizeDataFileDetails = resizeDataFileDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ResizeDataFileRequest(managedDatabaseId, tablespaceName, resizeDataFileDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .tablespaceName(tablespaceName)
                .resizeDataFileDetails(resizeDataFileDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",tablespaceName=").append(String.valueOf(this.tablespaceName));
        sb.append(",resizeDataFileDetails=").append(String.valueOf(this.resizeDataFileDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResizeDataFileRequest)) {
            return false;
        }

        ResizeDataFileRequest other = (ResizeDataFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.tablespaceName, other.tablespaceName)
                && java.util.Objects.equals(this.resizeDataFileDetails, other.resizeDataFileDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceName == null ? 43 : this.tablespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.resizeDataFileDetails == null
                                ? 43
                                : this.resizeDataFileDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
