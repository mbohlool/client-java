# CoreApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIVersions**](CoreApi.md#getAPIVersions) | **GET** /api/ | 


<a name="getAPIVersions"></a>
# **getAPIVersions**
> UnversionedAPIVersions getAPIVersions()



get available API versions

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.CoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

CoreApi apiInstance = new CoreApi();
try {
    UnversionedAPIVersions result = apiInstance.getAPIVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoreApi#getAPIVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnversionedAPIVersions**](UnversionedAPIVersions.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

