/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Request object for a subscription payment authorization
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuthorizeSubscriptionPaymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthorizeSubscriptionPaymentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"subscription", "languageCode", "email"})
    public AuthorizeSubscriptionPaymentDetails(
            Subscription subscription, String languageCode, String email) {
        super();
        this.subscription = subscription;
        this.languageCode = languageCode;
        this.email = email;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subscription")
        private Subscription subscription;

        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
            this.__explicitlySet__.add("subscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthorizeSubscriptionPaymentDetails build() {
            AuthorizeSubscriptionPaymentDetails __instance__ =
                    new AuthorizeSubscriptionPaymentDetails(subscription, languageCode, email);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthorizeSubscriptionPaymentDetails o) {
            Builder copiedBuilder =
                    subscription(o.getSubscription())
                            .languageCode(o.getLanguageCode())
                            .email(o.getEmail());

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

    @com.fasterxml.jackson.annotation.JsonProperty("subscription")
    private final Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Language code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * User email
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuthorizeSubscriptionPaymentDetails(");
        sb.append("subscription=").append(String.valueOf(this.subscription));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorizeSubscriptionPaymentDetails)) {
            return false;
        }

        AuthorizeSubscriptionPaymentDetails other = (AuthorizeSubscriptionPaymentDetails) o;
        return java.util.Objects.equals(this.subscription, other.subscription)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subscription == null ? 43 : this.subscription.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
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
