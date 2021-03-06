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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 */
@ApiModel(description = "ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface")

public class V1beta1ResourceAttributes {
  @SerializedName("group")
  private String group = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("subresource")
  private String subresource = null;

  @SerializedName("verb")
  private String verb = null;

  @SerializedName("version")
  private String version = null;

  public V1beta1ResourceAttributes group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Group is the API Group of the Resource.  \"*\" means all.
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "Group is the API Group of the Resource.  \"*\" means all.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1beta1ResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1ResourceAttributes namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
   * @return namespace
  **/
  @ApiModelProperty(example = "null", value = "Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1beta1ResourceAttributes resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource is one of the existing resource types.  \"*\" means all.
   * @return resource
  **/
  @ApiModelProperty(example = "null", value = "Resource is one of the existing resource types.  \"*\" means all.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public V1beta1ResourceAttributes subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

   /**
   * Subresource is one of the existing resource types.  \"\" means none.
   * @return subresource
  **/
  @ApiModelProperty(example = "null", value = "Subresource is one of the existing resource types.  \"\" means none.")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public V1beta1ResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.
   * @return verb
  **/
  @ApiModelProperty(example = "null", value = "Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  public V1beta1ResourceAttributes version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version is the API Version of the Resource.  \"*\" means all.
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "Version is the API Version of the Resource.  \"*\" means all.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ResourceAttributes v1beta1ResourceAttributes = (V1beta1ResourceAttributes) o;
    return Objects.equals(this.group, v1beta1ResourceAttributes.group) &&
        Objects.equals(this.name, v1beta1ResourceAttributes.name) &&
        Objects.equals(this.namespace, v1beta1ResourceAttributes.namespace) &&
        Objects.equals(this.resource, v1beta1ResourceAttributes.resource) &&
        Objects.equals(this.subresource, v1beta1ResourceAttributes.subresource) &&
        Objects.equals(this.verb, v1beta1ResourceAttributes.verb) &&
        Objects.equals(this.version, v1beta1ResourceAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, name, namespace, resource, subresource, verb, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ResourceAttributes {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

