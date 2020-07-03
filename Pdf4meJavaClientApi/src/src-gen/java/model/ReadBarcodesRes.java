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
import model.BillingData;
import model.DocMetadata;
import model.ScanBarcode;
import model.SubscriptionUsage;

/**
 * ReadBarcodesRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ReadBarcodesRes {
  @SerializedName("barcodes")
  private List<ScanBarcode> barcodes = null;

  @SerializedName("barcodeData")
  private String barcodeData = null;

  @SerializedName("billingData")
  private BillingData billingData = null;

  @SerializedName("inDocMetadata")
  private List<DocMetadata> inDocMetadata = null;

  @SerializedName("traceId")
  private String traceId = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("subscriptionUsage")
  private SubscriptionUsage subscriptionUsage = null;

  public ReadBarcodesRes barcodes(List<ScanBarcode> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public ReadBarcodesRes addBarcodesItem(ScanBarcode barcodesItem) {
    if (this.barcodes == null) {
      this.barcodes = new ArrayList<ScanBarcode>();
    }
    this.barcodes.add(barcodesItem);
    return this;
  }

  /**
   * Get barcodes
   * 
   * @return barcodes
   **/
  @ApiModelProperty(value = "")
  public List<ScanBarcode> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(List<ScanBarcode> barcodes) {
    this.barcodes = barcodes;
  }

  public ReadBarcodesRes barcodeData(String barcodeData) {
    this.barcodeData = barcodeData;
    return this;
  }

  /**
   * Get barcodeData
   * 
   * @return barcodeData
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeData() {
    return barcodeData;
  }

  public void setBarcodeData(String barcodeData) {
    this.barcodeData = barcodeData;
  }

  public ReadBarcodesRes billingData(BillingData billingData) {
    this.billingData = billingData;
    return this;
  }

  /**
   * Get billingData
   * 
   * @return billingData
   **/
  @ApiModelProperty(value = "")
  public BillingData getBillingData() {
    return billingData;
  }

  public void setBillingData(BillingData billingData) {
    this.billingData = billingData;
  }

  public ReadBarcodesRes inDocMetadata(List<DocMetadata> inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
    return this;
  }

  public ReadBarcodesRes addInDocMetadataItem(DocMetadata inDocMetadataItem) {
    if (this.inDocMetadata == null) {
      this.inDocMetadata = new ArrayList<DocMetadata>();
    }
    this.inDocMetadata.add(inDocMetadataItem);
    return this;
  }

  /**
   * Get inDocMetadata
   * 
   * @return inDocMetadata
   **/
  @ApiModelProperty(value = "")
  public List<DocMetadata> getInDocMetadata() {
    return inDocMetadata;
  }

  public void setInDocMetadata(List<DocMetadata> inDocMetadata) {
    this.inDocMetadata = inDocMetadata;
  }

  public ReadBarcodesRes traceId(String traceId) {
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

  public ReadBarcodesRes jobId(String jobId) {
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

  public ReadBarcodesRes subscriptionUsage(SubscriptionUsage subscriptionUsage) {
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
    ReadBarcodesRes readBarcodesRes = (ReadBarcodesRes) o;
    return Objects.equals(this.barcodes, readBarcodesRes.barcodes)
        && Objects.equals(this.barcodeData, readBarcodesRes.barcodeData)
        && Objects.equals(this.billingData, readBarcodesRes.billingData)
        && Objects.equals(this.inDocMetadata, readBarcodesRes.inDocMetadata)
        && Objects.equals(this.traceId, readBarcodesRes.traceId) && Objects.equals(this.jobId, readBarcodesRes.jobId)
        && Objects.equals(this.subscriptionUsage, readBarcodesRes.subscriptionUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodes, barcodeData, billingData, inDocMetadata, traceId, jobId, subscriptionUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadBarcodesRes {\n");

    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    barcodeData: ").append(toIndentedString(barcodeData)).append("\n");
    sb.append("    billingData: ").append(toIndentedString(billingData)).append("\n");
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
