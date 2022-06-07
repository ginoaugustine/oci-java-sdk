/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class CreateSteeringPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    public String getETag() {
        return eTag;
    }

    /**
     * The full URI of the resource related to the request.
     *
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned SteeringPolicy instance.
     */
    private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

    public com.oracle.bmc.dns.model.SteeringPolicy getSteeringPolicy() {
        return steeringPolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "eTag",
        "location",
        "opcRequestId",
        "steeringPolicy"
    })
    private CreateSteeringPolicyResponse(
            int __httpStatusCode__,
            String eTag,
            String location,
            String opcRequestId,
            com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
        super(__httpStatusCode__);
        this.eTag = eTag;
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.steeringPolicy = steeringPolicy;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String eTag;

        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy;

        public Builder steeringPolicy(com.oracle.bmc.dns.model.SteeringPolicy steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSteeringPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            eTag(o.getETag());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            steeringPolicy(o.getSteeringPolicy());

            return this;
        }

        public CreateSteeringPolicyResponse build() {
            return new CreateSteeringPolicyResponse(
                    __httpStatusCode__, eTag, location, opcRequestId, steeringPolicy);
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
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",steeringPolicy=").append(String.valueOf(steeringPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSteeringPolicyResponse)) {
            return false;
        }

        CreateSteeringPolicyResponse other = (CreateSteeringPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.steeringPolicy, other.steeringPolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.steeringPolicy == null ? 43 : this.steeringPolicy.hashCode());
        return result;
    }
}
