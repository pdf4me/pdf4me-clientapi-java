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
 * ApplicationToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ApplicationToken {
  @SerializedName("token")
  private String token = null;

  /**
   * Gets or Sets keyType
   */
  @JsonAdapter(KeyTypeEnum.Adapter.class)
  public enum KeyTypeEnum {
    NONE("none"),

    PRIMARY("primary"),

    SECONDARY("secondary"),

    ALL("all");

    private String value;

    KeyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyTypeEnum fromValue(String text) {
      for (KeyTypeEnum b : KeyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("keyType")
  private KeyTypeEnum keyType = null;

  public ApplicationToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * 
   * @return token
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ApplicationToken keyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   * 
   * @return keyType
   **/
  @ApiModelProperty(value = "")
  public KeyTypeEnum getKeyType() {
    return keyType;
  }

  public void setKeyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationToken applicationToken = (ApplicationToken) o;
    return Objects.equals(this.token, applicationToken.token) && Objects.equals(this.keyType, applicationToken.keyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, keyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationToken {\n");

    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
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
