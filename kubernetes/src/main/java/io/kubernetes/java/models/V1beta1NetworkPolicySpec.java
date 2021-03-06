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
import io.kubernetes.java.models.V1beta1NetworkPolicyIngressRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1NetworkPolicySpec
 */

public class V1beta1NetworkPolicySpec {
  @SerializedName("ingress")
  private List<V1beta1NetworkPolicyIngressRule> ingress = new ArrayList<V1beta1NetworkPolicyIngressRule>();

  @SerializedName("podSelector")
  private UnversionedLabelSelector podSelector = null;

  public V1beta1NetworkPolicySpec ingress(List<V1beta1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
    return this;
  }

  public V1beta1NetworkPolicySpec addIngressItem(V1beta1NetworkPolicyIngressRule ingressItem) {
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if namespace.networkPolicy.ingress.isolation is undefined and cluster policy allows it, OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not affect ingress isolation. If this field is present and contains at least one rule, this policy allows any traffic which matches at least one of the ingress rules in this list.
   * @return ingress
  **/
  @ApiModelProperty(example = "null", value = "List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if namespace.networkPolicy.ingress.isolation is undefined and cluster policy allows it, OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not affect ingress isolation. If this field is present and contains at least one rule, this policy allows any traffic which matches at least one of the ingress rules in this list.")
  public List<V1beta1NetworkPolicyIngressRule> getIngress() {
    return ingress;
  }

  public void setIngress(List<V1beta1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
  }

  public V1beta1NetworkPolicySpec podSelector(UnversionedLabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

   /**
   * Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
   * @return podSelector
  **/
  @ApiModelProperty(example = "null", required = true, value = "Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.")
  public UnversionedLabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(UnversionedLabelSelector podSelector) {
    this.podSelector = podSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicySpec v1beta1NetworkPolicySpec = (V1beta1NetworkPolicySpec) o;
    return Objects.equals(this.ingress, v1beta1NetworkPolicySpec.ingress) &&
        Objects.equals(this.podSelector, v1beta1NetworkPolicySpec.podSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress, podSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicySpec {\n");
    
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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

