/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The task run object provides information on the execution of a task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaskRunDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "status",
        "startTimeMillis",
        "endTimeMillis",
        "lastUpdated",
        "recordsWritten",
        "bytesProcessed",
        "objectStatus",
        "taskType",
        "identifier",
        "refTaskRunId",
        "reRunType",
        "stepId",
        "inputs",
        "metadata"
    })
    public TaskRunDetails(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Status status,
            Long startTimeMillis,
            Long endTimeMillis,
            Long lastUpdated,
            Long recordsWritten,
            Long bytesProcessed,
            Integer objectStatus,
            TaskType taskType,
            String identifier,
            String refTaskRunId,
            ReRunType reRunType,
            String stepId,
            java.util.Map<String, ParameterValue> inputs,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.status = status;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.lastUpdated = lastUpdated;
        this.recordsWritten = recordsWritten;
        this.bytesProcessed = bytesProcessed;
        this.objectStatus = objectStatus;
        this.taskType = taskType;
        this.identifier = identifier;
        this.refTaskRunId = refTaskRunId;
        this.reRunType = reRunType;
        this.stepId = stepId;
        this.inputs = inputs;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
        private Long lastUpdated;

        public Builder lastUpdated(Long lastUpdated) {
            this.lastUpdated = lastUpdated;
            this.__explicitlySet__.add("lastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
        private Long recordsWritten;

        public Builder recordsWritten(Long recordsWritten) {
            this.recordsWritten = recordsWritten;
            this.__explicitlySet__.add("recordsWritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
        private Long bytesProcessed;

        public Builder bytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
            this.__explicitlySet__.add("bytesProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
        private String refTaskRunId;

        public Builder refTaskRunId(String refTaskRunId) {
            this.refTaskRunId = refTaskRunId;
            this.__explicitlySet__.add("refTaskRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
        private ReRunType reRunType;

        public Builder reRunType(ReRunType reRunType) {
            this.reRunType = reRunType;
            this.__explicitlySet__.add("reRunType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private String stepId;

        public Builder stepId(String stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.Map<String, ParameterValue> inputs;

        public Builder inputs(java.util.Map<String, ParameterValue> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskRunDetails build() {
            TaskRunDetails __instance__ =
                    new TaskRunDetails(
                            key,
                            modelType,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            status,
                            startTimeMillis,
                            endTimeMillis,
                            lastUpdated,
                            recordsWritten,
                            bytesProcessed,
                            objectStatus,
                            taskType,
                            identifier,
                            refTaskRunId,
                            reRunType,
                            stepId,
                            inputs,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunDetails o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .status(o.getStatus())
                            .startTimeMillis(o.getStartTimeMillis())
                            .endTimeMillis(o.getEndTimeMillis())
                            .lastUpdated(o.getLastUpdated())
                            .recordsWritten(o.getRecordsWritten())
                            .bytesProcessed(o.getBytesProcessed())
                            .objectStatus(o.getObjectStatus())
                            .taskType(o.getTaskType())
                            .identifier(o.getIdentifier())
                            .refTaskRunId(o.getRefTaskRunId())
                            .reRunType(o.getReRunType())
                            .stepId(o.getStepId())
                            .inputs(o.getInputs())
                            .metadata(o.getMetadata());

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
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * The object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    public String getModelType() {
        return modelType;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * status
     **/
    public enum Status {
        NotStarted("NOT_STARTED"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * The task run start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /**
     * The task run end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    /**
     * The date and time the task run was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    private final Long lastUpdated;

    public Long getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Number of records processed in task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
    private final Long recordsWritten;

    public Long getRecordsWritten() {
        return recordsWritten;
    }

    /**
     * Number of bytes processed in task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
    private final Long bytesProcessed;

    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * The type of the task for the run.
     **/
    public enum TaskType {
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        PipelineTask("PIPELINE_TASK"),
        SqlTask("SQL_TASK"),
        OciDataflowTask("OCI_DATAFLOW_TASK"),
        RestTask("REST_TASK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TaskType.class);

        private final String value;
        private static java.util.Map<String, TaskType> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskType v : TaskType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TaskType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TaskType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the task for the run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    public String getIdentifier() {
        return identifier;
    }

    /**
     * Reference Task Run Id to be used for re-run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
    private final String refTaskRunId;

    public String getRefTaskRunId() {
        return refTaskRunId;
    }

    /**
     * Supported re-run types
     **/
    public enum ReRunType {
        Beginning("BEGINNING"),
        Failed("FAILED"),
        Step("STEP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReRunType.class);

        private final String value;
        private static java.util.Map<String, ReRunType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReRunType v : ReRunType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReRunType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReRunType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReRunType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Supported re-run types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
    private final ReRunType reRunType;

    public ReRunType getReRunType() {
        return reRunType;
    }

    /**
     * Step Id for running from a certain step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final String stepId;

    public String getStepId() {
        return stepId;
    }

    /**
     * A map of the configuration provider input bindings of the run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.Map<String, ParameterValue> inputs;

    public java.util.Map<String, ParameterValue> getInputs() {
        return inputs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskRunDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", lastUpdated=").append(String.valueOf(this.lastUpdated));
        sb.append(", recordsWritten=").append(String.valueOf(this.recordsWritten));
        sb.append(", bytesProcessed=").append(String.valueOf(this.bytesProcessed));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", refTaskRunId=").append(String.valueOf(this.refTaskRunId));
        sb.append(", reRunType=").append(String.valueOf(this.reRunType));
        sb.append(", stepId=").append(String.valueOf(this.stepId));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunDetails)) {
            return false;
        }

        TaskRunDetails other = (TaskRunDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis)
                && java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis)
                && java.util.Objects.equals(this.lastUpdated, other.lastUpdated)
                && java.util.Objects.equals(this.recordsWritten, other.recordsWritten)
                && java.util.Objects.equals(this.bytesProcessed, other.bytesProcessed)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.refTaskRunId, other.refTaskRunId)
                && java.util.Objects.equals(this.reRunType, other.reRunType)
                && java.util.Objects.equals(this.stepId, other.stepId)
                && java.util.Objects.equals(this.inputs, other.inputs)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeMillis == null ? 43 : this.startTimeMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeMillis == null ? 43 : this.endTimeMillis.hashCode());
        result = (result * PRIME) + (this.lastUpdated == null ? 43 : this.lastUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.recordsWritten == null ? 43 : this.recordsWritten.hashCode());
        result =
                (result * PRIME)
                        + (this.bytesProcessed == null ? 43 : this.bytesProcessed.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.refTaskRunId == null ? 43 : this.refTaskRunId.hashCode());
        result = (result * PRIME) + (this.reRunType == null ? 43 : this.reRunType.hashCode());
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
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
