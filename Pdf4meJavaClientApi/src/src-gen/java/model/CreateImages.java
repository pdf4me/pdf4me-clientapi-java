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
import model.ImageAction;
import model.Notification;
import java.io.IOException;

/**
 * Thumbnails document
 */
@ApiModel(description = "Thumbnails document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class CreateImages {
  @SerializedName("document")
  private Document document = null;

  @SerializedName("imageAction")
  private ImageAction imageAction = null;

  @SerializedName("notification")
  private Notification notification = null;

  public CreateImages document(Document document) {
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

  public CreateImages imageAction(ImageAction imageAction) {
    this.imageAction = imageAction;
    return this;
  }

   /**
   * MrcAction configuration
   * @return imageAction
  **/
  @ApiModelProperty(value = "MrcAction configuration")
  public ImageAction getImageAction() {
    return imageAction;
  }

  public void setImageAction(ImageAction imageAction) {
    this.imageAction = imageAction;
  }

  public CreateImages notification(Notification notification) {
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
    CreateImages createImages = (CreateImages) o;
    return Objects.equals(this.document, createImages.document) &&
        Objects.equals(this.imageAction, createImages.imageAction) &&
        Objects.equals(this.notification, createImages.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, imageAction, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImages {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    imageAction: ").append(toIndentedString(imageAction)).append("\n");
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

