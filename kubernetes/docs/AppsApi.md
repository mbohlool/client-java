# AppsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIGroup**](AppsApi.md#getAPIGroup) | **GET** /apis/apps/ | 


<a name="getAPIGroup"></a>
# **getAPIGroup**
> UnversionedAPIGroup getAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsApi apiInstance = new AppsApi();
try {
    UnversionedAPIGroup result = apiInstance.getAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAPIGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnversionedAPIGroup**](UnversionedAPIGroup.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

