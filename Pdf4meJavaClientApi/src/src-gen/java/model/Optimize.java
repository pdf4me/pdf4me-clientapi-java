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
import model.Document;
import model.OptimizeAction;

/**
 * Stamp Request with core data to stamp
 */
@ApiModel(description = "Stamp Request with core data to stamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class Optimize {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("optimizeAction")
  private OptimizeAction optimizeAction = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public Optimize document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Give the document to change or use JobId/DocumentId to reference an uploaded
   * document.
   * 
   * @return document
   **/
  @ApiModelProperty(required = true, value = "Give the document to change or use JobId/DocumentId to reference an uploaded document.")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public Optimize optimizeAction(OptimizeAction optimizeAction) {
    this.optimizeAction = optimizeAction;
    return this;
  }

  /**
   * Give an image stamp
   * 
   * @return optimizeAction
   **/
  @ApiModelProperty(value = "Give an image stamp")
  public OptimizeAction getOptimizeAction() {
    return optimizeAction;
  }

  public void setOptimizeAction(OptimizeAction optimizeAction) {
    this.optimizeAction = optimizeAction;
  }

  public Optimize ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * 
   * @return ipAddress
   **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Optimize jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * 
   * @return jobId
   **/
  @ApiModelProperty(value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public Optimize jobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
    return this;
  }

  /**
   * Get jobIdExt
   * 
   * @return jobIdExt
   **/
  @ApiModelProperty(value = "")
  public String getJobIdExt() {
    return jobIdExt;
  }

  public void setJobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
  }

  public Optimize integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public Optimize addIntegrationsItem(String integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<String>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

  /**
   * Get integrations
   * 
   * @return integrations
   **/
  @ApiModelProperty(value = "")
  public List<String> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<String> integrations) {
    this.integrations = integrations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Optimize optimize = (Optimize) o;
    return Objects.equals(this.document, optimize.document)
        && Objects.equals(this.optimizeAction, optimize.optimizeAction)
        && Objects.equals(this.ipAddress, optimize.ipAddress) && Objects.equals(this.jobId, optimize.jobId)
        && Objects.equals(this.jobIdExt, optimize.jobIdExt) && Objects.equals(this.integrations, optimize.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, optimizeAction, ipAddress, jobId, jobIdExt, integrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Optimize {\n");

    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    optimizeAction: ").append(toIndentedString(optimizeAction)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobIdExt: ").append(toIndentedString(jobIdExt)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
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
