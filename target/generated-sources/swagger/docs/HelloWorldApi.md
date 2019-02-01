# HelloWorldApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayHello**](HelloWorldApi.md#sayHello) | **GET** /sopa/{version}/hello | Hello World Endpoint


<a name="sayHello"></a>
# **sayHello**
> ServiceResponse sayHello(version, xWPDiagnosticCorrelationId, xWPDiagnosticsCallerId, xWPTimestamp, xWPJwt, responseType)

Hello World Endpoint

Simple GET Operation that returns a JSON message with a simple payload. 

### Example
```java
// Import classes:
//import com.worldpay.sop.accelerator.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

HelloWorldApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost"))).helloWorld();

api.sayHello()
    .versionPath(version)
    .xWPDiagnosticCorrelationIdHeader(xWPDiagnosticCorrelationId)
    .xWPDiagnosticsCallerIdHeader(xWPDiagnosticsCallerId)
    .xWPTimestampHeader(xWPTimestamp)
    .xWPJwtHeader(xWPJwt)
    .responseTypeQuery(responseType).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| API Version |
 **xWPDiagnosticCorrelationId** | **String**| Correlation ID to trace the initial request |
 **xWPDiagnosticsCallerId** | **String**| X-WP-Diagnostics-CallerId |
 **xWPTimestamp** | **String**| X-WP-Timestamp |
 **xWPJwt** | **String**| The name of the header containing the JWT token which holds a set of entitlements or ‘claims’ associated with the authenticated Subject. |
 **responseType** | **String**| Response Type |

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

