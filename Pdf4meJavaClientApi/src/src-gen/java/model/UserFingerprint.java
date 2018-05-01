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
 * UserFingerprint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class UserFingerprint {
  @SerializedName("ipAdress")
  private String ipAdress = null;

  @SerializedName("browser")
  private String browser = null;

  public UserFingerprint ipAdress(String ipAdress) {
    this.ipAdress = ipAdress;
    return this;
  }

   /**
   * Get ipAdress
   * @return ipAdress
  **/
  @ApiModelProperty(value = "")
  public String getIpAdress() {
    return ipAdress;
  }

  public void setIpAdress(String ipAdress) {
    this.ipAdress = ipAdress;
  }

  public UserFingerprint browser(String browser) {
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @ApiModelProperty(value = "")
  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFingerprint userFingerprint = (UserFingerprint) o;
    return Objects.equals(this.ipAdress, userFingerprint.ipAdress) &&
        Objects.equals(this.browser, userFingerprint.browser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAdress, browser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFingerprint {\n");
    
    sb.append("    ipAdress: ").append(toIndentedString(ipAdress)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
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

