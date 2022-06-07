/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListMultipartUploadPartsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMultipartUploadPartsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListMultipartUploadPartsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }
    /**
     * The name of the object. Avoid entering confidential information.
     * Example: {@code test/object1.log}
     *
     */
    private String objectName;

    public String getObjectName() {
        return objectName;
    }
    /**
     * The upload ID for a multipart upload.
     */
    private String uploadId;

    public String getUploadId() {
        return uploadId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important
     * details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMultipartUploadPartsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        private String objectName = null;

        /**
         * The name of the object. Avoid entering confidential information.
         * Example: {@code test/object1.log}
         *
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        private String uploadId = null;

        /**
         * The upload ID for a multipart upload.
         * @return this builder instance
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important
         * details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
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
        public Builder copy(ListMultipartUploadPartsRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            limit(o.getLimit());
            page(o.getPage());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMultipartUploadPartsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMultipartUploadPartsRequest
         */
        public ListMultipartUploadPartsRequest build() {
            ListMultipartUploadPartsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMultipartUploadPartsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMultipartUploadPartsRequest
         */
        public ListMultipartUploadPartsRequest buildWithoutInvocationCallback() {
            ListMultipartUploadPartsRequest request = new ListMultipartUploadPartsRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.uploadId = uploadId;
            request.limit = limit;
            request.page = page;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new ListMultipartUploadPartsRequest(namespaceName, bucketName, objectName, uploadId, limit, page, opcClientRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .objectName(objectName)
                .uploadId(uploadId)
                .limit(limit)
                .page(page)
                .opcClientRequestId(opcClientRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",uploadId=").append(String.valueOf(this.uploadId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMultipartUploadPartsRequest)) {
            return false;
        }

        ListMultipartUploadPartsRequest other = (ListMultipartUploadPartsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.uploadId, other.uploadId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
