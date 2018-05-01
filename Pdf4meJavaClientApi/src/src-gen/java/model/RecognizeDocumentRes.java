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
import model.Document;
import java.io.IOException;

/**
 * Stamp Request with core data to stamp
 */
@ApiModel(description = "Stamp Request with core data to stamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class RecognizeDocumentRes {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("structuredDataJson")
  private String structuredDataJson = null;

  public RecognizeDocumentRes document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Stamped Document
   * @return document
  **/
  @ApiModelProperty(value = "Stamped Document")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public RecognizeDocumentRes structuredDataJson(String structuredDataJson) {
    this.structuredDataJson = structuredDataJson;
    return this;
  }

   /**
   * Get structuredDataJson
   * @return structuredDataJson
  **/
  @ApiModelProperty(value = "")
  public String getStructuredDataJson() {
    return structuredDataJson;
  }

  public void setStructuredDataJson(String structuredDataJson) {
    this.structuredDataJson = structuredDataJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecognizeDocumentRes recognizeDocumentRes = (RecognizeDocumentRes) o;
    return Objects.equals(this.document, recognizeDocumentRes.document) &&
        Objects.equals(this.structuredDataJson, recognizeDocumentRes.structuredDataJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, structuredDataJson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognizeDocumentRes {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    structuredDataJson: ").append(toIndentedString(structuredDataJson)).append("\n");
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

