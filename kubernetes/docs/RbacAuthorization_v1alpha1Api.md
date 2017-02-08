# RbacAuthorization_v1alpha1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterRole**](RbacAuthorization_v1alpha1Api.md#createClusterRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
[**createClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#createClusterRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
[**createNamespacedRole**](RbacAuthorization_v1alpha1Api.md#createNamespacedRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
[**createNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#createNamespacedRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
[**deleteClusterRole**](RbacAuthorization_v1alpha1Api.md#deleteClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
[**deleteClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#deleteClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
[**deleteCollectionClusterRole**](RbacAuthorization_v1alpha1Api.md#deleteCollectionClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
[**deleteCollectionClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#deleteCollectionClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
[**deleteCollectionNamespacedRole**](RbacAuthorization_v1alpha1Api.md#deleteCollectionNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
[**deleteCollectionNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#deleteCollectionNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
[**deleteNamespacedRole**](RbacAuthorization_v1alpha1Api.md#deleteNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
[**deleteNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#deleteNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
[**getAPIResources**](RbacAuthorization_v1alpha1Api.md#getAPIResources) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/ | 
[**listClusterRole**](RbacAuthorization_v1alpha1Api.md#listClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
[**listClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#listClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
[**listNamespacedRole**](RbacAuthorization_v1alpha1Api.md#listNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
[**listNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#listNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
[**listRoleBindingForAllNamespaces**](RbacAuthorization_v1alpha1Api.md#listRoleBindingForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/rolebindings | 
[**listRoleForAllNamespaces**](RbacAuthorization_v1alpha1Api.md#listRoleForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/roles | 
[**patchClusterRole**](RbacAuthorization_v1alpha1Api.md#patchClusterRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
[**patchClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#patchClusterRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
[**patchNamespacedRole**](RbacAuthorization_v1alpha1Api.md#patchNamespacedRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
[**patchNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#patchNamespacedRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
[**readClusterRole**](RbacAuthorization_v1alpha1Api.md#readClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
[**readClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#readClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
[**readNamespacedRole**](RbacAuthorization_v1alpha1Api.md#readNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
[**readNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#readNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
[**replaceClusterRole**](RbacAuthorization_v1alpha1Api.md#replaceClusterRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
[**replaceClusterRoleBinding**](RbacAuthorization_v1alpha1Api.md#replaceClusterRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
[**replaceNamespacedRole**](RbacAuthorization_v1alpha1Api.md#replaceNamespacedRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
[**replaceNamespacedRoleBinding**](RbacAuthorization_v1alpha1Api.md#replaceNamespacedRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 


<a name="createClusterRole"></a>
# **createClusterRole**
> V1alpha1ClusterRole createClusterRole(body, pretty)



create a ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
V1alpha1ClusterRole body = new V1alpha1ClusterRole(); // V1alpha1ClusterRole | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRole result = apiInstance.createClusterRole(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#createClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createClusterRoleBinding"></a>
# **createClusterRoleBinding**
> V1alpha1ClusterRoleBinding createClusterRoleBinding(body, pretty)



create a ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
V1alpha1ClusterRoleBinding body = new V1alpha1ClusterRoleBinding(); // V1alpha1ClusterRoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRoleBinding result = apiInstance.createClusterRoleBinding(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#createClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createNamespacedRole"></a>
# **createNamespacedRole**
> V1alpha1Role createNamespacedRole(namespace, body, pretty)



create a Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1alpha1Role body = new V1alpha1Role(); // V1alpha1Role | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1Role result = apiInstance.createNamespacedRole(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#createNamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1alpha1Role**](V1alpha1Role.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1Role**](V1alpha1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createNamespacedRoleBinding"></a>
# **createNamespacedRoleBinding**
> V1alpha1RoleBinding createNamespacedRoleBinding(namespace, body, pretty)



create a RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1alpha1RoleBinding body = new V1alpha1RoleBinding(); // V1alpha1RoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1RoleBinding result = apiInstance.createNamespacedRoleBinding(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#createNamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteClusterRole"></a>
# **deleteClusterRole**
> UnversionedStatus deleteClusterRole(name, body, pretty, gracePeriodSeconds, orphanDependents)



delete a ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRole
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteClusterRole(name, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
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

<a name="deleteClusterRoleBinding"></a>
# **deleteClusterRoleBinding**
> UnversionedStatus deleteClusterRoleBinding(name, body, pretty, gracePeriodSeconds, orphanDependents)



delete a ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteClusterRoleBinding(name, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
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

<a name="deleteCollectionClusterRole"></a>
# **deleteCollectionClusterRole**
> UnversionedStatus deleteCollectionClusterRole(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionClusterRole(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteCollectionClusterRole");
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

<a name="deleteCollectionClusterRoleBinding"></a>
# **deleteCollectionClusterRoleBinding**
> UnversionedStatus deleteCollectionClusterRoleBinding(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionClusterRoleBinding(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteCollectionClusterRoleBinding");
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

<a name="deleteCollectionNamespacedRole"></a>
# **deleteCollectionNamespacedRole**
> UnversionedStatus deleteCollectionNamespacedRole(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionNamespacedRole(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteCollectionNamespacedRole");
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

<a name="deleteCollectionNamespacedRoleBinding"></a>
# **deleteCollectionNamespacedRoleBinding**
> UnversionedStatus deleteCollectionNamespacedRoleBinding(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    UnversionedStatus result = apiInstance.deleteCollectionNamespacedRoleBinding(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteCollectionNamespacedRoleBinding");
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

<a name="deleteNamespacedRole"></a>
# **deleteNamespacedRole**
> UnversionedStatus deleteNamespacedRole(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents)



delete a Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteNamespacedRole(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteNamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
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

<a name="deleteNamespacedRoleBinding"></a>
# **deleteNamespacedRoleBinding**
> UnversionedStatus deleteNamespacedRoleBinding(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents)



delete a RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1DeleteOptions body = new V1DeleteOptions(); // V1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list.
try {
    UnversionedStatus result = apiInstance.deleteNamespacedRoleBinding(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#deleteNamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
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
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
try {
    UnversionedAPIResourceList result = apiInstance.getAPIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#getAPIResources");
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

<a name="listClusterRole"></a>
# **listClusterRole**
> V1alpha1ClusterRoleList listClusterRole(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1ClusterRoleList result = apiInstance.listClusterRole(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listClusterRole");
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

[**V1alpha1ClusterRoleList**](V1alpha1ClusterRoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listClusterRoleBinding"></a>
# **listClusterRoleBinding**
> V1alpha1ClusterRoleBindingList listClusterRoleBinding(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1ClusterRoleBindingList result = apiInstance.listClusterRoleBinding(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listClusterRoleBinding");
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

[**V1alpha1ClusterRoleBindingList**](V1alpha1ClusterRoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedRole"></a>
# **listNamespacedRole**
> V1alpha1RoleList listNamespacedRole(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1RoleList result = apiInstance.listNamespacedRole(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listNamespacedRole");
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

[**V1alpha1RoleList**](V1alpha1RoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listNamespacedRoleBinding"></a>
# **listNamespacedRoleBinding**
> V1alpha1RoleBindingList listNamespacedRoleBinding(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1RoleBindingList result = apiInstance.listNamespacedRoleBinding(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listNamespacedRoleBinding");
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

[**V1alpha1RoleBindingList**](V1alpha1RoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRoleBindingForAllNamespaces"></a>
# **listRoleBindingForAllNamespaces**
> V1alpha1RoleBindingList listRoleBindingForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1RoleBindingList result = apiInstance.listRoleBindingForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listRoleBindingForAllNamespaces");
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

[**V1alpha1RoleBindingList**](V1alpha1RoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRoleForAllNamespaces"></a>
# **listRoleForAllNamespaces**
> V1alpha1RoleList listRoleForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    V1alpha1RoleList result = apiInstance.listRoleForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#listRoleForAllNamespaces");
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

[**V1alpha1RoleList**](V1alpha1RoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchClusterRole"></a>
# **patchClusterRole**
> V1alpha1ClusterRole patchClusterRole(name, body, pretty)



partially update the specified ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRole
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRole result = apiInstance.patchClusterRole(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#patchClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchClusterRoleBinding"></a>
# **patchClusterRoleBinding**
> V1alpha1ClusterRoleBinding patchClusterRoleBinding(name, body, pretty)



partially update the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRoleBinding result = apiInstance.patchClusterRoleBinding(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#patchClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedRole"></a>
# **patchNamespacedRole**
> V1alpha1Role patchNamespacedRole(name, namespace, body, pretty)



partially update the specified Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1Role result = apiInstance.patchNamespacedRole(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#patchNamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1Role**](V1alpha1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchNamespacedRoleBinding"></a>
# **patchNamespacedRoleBinding**
> V1alpha1RoleBinding patchNamespacedRoleBinding(name, namespace, body, pretty)



partially update the specified RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
UnversionedPatch body = new UnversionedPatch(); // UnversionedPatch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1RoleBinding result = apiInstance.patchNamespacedRoleBinding(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#patchNamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**UnversionedPatch**](UnversionedPatch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readClusterRole"></a>
# **readClusterRole**
> V1alpha1ClusterRole readClusterRole(name, pretty)



read the specified ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRole
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRole result = apiInstance.readClusterRole(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#readClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readClusterRoleBinding"></a>
# **readClusterRoleBinding**
> V1alpha1ClusterRoleBinding readClusterRoleBinding(name, pretty)



read the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRoleBinding result = apiInstance.readClusterRoleBinding(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#readClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedRole"></a>
# **readNamespacedRole**
> V1alpha1Role readNamespacedRole(name, namespace, pretty)



read the specified Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1Role result = apiInstance.readNamespacedRole(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#readNamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1Role**](V1alpha1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readNamespacedRoleBinding"></a>
# **readNamespacedRoleBinding**
> V1alpha1RoleBinding readNamespacedRoleBinding(name, namespace, pretty)



read the specified RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1RoleBinding result = apiInstance.readNamespacedRoleBinding(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#readNamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceClusterRole"></a>
# **replaceClusterRole**
> V1alpha1ClusterRole replaceClusterRole(name, body, pretty)



replace the specified ClusterRole

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRole
V1alpha1ClusterRole body = new V1alpha1ClusterRole(); // V1alpha1ClusterRole | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRole result = apiInstance.replaceClusterRole(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#replaceClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **body** | [**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRole**](V1alpha1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceClusterRoleBinding"></a>
# **replaceClusterRoleBinding**
> V1alpha1ClusterRoleBinding replaceClusterRoleBinding(name, body, pretty)



replace the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
V1alpha1ClusterRoleBinding body = new V1alpha1ClusterRoleBinding(); // V1alpha1ClusterRoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1ClusterRoleBinding result = apiInstance.replaceClusterRoleBinding(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#replaceClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **body** | [**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1ClusterRoleBinding**](V1alpha1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedRole"></a>
# **replaceNamespacedRole**
> V1alpha1Role replaceNamespacedRole(name, namespace, body, pretty)



replace the specified Role

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1alpha1Role body = new V1alpha1Role(); // V1alpha1Role | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1Role result = apiInstance.replaceNamespacedRole(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#replaceNamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1alpha1Role**](V1alpha1Role.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1Role**](V1alpha1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceNamespacedRoleBinding"></a>
# **replaceNamespacedRoleBinding**
> V1alpha1RoleBinding replaceNamespacedRoleBinding(name, namespace, body, pretty)



replace the specified RoleBinding

### Example
```java
// Import classes:
//import io.kubernetes.java.ApiClient;
//import io.kubernetes.java.ApiException;
//import io.kubernetes.java.Configuration;
//import io.kubernetes.java.auth.*;
//import io.kubernetes.java.apis.RbacAuthorization_v1alpha1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

RbacAuthorization_v1alpha1Api apiInstance = new RbacAuthorization_v1alpha1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
V1alpha1RoleBinding body = new V1alpha1RoleBinding(); // V1alpha1RoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    V1alpha1RoleBinding result = apiInstance.replaceNamespacedRoleBinding(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorization_v1alpha1Api#replaceNamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**V1alpha1RoleBinding**](V1alpha1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

