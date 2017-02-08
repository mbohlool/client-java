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
import io.kubernetes.java.models.UnversionedLabelSelector;
import io.kubernetes.java.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobSpec describes how the job execution will look like.
 */
@ApiModel(description = "JobSpec describes how the job execution will look like.")

public class V1beta1JobSpec {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("autoSelector")
  private Boolean autoSelector = null;

  @SerializedName("completions")
  private Integer completions = null;

  @SerializedName("parallelism")
  private Integer parallelism = null;

  @SerializedName("selector")
  private UnversionedLabelSelector selector = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public V1beta1JobSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(example = "null", value = "Optional duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1beta1JobSpec autoSelector(Boolean autoSelector) {
    this.autoSelector = autoSelector;
    return this;
  }

   /**
   * AutoSelector controls generation of pod labels and pod selectors. It was not present in the original extensions/v1beta1 Job definition, but exists to allow conversion from batch/v1 Jobs, where it corresponds to, but has the opposite meaning as, ManualSelector. More info: http://releases.k8s.io/HEAD/docs/design/selector-generation.md
   * @return autoSelector
  **/
  @ApiModelProperty(example = "null", value = "AutoSelector controls generation of pod labels and pod selectors. It was not present in the original extensions/v1beta1 Job definition, but exists to allow conversion from batch/v1 Jobs, where it corresponds to, but has the opposite meaning as, ManualSelector. More info: http://releases.k8s.io/HEAD/docs/design/selector-generation.md")
  public Boolean getAutoSelector() {
    return autoSelector;
  }

  public void setAutoSelector(Boolean autoSelector) {
    this.autoSelector = autoSelector;
  }

  public V1beta1JobSpec completions(Integer completions) {
    this.completions = completions;
    return this;
  }

   /**
   * Completions specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: http://kubernetes.io/docs/user-guide/jobs
   * @return completions
  **/
  @ApiModelProperty(example = "null", value = "Completions specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: http://kubernetes.io/docs/user-guide/jobs")
  public Integer getCompletions() {
    return completions;
  }

  public void setCompletions(Integer completions) {
    this.completions = completions;
  }

  public V1beta1JobSpec parallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: http://kubernetes.io/docs/user-guide/jobs
   * @return parallelism
  **/
  @ApiModelProperty(example = "null", value = "Parallelism specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: http://kubernetes.io/docs/user-guide/jobs")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public V1beta1JobSpec selector(UnversionedLabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over pods that should match the pod count. Normally, the system sets this field for you. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors
   * @return selector
  **/
  @ApiModelProperty(example = "null", value = "Selector is a label query over pods that should match the pod count. Normally, the system sets this field for you. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors")
  public UnversionedLabelSelector getSelector() {
    return selector;
  }

  public void setSelector(UnversionedLabelSelector selector) {
    this.selector = selector;
  }

  public V1beta1JobSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the pod that will be created when executing a job. More info: http://kubernetes.io/docs/user-guide/jobs
   * @return template
  **/
  @ApiModelProperty(example = "null", required = true, value = "Template is the object that describes the pod that will be created when executing a job. More info: http://kubernetes.io/docs/user-guide/jobs")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JobSpec v1beta1JobSpec = (V1beta1JobSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1beta1JobSpec.activeDeadlineSeconds) &&
        Objects.equals(this.autoSelector, v1beta1JobSpec.autoSelector) &&
        Objects.equals(this.completions, v1beta1JobSpec.completions) &&
        Objects.equals(this.parallelism, v1beta1JobSpec.parallelism) &&
        Objects.equals(this.selector, v1beta1JobSpec.selector) &&
        Objects.equals(this.template, v1beta1JobSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, autoSelector, completions, parallelism, selector, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JobSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    autoSelector: ").append(toIndentedString(autoSelector)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

