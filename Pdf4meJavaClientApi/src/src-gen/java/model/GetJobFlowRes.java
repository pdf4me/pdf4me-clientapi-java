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
import java.util.ArrayList;
import java.util.List;
import model.JobFlow;

/**
 * GetJobFlowRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class GetJobFlowRes {
  @SerializedName("jobFlows")
  private List<JobFlow> jobFlows = null;

  public GetJobFlowRes jobFlows(List<JobFlow> jobFlows) {
    this.jobFlows = jobFlows;
    return this;
  }

  public GetJobFlowRes addJobFlowsItem(JobFlow jobFlowsItem) {
    if (this.jobFlows == null) {
      this.jobFlows = new ArrayList<JobFlow>();
    }
    this.jobFlows.add(jobFlowsItem);
    return this;
  }

  /**
   * Get jobFlows
   * 
   * @return jobFlows
   **/
  @ApiModelProperty(value = "")
  public List<JobFlow> getJobFlows() {
    return jobFlows;
  }

  public void setJobFlows(List<JobFlow> jobFlows) {
    this.jobFlows = jobFlows;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJobFlowRes getJobFlowRes = (GetJobFlowRes) o;
    return Objects.equals(this.jobFlows, getJobFlowRes.jobFlows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobFlows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJobFlowRes {\n");

    sb.append("    jobFlows: ").append(toIndentedString(jobFlows)).append("\n");
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
