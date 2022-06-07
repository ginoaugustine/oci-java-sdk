/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.responses;

import com.oracle.bmc.dataconnectivity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateDataPreviewResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned DataPreview instance.
     */
    private com.oracle.bmc.dataconnectivity.model.DataPreview dataPreview;

    public com.oracle.bmc.dataconnectivity.model.DataPreview getDataPreview() {
        return dataPreview;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "dataPreview"})
    private CreateDataPreviewResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.dataconnectivity.model.DataPreview dataPreview) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.dataPreview = dataPreview;
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

        private com.oracle.bmc.dataconnectivity.model.DataPreview dataPreview;

        public Builder dataPreview(com.oracle.bmc.dataconnectivity.model.DataPreview dataPreview) {
            this.dataPreview = dataPreview;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateDataPreviewResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            dataPreview(o.getDataPreview());

            return this;
        }

        public CreateDataPreviewResponse build() {
            return new CreateDataPreviewResponse(__httpStatusCode__, opcRequestId, dataPreview);
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
        sb.append(",dataPreview=").append(String.valueOf(dataPreview));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataPreviewResponse)) {
            return false;
        }

        CreateDataPreviewResponse other = (CreateDataPreviewResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.dataPreview, other.dataPreview);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.dataPreview == null ? 43 : this.dataPreview.hashCode());
        return result;
    }
}
