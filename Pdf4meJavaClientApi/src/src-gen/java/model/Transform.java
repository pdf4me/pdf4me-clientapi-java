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
 * Transform
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class Transform {
  @SerializedName("a")
  private Integer a = null;

  @SerializedName("b")
  private Integer b = null;

  @SerializedName("c")
  private Integer c = null;

  @SerializedName("d")
  private Integer d = null;

  @SerializedName("x")
  private Integer x = null;

  @SerializedName("y")
  private Integer y = null;

  public Transform a(Integer a) {
    this.a = a;
    return this;
  }

  /**
   * Get a
   * 
   * @return a
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getA() {
    return a;
  }

  public void setA(Integer a) {
    this.a = a;
  }

  public Transform b(Integer b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * 
   * @return b
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getB() {
    return b;
  }

  public void setB(Integer b) {
    this.b = b;
  }

  public Transform c(Integer c) {
    this.c = c;
    return this;
  }

  /**
   * Get c
   * 
   * @return c
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public Transform d(Integer d) {
    this.d = d;
    return this;
  }

  /**
   * Get d
   * 
   * @return d
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getD() {
    return d;
  }

  public void setD(Integer d) {
    this.d = d;
  }

  public Transform x(Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * 
   * @return x
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Transform y(Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * 
   * @return y
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transform transform = (Transform) o;
    return Objects.equals(this.a, transform.a) && Objects.equals(this.b, transform.b)
        && Objects.equals(this.c, transform.c) && Objects.equals(this.d, transform.d)
        && Objects.equals(this.x, transform.x) && Objects.equals(this.y, transform.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, c, d, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transform {\n");

    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
