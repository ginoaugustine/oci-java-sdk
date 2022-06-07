/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.responses;

import com.oracle.bmc.analytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class GetWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The number of seconds a client should wait before polling this endpoint again.
     *
     */
    private Integer retryAfter;

    public Integer getRetryAfter() {
        return retryAfter;
    }

    /**
     * The returned WorkRequest instance.
     */
    private com.oracle.bmc.analytics.model.WorkRequest workRequest;

    public com.oracle.bmc.analytics.model.WorkRequest getWorkRequest() {
        return workRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "retryAfter",
        "workRequest"
    })
    private GetWorkRequestResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            Integer retryAfter,
            com.oracle.bmc.analytics.model.WorkRequest workRequest) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.workRequest = workRequest;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Integer retryAfter;

        public Builder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        private com.oracle.bmc.analytics.model.WorkRequest workRequest;

        public Builder workRequest(com.oracle.bmc.analytics.model.WorkRequest workRequest) {
            this.workRequest = workRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            workRequest(o.getWorkRequest());

            return this;
        }

        public GetWorkRequestResponse build() {
            return new GetWorkRequestResponse(
                    __httpStatusCode__, etag, opcRequestId, retryAfter, workRequest);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",workRequest=").append(String.valueOf(workRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetWorkRequestResponse)) {
            return false;
        }

        GetWorkRequestResponse other = (GetWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.workRequest, other.workRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result = (result * PRIME) + (this.workRequest == null ? 43 : this.workRequest.hashCode());
        return result;
    }
}
