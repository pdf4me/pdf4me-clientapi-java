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
import java.util.UUID;
import model.SubscriptionUsage;
import org.threeten.bp.OffsetDateTime;

/**
 * UsageSubscriptionReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class UsageSubscriptionReq {
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;

  @SerializedName("dateFrom")
  private OffsetDateTime dateFrom = null;

  @SerializedName("traceId")
  private String traceId = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("subscriptionUsage")
  private SubscriptionUsage subscriptionUsage = null;

  public UsageSubscriptionReq subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * 
   * @return subscriptionId
   **/
  @ApiModelProperty(value = "")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public UsageSubscriptionReq dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * 
   * @return dateFrom
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public UsageSubscriptionReq traceId(String traceId) {
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

  public UsageSubscriptionReq jobId(String jobId) {
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

  public UsageSubscriptionReq subscriptionUsage(SubscriptionUsage subscriptionUsage) {
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
    UsageSubscriptionReq usageSubscriptionReq = (UsageSubscriptionReq) o;
    return Objects.equals(this.subscriptionId, usageSubscriptionReq.subscriptionId)
        && Objects.equals(this.dateFrom, usageSubscriptionReq.dateFrom)
        && Objects.equals(this.traceId, usageSubscriptionReq.traceId)
        && Objects.equals(this.jobId, usageSubscriptionReq.jobId)
        && Objects.equals(this.subscriptionUsage, usageSubscriptionReq.subscriptionUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, dateFrom, traceId, jobId, subscriptionUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSubscriptionReq {\n");

    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
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
