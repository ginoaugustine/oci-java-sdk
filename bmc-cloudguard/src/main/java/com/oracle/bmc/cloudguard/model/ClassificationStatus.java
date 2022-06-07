/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Indicates the classification status of the Sighitng
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public enum ClassificationStatus {
    FalsePositive("FALSE_POSITIVE"),
    FalseNegative("FALSE_NEGATIVE"),
    TruePositive("TRUE_POSITIVE"),
    TrueNegative("TRUE_NEGATIVE"),
    NotClassified("NOT_CLASSIFIED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ClassificationStatus.class);

    private final String value;
    private static java.util.Map<String, ClassificationStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (ClassificationStatus v : ClassificationStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ClassificationStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ClassificationStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ClassificationStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
