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
import java.util.UUID;
import model.ArchiveConfig;
import model.ExecutionTrigger;
import model.StorageFolder;

/**
 * ArchiveJobReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class ArchiveJobReq {
  @SerializedName("jobId")
  private UUID jobId = null;

  @SerializedName("sourceFolder")
  private StorageFolder sourceFolder = null;

  @SerializedName("executionTrigger")
  private ExecutionTrigger executionTrigger = null;

  @SerializedName("archiveConfig")
  private ArchiveConfig archiveConfig = null;

  @SerializedName("targetFolder")
  private StorageFolder targetFolder = null;

  public ArchiveJobReq jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public ArchiveJobReq sourceFolder(StorageFolder sourceFolder) {
    this.sourceFolder = sourceFolder;
    return this;
  }

   /**
   * Get sourceFolder
   * @return sourceFolder
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageFolder getSourceFolder() {
    return sourceFolder;
  }

  public void setSourceFolder(StorageFolder sourceFolder) {
    this.sourceFolder = sourceFolder;
  }

  public ArchiveJobReq executionTrigger(ExecutionTrigger executionTrigger) {
    this.executionTrigger = executionTrigger;
    return this;
  }

   /**
   * Get executionTrigger
   * @return executionTrigger
  **/
  @ApiModelProperty(required = true, value = "")
  public ExecutionTrigger getExecutionTrigger() {
    return executionTrigger;
  }

  public void setExecutionTrigger(ExecutionTrigger executionTrigger) {
    this.executionTrigger = executionTrigger;
  }

  public ArchiveJobReq archiveConfig(ArchiveConfig archiveConfig) {
    this.archiveConfig = archiveConfig;
    return this;
  }

   /**
   * Get archiveConfig
   * @return archiveConfig
  **/
  @ApiModelProperty(required = true, value = "")
  public ArchiveConfig getArchiveConfig() {
    return archiveConfig;
  }

  public void setArchiveConfig(ArchiveConfig archiveConfig) {
    this.archiveConfig = archiveConfig;
  }

  public ArchiveJobReq targetFolder(StorageFolder targetFolder) {
    this.targetFolder = targetFolder;
    return this;
  }

   /**
   * Get targetFolder
   * @return targetFolder
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageFolder getTargetFolder() {
    return targetFolder;
  }

  public void setTargetFolder(StorageFolder targetFolder) {
    this.targetFolder = targetFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveJobReq archiveJobReq = (ArchiveJobReq) o;
    return Objects.equals(this.jobId, archiveJobReq.jobId) &&
        Objects.equals(this.sourceFolder, archiveJobReq.sourceFolder) &&
        Objects.equals(this.executionTrigger, archiveJobReq.executionTrigger) &&
        Objects.equals(this.archiveConfig, archiveJobReq.archiveConfig) &&
        Objects.equals(this.targetFolder, archiveJobReq.targetFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, sourceFolder, executionTrigger, archiveConfig, targetFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveJobReq {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    sourceFolder: ").append(toIndentedString(sourceFolder)).append("\n");
    sb.append("    executionTrigger: ").append(toIndentedString(executionTrigger)).append("\n");
    sb.append("    archiveConfig: ").append(toIndentedString(archiveConfig)).append("\n");
    sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
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

