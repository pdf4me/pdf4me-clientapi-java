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
import org.threeten.bp.OffsetDateTime;

/**
 * ModelPackage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ModelPackage {
  @SerializedName("packageId")
  private UUID packageId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("creationName")
  private String creationName = null;

  @SerializedName("modDate")
  private OffsetDateTime modDate = null;

  @SerializedName("modName")
  private String modName = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  public ModelPackage packageId(UUID packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * 
   * @return packageId
   **/
  @ApiModelProperty(value = "")
  public UUID getPackageId() {
    return packageId;
  }

  public void setPackageId(UUID packageId) {
    this.packageId = packageId;
  }

  public ModelPackage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelPackage creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * 
   * @return creationDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ModelPackage creationName(String creationName) {
    this.creationName = creationName;
    return this;
  }

  /**
   * Get creationName
   * 
   * @return creationName
   **/
  @ApiModelProperty(value = "")
  public String getCreationName() {
    return creationName;
  }

  public void setCreationName(String creationName) {
    this.creationName = creationName;
  }

  public ModelPackage modDate(OffsetDateTime modDate) {
    this.modDate = modDate;
    return this;
  }

  /**
   * Get modDate
   * 
   * @return modDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModDate() {
    return modDate;
  }

  public void setModDate(OffsetDateTime modDate) {
    this.modDate = modDate;
  }

  public ModelPackage modName(String modName) {
    this.modName = modName;
    return this;
  }

  /**
   * Get modName
   * 
   * @return modName
   **/
  @ApiModelProperty(value = "")
  public String getModName() {
    return modName;
  }

  public void setModName(String modName) {
    this.modName = modName;
  }

  public ModelPackage version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * 
   * @return version
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ModelPackage downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   * 
   * @return downloadUrl
   **/
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.packageId, _package.packageId) && Objects.equals(this.name, _package.name)
        && Objects.equals(this.creationDate, _package.creationDate)
        && Objects.equals(this.creationName, _package.creationName) && Objects.equals(this.modDate, _package.modDate)
        && Objects.equals(this.modName, _package.modName) && Objects.equals(this.version, _package.version)
        && Objects.equals(this.downloadUrl, _package.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, name, creationDate, creationName, modDate, modName, version, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");

    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationName: ").append(toIndentedString(creationName)).append("\n");
    sb.append("    modDate: ").append(toIndentedString(modDate)).append("\n");
    sb.append("    modName: ").append(toIndentedString(modName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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
