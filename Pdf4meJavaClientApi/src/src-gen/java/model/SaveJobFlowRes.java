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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * SaveJobFlowRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class SaveJobFlowRes {
  @SerializedName("jobFlowId")
  private UUID jobFlowId = null;

  @SerializedName("traceId")
  private UUID traceId = null;

  public SaveJobFlowRes jobFlowId(UUID jobFlowId) {
    this.jobFlowId = jobFlowId;
    return this;
  }

  /**
   * Get jobFlowId
   * 
   * @return jobFlowId
   **/
  @ApiModelProperty(value = "")
  public UUID getJobFlowId() {
    return jobFlowId;
  }

  public void setJobFlowId(UUID jobFlowId) {
    this.jobFlowId = jobFlowId;
  }

  public SaveJobFlowRes traceId(UUID traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Get traceId
   * 
   * @return traceId
   **/
  @ApiModelProperty(value = "")
  public UUID getTraceId() {
    return traceId;
  }

  public void setTraceId(UUID traceId) {
    this.traceId = traceId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveJobFlowRes saveJobFlowRes = (SaveJobFlowRes) o;
    return Objects.equals(this.jobFlowId, saveJobFlowRes.jobFlowId)
        && Objects.equals(this.traceId, saveJobFlowRes.traceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobFlowId, traceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveJobFlowRes {\n");

    sb.append("    jobFlowId: ").append(toIndentedString(jobFlowId)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
