/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create a new Authentication Provider.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAuthenticationProviderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAuthenticationProviderDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "grantType",
        "identityProvider",
        "name",
        "tokenEndpointUrl",
        "authorizationEndpointUrl",
        "shortAuthorizationCodeRequestUrl",
        "revokeTokenEndpointUrl",
        "clientId",
        "clientSecret",
        "scopes",
        "subjectClaim",
        "refreshTokenRetentionPeriodInDays",
        "redirectUrl",
        "isVisible",
        "freeformTags",
        "definedTags"
    })
    public CreateAuthenticationProviderDetails(
            AuthenticationGrantType grantType,
            AuthenticationIdentityProvider identityProvider,
            String name,
            String tokenEndpointUrl,
            String authorizationEndpointUrl,
            String shortAuthorizationCodeRequestUrl,
            String revokeTokenEndpointUrl,
            String clientId,
            String clientSecret,
            String scopes,
            String subjectClaim,
            Integer refreshTokenRetentionPeriodInDays,
            String redirectUrl,
            Boolean isVisible,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.grantType = grantType;
        this.identityProvider = identityProvider;
        this.name = name;
        this.tokenEndpointUrl = tokenEndpointUrl;
        this.authorizationEndpointUrl = authorizationEndpointUrl;
        this.shortAuthorizationCodeRequestUrl = shortAuthorizationCodeRequestUrl;
        this.revokeTokenEndpointUrl = revokeTokenEndpointUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scopes = scopes;
        this.subjectClaim = subjectClaim;
        this.refreshTokenRetentionPeriodInDays = refreshTokenRetentionPeriodInDays;
        this.redirectUrl = redirectUrl;
        this.isVisible = isVisible;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("grantType")
        private AuthenticationGrantType grantType;

        public Builder grantType(AuthenticationGrantType grantType) {
            this.grantType = grantType;
            this.__explicitlySet__.add("grantType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityProvider")
        private AuthenticationIdentityProvider identityProvider;

        public Builder identityProvider(AuthenticationIdentityProvider identityProvider) {
            this.identityProvider = identityProvider;
            this.__explicitlySet__.add("identityProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUrl")
        private String tokenEndpointUrl;

        public Builder tokenEndpointUrl(String tokenEndpointUrl) {
            this.tokenEndpointUrl = tokenEndpointUrl;
            this.__explicitlySet__.add("tokenEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorizationEndpointUrl")
        private String authorizationEndpointUrl;

        public Builder authorizationEndpointUrl(String authorizationEndpointUrl) {
            this.authorizationEndpointUrl = authorizationEndpointUrl;
            this.__explicitlySet__.add("authorizationEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortAuthorizationCodeRequestUrl")
        private String shortAuthorizationCodeRequestUrl;

        public Builder shortAuthorizationCodeRequestUrl(String shortAuthorizationCodeRequestUrl) {
            this.shortAuthorizationCodeRequestUrl = shortAuthorizationCodeRequestUrl;
            this.__explicitlySet__.add("shortAuthorizationCodeRequestUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revokeTokenEndpointUrl")
        private String revokeTokenEndpointUrl;

        public Builder revokeTokenEndpointUrl(String revokeTokenEndpointUrl) {
            this.revokeTokenEndpointUrl = revokeTokenEndpointUrl;
            this.__explicitlySet__.add("revokeTokenEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private String scopes;

        public Builder scopes(String scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectClaim")
        private String subjectClaim;

        public Builder subjectClaim(String subjectClaim) {
            this.subjectClaim = subjectClaim;
            this.__explicitlySet__.add("subjectClaim");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenRetentionPeriodInDays")
        private Integer refreshTokenRetentionPeriodInDays;

        public Builder refreshTokenRetentionPeriodInDays(
                Integer refreshTokenRetentionPeriodInDays) {
            this.refreshTokenRetentionPeriodInDays = refreshTokenRetentionPeriodInDays;
            this.__explicitlySet__.add("refreshTokenRetentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
        private Boolean isVisible;

        public Builder isVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            this.__explicitlySet__.add("isVisible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAuthenticationProviderDetails build() {
            CreateAuthenticationProviderDetails __instance__ =
                    new CreateAuthenticationProviderDetails(
                            grantType,
                            identityProvider,
                            name,
                            tokenEndpointUrl,
                            authorizationEndpointUrl,
                            shortAuthorizationCodeRequestUrl,
                            revokeTokenEndpointUrl,
                            clientId,
                            clientSecret,
                            scopes,
                            subjectClaim,
                            refreshTokenRetentionPeriodInDays,
                            redirectUrl,
                            isVisible,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAuthenticationProviderDetails o) {
            Builder copiedBuilder =
                    grantType(o.getGrantType())
                            .identityProvider(o.getIdentityProvider())
                            .name(o.getName())
                            .tokenEndpointUrl(o.getTokenEndpointUrl())
                            .authorizationEndpointUrl(o.getAuthorizationEndpointUrl())
                            .shortAuthorizationCodeRequestUrl(
                                    o.getShortAuthorizationCodeRequestUrl())
                            .revokeTokenEndpointUrl(o.getRevokeTokenEndpointUrl())
                            .clientId(o.getClientId())
                            .clientSecret(o.getClientSecret())
                            .scopes(o.getScopes())
                            .subjectClaim(o.getSubjectClaim())
                            .refreshTokenRetentionPeriodInDays(
                                    o.getRefreshTokenRetentionPeriodInDays())
                            .redirectUrl(o.getRedirectUrl())
                            .isVisible(o.getIsVisible())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The grant type for the Authentication Provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantType")
    private final AuthenticationGrantType grantType;

    public AuthenticationGrantType getGrantType() {
        return grantType;
    }

    /**
     * Which type of Identity Provider (IDP) you are using.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityProvider")
    private final AuthenticationIdentityProvider identityProvider;

    public AuthenticationIdentityProvider getIdentityProvider() {
        return identityProvider;
    }

    /**
     * A name to identify the Authentication Provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The IDPs URL for requesting access tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUrl")
    private final String tokenEndpointUrl;

    public String getTokenEndpointUrl() {
        return tokenEndpointUrl;
    }

    /**
     * The IDPs URL for the page that users authenticate with by entering the user name and password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationEndpointUrl")
    private final String authorizationEndpointUrl;

    public String getAuthorizationEndpointUrl() {
        return authorizationEndpointUrl;
    }

    /**
     * A shortened version of the authorization URL, which you can get from a URL shortener service (one that allows
     * you to send query parameters).  You might need this because the generated authorization-code-request URL
     * could be too long for SMS and older smart phones.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortAuthorizationCodeRequestUrl")
    private final String shortAuthorizationCodeRequestUrl;

    public String getShortAuthorizationCodeRequestUrl() {
        return shortAuthorizationCodeRequestUrl;
    }

    /**
     * If you want to revoke all the refresh tokens and access tokens of the logged-in user from a dialog flow, then
     * you need the IDP's revoke refresh token URL. If you provide this URL, then you can use the System.OAuth2ResetTokens
     * component to revoke the user's tokens for this service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revokeTokenEndpointUrl")
    private final String revokeTokenEndpointUrl;

    public String getRevokeTokenEndpointUrl() {
        return revokeTokenEndpointUrl;
    }

    /**
     * The client ID for the IDP application (OAuth Client) that was registered as described in Identity Provider Registration.
     * With Microsoft identity platform, use the application ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    public String getClientId() {
        return clientId;
    }

    /**
     * The client secret for the IDP application (OAuth Client) that was registered as described in Identity Provider
     * Registration. With Microsoft identity platform, use the application secret.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * A space-separated list of the scopes that must be included when Digital Assistant requests an access token from
     * the provider. Include all the scopes that are required to access the resources. If refresh tokens are enabled,
     * include the scope that\u2019s necessary to get the refresh token (typically offline_access).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final String scopes;

    public String getScopes() {
        return scopes;
    }

    /**
     * The access-token profile claim to use to identify the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectClaim")
    private final String subjectClaim;

    public String getSubjectClaim() {
        return subjectClaim;
    }

    /**
     * The number of days to keep the refresh token in the Digital Assistant cache.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenRetentionPeriodInDays")
    private final Integer refreshTokenRetentionPeriodInDays;

    public Integer getRefreshTokenRetentionPeriodInDays() {
        return refreshTokenRetentionPeriodInDays;
    }

    /**
     * The OAuth Redirect URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Whether this Authentication Provider is visible in the ODA UI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
    private final Boolean isVisible;

    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAuthenticationProviderDetails(");
        sb.append("grantType=").append(String.valueOf(this.grantType));
        sb.append(", identityProvider=").append(String.valueOf(this.identityProvider));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", tokenEndpointUrl=").append(String.valueOf(this.tokenEndpointUrl));
        sb.append(", authorizationEndpointUrl=")
                .append(String.valueOf(this.authorizationEndpointUrl));
        sb.append(", shortAuthorizationCodeRequestUrl=")
                .append(String.valueOf(this.shortAuthorizationCodeRequestUrl));
        sb.append(", revokeTokenEndpointUrl=").append(String.valueOf(this.revokeTokenEndpointUrl));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append(String.valueOf(this.clientSecret));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", subjectClaim=").append(String.valueOf(this.subjectClaim));
        sb.append(", refreshTokenRetentionPeriodInDays=")
                .append(String.valueOf(this.refreshTokenRetentionPeriodInDays));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", isVisible=").append(String.valueOf(this.isVisible));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAuthenticationProviderDetails)) {
            return false;
        }

        CreateAuthenticationProviderDetails other = (CreateAuthenticationProviderDetails) o;
        return java.util.Objects.equals(this.grantType, other.grantType)
                && java.util.Objects.equals(this.identityProvider, other.identityProvider)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.tokenEndpointUrl, other.tokenEndpointUrl)
                && java.util.Objects.equals(
                        this.authorizationEndpointUrl, other.authorizationEndpointUrl)
                && java.util.Objects.equals(
                        this.shortAuthorizationCodeRequestUrl,
                        other.shortAuthorizationCodeRequestUrl)
                && java.util.Objects.equals(
                        this.revokeTokenEndpointUrl, other.revokeTokenEndpointUrl)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(this.subjectClaim, other.subjectClaim)
                && java.util.Objects.equals(
                        this.refreshTokenRetentionPeriodInDays,
                        other.refreshTokenRetentionPeriodInDays)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.isVisible, other.isVisible)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantType == null ? 43 : this.grantType.hashCode());
        result =
                (result * PRIME)
                        + (this.identityProvider == null ? 43 : this.identityProvider.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenEndpointUrl == null ? 43 : this.tokenEndpointUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationEndpointUrl == null
                                ? 43
                                : this.authorizationEndpointUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.shortAuthorizationCodeRequestUrl == null
                                ? 43
                                : this.shortAuthorizationCodeRequestUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.revokeTokenEndpointUrl == null
                                ? 43
                                : this.revokeTokenEndpointUrl.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result = (result * PRIME) + (this.subjectClaim == null ? 43 : this.subjectClaim.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshTokenRetentionPeriodInDays == null
                                ? 43
                                : this.refreshTokenRetentionPeriodInDays.hashCode());
        result = (result * PRIME) + (this.redirectUrl == null ? 43 : this.redirectUrl.hashCode());
        result = (result * PRIME) + (this.isVisible == null ? 43 : this.isVisible.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
