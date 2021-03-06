# Authentication_v1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenReview**](Authentication_v1beta1Api.md#createTokenReview) | **POST** /apis/authentication.k8s.io/v1beta1/tokenreviews | 
[**getAPIResources**](Authentication_v1beta1Api.md#getAPIResources) | **GET** /apis/authentication.k8s.io/v1beta1/ | 


<a name="createTokenReview"></a>
# **createTokenReview**
> V1beta1TokenReview createTokenReview(body, pretty)



create a TokenReview

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Authentication_v1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Authentication_v1beta1Api apiInstance = new Authentication_v1beta1Api();
V1beta1TokenReview body = new V1beta1TokenReview(); // V1beta1TokenReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1TokenReview result = apiInstance.createTokenReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Authentication_v1beta1Api#createTokenReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1TokenReview**](V1beta1TokenReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1TokenReview**](V1beta1TokenReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAPIResources"></a>
# **getAPIResources**
> UnversionedAPIResourceList getAPIResources()



get available resources

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Authentication_v1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Authentication_v1beta1Api apiInstance = new Authentication_v1beta1Api();
try {
    UnversionedAPIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Authentication_v1beta1Api#getAPIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnversionedAPIResourceList**](UnversionedAPIResourceList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

