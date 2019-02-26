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

/**
 * PdfFont
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class PdfFont {
  @SerializedName("name")
  private String name = null;

  @SerializedName("fontContent")
  private byte[] fontContent = null;

  public PdfFont name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PdfFont fontContent(byte[] fontContent) {
    this.fontContent = fontContent;
    return this;
  }

   /**
   * Get fontContent
   * @return fontContent
  **/
  @ApiModelProperty(value = "")
  public byte[] getFontContent() {
    return fontContent;
  }

  public void setFontContent(byte[] fontContent) {
    this.fontContent = fontContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFont pdfFont = (PdfFont) o;
    return Objects.equals(this.name, pdfFont.name) &&
        Objects.equals(this.fontContent, pdfFont.fontContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fontContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFont {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fontContent: ").append(toIndentedString(fontContent)).append("\n");
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

