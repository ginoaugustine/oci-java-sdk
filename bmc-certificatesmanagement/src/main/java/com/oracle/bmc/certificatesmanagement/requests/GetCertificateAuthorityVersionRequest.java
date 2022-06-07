/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/GetCertificateAuthorityVersionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCertificateAuthorityVersionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class GetCertificateAuthorityVersionRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the certificate authority (CA).
     */
    private String certificateAuthorityId;

    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }
    /**
     * The version number of the certificate authority (CA).
     */
    private Long certificateAuthorityVersionNumber;

    public Long getCertificateAuthorityVersionNumber() {
        return certificateAuthorityVersionNumber;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCertificateAuthorityVersionRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String certificateAuthorityId = null;

        /**
         * The OCID of the certificate authority (CA).
         * @return this builder instance
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        private Long certificateAuthorityVersionNumber = null;

        /**
         * The version number of the certificate authority (CA).
         * @return this builder instance
         */
        public Builder certificateAuthorityVersionNumber(Long certificateAuthorityVersionNumber) {
            this.certificateAuthorityVersionNumber = certificateAuthorityVersionNumber;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(GetCertificateAuthorityVersionRequest o) {
            certificateAuthorityId(o.getCertificateAuthorityId());
            certificateAuthorityVersionNumber(o.getCertificateAuthorityVersionNumber());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCertificateAuthorityVersionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCertificateAuthorityVersionRequest
         */
        public GetCertificateAuthorityVersionRequest build() {
            GetCertificateAuthorityVersionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCertificateAuthorityVersionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCertificateAuthorityVersionRequest
         */
        public GetCertificateAuthorityVersionRequest buildWithoutInvocationCallback() {
            GetCertificateAuthorityVersionRequest request =
                    new GetCertificateAuthorityVersionRequest();
            request.certificateAuthorityId = certificateAuthorityId;
            request.certificateAuthorityVersionNumber = certificateAuthorityVersionNumber;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCertificateAuthorityVersionRequest(certificateAuthorityId, certificateAuthorityVersionNumber, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateAuthorityId(certificateAuthorityId)
                .certificateAuthorityVersionNumber(certificateAuthorityVersionNumber)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(",certificateAuthorityVersionNumber=")
                .append(String.valueOf(this.certificateAuthorityVersionNumber));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCertificateAuthorityVersionRequest)) {
            return false;
        }

        GetCertificateAuthorityVersionRequest other = (GetCertificateAuthorityVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(
                        this.certificateAuthorityVersionNumber,
                        other.certificateAuthorityVersionNumber)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityVersionNumber == null
                                ? 43
                                : this.certificateAuthorityVersionNumber.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
