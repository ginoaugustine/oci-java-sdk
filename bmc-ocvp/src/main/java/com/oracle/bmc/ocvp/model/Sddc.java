/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An [Oracle Cloud VMware Solution](https://docs.cloud.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm) software-defined data center (SDDC) contains the resources required for a
 * functional VMware environment. Instances in an SDDC
 * (see {@link EsxiHost}) run in a virtual cloud network (VCN)
 * and are preconfigured with VMware and storage. Use the vCenter utility to manage
 * and deploy VMware virtual machines (VMs) in the SDDC.
 * <p>
 * The SDDC uses a single management subnet for provisioning the SDDC. It also uses a
 * set of VLANs for various components of the VMware environment (vSphere, vMotion,
 * vSAN, and so on). See the Core Services API for information about VCN subnets and VLANs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sddc.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Sddc {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "computeAvailabilityDomain",
        "displayName",
        "instanceDisplayNamePrefix",
        "vmwareSoftwareVersion",
        "compartmentId",
        "esxiHostsCount",
        "initialSku",
        "vcenterFqdn",
        "nsxManagerFqdn",
        "vcenterPrivateIpId",
        "nsxManagerPrivateIpId",
        "vcenterInitialPassword",
        "nsxManagerInitialPassword",
        "vcenterUsername",
        "nsxManagerUsername",
        "sshAuthorizedKeys",
        "workloadNetworkCidr",
        "nsxOverlaySegmentName",
        "nsxEdgeUplinkIpId",
        "provisioningSubnetId",
        "vsphereVlanId",
        "vmotionVlanId",
        "vsanVlanId",
        "nsxVTepVlanId",
        "nsxEdgeVTepVlanId",
        "nsxEdgeUplink1VlanId",
        "nsxEdgeUplink2VlanId",
        "replicationVlanId",
        "provisioningVlanId",
        "hcxPrivateIpId",
        "hcxFqdn",
        "hcxInitialPassword",
        "hcxVlanId",
        "isHcxEnabled",
        "hcxOnPremKey",
        "isHcxEnterpriseEnabled",
        "isHcxPendingDowngrade",
        "hcxOnPremLicenses",
        "timeHcxBillingCycleEnd",
        "timeHcxLicenseStatusUpdated",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isShieldedInstanceEnabled",
        "capacityReservationId",
        "freeformTags",
        "definedTags"
    })
    public Sddc(
            String id,
            String computeAvailabilityDomain,
            String displayName,
            String instanceDisplayNamePrefix,
            String vmwareSoftwareVersion,
            String compartmentId,
            Integer esxiHostsCount,
            Sku initialSku,
            String vcenterFqdn,
            String nsxManagerFqdn,
            String vcenterPrivateIpId,
            String nsxManagerPrivateIpId,
            String vcenterInitialPassword,
            String nsxManagerInitialPassword,
            String vcenterUsername,
            String nsxManagerUsername,
            String sshAuthorizedKeys,
            String workloadNetworkCidr,
            String nsxOverlaySegmentName,
            String nsxEdgeUplinkIpId,
            String provisioningSubnetId,
            String vsphereVlanId,
            String vmotionVlanId,
            String vsanVlanId,
            String nsxVTepVlanId,
            String nsxEdgeVTepVlanId,
            String nsxEdgeUplink1VlanId,
            String nsxEdgeUplink2VlanId,
            String replicationVlanId,
            String provisioningVlanId,
            String hcxPrivateIpId,
            String hcxFqdn,
            String hcxInitialPassword,
            String hcxVlanId,
            Boolean isHcxEnabled,
            String hcxOnPremKey,
            Boolean isHcxEnterpriseEnabled,
            Boolean isHcxPendingDowngrade,
            java.util.List<HcxLicenseSummary> hcxOnPremLicenses,
            java.util.Date timeHcxBillingCycleEnd,
            java.util.Date timeHcxLicenseStatusUpdated,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isShieldedInstanceEnabled,
            String capacityReservationId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.compartmentId = compartmentId;
        this.esxiHostsCount = esxiHostsCount;
        this.initialSku = initialSku;
        this.vcenterFqdn = vcenterFqdn;
        this.nsxManagerFqdn = nsxManagerFqdn;
        this.vcenterPrivateIpId = vcenterPrivateIpId;
        this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
        this.vcenterInitialPassword = vcenterInitialPassword;
        this.nsxManagerInitialPassword = nsxManagerInitialPassword;
        this.vcenterUsername = vcenterUsername;
        this.nsxManagerUsername = nsxManagerUsername;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.workloadNetworkCidr = workloadNetworkCidr;
        this.nsxOverlaySegmentName = nsxOverlaySegmentName;
        this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
        this.provisioningSubnetId = provisioningSubnetId;
        this.vsphereVlanId = vsphereVlanId;
        this.vmotionVlanId = vmotionVlanId;
        this.vsanVlanId = vsanVlanId;
        this.nsxVTepVlanId = nsxVTepVlanId;
        this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
        this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
        this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
        this.replicationVlanId = replicationVlanId;
        this.provisioningVlanId = provisioningVlanId;
        this.hcxPrivateIpId = hcxPrivateIpId;
        this.hcxFqdn = hcxFqdn;
        this.hcxInitialPassword = hcxInitialPassword;
        this.hcxVlanId = hcxVlanId;
        this.isHcxEnabled = isHcxEnabled;
        this.hcxOnPremKey = hcxOnPremKey;
        this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
        this.isHcxPendingDowngrade = isHcxPendingDowngrade;
        this.hcxOnPremLicenses = hcxOnPremLicenses;
        this.timeHcxBillingCycleEnd = timeHcxBillingCycleEnd;
        this.timeHcxLicenseStatusUpdated = timeHcxLicenseStatusUpdated;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.capacityReservationId = capacityReservationId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
        private Sku initialSku;

        public Builder initialSku(Sku initialSku) {
            this.initialSku = initialSku;
            this.__explicitlySet__.add("initialSku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        public Builder vcenterFqdn(String vcenterFqdn) {
            this.vcenterFqdn = vcenterFqdn;
            this.__explicitlySet__.add("vcenterFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        public Builder nsxManagerFqdn(String nsxManagerFqdn) {
            this.nsxManagerFqdn = nsxManagerFqdn;
            this.__explicitlySet__.add("nsxManagerFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
        private String vcenterPrivateIpId;

        public Builder vcenterPrivateIpId(String vcenterPrivateIpId) {
            this.vcenterPrivateIpId = vcenterPrivateIpId;
            this.__explicitlySet__.add("vcenterPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
        private String nsxManagerPrivateIpId;

        public Builder nsxManagerPrivateIpId(String nsxManagerPrivateIpId) {
            this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
            this.__explicitlySet__.add("nsxManagerPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
        private String vcenterInitialPassword;

        public Builder vcenterInitialPassword(String vcenterInitialPassword) {
            this.vcenterInitialPassword = vcenterInitialPassword;
            this.__explicitlySet__.add("vcenterInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
        private String nsxManagerInitialPassword;

        public Builder nsxManagerInitialPassword(String nsxManagerInitialPassword) {
            this.nsxManagerInitialPassword = nsxManagerInitialPassword;
            this.__explicitlySet__.add("nsxManagerInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
        private String vcenterUsername;

        public Builder vcenterUsername(String vcenterUsername) {
            this.vcenterUsername = vcenterUsername;
            this.__explicitlySet__.add("vcenterUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
        private String nsxManagerUsername;

        public Builder nsxManagerUsername(String nsxManagerUsername) {
            this.nsxManagerUsername = nsxManagerUsername;
            this.__explicitlySet__.add("nsxManagerUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
        private String sshAuthorizedKeys;

        public Builder sshAuthorizedKeys(String sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            this.__explicitlySet__.add("sshAuthorizedKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
        private String workloadNetworkCidr;

        public Builder workloadNetworkCidr(String workloadNetworkCidr) {
            this.workloadNetworkCidr = workloadNetworkCidr;
            this.__explicitlySet__.add("workloadNetworkCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
        private String nsxOverlaySegmentName;

        public Builder nsxOverlaySegmentName(String nsxOverlaySegmentName) {
            this.nsxOverlaySegmentName = nsxOverlaySegmentName;
            this.__explicitlySet__.add("nsxOverlaySegmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
        private String nsxEdgeUplinkIpId;

        public Builder nsxEdgeUplinkIpId(String nsxEdgeUplinkIpId) {
            this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
            this.__explicitlySet__.add("nsxEdgeUplinkIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
        private String provisioningSubnetId;

        public Builder provisioningSubnetId(String provisioningSubnetId) {
            this.provisioningSubnetId = provisioningSubnetId;
            this.__explicitlySet__.add("provisioningSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        public Builder vsphereVlanId(String vsphereVlanId) {
            this.vsphereVlanId = vsphereVlanId;
            this.__explicitlySet__.add("vsphereVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        public Builder vmotionVlanId(String vmotionVlanId) {
            this.vmotionVlanId = vmotionVlanId;
            this.__explicitlySet__.add("vmotionVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        public Builder vsanVlanId(String vsanVlanId) {
            this.vsanVlanId = vsanVlanId;
            this.__explicitlySet__.add("vsanVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        public Builder nsxVTepVlanId(String nsxVTepVlanId) {
            this.nsxVTepVlanId = nsxVTepVlanId;
            this.__explicitlySet__.add("nsxVTepVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        public Builder nsxEdgeVTepVlanId(String nsxEdgeVTepVlanId) {
            this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
            this.__explicitlySet__.add("nsxEdgeVTepVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        public Builder nsxEdgeUplink1VlanId(String nsxEdgeUplink1VlanId) {
            this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink1VlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        public Builder nsxEdgeUplink2VlanId(String nsxEdgeUplink2VlanId) {
            this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink2VlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
        private String replicationVlanId;

        public Builder replicationVlanId(String replicationVlanId) {
            this.replicationVlanId = replicationVlanId;
            this.__explicitlySet__.add("replicationVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
        private String provisioningVlanId;

        public Builder provisioningVlanId(String provisioningVlanId) {
            this.provisioningVlanId = provisioningVlanId;
            this.__explicitlySet__.add("provisioningVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
        private String hcxPrivateIpId;

        public Builder hcxPrivateIpId(String hcxPrivateIpId) {
            this.hcxPrivateIpId = hcxPrivateIpId;
            this.__explicitlySet__.add("hcxPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        public Builder hcxFqdn(String hcxFqdn) {
            this.hcxFqdn = hcxFqdn;
            this.__explicitlySet__.add("hcxFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
        private String hcxInitialPassword;

        public Builder hcxInitialPassword(String hcxInitialPassword) {
            this.hcxInitialPassword = hcxInitialPassword;
            this.__explicitlySet__.add("hcxInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
        private String hcxOnPremKey;

        public Builder hcxOnPremKey(String hcxOnPremKey) {
            this.hcxOnPremKey = hcxOnPremKey;
            this.__explicitlySet__.add("hcxOnPremKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
        private Boolean isHcxEnterpriseEnabled;

        public Builder isHcxEnterpriseEnabled(Boolean isHcxEnterpriseEnabled) {
            this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
            this.__explicitlySet__.add("isHcxEnterpriseEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxPendingDowngrade")
        private Boolean isHcxPendingDowngrade;

        public Builder isHcxPendingDowngrade(Boolean isHcxPendingDowngrade) {
            this.isHcxPendingDowngrade = isHcxPendingDowngrade;
            this.__explicitlySet__.add("isHcxPendingDowngrade");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremLicenses")
        private java.util.List<HcxLicenseSummary> hcxOnPremLicenses;

        public Builder hcxOnPremLicenses(java.util.List<HcxLicenseSummary> hcxOnPremLicenses) {
            this.hcxOnPremLicenses = hcxOnPremLicenses;
            this.__explicitlySet__.add("hcxOnPremLicenses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeHcxBillingCycleEnd")
        private java.util.Date timeHcxBillingCycleEnd;

        public Builder timeHcxBillingCycleEnd(java.util.Date timeHcxBillingCycleEnd) {
            this.timeHcxBillingCycleEnd = timeHcxBillingCycleEnd;
            this.__explicitlySet__.add("timeHcxBillingCycleEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeHcxLicenseStatusUpdated")
        private java.util.Date timeHcxLicenseStatusUpdated;

        public Builder timeHcxLicenseStatusUpdated(java.util.Date timeHcxLicenseStatusUpdated) {
            this.timeHcxLicenseStatusUpdated = timeHcxLicenseStatusUpdated;
            this.__explicitlySet__.add("timeHcxLicenseStatusUpdated");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
        private String initialHostShapeName;

        public Builder initialHostShapeName(String initialHostShapeName) {
            this.initialHostShapeName = initialHostShapeName;
            this.__explicitlySet__.add("initialHostShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
        private Float initialHostOcpuCount;

        public Builder initialHostOcpuCount(Float initialHostOcpuCount) {
            this.initialHostOcpuCount = initialHostOcpuCount;
            this.__explicitlySet__.add("initialHostOcpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        public Builder isShieldedInstanceEnabled(Boolean isShieldedInstanceEnabled) {
            this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
            this.__explicitlySet__.add("isShieldedInstanceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
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

        public Sddc build() {
            Sddc __instance__ =
                    new Sddc(
                            id,
                            computeAvailabilityDomain,
                            displayName,
                            instanceDisplayNamePrefix,
                            vmwareSoftwareVersion,
                            compartmentId,
                            esxiHostsCount,
                            initialSku,
                            vcenterFqdn,
                            nsxManagerFqdn,
                            vcenterPrivateIpId,
                            nsxManagerPrivateIpId,
                            vcenterInitialPassword,
                            nsxManagerInitialPassword,
                            vcenterUsername,
                            nsxManagerUsername,
                            sshAuthorizedKeys,
                            workloadNetworkCidr,
                            nsxOverlaySegmentName,
                            nsxEdgeUplinkIpId,
                            provisioningSubnetId,
                            vsphereVlanId,
                            vmotionVlanId,
                            vsanVlanId,
                            nsxVTepVlanId,
                            nsxEdgeVTepVlanId,
                            nsxEdgeUplink1VlanId,
                            nsxEdgeUplink2VlanId,
                            replicationVlanId,
                            provisioningVlanId,
                            hcxPrivateIpId,
                            hcxFqdn,
                            hcxInitialPassword,
                            hcxVlanId,
                            isHcxEnabled,
                            hcxOnPremKey,
                            isHcxEnterpriseEnabled,
                            isHcxPendingDowngrade,
                            hcxOnPremLicenses,
                            timeHcxBillingCycleEnd,
                            timeHcxLicenseStatusUpdated,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            initialHostShapeName,
                            initialHostOcpuCount,
                            isShieldedInstanceEnabled,
                            capacityReservationId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sddc o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .computeAvailabilityDomain(o.getComputeAvailabilityDomain())
                            .displayName(o.getDisplayName())
                            .instanceDisplayNamePrefix(o.getInstanceDisplayNamePrefix())
                            .vmwareSoftwareVersion(o.getVmwareSoftwareVersion())
                            .compartmentId(o.getCompartmentId())
                            .esxiHostsCount(o.getEsxiHostsCount())
                            .initialSku(o.getInitialSku())
                            .vcenterFqdn(o.getVcenterFqdn())
                            .nsxManagerFqdn(o.getNsxManagerFqdn())
                            .vcenterPrivateIpId(o.getVcenterPrivateIpId())
                            .nsxManagerPrivateIpId(o.getNsxManagerPrivateIpId())
                            .vcenterInitialPassword(o.getVcenterInitialPassword())
                            .nsxManagerInitialPassword(o.getNsxManagerInitialPassword())
                            .vcenterUsername(o.getVcenterUsername())
                            .nsxManagerUsername(o.getNsxManagerUsername())
                            .sshAuthorizedKeys(o.getSshAuthorizedKeys())
                            .workloadNetworkCidr(o.getWorkloadNetworkCidr())
                            .nsxOverlaySegmentName(o.getNsxOverlaySegmentName())
                            .nsxEdgeUplinkIpId(o.getNsxEdgeUplinkIpId())
                            .provisioningSubnetId(o.getProvisioningSubnetId())
                            .vsphereVlanId(o.getVsphereVlanId())
                            .vmotionVlanId(o.getVmotionVlanId())
                            .vsanVlanId(o.getVsanVlanId())
                            .nsxVTepVlanId(o.getNsxVTepVlanId())
                            .nsxEdgeVTepVlanId(o.getNsxEdgeVTepVlanId())
                            .nsxEdgeUplink1VlanId(o.getNsxEdgeUplink1VlanId())
                            .nsxEdgeUplink2VlanId(o.getNsxEdgeUplink2VlanId())
                            .replicationVlanId(o.getReplicationVlanId())
                            .provisioningVlanId(o.getProvisioningVlanId())
                            .hcxPrivateIpId(o.getHcxPrivateIpId())
                            .hcxFqdn(o.getHcxFqdn())
                            .hcxInitialPassword(o.getHcxInitialPassword())
                            .hcxVlanId(o.getHcxVlanId())
                            .isHcxEnabled(o.getIsHcxEnabled())
                            .hcxOnPremKey(o.getHcxOnPremKey())
                            .isHcxEnterpriseEnabled(o.getIsHcxEnterpriseEnabled())
                            .isHcxPendingDowngrade(o.getIsHcxPendingDowngrade())
                            .hcxOnPremLicenses(o.getHcxOnPremLicenses())
                            .timeHcxBillingCycleEnd(o.getTimeHcxBillingCycleEnd())
                            .timeHcxLicenseStatusUpdated(o.getTimeHcxLicenseStatusUpdated())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .initialHostShapeName(o.getInitialHostShapeName())
                            .initialHostOcpuCount(o.getInitialHostOcpuCount())
                            .isShieldedInstanceEnabled(o.getIsShieldedInstanceEnabled())
                            .capacityReservationId(o.getCapacityReservationId())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The availability domain the ESXi hosts are running in. For Multi-AD SDDC, it is {@code multi-AD}.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
     * If this isn't set, the SDDC's {@code displayName} is used as the prefix.
     * <p>
     * For example, if the value is {@code MySDDC}, the ESXi hosts are named {@code MySDDC-1},
     * {@code MySDDC-2}, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    private final String instanceDisplayNamePrefix;

    public String getInstanceDisplayNamePrefix() {
        return instanceDisplayNamePrefix;
    }

    /**
     * In general, this is a specific version of bundled VMware software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code vmwareSoftwareVersion} with that new version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The number of ESXi hosts in the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    /**
     * The billing option selected during SDDC creation.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
    private final Sku initialSku;

    public Sku getInitialSku() {
        return initialSku;
    }

    /**
     * The FQDN for vCenter.
     * <p>
     * Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    private final String vcenterFqdn;

    public String getVcenterFqdn() {
        return vcenterFqdn;
    }

    /**
     * The FQDN for NSX Manager.
     * <p>
     * Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    private final String nsxManagerFqdn;

    public String getNsxManagerFqdn() {
        return nsxManagerFqdn;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PrivateIp} object that is
     * the virtual IP (VIP) for vCenter. For information about {@code PrivateIp} objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
    private final String vcenterPrivateIpId;

    public String getVcenterPrivateIpId() {
        return vcenterPrivateIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PrivateIp} object that is
     * the virtual IP (VIP) for NSX Manager. For information about {@code PrivateIp} objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
    private final String nsxManagerPrivateIpId;

    public String getNsxManagerPrivateIpId() {
        return nsxManagerPrivateIpId;
    }

    /**
     * The SDDC includes an administrator username and initial password for vCenter. Make sure
     * to change this initial vCenter password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
    private final String vcenterInitialPassword;

    public String getVcenterInitialPassword() {
        return vcenterInitialPassword;
    }

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. Make sure
     * to change this initial NSX Manager password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
    private final String nsxManagerInitialPassword;

    public String getNsxManagerInitialPassword() {
        return nsxManagerInitialPassword;
    }

    /**
     * The SDDC includes an administrator username and initial password for vCenter. You can
     * change this initial username to a different value in vCenter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
    private final String vcenterUsername;

    public String getVcenterUsername() {
        return vcenterUsername;
    }

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. You
     * can change this initial username to a different value in NSX Manager.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
    private final String nsxManagerUsername;

    public String getNsxManagerUsername() {
        return nsxManagerUsername;
    }

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
     * the default user on each ESXi host. Use a newline character to separate multiple keys.
     * The SSH keys must be in the format required for the {@code authorized_keys} file.
     * <p>
     * This attribute is not guaranteed to reflect the public SSH keys
     * currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the public SSH keys that Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different
     * SSH keys, you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update
     * the SDDC's {@code sshAuthorizedKeys} with the new public keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
    private final String sshAuthorizedKeys;

    public String getSshAuthorizedKeys() {
        return sshAuthorizedKeys;
    }

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
    private final String workloadNetworkCidr;

    public String getWorkloadNetworkCidr() {
        return workloadNetworkCidr;
    }

    /**
     * The VMware NSX overlay workload segment to host your application. Connect to workload
     * portgroup in vCenter to access this overlay segment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
    private final String nsxOverlaySegmentName;

    public String getNsxOverlaySegmentName() {
        return nsxOverlaySegmentName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PrivateIp} object that is
     * the virtual IP (VIP) for the NSX Edge Uplink. Use this OCID as the route target for
     * route table rules when setting up connectivity between the SDDC and other networks.
     * For information about {@code PrivateIp} objects, see the Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
    private final String nsxEdgeUplinkIpId;

    public String getNsxEdgeUplinkIpId() {
        return nsxEdgeUplinkIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet used
     * to provision the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    private final String provisioningSubnetId;

    public String getProvisioningSubnetId() {
        return provisioningSubnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vSphere VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vSphere VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vSphere component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code vsphereVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    private final String vsphereVlanId;

    public String getVsphereVlanId() {
        return vsphereVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vMotion component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vMotion VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vMotion VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vMotion component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code vmotionVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    private final String vmotionVlanId;

    public String getVmotionVlanId() {
        return vmotionVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSAN component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vSAN VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vSAN VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vSAN component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code vsanVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    private final String vsanVlanId;

    public String getVsanVlanId() {
        return vsanVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX VTEP component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX VTEP VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX VTEP component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code nsxVTepVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    private final String nsxVTepVlanId;

    public String getNsxVTepVlanId() {
        return nsxVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge VTEP component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge VTEP component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code nsxEdgeVTepVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    private final String nsxEdgeVTepVlanId;

    public String getNsxEdgeVTepVlanId() {
        return nsxEdgeVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge Uplink 1 component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge Uplink 1 VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge Uplink 1 component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code nsxEdgeUplink1VlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    private final String nsxEdgeUplink1VlanId;

    public String getNsxEdgeUplink1VlanId() {
        return nsxEdgeUplink1VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge Uplink 2 component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge Uplink 2 VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge Uplink 2 component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code nsxEdgeUplink2VlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    private final String nsxEdgeUplink2VlanId;

    public String getNsxEdgeUplink2VlanId() {
        return nsxEdgeUplink2VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere Replication component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
    private final String replicationVlanId;

    public String getReplicationVlanId() {
        return replicationVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the Provisioning component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
    private final String provisioningVlanId;

    public String getProvisioningVlanId() {
        return provisioningVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the {@code PrivateIp} object that is
     * the virtual IP (VIP) for HCX Manager. For information about {@code PrivateIp} objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
    private final String hcxPrivateIpId;

    public String getHcxPrivateIpId() {
        return hcxPrivateIpId;
    }

    /**
     * The FQDN for HCX Manager.
     * <p>
     * Example: {@code hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    private final String hcxFqdn;

    public String getHcxFqdn() {
        return hcxFqdn;
    }

    /**
     * The SDDC includes an administrator username and initial password for HCX Manager. Make sure
     * to change this initial HCX Manager password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
    private final String hcxInitialPassword;

    public String getHcxInitialPassword() {
        return hcxInitialPassword;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the HCX component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the HCX VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the HCX VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the HCX component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code hcxVlanId} with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    private final String hcxVlanId;

    public String getHcxVlanId() {
        return hcxVlanId;
    }

    /**
     * Indicates whether HCX is enabled for this SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    private final Boolean isHcxEnabled;

    public Boolean getIsHcxEnabled() {
        return isHcxEnabled;
    }

    /**
     * The activation keys to use on the on-premises HCX Enterprise appliances you site pair with HCX Manager in your VMware Solution.
     * The number of keys provided depends on the HCX license type. HCX Advanced provides 3 activation keys.
     * HCX Enterprise provides 10 activation keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
    private final String hcxOnPremKey;

    public String getHcxOnPremKey() {
        return hcxOnPremKey;
    }

    /**
     * Indicates whether HCX Enterprise is enabled for this SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
    private final Boolean isHcxEnterpriseEnabled;

    public Boolean getIsHcxEnterpriseEnabled() {
        return isHcxEnterpriseEnabled;
    }

    /**
     * Indicates whether SDDC is pending downgrade from HCX Enterprise to HCX Advanced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxPendingDowngrade")
    private final Boolean isHcxPendingDowngrade;

    public Boolean getIsHcxPendingDowngrade() {
        return isHcxPendingDowngrade;
    }

    /**
     * The activation licenses to use on the on-premises HCX Enterprise appliance you site pair with HCX Manager in your VMware Solution.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremLicenses")
    private final java.util.List<HcxLicenseSummary> hcxOnPremLicenses;

    public java.util.List<HcxLicenseSummary> getHcxOnPremLicenses() {
        return hcxOnPremLicenses;
    }

    /**
     * The date and time current HCX Enterprise billing cycle ends, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeHcxBillingCycleEnd")
    private final java.util.Date timeHcxBillingCycleEnd;

    public java.util.Date getTimeHcxBillingCycleEnd() {
        return timeHcxBillingCycleEnd;
    }

    /**
     * The date and time the SDDC's HCX on-premise license status was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeHcxLicenseStatusUpdated")
    private final java.util.Date timeHcxLicenseStatusUpdated;

    public java.util.Date getTimeHcxLicenseStatusUpdated() {
        return timeHcxLicenseStatusUpdated;
    }

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The initial compute shape of the SDDC's ESXi hosts.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
    private final String initialHostShapeName;

    public String getInitialHostShapeName() {
        return initialHostShapeName;
    }

    /**
     * The initial OCPU count of the SDDC's ESXi hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
    private final Float initialHostOcpuCount;

    public Float getInitialHostOcpuCount() {
        return initialHostOcpuCount;
    }

    /**
     * Indicates whether shielded instance is enabled at the SDDC level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    public Boolean getIsShieldedInstanceEnabled() {
        return isShieldedInstanceEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("Sddc(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceDisplayNamePrefix=")
                .append(String.valueOf(this.instanceDisplayNamePrefix));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", initialSku=").append(String.valueOf(this.initialSku));
        sb.append(", vcenterFqdn=").append(String.valueOf(this.vcenterFqdn));
        sb.append(", nsxManagerFqdn=").append(String.valueOf(this.nsxManagerFqdn));
        sb.append(", vcenterPrivateIpId=").append(String.valueOf(this.vcenterPrivateIpId));
        sb.append(", nsxManagerPrivateIpId=").append(String.valueOf(this.nsxManagerPrivateIpId));
        sb.append(", vcenterInitialPassword=").append(String.valueOf(this.vcenterInitialPassword));
        sb.append(", nsxManagerInitialPassword=")
                .append(String.valueOf(this.nsxManagerInitialPassword));
        sb.append(", vcenterUsername=").append(String.valueOf(this.vcenterUsername));
        sb.append(", nsxManagerUsername=").append(String.valueOf(this.nsxManagerUsername));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
        sb.append(", workloadNetworkCidr=").append(String.valueOf(this.workloadNetworkCidr));
        sb.append(", nsxOverlaySegmentName=").append(String.valueOf(this.nsxOverlaySegmentName));
        sb.append(", nsxEdgeUplinkIpId=").append(String.valueOf(this.nsxEdgeUplinkIpId));
        sb.append(", provisioningSubnetId=").append(String.valueOf(this.provisioningSubnetId));
        sb.append(", vsphereVlanId=").append(String.valueOf(this.vsphereVlanId));
        sb.append(", vmotionVlanId=").append(String.valueOf(this.vmotionVlanId));
        sb.append(", vsanVlanId=").append(String.valueOf(this.vsanVlanId));
        sb.append(", nsxVTepVlanId=").append(String.valueOf(this.nsxVTepVlanId));
        sb.append(", nsxEdgeVTepVlanId=").append(String.valueOf(this.nsxEdgeVTepVlanId));
        sb.append(", nsxEdgeUplink1VlanId=").append(String.valueOf(this.nsxEdgeUplink1VlanId));
        sb.append(", nsxEdgeUplink2VlanId=").append(String.valueOf(this.nsxEdgeUplink2VlanId));
        sb.append(", replicationVlanId=").append(String.valueOf(this.replicationVlanId));
        sb.append(", provisioningVlanId=").append(String.valueOf(this.provisioningVlanId));
        sb.append(", hcxPrivateIpId=").append(String.valueOf(this.hcxPrivateIpId));
        sb.append(", hcxFqdn=").append(String.valueOf(this.hcxFqdn));
        sb.append(", hcxInitialPassword=").append(String.valueOf(this.hcxInitialPassword));
        sb.append(", hcxVlanId=").append(String.valueOf(this.hcxVlanId));
        sb.append(", isHcxEnabled=").append(String.valueOf(this.isHcxEnabled));
        sb.append(", hcxOnPremKey=").append(String.valueOf(this.hcxOnPremKey));
        sb.append(", isHcxEnterpriseEnabled=").append(String.valueOf(this.isHcxEnterpriseEnabled));
        sb.append(", isHcxPendingDowngrade=").append(String.valueOf(this.isHcxPendingDowngrade));
        sb.append(", hcxOnPremLicenses=").append(String.valueOf(this.hcxOnPremLicenses));
        sb.append(", timeHcxBillingCycleEnd=").append(String.valueOf(this.timeHcxBillingCycleEnd));
        sb.append(", timeHcxLicenseStatusUpdated=")
                .append(String.valueOf(this.timeHcxLicenseStatusUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
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
        if (!(o instanceof Sddc)) {
            return false;
        }

        Sddc other = (Sddc) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.instanceDisplayNamePrefix, other.instanceDisplayNamePrefix)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.initialSku, other.initialSku)
                && java.util.Objects.equals(this.vcenterFqdn, other.vcenterFqdn)
                && java.util.Objects.equals(this.nsxManagerFqdn, other.nsxManagerFqdn)
                && java.util.Objects.equals(this.vcenterPrivateIpId, other.vcenterPrivateIpId)
                && java.util.Objects.equals(this.nsxManagerPrivateIpId, other.nsxManagerPrivateIpId)
                && java.util.Objects.equals(
                        this.vcenterInitialPassword, other.vcenterInitialPassword)
                && java.util.Objects.equals(
                        this.nsxManagerInitialPassword, other.nsxManagerInitialPassword)
                && java.util.Objects.equals(this.vcenterUsername, other.vcenterUsername)
                && java.util.Objects.equals(this.nsxManagerUsername, other.nsxManagerUsername)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
                && java.util.Objects.equals(this.workloadNetworkCidr, other.workloadNetworkCidr)
                && java.util.Objects.equals(this.nsxOverlaySegmentName, other.nsxOverlaySegmentName)
                && java.util.Objects.equals(this.nsxEdgeUplinkIpId, other.nsxEdgeUplinkIpId)
                && java.util.Objects.equals(this.provisioningSubnetId, other.provisioningSubnetId)
                && java.util.Objects.equals(this.vsphereVlanId, other.vsphereVlanId)
                && java.util.Objects.equals(this.vmotionVlanId, other.vmotionVlanId)
                && java.util.Objects.equals(this.vsanVlanId, other.vsanVlanId)
                && java.util.Objects.equals(this.nsxVTepVlanId, other.nsxVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeVTepVlanId, other.nsxEdgeVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink1VlanId, other.nsxEdgeUplink1VlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink2VlanId, other.nsxEdgeUplink2VlanId)
                && java.util.Objects.equals(this.replicationVlanId, other.replicationVlanId)
                && java.util.Objects.equals(this.provisioningVlanId, other.provisioningVlanId)
                && java.util.Objects.equals(this.hcxPrivateIpId, other.hcxPrivateIpId)
                && java.util.Objects.equals(this.hcxFqdn, other.hcxFqdn)
                && java.util.Objects.equals(this.hcxInitialPassword, other.hcxInitialPassword)
                && java.util.Objects.equals(this.hcxVlanId, other.hcxVlanId)
                && java.util.Objects.equals(this.isHcxEnabled, other.isHcxEnabled)
                && java.util.Objects.equals(this.hcxOnPremKey, other.hcxOnPremKey)
                && java.util.Objects.equals(
                        this.isHcxEnterpriseEnabled, other.isHcxEnterpriseEnabled)
                && java.util.Objects.equals(this.isHcxPendingDowngrade, other.isHcxPendingDowngrade)
                && java.util.Objects.equals(this.hcxOnPremLicenses, other.hcxOnPremLicenses)
                && java.util.Objects.equals(
                        this.timeHcxBillingCycleEnd, other.timeHcxBillingCycleEnd)
                && java.util.Objects.equals(
                        this.timeHcxLicenseStatusUpdated, other.timeHcxLicenseStatusUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDisplayNamePrefix == null
                                ? 43
                                : this.instanceDisplayNamePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result = (result * PRIME) + (this.initialSku == null ? 43 : this.initialSku.hashCode());
        result = (result * PRIME) + (this.vcenterFqdn == null ? 43 : this.vcenterFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerFqdn == null ? 43 : this.nsxManagerFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterPrivateIpId == null
                                ? 43
                                : this.vcenterPrivateIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerPrivateIpId == null
                                ? 43
                                : this.nsxManagerPrivateIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterInitialPassword == null
                                ? 43
                                : this.vcenterInitialPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerInitialPassword == null
                                ? 43
                                : this.nsxManagerInitialPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterUsername == null ? 43 : this.vcenterUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerUsername == null
                                ? 43
                                : this.nsxManagerUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.sshAuthorizedKeys == null ? 43 : this.sshAuthorizedKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadNetworkCidr == null
                                ? 43
                                : this.workloadNetworkCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxOverlaySegmentName == null
                                ? 43
                                : this.nsxOverlaySegmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplinkIpId == null ? 43 : this.nsxEdgeUplinkIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningSubnetId == null
                                ? 43
                                : this.provisioningSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.vsphereVlanId == null ? 43 : this.vsphereVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmotionVlanId == null ? 43 : this.vmotionVlanId.hashCode());
        result = (result * PRIME) + (this.vsanVlanId == null ? 43 : this.vsanVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxVTepVlanId == null ? 43 : this.nsxVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeVTepVlanId == null ? 43 : this.nsxEdgeVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink1VlanId == null
                                ? 43
                                : this.nsxEdgeUplink1VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink2VlanId == null
                                ? 43
                                : this.nsxEdgeUplink2VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationVlanId == null ? 43 : this.replicationVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningVlanId == null
                                ? 43
                                : this.provisioningVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxPrivateIpId == null ? 43 : this.hcxPrivateIpId.hashCode());
        result = (result * PRIME) + (this.hcxFqdn == null ? 43 : this.hcxFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxInitialPassword == null
                                ? 43
                                : this.hcxInitialPassword.hashCode());
        result = (result * PRIME) + (this.hcxVlanId == null ? 43 : this.hcxVlanId.hashCode());
        result = (result * PRIME) + (this.isHcxEnabled == null ? 43 : this.isHcxEnabled.hashCode());
        result = (result * PRIME) + (this.hcxOnPremKey == null ? 43 : this.hcxOnPremKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isHcxEnterpriseEnabled == null
                                ? 43
                                : this.isHcxEnterpriseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHcxPendingDowngrade == null
                                ? 43
                                : this.isHcxPendingDowngrade.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxOnPremLicenses == null ? 43 : this.hcxOnPremLicenses.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHcxBillingCycleEnd == null
                                ? 43
                                : this.timeHcxBillingCycleEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHcxLicenseStatusUpdated == null
                                ? 43
                                : this.timeHcxLicenseStatusUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostShapeName == null
                                ? 43
                                : this.initialHostShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostOcpuCount == null
                                ? 43
                                : this.initialHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isShieldedInstanceEnabled == null
                                ? 43
                                : this.isShieldedInstanceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
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
