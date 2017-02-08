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
import io.kubernetes.java.models.V1beta1CPUTargetUtilization;
import io.kubernetes.java.models.V1beta1SubresourceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * specification of a horizontal pod autoscaler.
 */
@ApiModel(description = "specification of a horizontal pod autoscaler.")

public class V1beta1HorizontalPodAutoscalerSpec {
  @SerializedName("cpuUtilization")
  private V1beta1CPUTargetUtilization cpuUtilization = null;

  @SerializedName("maxReplicas")
  private Integer maxReplicas = null;

  @SerializedName("minReplicas")
  private Integer minReplicas = null;

  @SerializedName("scaleRef")
  private V1beta1SubresourceReference scaleRef = null;

  public V1beta1HorizontalPodAutoscalerSpec cpuUtilization(V1beta1CPUTargetUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
    return this;
  }

   /**
   * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources.
   * @return cpuUtilization
  **/
  @ApiModelProperty(example = "null", value = "target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources.")
  public V1beta1CPUTargetUtilization getCpuUtilization() {
    return cpuUtilization;
  }

  public void setCpuUtilization(V1beta1CPUTargetUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
  }

  public V1beta1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
   * @return maxReplicas
  **/
  @ApiModelProperty(example = "null", required = true, value = "upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public V1beta1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * lower limit for the number of pods that can be set by the autoscaler, default 1.
   * @return minReplicas
  **/
  @ApiModelProperty(example = "null", value = "lower limit for the number of pods that can be set by the autoscaler, default 1.")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public V1beta1HorizontalPodAutoscalerSpec scaleRef(V1beta1SubresourceReference scaleRef) {
    this.scaleRef = scaleRef;
    return this;
  }

   /**
   * reference to Scale subresource; horizontal pod autoscaler will learn the current resource consumption from its status, and will set the desired number of pods by modifying its spec.
   * @return scaleRef
  **/
  @ApiModelProperty(example = "null", required = true, value = "reference to Scale subresource; horizontal pod autoscaler will learn the current resource consumption from its status, and will set the desired number of pods by modifying its spec.")
  public V1beta1SubresourceReference getScaleRef() {
    return scaleRef;
  }

  public void setScaleRef(V1beta1SubresourceReference scaleRef) {
    this.scaleRef = scaleRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1HorizontalPodAutoscalerSpec v1beta1HorizontalPodAutoscalerSpec = (V1beta1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.cpuUtilization, v1beta1HorizontalPodAutoscalerSpec.cpuUtilization) &&
        Objects.equals(this.maxReplicas, v1beta1HorizontalPodAutoscalerSpec.maxReplicas) &&
        Objects.equals(this.minReplicas, v1beta1HorizontalPodAutoscalerSpec.minReplicas) &&
        Objects.equals(this.scaleRef, v1beta1HorizontalPodAutoscalerSpec.scaleRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUtilization, maxReplicas, minReplicas, scaleRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1HorizontalPodAutoscalerSpec {\n");
    
    sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleRef: ").append(toIndentedString(scaleRef)).append("\n");
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

