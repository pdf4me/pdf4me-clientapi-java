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
import model.ActionFlow;
import model.ExecutionTrigger;
import model.StorageFolder;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * JobConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T13:33:59.770+02:00")
public class JobConfig {
  @SerializedName("jobConfigId")
  private UUID jobConfigId = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("modDate")
  private OffsetDateTime modDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("userId")
  private UUID userId = null;

  @SerializedName("sourceFolder")
  private StorageFolder sourceFolder = null;

  @SerializedName("executionTrigger")
  private ExecutionTrigger executionTrigger = null;

  @SerializedName("actionFlow")
  private ActionFlow actionFlow = null;

  @SerializedName("targetFolder")
  private StorageFolder targetFolder = null;

  public JobConfig jobConfigId(UUID jobConfigId) {
    this.jobConfigId = jobConfigId;
    return this;
  }

   /**
   * Get jobConfigId
   * @return jobConfigId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getJobConfigId() {
    return jobConfigId;
  }

  public void setJobConfigId(UUID jobConfigId) {
    this.jobConfigId = jobConfigId;
  }

  public JobConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public JobConfig active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JobConfig creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public JobConfig modDate(OffsetDateTime modDate) {
    this.modDate = modDate;
    return this;
  }

   /**
   * Get modDate
   * @return modDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModDate() {
    return modDate;
  }

  public void setModDate(OffsetDateTime modDate) {
    this.modDate = modDate;
  }

  public JobConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobConfig userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public JobConfig sourceFolder(StorageFolder sourceFolder) {
    this.sourceFolder = sourceFolder;
    return this;
  }

   /**
   * Get sourceFolder
   * @return sourceFolder
  **/
  @ApiModelProperty(value = "")
  public StorageFolder getSourceFolder() {
    return sourceFolder;
  }

  public void setSourceFolder(StorageFolder sourceFolder) {
    this.sourceFolder = sourceFolder;
  }

  public JobConfig executionTrigger(ExecutionTrigger executionTrigger) {
    this.executionTrigger = executionTrigger;
    return this;
  }

   /**
   * Get executionTrigger
   * @return executionTrigger
  **/
  @ApiModelProperty(value = "")
  public ExecutionTrigger getExecutionTrigger() {
    return executionTrigger;
  }

  public void setExecutionTrigger(ExecutionTrigger executionTrigger) {
    this.executionTrigger = executionTrigger;
  }

  public JobConfig actionFlow(ActionFlow actionFlow) {
    this.actionFlow = actionFlow;
    return this;
  }

   /**
   * Get actionFlow
   * @return actionFlow
  **/
  @ApiModelProperty(value = "")
  public ActionFlow getActionFlow() {
    return actionFlow;
  }

  public void setActionFlow(ActionFlow actionFlow) {
    this.actionFlow = actionFlow;
  }

  public JobConfig targetFolder(StorageFolder targetFolder) {
    this.targetFolder = targetFolder;
    return this;
  }

   /**
   * Get targetFolder
   * @return targetFolder
  **/
  @ApiModelProperty(value = "")
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
    JobConfig jobConfig = (JobConfig) o;
    return Objects.equals(this.jobConfigId, jobConfig.jobConfigId) &&
        Objects.equals(this.enabled, jobConfig.enabled) &&
        Objects.equals(this.active, jobConfig.active) &&
        Objects.equals(this.creationDate, jobConfig.creationDate) &&
        Objects.equals(this.modDate, jobConfig.modDate) &&
        Objects.equals(this.name, jobConfig.name) &&
        Objects.equals(this.userId, jobConfig.userId) &&
        Objects.equals(this.sourceFolder, jobConfig.sourceFolder) &&
        Objects.equals(this.executionTrigger, jobConfig.executionTrigger) &&
        Objects.equals(this.actionFlow, jobConfig.actionFlow) &&
        Objects.equals(this.targetFolder, jobConfig.targetFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobConfigId, enabled, active, creationDate, modDate, name, userId, sourceFolder, executionTrigger, actionFlow, targetFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfig {\n");
    
    sb.append("    jobConfigId: ").append(toIndentedString(jobConfigId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modDate: ").append(toIndentedString(modDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sourceFolder: ").append(toIndentedString(sourceFolder)).append("\n");
    sb.append("    executionTrigger: ").append(toIndentedString(executionTrigger)).append("\n");
    sb.append("    actionFlow: ").append(toIndentedString(actionFlow)).append("\n");
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

