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
import io.kubernetes.java.models.V2alpha1JobCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * JobStatus represents the current state of a Job.
 */
@ApiModel(description = "JobStatus represents the current state of a Job.")

public class V2alpha1JobStatus {
  @SerializedName("active")
  private Integer active = null;

  @SerializedName("completionTime")
  private UnversionedTime completionTime = null;

  @SerializedName("conditions")
  private List<V2alpha1JobCondition> conditions = new ArrayList<V2alpha1JobCondition>();

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("startTime")
  private UnversionedTime startTime = null;

  @SerializedName("succeeded")
  private Integer succeeded = null;

  public V2alpha1JobStatus active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * Active is the number of actively running pods.
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "Active is the number of actively running pods.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public V2alpha1JobStatus completionTime(UnversionedTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * CompletionTime represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(example = "null", value = "CompletionTime represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public UnversionedTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(UnversionedTime completionTime) {
    this.completionTime = completionTime;
  }

  public V2alpha1JobStatus conditions(List<V2alpha1JobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V2alpha1JobStatus addConditionsItem(V2alpha1JobCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions represent the latest available observations of an object's current state. More info: http://kubernetes.io/docs/user-guide/jobs
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "Conditions represent the latest available observations of an object's current state. More info: http://kubernetes.io/docs/user-guide/jobs")
  public List<V2alpha1JobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V2alpha1JobCondition> conditions) {
    this.conditions = conditions;
  }

  public V2alpha1JobStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Failed is the number of pods which reached Phase Failed.
   * @return failed
  **/
  @ApiModelProperty(example = "null", value = "Failed is the number of pods which reached Phase Failed.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public V2alpha1JobStatus startTime(UnversionedTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * StartTime represents time when the job was acknowledged by the Job Manager. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "StartTime represents time when the job was acknowledged by the Job Manager. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public UnversionedTime getStartTime() {
    return startTime;
  }

  public void setStartTime(UnversionedTime startTime) {
    this.startTime = startTime;
  }

  public V2alpha1JobStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Succeeded is the number of pods which reached Phase Succeeded.
   * @return succeeded
  **/
  @ApiModelProperty(example = "null", value = "Succeeded is the number of pods which reached Phase Succeeded.")
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1JobStatus v2alpha1JobStatus = (V2alpha1JobStatus) o;
    return Objects.equals(this.active, v2alpha1JobStatus.active) &&
        Objects.equals(this.completionTime, v2alpha1JobStatus.completionTime) &&
        Objects.equals(this.conditions, v2alpha1JobStatus.conditions) &&
        Objects.equals(this.failed, v2alpha1JobStatus.failed) &&
        Objects.equals(this.startTime, v2alpha1JobStatus.startTime) &&
        Objects.equals(this.succeeded, v2alpha1JobStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completionTime, conditions, failed, startTime, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1JobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

