/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class ListNetworkLoadBalancersResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned NetworkLoadBalancerCollection instance.
     */
    private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
            networkLoadBalancerCollection;

    public com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
            getNetworkLoadBalancerCollection() {
        return networkLoadBalancerCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "networkLoadBalancerCollection"
    })
    private ListNetworkLoadBalancersResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
                    networkLoadBalancerCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.networkLoadBalancerCollection = networkLoadBalancerCollection;
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

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
                networkLoadBalancerCollection;

        public Builder networkLoadBalancerCollection(
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerCollection
                        networkLoadBalancerCollection) {
            this.networkLoadBalancerCollection = networkLoadBalancerCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListNetworkLoadBalancersResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            networkLoadBalancerCollection(o.getNetworkLoadBalancerCollection());

            return this;
        }

        public ListNetworkLoadBalancersResponse build() {
            return new ListNetworkLoadBalancersResponse(
                    __httpStatusCode__, opcRequestId, opcNextPage, networkLoadBalancerCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",networkLoadBalancerCollection=")
                .append(String.valueOf(networkLoadBalancerCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNetworkLoadBalancersResponse)) {
            return false;
        }

        ListNetworkLoadBalancersResponse other = (ListNetworkLoadBalancersResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.networkLoadBalancerCollection, other.networkLoadBalancerCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerCollection == null
                                ? 43
                                : this.networkLoadBalancerCollection.hashCode());
        return result;
    }
}
