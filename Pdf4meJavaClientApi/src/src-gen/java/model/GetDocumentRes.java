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
import model.Document;
import model.Pdf4meDocument;
import model.Pricing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetDocumentRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class GetDocumentRes {
  @SerializedName("document")
  private Pdf4meDocument document = null;

  @SerializedName("docLogs")
  private List<DocLog> docLogs = null;

  @SerializedName("pricing")
  private Pricing pricing = null;

  @SerializedName("documentList")
  private List<Document> documentList = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("errorMsg")
  private String errorMsg = null;

  @SerializedName("exception")
  private Object exception = null;

  public GetDocumentRes document(Pdf4meDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public Pdf4meDocument getDocument() {
    return document;
  }

  public void setDocument(Pdf4meDocument document) {
    this.document = document;
  }

  public GetDocumentRes docLogs(List<DocLog> docLogs) {
    this.docLogs = docLogs;
    return this;
  }

  public GetDocumentRes addDocLogsItem(DocLog docLogsItem) {
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

  public GetDocumentRes pricing(Pricing pricing) {
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @ApiModelProperty(value = "")
  public Pricing getPricing() {
    return pricing;
  }

  public void setPricing(Pricing pricing) {
    this.pricing = pricing;
  }

  public GetDocumentRes documentList(List<Document> documentList) {
    this.documentList = documentList;
    return this;
  }

  public GetDocumentRes addDocumentListItem(Document documentListItem) {
    if (this.documentList == null) {
      this.documentList = new ArrayList<Document>();
    }
    this.documentList.add(documentListItem);
    return this;
  }

   /**
   * Get documentList
   * @return documentList
  **/
  @ApiModelProperty(value = "")
  public List<Document> getDocumentList() {
    return documentList;
  }

  public void setDocumentList(List<Document> documentList) {
    this.documentList = documentList;
  }

  public GetDocumentRes success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public GetDocumentRes errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Get errorMsg
   * @return errorMsg
  **/
  @ApiModelProperty(value = "")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public GetDocumentRes exception(Object exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public Object getException() {
    return exception;
  }

  public void setException(Object exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentRes getDocumentRes = (GetDocumentRes) o;
    return Objects.equals(this.document, getDocumentRes.document) &&
        Objects.equals(this.docLogs, getDocumentRes.docLogs) &&
        Objects.equals(this.pricing, getDocumentRes.pricing) &&
        Objects.equals(this.documentList, getDocumentRes.documentList) &&
        Objects.equals(this.success, getDocumentRes.success) &&
        Objects.equals(this.errorMsg, getDocumentRes.errorMsg) &&
        Objects.equals(this.exception, getDocumentRes.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, docLogs, pricing, documentList, success, errorMsg, exception);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentRes {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    docLogs: ").append(toIndentedString(docLogs)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    documentList: ").append(toIndentedString(documentList)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

