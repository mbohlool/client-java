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
import io.kubernetes.java.models.UnversionedListMeta;
import io.kubernetes.java.models.V1beta1Job;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * JobList is a collection of jobs. DEPRECATED: extensions/v1beta1.JobList is deprecated, use batch/v1.JobList instead.
 */
@ApiModel(description = "JobList is a collection of jobs. DEPRECATED: extensions/v1beta1.JobList is deprecated, use batch/v1.JobList instead.")

public class V1beta1JobList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V1beta1Job> items = new ArrayList<V1beta1Job>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private UnversionedListMeta metadata = null;

  public V1beta1JobList apiVersion(String apiVersion) {
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

  public V1beta1JobList items(List<V1beta1Job> items) {
    this.items = items;
    return this;
  }

  public V1beta1JobList addItemsItem(V1beta1Job itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is the list of Job.
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "Items is the list of Job.")
  public List<V1beta1Job> getItems() {
    return items;
  }

  public void setItems(List<V1beta1Job> items) {
    this.items = items;
  }

  public V1beta1JobList kind(String kind) {
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

  public V1beta1JobList metadata(UnversionedListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Standard list metadata More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata")
  public UnversionedListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(UnversionedListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JobList v1beta1JobList = (V1beta1JobList) o;
    return Objects.equals(this.apiVersion, v1beta1JobList.apiVersion) &&
        Objects.equals(this.items, v1beta1JobList.items) &&
        Objects.equals(this.kind, v1beta1JobList.kind) &&
        Objects.equals(this.metadata, v1beta1JobList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JobList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

