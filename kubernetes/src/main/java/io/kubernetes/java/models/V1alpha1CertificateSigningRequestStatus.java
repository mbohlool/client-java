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
import io.kubernetes.java.models.V1alpha1CertificateSigningRequestCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha1CertificateSigningRequestStatus
 */

public class V1alpha1CertificateSigningRequestStatus {
  @SerializedName("certificate")
  private byte[] certificate = null;

  @SerializedName("conditions")
  private List<V1alpha1CertificateSigningRequestCondition> conditions = new ArrayList<V1alpha1CertificateSigningRequestCondition>();

  public V1alpha1CertificateSigningRequestStatus certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * If request was approved, the controller will place the issued certificate here.
   * @return certificate
  **/
  @ApiModelProperty(example = "null", value = "If request was approved, the controller will place the issued certificate here.")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1alpha1CertificateSigningRequestStatus conditions(List<V1alpha1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1alpha1CertificateSigningRequestStatus addConditionsItem(V1alpha1CertificateSigningRequestCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions applied to the request, such as approval or denial.
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "Conditions applied to the request, such as approval or denial.")
  public List<V1alpha1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1CertificateSigningRequestStatus v1alpha1CertificateSigningRequestStatus = (V1alpha1CertificateSigningRequestStatus) o;
    return Objects.equals(this.certificate, v1alpha1CertificateSigningRequestStatus.certificate) &&
        Objects.equals(this.conditions, v1alpha1CertificateSigningRequestStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1CertificateSigningRequestStatus {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

