/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.servicemesh.model.*;
import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class GetWorkRequestConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GetWorkRequestConverter.class);

    public static com.oracle.bmc.servicemesh.requests.GetWorkRequestRequest interceptRequest(
            com.oracle.bmc.servicemesh.requests.GetWorkRequestRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.servicemesh.requests.GetWorkRequestRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210930")
                        .path("workRequests")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getWorkRequestId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

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
                    com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse>() {
                            @Override
                            public com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.servicemesh.model
                                                                .WorkRequest>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.servicemesh.model.WorkRequest
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.servicemesh.model.WorkRequest>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse.Builder
                                        builder =
                                                com.oracle.bmc.servicemesh.responses
                                                        .GetWorkRequestResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.workRequest(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        retryAfterHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "retry-after");
                                if (retryAfterHeader.isPresent()) {
                                    builder.retryAfter(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "retry-after",
                                                    retryAfterHeader.get().get(0),
                                                    Integer.class));
                                }

                                com.oracle.bmc.servicemesh.responses.GetWorkRequestResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
