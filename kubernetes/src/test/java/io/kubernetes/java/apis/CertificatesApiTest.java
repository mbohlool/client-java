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
import io.kubernetes.java.models.UnversionedAPIGroup;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificatesApi
 */
@Ignore
public class CertificatesApiTest {

    private final CertificatesApi api = new CertificatesApi();

    
    /**
     * 
     *
     * get information of a group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIGroupTest() throws ApiException {
        UnversionedAPIGroup response = api.getAPIGroup();

        // TODO: test validations
    }
    
}