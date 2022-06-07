/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListFoldersExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFoldersRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListFoldersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match the entire business name given. The match is not case sensitive.
     */
    private String businessName;

    public String getBusinessName() {
        return businessName;
    }
    /**
     * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
     * For Example : /folders?displayOrBusinessNameContains=Cu.*
     * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayOrBusinessNameContains;

    public String getDisplayOrBusinessNameContains() {
        return displayOrBusinessNameContains;
    }
    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayNameContains;

    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    public com.oracle.bmc.datacatalog.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Unique folder key.
     */
    private String parentFolderKey;

    public String getParentFolderKey() {
        return parentFolderKey;
    }
    /**
     * Full path of the resource for resources that support paths.
     */
    private String path;

    public String getPath() {
        return path;
    }
    /**
     * Unique external identifier of this resource in the external source system.
     */
    private String externalKey;

    public String getExternalKey() {
        return externalKey;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    public String getCreatedById() {
        return createdById;
    }
    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    public String getUpdatedById() {
        return updatedById;
    }
    /**
     * Harvest status of the harvestable resource as updated by the harvest process.
     */
    private com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus;

    public com.oracle.bmc.datacatalog.model.HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }
    /**
     * Key of the last harvest process to update this resource.
     */
    private String lastJobKey;

    public String getLastJobKey() {
        return lastJobKey;
    }
    /**
     * Specifies the fields to return in a folder summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a folder summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        ParentFolderKey("parentFolderKey"),
        Path("path"),
        DataAssetKey("dataAssetKey"),
        ExternalKey("externalKey"),
        TimeExternal("timeExternal"),
        TimeCreated("timeCreated"),
        LifecycleState("lifecycleState"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
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
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFoldersRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        private String businessName = null;

        /**
         * A filter to return only resources that match the entire business name given. The match is not case sensitive.
         * @return this builder instance
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        private String displayOrBusinessNameContains = null;

        /**
         * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
         * For Example : /folders?displayOrBusinessNameContains=Cu.*
         * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         * @return this builder instance
         */
        public Builder displayOrBusinessNameContains(String displayOrBusinessNameContains) {
            this.displayOrBusinessNameContains = displayOrBusinessNameContains;
            return this;
        }

        private String displayNameContains = null;

        /**
         * A filter to return only resources that match display name pattern given. The match is not case sensitive.
         * For Example : /folders?displayNameContains=Cu.*
         * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String parentFolderKey = null;

        /**
         * Unique folder key.
         * @return this builder instance
         */
        public Builder parentFolderKey(String parentFolderKey) {
            this.parentFolderKey = parentFolderKey;
            return this;
        }

        private String path = null;

        /**
         * Full path of the resource for resources that support paths.
         * @return this builder instance
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        private String externalKey = null;

        /**
         * Unique external identifier of this resource in the external source system.
         * @return this builder instance
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            return this;
        }

        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        private java.util.Date timeUpdated = null;

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @return this builder instance
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        private String updatedById = null;

        /**
         * OCID of the user who updated the resource.
         * @return this builder instance
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            return this;
        }

        private com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus = null;

        /**
         * Harvest status of the harvestable resource as updated by the harvest process.
         * @return this builder instance
         */
        public Builder harvestStatus(com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            return this;
        }

        private String lastJobKey = null;

        /**
         * Key of the last harvest process to update this resource.
         * @return this builder instance
         */
        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            return this;
        }

        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a folder summary response.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a folder summary response.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListFoldersRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            displayName(o.getDisplayName());
            businessName(o.getBusinessName());
            displayOrBusinessNameContains(o.getDisplayOrBusinessNameContains());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            parentFolderKey(o.getParentFolderKey());
            path(o.getPath());
            externalKey(o.getExternalKey());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            harvestStatus(o.getHarvestStatus());
            lastJobKey(o.getLastJobKey());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFoldersRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFoldersRequest
         */
        public ListFoldersRequest build() {
            ListFoldersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFoldersRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFoldersRequest
         */
        public ListFoldersRequest buildWithoutInvocationCallback() {
            ListFoldersRequest request = new ListFoldersRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.displayName = displayName;
            request.businessName = businessName;
            request.displayOrBusinessNameContains = displayOrBusinessNameContains;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.parentFolderKey = parentFolderKey;
            request.path = path;
            request.externalKey = externalKey;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.harvestStatus = harvestStatus;
            request.lastJobKey = lastJobKey;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFoldersRequest(catalogId, dataAssetKey, displayName, businessName, displayOrBusinessNameContains, displayNameContains, lifecycleState, parentFolderKey, path, externalKey, timeCreated, timeUpdated, createdById, updatedById, harvestStatus, lastJobKey, fields, sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .dataAssetKey(dataAssetKey)
                .displayName(displayName)
                .businessName(businessName)
                .displayOrBusinessNameContains(displayOrBusinessNameContains)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .parentFolderKey(parentFolderKey)
                .path(path)
                .externalKey(externalKey)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .harvestStatus(harvestStatus)
                .lastJobKey(lastJobKey)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",businessName=").append(String.valueOf(this.businessName));
        sb.append(",displayOrBusinessNameContains=")
                .append(String.valueOf(this.displayOrBusinessNameContains));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",parentFolderKey=").append(String.valueOf(this.parentFolderKey));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",externalKey=").append(String.valueOf(this.externalKey));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(",lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFoldersRequest)) {
            return false;
        }

        ListFoldersRequest other = (ListFoldersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(
                        this.displayOrBusinessNameContains, other.displayOrBusinessNameContains)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.parentFolderKey, other.parentFolderKey)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayOrBusinessNameContains == null
                                ? 43
                                : this.displayOrBusinessNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.parentFolderKey == null ? 43 : this.parentFolderKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
