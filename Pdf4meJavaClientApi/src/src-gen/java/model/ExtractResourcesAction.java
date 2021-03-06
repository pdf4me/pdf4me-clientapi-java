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

/**
 * ExtractResourcesAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ExtractResourcesAction {
  @SerializedName("extractFonts")
  private Boolean extractFonts = null;

  @SerializedName("extractImages")
  private Boolean extractImages = null;

  @SerializedName("listFonts")
  private Boolean listFonts = null;

  @SerializedName("listImages")
  private Boolean listImages = null;

  @SerializedName("outlines")
  private Boolean outlines = null;

  @SerializedName("xmpMetadata")
  private Boolean xmpMetadata = null;

  @SerializedName("extractText")
  private Boolean extractText = null;

  @SerializedName("actionId")
  private UUID actionId = null;

  public ExtractResourcesAction extractFonts(Boolean extractFonts) {
    this.extractFonts = extractFonts;
    return this;
  }

  /**
   * Get or set whether to extract embedded fonts. Depending on the font type, the
   * extracted font has one of the following three formats: fnt‹objno›.ttf or
   * fnt‹objno›.pfb or fnt‹objno›.cff, where ‹objno› is the number of the PDF
   * object of the font. {default: false}
   * 
   * @return extractFonts
   **/
  @ApiModelProperty(value = " Get or set whether to extract embedded fonts. Depending on the font type, the extracted font has one of the   following three formats: fnt‹objno›.ttf or fnt‹objno›.pfb or fnt‹objno›.cff, where ‹objno› is the  number of the PDF object of the font.   {default:  false}")
  public Boolean isExtractFonts() {
    return extractFonts;
  }

  public void setExtractFonts(Boolean extractFonts) {
    this.extractFonts = extractFonts;
  }

  public ExtractResourcesAction extractImages(Boolean extractImages) {
    this.extractImages = extractImages;
    return this;
  }

  /**
   * Get or set whether to extract images.Depending on the compression, the
   * extracted image has one of the following formats: img‹objno›.tif or
   * img‹objno›.jpg, where objno is the number of the PDF object of the image.
   * {default: false}
   * 
   * @return extractImages
   **/
  @ApiModelProperty(value = "Get or set whether to extract images.Depending on the compression, the extracted image has one of the following  formats: img‹objno›.tif or img‹objno›.jpg, where objno is the number of the PDF object of the image.  {default:  false}")
  public Boolean isExtractImages() {
    return extractImages;
  }

  public void setExtractImages(Boolean extractImages) {
    this.extractImages = extractImages;
  }

  public ExtractResourcesAction listFonts(Boolean listFonts) {
    this.listFonts = listFonts;
    return this;
  }

  /**
   * List all fonts included in the document and write them as a list to a text
   * file {default: false}
   * 
   * @return listFonts
   **/
  @ApiModelProperty(value = "List all fonts included in the document and write them as a list to a text file  {default:  false}")
  public Boolean isListFonts() {
    return listFonts;
  }

  public void setListFonts(Boolean listFonts) {
    this.listFonts = listFonts;
  }

  public ExtractResourcesAction listImages(Boolean listImages) {
    this.listImages = listImages;
    return this;
  }

  /**
   * List all images included in the document and write them as a list to a text
   * file. {default: false}
   * 
   * @return listImages
   **/
  @ApiModelProperty(value = "List all images included in the document and write them as a list to a text file.  {default:  false}")
  public Boolean isListImages() {
    return listImages;
  }

  public void setListImages(Boolean listImages) {
    this.listImages = listImages;
  }

  public ExtractResourcesAction outlines(Boolean outlines) {
    this.outlines = outlines;
    return this;
  }

  /**
   * Get outlines
   * 
   * @return outlines
   **/
  @ApiModelProperty(value = "")
  public Boolean isOutlines() {
    return outlines;
  }

  public void setOutlines(Boolean outlines) {
    this.outlines = outlines;
  }

  public ExtractResourcesAction xmpMetadata(Boolean xmpMetadata) {
    this.xmpMetadata = xmpMetadata;
    return this;
  }

  /**
   * Get xmpMetadata
   * 
   * @return xmpMetadata
   **/
  @ApiModelProperty(value = "")
  public Boolean isXmpMetadata() {
    return xmpMetadata;
  }

  public void setXmpMetadata(Boolean xmpMetadata) {
    this.xmpMetadata = xmpMetadata;
  }

  public ExtractResourcesAction extractText(Boolean extractText) {
    this.extractText = extractText;
    return this;
  }

  /**
   * Get extractText
   * 
   * @return extractText
   **/
  @ApiModelProperty(value = "")
  public Boolean isExtractText() {
    return extractText;
  }

  public void setExtractText(Boolean extractText) {
    this.extractText = extractText;
  }

  public ExtractResourcesAction actionId(UUID actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * 
   * @return actionId
   **/
  @ApiModelProperty(value = "")
  public UUID getActionId() {
    return actionId;
  }

  public void setActionId(UUID actionId) {
    this.actionId = actionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractResourcesAction extractResourcesAction = (ExtractResourcesAction) o;
    return Objects.equals(this.extractFonts, extractResourcesAction.extractFonts)
        && Objects.equals(this.extractImages, extractResourcesAction.extractImages)
        && Objects.equals(this.listFonts, extractResourcesAction.listFonts)
        && Objects.equals(this.listImages, extractResourcesAction.listImages)
        && Objects.equals(this.outlines, extractResourcesAction.outlines)
        && Objects.equals(this.xmpMetadata, extractResourcesAction.xmpMetadata)
        && Objects.equals(this.extractText, extractResourcesAction.extractText)
        && Objects.equals(this.actionId, extractResourcesAction.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extractFonts, extractImages, listFonts, listImages, outlines, xmpMetadata, extractText,
        actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractResourcesAction {\n");

    sb.append("    extractFonts: ").append(toIndentedString(extractFonts)).append("\n");
    sb.append("    extractImages: ").append(toIndentedString(extractImages)).append("\n");
    sb.append("    listFonts: ").append(toIndentedString(listFonts)).append("\n");
    sb.append("    listImages: ").append(toIndentedString(listImages)).append("\n");
    sb.append("    outlines: ").append(toIndentedString(outlines)).append("\n");
    sb.append("    xmpMetadata: ").append(toIndentedString(xmpMetadata)).append("\n");
    sb.append("    extractText: ").append(toIndentedString(extractText)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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
