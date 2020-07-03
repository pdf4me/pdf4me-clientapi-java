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
import model.ReadBarcodeAction;

/**
 * ReadBarcodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ReadBarcodes {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("readBarcodeAction")
  private ReadBarcodeAction readBarcodeAction = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public ReadBarcodes document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * 
   * @return document
   **/
  @ApiModelProperty(required = true, value = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public ReadBarcodes readBarcodeAction(ReadBarcodeAction readBarcodeAction) {
    this.readBarcodeAction = readBarcodeAction;
    return this;
  }

  /**
   * Get readBarcodeAction
   * 
   * @return readBarcodeAction
   **/
  @ApiModelProperty(value = "")
  public ReadBarcodeAction getReadBarcodeAction() {
    return readBarcodeAction;
  }

  public void setReadBarcodeAction(ReadBarcodeAction readBarcodeAction) {
    this.readBarcodeAction = readBarcodeAction;
  }

  public ReadBarcodes ipAddress(String ipAddress) {
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

  public ReadBarcodes jobId(String jobId) {
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

  public ReadBarcodes jobIdExt(String jobIdExt) {
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

  public ReadBarcodes integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public ReadBarcodes addIntegrationsItem(String integrationsItem) {
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
    ReadBarcodes readBarcodes = (ReadBarcodes) o;
    return Objects.equals(this.document, readBarcodes.document)
        && Objects.equals(this.readBarcodeAction, readBarcodes.readBarcodeAction)
        && Objects.equals(this.ipAddress, readBarcodes.ipAddress) && Objects.equals(this.jobId, readBarcodes.jobId)
        && Objects.equals(this.jobIdExt, readBarcodes.jobIdExt)
        && Objects.equals(this.integrations, readBarcodes.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, readBarcodeAction, ipAddress, jobId, jobIdExt, integrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadBarcodes {\n");

    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    readBarcodeAction: ").append(toIndentedString(readBarcodeAction)).append("\n");
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
