/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.requests;

import com.oracle.bmc.certificates.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/ListCertificateBundleVersionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCertificateBundleVersionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ListCertificateBundleVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the certificate.
     */
    private String certificateId;

    public String getCertificateId() {
        return certificateId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The field to sort by. You can specify only one sort order. The default
     * order for {@code VERSION_NUMBER} is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order. The default
     * order for {@code VERSION_NUMBER} is ascending.
     *
     **/
    public enum SortBy {
        VersionNumber("VERSION_NUMBER"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCertificateBundleVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String certificateId = null;

        /**
         * The OCID of the certificate.
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order. The default
         * order for {@code VERSION_NUMBER} is ascending.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListCertificateBundleVersionsRequest o) {
            certificateId(o.getCertificateId());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCertificateBundleVersionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCertificateBundleVersionsRequest
         */
        public ListCertificateBundleVersionsRequest build() {
            ListCertificateBundleVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCertificateBundleVersionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCertificateBundleVersionsRequest
         */
        public ListCertificateBundleVersionsRequest buildWithoutInvocationCallback() {
            ListCertificateBundleVersionsRequest request =
                    new ListCertificateBundleVersionsRequest();
            request.certificateId = certificateId;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListCertificateBundleVersionsRequest(certificateId, opcRequestId, sortBy, sortOrder);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateId(certificateId)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCertificateBundleVersionsRequest)) {
            return false;
        }

        ListCertificateBundleVersionsRequest other = (ListCertificateBundleVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
