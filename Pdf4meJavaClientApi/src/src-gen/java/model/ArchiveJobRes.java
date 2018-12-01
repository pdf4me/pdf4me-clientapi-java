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
import java.io.IOException;
import java.util.UUID;

/**
 * ArchiveJobRes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-01T18:17:38.351+01:00")
public class ArchiveJobRes {
  @SerializedName("jobId")
  private UUID jobId = null;

  @SerializedName("createdSuccessfully")
  private Boolean createdSuccessfully = null;

  public ArchiveJobRes jobId(UUID jobId) {
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

  public ArchiveJobRes createdSuccessfully(Boolean createdSuccessfully) {
    this.createdSuccessfully = createdSuccessfully;
    return this;
  }

   /**
   * Get createdSuccessfully
   * @return createdSuccessfully
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCreatedSuccessfully() {
    return createdSuccessfully;
  }

  public void setCreatedSuccessfully(Boolean createdSuccessfully) {
    this.createdSuccessfully = createdSuccessfully;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveJobRes archiveJobRes = (ArchiveJobRes) o;
    return Objects.equals(this.jobId, archiveJobRes.jobId) &&
        Objects.equals(this.createdSuccessfully, archiveJobRes.createdSuccessfully);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, createdSuccessfully);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveJobRes {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    createdSuccessfully: ").append(toIndentedString(createdSuccessfully)).append("\n");
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

