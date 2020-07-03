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
import org.threeten.bp.OffsetDateTime;

/**
 * DocLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class DocLog {
  @SerializedName("messageType")
  private String messageType = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  /**
   * Gets or Sets docLogLevel
   */
  @JsonAdapter(DocLogLevelEnum.Adapter.class)
  public enum DocLogLevelEnum {
    VERBOSE("verbose"),

    INFO("info"),

    WARNING("warning"),

    ERROR("error"),

    TIMING("timing");

    private String value;

    DocLogLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocLogLevelEnum fromValue(String text) {
      for (DocLogLevelEnum b : DocLogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocLogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocLogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocLogLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocLogLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("docLogLevel")
  private DocLogLevelEnum docLogLevel = null;

  @SerializedName("durationMilliseconds")
  private Long durationMilliseconds = null;

  public DocLog messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Get messageType
   * 
   * @return messageType
   **/
  @ApiModelProperty(value = "")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public DocLog message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * 
   * @return message
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DocLog timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * 
   * @return timestamp
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public DocLog docLogLevel(DocLogLevelEnum docLogLevel) {
    this.docLogLevel = docLogLevel;
    return this;
  }

  /**
   * Get docLogLevel
   * 
   * @return docLogLevel
   **/
  @ApiModelProperty(value = "")
  public DocLogLevelEnum getDocLogLevel() {
    return docLogLevel;
  }

  public void setDocLogLevel(DocLogLevelEnum docLogLevel) {
    this.docLogLevel = docLogLevel;
  }

  public DocLog durationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }

  /**
   * Get durationMilliseconds
   * 
   * @return durationMilliseconds
   **/
  @ApiModelProperty(value = "")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }

  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocLog docLog = (DocLog) o;
    return Objects.equals(this.messageType, docLog.messageType) && Objects.equals(this.message, docLog.message)
        && Objects.equals(this.timestamp, docLog.timestamp) && Objects.equals(this.docLogLevel, docLog.docLogLevel)
        && Objects.equals(this.durationMilliseconds, docLog.durationMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, message, timestamp, docLogLevel, durationMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocLog {\n");

    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    docLogLevel: ").append(toIndentedString(docLogLevel)).append("\n");
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
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
