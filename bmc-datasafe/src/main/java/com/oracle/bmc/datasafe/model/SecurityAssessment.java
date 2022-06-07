/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A security assessment that provides an overall insight into your database security posture.
 * The security assessment results are based on the analysis of your database configurations,
 * user accounts, and security controls. For more information, see [Security Assessment Overview](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/security-assessment-overview.html).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityAssessment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityAssessment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeCreated",
        "timeUpdated",
        "compartmentId",
        "displayName",
        "targetIds",
        "ignoredTargets",
        "ignoredAssessmentIds",
        "targetVersion",
        "isBaseline",
        "isDeviatedFromBaseline",
        "lastComparedBaselineId",
        "lifecycleState",
        "lifecycleDetails",
        "scheduleSecurityAssessmentId",
        "triggeredBy",
        "description",
        "schedule",
        "link",
        "type",
        "statistics",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SecurityAssessment(
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String compartmentId,
            String displayName,
            java.util.List<String> targetIds,
            java.util.List<Object> ignoredTargets,
            java.util.List<Object> ignoredAssessmentIds,
            String targetVersion,
            Boolean isBaseline,
            Boolean isDeviatedFromBaseline,
            String lastComparedBaselineId,
            SecurityAssessmentLifecycleState lifecycleState,
            String lifecycleDetails,
            String scheduleSecurityAssessmentId,
            TriggeredBy triggeredBy,
            String description,
            String schedule,
            String link,
            Type type,
            SecurityAssessmentStatistics statistics,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.targetIds = targetIds;
        this.ignoredTargets = ignoredTargets;
        this.ignoredAssessmentIds = ignoredAssessmentIds;
        this.targetVersion = targetVersion;
        this.isBaseline = isBaseline;
        this.isDeviatedFromBaseline = isDeviatedFromBaseline;
        this.lastComparedBaselineId = lastComparedBaselineId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.scheduleSecurityAssessmentId = scheduleSecurityAssessmentId;
        this.triggeredBy = triggeredBy;
        this.description = description;
        this.schedule = schedule;
        this.link = link;
        this.type = type;
        this.statistics = statistics;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargets")
        private java.util.List<Object> ignoredTargets;

        public Builder ignoredTargets(java.util.List<Object> ignoredTargets) {
            this.ignoredTargets = ignoredTargets;
            this.__explicitlySet__.add("ignoredTargets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
        private java.util.List<Object> ignoredAssessmentIds;

        public Builder ignoredAssessmentIds(java.util.List<Object> ignoredAssessmentIds) {
            this.ignoredAssessmentIds = ignoredAssessmentIds;
            this.__explicitlySet__.add("ignoredAssessmentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
        private String targetVersion;

        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            this.__explicitlySet__.add("targetVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
        private Boolean isBaseline;

        public Builder isBaseline(Boolean isBaseline) {
            this.isBaseline = isBaseline;
            this.__explicitlySet__.add("isBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
        private Boolean isDeviatedFromBaseline;

        public Builder isDeviatedFromBaseline(Boolean isDeviatedFromBaseline) {
            this.isDeviatedFromBaseline = isDeviatedFromBaseline;
            this.__explicitlySet__.add("isDeviatedFromBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
        private String lastComparedBaselineId;

        public Builder lastComparedBaselineId(String lastComparedBaselineId) {
            this.lastComparedBaselineId = lastComparedBaselineId;
            this.__explicitlySet__.add("lastComparedBaselineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SecurityAssessmentLifecycleState lifecycleState;

        public Builder lifecycleState(SecurityAssessmentLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleSecurityAssessmentId")
        private String scheduleSecurityAssessmentId;

        public Builder scheduleSecurityAssessmentId(String scheduleSecurityAssessmentId) {
            this.scheduleSecurityAssessmentId = scheduleSecurityAssessmentId;
            this.__explicitlySet__.add("scheduleSecurityAssessmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
        private TriggeredBy triggeredBy;

        public Builder triggeredBy(TriggeredBy triggeredBy) {
            this.triggeredBy = triggeredBy;
            this.__explicitlySet__.add("triggeredBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("link")
        private String link;

        public Builder link(String link) {
            this.link = link;
            this.__explicitlySet__.add("link");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private SecurityAssessmentStatistics statistics;

        public Builder statistics(SecurityAssessmentStatistics statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessment build() {
            SecurityAssessment __instance__ =
                    new SecurityAssessment(
                            id,
                            timeCreated,
                            timeUpdated,
                            compartmentId,
                            displayName,
                            targetIds,
                            ignoredTargets,
                            ignoredAssessmentIds,
                            targetVersion,
                            isBaseline,
                            isDeviatedFromBaseline,
                            lastComparedBaselineId,
                            lifecycleState,
                            lifecycleDetails,
                            scheduleSecurityAssessmentId,
                            triggeredBy,
                            description,
                            schedule,
                            link,
                            type,
                            statistics,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .targetIds(o.getTargetIds())
                            .ignoredTargets(o.getIgnoredTargets())
                            .ignoredAssessmentIds(o.getIgnoredAssessmentIds())
                            .targetVersion(o.getTargetVersion())
                            .isBaseline(o.getIsBaseline())
                            .isDeviatedFromBaseline(o.getIsDeviatedFromBaseline())
                            .lastComparedBaselineId(o.getLastComparedBaselineId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .scheduleSecurityAssessmentId(o.getScheduleSecurityAssessmentId())
                            .triggeredBy(o.getTriggeredBy())
                            .description(o.getDescription())
                            .schedule(o.getSchedule())
                            .link(o.getLink())
                            .type(o.getType())
                            .statistics(o.getStatistics())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The date and time when the security assessment was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the security assessment was last updated. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The OCID of the compartment that contains the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Array of database target OCIDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredTargets")
    private final java.util.List<Object> ignoredTargets;

    public java.util.List<Object> getIgnoredTargets() {
        return ignoredTargets;
    }

    /**
     * List containing maps as values.
     * Example: {@code {"Operations": [ {"CostCenter": "42"} ] }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoredAssessmentIds")
    private final java.util.List<Object> ignoredAssessmentIds;

    public java.util.List<Object> getIgnoredAssessmentIds() {
        return ignoredAssessmentIds;
    }

    /**
     * The version of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    private final String targetVersion;

    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * Indicates whether or not the security assessment is set as a baseline. This is applicable only for saved security assessments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseline")
    private final Boolean isBaseline;

    public Boolean getIsBaseline() {
        return isBaseline;
    }

    /**
     * Indicates if the assessment has deviated from the baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeviatedFromBaseline")
    private final Boolean isDeviatedFromBaseline;

    public Boolean getIsDeviatedFromBaseline() {
        return isDeviatedFromBaseline;
    }

    /**
     * The OCID of the baseline against which the latest security assessment was compared.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastComparedBaselineId")
    private final String lastComparedBaselineId;

    public String getLastComparedBaselineId() {
        return lastComparedBaselineId;
    }

    /**
     * The current state of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SecurityAssessmentLifecycleState lifecycleState;

    public SecurityAssessmentLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The OCID of the security assessment that is responsible for creating this scheduled save assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleSecurityAssessmentId")
    private final String scheduleSecurityAssessmentId;

    public String getScheduleSecurityAssessmentId() {
        return scheduleSecurityAssessmentId;
    }

    /**
     * Indicates whether the security assessment was created by system or by a user.
     **/
    public enum TriggeredBy {
        User("USER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggeredBy.class);

        private final String value;
        private static java.util.Map<String, TriggeredBy> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggeredBy v : TriggeredBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggeredBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggeredBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggeredBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the security assessment was created by system or by a user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
    private final TriggeredBy triggeredBy;

    public TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * The description of the security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Schedule to save the assessment periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * 4. No constraint introduced when it is '*'. When not, day of week must equal the given value
     * <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * 5. No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    public String getSchedule() {
        return schedule;
    }

    /**
     * The summary of findings for the security assessment
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    private final String link;

    public String getLink() {
        return link;
    }

    /**
     * The type of this security assessment. The possible types are:
     * <p>
     * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
     * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
     * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
     * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
     *  This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when
     *  the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
     *
     **/
    public enum Type {
        Latest("LATEST"),
        Saved("SAVED"),
        SaveSchedule("SAVE_SCHEDULE"),
        Compartment("COMPARTMENT"),

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
     * The type of this security assessment. The possible types are:
     * <p>
     * LATEST: The most up-to-date assessment that is running automatically for a target. It is system generated.
     * SAVED: A saved security assessment. LATEST assessments are always saved in order to maintain the history of runs. A SAVED assessment is also generated by a 'refresh' action (triggered by the user).
     * SAVE_SCHEDULE: The schedule for periodic saves of LATEST assessments.
     * COMPARTMENT: An automatically managed assessment type that stores all details of targets in one compartment.
     *  This type keeps an up-to-date assessment of all database risks in one compartment. It is automatically updated when
     *  the latest assessment or refresh action is executed. It is also automatically updated when a target is deleted or move to a different compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    public Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final SecurityAssessmentStatistics statistics;

    public SecurityAssessmentStatistics getStatistics() {
        return statistics;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SecurityAssessment(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(", ignoredTargets=").append(String.valueOf(this.ignoredTargets));
        sb.append(", ignoredAssessmentIds=").append(String.valueOf(this.ignoredAssessmentIds));
        sb.append(", targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(", isBaseline=").append(String.valueOf(this.isBaseline));
        sb.append(", isDeviatedFromBaseline=").append(String.valueOf(this.isDeviatedFromBaseline));
        sb.append(", lastComparedBaselineId=").append(String.valueOf(this.lastComparedBaselineId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", scheduleSecurityAssessmentId=")
                .append(String.valueOf(this.scheduleSecurityAssessmentId));
        sb.append(", triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", link=").append(String.valueOf(this.link));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessment)) {
            return false;
        }

        SecurityAssessment other = (SecurityAssessment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.ignoredTargets, other.ignoredTargets)
                && java.util.Objects.equals(this.ignoredAssessmentIds, other.ignoredAssessmentIds)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(this.isBaseline, other.isBaseline)
                && java.util.Objects.equals(
                        this.isDeviatedFromBaseline, other.isDeviatedFromBaseline)
                && java.util.Objects.equals(
                        this.lastComparedBaselineId, other.lastComparedBaselineId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.scheduleSecurityAssessmentId, other.scheduleSecurityAssessmentId)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.link, other.link)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredTargets == null ? 43 : this.ignoredTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoredAssessmentIds == null
                                ? 43
                                : this.ignoredAssessmentIds.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
        result = (result * PRIME) + (this.isBaseline == null ? 43 : this.isBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeviatedFromBaseline == null
                                ? 43
                                : this.isDeviatedFromBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.lastComparedBaselineId == null
                                ? 43
                                : this.lastComparedBaselineId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleSecurityAssessmentId == null
                                ? 43
                                : this.scheduleSecurityAssessmentId.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.link == null ? 43 : this.link.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
