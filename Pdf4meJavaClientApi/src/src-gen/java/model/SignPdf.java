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
import model.Document;
import model.SignAction;

/**
 * SignPdf
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class SignPdf {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("signAction")
  private SignAction signAction = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public SignPdf document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(required = true, value = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public SignPdf signAction(SignAction signAction) {
    this.signAction = signAction;
    return this;
  }

   /**
   * Get signAction
   * @return signAction
  **/
  @ApiModelProperty(value = "")
  public SignAction getSignAction() {
    return signAction;
  }

  public void setSignAction(SignAction signAction) {
    this.signAction = signAction;
  }

  public SignPdf jobId(String jobId) {
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

  public SignPdf jobIdExt(String jobIdExt) {
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

  public SignPdf integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public SignPdf addIntegrationsItem(String integrationsItem) {
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
    SignPdf signPdf = (SignPdf) o;
    return Objects.equals(this.document, signPdf.document) &&
        Objects.equals(this.signAction, signPdf.signAction) &&
        Objects.equals(this.jobId, signPdf.jobId) &&
        Objects.equals(this.jobIdExt, signPdf.jobIdExt) &&
        Objects.equals(this.integrations, signPdf.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, signAction, jobId, jobIdExt, integrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignPdf {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    signAction: ").append(toIndentedString(signAction)).append("\n");
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

