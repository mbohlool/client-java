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
import io.kubernetes.java.models.UnversionedAPIGroupList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApisApi
 */
@Ignore
public class ApisApiTest {

    private final ApisApi api = new ApisApi();

    
    /**
     * 
     *
     * get available API versions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIVersionsTest() throws ApiException {
        UnversionedAPIGroupList response = api.getAPIVersions();

        // TODO: test validations
    }
    
}
