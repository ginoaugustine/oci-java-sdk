/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/UpdateEventExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateEventRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class UpdateEventRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagement.model.UpdateEventDetails> {

    /**
     * Instance Oracle Cloud identifier (ocid)
     */
    private String managedInstanceId;

    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * Unique Event identifier (OCID)
     */
    private String eventId;

    public String getEventId() {
        return eventId;
    }
    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Details about the event to update
     */
    private com.oracle.bmc.osmanagement.model.UpdateEventDetails updateEventDetails;

    public com.oracle.bmc.osmanagement.model.UpdateEventDetails getUpdateEventDetails() {
        return updateEventDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagement.model.UpdateEventDetails getBody$() {
        return updateEventDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateEventRequest, com.oracle.bmc.osmanagement.model.UpdateEventDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String managedInstanceId = null;

        /**
         * Instance Oracle Cloud identifier (ocid)
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        private String eventId = null;

        /**
         * Unique Event identifier (OCID)
         * @return this builder instance
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private com.oracle.bmc.osmanagement.model.UpdateEventDetails updateEventDetails = null;

        /**
         * Details about the event to update
         * @return this builder instance
         */
        public Builder updateEventDetails(
                com.oracle.bmc.osmanagement.model.UpdateEventDetails updateEventDetails) {
            this.updateEventDetails = updateEventDetails;
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
        public Builder copy(UpdateEventRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            eventId(o.getEventId());
            compartmentId(o.getCompartmentId());
            updateEventDetails(o.getUpdateEventDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateEventRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateEventRequest
         */
        public UpdateEventRequest build() {
            UpdateEventRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.osmanagement.model.UpdateEventDetails body) {
            updateEventDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateEventRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateEventRequest
         */
        public UpdateEventRequest buildWithoutInvocationCallback() {
            UpdateEventRequest request = new UpdateEventRequest();
            request.managedInstanceId = managedInstanceId;
            request.eventId = eventId;
            request.compartmentId = compartmentId;
            request.updateEventDetails = updateEventDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateEventRequest(managedInstanceId, eventId, compartmentId, updateEventDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .eventId(eventId)
                .compartmentId(compartmentId)
                .updateEventDetails(updateEventDetails)
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",eventId=").append(String.valueOf(this.eventId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",updateEventDetails=").append(String.valueOf(this.updateEventDetails));
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
        if (!(o instanceof UpdateEventRequest)) {
            return false;
        }

        UpdateEventRequest other = (UpdateEventRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.eventId, other.eventId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.updateEventDetails, other.updateEventDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateEventDetails == null
                                ? 43
                                : this.updateEventDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
