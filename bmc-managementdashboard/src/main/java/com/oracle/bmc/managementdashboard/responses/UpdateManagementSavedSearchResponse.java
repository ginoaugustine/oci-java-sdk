/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.responses;

import com.oracle.bmc.managementdashboard.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class UpdateManagementSavedSearchResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

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
     * The returned ManagementSavedSearch instance.
     */
    private com.oracle.bmc.managementdashboard.model.ManagementSavedSearch managementSavedSearch;

    public com.oracle.bmc.managementdashboard.model.ManagementSavedSearch
            getManagementSavedSearch() {
        return managementSavedSearch;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "managementSavedSearch"
    })
    private UpdateManagementSavedSearchResponse(
            int __httpStatusCode__,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.managementdashboard.model.ManagementSavedSearch managementSavedSearch) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.managementSavedSearch = managementSavedSearch;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcWorkRequestId;

        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.managementdashboard.model.ManagementSavedSearch
                managementSavedSearch;

        public Builder managementSavedSearch(
                com.oracle.bmc.managementdashboard.model.ManagementSavedSearch
                        managementSavedSearch) {
            this.managementSavedSearch = managementSavedSearch;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateManagementSavedSearchResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            managementSavedSearch(o.getManagementSavedSearch());

            return this;
        }

        public UpdateManagementSavedSearchResponse build() {
            return new UpdateManagementSavedSearchResponse(
                    __httpStatusCode__,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    managementSavedSearch);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",managementSavedSearch=").append(String.valueOf(managementSavedSearch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateManagementSavedSearchResponse)) {
            return false;
        }

        UpdateManagementSavedSearchResponse other = (UpdateManagementSavedSearchResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.managementSavedSearch, other.managementSavedSearch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementSavedSearch == null
                                ? 43
                                : this.managementSavedSearch.hashCode());
        return result;
    }
}
