/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.responses;

import com.oracle.bmc.bastion.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
public class CreateSessionResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * this contains the full URI for the get request, e.g. "https://iaas.us-phoenix-1.oraclecloud.com/20210331/bastions/<some-ocid>"
     *
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned Session instance.
     */
    private com.oracle.bmc.bastion.model.Session session;

    public com.oracle.bmc.bastion.model.Session getSession() {
        return session;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "etag",
        "session"
    })
    private CreateSessionResponse(
            int __httpStatusCode__,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            String etag,
            com.oracle.bmc.bastion.model.Session session) {
        super(__httpStatusCode__);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.etag = etag;
        this.session = session;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
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

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.bastion.model.Session session;

        public Builder session(com.oracle.bmc.bastion.model.Session session) {
            this.session = session;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSessionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            etag(o.getEtag());
            session(o.getSession());

            return this;
        }

        public CreateSessionResponse build() {
            return new CreateSessionResponse(
                    __httpStatusCode__, opcWorkRequestId, opcRequestId, location, etag, session);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",session=").append(String.valueOf(session));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSessionResponse)) {
            return false;
        }

        CreateSessionResponse other = (CreateSessionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.session, other.session);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.session == null ? 43 : this.session.hashCode());
        return result;
    }
}
