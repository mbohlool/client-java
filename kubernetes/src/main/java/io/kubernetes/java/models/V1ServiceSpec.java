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
import io.kubernetes.java.models.V1ServicePort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
@ApiModel(description = "ServiceSpec describes the attributes that a user creates on a service.")

public class V1ServiceSpec {
  @SerializedName("clusterIP")
  private String clusterIP = null;

  @SerializedName("deprecatedPublicIPs")
  private List<String> deprecatedPublicIPs = new ArrayList<String>();

  @SerializedName("externalIPs")
  private List<String> externalIPs = new ArrayList<String>();

  @SerializedName("externalName")
  private String externalName = null;

  @SerializedName("loadBalancerIP")
  private String loadBalancerIP = null;

  @SerializedName("loadBalancerSourceRanges")
  private List<String> loadBalancerSourceRanges = new ArrayList<String>();

  @SerializedName("ports")
  private List<V1ServicePort> ports = new ArrayList<V1ServicePort>();

  @SerializedName("selector")
  private Map<String, String> selector = new HashMap<String, String>();

  @SerializedName("sessionAffinity")
  private String sessionAffinity = null;

  @SerializedName("type")
  private String type = null;

  public V1ServiceSpec clusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

   /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
   * @return clusterIP
  **/
  @ApiModelProperty(example = "null", value = "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies")
  public String getClusterIP() {
    return clusterIP;
  }

  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }

  public V1ServiceSpec deprecatedPublicIPs(List<String> deprecatedPublicIPs) {
    this.deprecatedPublicIPs = deprecatedPublicIPs;
    return this;
  }

  public V1ServiceSpec addDeprecatedPublicIPsItem(String deprecatedPublicIPsItem) {
    this.deprecatedPublicIPs.add(deprecatedPublicIPsItem);
    return this;
  }

   /**
   * deprecatedPublicIPs is deprecated and replaced by the externalIPs field with almost the exact same semantics.  This field is retained in the v1 API for compatibility until at least 8/20/2016.  It will be removed from any new API revisions.  If both deprecatedPublicIPs *and* externalIPs are set, deprecatedPublicIPs is used.
   * @return deprecatedPublicIPs
  **/
  @ApiModelProperty(example = "null", value = "deprecatedPublicIPs is deprecated and replaced by the externalIPs field with almost the exact same semantics.  This field is retained in the v1 API for compatibility until at least 8/20/2016.  It will be removed from any new API revisions.  If both deprecatedPublicIPs *and* externalIPs are set, deprecatedPublicIPs is used.")
  public List<String> getDeprecatedPublicIPs() {
    return deprecatedPublicIPs;
  }

  public void setDeprecatedPublicIPs(List<String> deprecatedPublicIPs) {
    this.deprecatedPublicIPs = deprecatedPublicIPs;
  }

  public V1ServiceSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public V1ServiceSpec addExternalIPsItem(String externalIPsItem) {
    this.externalIPs.add(externalIPsItem);
    return this;
  }

   /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.  A previous form of this functionality exists as the deprecatedPublicIPs field.  When using this field, callers should also clear the deprecatedPublicIPs field.
   * @return externalIPs
  **/
  @ApiModelProperty(example = "null", value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.  A previous form of this functionality exists as the deprecatedPublicIPs field.  When using this field, callers should also clear the deprecatedPublicIPs field.")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public V1ServiceSpec externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

   /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid DNS name and requires Type to be ExternalName.
   * @return externalName
  **/
  @ApiModelProperty(example = "null", value = "externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid DNS name and requires Type to be ExternalName.")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public V1ServiceSpec loadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

   /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
   * @return loadBalancerIP
  **/
  @ApiModelProperty(example = "null", value = "Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }

  public void setLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }

  public V1ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public V1ServiceSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

   /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: http://kubernetes.io/docs/user-guide/services-firewalls
   * @return loadBalancerSourceRanges
  **/
  @ApiModelProperty(example = "null", value = "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: http://kubernetes.io/docs/user-guide/services-firewalls")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  public V1ServiceSpec ports(List<V1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  public V1ServiceSpec addPortsItem(V1ServicePort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

   /**
   * The list of ports that are exposed by this service. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
   * @return ports
  **/
  @ApiModelProperty(example = "null", required = true, value = "The list of ports that are exposed by this service. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies")
  public List<V1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ServicePort> ports) {
    this.ports = ports;
  }

  public V1ServiceSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public V1ServiceSpec putSelectorItem(String key, String selectorItem) {
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: http://kubernetes.io/docs/user-guide/services#overview
   * @return selector
  **/
  @ApiModelProperty(example = "null", value = "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: http://kubernetes.io/docs/user-guide/services#overview")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public V1ServiceSpec sessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

   /**
   * Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies
   * @return sessionAffinity
  **/
  @ApiModelProperty(example = "null", value = "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: http://kubernetes.io/docs/user-guide/services#virtual-ips-and-service-proxies")
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }

  public V1ServiceSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: http://kubernetes.io/docs/user-guide/services#overview
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: http://kubernetes.io/docs/user-guide/services#overview")
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
    V1ServiceSpec v1ServiceSpec = (V1ServiceSpec) o;
    return Objects.equals(this.clusterIP, v1ServiceSpec.clusterIP) &&
        Objects.equals(this.deprecatedPublicIPs, v1ServiceSpec.deprecatedPublicIPs) &&
        Objects.equals(this.externalIPs, v1ServiceSpec.externalIPs) &&
        Objects.equals(this.externalName, v1ServiceSpec.externalName) &&
        Objects.equals(this.loadBalancerIP, v1ServiceSpec.loadBalancerIP) &&
        Objects.equals(this.loadBalancerSourceRanges, v1ServiceSpec.loadBalancerSourceRanges) &&
        Objects.equals(this.ports, v1ServiceSpec.ports) &&
        Objects.equals(this.selector, v1ServiceSpec.selector) &&
        Objects.equals(this.sessionAffinity, v1ServiceSpec.sessionAffinity) &&
        Objects.equals(this.type, v1ServiceSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIP, deprecatedPublicIPs, externalIPs, externalName, loadBalancerIP, loadBalancerSourceRanges, ports, selector, sessionAffinity, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceSpec {\n");
    
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    deprecatedPublicIPs: ").append(toIndentedString(deprecatedPublicIPs)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
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

