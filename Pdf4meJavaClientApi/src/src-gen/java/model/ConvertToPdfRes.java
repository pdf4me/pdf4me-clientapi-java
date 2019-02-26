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
import model.Document;

/**
 * Converted Result
 */
@ApiModel(description = "Converted Result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class ConvertToPdfRes {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("inDocMetadata")
  private DocMetadata inDocMetadata = null;

  @SerializedName("traceId")
  private String traceId = null;

  @SerializedName("jobId")
  private String jobId = null;

  public ConvertToPdfRes document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Converted Document
   * @return document
  **/
  @ApiModelProperty(value = "Converted Document")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public ConvertToPdfRes inDocMetadata(DocMetadata inDocMetadata) {
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

  public ConvertToPdfRes traceId(String traceId) {
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

  public ConvertToPdfRes jobId(String jobId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertToPdfRes convertToPdfRes = (ConvertToPdfRes) o;
    return Objects.equals(this.document, convertToPdfRes.document) &&
        Objects.equals(this.inDocMetadata, convertToPdfRes.inDocMetadata) &&
        Objects.equals(this.traceId, convertToPdfRes.traceId) &&
        Objects.equals(this.jobId, convertToPdfRes.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, inDocMetadata, traceId, jobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertToPdfRes {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    inDocMetadata: ").append(toIndentedString(inDocMetadata)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

