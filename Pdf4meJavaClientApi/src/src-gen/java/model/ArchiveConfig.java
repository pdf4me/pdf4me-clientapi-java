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
import model.KeyValuePairStringString;
import model.SignatureConfig;
import model.StampAction;

/**
 * ArchiveConfig
 */
@ApiModel(description = "ArchiveConfig")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ArchiveConfig {
  @SerializedName("archiveMetadata")
  private List<KeyValuePairStringString> archiveMetadata = new ArrayList<KeyValuePairStringString>();

  @SerializedName("stampAction")
  private StampAction stampAction = null;

  @SerializedName("signatureConfig")
  private SignatureConfig signatureConfig = null;

  @SerializedName("useTSA")
  private Boolean useTSA = null;

  public ArchiveConfig archiveMetadata(List<KeyValuePairStringString> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
    return this;
  }

  public ArchiveConfig addArchiveMetadataItem(KeyValuePairStringString archiveMetadataItem) {
    this.archiveMetadata.add(archiveMetadataItem);
    return this;
  }

  /**
   * Give the documents metadata for archiving.
   * 
   * @return archiveMetadata
   **/
  @ApiModelProperty(required = true, value = "Give the documents metadata for archiving.")
  public List<KeyValuePairStringString> getArchiveMetadata() {
    return archiveMetadata;
  }

  public void setArchiveMetadata(List<KeyValuePairStringString> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
  }

  public ArchiveConfig stampAction(StampAction stampAction) {
    this.stampAction = stampAction;
    return this;
  }

  /**
   * Place a signature stamp on to the document.
   * 
   * @return stampAction
   **/
  @ApiModelProperty(value = "Place a signature stamp on to the document.")
  public StampAction getStampAction() {
    return stampAction;
  }

  public void setStampAction(StampAction stampAction) {
    this.stampAction = stampAction;
  }

  public ArchiveConfig signatureConfig(SignatureConfig signatureConfig) {
    this.signatureConfig = signatureConfig;
    return this;
  }

  /**
   * Give your Signature Configure to get the electronical Identity.
   * 
   * @return signatureConfig
   **/
  @ApiModelProperty(value = "Give your Signature Configure to get the electronical Identity.")
  public SignatureConfig getSignatureConfig() {
    return signatureConfig;
  }

  public void setSignatureConfig(SignatureConfig signatureConfig) {
    this.signatureConfig = signatureConfig;
  }

  public ArchiveConfig useTSA(Boolean useTSA) {
    this.useTSA = useTSA;
    return this;
  }

  /**
   * To guarantee the time of change use a Time Stamp Service.
   * 
   * @return useTSA
   **/
  @ApiModelProperty(value = "To guarantee the time of change use a Time Stamp Service.")
  public Boolean isUseTSA() {
    return useTSA;
  }

  public void setUseTSA(Boolean useTSA) {
    this.useTSA = useTSA;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveConfig archiveConfig = (ArchiveConfig) o;
    return Objects.equals(this.archiveMetadata, archiveConfig.archiveMetadata)
        && Objects.equals(this.stampAction, archiveConfig.stampAction)
        && Objects.equals(this.signatureConfig, archiveConfig.signatureConfig)
        && Objects.equals(this.useTSA, archiveConfig.useTSA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveMetadata, stampAction, signatureConfig, useTSA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveConfig {\n");

    sb.append("    archiveMetadata: ").append(toIndentedString(archiveMetadata)).append("\n");
    sb.append("    stampAction: ").append(toIndentedString(stampAction)).append("\n");
    sb.append("    signatureConfig: ").append(toIndentedString(signatureConfig)).append("\n");
    sb.append("    useTSA: ").append(toIndentedString(useTSA)).append("\n");
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
