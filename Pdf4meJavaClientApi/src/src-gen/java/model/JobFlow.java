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
import model.ActionFlow;
import model.JobFlowPlan;
import org.threeten.bp.OffsetDateTime;

/**
 * JobFlow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class JobFlow {
  @SerializedName("jobFlowId")
  private UUID jobFlowId = null;

  @SerializedName("tenantId")
  private UUID tenantId = null;

  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;

  @SerializedName("applicationId")
  private UUID applicationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("actionFlow")
  private ActionFlow actionFlow = null;

  @SerializedName("jobFlowPlans")
  private List<JobFlowPlan> jobFlowPlans = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("creationName")
  private String creationName = null;

  @SerializedName("modDate")
  private OffsetDateTime modDate = null;

  @SerializedName("modName")
  private String modName = null;

  public JobFlow jobFlowId(UUID jobFlowId) {
    this.jobFlowId = jobFlowId;
    return this;
  }

  /**
   * Get jobFlowId
   * 
   * @return jobFlowId
   **/
  @ApiModelProperty(value = "")
  public UUID getJobFlowId() {
    return jobFlowId;
  }

  public void setJobFlowId(UUID jobFlowId) {
    this.jobFlowId = jobFlowId;
  }

  public JobFlow tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * 
   * @return tenantId
   **/
  @ApiModelProperty(value = "")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public JobFlow subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * 
   * @return subscriptionId
   **/
  @ApiModelProperty(value = "")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public JobFlow applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * 
   * @return applicationId
   **/
  @ApiModelProperty(value = "")
  public UUID getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  public JobFlow name(String name) {
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

  public JobFlow actionFlow(ActionFlow actionFlow) {
    this.actionFlow = actionFlow;
    return this;
  }

  /**
   * Get actionFlow
   * 
   * @return actionFlow
   **/
  @ApiModelProperty(value = "")
  public ActionFlow getActionFlow() {
    return actionFlow;
  }

  public void setActionFlow(ActionFlow actionFlow) {
    this.actionFlow = actionFlow;
  }

  public JobFlow jobFlowPlans(List<JobFlowPlan> jobFlowPlans) {
    this.jobFlowPlans = jobFlowPlans;
    return this;
  }

  public JobFlow addJobFlowPlansItem(JobFlowPlan jobFlowPlansItem) {
    if (this.jobFlowPlans == null) {
      this.jobFlowPlans = new ArrayList<JobFlowPlan>();
    }
    this.jobFlowPlans.add(jobFlowPlansItem);
    return this;
  }

  /**
   * Get jobFlowPlans
   * 
   * @return jobFlowPlans
   **/
  @ApiModelProperty(value = "")
  public List<JobFlowPlan> getJobFlowPlans() {
    return jobFlowPlans;
  }

  public void setJobFlowPlans(List<JobFlowPlan> jobFlowPlans) {
    this.jobFlowPlans = jobFlowPlans;
  }

  public JobFlow creationDate(OffsetDateTime creationDate) {
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

  public JobFlow creationName(String creationName) {
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

  public JobFlow modDate(OffsetDateTime modDate) {
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

  public JobFlow modName(String modName) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobFlow jobFlow = (JobFlow) o;
    return Objects.equals(this.jobFlowId, jobFlow.jobFlowId) && Objects.equals(this.tenantId, jobFlow.tenantId)
        && Objects.equals(this.subscriptionId, jobFlow.subscriptionId)
        && Objects.equals(this.applicationId, jobFlow.applicationId) && Objects.equals(this.name, jobFlow.name)
        && Objects.equals(this.actionFlow, jobFlow.actionFlow)
        && Objects.equals(this.jobFlowPlans, jobFlow.jobFlowPlans)
        && Objects.equals(this.creationDate, jobFlow.creationDate)
        && Objects.equals(this.creationName, jobFlow.creationName) && Objects.equals(this.modDate, jobFlow.modDate)
        && Objects.equals(this.modName, jobFlow.modName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobFlowId, tenantId, subscriptionId, applicationId, name, actionFlow, jobFlowPlans,
        creationDate, creationName, modDate, modName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobFlow {\n");

    sb.append("    jobFlowId: ").append(toIndentedString(jobFlowId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actionFlow: ").append(toIndentedString(actionFlow)).append("\n");
    sb.append("    jobFlowPlans: ").append(toIndentedString(jobFlowPlans)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationName: ").append(toIndentedString(creationName)).append("\n");
    sb.append("    modDate: ").append(toIndentedString(modDate)).append("\n");
    sb.append("    modName: ").append(toIndentedString(modName)).append("\n");
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
