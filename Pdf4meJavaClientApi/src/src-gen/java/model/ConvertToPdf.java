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
import java.util.ArrayList;
import java.util.List;
import model.ConvertToPdfAction;
import model.Document;

/**
 * Convert any document to a PDF
 */
@ApiModel(description = "Convert any document to a PDF")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class ConvertToPdf {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("convertToPdfAction")
  private ConvertToPdfAction convertToPdfAction = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public ConvertToPdf document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Document containing the data
   * @return document
  **/
  @ApiModelProperty(required = true, value = "Document containing the data")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public ConvertToPdf convertToPdfAction(ConvertToPdfAction convertToPdfAction) {
    this.convertToPdfAction = convertToPdfAction;
    return this;
  }

   /**
   * Conversion configuration
   * @return convertToPdfAction
  **/
  @ApiModelProperty(value = "Conversion configuration")
  public ConvertToPdfAction getConvertToPdfAction() {
    return convertToPdfAction;
  }

  public void setConvertToPdfAction(ConvertToPdfAction convertToPdfAction) {
    this.convertToPdfAction = convertToPdfAction;
  }

  public ConvertToPdf jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public ConvertToPdf jobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
    return this;
  }

   /**
   * Get jobIdExt
   * @return jobIdExt
  **/
  @ApiModelProperty(value = "")
  public String getJobIdExt() {
    return jobIdExt;
  }

  public void setJobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
  }

  public ConvertToPdf integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public ConvertToPdf addIntegrationsItem(String integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<String>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Get integrations
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
    ConvertToPdf convertToPdf = (ConvertToPdf) o;
    return Objects.equals(this.document, convertToPdf.document) &&
        Objects.equals(this.convertToPdfAction, convertToPdf.convertToPdfAction) &&
        Objects.equals(this.jobId, convertToPdf.jobId) &&
        Objects.equals(this.jobIdExt, convertToPdf.jobIdExt) &&
        Objects.equals(this.integrations, convertToPdf.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, convertToPdfAction, jobId, jobIdExt, integrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertToPdf {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    convertToPdfAction: ").append(toIndentedString(convertToPdfAction)).append("\n");
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

