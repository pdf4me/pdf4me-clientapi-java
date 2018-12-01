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

/**
 * ProduceOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-01T18:17:38.351+01:00")
public class ProduceOutput {
  /**
   * Gets or Sets fileType
   */
  @JsonAdapter(FileTypeEnum.Adapter.class)
  public enum FileTypeEnum {
    UNDEF("undef"),
    
    PDF("pdf"),
    
    ZIP("zip");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileTypeEnum fromValue(String text) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FileTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fileType")
  private FileTypeEnum fileType = null;

  public ProduceOutput fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @ApiModelProperty(value = "")
  public FileTypeEnum getFileType() {
    return fileType;
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProduceOutput produceOutput = (ProduceOutput) o;
    return Objects.equals(this.fileType, produceOutput.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduceOutput {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

