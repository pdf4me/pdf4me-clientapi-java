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

/**
 * BarcodeColor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class BarcodeColor {
  @SerializedName("red")
  private Integer red = null;

  @SerializedName("green")
  private Integer green = null;

  @SerializedName("blue")
  private Integer blue = null;

  @SerializedName("alpha")
  private Integer alpha = null;

  public BarcodeColor red(Integer red) {
    this.red = red;
    return this;
  }

  /**
   * Get red
   * 
   * @return red
   **/
  @ApiModelProperty(value = "")
  public Integer getRed() {
    return red;
  }

  public void setRed(Integer red) {
    this.red = red;
  }

  public BarcodeColor green(Integer green) {
    this.green = green;
    return this;
  }

  /**
   * Get green
   * 
   * @return green
   **/
  @ApiModelProperty(value = "")
  public Integer getGreen() {
    return green;
  }

  public void setGreen(Integer green) {
    this.green = green;
  }

  public BarcodeColor blue(Integer blue) {
    this.blue = blue;
    return this;
  }

  /**
   * Get blue
   * 
   * @return blue
   **/
  @ApiModelProperty(value = "")
  public Integer getBlue() {
    return blue;
  }

  public void setBlue(Integer blue) {
    this.blue = blue;
  }

  public BarcodeColor alpha(Integer alpha) {
    this.alpha = alpha;
    return this;
  }

  /**
   * Get alpha
   * 
   * @return alpha
   **/
  @ApiModelProperty(value = "")
  public Integer getAlpha() {
    return alpha;
  }

  public void setAlpha(Integer alpha) {
    this.alpha = alpha;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeColor barcodeColor = (BarcodeColor) o;
    return Objects.equals(this.red, barcodeColor.red) && Objects.equals(this.green, barcodeColor.green)
        && Objects.equals(this.blue, barcodeColor.blue) && Objects.equals(this.alpha, barcodeColor.alpha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, green, blue, alpha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeColor {\n");

    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    green: ").append(toIndentedString(green)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
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