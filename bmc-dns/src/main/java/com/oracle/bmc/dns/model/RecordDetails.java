/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A DNS resource record. For more information about records, see [RFC 1034](https://tools.ietf.org/html/rfc1034#section-3.6).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecordDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "domain",
        "recordHash",
        "isProtected",
        "rdata",
        "rrsetVersion",
        "rtype",
        "ttl"
    })
    public RecordDetails(
            String domain,
            String recordHash,
            Boolean isProtected,
            String rdata,
            String rrsetVersion,
            String rtype,
            Integer ttl) {
        super();
        this.domain = domain;
        this.recordHash = recordHash;
        this.isProtected = isProtected;
        this.rdata = rdata;
        this.rrsetVersion = rrsetVersion;
        this.rtype = rtype;
        this.ttl = ttl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
        private String recordHash;

        public Builder recordHash(String recordHash) {
            this.recordHash = recordHash;
            this.__explicitlySet__.add("recordHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
        private Boolean isProtected;

        public Builder isProtected(Boolean isProtected) {
            this.isProtected = isProtected;
            this.__explicitlySet__.add("isProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
        private String rrsetVersion;

        public Builder rrsetVersion(String rrsetVersion) {
            this.rrsetVersion = rrsetVersion;
            this.__explicitlySet__.add("rrsetVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecordDetails build() {
            RecordDetails __instance__ =
                    new RecordDetails(
                            domain, recordHash, isProtected, rdata, rrsetVersion, rtype, ttl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecordDetails o) {
            Builder copiedBuilder =
                    domain(o.getDomain())
                            .recordHash(o.getRecordHash())
                            .isProtected(o.getIsProtected())
                            .rdata(o.getRdata())
                            .rrsetVersion(o.getRrsetVersion())
                            .rtype(o.getRtype())
                            .ttl(o.getTtl());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The fully qualified domain name where the record can be located.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    public String getDomain() {
        return domain;
    }

    /**
     * A unique identifier for the record within its zone.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
    private final String recordHash;

    public String getRecordHash() {
        return recordHash;
    }

    /**
     * A Boolean flag indicating whether or not parts of the record
     * are unable to be explicitly managed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
    private final Boolean isProtected;

    public Boolean getIsProtected() {
        return isProtected;
    }

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    public String getRdata() {
        return rdata;
    }

    /**
     * The latest version of the record's zone in which its RRSet differs
     * from the preceding version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
    private final String rrsetVersion;

    public String getRrsetVersion() {
        return rrsetVersion;
    }

    /**
     * The type of DNS record, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    private final String rtype;

    public String getRtype() {
        return rtype;
    }

    /**
     * The Time To Live for the record, in seconds. Using a TTL lower than 30 seconds is not recommended.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    public Integer getTtl() {
        return ttl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecordDetails(");
        sb.append("domain=").append(String.valueOf(this.domain));
        sb.append(", recordHash=").append(String.valueOf(this.recordHash));
        sb.append(", isProtected=").append(String.valueOf(this.isProtected));
        sb.append(", rdata=").append(String.valueOf(this.rdata));
        sb.append(", rrsetVersion=").append(String.valueOf(this.rrsetVersion));
        sb.append(", rtype=").append(String.valueOf(this.rtype));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecordDetails)) {
            return false;
        }

        RecordDetails other = (RecordDetails) o;
        return java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.recordHash, other.recordHash)
                && java.util.Objects.equals(this.isProtected, other.isProtected)
                && java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.rrsetVersion, other.rrsetVersion)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.recordHash == null ? 43 : this.recordHash.hashCode());
        result = (result * PRIME) + (this.isProtected == null ? 43 : this.isProtected.hashCode());
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
        result = (result * PRIME) + (this.rrsetVersion == null ? 43 : this.rrsetVersion.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
