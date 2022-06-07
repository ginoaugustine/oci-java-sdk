/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetSecurityAssessmentComparisonResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned SecurityAssessmentComparison instance.
     */
    private com.oracle.bmc.datasafe.model.SecurityAssessmentComparison securityAssessmentComparison;

    public com.oracle.bmc.datasafe.model.SecurityAssessmentComparison
            getSecurityAssessmentComparison() {
        return securityAssessmentComparison;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "securityAssessmentComparison"
    })
    private GetSecurityAssessmentComparisonResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.datasafe.model.SecurityAssessmentComparison
                    securityAssessmentComparison) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.securityAssessmentComparison = securityAssessmentComparison;
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

        private com.oracle.bmc.datasafe.model.SecurityAssessmentComparison
                securityAssessmentComparison;

        public Builder securityAssessmentComparison(
                com.oracle.bmc.datasafe.model.SecurityAssessmentComparison
                        securityAssessmentComparison) {
            this.securityAssessmentComparison = securityAssessmentComparison;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSecurityAssessmentComparisonResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            securityAssessmentComparison(o.getSecurityAssessmentComparison());

            return this;
        }

        public GetSecurityAssessmentComparisonResponse build() {
            return new GetSecurityAssessmentComparisonResponse(
                    __httpStatusCode__, opcRequestId, etag, securityAssessmentComparison);
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
        sb.append(",securityAssessmentComparison=")
                .append(String.valueOf(securityAssessmentComparison));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecurityAssessmentComparisonResponse)) {
            return false;
        }

        GetSecurityAssessmentComparisonResponse other = (GetSecurityAssessmentComparisonResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.securityAssessmentComparison, other.securityAssessmentComparison);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAssessmentComparison == null
                                ? 43
                                : this.securityAssessmentComparison.hashCode());
        return result;
    }
}
