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
import io.kubernetes.java.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
@ApiModel(description = "EndpointAddress is a tuple that describes single IP address.")

public class V1EndpointAddress {
  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("targetRef")
  private V1ObjectReference targetRef = null;

  public V1EndpointAddress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The Hostname of this endpoint
   * @return hostname
  **/
  @ApiModelProperty(example = "null", value = "The Hostname of this endpoint")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1EndpointAddress ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
   * @return ip
  **/
  @ApiModelProperty(example = "null", required = true, value = "The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public V1EndpointAddress nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   * @return nodeName
  **/
  @ApiModelProperty(example = "null", value = "Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1EndpointAddress targetRef(V1ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

   /**
   * Reference to object providing the endpoint.
   * @return targetRef
  **/
  @ApiModelProperty(example = "null", value = "Reference to object providing the endpoint.")
  public V1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(V1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointAddress v1EndpointAddress = (V1EndpointAddress) o;
    return Objects.equals(this.hostname, v1EndpointAddress.hostname) &&
        Objects.equals(this.ip, v1EndpointAddress.ip) &&
        Objects.equals(this.nodeName, v1EndpointAddress.nodeName) &&
        Objects.equals(this.targetRef, v1EndpointAddress.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, nodeName, targetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointAddress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

