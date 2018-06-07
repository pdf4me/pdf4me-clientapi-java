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
import model.Notification;
import model.OcrAction;
import java.io.IOException;

/**
 * Stamp Request with core data to stamp
 */
@ApiModel(description = "Stamp Request with core data to stamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:27:16.545+02:00")
public class RecognizeDocument {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("ocrAction")
  private OcrAction ocrAction = null;

  @SerializedName("notification")
  private Notification notification = null;

  public RecognizeDocument document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Give the document to change or use JobId/DocumentId to reference an uploaded document.
   * @return document
  **/
  @ApiModelProperty(value = "Give the document to change or use JobId/DocumentId to reference an uploaded document.")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public RecognizeDocument ocrAction(OcrAction ocrAction) {
    this.ocrAction = ocrAction;
    return this;
  }

   /**
   * Give an image stamp
   * @return ocrAction
  **/
  @ApiModelProperty(value = "Give an image stamp")
  public OcrAction getOcrAction() {
    return ocrAction;
  }

  public void setOcrAction(OcrAction ocrAction) {
    this.ocrAction = ocrAction;
  }

  public RecognizeDocument notification(Notification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Set Notification
   * @return notification
  **/
  @ApiModelProperty(value = "Set Notification")
  public Notification getNotification() {
    return notification;
  }

  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecognizeDocument recognizeDocument = (RecognizeDocument) o;
    return Objects.equals(this.document, recognizeDocument.document) &&
        Objects.equals(this.ocrAction, recognizeDocument.ocrAction) &&
        Objects.equals(this.notification, recognizeDocument.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, ocrAction, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognizeDocument {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    ocrAction: ").append(toIndentedString(ocrAction)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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

