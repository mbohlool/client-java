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
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")

public class V1FCVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("lun")
  private Integer lun = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("targetWWNs")
  private List<String> targetWWNs = new ArrayList<String>();

  public V1FCVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(example = "null", value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1FCVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

   /**
   * Required: FC target lun number
   * @return lun
  **/
  @ApiModelProperty(example = "null", required = true, value = "Required: FC target lun number")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1FCVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1FCVolumeSource targetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
    return this;
  }

  public V1FCVolumeSource addTargetWWNsItem(String targetWWNsItem) {
    this.targetWWNs.add(targetWWNsItem);
    return this;
  }

   /**
   * Required: FC target worldwide names (WWNs)
   * @return targetWWNs
  **/
  @ApiModelProperty(example = "null", required = true, value = "Required: FC target worldwide names (WWNs)")
  public List<String> getTargetWWNs() {
    return targetWWNs;
  }

  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FCVolumeSource v1FCVolumeSource = (V1FCVolumeSource) o;
    return Objects.equals(this.fsType, v1FCVolumeSource.fsType) &&
        Objects.equals(this.lun, v1FCVolumeSource.lun) &&
        Objects.equals(this.readOnly, v1FCVolumeSource.readOnly) &&
        Objects.equals(this.targetWWNs, v1FCVolumeSource.targetWWNs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FCVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetWWNs: ").append(toIndentedString(targetWWNs)).append("\n");
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

