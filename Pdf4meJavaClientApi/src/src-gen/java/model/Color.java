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
 * Color
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T10:27:16.545+02:00")
public class Color {
  @SerializedName("red")
  private Integer red = null;

  @SerializedName("green")
  private Integer green = null;

  @SerializedName("blue")
  private Integer blue = null;

  public Color red(Integer red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public Integer getRed() {
    return red;
  }

  public void setRed(Integer red) {
    this.red = red;
  }

  public Color green(Integer green) {
    this.green = green;
    return this;
  }

   /**
   * Get green
   * @return green
  **/
  @ApiModelProperty(value = "")
  public Integer getGreen() {
    return green;
  }

  public void setGreen(Integer green) {
    this.green = green;
  }

  public Color blue(Integer blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public Integer getBlue() {
    return blue;
  }

  public void setBlue(Integer blue) {
    this.blue = blue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color color = (Color) o;
    return Objects.equals(this.red, color.red) &&
        Objects.equals(this.green, color.green) &&
        Objects.equals(this.blue, color.blue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, green, blue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    green: ").append(toIndentedString(green)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
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

