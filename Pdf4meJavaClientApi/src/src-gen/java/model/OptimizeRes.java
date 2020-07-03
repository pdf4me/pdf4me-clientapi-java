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
import model.DocMetadata;
import model.Document;
import model.SubscriptionUsage;

/**
 * Stamp Request with core data to stamp
 */
@ApiModel(description = "Stamp Request with core data to stamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class OptimizeRes {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("inDocMetadata")
  private DocMetadata inDocMetadata = null;

  @SerializedName("traceId")
  private String traceId = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("subscriptionUsage")
  private SubscriptionUsage subscriptionUsage = null;

  public OptimizeRes document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Stamped Document
   * 
   * @return document
   **/
  @ApiModelProperty(value = "Stamped Document")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public OptimizeRes inDocMetadata(DocMetadata inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
    return this;
  }

  /**
   * Get inDocMetadata
   * 
   * @return inDocMetadata
   **/
  @ApiModelProperty(value = "")
  public DocMetadata getInDocMetadata() {
    return inDocMetadata;
  }

  public void setInDocMetadata(DocMetadata inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
  }

  public OptimizeRes traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Get traceId
   * 
   * @return traceId
   **/
  @ApiModelProperty(value = "")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public OptimizeRes jobId(String jobId) {
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

  public OptimizeRes subscriptionUsage(SubscriptionUsage subscriptionUsage) {
    this.subscriptionUsage = subscriptionUsage;
    return this;
  }

  /**
   * Get subscriptionUsage
   * 
   * @return subscriptionUsage
   **/
  @ApiModelProperty(value = "")
  public SubscriptionUsage getSubscriptionUsage() {
    return subscriptionUsage;
  }

  public void setSubscriptionUsage(SubscriptionUsage subscriptionUsage) {
    this.subscriptionUsage = subscriptionUsage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizeRes optimizeRes = (OptimizeRes) o;
    return Objects.equals(this.document, optimizeRes.document)
        && Objects.equals(this.inDocMetadata, optimizeRes.inDocMetadata)
        && Objects.equals(this.traceId, optimizeRes.traceId) && Objects.equals(this.jobId, optimizeRes.jobId)
        && Objects.equals(this.subscriptionUsage, optimizeRes.subscriptionUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, inDocMetadata, traceId, jobId, subscriptionUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizeRes {\n");

    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    inDocMetadata: ").append(toIndentedString(inDocMetadata)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    subscriptionUsage: ").append(toIndentedString(subscriptionUsage)).append("\n");
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
