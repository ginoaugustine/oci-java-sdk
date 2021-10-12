/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.requests;

import com.oracle.bmc.waf.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waf/ListWebAppFirewallPoliciesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWebAppFirewallPoliciesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListWebAppFirewallPoliciesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * A filter to return only resources that match the given lifecycleState.
     */
    private java.util.List<WebAppFirewallPolicy.LifecycleState> lifecycleState;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only the WebAppFirewallPolicy with the given [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String id;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    private String page;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.waf.model.SortOrder sortOrder;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     * If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     * If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWebAppFirewallPoliciesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<WebAppFirewallPolicy.LifecycleState> lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycleState.
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<WebAppFirewallPolicy.LifecycleState> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the given lifecycleState.
         * @return this builder instance
         */
        public Builder lifecycleState(WebAppFirewallPolicy.LifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListWebAppFirewallPoliciesRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWebAppFirewallPoliciesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWebAppFirewallPoliciesRequest
         */
        public ListWebAppFirewallPoliciesRequest build() {
            ListWebAppFirewallPoliciesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
