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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SplitAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class SplitAction {
  @SerializedName("splitAfterPage")
  private Integer splitAfterPage = null;

  @SerializedName("splitSequence")
  private List<Integer> splitSequence = null;

  @SerializedName("recurringSplitAfterPage")
  private Integer recurringSplitAfterPage = null;

  @SerializedName("barcodeStartsWith")
  private String barcodeStartsWith = null;

  @SerializedName("actionId")
  private UUID actionId = null;

  public SplitAction splitAfterPage(Integer splitAfterPage) {
    this.splitAfterPage = splitAfterPage;
    return this;
  }

  /**
   * Get splitAfterPage
   * 
   * @return splitAfterPage
   **/
  @ApiModelProperty(value = "")
  public Integer getSplitAfterPage() {
    return splitAfterPage;
  }

  public void setSplitAfterPage(Integer splitAfterPage) {
    this.splitAfterPage = splitAfterPage;
  }

  public SplitAction splitSequence(List<Integer> splitSequence) {
    this.splitSequence = splitSequence;
    return this;
  }

  public SplitAction addSplitSequenceItem(Integer splitSequenceItem) {
    if (this.splitSequence == null) {
      this.splitSequence = new ArrayList<Integer>();
    }
    this.splitSequence.add(splitSequenceItem);
    return this;
  }

  /**
   * Get splitSequence
   * 
   * @return splitSequence
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getSplitSequence() {
    return splitSequence;
  }

  public void setSplitSequence(List<Integer> splitSequence) {
    this.splitSequence = splitSequence;
  }

  public SplitAction recurringSplitAfterPage(Integer recurringSplitAfterPage) {
    this.recurringSplitAfterPage = recurringSplitAfterPage;
    return this;
  }

  /**
   * Get recurringSplitAfterPage
   * 
   * @return recurringSplitAfterPage
   **/
  @ApiModelProperty(value = "")
  public Integer getRecurringSplitAfterPage() {
    return recurringSplitAfterPage;
  }

  public void setRecurringSplitAfterPage(Integer recurringSplitAfterPage) {
    this.recurringSplitAfterPage = recurringSplitAfterPage;
  }

  public SplitAction barcodeStartsWith(String barcodeStartsWith) {
    this.barcodeStartsWith = barcodeStartsWith;
    return this;
  }

  /**
   * Get barcodeStartsWith
   * 
   * @return barcodeStartsWith
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeStartsWith() {
    return barcodeStartsWith;
  }

  public void setBarcodeStartsWith(String barcodeStartsWith) {
    this.barcodeStartsWith = barcodeStartsWith;
  }

  public SplitAction actionId(UUID actionId) {
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
    SplitAction splitAction = (SplitAction) o;
    return Objects.equals(this.splitAfterPage, splitAction.splitAfterPage)
        && Objects.equals(this.splitSequence, splitAction.splitSequence)
        && Objects.equals(this.recurringSplitAfterPage, splitAction.recurringSplitAfterPage)
        && Objects.equals(this.barcodeStartsWith, splitAction.barcodeStartsWith)
        && Objects.equals(this.actionId, splitAction.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitAfterPage, splitSequence, recurringSplitAfterPage, barcodeStartsWith, actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitAction {\n");

    sb.append("    splitAfterPage: ").append(toIndentedString(splitAfterPage)).append("\n");
    sb.append("    splitSequence: ").append(toIndentedString(splitSequence)).append("\n");
    sb.append("    recurringSplitAfterPage: ").append(toIndentedString(recurringSplitAfterPage)).append("\n");
    sb.append("    barcodeStartsWith: ").append(toIndentedString(barcodeStartsWith)).append("\n");
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
