/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.5.1-660c2a2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.java.apis;

import io.kubernetes.java.ApiException;
import io.kubernetes.java.models.UnversionedAPIResourceList;
import io.kubernetes.java.models.UnversionedPatch;
import io.kubernetes.java.models.UnversionedStatus;
import io.kubernetes.java.models.V1DeleteOptions;
import io.kubernetes.java.models.V1beta1StorageClass;
import io.kubernetes.java.models.V1beta1StorageClassList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageV1beta1Api
 */
@Ignore
public class StorageV1beta1ApiTest {

    private final StorageV1beta1Api api = new StorageV1beta1Api();

    
    /**
     * 
     *
     * create a StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStorageClassTest() throws ApiException {
        V1beta1StorageClass body = null;
        String pretty = null;
        V1beta1StorageClass response = api.createStorageClass(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionStorageClassTest() throws ApiException {
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        UnversionedStatus response = api.deleteCollectionStorageClass(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStorageClassTest() throws ApiException {
        String name = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        UnversionedStatus response = api.deleteStorageClass(name, body, pretty, gracePeriodSeconds, orphanDependents);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        UnversionedAPIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStorageClassTest() throws ApiException {
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1StorageClassList response = api.listStorageClass(pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStorageClassTest() throws ApiException {
        String name = null;
        UnversionedPatch body = null;
        String pretty = null;
        V1beta1StorageClass response = api.patchStorageClass(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readStorageClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1StorageClass response = api.readStorageClass(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceStorageClassTest() throws ApiException {
        String name = null;
        V1beta1StorageClass body = null;
        String pretty = null;
        V1beta1StorageClass response = api.replaceStorageClass(name, body, pretty);

        // TODO: test validations
    }
    
}