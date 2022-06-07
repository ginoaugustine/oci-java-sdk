/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListRunLogsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Retrieves the previous page of results.
     * When this header appears in the response, previous pages of results exist.
     * See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * Retrieves the next page of results. When this header appears in the response,
     * additional pages of results remain. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * A list of com.oracle.bmc.dataflow.model.RunLogSummary instances.
     */
    private java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items;

    public java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcPrevPage",
        "opcNextPage",
        "items"
    })
    private ListRunLogsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcPrevPage,
            String opcNextPage,
            java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.items = items;
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

        private String opcPrevPage;

        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items;

        public Builder items(java.util.List<com.oracle.bmc.dataflow.model.RunLogSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListRunLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        public ListRunLogsResponse build() {
            return new ListRunLogsResponse(
                    __httpStatusCode__, opcRequestId, opcPrevPage, opcNextPage, items);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRunLogsResponse)) {
            return false;
        }

        ListRunLogsResponse other = (ListRunLogsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
