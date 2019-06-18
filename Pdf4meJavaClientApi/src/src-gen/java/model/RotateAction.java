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
import model.PdfRotate;

/**
 * RotateAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class RotateAction {
  @SerializedName("rotationList")
  private List<PdfRotate> rotationList = null;

  public RotateAction rotationList(List<PdfRotate> rotationList) {
    this.rotationList = rotationList;
    return this;
  }

  public RotateAction addRotationListItem(PdfRotate rotationListItem) {
    if (this.rotationList == null) {
      this.rotationList = new ArrayList<PdfRotate>();
    }
    this.rotationList.add(rotationListItem);
    return this;
  }

   /**
   * Get rotationList
   * @return rotationList
  **/
  @ApiModelProperty(value = "")
  public List<PdfRotate> getRotationList() {
    return rotationList;
  }

  public void setRotationList(List<PdfRotate> rotationList) {
    this.rotationList = rotationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateAction rotateAction = (RotateAction) o;
    return Objects.equals(this.rotationList, rotateAction.rotationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotationList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateAction {\n");
    
    sb.append("    rotationList: ").append(toIndentedString(rotationList)).append("\n");
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
