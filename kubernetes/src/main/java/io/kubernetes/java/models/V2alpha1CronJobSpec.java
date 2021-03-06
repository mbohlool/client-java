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
import io.kubernetes.java.models.V2alpha1JobTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 */
@ApiModel(description = "CronJobSpec describes how the job execution will look like and when it will actually run.")

public class V2alpha1CronJobSpec {
  @SerializedName("concurrencyPolicy")
  private String concurrencyPolicy = null;

  @SerializedName("jobTemplate")
  private V2alpha1JobTemplateSpec jobTemplate = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("startingDeadlineSeconds")
  private Long startingDeadlineSeconds = null;

  @SerializedName("suspend")
  private Boolean suspend = null;

  public V2alpha1CronJobSpec concurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

   /**
   * ConcurrencyPolicy specifies how to treat concurrent executions of a Job.
   * @return concurrencyPolicy
  **/
  @ApiModelProperty(example = "null", value = "ConcurrencyPolicy specifies how to treat concurrent executions of a Job.")
  public String getConcurrencyPolicy() {
    return concurrencyPolicy;
  }

  public void setConcurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }

  public V2alpha1CronJobSpec jobTemplate(V2alpha1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
    return this;
  }

   /**
   * JobTemplate is the object that describes the job that will be created when executing a CronJob.
   * @return jobTemplate
  **/
  @ApiModelProperty(example = "null", required = true, value = "JobTemplate is the object that describes the job that will be created when executing a CronJob.")
  public V2alpha1JobTemplateSpec getJobTemplate() {
    return jobTemplate;
  }

  public void setJobTemplate(V2alpha1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
  }

  public V2alpha1CronJobSpec schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule contains the schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   * @return schedule
  **/
  @ApiModelProperty(example = "null", required = true, value = "Schedule contains the schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public V2alpha1CronJobSpec startingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

   /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
   * @return startingDeadlineSeconds
  **/
  @ApiModelProperty(example = "null", value = "Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
  public Long getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }

  public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }

  public V2alpha1CronJobSpec suspend(Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

   /**
   * Suspend flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
   * @return suspend
  **/
  @ApiModelProperty(example = "null", value = "Suspend flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.")
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1CronJobSpec v2alpha1CronJobSpec = (V2alpha1CronJobSpec) o;
    return Objects.equals(this.concurrencyPolicy, v2alpha1CronJobSpec.concurrencyPolicy) &&
        Objects.equals(this.jobTemplate, v2alpha1CronJobSpec.jobTemplate) &&
        Objects.equals(this.schedule, v2alpha1CronJobSpec.schedule) &&
        Objects.equals(this.startingDeadlineSeconds, v2alpha1CronJobSpec.startingDeadlineSeconds) &&
        Objects.equals(this.suspend, v2alpha1CronJobSpec.suspend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrencyPolicy, jobTemplate, schedule, startingDeadlineSeconds, suspend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1CronJobSpec {\n");
    
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
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

