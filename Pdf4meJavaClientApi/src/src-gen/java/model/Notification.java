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
import java.io.IOException;

/**
 * Notification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:27:16.545+02:00")
public class Notification {
  @SerializedName("getNotification")
  private Boolean getNotification = null;

  @SerializedName("connectionId")
  private String connectionId = null;

  public Notification getNotification(Boolean getNotification) {
    this.getNotification = getNotification;
    return this;
  }

   /**
   * Run execution in asynchronous way, get notified over Online WebHook
   * @return getNotification
  **/
  @ApiModelProperty(value = "Run execution in asynchronous way, get notified over Online WebHook")
  public Boolean isGetNotification() {
    return getNotification;
  }

  public void setGetNotification(Boolean getNotification) {
    this.getNotification = getNotification;
  }

  public Notification connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Will be used for Online WebHook
   * @return connectionId
  **/
  @ApiModelProperty(value = "Will be used for Online WebHook")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.getNotification, notification.getNotification) &&
        Objects.equals(this.connectionId, notification.connectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNotification, connectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    getNotification: ").append(toIndentedString(getNotification)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

