/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPrivateIpsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPrivateIpsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListPrivateIpsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * An IP address. This could be either IPv4 or IPv6, depending on the resource.
     * Example: {@code 10.0.3.3}
     *
     */
    private String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
     */
    private String subnetId;

    public String getSubnetId() {
        return subnetId;
    }
    /**
     * The OCID of the VNIC.
     */
    private String vnicId;

    public String getVnicId() {
        return vnicId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
     */
    private String vlanId;

    public String getVlanId() {
        return vlanId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPrivateIpsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String ipAddress = null;

        /**
         * An IP address. This could be either IPv4 or IPv6, depending on the resource.
         * Example: {@code 10.0.3.3}
         *
         * @return this builder instance
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        private String subnetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
         * @return this builder instance
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        private String vnicId = null;

        /**
         * The OCID of the VNIC.
         * @return this builder instance
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            return this;
        }

        private String vlanId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
         * @return this builder instance
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
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
        public Builder copy(ListPrivateIpsRequest o) {
            limit(o.getLimit());
            page(o.getPage());
            ipAddress(o.getIpAddress());
            subnetId(o.getSubnetId());
            vnicId(o.getVnicId());
            vlanId(o.getVlanId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPrivateIpsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPrivateIpsRequest
         */
        public ListPrivateIpsRequest build() {
            ListPrivateIpsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPrivateIpsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPrivateIpsRequest
         */
        public ListPrivateIpsRequest buildWithoutInvocationCallback() {
            ListPrivateIpsRequest request = new ListPrivateIpsRequest();
            request.limit = limit;
            request.page = page;
            request.ipAddress = ipAddress;
            request.subnetId = subnetId;
            request.vnicId = vnicId;
            request.vlanId = vlanId;
            return request;
            // new ListPrivateIpsRequest(limit, page, ipAddress, subnetId, vnicId, vlanId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .limit(limit)
                .page(page)
                .ipAddress(ipAddress)
                .subnetId(subnetId)
                .vnicId(vnicId)
                .vlanId(vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(",subnetId=").append(String.valueOf(this.subnetId));
        sb.append(",vnicId=").append(String.valueOf(this.vnicId));
        sb.append(",vlanId=").append(String.valueOf(this.vlanId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateIpsRequest)) {
            return false;
        }

        ListPrivateIpsRequest other = (ListPrivateIpsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.vlanId, other.vlanId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        return result;
    }
}
