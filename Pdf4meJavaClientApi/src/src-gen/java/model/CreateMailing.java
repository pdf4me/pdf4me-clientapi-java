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
import model.MailingAction;

/**
 * CreateMailing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class CreateMailing {
  @SerializedName("mailingAction")
  private MailingAction mailingAction = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public CreateMailing mailingAction(MailingAction mailingAction) {
    this.mailingAction = mailingAction;
    return this;
  }

  /**
   * Get mailingAction
   * 
   * @return mailingAction
   **/
  @ApiModelProperty(required = true, value = "")
  public MailingAction getMailingAction() {
    return mailingAction;
  }

  public void setMailingAction(MailingAction mailingAction) {
    this.mailingAction = mailingAction;
  }

  public CreateMailing ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * 
   * @return ipAddress
   **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CreateMailing jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * 
   * @return jobId
   **/
  @ApiModelProperty(value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public CreateMailing jobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
    return this;
  }

  /**
   * Get jobIdExt
   * 
   * @return jobIdExt
   **/
  @ApiModelProperty(value = "")
  public String getJobIdExt() {
    return jobIdExt;
  }

  public void setJobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
  }

  public CreateMailing integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public CreateMailing addIntegrationsItem(String integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<String>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

  /**
   * Get integrations
   * 
   * @return integrations
   **/
  @ApiModelProperty(value = "")
  public List<String> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<String> integrations) {
    this.integrations = integrations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMailing createMailing = (CreateMailing) o;
    return Objects.equals(this.mailingAction, createMailing.mailingAction)
        && Objects.equals(this.ipAddress, createMailing.ipAddress) && Objects.equals(this.jobId, createMailing.jobId)
        && Objects.equals(this.jobIdExt, createMailing.jobIdExt)
        && Objects.equals(this.integrations, createMailing.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailingAction, ipAddress, jobId, jobIdExt, integrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMailing {\n");

    sb.append("    mailingAction: ").append(toIndentedString(mailingAction)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobIdExt: ").append(toIndentedString(jobIdExt)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
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
