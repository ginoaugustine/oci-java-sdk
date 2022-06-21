/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.resourcemanager.model.*;
import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class GetJobDetailedLogContentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetJobDetailedLogContentConverter.class);

    public static com.oracle.bmc.resourcemanager.requests.GetJobDetailedLogContentRequest
            interceptRequest(
                    com.oracle.bmc.resourcemanager.requests.GetJobDetailedLogContentRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.resourcemanager.requests.GetJobDetailedLogContentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180917")
                        .path("jobs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getJobId()))
                        .path("detailedLogContent");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.resourcemanager.responses.GetJobDetailedLogContentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.resourcemanager.responses.GetJobDetailedLogContentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.resourcemanager.responses
                                        .GetJobDetailedLogContentResponse>() {
                            @Override
                            public com.oracle.bmc.resourcemanager.responses
                                            .GetJobDetailedLogContentResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.resourcemanager.responses.GetJobDetailedLogContentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<String>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(String.class);

                                com.oracle.bmc.http.internal.WithHeaders<String> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.resourcemanager.responses
                                                .GetJobDetailedLogContentResponse.Builder
                                        builder =
                                                com.oracle.bmc.resourcemanager.responses
                                                        .GetJobDetailedLogContentResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.value(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.resourcemanager.responses
                                                .GetJobDetailedLogContentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
