/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Model provenance gives data scientists information about the origin of their model. This information allows data scientists to reproduce the development environment in which the model was trained.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateModelProvenanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateModelProvenanceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "repositoryUrl",
        "gitBranch",
        "gitCommit",
        "scriptDir",
        "trainingScript",
        "trainingId"
    })
    public UpdateModelProvenanceDetails(
            String repositoryUrl,
            String gitBranch,
            String gitCommit,
            String scriptDir,
            String trainingScript,
            String trainingId) {
        super();
        this.repositoryUrl = repositoryUrl;
        this.gitBranch = gitBranch;
        this.gitCommit = gitCommit;
        this.scriptDir = scriptDir;
        this.trainingScript = trainingScript;
        this.trainingId = trainingId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gitBranch")
        private String gitBranch;

        public Builder gitBranch(String gitBranch) {
            this.gitBranch = gitBranch;
            this.__explicitlySet__.add("gitBranch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gitCommit")
        private String gitCommit;

        public Builder gitCommit(String gitCommit) {
            this.gitCommit = gitCommit;
            this.__explicitlySet__.add("gitCommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptDir")
        private String scriptDir;

        public Builder scriptDir(String scriptDir) {
            this.scriptDir = scriptDir;
            this.__explicitlySet__.add("scriptDir");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingScript")
        private String trainingScript;

        public Builder trainingScript(String trainingScript) {
            this.trainingScript = trainingScript;
            this.__explicitlySet__.add("trainingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingId")
        private String trainingId;

        public Builder trainingId(String trainingId) {
            this.trainingId = trainingId;
            this.__explicitlySet__.add("trainingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModelProvenanceDetails build() {
            UpdateModelProvenanceDetails __instance__ =
                    new UpdateModelProvenanceDetails(
                            repositoryUrl,
                            gitBranch,
                            gitCommit,
                            scriptDir,
                            trainingScript,
                            trainingId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelProvenanceDetails o) {
            Builder copiedBuilder =
                    repositoryUrl(o.getRepositoryUrl())
                            .gitBranch(o.getGitBranch())
                            .gitCommit(o.getGitCommit())
                            .scriptDir(o.getScriptDir())
                            .trainingScript(o.getTrainingScript())
                            .trainingId(o.getTrainingId());

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
     * For model reproducibility purposes. URL of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * For model reproducibility purposes. Branch of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gitBranch")
    private final String gitBranch;

    public String getGitBranch() {
        return gitBranch;
    }

    /**
     * For model reproducibility purposes. Commit ID of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gitCommit")
    private final String gitCommit;

    public String getGitCommit() {
        return gitCommit;
    }

    /**
     * For model reproducibility purposes. Path to model artifacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptDir")
    private final String scriptDir;

    public String getScriptDir() {
        return scriptDir;
    }

    /**
     * For model reproducibility purposes. Path to the python script or notebook in which the model was trained."
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingScript")
    private final String trainingScript;

    public String getTrainingScript() {
        return trainingScript;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a training session(Job or NotebookSession) in which the model was trained. It is used for model reproducibility purposes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingId")
    private final String trainingId;

    public String getTrainingId() {
        return trainingId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateModelProvenanceDetails(");
        sb.append("repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", gitBranch=").append(String.valueOf(this.gitBranch));
        sb.append(", gitCommit=").append(String.valueOf(this.gitCommit));
        sb.append(", scriptDir=").append(String.valueOf(this.scriptDir));
        sb.append(", trainingScript=").append(String.valueOf(this.trainingScript));
        sb.append(", trainingId=").append(String.valueOf(this.trainingId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelProvenanceDetails)) {
            return false;
        }

        UpdateModelProvenanceDetails other = (UpdateModelProvenanceDetails) o;
        return java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.gitBranch, other.gitBranch)
                && java.util.Objects.equals(this.gitCommit, other.gitCommit)
                && java.util.Objects.equals(this.scriptDir, other.scriptDir)
                && java.util.Objects.equals(this.trainingScript, other.trainingScript)
                && java.util.Objects.equals(this.trainingId, other.trainingId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.gitBranch == null ? 43 : this.gitBranch.hashCode());
        result = (result * PRIME) + (this.gitCommit == null ? 43 : this.gitCommit.hashCode());
        result = (result * PRIME) + (this.scriptDir == null ? 43 : this.scriptDir.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingScript == null ? 43 : this.trainingScript.hashCode());
        result = (result * PRIME) + (this.trainingId == null ? 43 : this.trainingId.hashCode());
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
