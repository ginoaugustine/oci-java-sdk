/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.responses;

import com.oracle.bmc.recovery.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class CreateProtectionPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Relative URL of the newly created resource. */
    private String location;

    /**
     * Relative URL of the newly created resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** Unique Oracle-assigned identifier of the work request. */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier of the work request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned ProtectionPolicy instance. */
    private com.oracle.bmc.recovery.model.ProtectionPolicy protectionPolicy;

    /**
     * The returned ProtectionPolicy instance.
     *
     * @return the value
     */
    public com.oracle.bmc.recovery.model.ProtectionPolicy getProtectionPolicy() {
        return protectionPolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "protectionPolicy"
    })
    private CreateProtectionPolicyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String location,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.recovery.model.ProtectionPolicy protectionPolicy) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.protectionPolicy = protectionPolicy;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateProtectionPolicyResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** Relative URL of the newly created resource. */
        private String location;

        /**
         * Relative URL of the newly created resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** Unique Oracle-assigned identifier of the work request. */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier of the work request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned ProtectionPolicy instance. */
        private com.oracle.bmc.recovery.model.ProtectionPolicy protectionPolicy;

        /**
         * The returned ProtectionPolicy instance.
         *
         * @param protectionPolicy the value to set
         * @return this builder
         */
        public Builder protectionPolicy(
                com.oracle.bmc.recovery.model.ProtectionPolicy protectionPolicy) {
            this.protectionPolicy = protectionPolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateProtectionPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            protectionPolicy(o.getProtectionPolicy());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateProtectionPolicyResponse build() {
            return new CreateProtectionPolicyResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    protectionPolicy);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",protectionPolicy=").append(String.valueOf(protectionPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateProtectionPolicyResponse)) {
            return false;
        }

        CreateProtectionPolicyResponse other = (CreateProtectionPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.protectionPolicy, other.protectionPolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionPolicy == null ? 43 : this.protectionPolicy.hashCode());
        return result;
    }
}
