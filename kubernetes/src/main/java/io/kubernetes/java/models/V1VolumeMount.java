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

/**
 * VolumeMount describes a mounting of a Volume within a container.
 */
@ApiModel(description = "VolumeMount describes a mounting of a Volume within a container.")

public class V1VolumeMount {
  @SerializedName("mountPath")
  private String mountPath = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("subPath")
  private String subPath = null;

  public V1VolumeMount mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

   /**
   * Path within the container at which the volume should be mounted.  Must not contain ':'.
   * @return mountPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "Path within the container at which the volume should be mounted.  Must not contain ':'.")
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  public V1VolumeMount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "This must match the Name of a Volume.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VolumeMount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1VolumeMount subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }

   /**
   * Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).
   * @return subPath
  **/
  @ApiModelProperty(example = "null", value = "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeMount v1VolumeMount = (V1VolumeMount) o;
    return Objects.equals(this.mountPath, v1VolumeMount.mountPath) &&
        Objects.equals(this.name, v1VolumeMount.name) &&
        Objects.equals(this.readOnly, v1VolumeMount.readOnly) &&
        Objects.equals(this.subPath, v1VolumeMount.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, name, readOnly, subPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeMount {\n");
    
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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

