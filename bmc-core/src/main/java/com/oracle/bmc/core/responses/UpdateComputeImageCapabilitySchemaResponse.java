/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateComputeImageCapabilitySchemaResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ComputeImageCapabilitySchema instance.
     */
    private com.oracle.bmc.core.model.ComputeImageCapabilitySchema computeImageCapabilitySchema;

    public com.oracle.bmc.core.model.ComputeImageCapabilitySchema
            getComputeImageCapabilitySchema() {
        return computeImageCapabilitySchema;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "computeImageCapabilitySchema"
    })
    private UpdateComputeImageCapabilitySchemaResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.core.model.ComputeImageCapabilitySchema computeImageCapabilitySchema) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.computeImageCapabilitySchema = computeImageCapabilitySchema;
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

        private com.oracle.bmc.core.model.ComputeImageCapabilitySchema computeImageCapabilitySchema;

        public Builder computeImageCapabilitySchema(
                com.oracle.bmc.core.model.ComputeImageCapabilitySchema
                        computeImageCapabilitySchema) {
            this.computeImageCapabilitySchema = computeImageCapabilitySchema;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateComputeImageCapabilitySchemaResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            computeImageCapabilitySchema(o.getComputeImageCapabilitySchema());

            return this;
        }

        public UpdateComputeImageCapabilitySchemaResponse build() {
            return new UpdateComputeImageCapabilitySchemaResponse(
                    __httpStatusCode__, etag, opcRequestId, computeImageCapabilitySchema);
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
        sb.append(",computeImageCapabilitySchema=")
                .append(String.valueOf(computeImageCapabilitySchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateComputeImageCapabilitySchemaResponse)) {
            return false;
        }

        UpdateComputeImageCapabilitySchemaResponse other =
                (UpdateComputeImageCapabilitySchemaResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.computeImageCapabilitySchema, other.computeImageCapabilitySchema);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeImageCapabilitySchema == null
                                ? 43
                                : this.computeImageCapabilitySchema.hashCode());
        return result;
    }
}
