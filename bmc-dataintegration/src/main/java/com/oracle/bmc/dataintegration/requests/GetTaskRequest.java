/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetTaskExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTaskRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetTaskRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The task key.
     */
    private String taskKey;

    public String getTaskKey() {
        return taskKey;
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
     * Used to expand references of the object. If value is true, then all referenced objects are expanded. If value is false, then shallow objects are returned in place of references. Default is false. <br><br><B>Example:</B><br> <ul> <li><B>?expandReferences=true</B> returns all objects of type data loader task</li> </ul>
     */
    private String expandReferences;

    public String getExpandReferences() {
        return expandReferences;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetTaskRequest, java.lang.Void> {
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

        private String taskKey = null;

        /**
         * The task key.
         * @return this builder instance
         */
        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
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

        private String expandReferences = null;

        /**
         * Used to expand references of the object. If value is true, then all referenced objects are expanded. If value is false, then shallow objects are returned in place of references. Default is false. <br><br><B>Example:</B><br> <ul> <li><B>?expandReferences=true</B> returns all objects of type data loader task</li> </ul>
         * @return this builder instance
         */
        public Builder expandReferences(String expandReferences) {
            this.expandReferences = expandReferences;
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
        public Builder copy(GetTaskRequest o) {
            workspaceId(o.getWorkspaceId());
            taskKey(o.getTaskKey());
            opcRequestId(o.getOpcRequestId());
            expandReferences(o.getExpandReferences());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTaskRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetTaskRequest
         */
        public GetTaskRequest build() {
            GetTaskRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTaskRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTaskRequest
         */
        public GetTaskRequest buildWithoutInvocationCallback() {
            GetTaskRequest request = new GetTaskRequest();
            request.workspaceId = workspaceId;
            request.taskKey = taskKey;
            request.opcRequestId = opcRequestId;
            request.expandReferences = expandReferences;
            return request;
            // new GetTaskRequest(workspaceId, taskKey, opcRequestId, expandReferences);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .taskKey(taskKey)
                .opcRequestId(opcRequestId)
                .expandReferences(expandReferences);
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
        sb.append(",taskKey=").append(String.valueOf(this.taskKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",expandReferences=").append(String.valueOf(this.expandReferences));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTaskRequest)) {
            return false;
        }

        GetTaskRequest other = (GetTaskRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.taskKey, other.taskKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.expandReferences, other.expandReferences);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.expandReferences == null ? 43 : this.expandReferences.hashCode());
        return result;
    }
}
