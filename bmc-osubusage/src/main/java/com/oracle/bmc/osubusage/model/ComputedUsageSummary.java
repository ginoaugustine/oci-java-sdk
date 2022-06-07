/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

/**
 * Computed Usage Summary object
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputedUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputedUsageSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeCreated",
        "timeUpdated",
        "parentSubscribedServiceId",
        "parentProduct",
        "planNumber",
        "currencyCode",
        "rateCardTierdId",
        "rateCardId",
        "computeSource",
        "dataCenter",
        "mqsMessageId",
        "computedUsageId",
        "quantity",
        "usageNumber",
        "originalUsageNumber",
        "commitmentServiceId",
        "isInvoiced",
        "type",
        "timeOfArrival",
        "timeMeteredOn",
        "netUnitPrice",
        "costRounded",
        "cost",
        "product",
        "unitOfMeasure"
    })
    public ComputedUsageSummary(
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String parentSubscribedServiceId,
            Product parentProduct,
            String planNumber,
            String currencyCode,
            String rateCardTierdId,
            String rateCardId,
            String computeSource,
            String dataCenter,
            String mqsMessageId,
            String computedUsageId,
            String quantity,
            String usageNumber,
            String originalUsageNumber,
            String commitmentServiceId,
            Boolean isInvoiced,
            Type type,
            java.util.Date timeOfArrival,
            java.util.Date timeMeteredOn,
            String netUnitPrice,
            String costRounded,
            String cost,
            Product product,
            String unitOfMeasure) {
        super();
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.parentSubscribedServiceId = parentSubscribedServiceId;
        this.parentProduct = parentProduct;
        this.planNumber = planNumber;
        this.currencyCode = currencyCode;
        this.rateCardTierdId = rateCardTierdId;
        this.rateCardId = rateCardId;
        this.computeSource = computeSource;
        this.dataCenter = dataCenter;
        this.mqsMessageId = mqsMessageId;
        this.computedUsageId = computedUsageId;
        this.quantity = quantity;
        this.usageNumber = usageNumber;
        this.originalUsageNumber = originalUsageNumber;
        this.commitmentServiceId = commitmentServiceId;
        this.isInvoiced = isInvoiced;
        this.type = type;
        this.timeOfArrival = timeOfArrival;
        this.timeMeteredOn = timeMeteredOn;
        this.netUnitPrice = netUnitPrice;
        this.costRounded = costRounded;
        this.cost = cost;
        this.product = product;
        this.unitOfMeasure = unitOfMeasure;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
        private String parentSubscribedServiceId;

        public Builder parentSubscribedServiceId(String parentSubscribedServiceId) {
            this.parentSubscribedServiceId = parentSubscribedServiceId;
            this.__explicitlySet__.add("parentSubscribedServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
        private Product parentProduct;

        public Builder parentProduct(Product parentProduct) {
            this.parentProduct = parentProduct;
            this.__explicitlySet__.add("parentProduct");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
        private String planNumber;

        public Builder planNumber(String planNumber) {
            this.planNumber = planNumber;
            this.__explicitlySet__.add("planNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
        private String rateCardTierdId;

        public Builder rateCardTierdId(String rateCardTierdId) {
            this.rateCardTierdId = rateCardTierdId;
            this.__explicitlySet__.add("rateCardTierdId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
        private String rateCardId;

        public Builder rateCardId(String rateCardId) {
            this.rateCardId = rateCardId;
            this.__explicitlySet__.add("rateCardId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
        private String computeSource;

        public Builder computeSource(String computeSource) {
            this.computeSource = computeSource;
            this.__explicitlySet__.add("computeSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
        private String mqsMessageId;

        public Builder mqsMessageId(String mqsMessageId) {
            this.mqsMessageId = mqsMessageId;
            this.__explicitlySet__.add("mqsMessageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
        private String computedUsageId;

        public Builder computedUsageId(String computedUsageId) {
            this.computedUsageId = computedUsageId;
            this.__explicitlySet__.add("computedUsageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
        private String usageNumber;

        public Builder usageNumber(String usageNumber) {
            this.usageNumber = usageNumber;
            this.__explicitlySet__.add("usageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
        private String originalUsageNumber;

        public Builder originalUsageNumber(String originalUsageNumber) {
            this.originalUsageNumber = originalUsageNumber;
            this.__explicitlySet__.add("originalUsageNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
        private String commitmentServiceId;

        public Builder commitmentServiceId(String commitmentServiceId) {
            this.commitmentServiceId = commitmentServiceId;
            this.__explicitlySet__.add("commitmentServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
        private Boolean isInvoiced;

        public Builder isInvoiced(Boolean isInvoiced) {
            this.isInvoiced = isInvoiced;
            this.__explicitlySet__.add("isInvoiced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
        private java.util.Date timeOfArrival;

        public Builder timeOfArrival(java.util.Date timeOfArrival) {
            this.timeOfArrival = timeOfArrival;
            this.__explicitlySet__.add("timeOfArrival");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
        private java.util.Date timeMeteredOn;

        public Builder timeMeteredOn(java.util.Date timeMeteredOn) {
            this.timeMeteredOn = timeMeteredOn;
            this.__explicitlySet__.add("timeMeteredOn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
        private String costRounded;

        public Builder costRounded(String costRounded) {
            this.costRounded = costRounded;
            this.__explicitlySet__.add("costRounded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private String cost;

        public Builder cost(String cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageSummary build() {
            ComputedUsageSummary __instance__ =
                    new ComputedUsageSummary(
                            timeCreated,
                            timeUpdated,
                            parentSubscribedServiceId,
                            parentProduct,
                            planNumber,
                            currencyCode,
                            rateCardTierdId,
                            rateCardId,
                            computeSource,
                            dataCenter,
                            mqsMessageId,
                            computedUsageId,
                            quantity,
                            usageNumber,
                            originalUsageNumber,
                            commitmentServiceId,
                            isInvoiced,
                            type,
                            timeOfArrival,
                            timeMeteredOn,
                            netUnitPrice,
                            costRounded,
                            cost,
                            product,
                            unitOfMeasure);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageSummary o) {
            Builder copiedBuilder =
                    timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .parentSubscribedServiceId(o.getParentSubscribedServiceId())
                            .parentProduct(o.getParentProduct())
                            .planNumber(o.getPlanNumber())
                            .currencyCode(o.getCurrencyCode())
                            .rateCardTierdId(o.getRateCardTierdId())
                            .rateCardId(o.getRateCardId())
                            .computeSource(o.getComputeSource())
                            .dataCenter(o.getDataCenter())
                            .mqsMessageId(o.getMqsMessageId())
                            .computedUsageId(o.getComputedUsageId())
                            .quantity(o.getQuantity())
                            .usageNumber(o.getUsageNumber())
                            .originalUsageNumber(o.getOriginalUsageNumber())
                            .commitmentServiceId(o.getCommitmentServiceId())
                            .isInvoiced(o.getIsInvoiced())
                            .type(o.getType())
                            .timeOfArrival(o.getTimeOfArrival())
                            .timeMeteredOn(o.getTimeMeteredOn())
                            .netUnitPrice(o.getNetUnitPrice())
                            .costRounded(o.getCostRounded())
                            .cost(o.getCost())
                            .product(o.getProduct())
                            .unitOfMeasure(o.getUnitOfMeasure());

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
     * Computed Usage created time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Computed Usage updated time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Subscribed service line parent id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
    private final String parentSubscribedServiceId;

    public String getParentSubscribedServiceId() {
        return parentSubscribedServiceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    private final Product parentProduct;

    public Product getParentProduct() {
        return parentProduct;
    }

    /**
     * Subscription plan number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
    private final String planNumber;

    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Currency code
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
    private final String rateCardTierdId;

    public String getRateCardTierdId() {
        return rateCardTierdId;
    }

    /**
     * Ratecard Id at subscribed service level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
    private final String rateCardId;

    public String getRateCardId() {
        return rateCardId;
    }

    /**
     * SPM Internal compute records source .
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
    private final String computeSource;

    public String getComputeSource() {
        return computeSource;
    }

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
    private final String mqsMessageId;

    public String getMqsMessageId() {
        return mqsMessageId;
    }

    /**
     * SPM Internal computed usage Id , 32 character string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
    private final String computedUsageId;

    public String getComputedUsageId() {
        return computedUsageId;
    }

    /**
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    public String getQuantity() {
        return quantity;
    }

    /**
     * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
    private final String usageNumber;

    public String getUsageNumber() {
        return usageNumber;
    }

    /**
     * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
    private final String originalUsageNumber;

    public String getOriginalUsageNumber() {
        return originalUsageNumber;
    }

    /**
     * Subscribed service commitmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
    private final String commitmentServiceId;

    public String getCommitmentServiceId() {
        return commitmentServiceId;
    }

    /**
     * Invoicing status for the aggregated compute usage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
    private final Boolean isInvoiced;

    public Boolean getIsInvoiced() {
        return isInvoiced;
    }

    /**
     * Usage compute type in SPM.
     *
     **/
    public enum Type {
        Promotion("PROMOTION"),
        DoNotBill("DO_NOT_BILL"),
        Usage("USAGE"),
        Commit("COMMIT"),
        Overage("OVERAGE"),
        PayAsYouGo("PAY_AS_YOU_GO"),
        MonthlyMinimum("MONTHLY_MINIMUM"),
        DelayedUsageInvoiceTiming("DELAYED_USAGE_INVOICE_TIMING"),
        DelayedUsageCommitmentExp("DELAYED_USAGE_COMMITMENT_EXP"),
        OnAccountCredit("ON_ACCOUNT_CREDIT"),
        ServiceCredit("SERVICE_CREDIT"),
        CommitmentExpiration("COMMITMENT_EXPIRATION"),
        FundedAllocation("FUNDED_ALLOCATION"),
        DonotBillUsagePostTermination("DONOT_BILL_USAGE_POST_TERMINATION"),
        DelayedUsagePostTermination("DELAYED_USAGE_POST_TERMINATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Usage compute type in SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    public Type getType() {
        return type;
    }

    /**
     * Usae computation date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
    private final java.util.Date timeOfArrival;

    public java.util.Date getTimeOfArrival() {
        return timeOfArrival;
    }

    /**
     * Metered Service date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    private final java.util.Date timeMeteredOn;

    public java.util.Date getTimeMeteredOn() {
        return timeMeteredOn;
    }

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Computed Line Amount rounded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
    private final String costRounded;

    public String getCostRounded() {
        return costRounded;
    }

    /**
     * Computed Line Amount not rounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final String cost;

    public String getCost() {
        return cost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final Product product;

    public Product getProduct() {
        return product;
    }

    /**
     * Unit of Messure
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComputedUsageSummary(");
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", parentSubscribedServiceId=")
                .append(String.valueOf(this.parentSubscribedServiceId));
        sb.append(", parentProduct=").append(String.valueOf(this.parentProduct));
        sb.append(", planNumber=").append(String.valueOf(this.planNumber));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", rateCardTierdId=").append(String.valueOf(this.rateCardTierdId));
        sb.append(", rateCardId=").append(String.valueOf(this.rateCardId));
        sb.append(", computeSource=").append(String.valueOf(this.computeSource));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(", mqsMessageId=").append(String.valueOf(this.mqsMessageId));
        sb.append(", computedUsageId=").append(String.valueOf(this.computedUsageId));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", usageNumber=").append(String.valueOf(this.usageNumber));
        sb.append(", originalUsageNumber=").append(String.valueOf(this.originalUsageNumber));
        sb.append(", commitmentServiceId=").append(String.valueOf(this.commitmentServiceId));
        sb.append(", isInvoiced=").append(String.valueOf(this.isInvoiced));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeOfArrival=").append(String.valueOf(this.timeOfArrival));
        sb.append(", timeMeteredOn=").append(String.valueOf(this.timeMeteredOn));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", costRounded=").append(String.valueOf(this.costRounded));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputedUsageSummary)) {
            return false;
        }

        ComputedUsageSummary other = (ComputedUsageSummary) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.parentSubscribedServiceId, other.parentSubscribedServiceId)
                && java.util.Objects.equals(this.parentProduct, other.parentProduct)
                && java.util.Objects.equals(this.planNumber, other.planNumber)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.rateCardTierdId, other.rateCardTierdId)
                && java.util.Objects.equals(this.rateCardId, other.rateCardId)
                && java.util.Objects.equals(this.computeSource, other.computeSource)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && java.util.Objects.equals(this.mqsMessageId, other.mqsMessageId)
                && java.util.Objects.equals(this.computedUsageId, other.computedUsageId)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.usageNumber, other.usageNumber)
                && java.util.Objects.equals(this.originalUsageNumber, other.originalUsageNumber)
                && java.util.Objects.equals(this.commitmentServiceId, other.commitmentServiceId)
                && java.util.Objects.equals(this.isInvoiced, other.isInvoiced)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeOfArrival, other.timeOfArrival)
                && java.util.Objects.equals(this.timeMeteredOn, other.timeMeteredOn)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.costRounded, other.costRounded)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSubscribedServiceId == null
                                ? 43
                                : this.parentSubscribedServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentProduct == null ? 43 : this.parentProduct.hashCode());
        result = (result * PRIME) + (this.planNumber == null ? 43 : this.planNumber.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.rateCardTierdId == null ? 43 : this.rateCardTierdId.hashCode());
        result = (result * PRIME) + (this.rateCardId == null ? 43 : this.rateCardId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeSource == null ? 43 : this.computeSource.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result = (result * PRIME) + (this.mqsMessageId == null ? 43 : this.mqsMessageId.hashCode());
        result =
                (result * PRIME)
                        + (this.computedUsageId == null ? 43 : this.computedUsageId.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.usageNumber == null ? 43 : this.usageNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.originalUsageNumber == null
                                ? 43
                                : this.originalUsageNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentServiceId == null
                                ? 43
                                : this.commitmentServiceId.hashCode());
        result = (result * PRIME) + (this.isInvoiced == null ? 43 : this.isInvoiced.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfArrival == null ? 43 : this.timeOfArrival.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMeteredOn == null ? 43 : this.timeMeteredOn.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.costRounded == null ? 43 : this.costRounded.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
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
