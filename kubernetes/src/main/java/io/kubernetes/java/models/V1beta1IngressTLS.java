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
import java.util.ArrayList;
import java.util.List;

/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 */
@ApiModel(description = "IngressTLS describes the transport layer security associated with an Ingress.")

public class V1beta1IngressTLS {
  @SerializedName("hosts")
  private List<String> hosts = new ArrayList<String>();

  @SerializedName("secretName")
  private String secretName = null;

  public V1beta1IngressTLS hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public V1beta1IngressTLS addHostsItem(String hostsItem) {
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
   * @return hosts
  **/
  @ApiModelProperty(example = "null", value = "Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.")
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public V1beta1IngressTLS secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

   /**
   * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \"Host\" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
   * @return secretName
  **/
  @ApiModelProperty(example = "null", value = "SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \"Host\" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IngressTLS v1beta1IngressTLS = (V1beta1IngressTLS) o;
    return Objects.equals(this.hosts, v1beta1IngressTLS.hosts) &&
        Objects.equals(this.secretName, v1beta1IngressTLS.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, secretName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IngressTLS {\n");
    
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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

