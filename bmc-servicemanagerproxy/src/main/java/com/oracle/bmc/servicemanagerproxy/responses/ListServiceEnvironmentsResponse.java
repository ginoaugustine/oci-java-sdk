/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.responses;

import com.oracle.bmc.servicemanagerproxy.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
public class ListServiceEnvironmentsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ServiceEnvironmentCollection instance.
     */
    private com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
            serviceEnvironmentCollection;

    public com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
            getServiceEnvironmentCollection() {
        return serviceEnvironmentCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "serviceEnvironmentCollection"
    })
    private ListServiceEnvironmentsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
                    serviceEnvironmentCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.serviceEnvironmentCollection = serviceEnvironmentCollection;
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

        private com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
                serviceEnvironmentCollection;

        public Builder serviceEnvironmentCollection(
                com.oracle.bmc.servicemanagerproxy.model.ServiceEnvironmentCollection
                        serviceEnvironmentCollection) {
            this.serviceEnvironmentCollection = serviceEnvironmentCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListServiceEnvironmentsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            serviceEnvironmentCollection(o.getServiceEnvironmentCollection());

            return this;
        }

        public ListServiceEnvironmentsResponse build() {
            return new ListServiceEnvironmentsResponse(
                    __httpStatusCode__, opcRequestId, opcNextPage, serviceEnvironmentCollection);
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
        sb.append(",serviceEnvironmentCollection=")
                .append(String.valueOf(serviceEnvironmentCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListServiceEnvironmentsResponse)) {
            return false;
        }

        ListServiceEnvironmentsResponse other = (ListServiceEnvironmentsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.serviceEnvironmentCollection, other.serviceEnvironmentCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceEnvironmentCollection == null
                                ? 43
                                : this.serviceEnvironmentCollection.hashCode());
        return result;
    }
}
