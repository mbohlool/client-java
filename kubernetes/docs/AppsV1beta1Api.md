# AppsV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedStatefulSet**](AppsV1beta1Api.md#createNamespacedStatefulSet) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**deleteCollectionNamespacedStatefulSet**](AppsV1beta1Api.md#deleteCollectionNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**deleteNamespacedStatefulSet**](AppsV1beta1Api.md#deleteNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**getAPIResources**](AppsV1beta1Api.md#getAPIResources) | **GET** /apis/apps/v1beta1/ | 
[**listNamespacedStatefulSet**](AppsV1beta1Api.md#listNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
[**listStatefulSetForAllNamespaces**](AppsV1beta1Api.md#listStatefulSetForAllNamespaces) | **GET** /apis/apps/v1beta1/statefulsets | 
[**patchNamespacedStatefulSet**](AppsV1beta1Api.md#patchNamespacedStatefulSet) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**patchNamespacedStatefulSetStatus**](AppsV1beta1Api.md#patchNamespacedStatefulSetStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
[**readNamespacedStatefulSet**](AppsV1beta1Api.md#readNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**readNamespacedStatefulSetStatus**](AppsV1beta1Api.md#readNamespacedStatefulSetStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
[**replaceNamespacedStatefulSet**](AppsV1beta1Api.md#replaceNamespacedStatefulSet) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
[**replaceNamespacedStatefulSetStatus**](AppsV1beta1Api.md#replaceNamespacedStatefulSetStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 


<a name="createNamespacedStatefulSet"></a>
# **createNamespacedStatefulSet**
> V1beta1StatefulSet createNamespacedStatefulSet(namespace, body, pretty)



create a StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.createNamespacedStatefulSet(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#createNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCollectionNamespacedStatefulSet"></a>
# **deleteCollectionNamespacedStatefulSet**
> UnversionedStatus deleteCollectionNamespacedStatefulSet(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionNamespacedStatefulSet(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteCollectionNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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

<a name="deleteNamespacedStatefulSet"></a>
# **deleteNamespacedStatefulSet**
> UnversionedStatus deleteNamespacedStatefulSet(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents)



delete a StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteNamespacedStatefulSet(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#deleteNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
try {
    UnversionedAPIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#getAPIResources");
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

<a name="listNamespacedStatefulSet"></a>
# **listNamespacedStatefulSet**
> V1beta1StatefulSetList listNamespacedStatefulSet(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1StatefulSetList result = apiInstance.listNamespacedStatefulSet(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1StatefulSetList**](V1beta1StatefulSetList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listStatefulSetForAllNamespaces"></a>
# **listStatefulSetForAllNamespaces**
> V1beta1StatefulSetList listStatefulSetForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1beta1StatefulSetList result = apiInstance.listStatefulSetForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#listStatefulSetForAllNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**V1beta1StatefulSetList**](V1beta1StatefulSetList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchNamespacedStatefulSet"></a>
# **patchNamespacedStatefulSet**
> V1beta1StatefulSet patchNamespacedStatefulSet(name, namespace, body, pretty)



partially update the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.patchNamespacedStatefulSet(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedStatefulSetStatus"></a>
# **patchNamespacedStatefulSetStatus**
> V1beta1StatefulSet patchNamespacedStatefulSetStatus(name, namespace, body, pretty)



partially update status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.patchNamespacedStatefulSetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#patchNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedStatefulSet"></a>
# **readNamespacedStatefulSet**
> V1beta1StatefulSet readNamespacedStatefulSet(name, namespace, pretty, exact, export)



read the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    V1beta1StatefulSet result = apiInstance.readNamespacedStatefulSet(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39; | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedStatefulSetStatus"></a>
# **readNamespacedStatefulSetStatus**
> V1beta1StatefulSet readNamespacedStatefulSetStatus(name, namespace, pretty)



read status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.readNamespacedStatefulSetStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#readNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedStatefulSet"></a>
# **replaceNamespacedStatefulSet**
> V1beta1StatefulSet replaceNamespacedStatefulSet(name, namespace, body, pretty)



replace the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.replaceNamespacedStatefulSet(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedStatefulSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedStatefulSetStatus"></a>
# **replaceNamespacedStatefulSetStatus**
> V1beta1StatefulSet replaceNamespacedStatefulSetStatus(name, namespace, body, pretty)



replace status of the specified StatefulSet

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.AppsV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AppsV1beta1Api apiInstance = new AppsV1beta1Api();
String name = "name_example"; // String | name of the StatefulSet
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1beta1StatefulSet body = new V1beta1StatefulSet(); // V1beta1StatefulSet | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1beta1StatefulSet result = apiInstance.replaceNamespacedStatefulSetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsV1beta1Api#replaceNamespacedStatefulSetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StatefulSet |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1beta1StatefulSet**](V1beta1StatefulSet.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1beta1StatefulSet**](V1beta1StatefulSet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

