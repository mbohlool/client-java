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
import io.kubernetes.java.models.V1HorizontalPodAutoscaler;
import io.kubernetes.java.models.V1HorizontalPodAutoscalerList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Autoscaling_v1Api
 */
@Ignore
public class Autoscaling_v1ApiTest {

    private final Autoscaling_v1Api api = new Autoscaling_v1Api();

    
    /**
     * 
     *
     * create a HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
        V1HorizontalPodAutoscaler body = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.createNamespacedHorizontalPodAutoscaler(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        UnversionedStatus response = api.deleteCollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        UnversionedStatus response = api.deleteNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents);

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
     * list or watch objects of kind HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHorizontalPodAutoscalerForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1HorizontalPodAutoscalerList response = api.listHorizontalPodAutoscalerForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1HorizontalPodAutoscalerList response = api.listNamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        UnversionedPatch body = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.patchNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        UnversionedPatch body = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.patchNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1HorizontalPodAutoscaler response = api.readNamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.readNamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1HorizontalPodAutoscaler body = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.replaceNamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1HorizontalPodAutoscaler body = null;
        String pretty = null;
        V1HorizontalPodAutoscaler response = api.replaceNamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
