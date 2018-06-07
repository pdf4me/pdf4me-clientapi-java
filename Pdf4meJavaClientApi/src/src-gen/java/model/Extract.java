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
import model.ExtractAction;
import model.Notification;
import java.io.IOException;

/**
 * Extract
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:27:16.545+02:00")
public class Extract {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("extractAction")
  private ExtractAction extractAction = null;

  @SerializedName("notification")
  private Notification notification = null;

  public Extract document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public Extract extractAction(ExtractAction extractAction) {
    this.extractAction = extractAction;
    return this;
  }

   /**
   * Get extractAction
   * @return extractAction
  **/
  @ApiModelProperty(value = "")
  public ExtractAction getExtractAction() {
    return extractAction;
  }

  public void setExtractAction(ExtractAction extractAction) {
    this.extractAction = extractAction;
  }

  public Extract notification(Notification notification) {
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
    Extract extract = (Extract) o;
    return Objects.equals(this.document, extract.document) &&
        Objects.equals(this.extractAction, extract.extractAction) &&
        Objects.equals(this.notification, extract.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, extractAction, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extract {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    extractAction: ").append(toIndentedString(extractAction)).append("\n");
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

