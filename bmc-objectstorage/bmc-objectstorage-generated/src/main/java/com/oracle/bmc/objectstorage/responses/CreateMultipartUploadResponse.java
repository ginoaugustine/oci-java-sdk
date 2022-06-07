/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateMultipartUploadResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The full path to the new upload.
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * The returned MultipartUpload instance.
     */
    private com.oracle.bmc.objectstorage.model.MultipartUpload multipartUpload;

    public com.oracle.bmc.objectstorage.model.MultipartUpload getMultipartUpload() {
        return multipartUpload;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "location",
        "multipartUpload"
    })
    private CreateMultipartUploadResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.objectstorage.model.MultipartUpload multipartUpload) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.multipartUpload = multipartUpload;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcClientRequestId;

        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.MultipartUpload multipartUpload;

        public Builder multipartUpload(
                com.oracle.bmc.objectstorage.model.MultipartUpload multipartUpload) {
            this.multipartUpload = multipartUpload;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateMultipartUploadResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            multipartUpload(o.getMultipartUpload());

            return this;
        }

        public CreateMultipartUploadResponse build() {
            return new CreateMultipartUploadResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    location,
                    multipartUpload);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",multipartUpload=").append(String.valueOf(multipartUpload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMultipartUploadResponse)) {
            return false;
        }

        CreateMultipartUploadResponse other = (CreateMultipartUploadResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.multipartUpload, other.multipartUpload);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.multipartUpload == null ? 43 : this.multipartUpload.hashCode());
        return result;
    }
}
