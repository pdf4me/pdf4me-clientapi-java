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
import java.util.UUID;
import model.Document;
import model.OcrAction;
import model.OptimizeAction;
import model.PdfAAction;
import model.ProduceOutput;

/**
 * Produce a Documents with the given Document Content and its actions
 */
@ApiModel(description = "Produce a Documents with the given Document Content and its actions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T12:07:57.015+01:00")
public class ProduceDocuments {
  @SerializedName("jobId")
  private UUID jobId = null;

  @SerializedName("documents")
  private List<Document> documents = null;

  @SerializedName("ocrAction")
  private OcrAction ocrAction = null;

  @SerializedName("pdfAAction")
  private PdfAAction pdfAAction = null;

  @SerializedName("optimizeAction")
  private OptimizeAction optimizeAction = null;

  @SerializedName("produceOutput")
  private ProduceOutput produceOutput = null;

  @SerializedName("jobIdExt")
  private String jobIdExt = null;

  @SerializedName("integrations")
  private List<String> integrations = null;

  public ProduceDocuments jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Document containing the data
   * @return jobId
  **/
  @ApiModelProperty(value = "Document containing the data")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public ProduceDocuments documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public ProduceDocuments addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Document containing the data
   * @return documents
  **/
  @ApiModelProperty(value = "Document containing the data")
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public ProduceDocuments ocrAction(OcrAction ocrAction) {
    this.ocrAction = ocrAction;
    return this;
  }

   /**
   * Document containing the data
   * @return ocrAction
  **/
  @ApiModelProperty(value = "Document containing the data")
  public OcrAction getOcrAction() {
    return ocrAction;
  }

  public void setOcrAction(OcrAction ocrAction) {
    this.ocrAction = ocrAction;
  }

  public ProduceDocuments pdfAAction(PdfAAction pdfAAction) {
    this.pdfAAction = pdfAAction;
    return this;
  }

   /**
   * Document containing the data
   * @return pdfAAction
  **/
  @ApiModelProperty(value = "Document containing the data")
  public PdfAAction getPdfAAction() {
    return pdfAAction;
  }

  public void setPdfAAction(PdfAAction pdfAAction) {
    this.pdfAAction = pdfAAction;
  }

  public ProduceDocuments optimizeAction(OptimizeAction optimizeAction) {
    this.optimizeAction = optimizeAction;
    return this;
  }

   /**
   * Document containing the data
   * @return optimizeAction
  **/
  @ApiModelProperty(value = "Document containing the data")
  public OptimizeAction getOptimizeAction() {
    return optimizeAction;
  }

  public void setOptimizeAction(OptimizeAction optimizeAction) {
    this.optimizeAction = optimizeAction;
  }

  public ProduceDocuments produceOutput(ProduceOutput produceOutput) {
    this.produceOutput = produceOutput;
    return this;
  }

   /**
   * Document containing the data
   * @return produceOutput
  **/
  @ApiModelProperty(value = "Document containing the data")
  public ProduceOutput getProduceOutput() {
    return produceOutput;
  }

  public void setProduceOutput(ProduceOutput produceOutput) {
    this.produceOutput = produceOutput;
  }

  public ProduceDocuments jobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
    return this;
  }

   /**
   * Get jobIdExt
   * @return jobIdExt
  **/
  @ApiModelProperty(value = "")
  public String getJobIdExt() {
    return jobIdExt;
  }

  public void setJobIdExt(String jobIdExt) {
    this.jobIdExt = jobIdExt;
  }

  public ProduceDocuments integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }

  public ProduceDocuments addIntegrationsItem(String integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<String>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Get integrations
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
    ProduceDocuments produceDocuments = (ProduceDocuments) o;
    return Objects.equals(this.jobId, produceDocuments.jobId) &&
        Objects.equals(this.documents, produceDocuments.documents) &&
        Objects.equals(this.ocrAction, produceDocuments.ocrAction) &&
        Objects.equals(this.pdfAAction, produceDocuments.pdfAAction) &&
        Objects.equals(this.optimizeAction, produceDocuments.optimizeAction) &&
        Objects.equals(this.produceOutput, produceDocuments.produceOutput) &&
        Objects.equals(this.jobIdExt, produceDocuments.jobIdExt) &&
        Objects.equals(this.integrations, produceDocuments.integrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, documents, ocrAction, pdfAAction, optimizeAction, produceOutput, jobIdExt, integrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduceDocuments {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    ocrAction: ").append(toIndentedString(ocrAction)).append("\n");
    sb.append("    pdfAAction: ").append(toIndentedString(pdfAAction)).append("\n");
    sb.append("    optimizeAction: ").append(toIndentedString(optimizeAction)).append("\n");
    sb.append("    produceOutput: ").append(toIndentedString(produceOutput)).append("\n");
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

