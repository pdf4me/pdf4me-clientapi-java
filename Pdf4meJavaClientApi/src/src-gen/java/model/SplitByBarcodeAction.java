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

/**
 * SplitByBarcodeAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class SplitByBarcodeAction {
  @SerializedName("barcodeString")
  private String barcodeString = null;

  /**
   * Gets or Sets barcodeFilter
   */
  @JsonAdapter(BarcodeFilterEnum.Adapter.class)
  public enum BarcodeFilterEnum {
    STARTSWITH("startsWith"),

    ENDSWITH("endsWith"),

    CONTAINS("contains"),

    EXACT("exact");

    private String value;

    BarcodeFilterEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BarcodeFilterEnum fromValue(String text) {
      for (BarcodeFilterEnum b : BarcodeFilterEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BarcodeFilterEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BarcodeFilterEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BarcodeFilterEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BarcodeFilterEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("barcodeFilter")
  private BarcodeFilterEnum barcodeFilter = null;

  /**
   * Gets or Sets barcodeType
   */
  @JsonAdapter(BarcodeTypeEnum.Adapter.class)
  public enum BarcodeTypeEnum {
    ANY("any"),

    DATAMATRIX("datamatrix"),

    QRCODE("qrcode");

    private String value;

    BarcodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BarcodeTypeEnum fromValue(String text) {
      for (BarcodeTypeEnum b : BarcodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BarcodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BarcodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BarcodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BarcodeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("barcodeType")
  private BarcodeTypeEnum barcodeType = null;

  /**
   * Gets or Sets splitBarcodePage
   */
  @JsonAdapter(SplitBarcodePageEnum.Adapter.class)
  public enum SplitBarcodePageEnum {
    BEFORE("before"),

    AFTER("after"),

    REMOVE("remove");

    private String value;

    SplitBarcodePageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SplitBarcodePageEnum fromValue(String text) {
      for (SplitBarcodePageEnum b : SplitBarcodePageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SplitBarcodePageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SplitBarcodePageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SplitBarcodePageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SplitBarcodePageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("splitBarcodePage")
  private SplitBarcodePageEnum splitBarcodePage = null;

  @SerializedName("actionId")
  private UUID actionId = null;

  public SplitByBarcodeAction barcodeString(String barcodeString) {
    this.barcodeString = barcodeString;
    return this;
  }

  /**
   * Get barcodeString
   * 
   * @return barcodeString
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeString() {
    return barcodeString;
  }

  public void setBarcodeString(String barcodeString) {
    this.barcodeString = barcodeString;
  }

  public SplitByBarcodeAction barcodeFilter(BarcodeFilterEnum barcodeFilter) {
    this.barcodeFilter = barcodeFilter;
    return this;
  }

  /**
   * Get barcodeFilter
   * 
   * @return barcodeFilter
   **/
  @ApiModelProperty(value = "")
  public BarcodeFilterEnum getBarcodeFilter() {
    return barcodeFilter;
  }

  public void setBarcodeFilter(BarcodeFilterEnum barcodeFilter) {
    this.barcodeFilter = barcodeFilter;
  }

  public SplitByBarcodeAction barcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

  /**
   * Get barcodeType
   * 
   * @return barcodeType
   **/
  @ApiModelProperty(value = "")
  public BarcodeTypeEnum getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
  }

  public SplitByBarcodeAction splitBarcodePage(SplitBarcodePageEnum splitBarcodePage) {
    this.splitBarcodePage = splitBarcodePage;
    return this;
  }

  /**
   * Get splitBarcodePage
   * 
   * @return splitBarcodePage
   **/
  @ApiModelProperty(value = "")
  public SplitBarcodePageEnum getSplitBarcodePage() {
    return splitBarcodePage;
  }

  public void setSplitBarcodePage(SplitBarcodePageEnum splitBarcodePage) {
    this.splitBarcodePage = splitBarcodePage;
  }

  public SplitByBarcodeAction actionId(UUID actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * 
   * @return actionId
   **/
  @ApiModelProperty(value = "")
  public UUID getActionId() {
    return actionId;
  }

  public void setActionId(UUID actionId) {
    this.actionId = actionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitByBarcodeAction splitByBarcodeAction = (SplitByBarcodeAction) o;
    return Objects.equals(this.barcodeString, splitByBarcodeAction.barcodeString)
        && Objects.equals(this.barcodeFilter, splitByBarcodeAction.barcodeFilter)
        && Objects.equals(this.barcodeType, splitByBarcodeAction.barcodeType)
        && Objects.equals(this.splitBarcodePage, splitByBarcodeAction.splitBarcodePage)
        && Objects.equals(this.actionId, splitByBarcodeAction.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeString, barcodeFilter, barcodeType, splitBarcodePage, actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitByBarcodeAction {\n");

    sb.append("    barcodeString: ").append(toIndentedString(barcodeString)).append("\n");
    sb.append("    barcodeFilter: ").append(toIndentedString(barcodeFilter)).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    splitBarcodePage: ").append(toIndentedString(splitBarcodePage)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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
