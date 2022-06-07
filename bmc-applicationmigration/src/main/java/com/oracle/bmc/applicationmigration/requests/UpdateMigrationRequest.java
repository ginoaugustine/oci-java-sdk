/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.requests;

import com.oracle.bmc.applicationmigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/UpdateMigrationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMigrationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public class UpdateMigrationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the migration.
     */
    private String migrationId;

    public String getMigrationId() {
        return migrationId;
    }
    /**
     * Updated configuration for the migration.
     *
     */
    private com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails updateMigrationDetails;

    public com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails
            getUpdateMigrationDetails() {
        return updateMigrationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of retrying the same action. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example,
     * if a resource has been deleted and purged from the system, then a retry of the original
     * creation request may be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
    public com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails getBody$() {
        return updateMigrationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMigrationRequest,
                    com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String migrationId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the migration.
         * @return this builder instance
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        private com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails
                updateMigrationDetails = null;

        /**
         * Updated configuration for the migration.
         *
         * @return this builder instance
         */
        public Builder updateMigrationDetails(
                com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails
                        updateMigrationDetails) {
            this.updateMigrationDetails = updateMigrationDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of retrying the same action. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource
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
        public Builder copy(UpdateMigrationRequest o) {
            migrationId(o.getMigrationId());
            updateMigrationDetails(o.getUpdateMigrationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMigrationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateMigrationRequest
         */
        public UpdateMigrationRequest build() {
            UpdateMigrationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.applicationmigration.model.UpdateMigrationDetails body) {
            updateMigrationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMigrationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMigrationRequest
         */
        public UpdateMigrationRequest buildWithoutInvocationCallback() {
            UpdateMigrationRequest request = new UpdateMigrationRequest();
            request.migrationId = migrationId;
            request.updateMigrationDetails = updateMigrationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateMigrationRequest(migrationId, updateMigrationDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .migrationId(migrationId)
                .updateMigrationDetails(updateMigrationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",migrationId=").append(String.valueOf(this.migrationId));
        sb.append(",updateMigrationDetails=").append(String.valueOf(this.updateMigrationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMigrationRequest)) {
            return false;
        }

        UpdateMigrationRequest other = (UpdateMigrationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(
                        this.updateMigrationDetails, other.updateMigrationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMigrationDetails == null
                                ? 43
                                : this.updateMigrationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
