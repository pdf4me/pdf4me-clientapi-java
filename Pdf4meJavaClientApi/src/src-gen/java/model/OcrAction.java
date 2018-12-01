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
import java.util.ArrayList;
import java.util.List;
import model.KeyValuePairStringString;

/**
 * OcrAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-01T18:17:38.351+01:00")
public class OcrAction {
  @SerializedName("stapel")
  private String stapel = null;

  @SerializedName("businesssCardReco")
  private Boolean businesssCardReco = null;

  @SerializedName("fullTextSearch")
  private Boolean fullTextSearch = null;

  /**
   * Gets or Sets outputType
   */
  @JsonAdapter(OutputTypeEnum.Adapter.class)
  public enum OutputTypeEnum {
    UNDEF("undef"),
    
    TXT("txt"),
    
    DOCX("docx"),
    
    XLSX("xlsx"),
    
    PPTX("pptx"),
    
    PDFSEARCHABLE("pdfSearchable"),
    
    XML("xml"),
    
    RTF("rtf"),
    
    RTT("rtt"),
    
    VCF("vcf"),
    
    JSON("json");

    private String value;

    OutputTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputTypeEnum fromValue(String text) {
      for (OutputTypeEnum b : OutputTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OutputTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OutputTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("outputType")
  private OutputTypeEnum outputType = null;

  @SerializedName("customProperties")
  private List<KeyValuePairStringString> customProperties = null;

  public OcrAction stapel(String stapel) {
    this.stapel = stapel;
    return this;
  }

   /**
   * Get stapel
   * @return stapel
  **/
  @ApiModelProperty(value = "")
  public String getStapel() {
    return stapel;
  }

  public void setStapel(String stapel) {
    this.stapel = stapel;
  }

  public OcrAction businesssCardReco(Boolean businesssCardReco) {
    this.businesssCardReco = businesssCardReco;
    return this;
  }

   /**
   * Get businesssCardReco
   * @return businesssCardReco
  **/
  @ApiModelProperty(value = "")
  public Boolean isBusinesssCardReco() {
    return businesssCardReco;
  }

  public void setBusinesssCardReco(Boolean businesssCardReco) {
    this.businesssCardReco = businesssCardReco;
  }

  public OcrAction fullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
    return this;
  }

   /**
   * Get fullTextSearch
   * @return fullTextSearch
  **/
  @ApiModelProperty(value = "")
  public Boolean isFullTextSearch() {
    return fullTextSearch;
  }

  public void setFullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
  }

  public OcrAction outputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
    return this;
  }

   /**
   * Get outputType
   * @return outputType
  **/
  @ApiModelProperty(value = "")
  public OutputTypeEnum getOutputType() {
    return outputType;
  }

  public void setOutputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
  }

  public OcrAction customProperties(List<KeyValuePairStringString> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public OcrAction addCustomPropertiesItem(KeyValuePairStringString customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<KeyValuePairStringString>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

   /**
   * Get customProperties
   * @return customProperties
  **/
  @ApiModelProperty(value = "")
  public List<KeyValuePairStringString> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<KeyValuePairStringString> customProperties) {
    this.customProperties = customProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrAction ocrAction = (OcrAction) o;
    return Objects.equals(this.stapel, ocrAction.stapel) &&
        Objects.equals(this.businesssCardReco, ocrAction.businesssCardReco) &&
        Objects.equals(this.fullTextSearch, ocrAction.fullTextSearch) &&
        Objects.equals(this.outputType, ocrAction.outputType) &&
        Objects.equals(this.customProperties, ocrAction.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stapel, businesssCardReco, fullTextSearch, outputType, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrAction {\n");
    
    sb.append("    stapel: ").append(toIndentedString(stapel)).append("\n");
    sb.append("    businesssCardReco: ").append(toIndentedString(businesssCardReco)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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

