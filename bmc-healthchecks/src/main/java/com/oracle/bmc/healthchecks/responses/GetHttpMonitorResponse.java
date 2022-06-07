/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class GetHttpMonitorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned HttpMonitor instance, or null if {@link #isNotModified()} is true.
     */
    private com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor;

    public com.oracle.bmc.healthchecks.model.HttpMonitor getHttpMonitor() {
        return httpMonitor;
    }

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "httpMonitor",
        "isNotModified"
    })
    private GetHttpMonitorResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor,
            boolean isNotModified) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.httpMonitor = httpMonitor;
        this.isNotModified = isNotModified;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor;

        public Builder httpMonitor(com.oracle.bmc.healthchecks.model.HttpMonitor httpMonitor) {
            this.httpMonitor = httpMonitor;
            return this;
        }

        private boolean isNotModified;

        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetHttpMonitorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            httpMonitor(o.getHttpMonitor());
            isNotModified(o.isNotModified());
            return this;
        }

        public GetHttpMonitorResponse build() {
            return new GetHttpMonitorResponse(
                    __httpStatusCode__, opcRequestId, etag, httpMonitor, isNotModified);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",httpMonitor=").append(String.valueOf(httpMonitor));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetHttpMonitorResponse)) {
            return false;
        }

        GetHttpMonitorResponse other = (GetHttpMonitorResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.httpMonitor, other.httpMonitor)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.httpMonitor == null ? 43 : this.httpMonitor.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
