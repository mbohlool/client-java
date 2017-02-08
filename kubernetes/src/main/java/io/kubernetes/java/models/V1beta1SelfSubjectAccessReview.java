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
import io.kubernetes.java.models.V1ObjectMeta;
import io.kubernetes.java.models.V1beta1SelfSubjectAccessReviewSpec;
import io.kubernetes.java.models.V1beta1SubjectAccessReviewStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means \&quot;in all namespaces\&quot;.  Self is a special case, because users should always be able to check whether they can perform an action
 */
@ApiModel(description = "SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means \"in all namespaces\".  Self is a special case, because users should always be able to check whether they can perform an action")

public class V1beta1SelfSubjectAccessReview {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1beta1SelfSubjectAccessReviewSpec spec = null;

  @SerializedName("status")
  private V1beta1SubjectAccessReviewStatus status = null;

  public V1beta1SelfSubjectAccessReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta1SelfSubjectAccessReview kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta1SelfSubjectAccessReview metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1SelfSubjectAccessReview spec(V1beta1SelfSubjectAccessReviewSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec holds information about the request being evaluated.  user and groups must be empty
   * @return spec
  **/
  @ApiModelProperty(example = "null", required = true, value = "Spec holds information about the request being evaluated.  user and groups must be empty")
  public V1beta1SelfSubjectAccessReviewSpec getSpec() {
    return spec;
  }

  public void setSpec(V1beta1SelfSubjectAccessReviewSpec spec) {
    this.spec = spec;
  }

  public V1beta1SelfSubjectAccessReview status(V1beta1SubjectAccessReviewStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is filled in by the server and indicates whether the request is allowed or not
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status is filled in by the server and indicates whether the request is allowed or not")
  public V1beta1SubjectAccessReviewStatus getStatus() {
    return status;
  }

  public void setStatus(V1beta1SubjectAccessReviewStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectAccessReview v1beta1SelfSubjectAccessReview = (V1beta1SelfSubjectAccessReview) o;
    return Objects.equals(this.apiVersion, v1beta1SelfSubjectAccessReview.apiVersion) &&
        Objects.equals(this.kind, v1beta1SelfSubjectAccessReview.kind) &&
        Objects.equals(this.metadata, v1beta1SelfSubjectAccessReview.metadata) &&
        Objects.equals(this.spec, v1beta1SelfSubjectAccessReview.spec) &&
        Objects.equals(this.status, v1beta1SelfSubjectAccessReview.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectAccessReview {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
