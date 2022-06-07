/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/ListIncidentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListIncidentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class ListIncidentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Customer Support Identifier associated with the support account.
     */
    private String csi;

    public String getCsi() {
        return csi;
    }
    /**
     * The OCID of the tenancy.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     */
    private String ocid;

    public String getOcid() {
        return ocid;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The key to use to sort the returned items.
     */
    private com.oracle.bmc.cims.model.SortBy sortBy;

    public com.oracle.bmc.cims.model.SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The order to sort the results in.
     */
    private com.oracle.bmc.cims.model.SortOrder sortOrder;

    public com.oracle.bmc.cims.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The current state of the ticket.
     */
    private com.oracle.bmc.cims.model.LifecycleState lifecycleState;

    public com.oracle.bmc.cims.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The region of the tenancy.
     */
    private String homeregion;

    public String getHomeregion() {
        return homeregion;
    }
    /**
     * The kind of support request.
     */
    private String problemType;

    public String getProblemType() {
        return problemType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListIncidentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String csi = null;

        /**
         * The Customer Support Identifier associated with the support account.
         * @return this builder instance
         */
        public Builder csi(String csi) {
            this.csi = csi;
            return this;
        }

        private String compartmentId = null;

        /**
         * The OCID of the tenancy.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String ocid = null;

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         * @return this builder instance
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            return this;
        }

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private com.oracle.bmc.cims.model.SortBy sortBy = null;

        /**
         * The key to use to sort the returned items.
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.cims.model.SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private com.oracle.bmc.cims.model.SortOrder sortOrder = null;

        /**
         * The order to sort the results in.
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cims.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private com.oracle.bmc.cims.model.LifecycleState lifecycleState = null;

        /**
         * The current state of the ticket.
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.cims.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String homeregion = null;

        /**
         * The region of the tenancy.
         * @return this builder instance
         */
        public Builder homeregion(String homeregion) {
            this.homeregion = homeregion;
            return this;
        }

        private String problemType = null;

        /**
         * The kind of support request.
         * @return this builder instance
         */
        public Builder problemType(String problemType) {
            this.problemType = problemType;
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
        public Builder copy(ListIncidentsRequest o) {
            csi(o.getCsi());
            compartmentId(o.getCompartmentId());
            ocid(o.getOcid());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            homeregion(o.getHomeregion());
            problemType(o.getProblemType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListIncidentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListIncidentsRequest
         */
        public ListIncidentsRequest build() {
            ListIncidentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListIncidentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListIncidentsRequest
         */
        public ListIncidentsRequest buildWithoutInvocationCallback() {
            ListIncidentsRequest request = new ListIncidentsRequest();
            request.csi = csi;
            request.compartmentId = compartmentId;
            request.ocid = ocid;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.homeregion = homeregion;
            request.problemType = problemType;
            return request;
            // new ListIncidentsRequest(csi, compartmentId, ocid, limit, sortBy, sortOrder, lifecycleState, page, opcRequestId, homeregion, problemType);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .csi(csi)
                .compartmentId(compartmentId)
                .ocid(ocid)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .page(page)
                .opcRequestId(opcRequestId)
                .homeregion(homeregion)
                .problemType(problemType);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",csi=").append(String.valueOf(this.csi));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(",problemType=").append(String.valueOf(this.problemType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListIncidentsRequest)) {
            return false;
        }

        ListIncidentsRequest other = (ListIncidentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.homeregion, other.homeregion)
                && java.util.Objects.equals(this.problemType, other.problemType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        return result;
    }
}
