/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListRunsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * A list of com.oracle.bmc.dataflow.model.RunSummary instances.
     */
    private java.util.List<com.oracle.bmc.dataflow.model.RunSummary> items;

    public java.util.List<com.oracle.bmc.dataflow.model.RunSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcPrevPage",
        "opcNextPage",
        "opcRequestId",
        "items"
    })
    private ListRunsResponse(
            int __httpStatusCode__,
            String opcPrevPage,
            String opcNextPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.dataflow.model.RunSummary> items) {
        super(__httpStatusCode__);
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.items = items;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
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

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private java.util.List<com.oracle.bmc.dataflow.model.RunSummary> items;

        public Builder items(java.util.List<com.oracle.bmc.dataflow.model.RunSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListRunsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListRunsResponse build() {
            return new ListRunsResponse(
                    __httpStatusCode__, opcPrevPage, opcNextPage, opcRequestId, items);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRunsResponse)) {
            return false;
        }

        ListRunsResponse other = (ListRunsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
