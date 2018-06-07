/*
 * DmsApi
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
import model.DocLog;
import model.DocMetadata;
import model.Notification;
import model.Page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:27:16.545+02:00")
public class Document {
  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("docStatus")
  private String docStatus = null;

  @SerializedName("pages")
  private List<Page> pages = null;

  @SerializedName("docData")
  private byte[] docData = null;

  @SerializedName("docMetadata")
  private DocMetadata docMetadata = null;

  @SerializedName("docLogs")
  private List<DocLog> docLogs = null;

  @SerializedName("notification")
  private Notification notification = null;

  public Document jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * JobId of Documents WorkingSet
   * @return jobId
  **/
  @ApiModelProperty(value = "JobId of Documents WorkingSet")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public Document documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * DocumentId
   * @return documentId
  **/
  @ApiModelProperty(value = "DocumentId")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Give filename inlcuding filetype
   * @return name
  **/
  @ApiModelProperty(value = "Give filename inlcuding filetype")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document docStatus(String docStatus) {
    this.docStatus = docStatus;
    return this;
  }

   /**
   * Returns the Status of the Document
   * @return docStatus
  **/
  @ApiModelProperty(value = "Returns the Status of the Document")
  public String getDocStatus() {
    return docStatus;
  }

  public void setDocStatus(String docStatus) {
    this.docStatus = docStatus;
  }

  public Document pages(List<Page> pages) {
    this.pages = pages;
    return this;
  }

  public Document addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Page>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Description of pages
   * @return pages
  **/
  @ApiModelProperty(value = "Description of pages")
  public List<Page> getPages() {
    return pages;
  }

  public void setPages(List<Page> pages) {
    this.pages = pages;
  }

  public Document docData(byte[] docData) {
    this.docData = docData;
    return this;
  }

   /**
   * Get docData
   * @return docData
  **/
  @ApiModelProperty(value = "")
  public byte[] getDocData() {
    return docData;
  }

  public void setDocData(byte[] docData) {
    this.docData = docData;
  }

  public Document docMetadata(DocMetadata docMetadata) {
    this.docMetadata = docMetadata;
    return this;
  }

   /**
   * Get docMetadata
   * @return docMetadata
  **/
  @ApiModelProperty(value = "")
  public DocMetadata getDocMetadata() {
    return docMetadata;
  }

  public void setDocMetadata(DocMetadata docMetadata) {
    this.docMetadata = docMetadata;
  }

  public Document docLogs(List<DocLog> docLogs) {
    this.docLogs = docLogs;
    return this;
  }

  public Document addDocLogsItem(DocLog docLogsItem) {
    if (this.docLogs == null) {
      this.docLogs = new ArrayList<DocLog>();
    }
    this.docLogs.add(docLogsItem);
    return this;
  }

   /**
   * Get docLogs
   * @return docLogs
  **/
  @ApiModelProperty(value = "")
  public List<DocLog> getDocLogs() {
    return docLogs;
  }

  public void setDocLogs(List<DocLog> docLogs) {
    this.docLogs = docLogs;
  }

  public Document notification(Notification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @ApiModelProperty(value = "")
  public Notification getNotification() {
    return notification;
  }

  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.jobId, document.jobId) &&
        Objects.equals(this.documentId, document.documentId) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.docStatus, document.docStatus) &&
        Objects.equals(this.pages, document.pages) &&
        Objects.equals(this.docData, document.docData) &&
        Objects.equals(this.docMetadata, document.docMetadata) &&
        Objects.equals(this.docLogs, document.docLogs) &&
        Objects.equals(this.notification, document.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, documentId, name, docStatus, pages, docData, docMetadata, docLogs, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    docStatus: ").append(toIndentedString(docStatus)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    docData: ").append(toIndentedString(docData)).append("\n");
    sb.append("    docMetadata: ").append(toIndentedString(docMetadata)).append("\n");
    sb.append("    docLogs: ").append(toIndentedString(docLogs)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

