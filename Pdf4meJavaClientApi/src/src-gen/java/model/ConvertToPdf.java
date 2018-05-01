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
import model.ConvertToPdfAction;
import model.Document;
import model.Notification;
import java.io.IOException;

/**
 * Convert any document to a PDF
 */
@ApiModel(description = "Convert any document to a PDF")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class ConvertToPdf {
  @SerializedName("notification")
  private Notification notification = null;

  @SerializedName("document")
  private Document document = null;

  @SerializedName("convertToPdfAction")
  private ConvertToPdfAction convertToPdfAction = null;

  public ConvertToPdf notification(Notification notification) {
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

  public ConvertToPdf document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Document containing the data
   * @return document
  **/
  @ApiModelProperty(value = "Document containing the data")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public ConvertToPdf convertToPdfAction(ConvertToPdfAction convertToPdfAction) {
    this.convertToPdfAction = convertToPdfAction;
    return this;
  }

   /**
   * Conversion configuration
   * @return convertToPdfAction
  **/
  @ApiModelProperty(value = "Conversion configuration")
  public ConvertToPdfAction getConvertToPdfAction() {
    return convertToPdfAction;
  }

  public void setConvertToPdfAction(ConvertToPdfAction convertToPdfAction) {
    this.convertToPdfAction = convertToPdfAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertToPdf convertToPdf = (ConvertToPdf) o;
    return Objects.equals(this.notification, convertToPdf.notification) &&
        Objects.equals(this.document, convertToPdf.document) &&
        Objects.equals(this.convertToPdfAction, convertToPdf.convertToPdfAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notification, document, convertToPdfAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertToPdf {\n");
    
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    convertToPdfAction: ").append(toIndentedString(convertToPdfAction)).append("\n");
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

