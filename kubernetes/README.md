# client.java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client.java</artifactId>
    <version>1.0-snapshot</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.kubernetes:client.java:1.0-snapshot"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client.java-1.0-snapshot.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.kubernetes.java.*;
import io.kubernetes.java.auth.*;
import io.kubernetes.java.models.*;
import io.kubernetes.java.apis.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: BearerToken
        ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
        BearerToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //BearerToken.setApiKeyPrefix("Token");

        ApisApi apiInstance = new ApisApi();
        try {
            UnversionedAPIGroupList result = apiInstance.getAPIVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#getAPIVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**getAPIVersions**](docs/ApisApi.md#getAPIVersions) | **GET** /apis/ | 
*AppsApi* | [**getAPIGroup**](docs/AppsApi.md#getAPIGroup) | **GET** /apis/apps/ | 
*Apps_v1beta1Api* | [**createNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#createNamespacedStatefulSet) | **POST** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*Apps_v1beta1Api* | [**deleteCollectionNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#deleteCollectionNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*Apps_v1beta1Api* | [**deleteNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#deleteNamespacedStatefulSet) | **DELETE** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*Apps_v1beta1Api* | [**getAPIResources**](docs/Apps_v1beta1Api.md#getAPIResources) | **GET** /apis/apps/v1beta1/ | 
*Apps_v1beta1Api* | [**listNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#listNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets | 
*Apps_v1beta1Api* | [**listStatefulSetForAllNamespaces**](docs/Apps_v1beta1Api.md#listStatefulSetForAllNamespaces) | **GET** /apis/apps/v1beta1/statefulsets | 
*Apps_v1beta1Api* | [**patchNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#patchNamespacedStatefulSet) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*Apps_v1beta1Api* | [**patchNamespacedStatefulSetStatus**](docs/Apps_v1beta1Api.md#patchNamespacedStatefulSetStatus) | **PATCH** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*Apps_v1beta1Api* | [**readNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#readNamespacedStatefulSet) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*Apps_v1beta1Api* | [**readNamespacedStatefulSetStatus**](docs/Apps_v1beta1Api.md#readNamespacedStatefulSetStatus) | **GET** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*Apps_v1beta1Api* | [**replaceNamespacedStatefulSet**](docs/Apps_v1beta1Api.md#replaceNamespacedStatefulSet) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name} | 
*Apps_v1beta1Api* | [**replaceNamespacedStatefulSetStatus**](docs/Apps_v1beta1Api.md#replaceNamespacedStatefulSetStatus) | **PUT** /apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status | 
*AuthenticationApi* | [**getAPIGroup**](docs/AuthenticationApi.md#getAPIGroup) | **GET** /apis/authentication.k8s.io/ | 
*Authentication_v1beta1Api* | [**createTokenReview**](docs/Authentication_v1beta1Api.md#createTokenReview) | **POST** /apis/authentication.k8s.io/v1beta1/tokenreviews | 
*Authentication_v1beta1Api* | [**getAPIResources**](docs/Authentication_v1beta1Api.md#getAPIResources) | **GET** /apis/authentication.k8s.io/v1beta1/ | 
*AuthorizationApi* | [**getAPIGroup**](docs/AuthorizationApi.md#getAPIGroup) | **GET** /apis/authorization.k8s.io/ | 
*Authorization_v1beta1Api* | [**createNamespacedLocalSubjectAccessReview**](docs/Authorization_v1beta1Api.md#createNamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
*Authorization_v1beta1Api* | [**createSelfSubjectAccessReview**](docs/Authorization_v1beta1Api.md#createSelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
*Authorization_v1beta1Api* | [**createSubjectAccessReview**](docs/Authorization_v1beta1Api.md#createSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
*Authorization_v1beta1Api* | [**getAPIResources**](docs/Authorization_v1beta1Api.md#getAPIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 
*AutoscalingApi* | [**getAPIGroup**](docs/AutoscalingApi.md#getAPIGroup) | **GET** /apis/autoscaling/ | 
*Autoscaling_v1Api* | [**createNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#createNamespacedHorizontalPodAutoscaler) | **POST** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*Autoscaling_v1Api* | [**deleteCollectionNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#deleteCollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*Autoscaling_v1Api* | [**deleteNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#deleteNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Autoscaling_v1Api* | [**getAPIResources**](docs/Autoscaling_v1Api.md#getAPIResources) | **GET** /apis/autoscaling/v1/ | 
*Autoscaling_v1Api* | [**listHorizontalPodAutoscalerForAllNamespaces**](docs/Autoscaling_v1Api.md#listHorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/autoscaling/v1/horizontalpodautoscalers | 
*Autoscaling_v1Api* | [**listNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#listNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*Autoscaling_v1Api* | [**patchNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#patchNamespacedHorizontalPodAutoscaler) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Autoscaling_v1Api* | [**patchNamespacedHorizontalPodAutoscalerStatus**](docs/Autoscaling_v1Api.md#patchNamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*Autoscaling_v1Api* | [**readNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#readNamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Autoscaling_v1Api* | [**readNamespacedHorizontalPodAutoscalerStatus**](docs/Autoscaling_v1Api.md#readNamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*Autoscaling_v1Api* | [**replaceNamespacedHorizontalPodAutoscaler**](docs/Autoscaling_v1Api.md#replaceNamespacedHorizontalPodAutoscaler) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Autoscaling_v1Api* | [**replaceNamespacedHorizontalPodAutoscalerStatus**](docs/Autoscaling_v1Api.md#replaceNamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*BatchApi* | [**getAPIGroup**](docs/BatchApi.md#getAPIGroup) | **GET** /apis/batch/ | 
*Batch_v1Api* | [**createNamespacedJob**](docs/Batch_v1Api.md#createNamespacedJob) | **POST** /apis/batch/v1/namespaces/{namespace}/jobs | 
*Batch_v1Api* | [**deleteCollectionNamespacedJob**](docs/Batch_v1Api.md#deleteCollectionNamespacedJob) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs | 
*Batch_v1Api* | [**deleteNamespacedJob**](docs/Batch_v1Api.md#deleteNamespacedJob) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*Batch_v1Api* | [**getAPIResources**](docs/Batch_v1Api.md#getAPIResources) | **GET** /apis/batch/v1/ | 
*Batch_v1Api* | [**listJobForAllNamespaces**](docs/Batch_v1Api.md#listJobForAllNamespaces) | **GET** /apis/batch/v1/jobs | 
*Batch_v1Api* | [**listNamespacedJob**](docs/Batch_v1Api.md#listNamespacedJob) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs | 
*Batch_v1Api* | [**patchNamespacedJob**](docs/Batch_v1Api.md#patchNamespacedJob) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*Batch_v1Api* | [**patchNamespacedJobStatus**](docs/Batch_v1Api.md#patchNamespacedJobStatus) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v1Api* | [**readNamespacedJob**](docs/Batch_v1Api.md#readNamespacedJob) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*Batch_v1Api* | [**readNamespacedJobStatus**](docs/Batch_v1Api.md#readNamespacedJobStatus) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v1Api* | [**replaceNamespacedJob**](docs/Batch_v1Api.md#replaceNamespacedJob) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*Batch_v1Api* | [**replaceNamespacedJobStatus**](docs/Batch_v1Api.md#replaceNamespacedJobStatus) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v2alpha1Api* | [**createNamespacedCronJob**](docs/Batch_v2alpha1Api.md#createNamespacedCronJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*Batch_v2alpha1Api* | [**createNamespacedJob**](docs/Batch_v2alpha1Api.md#createNamespacedJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*Batch_v2alpha1Api* | [**createNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#createNamespacedScheduledJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*Batch_v2alpha1Api* | [**deleteCollectionNamespacedCronJob**](docs/Batch_v2alpha1Api.md#deleteCollectionNamespacedCronJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*Batch_v2alpha1Api* | [**deleteCollectionNamespacedJob**](docs/Batch_v2alpha1Api.md#deleteCollectionNamespacedJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*Batch_v2alpha1Api* | [**deleteCollectionNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#deleteCollectionNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*Batch_v2alpha1Api* | [**deleteNamespacedCronJob**](docs/Batch_v2alpha1Api.md#deleteNamespacedCronJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*Batch_v2alpha1Api* | [**deleteNamespacedJob**](docs/Batch_v2alpha1Api.md#deleteNamespacedJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*Batch_v2alpha1Api* | [**deleteNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#deleteNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*Batch_v2alpha1Api* | [**getAPIResources**](docs/Batch_v2alpha1Api.md#getAPIResources) | **GET** /apis/batch/v2alpha1/ | 
*Batch_v2alpha1Api* | [**listCronJobForAllNamespaces**](docs/Batch_v2alpha1Api.md#listCronJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/cronjobs | 
*Batch_v2alpha1Api* | [**listJobForAllNamespaces**](docs/Batch_v2alpha1Api.md#listJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/jobs | 
*Batch_v2alpha1Api* | [**listNamespacedCronJob**](docs/Batch_v2alpha1Api.md#listNamespacedCronJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs | 
*Batch_v2alpha1Api* | [**listNamespacedJob**](docs/Batch_v2alpha1Api.md#listNamespacedJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*Batch_v2alpha1Api* | [**listNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#listNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*Batch_v2alpha1Api* | [**listScheduledJobForAllNamespaces**](docs/Batch_v2alpha1Api.md#listScheduledJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/scheduledjobs | 
*Batch_v2alpha1Api* | [**patchNamespacedCronJob**](docs/Batch_v2alpha1Api.md#patchNamespacedCronJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*Batch_v2alpha1Api* | [**patchNamespacedCronJobStatus**](docs/Batch_v2alpha1Api.md#patchNamespacedCronJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*Batch_v2alpha1Api* | [**patchNamespacedJob**](docs/Batch_v2alpha1Api.md#patchNamespacedJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*Batch_v2alpha1Api* | [**patchNamespacedJobStatus**](docs/Batch_v2alpha1Api.md#patchNamespacedJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v2alpha1Api* | [**patchNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#patchNamespacedScheduledJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*Batch_v2alpha1Api* | [**patchNamespacedScheduledJobStatus**](docs/Batch_v2alpha1Api.md#patchNamespacedScheduledJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*Batch_v2alpha1Api* | [**readNamespacedCronJob**](docs/Batch_v2alpha1Api.md#readNamespacedCronJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*Batch_v2alpha1Api* | [**readNamespacedCronJobStatus**](docs/Batch_v2alpha1Api.md#readNamespacedCronJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*Batch_v2alpha1Api* | [**readNamespacedJob**](docs/Batch_v2alpha1Api.md#readNamespacedJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*Batch_v2alpha1Api* | [**readNamespacedJobStatus**](docs/Batch_v2alpha1Api.md#readNamespacedJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v2alpha1Api* | [**readNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#readNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*Batch_v2alpha1Api* | [**readNamespacedScheduledJobStatus**](docs/Batch_v2alpha1Api.md#readNamespacedScheduledJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*Batch_v2alpha1Api* | [**replaceNamespacedCronJob**](docs/Batch_v2alpha1Api.md#replaceNamespacedCronJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name} | 
*Batch_v2alpha1Api* | [**replaceNamespacedCronJobStatus**](docs/Batch_v2alpha1Api.md#replaceNamespacedCronJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/cronjobs/{name}/status | 
*Batch_v2alpha1Api* | [**replaceNamespacedJob**](docs/Batch_v2alpha1Api.md#replaceNamespacedJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*Batch_v2alpha1Api* | [**replaceNamespacedJobStatus**](docs/Batch_v2alpha1Api.md#replaceNamespacedJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*Batch_v2alpha1Api* | [**replaceNamespacedScheduledJob**](docs/Batch_v2alpha1Api.md#replaceNamespacedScheduledJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*Batch_v2alpha1Api* | [**replaceNamespacedScheduledJobStatus**](docs/Batch_v2alpha1Api.md#replaceNamespacedScheduledJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*CertificatesApi* | [**getAPIGroup**](docs/CertificatesApi.md#getAPIGroup) | **GET** /apis/certificates.k8s.io/ | 
*Certificates_v1alpha1Api* | [**createCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#createCertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*Certificates_v1alpha1Api* | [**deleteCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#deleteCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*Certificates_v1alpha1Api* | [**deleteCollectionCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#deleteCollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*Certificates_v1alpha1Api* | [**getAPIResources**](docs/Certificates_v1alpha1Api.md#getAPIResources) | **GET** /apis/certificates.k8s.io/v1alpha1/ | 
*Certificates_v1alpha1Api* | [**listCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#listCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*Certificates_v1alpha1Api* | [**patchCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#patchCertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*Certificates_v1alpha1Api* | [**readCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#readCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*Certificates_v1alpha1Api* | [**replaceCertificateSigningRequest**](docs/Certificates_v1alpha1Api.md#replaceCertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*Certificates_v1alpha1Api* | [**replaceCertificateSigningRequestApproval**](docs/Certificates_v1alpha1Api.md#replaceCertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/approval | 
*Certificates_v1alpha1Api* | [**replaceCertificateSigningRequestStatus**](docs/Certificates_v1alpha1Api.md#replaceCertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/status | 
*CoreApi* | [**getAPIVersions**](docs/CoreApi.md#getAPIVersions) | **GET** /api/ | 
*Core_v1Api* | [**connectDeleteNamespacedPodProxy**](docs/Core_v1Api.md#connectDeleteNamespacedPodProxy) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectDeleteNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectDeleteNamespacedPodProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectDeleteNamespacedServiceProxy**](docs/Core_v1Api.md#connectDeleteNamespacedServiceProxy) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectDeleteNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectDeleteNamespacedServiceProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectDeleteNodeProxy**](docs/Core_v1Api.md#connectDeleteNodeProxy) | **DELETE** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectDeleteNodeProxyWithPath**](docs/Core_v1Api.md#connectDeleteNodeProxyWithPath) | **DELETE** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**connectGetNamespacedPodAttach**](docs/Core_v1Api.md#connectGetNamespacedPodAttach) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*Core_v1Api* | [**connectGetNamespacedPodExec**](docs/Core_v1Api.md#connectGetNamespacedPodExec) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*Core_v1Api* | [**connectGetNamespacedPodPortforward**](docs/Core_v1Api.md#connectGetNamespacedPodPortforward) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*Core_v1Api* | [**connectGetNamespacedPodProxy**](docs/Core_v1Api.md#connectGetNamespacedPodProxy) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectGetNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectGetNamespacedPodProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectGetNamespacedServiceProxy**](docs/Core_v1Api.md#connectGetNamespacedServiceProxy) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectGetNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectGetNamespacedServiceProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectGetNodeProxy**](docs/Core_v1Api.md#connectGetNodeProxy) | **GET** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectGetNodeProxyWithPath**](docs/Core_v1Api.md#connectGetNodeProxyWithPath) | **GET** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**connectHeadNamespacedPodProxy**](docs/Core_v1Api.md#connectHeadNamespacedPodProxy) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectHeadNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectHeadNamespacedPodProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectHeadNamespacedServiceProxy**](docs/Core_v1Api.md#connectHeadNamespacedServiceProxy) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectHeadNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectHeadNamespacedServiceProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectHeadNodeProxy**](docs/Core_v1Api.md#connectHeadNodeProxy) | **HEAD** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectHeadNodeProxyWithPath**](docs/Core_v1Api.md#connectHeadNodeProxyWithPath) | **HEAD** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**connectOptionsNamespacedPodProxy**](docs/Core_v1Api.md#connectOptionsNamespacedPodProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectOptionsNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectOptionsNamespacedPodProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectOptionsNamespacedServiceProxy**](docs/Core_v1Api.md#connectOptionsNamespacedServiceProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectOptionsNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectOptionsNamespacedServiceProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectOptionsNodeProxy**](docs/Core_v1Api.md#connectOptionsNodeProxy) | **OPTIONS** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectOptionsNodeProxyWithPath**](docs/Core_v1Api.md#connectOptionsNodeProxyWithPath) | **OPTIONS** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPostNamespacedPodAttach**](docs/Core_v1Api.md#connectPostNamespacedPodAttach) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*Core_v1Api* | [**connectPostNamespacedPodExec**](docs/Core_v1Api.md#connectPostNamespacedPodExec) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*Core_v1Api* | [**connectPostNamespacedPodPortforward**](docs/Core_v1Api.md#connectPostNamespacedPodPortforward) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*Core_v1Api* | [**connectPostNamespacedPodProxy**](docs/Core_v1Api.md#connectPostNamespacedPodProxy) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectPostNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectPostNamespacedPodProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPostNamespacedServiceProxy**](docs/Core_v1Api.md#connectPostNamespacedServiceProxy) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectPostNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectPostNamespacedServiceProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPostNodeProxy**](docs/Core_v1Api.md#connectPostNodeProxy) | **POST** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectPostNodeProxyWithPath**](docs/Core_v1Api.md#connectPostNodeProxyWithPath) | **POST** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPutNamespacedPodProxy**](docs/Core_v1Api.md#connectPutNamespacedPodProxy) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*Core_v1Api* | [**connectPutNamespacedPodProxyWithPath**](docs/Core_v1Api.md#connectPutNamespacedPodProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPutNamespacedServiceProxy**](docs/Core_v1Api.md#connectPutNamespacedServiceProxy) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*Core_v1Api* | [**connectPutNamespacedServiceProxyWithPath**](docs/Core_v1Api.md#connectPutNamespacedServiceProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*Core_v1Api* | [**connectPutNodeProxy**](docs/Core_v1Api.md#connectPutNodeProxy) | **PUT** /api/v1/nodes/{name}/proxy | 
*Core_v1Api* | [**connectPutNodeProxyWithPath**](docs/Core_v1Api.md#connectPutNodeProxyWithPath) | **PUT** /api/v1/nodes/{name}/proxy/{path} | 
*Core_v1Api* | [**createNamespace**](docs/Core_v1Api.md#createNamespace) | **POST** /api/v1/namespaces | 
*Core_v1Api* | [**createNamespacedBinding**](docs/Core_v1Api.md#createNamespacedBinding) | **POST** /api/v1/namespaces/{namespace}/bindings | 
*Core_v1Api* | [**createNamespacedBindingBinding**](docs/Core_v1Api.md#createNamespacedBindingBinding) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/binding | 
*Core_v1Api* | [**createNamespacedConfigMap**](docs/Core_v1Api.md#createNamespacedConfigMap) | **POST** /api/v1/namespaces/{namespace}/configmaps | 
*Core_v1Api* | [**createNamespacedEndpoints**](docs/Core_v1Api.md#createNamespacedEndpoints) | **POST** /api/v1/namespaces/{namespace}/endpoints | 
*Core_v1Api* | [**createNamespacedEvent**](docs/Core_v1Api.md#createNamespacedEvent) | **POST** /api/v1/namespaces/{namespace}/events | 
*Core_v1Api* | [**createNamespacedEvictionEviction**](docs/Core_v1Api.md#createNamespacedEvictionEviction) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/eviction | 
*Core_v1Api* | [**createNamespacedLimitRange**](docs/Core_v1Api.md#createNamespacedLimitRange) | **POST** /api/v1/namespaces/{namespace}/limitranges | 
*Core_v1Api* | [**createNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#createNamespacedPersistentVolumeClaim) | **POST** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*Core_v1Api* | [**createNamespacedPod**](docs/Core_v1Api.md#createNamespacedPod) | **POST** /api/v1/namespaces/{namespace}/pods | 
*Core_v1Api* | [**createNamespacedPodTemplate**](docs/Core_v1Api.md#createNamespacedPodTemplate) | **POST** /api/v1/namespaces/{namespace}/podtemplates | 
*Core_v1Api* | [**createNamespacedReplicationController**](docs/Core_v1Api.md#createNamespacedReplicationController) | **POST** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*Core_v1Api* | [**createNamespacedResourceQuota**](docs/Core_v1Api.md#createNamespacedResourceQuota) | **POST** /api/v1/namespaces/{namespace}/resourcequotas | 
*Core_v1Api* | [**createNamespacedSecret**](docs/Core_v1Api.md#createNamespacedSecret) | **POST** /api/v1/namespaces/{namespace}/secrets | 
*Core_v1Api* | [**createNamespacedService**](docs/Core_v1Api.md#createNamespacedService) | **POST** /api/v1/namespaces/{namespace}/services | 
*Core_v1Api* | [**createNamespacedServiceAccount**](docs/Core_v1Api.md#createNamespacedServiceAccount) | **POST** /api/v1/namespaces/{namespace}/serviceaccounts | 
*Core_v1Api* | [**createNode**](docs/Core_v1Api.md#createNode) | **POST** /api/v1/nodes | 
*Core_v1Api* | [**createPersistentVolume**](docs/Core_v1Api.md#createPersistentVolume) | **POST** /api/v1/persistentvolumes | 
*Core_v1Api* | [**deleteCollectionNamespace**](docs/Core_v1Api.md#deleteCollectionNamespace) | **DELETE** /api/v1/namespaces | 
*Core_v1Api* | [**deleteCollectionNamespacedConfigMap**](docs/Core_v1Api.md#deleteCollectionNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps | 
*Core_v1Api* | [**deleteCollectionNamespacedEndpoints**](docs/Core_v1Api.md#deleteCollectionNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints | 
*Core_v1Api* | [**deleteCollectionNamespacedEvent**](docs/Core_v1Api.md#deleteCollectionNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events | 
*Core_v1Api* | [**deleteCollectionNamespacedLimitRange**](docs/Core_v1Api.md#deleteCollectionNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges | 
*Core_v1Api* | [**deleteCollectionNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#deleteCollectionNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*Core_v1Api* | [**deleteCollectionNamespacedPod**](docs/Core_v1Api.md#deleteCollectionNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods | 
*Core_v1Api* | [**deleteCollectionNamespacedPodTemplate**](docs/Core_v1Api.md#deleteCollectionNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates | 
*Core_v1Api* | [**deleteCollectionNamespacedReplicationController**](docs/Core_v1Api.md#deleteCollectionNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*Core_v1Api* | [**deleteCollectionNamespacedResourceQuota**](docs/Core_v1Api.md#deleteCollectionNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas | 
*Core_v1Api* | [**deleteCollectionNamespacedSecret**](docs/Core_v1Api.md#deleteCollectionNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets | 
*Core_v1Api* | [**deleteCollectionNamespacedServiceAccount**](docs/Core_v1Api.md#deleteCollectionNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts | 
*Core_v1Api* | [**deleteCollectionNode**](docs/Core_v1Api.md#deleteCollectionNode) | **DELETE** /api/v1/nodes | 
*Core_v1Api* | [**deleteCollectionPersistentVolume**](docs/Core_v1Api.md#deleteCollectionPersistentVolume) | **DELETE** /api/v1/persistentvolumes | 
*Core_v1Api* | [**deleteNamespace**](docs/Core_v1Api.md#deleteNamespace) | **DELETE** /api/v1/namespaces/{name} | 
*Core_v1Api* | [**deleteNamespacedConfigMap**](docs/Core_v1Api.md#deleteNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*Core_v1Api* | [**deleteNamespacedEndpoints**](docs/Core_v1Api.md#deleteNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*Core_v1Api* | [**deleteNamespacedEvent**](docs/Core_v1Api.md#deleteNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events/{name} | 
*Core_v1Api* | [**deleteNamespacedLimitRange**](docs/Core_v1Api.md#deleteNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*Core_v1Api* | [**deleteNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#deleteNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*Core_v1Api* | [**deleteNamespacedPod**](docs/Core_v1Api.md#deleteNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**deleteNamespacedPodTemplate**](docs/Core_v1Api.md#deleteNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*Core_v1Api* | [**deleteNamespacedReplicationController**](docs/Core_v1Api.md#deleteNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*Core_v1Api* | [**deleteNamespacedResourceQuota**](docs/Core_v1Api.md#deleteNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*Core_v1Api* | [**deleteNamespacedSecret**](docs/Core_v1Api.md#deleteNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets/{name} | 
*Core_v1Api* | [**deleteNamespacedService**](docs/Core_v1Api.md#deleteNamespacedService) | **DELETE** /api/v1/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**deleteNamespacedServiceAccount**](docs/Core_v1Api.md#deleteNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*Core_v1Api* | [**deleteNode**](docs/Core_v1Api.md#deleteNode) | **DELETE** /api/v1/nodes/{name} | 
*Core_v1Api* | [**deletePersistentVolume**](docs/Core_v1Api.md#deletePersistentVolume) | **DELETE** /api/v1/persistentvolumes/{name} | 
*Core_v1Api* | [**getAPIResources**](docs/Core_v1Api.md#getAPIResources) | **GET** /api/v1/ | 
*Core_v1Api* | [**listComponentStatus**](docs/Core_v1Api.md#listComponentStatus) | **GET** /api/v1/componentstatuses | 
*Core_v1Api* | [**listConfigMapForAllNamespaces**](docs/Core_v1Api.md#listConfigMapForAllNamespaces) | **GET** /api/v1/configmaps | 
*Core_v1Api* | [**listEndpointsForAllNamespaces**](docs/Core_v1Api.md#listEndpointsForAllNamespaces) | **GET** /api/v1/endpoints | 
*Core_v1Api* | [**listEventForAllNamespaces**](docs/Core_v1Api.md#listEventForAllNamespaces) | **GET** /api/v1/events | 
*Core_v1Api* | [**listLimitRangeForAllNamespaces**](docs/Core_v1Api.md#listLimitRangeForAllNamespaces) | **GET** /api/v1/limitranges | 
*Core_v1Api* | [**listNamespace**](docs/Core_v1Api.md#listNamespace) | **GET** /api/v1/namespaces | 
*Core_v1Api* | [**listNamespacedConfigMap**](docs/Core_v1Api.md#listNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps | 
*Core_v1Api* | [**listNamespacedEndpoints**](docs/Core_v1Api.md#listNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints | 
*Core_v1Api* | [**listNamespacedEvent**](docs/Core_v1Api.md#listNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events | 
*Core_v1Api* | [**listNamespacedLimitRange**](docs/Core_v1Api.md#listNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges | 
*Core_v1Api* | [**listNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#listNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*Core_v1Api* | [**listNamespacedPod**](docs/Core_v1Api.md#listNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods | 
*Core_v1Api* | [**listNamespacedPodTemplate**](docs/Core_v1Api.md#listNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates | 
*Core_v1Api* | [**listNamespacedReplicationController**](docs/Core_v1Api.md#listNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*Core_v1Api* | [**listNamespacedResourceQuota**](docs/Core_v1Api.md#listNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas | 
*Core_v1Api* | [**listNamespacedSecret**](docs/Core_v1Api.md#listNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets | 
*Core_v1Api* | [**listNamespacedService**](docs/Core_v1Api.md#listNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services | 
*Core_v1Api* | [**listNamespacedServiceAccount**](docs/Core_v1Api.md#listNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts | 
*Core_v1Api* | [**listNode**](docs/Core_v1Api.md#listNode) | **GET** /api/v1/nodes | 
*Core_v1Api* | [**listPersistentVolume**](docs/Core_v1Api.md#listPersistentVolume) | **GET** /api/v1/persistentvolumes | 
*Core_v1Api* | [**listPersistentVolumeClaimForAllNamespaces**](docs/Core_v1Api.md#listPersistentVolumeClaimForAllNamespaces) | **GET** /api/v1/persistentvolumeclaims | 
*Core_v1Api* | [**listPodForAllNamespaces**](docs/Core_v1Api.md#listPodForAllNamespaces) | **GET** /api/v1/pods | 
*Core_v1Api* | [**listPodTemplateForAllNamespaces**](docs/Core_v1Api.md#listPodTemplateForAllNamespaces) | **GET** /api/v1/podtemplates | 
*Core_v1Api* | [**listReplicationControllerForAllNamespaces**](docs/Core_v1Api.md#listReplicationControllerForAllNamespaces) | **GET** /api/v1/replicationcontrollers | 
*Core_v1Api* | [**listResourceQuotaForAllNamespaces**](docs/Core_v1Api.md#listResourceQuotaForAllNamespaces) | **GET** /api/v1/resourcequotas | 
*Core_v1Api* | [**listSecretForAllNamespaces**](docs/Core_v1Api.md#listSecretForAllNamespaces) | **GET** /api/v1/secrets | 
*Core_v1Api* | [**listServiceAccountForAllNamespaces**](docs/Core_v1Api.md#listServiceAccountForAllNamespaces) | **GET** /api/v1/serviceaccounts | 
*Core_v1Api* | [**listServiceForAllNamespaces**](docs/Core_v1Api.md#listServiceForAllNamespaces) | **GET** /api/v1/services | 
*Core_v1Api* | [**patchNamespace**](docs/Core_v1Api.md#patchNamespace) | **PATCH** /api/v1/namespaces/{name} | 
*Core_v1Api* | [**patchNamespaceStatus**](docs/Core_v1Api.md#patchNamespaceStatus) | **PATCH** /api/v1/namespaces/{name}/status | 
*Core_v1Api* | [**patchNamespacedConfigMap**](docs/Core_v1Api.md#patchNamespacedConfigMap) | **PATCH** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*Core_v1Api* | [**patchNamespacedEndpoints**](docs/Core_v1Api.md#patchNamespacedEndpoints) | **PATCH** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*Core_v1Api* | [**patchNamespacedEvent**](docs/Core_v1Api.md#patchNamespacedEvent) | **PATCH** /api/v1/namespaces/{namespace}/events/{name} | 
*Core_v1Api* | [**patchNamespacedLimitRange**](docs/Core_v1Api.md#patchNamespacedLimitRange) | **PATCH** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*Core_v1Api* | [**patchNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#patchNamespacedPersistentVolumeClaim) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*Core_v1Api* | [**patchNamespacedPersistentVolumeClaimStatus**](docs/Core_v1Api.md#patchNamespacedPersistentVolumeClaimStatus) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*Core_v1Api* | [**patchNamespacedPod**](docs/Core_v1Api.md#patchNamespacedPod) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**patchNamespacedPodStatus**](docs/Core_v1Api.md#patchNamespacedPodStatus) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*Core_v1Api* | [**patchNamespacedPodTemplate**](docs/Core_v1Api.md#patchNamespacedPodTemplate) | **PATCH** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*Core_v1Api* | [**patchNamespacedReplicationController**](docs/Core_v1Api.md#patchNamespacedReplicationController) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*Core_v1Api* | [**patchNamespacedReplicationControllerStatus**](docs/Core_v1Api.md#patchNamespacedReplicationControllerStatus) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*Core_v1Api* | [**patchNamespacedResourceQuota**](docs/Core_v1Api.md#patchNamespacedResourceQuota) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*Core_v1Api* | [**patchNamespacedResourceQuotaStatus**](docs/Core_v1Api.md#patchNamespacedResourceQuotaStatus) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*Core_v1Api* | [**patchNamespacedScaleScale**](docs/Core_v1Api.md#patchNamespacedScaleScale) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Core_v1Api* | [**patchNamespacedSecret**](docs/Core_v1Api.md#patchNamespacedSecret) | **PATCH** /api/v1/namespaces/{namespace}/secrets/{name} | 
*Core_v1Api* | [**patchNamespacedService**](docs/Core_v1Api.md#patchNamespacedService) | **PATCH** /api/v1/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**patchNamespacedServiceAccount**](docs/Core_v1Api.md#patchNamespacedServiceAccount) | **PATCH** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*Core_v1Api* | [**patchNamespacedServiceStatus**](docs/Core_v1Api.md#patchNamespacedServiceStatus) | **PATCH** /api/v1/namespaces/{namespace}/services/{name}/status | 
*Core_v1Api* | [**patchNode**](docs/Core_v1Api.md#patchNode) | **PATCH** /api/v1/nodes/{name} | 
*Core_v1Api* | [**patchNodeStatus**](docs/Core_v1Api.md#patchNodeStatus) | **PATCH** /api/v1/nodes/{name}/status | 
*Core_v1Api* | [**patchPersistentVolume**](docs/Core_v1Api.md#patchPersistentVolume) | **PATCH** /api/v1/persistentvolumes/{name} | 
*Core_v1Api* | [**patchPersistentVolumeStatus**](docs/Core_v1Api.md#patchPersistentVolumeStatus) | **PATCH** /api/v1/persistentvolumes/{name}/status | 
*Core_v1Api* | [**proxyDELETENamespacedPod**](docs/Core_v1Api.md#proxyDELETENamespacedPod) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyDELETENamespacedPodWithPath**](docs/Core_v1Api.md#proxyDELETENamespacedPodWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyDELETENamespacedService**](docs/Core_v1Api.md#proxyDELETENamespacedService) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyDELETENamespacedServiceWithPath**](docs/Core_v1Api.md#proxyDELETENamespacedServiceWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyDELETENode**](docs/Core_v1Api.md#proxyDELETENode) | **DELETE** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyDELETENodeWithPath**](docs/Core_v1Api.md#proxyDELETENodeWithPath) | **DELETE** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**proxyGETNamespacedPod**](docs/Core_v1Api.md#proxyGETNamespacedPod) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyGETNamespacedPodWithPath**](docs/Core_v1Api.md#proxyGETNamespacedPodWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyGETNamespacedService**](docs/Core_v1Api.md#proxyGETNamespacedService) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyGETNamespacedServiceWithPath**](docs/Core_v1Api.md#proxyGETNamespacedServiceWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyGETNode**](docs/Core_v1Api.md#proxyGETNode) | **GET** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyGETNodeWithPath**](docs/Core_v1Api.md#proxyGETNodeWithPath) | **GET** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**proxyHEADNamespacedPod**](docs/Core_v1Api.md#proxyHEADNamespacedPod) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyHEADNamespacedPodWithPath**](docs/Core_v1Api.md#proxyHEADNamespacedPodWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyHEADNamespacedService**](docs/Core_v1Api.md#proxyHEADNamespacedService) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyHEADNamespacedServiceWithPath**](docs/Core_v1Api.md#proxyHEADNamespacedServiceWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyHEADNode**](docs/Core_v1Api.md#proxyHEADNode) | **HEAD** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyHEADNodeWithPath**](docs/Core_v1Api.md#proxyHEADNodeWithPath) | **HEAD** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**proxyOPTIONSNamespacedPod**](docs/Core_v1Api.md#proxyOPTIONSNamespacedPod) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyOPTIONSNamespacedPodWithPath**](docs/Core_v1Api.md#proxyOPTIONSNamespacedPodWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyOPTIONSNamespacedService**](docs/Core_v1Api.md#proxyOPTIONSNamespacedService) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyOPTIONSNamespacedServiceWithPath**](docs/Core_v1Api.md#proxyOPTIONSNamespacedServiceWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyOPTIONSNode**](docs/Core_v1Api.md#proxyOPTIONSNode) | **OPTIONS** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyOPTIONSNodeWithPath**](docs/Core_v1Api.md#proxyOPTIONSNodeWithPath) | **OPTIONS** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**proxyPOSTNamespacedPod**](docs/Core_v1Api.md#proxyPOSTNamespacedPod) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyPOSTNamespacedPodWithPath**](docs/Core_v1Api.md#proxyPOSTNamespacedPodWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyPOSTNamespacedService**](docs/Core_v1Api.md#proxyPOSTNamespacedService) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyPOSTNamespacedServiceWithPath**](docs/Core_v1Api.md#proxyPOSTNamespacedServiceWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyPOSTNode**](docs/Core_v1Api.md#proxyPOSTNode) | **POST** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyPOSTNodeWithPath**](docs/Core_v1Api.md#proxyPOSTNodeWithPath) | **POST** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**proxyPUTNamespacedPod**](docs/Core_v1Api.md#proxyPUTNamespacedPod) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**proxyPUTNamespacedPodWithPath**](docs/Core_v1Api.md#proxyPUTNamespacedPodWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*Core_v1Api* | [**proxyPUTNamespacedService**](docs/Core_v1Api.md#proxyPUTNamespacedService) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**proxyPUTNamespacedServiceWithPath**](docs/Core_v1Api.md#proxyPUTNamespacedServiceWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*Core_v1Api* | [**proxyPUTNode**](docs/Core_v1Api.md#proxyPUTNode) | **PUT** /api/v1/proxy/nodes/{name} | 
*Core_v1Api* | [**proxyPUTNodeWithPath**](docs/Core_v1Api.md#proxyPUTNodeWithPath) | **PUT** /api/v1/proxy/nodes/{name}/{path} | 
*Core_v1Api* | [**readComponentStatus**](docs/Core_v1Api.md#readComponentStatus) | **GET** /api/v1/componentstatuses/{name} | 
*Core_v1Api* | [**readNamespace**](docs/Core_v1Api.md#readNamespace) | **GET** /api/v1/namespaces/{name} | 
*Core_v1Api* | [**readNamespaceStatus**](docs/Core_v1Api.md#readNamespaceStatus) | **GET** /api/v1/namespaces/{name}/status | 
*Core_v1Api* | [**readNamespacedConfigMap**](docs/Core_v1Api.md#readNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*Core_v1Api* | [**readNamespacedEndpoints**](docs/Core_v1Api.md#readNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*Core_v1Api* | [**readNamespacedEvent**](docs/Core_v1Api.md#readNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events/{name} | 
*Core_v1Api* | [**readNamespacedLimitRange**](docs/Core_v1Api.md#readNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*Core_v1Api* | [**readNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#readNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*Core_v1Api* | [**readNamespacedPersistentVolumeClaimStatus**](docs/Core_v1Api.md#readNamespacedPersistentVolumeClaimStatus) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*Core_v1Api* | [**readNamespacedPod**](docs/Core_v1Api.md#readNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**readNamespacedPodLog**](docs/Core_v1Api.md#readNamespacedPodLog) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/log | 
*Core_v1Api* | [**readNamespacedPodStatus**](docs/Core_v1Api.md#readNamespacedPodStatus) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*Core_v1Api* | [**readNamespacedPodTemplate**](docs/Core_v1Api.md#readNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*Core_v1Api* | [**readNamespacedReplicationController**](docs/Core_v1Api.md#readNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*Core_v1Api* | [**readNamespacedReplicationControllerStatus**](docs/Core_v1Api.md#readNamespacedReplicationControllerStatus) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*Core_v1Api* | [**readNamespacedResourceQuota**](docs/Core_v1Api.md#readNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*Core_v1Api* | [**readNamespacedResourceQuotaStatus**](docs/Core_v1Api.md#readNamespacedResourceQuotaStatus) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*Core_v1Api* | [**readNamespacedScaleScale**](docs/Core_v1Api.md#readNamespacedScaleScale) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Core_v1Api* | [**readNamespacedSecret**](docs/Core_v1Api.md#readNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets/{name} | 
*Core_v1Api* | [**readNamespacedService**](docs/Core_v1Api.md#readNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**readNamespacedServiceAccount**](docs/Core_v1Api.md#readNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*Core_v1Api* | [**readNamespacedServiceStatus**](docs/Core_v1Api.md#readNamespacedServiceStatus) | **GET** /api/v1/namespaces/{namespace}/services/{name}/status | 
*Core_v1Api* | [**readNode**](docs/Core_v1Api.md#readNode) | **GET** /api/v1/nodes/{name} | 
*Core_v1Api* | [**readNodeStatus**](docs/Core_v1Api.md#readNodeStatus) | **GET** /api/v1/nodes/{name}/status | 
*Core_v1Api* | [**readPersistentVolume**](docs/Core_v1Api.md#readPersistentVolume) | **GET** /api/v1/persistentvolumes/{name} | 
*Core_v1Api* | [**readPersistentVolumeStatus**](docs/Core_v1Api.md#readPersistentVolumeStatus) | **GET** /api/v1/persistentvolumes/{name}/status | 
*Core_v1Api* | [**replaceNamespace**](docs/Core_v1Api.md#replaceNamespace) | **PUT** /api/v1/namespaces/{name} | 
*Core_v1Api* | [**replaceNamespaceFinalize**](docs/Core_v1Api.md#replaceNamespaceFinalize) | **PUT** /api/v1/namespaces/{name}/finalize | 
*Core_v1Api* | [**replaceNamespaceStatus**](docs/Core_v1Api.md#replaceNamespaceStatus) | **PUT** /api/v1/namespaces/{name}/status | 
*Core_v1Api* | [**replaceNamespacedConfigMap**](docs/Core_v1Api.md#replaceNamespacedConfigMap) | **PUT** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*Core_v1Api* | [**replaceNamespacedEndpoints**](docs/Core_v1Api.md#replaceNamespacedEndpoints) | **PUT** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*Core_v1Api* | [**replaceNamespacedEvent**](docs/Core_v1Api.md#replaceNamespacedEvent) | **PUT** /api/v1/namespaces/{namespace}/events/{name} | 
*Core_v1Api* | [**replaceNamespacedLimitRange**](docs/Core_v1Api.md#replaceNamespacedLimitRange) | **PUT** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*Core_v1Api* | [**replaceNamespacedPersistentVolumeClaim**](docs/Core_v1Api.md#replaceNamespacedPersistentVolumeClaim) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*Core_v1Api* | [**replaceNamespacedPersistentVolumeClaimStatus**](docs/Core_v1Api.md#replaceNamespacedPersistentVolumeClaimStatus) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*Core_v1Api* | [**replaceNamespacedPod**](docs/Core_v1Api.md#replaceNamespacedPod) | **PUT** /api/v1/namespaces/{namespace}/pods/{name} | 
*Core_v1Api* | [**replaceNamespacedPodStatus**](docs/Core_v1Api.md#replaceNamespacedPodStatus) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*Core_v1Api* | [**replaceNamespacedPodTemplate**](docs/Core_v1Api.md#replaceNamespacedPodTemplate) | **PUT** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*Core_v1Api* | [**replaceNamespacedReplicationController**](docs/Core_v1Api.md#replaceNamespacedReplicationController) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*Core_v1Api* | [**replaceNamespacedReplicationControllerStatus**](docs/Core_v1Api.md#replaceNamespacedReplicationControllerStatus) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*Core_v1Api* | [**replaceNamespacedResourceQuota**](docs/Core_v1Api.md#replaceNamespacedResourceQuota) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*Core_v1Api* | [**replaceNamespacedResourceQuotaStatus**](docs/Core_v1Api.md#replaceNamespacedResourceQuotaStatus) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*Core_v1Api* | [**replaceNamespacedScaleScale**](docs/Core_v1Api.md#replaceNamespacedScaleScale) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Core_v1Api* | [**replaceNamespacedSecret**](docs/Core_v1Api.md#replaceNamespacedSecret) | **PUT** /api/v1/namespaces/{namespace}/secrets/{name} | 
*Core_v1Api* | [**replaceNamespacedService**](docs/Core_v1Api.md#replaceNamespacedService) | **PUT** /api/v1/namespaces/{namespace}/services/{name} | 
*Core_v1Api* | [**replaceNamespacedServiceAccount**](docs/Core_v1Api.md#replaceNamespacedServiceAccount) | **PUT** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*Core_v1Api* | [**replaceNamespacedServiceStatus**](docs/Core_v1Api.md#replaceNamespacedServiceStatus) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/status | 
*Core_v1Api* | [**replaceNode**](docs/Core_v1Api.md#replaceNode) | **PUT** /api/v1/nodes/{name} | 
*Core_v1Api* | [**replaceNodeStatus**](docs/Core_v1Api.md#replaceNodeStatus) | **PUT** /api/v1/nodes/{name}/status | 
*Core_v1Api* | [**replacePersistentVolume**](docs/Core_v1Api.md#replacePersistentVolume) | **PUT** /api/v1/persistentvolumes/{name} | 
*Core_v1Api* | [**replacePersistentVolumeStatus**](docs/Core_v1Api.md#replacePersistentVolumeStatus) | **PUT** /api/v1/persistentvolumes/{name}/status | 
*ExtensionsApi* | [**getAPIGroup**](docs/ExtensionsApi.md#getAPIGroup) | **GET** /apis/extensions/ | 
*Extensions_v1beta1Api* | [**createNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#createNamespacedDaemonSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*Extensions_v1beta1Api* | [**createNamespacedDeployment**](docs/Extensions_v1beta1Api.md#createNamespacedDeployment) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*Extensions_v1beta1Api* | [**createNamespacedDeploymentRollbackRollback**](docs/Extensions_v1beta1Api.md#createNamespacedDeploymentRollbackRollback) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/rollback | 
*Extensions_v1beta1Api* | [**createNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#createNamespacedHorizontalPodAutoscaler) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*Extensions_v1beta1Api* | [**createNamespacedIngress**](docs/Extensions_v1beta1Api.md#createNamespacedIngress) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*Extensions_v1beta1Api* | [**createNamespacedJob**](docs/Extensions_v1beta1Api.md#createNamespacedJob) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*Extensions_v1beta1Api* | [**createNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#createNamespacedNetworkPolicy) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*Extensions_v1beta1Api* | [**createNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#createNamespacedReplicaSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*Extensions_v1beta1Api* | [**createThirdPartyResource**](docs/Extensions_v1beta1Api.md#createThirdPartyResource) | **POST** /apis/extensions/v1beta1/thirdpartyresources | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedDeployment**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedIngress**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedJob**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedJob) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*Extensions_v1beta1Api* | [**deleteCollectionNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#deleteCollectionNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*Extensions_v1beta1Api* | [**deleteCollectionThirdPartyResource**](docs/Extensions_v1beta1Api.md#deleteCollectionThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources | 
*Extensions_v1beta1Api* | [**deleteNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#deleteNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedDeployment**](docs/Extensions_v1beta1Api.md#deleteNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#deleteNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedIngress**](docs/Extensions_v1beta1Api.md#deleteNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedJob**](docs/Extensions_v1beta1Api.md#deleteNamespacedJob) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#deleteNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*Extensions_v1beta1Api* | [**deleteNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#deleteNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*Extensions_v1beta1Api* | [**deleteThirdPartyResource**](docs/Extensions_v1beta1Api.md#deleteThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*Extensions_v1beta1Api* | [**getAPIResources**](docs/Extensions_v1beta1Api.md#getAPIResources) | **GET** /apis/extensions/v1beta1/ | 
*Extensions_v1beta1Api* | [**listDaemonSetForAllNamespaces**](docs/Extensions_v1beta1Api.md#listDaemonSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/daemonsets | 
*Extensions_v1beta1Api* | [**listDeploymentForAllNamespaces**](docs/Extensions_v1beta1Api.md#listDeploymentForAllNamespaces) | **GET** /apis/extensions/v1beta1/deployments | 
*Extensions_v1beta1Api* | [**listHorizontalPodAutoscalerForAllNamespaces**](docs/Extensions_v1beta1Api.md#listHorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/extensions/v1beta1/horizontalpodautoscalers | 
*Extensions_v1beta1Api* | [**listIngressForAllNamespaces**](docs/Extensions_v1beta1Api.md#listIngressForAllNamespaces) | **GET** /apis/extensions/v1beta1/ingresses | 
*Extensions_v1beta1Api* | [**listJobForAllNamespaces**](docs/Extensions_v1beta1Api.md#listJobForAllNamespaces) | **GET** /apis/extensions/v1beta1/jobs | 
*Extensions_v1beta1Api* | [**listNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#listNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*Extensions_v1beta1Api* | [**listNamespacedDeployment**](docs/Extensions_v1beta1Api.md#listNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*Extensions_v1beta1Api* | [**listNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#listNamespacedHorizontalPodAutoscaler) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*Extensions_v1beta1Api* | [**listNamespacedIngress**](docs/Extensions_v1beta1Api.md#listNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*Extensions_v1beta1Api* | [**listNamespacedJob**](docs/Extensions_v1beta1Api.md#listNamespacedJob) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*Extensions_v1beta1Api* | [**listNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#listNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*Extensions_v1beta1Api* | [**listNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#listNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*Extensions_v1beta1Api* | [**listNetworkPolicyForAllNamespaces**](docs/Extensions_v1beta1Api.md#listNetworkPolicyForAllNamespaces) | **GET** /apis/extensions/v1beta1/networkpolicies | 
*Extensions_v1beta1Api* | [**listReplicaSetForAllNamespaces**](docs/Extensions_v1beta1Api.md#listReplicaSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/replicasets | 
*Extensions_v1beta1Api* | [**listThirdPartyResource**](docs/Extensions_v1beta1Api.md#listThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources | 
*Extensions_v1beta1Api* | [**patchNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#patchNamespacedDaemonSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedDaemonSetStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedDaemonSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedDeployment**](docs/Extensions_v1beta1Api.md#patchNamespacedDeployment) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedDeploymentStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedDeploymentStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedDeploymentsScale**](docs/Extensions_v1beta1Api.md#patchNamespacedDeploymentsScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*Extensions_v1beta1Api* | [**patchNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#patchNamespacedHorizontalPodAutoscaler) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedHorizontalPodAutoscalerStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedIngress**](docs/Extensions_v1beta1Api.md#patchNamespacedIngress) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedIngressStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedIngressStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedJob**](docs/Extensions_v1beta1Api.md#patchNamespacedJob) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedJobStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedJobStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#patchNamespacedNetworkPolicy) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#patchNamespacedReplicaSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*Extensions_v1beta1Api* | [**patchNamespacedReplicaSetStatus**](docs/Extensions_v1beta1Api.md#patchNamespacedReplicaSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*Extensions_v1beta1Api* | [**patchNamespacedReplicasetsScale**](docs/Extensions_v1beta1Api.md#patchNamespacedReplicasetsScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*Extensions_v1beta1Api* | [**patchNamespacedReplicationcontrollersScale**](docs/Extensions_v1beta1Api.md#patchNamespacedReplicationcontrollersScale) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Extensions_v1beta1Api* | [**patchThirdPartyResource**](docs/Extensions_v1beta1Api.md#patchThirdPartyResource) | **PATCH** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#readNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedDaemonSetStatus**](docs/Extensions_v1beta1Api.md#readNamespacedDaemonSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedDeployment**](docs/Extensions_v1beta1Api.md#readNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedDeploymentStatus**](docs/Extensions_v1beta1Api.md#readNamespacedDeploymentStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedDeploymentsScale**](docs/Extensions_v1beta1Api.md#readNamespacedDeploymentsScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*Extensions_v1beta1Api* | [**readNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#readNamespacedHorizontalPodAutoscaler) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedHorizontalPodAutoscalerStatus**](docs/Extensions_v1beta1Api.md#readNamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedIngress**](docs/Extensions_v1beta1Api.md#readNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedIngressStatus**](docs/Extensions_v1beta1Api.md#readNamespacedIngressStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedJob**](docs/Extensions_v1beta1Api.md#readNamespacedJob) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedJobStatus**](docs/Extensions_v1beta1Api.md#readNamespacedJobStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#readNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#readNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*Extensions_v1beta1Api* | [**readNamespacedReplicaSetStatus**](docs/Extensions_v1beta1Api.md#readNamespacedReplicaSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*Extensions_v1beta1Api* | [**readNamespacedReplicasetsScale**](docs/Extensions_v1beta1Api.md#readNamespacedReplicasetsScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*Extensions_v1beta1Api* | [**readNamespacedReplicationcontrollersScale**](docs/Extensions_v1beta1Api.md#readNamespacedReplicationcontrollersScale) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Extensions_v1beta1Api* | [**readThirdPartyResource**](docs/Extensions_v1beta1Api.md#readThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedDaemonSet**](docs/Extensions_v1beta1Api.md#replaceNamespacedDaemonSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedDaemonSetStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedDaemonSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedDeployment**](docs/Extensions_v1beta1Api.md#replaceNamespacedDeployment) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedDeploymentStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedDeploymentStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedDeploymentsScale**](docs/Extensions_v1beta1Api.md#replaceNamespacedDeploymentsScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*Extensions_v1beta1Api* | [**replaceNamespacedHorizontalPodAutoscaler**](docs/Extensions_v1beta1Api.md#replaceNamespacedHorizontalPodAutoscaler) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedHorizontalPodAutoscalerStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedIngress**](docs/Extensions_v1beta1Api.md#replaceNamespacedIngress) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedIngressStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedIngressStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedJob**](docs/Extensions_v1beta1Api.md#replaceNamespacedJob) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedJobStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedJobStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedNetworkPolicy**](docs/Extensions_v1beta1Api.md#replaceNamespacedNetworkPolicy) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedReplicaSet**](docs/Extensions_v1beta1Api.md#replaceNamespacedReplicaSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*Extensions_v1beta1Api* | [**replaceNamespacedReplicaSetStatus**](docs/Extensions_v1beta1Api.md#replaceNamespacedReplicaSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*Extensions_v1beta1Api* | [**replaceNamespacedReplicasetsScale**](docs/Extensions_v1beta1Api.md#replaceNamespacedReplicasetsScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*Extensions_v1beta1Api* | [**replaceNamespacedReplicationcontrollersScale**](docs/Extensions_v1beta1Api.md#replaceNamespacedReplicationcontrollersScale) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*Extensions_v1beta1Api* | [**replaceThirdPartyResource**](docs/Extensions_v1beta1Api.md#replaceThirdPartyResource) | **PUT** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*LogsApi* | [**logFileHandler**](docs/LogsApi.md#logFileHandler) | **GET** /logs/{logpath} | 
*LogsApi* | [**logFileListHandler**](docs/LogsApi.md#logFileListHandler) | **GET** /logs/ | 
*PolicyApi* | [**getAPIGroup**](docs/PolicyApi.md#getAPIGroup) | **GET** /apis/policy/ | 
*Policy_v1beta1Api* | [**createNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#createNamespacedPodDisruptionBudget) | **POST** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*Policy_v1beta1Api* | [**deleteCollectionNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#deleteCollectionNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*Policy_v1beta1Api* | [**deleteNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#deleteNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*Policy_v1beta1Api* | [**getAPIResources**](docs/Policy_v1beta1Api.md#getAPIResources) | **GET** /apis/policy/v1beta1/ | 
*Policy_v1beta1Api* | [**listNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#listNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
*Policy_v1beta1Api* | [**listPodDisruptionBudgetForAllNamespaces**](docs/Policy_v1beta1Api.md#listPodDisruptionBudgetForAllNamespaces) | **GET** /apis/policy/v1beta1/poddisruptionbudgets | 
*Policy_v1beta1Api* | [**patchNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#patchNamespacedPodDisruptionBudget) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*Policy_v1beta1Api* | [**patchNamespacedPodDisruptionBudgetStatus**](docs/Policy_v1beta1Api.md#patchNamespacedPodDisruptionBudgetStatus) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*Policy_v1beta1Api* | [**readNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#readNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*Policy_v1beta1Api* | [**readNamespacedPodDisruptionBudgetStatus**](docs/Policy_v1beta1Api.md#readNamespacedPodDisruptionBudgetStatus) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*Policy_v1beta1Api* | [**replaceNamespacedPodDisruptionBudget**](docs/Policy_v1beta1Api.md#replaceNamespacedPodDisruptionBudget) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*Policy_v1beta1Api* | [**replaceNamespacedPodDisruptionBudgetStatus**](docs/Policy_v1beta1Api.md#replaceNamespacedPodDisruptionBudgetStatus) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*RbacAuthorizationApi* | [**getAPIGroup**](docs/RbacAuthorizationApi.md#getAPIGroup) | **GET** /apis/rbac.authorization.k8s.io/ | 
*RbacAuthorization_v1alpha1Api* | [**createClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#createClusterRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorization_v1alpha1Api* | [**createClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#createClusterRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorization_v1alpha1Api* | [**createNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#createNamespacedRole) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorization_v1alpha1Api* | [**createNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#createNamespacedRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorization_v1alpha1Api* | [**deleteClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#deleteClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**deleteClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#deleteClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**deleteCollectionClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#deleteCollectionClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorization_v1alpha1Api* | [**deleteCollectionClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#deleteCollectionClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorization_v1alpha1Api* | [**deleteCollectionNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#deleteCollectionNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorization_v1alpha1Api* | [**deleteCollectionNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#deleteCollectionNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorization_v1alpha1Api* | [**deleteNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#deleteNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**deleteNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#deleteNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**getAPIResources**](docs/RbacAuthorization_v1alpha1Api.md#getAPIResources) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/ | 
*RbacAuthorization_v1alpha1Api* | [**listClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#listClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles | 
*RbacAuthorization_v1alpha1Api* | [**listClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#listClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings | 
*RbacAuthorization_v1alpha1Api* | [**listNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#listNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles | 
*RbacAuthorization_v1alpha1Api* | [**listNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#listNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings | 
*RbacAuthorization_v1alpha1Api* | [**listRoleBindingForAllNamespaces**](docs/RbacAuthorization_v1alpha1Api.md#listRoleBindingForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/rolebindings | 
*RbacAuthorization_v1alpha1Api* | [**listRoleForAllNamespaces**](docs/RbacAuthorization_v1alpha1Api.md#listRoleForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/roles | 
*RbacAuthorization_v1alpha1Api* | [**patchClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#patchClusterRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**patchClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#patchClusterRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**patchNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#patchNamespacedRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**patchNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#patchNamespacedRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**readClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#readClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**readClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#readClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**readNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#readNamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**readNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#readNamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**replaceClusterRole**](docs/RbacAuthorization_v1alpha1Api.md#replaceClusterRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterroles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**replaceClusterRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#replaceClusterRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/clusterrolebindings/{name} | 
*RbacAuthorization_v1alpha1Api* | [**replaceNamespacedRole**](docs/RbacAuthorization_v1alpha1Api.md#replaceNamespacedRole) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/roles/{name} | 
*RbacAuthorization_v1alpha1Api* | [**replaceNamespacedRoleBinding**](docs/RbacAuthorization_v1alpha1Api.md#replaceNamespacedRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1alpha1/namespaces/{namespace}/rolebindings/{name} | 
*StorageApi* | [**getAPIGroup**](docs/StorageApi.md#getAPIGroup) | **GET** /apis/storage.k8s.io/ | 
*Storage_v1beta1Api* | [**createStorageClass**](docs/Storage_v1beta1Api.md#createStorageClass) | **POST** /apis/storage.k8s.io/v1beta1/storageclasses | 
*Storage_v1beta1Api* | [**deleteCollectionStorageClass**](docs/Storage_v1beta1Api.md#deleteCollectionStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses | 
*Storage_v1beta1Api* | [**deleteStorageClass**](docs/Storage_v1beta1Api.md#deleteStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*Storage_v1beta1Api* | [**getAPIResources**](docs/Storage_v1beta1Api.md#getAPIResources) | **GET** /apis/storage.k8s.io/v1beta1/ | 
*Storage_v1beta1Api* | [**listStorageClass**](docs/Storage_v1beta1Api.md#listStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses | 
*Storage_v1beta1Api* | [**patchStorageClass**](docs/Storage_v1beta1Api.md#patchStorageClass) | **PATCH** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*Storage_v1beta1Api* | [**readStorageClass**](docs/Storage_v1beta1Api.md#readStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*Storage_v1beta1Api* | [**replaceStorageClass**](docs/Storage_v1beta1Api.md#replaceStorageClass) | **PUT** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*VersionApi* | [**getCode**](docs/VersionApi.md#getCode) | **GET** /version/ | 


## Documentation for Models

 - [IntstrIntOrString](docs/IntstrIntOrString.md)
 - [ResourceQuantity](docs/ResourceQuantity.md)
 - [RuntimeRawExtension](docs/RuntimeRawExtension.md)
 - [UnversionedAPIGroup](docs/UnversionedAPIGroup.md)
 - [UnversionedAPIGroupList](docs/UnversionedAPIGroupList.md)
 - [UnversionedAPIResource](docs/UnversionedAPIResource.md)
 - [UnversionedAPIResourceList](docs/UnversionedAPIResourceList.md)
 - [UnversionedAPIVersions](docs/UnversionedAPIVersions.md)
 - [UnversionedGroupVersionForDiscovery](docs/UnversionedGroupVersionForDiscovery.md)
 - [UnversionedLabelSelector](docs/UnversionedLabelSelector.md)
 - [UnversionedLabelSelectorRequirement](docs/UnversionedLabelSelectorRequirement.md)
 - [UnversionedListMeta](docs/UnversionedListMeta.md)
 - [UnversionedServerAddressByClientCIDR](docs/UnversionedServerAddressByClientCIDR.md)
 - [UnversionedStatus](docs/UnversionedStatus.md)
 - [UnversionedStatusCause](docs/UnversionedStatusCause.md)
 - [UnversionedStatusDetails](docs/UnversionedStatusDetails.md)
 - [UnversionedTime](docs/UnversionedTime.md)
 - [V1AWSElasticBlockStoreVolumeSource](docs/V1AWSElasticBlockStoreVolumeSource.md)
 - [V1AttachedVolume](docs/V1AttachedVolume.md)
 - [V1AzureDiskVolumeSource](docs/V1AzureDiskVolumeSource.md)
 - [V1AzureFileVolumeSource](docs/V1AzureFileVolumeSource.md)
 - [V1Binding](docs/V1Binding.md)
 - [V1Capabilities](docs/V1Capabilities.md)
 - [V1CephFSVolumeSource](docs/V1CephFSVolumeSource.md)
 - [V1CinderVolumeSource](docs/V1CinderVolumeSource.md)
 - [V1ComponentCondition](docs/V1ComponentCondition.md)
 - [V1ComponentStatus](docs/V1ComponentStatus.md)
 - [V1ComponentStatusList](docs/V1ComponentStatusList.md)
 - [V1ConfigMap](docs/V1ConfigMap.md)
 - [V1ConfigMapKeySelector](docs/V1ConfigMapKeySelector.md)
 - [V1ConfigMapList](docs/V1ConfigMapList.md)
 - [V1ConfigMapVolumeSource](docs/V1ConfigMapVolumeSource.md)
 - [V1Container](docs/V1Container.md)
 - [V1ContainerImage](docs/V1ContainerImage.md)
 - [V1ContainerPort](docs/V1ContainerPort.md)
 - [V1ContainerState](docs/V1ContainerState.md)
 - [V1ContainerStateRunning](docs/V1ContainerStateRunning.md)
 - [V1ContainerStateTerminated](docs/V1ContainerStateTerminated.md)
 - [V1ContainerStateWaiting](docs/V1ContainerStateWaiting.md)
 - [V1ContainerStatus](docs/V1ContainerStatus.md)
 - [V1CrossVersionObjectReference](docs/V1CrossVersionObjectReference.md)
 - [V1DaemonEndpoint](docs/V1DaemonEndpoint.md)
 - [V1DeleteOptions](docs/V1DeleteOptions.md)
 - [V1DownwardAPIVolumeFile](docs/V1DownwardAPIVolumeFile.md)
 - [V1DownwardAPIVolumeSource](docs/V1DownwardAPIVolumeSource.md)
 - [V1EmptyDirVolumeSource](docs/V1EmptyDirVolumeSource.md)
 - [V1EndpointAddress](docs/V1EndpointAddress.md)
 - [V1EndpointPort](docs/V1EndpointPort.md)
 - [V1EndpointSubset](docs/V1EndpointSubset.md)
 - [V1Endpoints](docs/V1Endpoints.md)
 - [V1EndpointsList](docs/V1EndpointsList.md)
 - [V1EnvVar](docs/V1EnvVar.md)
 - [V1EnvVarSource](docs/V1EnvVarSource.md)
 - [V1Event](docs/V1Event.md)
 - [V1EventList](docs/V1EventList.md)
 - [V1EventSource](docs/V1EventSource.md)
 - [V1ExecAction](docs/V1ExecAction.md)
 - [V1FCVolumeSource](docs/V1FCVolumeSource.md)
 - [V1FlexVolumeSource](docs/V1FlexVolumeSource.md)
 - [V1FlockerVolumeSource](docs/V1FlockerVolumeSource.md)
 - [V1GCEPersistentDiskVolumeSource](docs/V1GCEPersistentDiskVolumeSource.md)
 - [V1GitRepoVolumeSource](docs/V1GitRepoVolumeSource.md)
 - [V1GlusterfsVolumeSource](docs/V1GlusterfsVolumeSource.md)
 - [V1HTTPGetAction](docs/V1HTTPGetAction.md)
 - [V1HTTPHeader](docs/V1HTTPHeader.md)
 - [V1Handler](docs/V1Handler.md)
 - [V1HorizontalPodAutoscaler](docs/V1HorizontalPodAutoscaler.md)
 - [V1HorizontalPodAutoscalerList](docs/V1HorizontalPodAutoscalerList.md)
 - [V1HorizontalPodAutoscalerSpec](docs/V1HorizontalPodAutoscalerSpec.md)
 - [V1HorizontalPodAutoscalerStatus](docs/V1HorizontalPodAutoscalerStatus.md)
 - [V1HostPathVolumeSource](docs/V1HostPathVolumeSource.md)
 - [V1ISCSIVolumeSource](docs/V1ISCSIVolumeSource.md)
 - [V1Job](docs/V1Job.md)
 - [V1JobCondition](docs/V1JobCondition.md)
 - [V1JobList](docs/V1JobList.md)
 - [V1JobSpec](docs/V1JobSpec.md)
 - [V1JobStatus](docs/V1JobStatus.md)
 - [V1KeyToPath](docs/V1KeyToPath.md)
 - [V1Lifecycle](docs/V1Lifecycle.md)
 - [V1LimitRange](docs/V1LimitRange.md)
 - [V1LimitRangeItem](docs/V1LimitRangeItem.md)
 - [V1LimitRangeList](docs/V1LimitRangeList.md)
 - [V1LimitRangeSpec](docs/V1LimitRangeSpec.md)
 - [V1LoadBalancerIngress](docs/V1LoadBalancerIngress.md)
 - [V1LoadBalancerStatus](docs/V1LoadBalancerStatus.md)
 - [V1LocalObjectReference](docs/V1LocalObjectReference.md)
 - [V1NFSVolumeSource](docs/V1NFSVolumeSource.md)
 - [V1Namespace](docs/V1Namespace.md)
 - [V1NamespaceList](docs/V1NamespaceList.md)
 - [V1NamespaceSpec](docs/V1NamespaceSpec.md)
 - [V1NamespaceStatus](docs/V1NamespaceStatus.md)
 - [V1Node](docs/V1Node.md)
 - [V1NodeAddress](docs/V1NodeAddress.md)
 - [V1NodeCondition](docs/V1NodeCondition.md)
 - [V1NodeDaemonEndpoints](docs/V1NodeDaemonEndpoints.md)
 - [V1NodeList](docs/V1NodeList.md)
 - [V1NodeSpec](docs/V1NodeSpec.md)
 - [V1NodeStatus](docs/V1NodeStatus.md)
 - [V1NodeSystemInfo](docs/V1NodeSystemInfo.md)
 - [V1ObjectFieldSelector](docs/V1ObjectFieldSelector.md)
 - [V1ObjectMeta](docs/V1ObjectMeta.md)
 - [V1ObjectReference](docs/V1ObjectReference.md)
 - [V1OwnerReference](docs/V1OwnerReference.md)
 - [V1PersistentVolume](docs/V1PersistentVolume.md)
 - [V1PersistentVolumeClaim](docs/V1PersistentVolumeClaim.md)
 - [V1PersistentVolumeClaimList](docs/V1PersistentVolumeClaimList.md)
 - [V1PersistentVolumeClaimSpec](docs/V1PersistentVolumeClaimSpec.md)
 - [V1PersistentVolumeClaimStatus](docs/V1PersistentVolumeClaimStatus.md)
 - [V1PersistentVolumeClaimVolumeSource](docs/V1PersistentVolumeClaimVolumeSource.md)
 - [V1PersistentVolumeList](docs/V1PersistentVolumeList.md)
 - [V1PersistentVolumeSpec](docs/V1PersistentVolumeSpec.md)
 - [V1PersistentVolumeStatus](docs/V1PersistentVolumeStatus.md)
 - [V1PhotonPersistentDiskVolumeSource](docs/V1PhotonPersistentDiskVolumeSource.md)
 - [V1Pod](docs/V1Pod.md)
 - [V1PodCondition](docs/V1PodCondition.md)
 - [V1PodList](docs/V1PodList.md)
 - [V1PodSecurityContext](docs/V1PodSecurityContext.md)
 - [V1PodSpec](docs/V1PodSpec.md)
 - [V1PodStatus](docs/V1PodStatus.md)
 - [V1PodTemplate](docs/V1PodTemplate.md)
 - [V1PodTemplateList](docs/V1PodTemplateList.md)
 - [V1PodTemplateSpec](docs/V1PodTemplateSpec.md)
 - [V1Preconditions](docs/V1Preconditions.md)
 - [V1Probe](docs/V1Probe.md)
 - [V1QuobyteVolumeSource](docs/V1QuobyteVolumeSource.md)
 - [V1RBDVolumeSource](docs/V1RBDVolumeSource.md)
 - [V1ReplicationController](docs/V1ReplicationController.md)
 - [V1ReplicationControllerCondition](docs/V1ReplicationControllerCondition.md)
 - [V1ReplicationControllerList](docs/V1ReplicationControllerList.md)
 - [V1ReplicationControllerSpec](docs/V1ReplicationControllerSpec.md)
 - [V1ReplicationControllerStatus](docs/V1ReplicationControllerStatus.md)
 - [V1ResourceFieldSelector](docs/V1ResourceFieldSelector.md)
 - [V1ResourceQuota](docs/V1ResourceQuota.md)
 - [V1ResourceQuotaList](docs/V1ResourceQuotaList.md)
 - [V1ResourceQuotaSpec](docs/V1ResourceQuotaSpec.md)
 - [V1ResourceQuotaStatus](docs/V1ResourceQuotaStatus.md)
 - [V1ResourceRequirements](docs/V1ResourceRequirements.md)
 - [V1SELinuxOptions](docs/V1SELinuxOptions.md)
 - [V1Scale](docs/V1Scale.md)
 - [V1ScaleSpec](docs/V1ScaleSpec.md)
 - [V1ScaleStatus](docs/V1ScaleStatus.md)
 - [V1Secret](docs/V1Secret.md)
 - [V1SecretKeySelector](docs/V1SecretKeySelector.md)
 - [V1SecretList](docs/V1SecretList.md)
 - [V1SecretVolumeSource](docs/V1SecretVolumeSource.md)
 - [V1SecurityContext](docs/V1SecurityContext.md)
 - [V1Service](docs/V1Service.md)
 - [V1ServiceAccount](docs/V1ServiceAccount.md)
 - [V1ServiceAccountList](docs/V1ServiceAccountList.md)
 - [V1ServiceList](docs/V1ServiceList.md)
 - [V1ServicePort](docs/V1ServicePort.md)
 - [V1ServiceSpec](docs/V1ServiceSpec.md)
 - [V1ServiceStatus](docs/V1ServiceStatus.md)
 - [V1TCPSocketAction](docs/V1TCPSocketAction.md)
 - [V1Volume](docs/V1Volume.md)
 - [V1VolumeMount](docs/V1VolumeMount.md)
 - [V1VsphereVirtualDiskVolumeSource](docs/V1VsphereVirtualDiskVolumeSource.md)
 - [V1alpha1CertificateSigningRequest](docs/V1alpha1CertificateSigningRequest.md)
 - [V1alpha1CertificateSigningRequestCondition](docs/V1alpha1CertificateSigningRequestCondition.md)
 - [V1alpha1CertificateSigningRequestList](docs/V1alpha1CertificateSigningRequestList.md)
 - [V1alpha1CertificateSigningRequestSpec](docs/V1alpha1CertificateSigningRequestSpec.md)
 - [V1alpha1CertificateSigningRequestStatus](docs/V1alpha1CertificateSigningRequestStatus.md)
 - [V1alpha1ClusterRole](docs/V1alpha1ClusterRole.md)
 - [V1alpha1ClusterRoleBinding](docs/V1alpha1ClusterRoleBinding.md)
 - [V1alpha1ClusterRoleBindingList](docs/V1alpha1ClusterRoleBindingList.md)
 - [V1alpha1ClusterRoleList](docs/V1alpha1ClusterRoleList.md)
 - [V1alpha1PolicyRule](docs/V1alpha1PolicyRule.md)
 - [V1alpha1Role](docs/V1alpha1Role.md)
 - [V1alpha1RoleBinding](docs/V1alpha1RoleBinding.md)
 - [V1alpha1RoleBindingList](docs/V1alpha1RoleBindingList.md)
 - [V1alpha1RoleList](docs/V1alpha1RoleList.md)
 - [V1alpha1RoleRef](docs/V1alpha1RoleRef.md)
 - [V1alpha1Subject](docs/V1alpha1Subject.md)
 - [V1beta1APIVersion](docs/V1beta1APIVersion.md)
 - [V1beta1CPUTargetUtilization](docs/V1beta1CPUTargetUtilization.md)
 - [V1beta1DaemonSet](docs/V1beta1DaemonSet.md)
 - [V1beta1DaemonSetList](docs/V1beta1DaemonSetList.md)
 - [V1beta1DaemonSetSpec](docs/V1beta1DaemonSetSpec.md)
 - [V1beta1DaemonSetStatus](docs/V1beta1DaemonSetStatus.md)
 - [V1beta1Deployment](docs/V1beta1Deployment.md)
 - [V1beta1DeploymentCondition](docs/V1beta1DeploymentCondition.md)
 - [V1beta1DeploymentList](docs/V1beta1DeploymentList.md)
 - [V1beta1DeploymentRollback](docs/V1beta1DeploymentRollback.md)
 - [V1beta1DeploymentSpec](docs/V1beta1DeploymentSpec.md)
 - [V1beta1DeploymentStatus](docs/V1beta1DeploymentStatus.md)
 - [V1beta1DeploymentStrategy](docs/V1beta1DeploymentStrategy.md)
 - [V1beta1Eviction](docs/V1beta1Eviction.md)
 - [V1beta1HTTPIngressPath](docs/V1beta1HTTPIngressPath.md)
 - [V1beta1HTTPIngressRuleValue](docs/V1beta1HTTPIngressRuleValue.md)
 - [V1beta1HorizontalPodAutoscaler](docs/V1beta1HorizontalPodAutoscaler.md)
 - [V1beta1HorizontalPodAutoscalerList](docs/V1beta1HorizontalPodAutoscalerList.md)
 - [V1beta1HorizontalPodAutoscalerSpec](docs/V1beta1HorizontalPodAutoscalerSpec.md)
 - [V1beta1HorizontalPodAutoscalerStatus](docs/V1beta1HorizontalPodAutoscalerStatus.md)
 - [V1beta1Ingress](docs/V1beta1Ingress.md)
 - [V1beta1IngressBackend](docs/V1beta1IngressBackend.md)
 - [V1beta1IngressList](docs/V1beta1IngressList.md)
 - [V1beta1IngressRule](docs/V1beta1IngressRule.md)
 - [V1beta1IngressSpec](docs/V1beta1IngressSpec.md)
 - [V1beta1IngressStatus](docs/V1beta1IngressStatus.md)
 - [V1beta1IngressTLS](docs/V1beta1IngressTLS.md)
 - [V1beta1Job](docs/V1beta1Job.md)
 - [V1beta1JobCondition](docs/V1beta1JobCondition.md)
 - [V1beta1JobList](docs/V1beta1JobList.md)
 - [V1beta1JobSpec](docs/V1beta1JobSpec.md)
 - [V1beta1JobStatus](docs/V1beta1JobStatus.md)
 - [V1beta1LocalSubjectAccessReview](docs/V1beta1LocalSubjectAccessReview.md)
 - [V1beta1NetworkPolicy](docs/V1beta1NetworkPolicy.md)
 - [V1beta1NetworkPolicyIngressRule](docs/V1beta1NetworkPolicyIngressRule.md)
 - [V1beta1NetworkPolicyList](docs/V1beta1NetworkPolicyList.md)
 - [V1beta1NetworkPolicyPeer](docs/V1beta1NetworkPolicyPeer.md)
 - [V1beta1NetworkPolicyPort](docs/V1beta1NetworkPolicyPort.md)
 - [V1beta1NetworkPolicySpec](docs/V1beta1NetworkPolicySpec.md)
 - [V1beta1NonResourceAttributes](docs/V1beta1NonResourceAttributes.md)
 - [V1beta1PodDisruptionBudget](docs/V1beta1PodDisruptionBudget.md)
 - [V1beta1PodDisruptionBudgetList](docs/V1beta1PodDisruptionBudgetList.md)
 - [V1beta1PodDisruptionBudgetSpec](docs/V1beta1PodDisruptionBudgetSpec.md)
 - [V1beta1PodDisruptionBudgetStatus](docs/V1beta1PodDisruptionBudgetStatus.md)
 - [V1beta1ReplicaSet](docs/V1beta1ReplicaSet.md)
 - [V1beta1ReplicaSetCondition](docs/V1beta1ReplicaSetCondition.md)
 - [V1beta1ReplicaSetList](docs/V1beta1ReplicaSetList.md)
 - [V1beta1ReplicaSetSpec](docs/V1beta1ReplicaSetSpec.md)
 - [V1beta1ReplicaSetStatus](docs/V1beta1ReplicaSetStatus.md)
 - [V1beta1ResourceAttributes](docs/V1beta1ResourceAttributes.md)
 - [V1beta1RollbackConfig](docs/V1beta1RollbackConfig.md)
 - [V1beta1RollingUpdateDeployment](docs/V1beta1RollingUpdateDeployment.md)
 - [V1beta1Scale](docs/V1beta1Scale.md)
 - [V1beta1ScaleSpec](docs/V1beta1ScaleSpec.md)
 - [V1beta1ScaleStatus](docs/V1beta1ScaleStatus.md)
 - [V1beta1SelfSubjectAccessReview](docs/V1beta1SelfSubjectAccessReview.md)
 - [V1beta1SelfSubjectAccessReviewSpec](docs/V1beta1SelfSubjectAccessReviewSpec.md)
 - [V1beta1StatefulSet](docs/V1beta1StatefulSet.md)
 - [V1beta1StatefulSetList](docs/V1beta1StatefulSetList.md)
 - [V1beta1StatefulSetSpec](docs/V1beta1StatefulSetSpec.md)
 - [V1beta1StatefulSetStatus](docs/V1beta1StatefulSetStatus.md)
 - [V1beta1StorageClass](docs/V1beta1StorageClass.md)
 - [V1beta1StorageClassList](docs/V1beta1StorageClassList.md)
 - [V1beta1SubjectAccessReview](docs/V1beta1SubjectAccessReview.md)
 - [V1beta1SubjectAccessReviewSpec](docs/V1beta1SubjectAccessReviewSpec.md)
 - [V1beta1SubjectAccessReviewStatus](docs/V1beta1SubjectAccessReviewStatus.md)
 - [V1beta1SubresourceReference](docs/V1beta1SubresourceReference.md)
 - [V1beta1ThirdPartyResource](docs/V1beta1ThirdPartyResource.md)
 - [V1beta1ThirdPartyResourceList](docs/V1beta1ThirdPartyResourceList.md)
 - [V1beta1TokenReview](docs/V1beta1TokenReview.md)
 - [V1beta1TokenReviewSpec](docs/V1beta1TokenReviewSpec.md)
 - [V1beta1TokenReviewStatus](docs/V1beta1TokenReviewStatus.md)
 - [V1beta1UserInfo](docs/V1beta1UserInfo.md)
 - [V2alpha1CronJob](docs/V2alpha1CronJob.md)
 - [V2alpha1CronJobList](docs/V2alpha1CronJobList.md)
 - [V2alpha1CronJobSpec](docs/V2alpha1CronJobSpec.md)
 - [V2alpha1CronJobStatus](docs/V2alpha1CronJobStatus.md)
 - [V2alpha1Job](docs/V2alpha1Job.md)
 - [V2alpha1JobCondition](docs/V2alpha1JobCondition.md)
 - [V2alpha1JobList](docs/V2alpha1JobList.md)
 - [V2alpha1JobSpec](docs/V2alpha1JobSpec.md)
 - [V2alpha1JobStatus](docs/V2alpha1JobStatus.md)
 - [V2alpha1JobTemplateSpec](docs/V2alpha1JobTemplateSpec.md)
 - [VersionInfo](docs/VersionInfo.md)
 - [VersionedEvent](docs/VersionedEvent.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



