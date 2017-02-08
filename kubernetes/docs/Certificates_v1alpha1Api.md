# Certificates_v1alpha1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCertificateSigningRequest**](Certificates_v1alpha1Api.md#createCertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
[**deleteCertificateSigningRequest**](Certificates_v1alpha1Api.md#deleteCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
[**deleteCollectionCertificateSigningRequest**](Certificates_v1alpha1Api.md#deleteCollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
[**getAPIResources**](Certificates_v1alpha1Api.md#getAPIResources) | **GET** /apis/certificates.k8s.io/v1alpha1/ | 
[**listCertificateSigningRequest**](Certificates_v1alpha1Api.md#listCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
[**patchCertificateSigningRequest**](Certificates_v1alpha1Api.md#patchCertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
[**readCertificateSigningRequest**](Certificates_v1alpha1Api.md#readCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
[**replaceCertificateSigningRequest**](Certificates_v1alpha1Api.md#replaceCertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
[**replaceCertificateSigningRequestApproval**](Certificates_v1alpha1Api.md#replaceCertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/approval | 
[**replaceCertificateSigningRequestStatus**](Certificates_v1alpha1Api.md#replaceCertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/status | 


<a name="createCertificateSigningRequest"></a>
# **createCertificateSigningRequest**
> V1alpha1CertificateSigningRequest createCertificateSigningRequest(body, pretty)



create a CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
V1alpha1CertificateSigningRequest body = new V1alpha1CertificateSigningRequest(); // V1alpha1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.createCertificateSigningRequest(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#createCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCertificateSigningRequest"></a>
# **deleteCertificateSigningRequest**
> UnversionedStatus deleteCertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents)



delete a CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteCertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#deleteCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**V1DeleteOptions**](V1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. | [optional]

### Return type

[**UnversionedStatus**](UnversionedStatus.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionCertificateSigningRequest"></a>
# **deleteCollectionCertificateSigningRequest**
> UnversionedStatus deleteCollectionCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#deleteCollectionCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**UnversionedStatus**](UnversionedStatus.md)

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
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
try {
    UnversionedAPIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#getAPIResources");
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

<a name="listCertificateSigningRequest"></a>
# **listCertificateSigningRequest**
> V1alpha1CertificateSigningRequestList listCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1CertificateSigningRequestList result = apiInstance.listCertificateSigningRequest(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#listCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1alpha1CertificateSigningRequestList**](V1alpha1CertificateSigningRequestList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchCertificateSigningRequest"></a>
# **patchCertificateSigningRequest**
> V1alpha1CertificateSigningRequest patchCertificateSigningRequest(name, body, pretty)



partially update the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.patchCertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#patchCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readCertificateSigningRequest"></a>
# **readCertificateSigningRequest**
> V1alpha1CertificateSigningRequest readCertificateSigningRequest(name, pretty, exact, export)



read the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.readCertificateSigningRequest(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#readCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39; | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequest"></a>
# **replaceCertificateSigningRequest**
> V1alpha1CertificateSigningRequest replaceCertificateSigningRequest(name, body, pretty)



replace the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
V1alpha1CertificateSigningRequest body = new V1alpha1CertificateSigningRequest(); // V1alpha1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#replaceCertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequestApproval"></a>
# **replaceCertificateSigningRequestApproval**
> V1alpha1CertificateSigningRequest replaceCertificateSigningRequestApproval(body, name, pretty)



replace approval of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
V1alpha1CertificateSigningRequest body = new V1alpha1CertificateSigningRequest(); // V1alpha1CertificateSigningRequest | 
String name = "name_example"; // String | name of the CertificateSigningRequest
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequestApproval(body, name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#replaceCertificateSigningRequestApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)|  |
 **name** | **String**| name of the CertificateSigningRequest |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificateSigningRequestStatus"></a>
# **replaceCertificateSigningRequestStatus**
> V1alpha1CertificateSigningRequest replaceCertificateSigningRequestStatus(body, name, pretty)



replace status of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.Certificates_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

Certificates_v1alpha1Api apiInstance = new Certificates_v1alpha1Api();
V1alpha1CertificateSigningRequest body = new V1alpha1CertificateSigningRequest(); // V1alpha1CertificateSigningRequest | 
String name = "name_example"; // String | name of the CertificateSigningRequest
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1CertificateSigningRequest result = apiInstance.replaceCertificateSigningRequestStatus(body, name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Certificates_v1alpha1Api#replaceCertificateSigningRequestStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)|  |
 **name** | **String**| name of the CertificateSigningRequest |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1CertificateSigningRequest**](V1alpha1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

