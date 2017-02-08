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
import io.kubernetes.java.models.UnversionedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobCondition describes current state of a job.
 */
@ApiModel(description = "JobCondition describes current state of a job.")

public class V1beta1JobCondition {
  @SerializedName("lastProbeTime")
  private UnversionedTime lastProbeTime = null;

  @SerializedName("lastTransitionTime")
  private UnversionedTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public V1beta1JobCondition lastProbeTime(UnversionedTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time the condition was checked.
   * @return lastProbeTime
  **/
  @ApiModelProperty(example = "null", value = "Last time the condition was checked.")
  public UnversionedTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(UnversionedTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public V1beta1JobCondition lastTransitionTime(UnversionedTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(example = "null", value = "Last time the condition transit from one status to another.")
  public UnversionedTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(UnversionedTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1beta1JobCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Human readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1beta1JobCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition's last transition.
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "(brief) reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1JobCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1beta1JobCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of job condition, Complete or Failed.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of job condition, Complete or Failed.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JobCondition v1beta1JobCondition = (V1beta1JobCondition) o;
    return Objects.equals(this.lastProbeTime, v1beta1JobCondition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, v1beta1JobCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1beta1JobCondition.message) &&
        Objects.equals(this.reason, v1beta1JobCondition.reason) &&
        Objects.equals(this.status, v1beta1JobCondition.status) &&
        Objects.equals(this.type, v1beta1JobCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JobCondition {\n");
    
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

