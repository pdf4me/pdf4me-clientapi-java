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
import model.KeyValuePairStringObject;
import model.ScanBarcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScanPage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ScanPage {
  @SerializedName("barcodes")
  private List<ScanBarcode> barcodes = null;

  @SerializedName("pageNr")
  private Integer pageNr = null;

  @SerializedName("properties")
  private List<KeyValuePairStringObject> properties = null;

  public ScanPage barcodes(List<ScanBarcode> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public ScanPage addBarcodesItem(ScanBarcode barcodesItem) {
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

  public ScanPage pageNr(Integer pageNr) {
    this.pageNr = pageNr;
    return this;
  }

  /**
   * Get pageNr
   * 
   * @return pageNr
   **/
  @ApiModelProperty(value = "")
  public Integer getPageNr() {
    return pageNr;
  }

  public void setPageNr(Integer pageNr) {
    this.pageNr = pageNr;
  }

  public ScanPage properties(List<KeyValuePairStringObject> properties) {
    this.properties = properties;
    return this;
  }

  public ScanPage addPropertiesItem(KeyValuePairStringObject propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<KeyValuePairStringObject>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * 
   * @return properties
   **/
  @ApiModelProperty(value = "")
  public List<KeyValuePairStringObject> getProperties() {
    return properties;
  }

  public void setProperties(List<KeyValuePairStringObject> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanPage scanPage = (ScanPage) o;
    return Objects.equals(this.barcodes, scanPage.barcodes) && Objects.equals(this.pageNr, scanPage.pageNr)
        && Objects.equals(this.properties, scanPage.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodes, pageNr, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanPage {\n");

    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    pageNr: ").append(toIndentedString(pageNr)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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