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
import org.threeten.bp.OffsetDateTime;

/**
 * UsageApplication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class UsageApplication {
  @SerializedName("id")
  private String id = null;

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("applicationId")
  private String applicationId = null;

  @SerializedName("subCostTotal")
  private Long subCostTotal = null;

  @SerializedName("subCostCurrent")
  private Long subCostCurrent = null;

  @SerializedName("apiCostTotal")
  private Long apiCostTotal = null;

  @SerializedName("apiCostCurrent")
  private Long apiCostCurrent = null;

  @SerializedName("ApiCallCnt")
  private Long apiCallCnt = null;

  @SerializedName("feature")
  private String feature = null;

  @SerializedName("featureCallCnt")
  private Long featureCallCnt = null;

  @SerializedName("durationMsAvg")
  private Long durationMsAvg = null;

  @SerializedName("durationMsMin")
  private Long durationMsMin = null;

  @SerializedName("durationMsMax")
  private Long durationMsMax = null;

  @SerializedName("pagesAvg")
  private Long pagesAvg = null;

  @SerializedName("pagesMin")
  private Long pagesMin = null;

  @SerializedName("pagesMax")
  private Long pagesMax = null;

  @SerializedName("pagesSum")
  private Long pagesSum = null;

  @SerializedName("docSizeAvg")
  private Long docSizeAvg = null;

  @SerializedName("docSizeMin")
  private Long docSizeMin = null;

  @SerializedName("docSizeMax")
  private Long docSizeMax = null;

  @SerializedName("docSizeSum")
  private Long docSizeSum = null;

  @SerializedName("timeStampFrom")
  private OffsetDateTime timeStampFrom = null;

  @SerializedName("timeStampTo")
  private OffsetDateTime timeStampTo = null;

  public UsageApplication id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageApplication subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public UsageApplication applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public UsageApplication subCostTotal(Long subCostTotal) {
    this.subCostTotal = subCostTotal;
    return this;
  }

   /**
   * Get subCostTotal
   * @return subCostTotal
  **/
  @ApiModelProperty(value = "")
  public Long getSubCostTotal() {
    return subCostTotal;
  }

  public void setSubCostTotal(Long subCostTotal) {
    this.subCostTotal = subCostTotal;
  }

  public UsageApplication subCostCurrent(Long subCostCurrent) {
    this.subCostCurrent = subCostCurrent;
    return this;
  }

   /**
   * Get subCostCurrent
   * @return subCostCurrent
  **/
  @ApiModelProperty(value = "")
  public Long getSubCostCurrent() {
    return subCostCurrent;
  }

  public void setSubCostCurrent(Long subCostCurrent) {
    this.subCostCurrent = subCostCurrent;
  }

  public UsageApplication apiCostTotal(Long apiCostTotal) {
    this.apiCostTotal = apiCostTotal;
    return this;
  }

   /**
   * Get apiCostTotal
   * @return apiCostTotal
  **/
  @ApiModelProperty(value = "")
  public Long getApiCostTotal() {
    return apiCostTotal;
  }

  public void setApiCostTotal(Long apiCostTotal) {
    this.apiCostTotal = apiCostTotal;
  }

  public UsageApplication apiCostCurrent(Long apiCostCurrent) {
    this.apiCostCurrent = apiCostCurrent;
    return this;
  }

   /**
   * Get apiCostCurrent
   * @return apiCostCurrent
  **/
  @ApiModelProperty(value = "")
  public Long getApiCostCurrent() {
    return apiCostCurrent;
  }

  public void setApiCostCurrent(Long apiCostCurrent) {
    this.apiCostCurrent = apiCostCurrent;
  }

  public UsageApplication apiCallCnt(Long apiCallCnt) {
    this.apiCallCnt = apiCallCnt;
    return this;
  }

   /**
   * Get apiCallCnt
   * @return apiCallCnt
  **/
  @ApiModelProperty(value = "")
  public Long getApiCallCnt() {
    return apiCallCnt;
  }

  public void setApiCallCnt(Long apiCallCnt) {
    this.apiCallCnt = apiCallCnt;
  }

  public UsageApplication feature(String feature) {
    this.feature = feature;
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @ApiModelProperty(value = "")
  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public UsageApplication featureCallCnt(Long featureCallCnt) {
    this.featureCallCnt = featureCallCnt;
    return this;
  }

   /**
   * Get featureCallCnt
   * @return featureCallCnt
  **/
  @ApiModelProperty(value = "")
  public Long getFeatureCallCnt() {
    return featureCallCnt;
  }

  public void setFeatureCallCnt(Long featureCallCnt) {
    this.featureCallCnt = featureCallCnt;
  }

  public UsageApplication durationMsAvg(Long durationMsAvg) {
    this.durationMsAvg = durationMsAvg;
    return this;
  }

   /**
   * Get durationMsAvg
   * @return durationMsAvg
  **/
  @ApiModelProperty(value = "")
  public Long getDurationMsAvg() {
    return durationMsAvg;
  }

  public void setDurationMsAvg(Long durationMsAvg) {
    this.durationMsAvg = durationMsAvg;
  }

  public UsageApplication durationMsMin(Long durationMsMin) {
    this.durationMsMin = durationMsMin;
    return this;
  }

   /**
   * Get durationMsMin
   * @return durationMsMin
  **/
  @ApiModelProperty(value = "")
  public Long getDurationMsMin() {
    return durationMsMin;
  }

  public void setDurationMsMin(Long durationMsMin) {
    this.durationMsMin = durationMsMin;
  }

  public UsageApplication durationMsMax(Long durationMsMax) {
    this.durationMsMax = durationMsMax;
    return this;
  }

   /**
   * Get durationMsMax
   * @return durationMsMax
  **/
  @ApiModelProperty(value = "")
  public Long getDurationMsMax() {
    return durationMsMax;
  }

  public void setDurationMsMax(Long durationMsMax) {
    this.durationMsMax = durationMsMax;
  }

  public UsageApplication pagesAvg(Long pagesAvg) {
    this.pagesAvg = pagesAvg;
    return this;
  }

   /**
   * Get pagesAvg
   * @return pagesAvg
  **/
  @ApiModelProperty(value = "")
  public Long getPagesAvg() {
    return pagesAvg;
  }

  public void setPagesAvg(Long pagesAvg) {
    this.pagesAvg = pagesAvg;
  }

  public UsageApplication pagesMin(Long pagesMin) {
    this.pagesMin = pagesMin;
    return this;
  }

   /**
   * Get pagesMin
   * @return pagesMin
  **/
  @ApiModelProperty(value = "")
  public Long getPagesMin() {
    return pagesMin;
  }

  public void setPagesMin(Long pagesMin) {
    this.pagesMin = pagesMin;
  }

  public UsageApplication pagesMax(Long pagesMax) {
    this.pagesMax = pagesMax;
    return this;
  }

   /**
   * Get pagesMax
   * @return pagesMax
  **/
  @ApiModelProperty(value = "")
  public Long getPagesMax() {
    return pagesMax;
  }

  public void setPagesMax(Long pagesMax) {
    this.pagesMax = pagesMax;
  }

  public UsageApplication pagesSum(Long pagesSum) {
    this.pagesSum = pagesSum;
    return this;
  }

   /**
   * Get pagesSum
   * @return pagesSum
  **/
  @ApiModelProperty(value = "")
  public Long getPagesSum() {
    return pagesSum;
  }

  public void setPagesSum(Long pagesSum) {
    this.pagesSum = pagesSum;
  }

  public UsageApplication docSizeAvg(Long docSizeAvg) {
    this.docSizeAvg = docSizeAvg;
    return this;
  }

   /**
   * Get docSizeAvg
   * @return docSizeAvg
  **/
  @ApiModelProperty(value = "")
  public Long getDocSizeAvg() {
    return docSizeAvg;
  }

  public void setDocSizeAvg(Long docSizeAvg) {
    this.docSizeAvg = docSizeAvg;
  }

  public UsageApplication docSizeMin(Long docSizeMin) {
    this.docSizeMin = docSizeMin;
    return this;
  }

   /**
   * Get docSizeMin
   * @return docSizeMin
  **/
  @ApiModelProperty(value = "")
  public Long getDocSizeMin() {
    return docSizeMin;
  }

  public void setDocSizeMin(Long docSizeMin) {
    this.docSizeMin = docSizeMin;
  }

  public UsageApplication docSizeMax(Long docSizeMax) {
    this.docSizeMax = docSizeMax;
    return this;
  }

   /**
   * Get docSizeMax
   * @return docSizeMax
  **/
  @ApiModelProperty(value = "")
  public Long getDocSizeMax() {
    return docSizeMax;
  }

  public void setDocSizeMax(Long docSizeMax) {
    this.docSizeMax = docSizeMax;
  }

  public UsageApplication docSizeSum(Long docSizeSum) {
    this.docSizeSum = docSizeSum;
    return this;
  }

   /**
   * Get docSizeSum
   * @return docSizeSum
  **/
  @ApiModelProperty(value = "")
  public Long getDocSizeSum() {
    return docSizeSum;
  }

  public void setDocSizeSum(Long docSizeSum) {
    this.docSizeSum = docSizeSum;
  }

  public UsageApplication timeStampFrom(OffsetDateTime timeStampFrom) {
    this.timeStampFrom = timeStampFrom;
    return this;
  }

   /**
   * Get timeStampFrom
   * @return timeStampFrom
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeStampFrom() {
    return timeStampFrom;
  }

  public void setTimeStampFrom(OffsetDateTime timeStampFrom) {
    this.timeStampFrom = timeStampFrom;
  }

  public UsageApplication timeStampTo(OffsetDateTime timeStampTo) {
    this.timeStampTo = timeStampTo;
    return this;
  }

   /**
   * Get timeStampTo
   * @return timeStampTo
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeStampTo() {
    return timeStampTo;
  }

  public void setTimeStampTo(OffsetDateTime timeStampTo) {
    this.timeStampTo = timeStampTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageApplication usageApplication = (UsageApplication) o;
    return Objects.equals(this.id, usageApplication.id) &&
        Objects.equals(this.subscriptionId, usageApplication.subscriptionId) &&
        Objects.equals(this.applicationId, usageApplication.applicationId) &&
        Objects.equals(this.subCostTotal, usageApplication.subCostTotal) &&
        Objects.equals(this.subCostCurrent, usageApplication.subCostCurrent) &&
        Objects.equals(this.apiCostTotal, usageApplication.apiCostTotal) &&
        Objects.equals(this.apiCostCurrent, usageApplication.apiCostCurrent) &&
        Objects.equals(this.apiCallCnt, usageApplication.apiCallCnt) &&
        Objects.equals(this.feature, usageApplication.feature) &&
        Objects.equals(this.featureCallCnt, usageApplication.featureCallCnt) &&
        Objects.equals(this.durationMsAvg, usageApplication.durationMsAvg) &&
        Objects.equals(this.durationMsMin, usageApplication.durationMsMin) &&
        Objects.equals(this.durationMsMax, usageApplication.durationMsMax) &&
        Objects.equals(this.pagesAvg, usageApplication.pagesAvg) &&
        Objects.equals(this.pagesMin, usageApplication.pagesMin) &&
        Objects.equals(this.pagesMax, usageApplication.pagesMax) &&
        Objects.equals(this.pagesSum, usageApplication.pagesSum) &&
        Objects.equals(this.docSizeAvg, usageApplication.docSizeAvg) &&
        Objects.equals(this.docSizeMin, usageApplication.docSizeMin) &&
        Objects.equals(this.docSizeMax, usageApplication.docSizeMax) &&
        Objects.equals(this.docSizeSum, usageApplication.docSizeSum) &&
        Objects.equals(this.timeStampFrom, usageApplication.timeStampFrom) &&
        Objects.equals(this.timeStampTo, usageApplication.timeStampTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subscriptionId, applicationId, subCostTotal, subCostCurrent, apiCostTotal, apiCostCurrent, apiCallCnt, feature, featureCallCnt, durationMsAvg, durationMsMin, durationMsMax, pagesAvg, pagesMin, pagesMax, pagesSum, docSizeAvg, docSizeMin, docSizeMax, docSizeSum, timeStampFrom, timeStampTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    subCostTotal: ").append(toIndentedString(subCostTotal)).append("\n");
    sb.append("    subCostCurrent: ").append(toIndentedString(subCostCurrent)).append("\n");
    sb.append("    apiCostTotal: ").append(toIndentedString(apiCostTotal)).append("\n");
    sb.append("    apiCostCurrent: ").append(toIndentedString(apiCostCurrent)).append("\n");
    sb.append("    apiCallCnt: ").append(toIndentedString(apiCallCnt)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    featureCallCnt: ").append(toIndentedString(featureCallCnt)).append("\n");
    sb.append("    durationMsAvg: ").append(toIndentedString(durationMsAvg)).append("\n");
    sb.append("    durationMsMin: ").append(toIndentedString(durationMsMin)).append("\n");
    sb.append("    durationMsMax: ").append(toIndentedString(durationMsMax)).append("\n");
    sb.append("    pagesAvg: ").append(toIndentedString(pagesAvg)).append("\n");
    sb.append("    pagesMin: ").append(toIndentedString(pagesMin)).append("\n");
    sb.append("    pagesMax: ").append(toIndentedString(pagesMax)).append("\n");
    sb.append("    pagesSum: ").append(toIndentedString(pagesSum)).append("\n");
    sb.append("    docSizeAvg: ").append(toIndentedString(docSizeAvg)).append("\n");
    sb.append("    docSizeMin: ").append(toIndentedString(docSizeMin)).append("\n");
    sb.append("    docSizeMax: ").append(toIndentedString(docSizeMax)).append("\n");
    sb.append("    docSizeSum: ").append(toIndentedString(docSizeSum)).append("\n");
    sb.append("    timeStampFrom: ").append(toIndentedString(timeStampFrom)).append("\n");
    sb.append("    timeStampTo: ").append(toIndentedString(timeStampTo)).append("\n");
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

