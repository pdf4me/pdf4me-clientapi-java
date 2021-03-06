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
import java.util.UUID;

/**
 * MailMergeJobAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class MailMergeJobAction {
  @SerializedName("print")
  private Boolean print = null;

  @SerializedName("printPackage")
  private String printPackage = null;

  @SerializedName("envelopeDelivery")
  private String envelopeDelivery = null;

  @SerializedName("envelopeType")
  private String envelopeType = null;

  @SerializedName("printPool")
  private String printPool = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("receiverId")
  private UUID receiverId = null;

  @SerializedName("actionId")
  private UUID actionId = null;

  public MailMergeJobAction print(Boolean print) {
    this.print = print;
    return this;
  }

  /**
   * Get print
   * 
   * @return print
   **/
  @ApiModelProperty(value = "")
  public Boolean isPrint() {
    return print;
  }

  public void setPrint(Boolean print) {
    this.print = print;
  }

  public MailMergeJobAction printPackage(String printPackage) {
    this.printPackage = printPackage;
    return this;
  }

  /**
   * Get printPackage
   * 
   * @return printPackage
   **/
  @ApiModelProperty(value = "")
  public String getPrintPackage() {
    return printPackage;
  }

  public void setPrintPackage(String printPackage) {
    this.printPackage = printPackage;
  }

  public MailMergeJobAction envelopeDelivery(String envelopeDelivery) {
    this.envelopeDelivery = envelopeDelivery;
    return this;
  }

  /**
   * Get envelopeDelivery
   * 
   * @return envelopeDelivery
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeDelivery() {
    return envelopeDelivery;
  }

  public void setEnvelopeDelivery(String envelopeDelivery) {
    this.envelopeDelivery = envelopeDelivery;
  }

  public MailMergeJobAction envelopeType(String envelopeType) {
    this.envelopeType = envelopeType;
    return this;
  }

  /**
   * Get envelopeType
   * 
   * @return envelopeType
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeType() {
    return envelopeType;
  }

  public void setEnvelopeType(String envelopeType) {
    this.envelopeType = envelopeType;
  }

  public MailMergeJobAction printPool(String printPool) {
    this.printPool = printPool;
    return this;
  }

  /**
   * Get printPool
   * 
   * @return printPool
   **/
  @ApiModelProperty(value = "")
  public String getPrintPool() {
    return printPool;
  }

  public void setPrintPool(String printPool) {
    this.printPool = printPool;
  }

  public MailMergeJobAction country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * 
   * @return country
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public MailMergeJobAction receiverId(UUID receiverId) {
    this.receiverId = receiverId;
    return this;
  }

  /**
   * Get receiverId
   * 
   * @return receiverId
   **/
  @ApiModelProperty(value = "")
  public UUID getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(UUID receiverId) {
    this.receiverId = receiverId;
  }

  public MailMergeJobAction actionId(UUID actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * 
   * @return actionId
   **/
  @ApiModelProperty(value = "")
  public UUID getActionId() {
    return actionId;
  }

  public void setActionId(UUID actionId) {
    this.actionId = actionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailMergeJobAction mailMergeJobAction = (MailMergeJobAction) o;
    return Objects.equals(this.print, mailMergeJobAction.print)
        && Objects.equals(this.printPackage, mailMergeJobAction.printPackage)
        && Objects.equals(this.envelopeDelivery, mailMergeJobAction.envelopeDelivery)
        && Objects.equals(this.envelopeType, mailMergeJobAction.envelopeType)
        && Objects.equals(this.printPool, mailMergeJobAction.printPool)
        && Objects.equals(this.country, mailMergeJobAction.country)
        && Objects.equals(this.receiverId, mailMergeJobAction.receiverId)
        && Objects.equals(this.actionId, mailMergeJobAction.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(print, printPackage, envelopeDelivery, envelopeType, printPool, country, receiverId, actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMergeJobAction {\n");

    sb.append("    print: ").append(toIndentedString(print)).append("\n");
    sb.append("    printPackage: ").append(toIndentedString(printPackage)).append("\n");
    sb.append("    envelopeDelivery: ").append(toIndentedString(envelopeDelivery)).append("\n");
    sb.append("    envelopeType: ").append(toIndentedString(envelopeType)).append("\n");
    sb.append("    printPool: ").append(toIndentedString(printPool)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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
