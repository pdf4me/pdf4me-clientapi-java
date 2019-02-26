/*
 * Pdf4me
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import model.DocMetadata;

/**
 * CheckAvailabilityRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class CheckAvailabilityRes {
  @SerializedName("traceId")
  private String traceId = null;

  @SerializedName("inDocMetadata")
  private DocMetadata inDocMetadata = null;

  @SerializedName("Status")
  private Boolean status = null;

  public CheckAvailabilityRes traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

   /**
   * Get traceId
   * @return traceId
  **/
  @ApiModelProperty(value = "")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public CheckAvailabilityRes inDocMetadata(DocMetadata inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
    return this;
  }

   /**
   * Get inDocMetadata
   * @return inDocMetadata
  **/
  @ApiModelProperty(value = "")
  public DocMetadata getInDocMetadata() {
    return inDocMetadata;
  }

  public void setInDocMetadata(DocMetadata inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
  }

  public CheckAvailabilityRes status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckAvailabilityRes checkAvailabilityRes = (CheckAvailabilityRes) o;
    return Objects.equals(this.traceId, checkAvailabilityRes.traceId) &&
        Objects.equals(this.inDocMetadata, checkAvailabilityRes.inDocMetadata) &&
        Objects.equals(this.status, checkAvailabilityRes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, inDocMetadata, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckAvailabilityRes {\n");
    
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    inDocMetadata: ").append(toIndentedString(inDocMetadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

