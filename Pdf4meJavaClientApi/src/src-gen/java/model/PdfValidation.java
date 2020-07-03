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
import model.PdfValidationEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PdfValidation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class PdfValidation {
  @SerializedName("validations")
  private List<PdfValidationEvent> validations = null;

  @SerializedName("conformanceCodes")
  private List<String> conformanceCodes = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  public PdfValidation validations(List<PdfValidationEvent> validations) {
    this.validations = validations;
    return this;
  }

  public PdfValidation addValidationsItem(PdfValidationEvent validationsItem) {
    if (this.validations == null) {
      this.validations = new ArrayList<PdfValidationEvent>();
    }
    this.validations.add(validationsItem);
    return this;
  }

  /**
   * Get validations
   * 
   * @return validations
   **/
  @ApiModelProperty(value = "")
  public List<PdfValidationEvent> getValidations() {
    return validations;
  }

  public void setValidations(List<PdfValidationEvent> validations) {
    this.validations = validations;
  }

  public PdfValidation conformanceCodes(List<String> conformanceCodes) {
    this.conformanceCodes = conformanceCodes;
    return this;
  }

  public PdfValidation addConformanceCodesItem(String conformanceCodesItem) {
    if (this.conformanceCodes == null) {
      this.conformanceCodes = new ArrayList<String>();
    }
    this.conformanceCodes.add(conformanceCodesItem);
    return this;
  }

  /**
   * Get conformanceCodes
   * 
   * @return conformanceCodes
   **/
  @ApiModelProperty(value = "")
  public List<String> getConformanceCodes() {
    return conformanceCodes;
  }

  public void setConformanceCodes(List<String> conformanceCodes) {
    this.conformanceCodes = conformanceCodes;
  }

  public PdfValidation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * 
   * @return errorCode
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public PdfValidation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * 
   * @return errorMessage
   **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfValidation pdfValidation = (PdfValidation) o;
    return Objects.equals(this.validations, pdfValidation.validations)
        && Objects.equals(this.conformanceCodes, pdfValidation.conformanceCodes)
        && Objects.equals(this.errorCode, pdfValidation.errorCode)
        && Objects.equals(this.errorMessage, pdfValidation.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validations, conformanceCodes, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfValidation {\n");

    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    conformanceCodes: ").append(toIndentedString(conformanceCodes)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
