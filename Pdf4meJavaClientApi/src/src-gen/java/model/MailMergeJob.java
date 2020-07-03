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
import model.DocGenDocument;
import model.MailMergeJobAction;

/**
 * MailMergeJob
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class MailMergeJob {
  @SerializedName("documents")
  private List<DocGenDocument> documents = new ArrayList<DocGenDocument>();

  @SerializedName("mailMergeJobAction")
  private MailMergeJobAction mailMergeJobAction = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public MailMergeJob documents(List<DocGenDocument> documents) {
    this.documents = documents;
    return this;
  }

  public MailMergeJob addDocumentsItem(DocGenDocument documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * 
   * @return documents
   **/
  @ApiModelProperty(required = true, value = "")
  public List<DocGenDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocGenDocument> documents) {
    this.documents = documents;
  }

  public MailMergeJob mailMergeJobAction(MailMergeJobAction mailMergeJobAction) {
    this.mailMergeJobAction = mailMergeJobAction;
    return this;
  }

  /**
   * Get mailMergeJobAction
   * 
   * @return mailMergeJobAction
   **/
  @ApiModelProperty(value = "")
  public MailMergeJobAction getMailMergeJobAction() {
    return mailMergeJobAction;
  }

  public void setMailMergeJobAction(MailMergeJobAction mailMergeJobAction) {
    this.mailMergeJobAction = mailMergeJobAction;
  }

  public MailMergeJob ipAddress(String ipAddress) {
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

  public MailMergeJob jobId(String jobId) {
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

  public MailMergeJob jobIdExt(String jobIdExt) {
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

  public MailMergeJob integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public MailMergeJob addIntegrationsItem(String integrationsItem) {
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
    MailMergeJob mailMergeJob = (MailMergeJob) o;
    return Objects.equals(this.documents, mailMergeJob.documents)
        && Objects.equals(this.mailMergeJobAction, mailMergeJob.mailMergeJobAction)
        && Objects.equals(this.ipAddress, mailMergeJob.ipAddress) && Objects.equals(this.jobId, mailMergeJob.jobId)
        && Objects.equals(this.jobIdExt, mailMergeJob.jobIdExt)
        && Objects.equals(this.integrations, mailMergeJob.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, mailMergeJobAction, ipAddress, jobId, jobIdExt, integrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMergeJob {\n");

    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    mailMergeJobAction: ").append(toIndentedString(mailMergeJobAction)).append("\n");
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