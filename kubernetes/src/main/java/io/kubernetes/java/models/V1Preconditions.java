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
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 */
@ApiModel(description = "Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")

public class V1Preconditions {
  @SerializedName("uid")
  private String uid = null;

  public V1Preconditions uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Specifies the target UID.
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "Specifies the target UID.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Preconditions v1Preconditions = (V1Preconditions) o;
    return Objects.equals(this.uid, v1Preconditions.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Preconditions {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
