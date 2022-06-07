/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetLabelSummaryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned LabelSummaryReport instance.
     */
    private com.oracle.bmc.loganalytics.model.LabelSummaryReport labelSummaryReport;

    public com.oracle.bmc.loganalytics.model.LabelSummaryReport getLabelSummaryReport() {
        return labelSummaryReport;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "labelSummaryReport"})
    private GetLabelSummaryResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LabelSummaryReport labelSummaryReport) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.labelSummaryReport = labelSummaryReport;
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

        private com.oracle.bmc.loganalytics.model.LabelSummaryReport labelSummaryReport;

        public Builder labelSummaryReport(
                com.oracle.bmc.loganalytics.model.LabelSummaryReport labelSummaryReport) {
            this.labelSummaryReport = labelSummaryReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetLabelSummaryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            labelSummaryReport(o.getLabelSummaryReport());

            return this;
        }

        public GetLabelSummaryResponse build() {
            return new GetLabelSummaryResponse(
                    __httpStatusCode__, opcRequestId, labelSummaryReport);
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
        sb.append(",labelSummaryReport=").append(String.valueOf(labelSummaryReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLabelSummaryResponse)) {
            return false;
        }

        GetLabelSummaryResponse other = (GetLabelSummaryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.labelSummaryReport, other.labelSummaryReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.labelSummaryReport == null
                                ? 43
                                : this.labelSummaryReport.hashCode());
        return result;
    }
}
