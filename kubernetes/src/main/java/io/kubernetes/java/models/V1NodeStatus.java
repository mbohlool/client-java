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
import io.kubernetes.java.models.ResourceQuantity;
import io.kubernetes.java.models.V1AttachedVolume;
import io.kubernetes.java.models.V1ContainerImage;
import io.kubernetes.java.models.V1NodeAddress;
import io.kubernetes.java.models.V1NodeCondition;
import io.kubernetes.java.models.V1NodeDaemonEndpoints;
import io.kubernetes.java.models.V1NodeSystemInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NodeStatus is information about the current status of a node.
 */
@ApiModel(description = "NodeStatus is information about the current status of a node.")

public class V1NodeStatus {
  @SerializedName("addresses")
  private List<V1NodeAddress> addresses = new ArrayList<V1NodeAddress>();

  @SerializedName("allocatable")
  private Map<String, ResourceQuantity> allocatable = new HashMap<String, ResourceQuantity>();

  @SerializedName("capacity")
  private Map<String, ResourceQuantity> capacity = new HashMap<String, ResourceQuantity>();

  @SerializedName("conditions")
  private List<V1NodeCondition> conditions = new ArrayList<V1NodeCondition>();

  @SerializedName("daemonEndpoints")
  private V1NodeDaemonEndpoints daemonEndpoints = null;

  @SerializedName("images")
  private List<V1ContainerImage> images = new ArrayList<V1ContainerImage>();

  @SerializedName("nodeInfo")
  private V1NodeSystemInfo nodeInfo = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("volumesAttached")
  private List<V1AttachedVolume> volumesAttached = new ArrayList<V1AttachedVolume>();

  @SerializedName("volumesInUse")
  private List<String> volumesInUse = new ArrayList<String>();

  public V1NodeStatus addresses(List<V1NodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V1NodeStatus addAddressesItem(V1NodeAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "List of addresses reachable to the node. Queried from cloud provider, if available. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-addresses")
  public List<V1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V1NodeAddress> addresses) {
    this.addresses = addresses;
  }

  public V1NodeStatus allocatable(Map<String, ResourceQuantity> allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  public V1NodeStatus putAllocatableItem(String key, ResourceQuantity allocatableItem) {
    this.allocatable.put(key, allocatableItem);
    return this;
  }

   /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   * @return allocatable
  **/
  @ApiModelProperty(example = "null", value = "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
  public Map<String, ResourceQuantity> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, ResourceQuantity> allocatable) {
    this.allocatable = allocatable;
  }

  public V1NodeStatus capacity(Map<String, ResourceQuantity> capacity) {
    this.capacity = capacity;
    return this;
  }

  public V1NodeStatus putCapacityItem(String key, ResourceQuantity capacityItem) {
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Capacity represents the total resources of a node. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity for more details.
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "Capacity represents the total resources of a node. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity for more details.")
  public Map<String, ResourceQuantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, ResourceQuantity> capacity) {
    this.capacity = capacity;
  }

  public V1NodeStatus conditions(List<V1NodeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1NodeStatus addConditionsItem(V1NodeCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is an array of current observed node conditions. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-condition
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "Conditions is an array of current observed node conditions. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-condition")
  public List<V1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1NodeCondition> conditions) {
    this.conditions = conditions;
  }

  public V1NodeStatus daemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

   /**
   * Endpoints of daemons running on the Node.
   * @return daemonEndpoints
  **/
  @ApiModelProperty(example = "null", value = "Endpoints of daemons running on the Node.")
  public V1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }

  public V1NodeStatus images(List<V1ContainerImage> images) {
    this.images = images;
    return this;
  }

  public V1NodeStatus addImagesItem(V1ContainerImage imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * List of container images on this node
   * @return images
  **/
  @ApiModelProperty(example = "null", value = "List of container images on this node")
  public List<V1ContainerImage> getImages() {
    return images;
  }

  public void setImages(List<V1ContainerImage> images) {
    this.images = images;
  }

  public V1NodeStatus nodeInfo(V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

   /**
   * Set of ids/uuids to uniquely identify the node. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-info
   * @return nodeInfo
  **/
  @ApiModelProperty(example = "null", value = "Set of ids/uuids to uniquely identify the node. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-info")
  public V1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public V1NodeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-phase The field is never populated, and now is deprecated.
   * @return phase
  **/
  @ApiModelProperty(example = "null", value = "NodePhase is the recently observed lifecycle phase of the node. More info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-phase The field is never populated, and now is deprecated.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1NodeStatus volumesAttached(List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
    return this;
  }

  public V1NodeStatus addVolumesAttachedItem(V1AttachedVolume volumesAttachedItem) {
    this.volumesAttached.add(volumesAttachedItem);
    return this;
  }

   /**
   * List of volumes that are attached to the node.
   * @return volumesAttached
  **/
  @ApiModelProperty(example = "null", value = "List of volumes that are attached to the node.")
  public List<V1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }

  public V1NodeStatus volumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
    return this;
  }

  public V1NodeStatus addVolumesInUseItem(String volumesInUseItem) {
    this.volumesInUse.add(volumesInUseItem);
    return this;
  }

   /**
   * List of attachable volumes in use (mounted) by the node.
   * @return volumesInUse
  **/
  @ApiModelProperty(example = "null", value = "List of attachable volumes in use (mounted) by the node.")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeStatus v1NodeStatus = (V1NodeStatus) o;
    return Objects.equals(this.addresses, v1NodeStatus.addresses) &&
        Objects.equals(this.allocatable, v1NodeStatus.allocatable) &&
        Objects.equals(this.capacity, v1NodeStatus.capacity) &&
        Objects.equals(this.conditions, v1NodeStatus.conditions) &&
        Objects.equals(this.daemonEndpoints, v1NodeStatus.daemonEndpoints) &&
        Objects.equals(this.images, v1NodeStatus.images) &&
        Objects.equals(this.nodeInfo, v1NodeStatus.nodeInfo) &&
        Objects.equals(this.phase, v1NodeStatus.phase) &&
        Objects.equals(this.volumesAttached, v1NodeStatus.volumesAttached) &&
        Objects.equals(this.volumesInUse, v1NodeStatus.volumesInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, allocatable, capacity, conditions, daemonEndpoints, images, nodeInfo, phase, volumesAttached, volumesInUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeStatus {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    daemonEndpoints: ").append(toIndentedString(daemonEndpoints)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
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

