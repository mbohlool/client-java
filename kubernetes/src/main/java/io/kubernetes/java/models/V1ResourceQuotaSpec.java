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


package io.kubernetes.java.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.java.models.ResourceQuantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 */
@ApiModel(description = "ResourceQuotaSpec defines the desired hard limits to enforce for Quota.")

public class V1ResourceQuotaSpec {
  @SerializedName("hard")
  private Map<String, ResourceQuantity> hard = new HashMap<String, ResourceQuantity>();

  @SerializedName("scopes")
  private List<String> scopes = new ArrayList<String>();

  public V1ResourceQuotaSpec hard(Map<String, ResourceQuantity> hard) {
    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaSpec putHardItem(String key, ResourceQuantity hardItem) {
    this.hard.put(key, hardItem);
    return this;
  }

   /**
   * Hard is the set of desired hard limits for each named resource. More info: http://releases.k8s.io/HEAD/docs/design/admission_control_resource_quota.md#admissioncontrol-plugin-resourcequota
   * @return hard
  **/
  @ApiModelProperty(example = "null", value = "Hard is the set of desired hard limits for each named resource. More info: http://releases.k8s.io/HEAD/docs/design/admission_control_resource_quota.md#admissioncontrol-plugin-resourcequota")
  public Map<String, ResourceQuantity> getHard() {
    return hard;
  }

  public void setHard(Map<String, ResourceQuantity> hard) {
    this.hard = hard;
  }

  public V1ResourceQuotaSpec scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public V1ResourceQuotaSpec addScopesItem(String scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
   * @return scopes
  **/
  @ApiModelProperty(example = "null", value = "A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaSpec v1ResourceQuotaSpec = (V1ResourceQuotaSpec) o;
    return Objects.equals(this.hard, v1ResourceQuotaSpec.hard) &&
        Objects.equals(this.scopes, v1ResourceQuotaSpec.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaSpec {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

