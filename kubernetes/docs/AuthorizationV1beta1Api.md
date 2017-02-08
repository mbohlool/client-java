# AuthorizationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedLocalSubjectAccessReview**](AuthorizationV1beta1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createSelfSubjectAccessReview**](AuthorizationV1beta1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
[**createSubjectAccessReview**](AuthorizationV1beta1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
[**getAPIResources**](AuthorizationV1beta1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 


<a name="createNamespacedLocalSubjectAccessReview"></a>
# **createNamespacedLocalSubjectAccessReview**
> V1beta1LocalSubjectAccessReview createNamespacedLocalSubjectAccessReview(body, namespace, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1LocalSubjectAccessReview body = new V1beta1LocalSubjectAccessReview(); // V1beta1LocalSubjectAccessReview | 
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1LocalSubjectAccessReview result = apiInstance.createNamespacedLocalSubjectAccessReview(body, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createNamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1LocalSubjectAccessReview**](V1beta1LocalSubjectAccessReview.md)|  |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1LocalSubjectAccessReview**](V1beta1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSelfSubjectAccessReview"></a>
# **createSelfSubjectAccessReview**
> V1beta1SelfSubjectAccessReview createSelfSubjectAccessReview(body, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1SelfSubjectAccessReview body = new V1beta1SelfSubjectAccessReview(); // V1beta1SelfSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1SelfSubjectAccessReview result = apiInstance.createSelfSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createSelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1SelfSubjectAccessReview**](V1beta1SelfSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1SelfSubjectAccessReview**](V1beta1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createSubjectAccessReview"></a>
# **createSubjectAccessReview**
> V1beta1SubjectAccessReview createSubjectAccessReview(body, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
V1beta1SubjectAccessReview body = new V1beta1SubjectAccessReview(); // V1beta1SubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1SubjectAccessReview result = apiInstance.createSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1beta1SubjectAccessReview**](V1beta1SubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1SubjectAccessReview**](V1beta1SubjectAccessReview.md)

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
//import io.kubernetes.java.apis.AuthorizationV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
try {
    UnversionedAPIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#getAPIResources");
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

