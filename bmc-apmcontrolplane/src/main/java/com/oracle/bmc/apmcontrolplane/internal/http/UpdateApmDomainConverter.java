/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.apmcontrolplane.model.*;
import com.oracle.bmc.apmcontrolplane.requests.*;
import com.oracle.bmc.apmcontrolplane.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateApmDomainConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UpdateApmDomainConverter.class);

    public static com.oracle.bmc.apmcontrolplane.requests.UpdateApmDomainRequest interceptRequest(
            com.oracle.bmc.apmcontrolplane.requests.UpdateApmDomainRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.apmcontrolplane.requests.UpdateApmDomainRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Validate.notNull(request.getUpdateApmDomainDetails(), "updateApmDomainDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("apmDomains")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getApmDomainId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

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
                    com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.apmcontrolplane.responses
                                        .UpdateApmDomainResponse>() {
                            @Override
                            public com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Void>>
                                        responseFn = RESPONSE_CONVERSION_FACTORY.create();

                                com.oracle.bmc.http.internal.WithHeaders<Void> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.apmcontrolplane.responses
                                                        .UpdateApmDomainResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcWorkRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-work-request-id");
                                if (opcWorkRequestIdHeader.isPresent()) {
                                    builder.opcWorkRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-work-request-id",
                                                    opcWorkRequestIdHeader.get().get(0),
                                                    String.class));
                                }

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

                                com.oracle.bmc.apmcontrolplane.responses.UpdateApmDomainResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
