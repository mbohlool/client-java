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
import io.kubernetes.java.models.UnversionedStatusCause;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
@ApiModel(description = "StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.")

public class UnversionedStatusDetails {
  @SerializedName("causes")
  private List<UnversionedStatusCause> causes = new ArrayList<UnversionedStatusCause>();

  @SerializedName("group")
  private String group = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("retryAfterSeconds")
  private Integer retryAfterSeconds = null;

  public UnversionedStatusDetails causes(List<UnversionedStatusCause> causes) {
    this.causes = causes;
    return this;
  }

  public UnversionedStatusDetails addCausesItem(UnversionedStatusCause causesItem) {
    this.causes.add(causesItem);
    return this;
  }

   /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
   * @return causes
  **/
  @ApiModelProperty(example = "null", value = "The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.")
  public List<UnversionedStatusCause> getCauses() {
    return causes;
  }

  public void setCauses(List<UnversionedStatusCause> causes) {
    this.causes = causes;
  }

  public UnversionedStatusDetails group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group attribute of the resource associated with the status StatusReason.
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "The group attribute of the resource associated with the status StatusReason.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public UnversionedStatusDetails kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public UnversionedStatusDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnversionedStatusDetails retryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

   /**
   * If specified, the time in seconds before the operation should be retried.
   * @return retryAfterSeconds
  **/
  @ApiModelProperty(example = "null", value = "If specified, the time in seconds before the operation should be retried.")
  public Integer getRetryAfterSeconds() {
    return retryAfterSeconds;
  }

  public void setRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnversionedStatusDetails unversionedStatusDetails = (UnversionedStatusDetails) o;
    return Objects.equals(this.causes, unversionedStatusDetails.causes) &&
        Objects.equals(this.group, unversionedStatusDetails.group) &&
        Objects.equals(this.kind, unversionedStatusDetails.kind) &&
        Objects.equals(this.name, unversionedStatusDetails.name) &&
        Objects.equals(this.retryAfterSeconds, unversionedStatusDetails.retryAfterSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causes, group, kind, name, retryAfterSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnversionedStatusDetails {\n");
    
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retryAfterSeconds: ").append(toIndentedString(retryAfterSeconds)).append("\n");
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

