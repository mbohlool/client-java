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
import io.kubernetes.java.models.V1beta1StorageClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * StorageClassList is a collection of storage classes.
 */
@ApiModel(description = "StorageClassList is a collection of storage classes.")

public class V1beta1StorageClassList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V1beta1StorageClass> items = new ArrayList<V1beta1StorageClass>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private UnversionedListMeta metadata = null;

  public V1beta1StorageClassList apiVersion(String apiVersion) {
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

  public V1beta1StorageClassList items(List<V1beta1StorageClass> items) {
    this.items = items;
    return this;
  }

  public V1beta1StorageClassList addItemsItem(V1beta1StorageClass itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is the list of StorageClasses
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "Items is the list of StorageClasses")
  public List<V1beta1StorageClass> getItems() {
    return items;
  }

  public void setItems(List<V1beta1StorageClass> items) {
    this.items = items;
  }

  public V1beta1StorageClassList kind(String kind) {
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

  public V1beta1StorageClassList metadata(UnversionedListMeta metadata) {
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
    V1beta1StorageClassList v1beta1StorageClassList = (V1beta1StorageClassList) o;
    return Objects.equals(this.apiVersion, v1beta1StorageClassList.apiVersion) &&
        Objects.equals(this.items, v1beta1StorageClassList.items) &&
        Objects.equals(this.kind, v1beta1StorageClassList.kind) &&
        Objects.equals(this.metadata, v1beta1StorageClassList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1StorageClassList {\n");
    
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

