/*
 * SOP Accelerator API
 * SOP Accelerator API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.worldpay.sop.accelerator.api;

import com.worldpay.sop.accelerator.model.Error;
import com.worldpay.sop.accelerator.model.ServiceResponse;
import com.worldpay.sop.accelerator.ApiClient;
import com.worldpay.sop.accelerator.api.HelloWorldApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static com.worldpay.sop.accelerator.GsonObjectMapper.gson;

/**
 * API tests for HelloWorldApi
 */
@Ignore
public class HelloWorldApiTest {

    private HelloWorldApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost"))).helloWorld();
    }

    /**
     * Hello World!
     */
    @Test
    public void shouldSee200AfterSayHello() {
        String version = null;
        String xWPDiagnosticCorrelationId = null;
        String xWPDiagnosticsCallerId = null;
        String xWPTimestamp = null;
        String xWPJwt = null;
        String responseType = null;
        api.sayHello()
                .versionPath(version)
                .xWPDiagnosticCorrelationIdHeader(xWPDiagnosticCorrelationId)
                .xWPDiagnosticsCallerIdHeader(xWPDiagnosticsCallerId)
                .xWPTimestampHeader(xWPTimestamp)
                .xWPJwtHeader(xWPJwt)
                .responseTypeQuery(responseType).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request validation error (one of the header is missing or empty or the &#39;responseType&#39; query parameter value is &#39;error&#39;) or REST versioning validation (invalid version value, a request field is missing in request or is not permited by selected version, the version header is missing or is duplicated).
     */
    @Test
    public void shouldSee400AfterSayHello() {
        String version = null;
        String xWPDiagnosticCorrelationId = null;
        String xWPDiagnosticsCallerId = null;
        String xWPTimestamp = null;
        String xWPJwt = null;
        String responseType = null;
        api.sayHello()
                .versionPath(version)
                .xWPDiagnosticCorrelationIdHeader(xWPDiagnosticCorrelationId)
                .xWPDiagnosticsCallerIdHeader(xWPDiagnosticsCallerId)
                .xWPTimestampHeader(xWPTimestamp)
                .xWPJwtHeader(xWPJwt)
                .responseTypeQuery(responseType).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Rest versioning validation failed with the following possible scenarios(operation not supported by server version or the version supplied is not supported by server).
     */
    @Test
    public void shouldSee404AfterSayHello() {
        String version = null;
        String xWPDiagnosticCorrelationId = null;
        String xWPDiagnosticsCallerId = null;
        String xWPTimestamp = null;
        String xWPJwt = null;
        String responseType = null;
        api.sayHello()
                .versionPath(version)
                .xWPDiagnosticCorrelationIdHeader(xWPDiagnosticCorrelationId)
                .xWPDiagnosticsCallerIdHeader(xWPDiagnosticsCallerId)
                .xWPTimestampHeader(xWPTimestamp)
                .xWPJwtHeader(xWPJwt)
                .responseTypeQuery(responseType).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * The &#39;responseType&#39; query parameter is different than &#39;success&#39;/ &#39;error&#39; values or inexistent environment variable in the system.
     */
    @Test
    public void shouldSee500AfterSayHello() {
        String version = null;
        String xWPDiagnosticCorrelationId = null;
        String xWPDiagnosticsCallerId = null;
        String xWPTimestamp = null;
        String xWPJwt = null;
        String responseType = null;
        api.sayHello()
                .versionPath(version)
                .xWPDiagnosticCorrelationIdHeader(xWPDiagnosticCorrelationId)
                .xWPDiagnosticsCallerIdHeader(xWPDiagnosticsCallerId)
                .xWPTimestampHeader(xWPTimestamp)
                .xWPJwtHeader(xWPJwt)
                .responseTypeQuery(responseType).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}