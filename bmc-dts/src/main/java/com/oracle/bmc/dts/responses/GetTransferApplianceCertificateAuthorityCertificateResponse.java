/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class GetTransferApplianceCertificateAuthorityCertificateResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned TransferApplianceCertificate instance.
     */
    private com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate;

    public com.oracle.bmc.dts.model.TransferApplianceCertificate getTransferApplianceCertificate() {
        return transferApplianceCertificate;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "transferApplianceCertificate"
    })
    private GetTransferApplianceCertificateAuthorityCertificateResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.transferApplianceCertificate = transferApplianceCertificate;
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

        private com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate;

        public Builder transferApplianceCertificate(
                com.oracle.bmc.dts.model.TransferApplianceCertificate
                        transferApplianceCertificate) {
            this.transferApplianceCertificate = transferApplianceCertificate;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTransferApplianceCertificateAuthorityCertificateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferApplianceCertificate(o.getTransferApplianceCertificate());

            return this;
        }

        public GetTransferApplianceCertificateAuthorityCertificateResponse build() {
            return new GetTransferApplianceCertificateAuthorityCertificateResponse(
                    __httpStatusCode__, opcRequestId, etag, transferApplianceCertificate);
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
        sb.append(",transferApplianceCertificate=")
                .append(String.valueOf(transferApplianceCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTransferApplianceCertificateAuthorityCertificateResponse)) {
            return false;
        }

        GetTransferApplianceCertificateAuthorityCertificateResponse other =
                (GetTransferApplianceCertificateAuthorityCertificateResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.transferApplianceCertificate, other.transferApplianceCertificate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.transferApplianceCertificate == null
                                ? 43
                                : this.transferApplianceCertificate.hashCode());
        return result;
    }
}
