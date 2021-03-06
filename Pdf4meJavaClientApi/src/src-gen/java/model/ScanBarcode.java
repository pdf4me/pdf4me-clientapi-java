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
import model.KeyValuePairStringObject;
import model.ValueType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScanBarcode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ScanBarcode {
  @SerializedName("barcodeDataType")
  private String barcodeDataType = null;

  /**
   * Gets or Sets barcodeReadType
   */
  @JsonAdapter(BarcodeReadTypeEnum.Adapter.class)
  public enum BarcodeReadTypeEnum {
    ALL("all"),

    UNKNOWN("unknown"),

    CODE11("code11"),

    CODE39("code39"),

    CODE93("code93"),

    CODE128("code128"),

    CODABAR("codabar"),

    INTER2OF5("inter2of5"),

    PATCHCODE("patchCode"),

    EAN8("ean8"),

    UPCE("upce"),

    EAN13("ean13"),

    UPCA("upca"),

    PLUS2("plus2"),

    PLUS5("plus5"),

    PDF417("pdf417"),

    DATAMATRIX("dataMatrix"),

    QRCODE("qrCode"),

    POSTNET("postnet"),

    PLANET("planet"),

    RM4SCC("rm4SCC"),

    AUSTRALIAPOST("australiaPost"),

    INTELLIGENTMAIL("intelligentMail"),

    CODE39EXTENDED("code39Extended"),

    MICROQRCODE("microQRCode"),

    ALL_2D("all_2D"),

    PHARMACODE("pharmaCode"),

    UCC128("ucc128"),

    RSS14("rss14"),

    RSSLIMITED("rssLimited"),

    RSSEXPANDED("rssExpanded"),

    ALL_1D("all_1D");

    private String value;

    BarcodeReadTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BarcodeReadTypeEnum fromValue(String text) {
      for (BarcodeReadTypeEnum b : BarcodeReadTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BarcodeReadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BarcodeReadTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BarcodeReadTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BarcodeReadTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("barcodeReadType")
  private BarcodeReadTypeEnum barcodeReadType = null;

  @SerializedName("barcodeDataLen")
  private Integer barcodeDataLen = null;

  @SerializedName("angle")
  private Double angle = null;

  @SerializedName("borderEndX1")
  private Integer borderEndX1 = null;

  @SerializedName("borderEndX2")
  private Integer borderEndX2 = null;

  @SerializedName("borderEndY1")
  private Integer borderEndY1 = null;

  @SerializedName("borderEndY2")
  private Integer borderEndY2 = null;

  @SerializedName("borderStartX1")
  private Integer borderStartX1 = null;

  @SerializedName("borderStartX2")
  private Integer borderStartX2 = null;

  @SerializedName("borderStartY1")
  private Integer borderStartY1 = null;

  @SerializedName("borderStartY2")
  private Integer borderStartY2 = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("right")
  private Integer right = null;

  @SerializedName("bottom")
  private Integer bottom = null;

  @SerializedName("boundingRectangle")
  private ValueType boundingRectangle = null;

  @SerializedName("checksum")
  private Integer checksum = null;

  @SerializedName("rssExpandedStacked")
  private Integer rssExpandedStacked = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALL("all"),

    UNKNOWN("unknown"),

    CODE11("code11"),

    CODE39("code39"),

    CODE93("code93"),

    CODE128("code128"),

    CODABAR("codabar"),

    INTER2OF5("inter2of5"),

    PATCHCODE("patchCode"),

    EAN8("ean8"),

    UPCE("upce"),

    EAN13("ean13"),

    UPCA("upca"),

    PLUS2("plus2"),

    PLUS5("plus5"),

    PDF417("pdf417"),

    DATAMATRIX("dataMatrix"),

    QRCODE("qrCode"),

    POSTNET("postnet"),

    PLANET("planet"),

    RM4SCC("rm4SCC"),

    AUSTRALIAPOST("australiaPost"),

    INTELLIGENTMAIL("intelligentMail"),

    CODE39EXTENDED("code39Extended"),

    MICROQRCODE("microQRCode"),

    ALL_2D("all_2D"),

    PHARMACODE("pharmaCode"),

    UCC128("ucc128"),

    RSS14("rss14"),

    RSSLIMITED("rssLimited"),

    RSSEXPANDED("rssExpanded"),

    ALL_1D("all_1D");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("threshold")
  private Integer threshold = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("orientationString")
  private String orientationString = null;

  /**
   * Gets or Sets orientation
   */
  @JsonAdapter(OrientationEnum.Adapter.class)
  public enum OrientationEnum {
    UNKNOWN("unknown"),

    LEFTTORIGHT("leftToRight"),

    RIGHTTOLEFT("rightToLeft"),

    TOPTOBOTTOM("topToBottom"),

    BOTTOMTOTOP("bottomToTop"),

    ALL("all");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrientationEnum fromValue(String text) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrientationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("orientation")
  private OrientationEnum orientation = null;

  @SerializedName("barcodeInfoString")
  private String barcodeInfoString = null;

  @SerializedName("barcodeData")
  private byte[] barcodeData = null;

  @SerializedName("qrVersion")
  private Integer qrVersion = null;

  @SerializedName("numErrorsCorrected")
  private Integer numErrorsCorrected = null;

  @SerializedName("dim2")
  private Integer dim2 = null;

  @SerializedName("dim1")
  private Integer dim1 = null;

  @SerializedName("dataMatrix_NumErrorsCorrected")
  private Integer dataMatrixNumErrorsCorrected = null;

  @SerializedName("dataMatrix_Dim2")
  private Integer dataMatrixDim2 = null;

  @SerializedName("dataMatrix_Dim1")
  private Integer dataMatrixDim1 = null;

  @SerializedName("errorCorrectionLevel")
  private Integer errorCorrectionLevel = null;

  @SerializedName("barcodeString")
  private String barcodeString = null;

  @SerializedName("properties")
  private List<KeyValuePairStringObject> properties = null;

  public ScanBarcode barcodeDataType(String barcodeDataType) {
    this.barcodeDataType = barcodeDataType;
    return this;
  }

  /**
   * Get barcodeDataType
   * 
   * @return barcodeDataType
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeDataType() {
    return barcodeDataType;
  }

  public void setBarcodeDataType(String barcodeDataType) {
    this.barcodeDataType = barcodeDataType;
  }

  public ScanBarcode barcodeReadType(BarcodeReadTypeEnum barcodeReadType) {
    this.barcodeReadType = barcodeReadType;
    return this;
  }

  /**
   * Get barcodeReadType
   * 
   * @return barcodeReadType
   **/
  @ApiModelProperty(value = "")
  public BarcodeReadTypeEnum getBarcodeReadType() {
    return barcodeReadType;
  }

  public void setBarcodeReadType(BarcodeReadTypeEnum barcodeReadType) {
    this.barcodeReadType = barcodeReadType;
  }

  public ScanBarcode barcodeDataLen(Integer barcodeDataLen) {
    this.barcodeDataLen = barcodeDataLen;
    return this;
  }

  /**
   * Get barcodeDataLen
   * 
   * @return barcodeDataLen
   **/
  @ApiModelProperty(value = "")
  public Integer getBarcodeDataLen() {
    return barcodeDataLen;
  }

  public void setBarcodeDataLen(Integer barcodeDataLen) {
    this.barcodeDataLen = barcodeDataLen;
  }

  public ScanBarcode angle(Double angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Get angle
   * 
   * @return angle
   **/
  @ApiModelProperty(value = "")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }

  public ScanBarcode borderEndX1(Integer borderEndX1) {
    this.borderEndX1 = borderEndX1;
    return this;
  }

  /**
   * Get borderEndX1
   * 
   * @return borderEndX1
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderEndX1() {
    return borderEndX1;
  }

  public void setBorderEndX1(Integer borderEndX1) {
    this.borderEndX1 = borderEndX1;
  }

  public ScanBarcode borderEndX2(Integer borderEndX2) {
    this.borderEndX2 = borderEndX2;
    return this;
  }

  /**
   * Get borderEndX2
   * 
   * @return borderEndX2
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderEndX2() {
    return borderEndX2;
  }

  public void setBorderEndX2(Integer borderEndX2) {
    this.borderEndX2 = borderEndX2;
  }

  public ScanBarcode borderEndY1(Integer borderEndY1) {
    this.borderEndY1 = borderEndY1;
    return this;
  }

  /**
   * Get borderEndY1
   * 
   * @return borderEndY1
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderEndY1() {
    return borderEndY1;
  }

  public void setBorderEndY1(Integer borderEndY1) {
    this.borderEndY1 = borderEndY1;
  }

  public ScanBarcode borderEndY2(Integer borderEndY2) {
    this.borderEndY2 = borderEndY2;
    return this;
  }

  /**
   * Get borderEndY2
   * 
   * @return borderEndY2
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderEndY2() {
    return borderEndY2;
  }

  public void setBorderEndY2(Integer borderEndY2) {
    this.borderEndY2 = borderEndY2;
  }

  public ScanBarcode borderStartX1(Integer borderStartX1) {
    this.borderStartX1 = borderStartX1;
    return this;
  }

  /**
   * Get borderStartX1
   * 
   * @return borderStartX1
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderStartX1() {
    return borderStartX1;
  }

  public void setBorderStartX1(Integer borderStartX1) {
    this.borderStartX1 = borderStartX1;
  }

  public ScanBarcode borderStartX2(Integer borderStartX2) {
    this.borderStartX2 = borderStartX2;
    return this;
  }

  /**
   * Get borderStartX2
   * 
   * @return borderStartX2
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderStartX2() {
    return borderStartX2;
  }

  public void setBorderStartX2(Integer borderStartX2) {
    this.borderStartX2 = borderStartX2;
  }

  public ScanBarcode borderStartY1(Integer borderStartY1) {
    this.borderStartY1 = borderStartY1;
    return this;
  }

  /**
   * Get borderStartY1
   * 
   * @return borderStartY1
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderStartY1() {
    return borderStartY1;
  }

  public void setBorderStartY1(Integer borderStartY1) {
    this.borderStartY1 = borderStartY1;
  }

  public ScanBarcode borderStartY2(Integer borderStartY2) {
    this.borderStartY2 = borderStartY2;
    return this;
  }

  /**
   * Get borderStartY2
   * 
   * @return borderStartY2
   **/
  @ApiModelProperty(value = "")
  public Integer getBorderStartY2() {
    return borderStartY2;
  }

  public void setBorderStartY2(Integer borderStartY2) {
    this.borderStartY2 = borderStartY2;
  }

  public ScanBarcode top(Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Get top
   * 
   * @return top
   **/
  @ApiModelProperty(value = "")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public ScanBarcode left(Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * 
   * @return left
   **/
  @ApiModelProperty(value = "")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public ScanBarcode right(Integer right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * 
   * @return right
   **/
  @ApiModelProperty(value = "")
  public Integer getRight() {
    return right;
  }

  public void setRight(Integer right) {
    this.right = right;
  }

  public ScanBarcode bottom(Integer bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * Get bottom
   * 
   * @return bottom
   **/
  @ApiModelProperty(value = "")
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }

  public ScanBarcode boundingRectangle(ValueType boundingRectangle) {
    this.boundingRectangle = boundingRectangle;
    return this;
  }

  /**
   * Get boundingRectangle
   * 
   * @return boundingRectangle
   **/
  @ApiModelProperty(value = "")
  public ValueType getBoundingRectangle() {
    return boundingRectangle;
  }

  public void setBoundingRectangle(ValueType boundingRectangle) {
    this.boundingRectangle = boundingRectangle;
  }

  public ScanBarcode checksum(Integer checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Get checksum
   * 
   * @return checksum
   **/
  @ApiModelProperty(value = "")
  public Integer getChecksum() {
    return checksum;
  }

  public void setChecksum(Integer checksum) {
    this.checksum = checksum;
  }

  public ScanBarcode rssExpandedStacked(Integer rssExpandedStacked) {
    this.rssExpandedStacked = rssExpandedStacked;
    return this;
  }

  /**
   * Get rssExpandedStacked
   * 
   * @return rssExpandedStacked
   **/
  @ApiModelProperty(value = "")
  public Integer getRssExpandedStacked() {
    return rssExpandedStacked;
  }

  public void setRssExpandedStacked(Integer rssExpandedStacked) {
    this.rssExpandedStacked = rssExpandedStacked;
  }

  public ScanBarcode type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ScanBarcode threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * 
   * @return threshold
   **/
  @ApiModelProperty(value = "")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public ScanBarcode page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * 
   * @return page
   **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ScanBarcode orientationString(String orientationString) {
    this.orientationString = orientationString;
    return this;
  }

  /**
   * Get orientationString
   * 
   * @return orientationString
   **/
  @ApiModelProperty(value = "")
  public String getOrientationString() {
    return orientationString;
  }

  public void setOrientationString(String orientationString) {
    this.orientationString = orientationString;
  }

  public ScanBarcode orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Get orientation
   * 
   * @return orientation
   **/
  @ApiModelProperty(value = "")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public ScanBarcode barcodeInfoString(String barcodeInfoString) {
    this.barcodeInfoString = barcodeInfoString;
    return this;
  }

  /**
   * Get barcodeInfoString
   * 
   * @return barcodeInfoString
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeInfoString() {
    return barcodeInfoString;
  }

  public void setBarcodeInfoString(String barcodeInfoString) {
    this.barcodeInfoString = barcodeInfoString;
  }

  public ScanBarcode barcodeData(byte[] barcodeData) {
    this.barcodeData = barcodeData;
    return this;
  }

  /**
   * Get barcodeData
   * 
   * @return barcodeData
   **/
  @ApiModelProperty(value = "")
  public byte[] getBarcodeData() {
    return barcodeData;
  }

  public void setBarcodeData(byte[] barcodeData) {
    this.barcodeData = barcodeData;
  }

  public ScanBarcode qrVersion(Integer qrVersion) {
    this.qrVersion = qrVersion;
    return this;
  }

  /**
   * Get qrVersion
   * 
   * @return qrVersion
   **/
  @ApiModelProperty(value = "")
  public Integer getQrVersion() {
    return qrVersion;
  }

  public void setQrVersion(Integer qrVersion) {
    this.qrVersion = qrVersion;
  }

  public ScanBarcode numErrorsCorrected(Integer numErrorsCorrected) {
    this.numErrorsCorrected = numErrorsCorrected;
    return this;
  }

  /**
   * Get numErrorsCorrected
   * 
   * @return numErrorsCorrected
   **/
  @ApiModelProperty(value = "")
  public Integer getNumErrorsCorrected() {
    return numErrorsCorrected;
  }

  public void setNumErrorsCorrected(Integer numErrorsCorrected) {
    this.numErrorsCorrected = numErrorsCorrected;
  }

  public ScanBarcode dim2(Integer dim2) {
    this.dim2 = dim2;
    return this;
  }

  /**
   * Get dim2
   * 
   * @return dim2
   **/
  @ApiModelProperty(value = "")
  public Integer getDim2() {
    return dim2;
  }

  public void setDim2(Integer dim2) {
    this.dim2 = dim2;
  }

  public ScanBarcode dim1(Integer dim1) {
    this.dim1 = dim1;
    return this;
  }

  /**
   * Get dim1
   * 
   * @return dim1
   **/
  @ApiModelProperty(value = "")
  public Integer getDim1() {
    return dim1;
  }

  public void setDim1(Integer dim1) {
    this.dim1 = dim1;
  }

  public ScanBarcode dataMatrixNumErrorsCorrected(Integer dataMatrixNumErrorsCorrected) {
    this.dataMatrixNumErrorsCorrected = dataMatrixNumErrorsCorrected;
    return this;
  }

  /**
   * Get dataMatrixNumErrorsCorrected
   * 
   * @return dataMatrixNumErrorsCorrected
   **/
  @ApiModelProperty(value = "")
  public Integer getDataMatrixNumErrorsCorrected() {
    return dataMatrixNumErrorsCorrected;
  }

  public void setDataMatrixNumErrorsCorrected(Integer dataMatrixNumErrorsCorrected) {
    this.dataMatrixNumErrorsCorrected = dataMatrixNumErrorsCorrected;
  }

  public ScanBarcode dataMatrixDim2(Integer dataMatrixDim2) {
    this.dataMatrixDim2 = dataMatrixDim2;
    return this;
  }

  /**
   * Get dataMatrixDim2
   * 
   * @return dataMatrixDim2
   **/
  @ApiModelProperty(value = "")
  public Integer getDataMatrixDim2() {
    return dataMatrixDim2;
  }

  public void setDataMatrixDim2(Integer dataMatrixDim2) {
    this.dataMatrixDim2 = dataMatrixDim2;
  }

  public ScanBarcode dataMatrixDim1(Integer dataMatrixDim1) {
    this.dataMatrixDim1 = dataMatrixDim1;
    return this;
  }

  /**
   * Get dataMatrixDim1
   * 
   * @return dataMatrixDim1
   **/
  @ApiModelProperty(value = "")
  public Integer getDataMatrixDim1() {
    return dataMatrixDim1;
  }

  public void setDataMatrixDim1(Integer dataMatrixDim1) {
    this.dataMatrixDim1 = dataMatrixDim1;
  }

  public ScanBarcode errorCorrectionLevel(Integer errorCorrectionLevel) {
    this.errorCorrectionLevel = errorCorrectionLevel;
    return this;
  }

  /**
   * Get errorCorrectionLevel
   * 
   * @return errorCorrectionLevel
   **/
  @ApiModelProperty(value = "")
  public Integer getErrorCorrectionLevel() {
    return errorCorrectionLevel;
  }

  public void setErrorCorrectionLevel(Integer errorCorrectionLevel) {
    this.errorCorrectionLevel = errorCorrectionLevel;
  }

  public ScanBarcode barcodeString(String barcodeString) {
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

  public ScanBarcode properties(List<KeyValuePairStringObject> properties) {
    this.properties = properties;
    return this;
  }

  public ScanBarcode addPropertiesItem(KeyValuePairStringObject propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<KeyValuePairStringObject>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * 
   * @return properties
   **/
  @ApiModelProperty(value = "")
  public List<KeyValuePairStringObject> getProperties() {
    return properties;
  }

  public void setProperties(List<KeyValuePairStringObject> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanBarcode scanBarcode = (ScanBarcode) o;
    return Objects.equals(this.barcodeDataType, scanBarcode.barcodeDataType)
        && Objects.equals(this.barcodeReadType, scanBarcode.barcodeReadType)
        && Objects.equals(this.barcodeDataLen, scanBarcode.barcodeDataLen)
        && Objects.equals(this.angle, scanBarcode.angle) && Objects.equals(this.borderEndX1, scanBarcode.borderEndX1)
        && Objects.equals(this.borderEndX2, scanBarcode.borderEndX2)
        && Objects.equals(this.borderEndY1, scanBarcode.borderEndY1)
        && Objects.equals(this.borderEndY2, scanBarcode.borderEndY2)
        && Objects.equals(this.borderStartX1, scanBarcode.borderStartX1)
        && Objects.equals(this.borderStartX2, scanBarcode.borderStartX2)
        && Objects.equals(this.borderStartY1, scanBarcode.borderStartY1)
        && Objects.equals(this.borderStartY2, scanBarcode.borderStartY2) && Objects.equals(this.top, scanBarcode.top)
        && Objects.equals(this.left, scanBarcode.left) && Objects.equals(this.right, scanBarcode.right)
        && Objects.equals(this.bottom, scanBarcode.bottom)
        && Objects.equals(this.boundingRectangle, scanBarcode.boundingRectangle)
        && Objects.equals(this.checksum, scanBarcode.checksum)
        && Objects.equals(this.rssExpandedStacked, scanBarcode.rssExpandedStacked)
        && Objects.equals(this.type, scanBarcode.type) && Objects.equals(this.threshold, scanBarcode.threshold)
        && Objects.equals(this.page, scanBarcode.page)
        && Objects.equals(this.orientationString, scanBarcode.orientationString)
        && Objects.equals(this.orientation, scanBarcode.orientation)
        && Objects.equals(this.barcodeInfoString, scanBarcode.barcodeInfoString)
        && Arrays.equals(this.barcodeData, scanBarcode.barcodeData)
        && Objects.equals(this.qrVersion, scanBarcode.qrVersion)
        && Objects.equals(this.numErrorsCorrected, scanBarcode.numErrorsCorrected)
        && Objects.equals(this.dim2, scanBarcode.dim2) && Objects.equals(this.dim1, scanBarcode.dim1)
        && Objects.equals(this.dataMatrixNumErrorsCorrected, scanBarcode.dataMatrixNumErrorsCorrected)
        && Objects.equals(this.dataMatrixDim2, scanBarcode.dataMatrixDim2)
        && Objects.equals(this.dataMatrixDim1, scanBarcode.dataMatrixDim1)
        && Objects.equals(this.errorCorrectionLevel, scanBarcode.errorCorrectionLevel)
        && Objects.equals(this.barcodeString, scanBarcode.barcodeString)
        && Objects.equals(this.properties, scanBarcode.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeDataType, barcodeReadType, barcodeDataLen, angle, borderEndX1, borderEndX2, borderEndY1,
        borderEndY2, borderStartX1, borderStartX2, borderStartY1, borderStartY2, top, left, right, bottom,
        boundingRectangle, checksum, rssExpandedStacked, type, threshold, page, orientationString, orientation,
        barcodeInfoString, Arrays.hashCode(barcodeData), qrVersion, numErrorsCorrected, dim2, dim1,
        dataMatrixNumErrorsCorrected, dataMatrixDim2, dataMatrixDim1, errorCorrectionLevel, barcodeString, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanBarcode {\n");

    sb.append("    barcodeDataType: ").append(toIndentedString(barcodeDataType)).append("\n");
    sb.append("    barcodeReadType: ").append(toIndentedString(barcodeReadType)).append("\n");
    sb.append("    barcodeDataLen: ").append(toIndentedString(barcodeDataLen)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    borderEndX1: ").append(toIndentedString(borderEndX1)).append("\n");
    sb.append("    borderEndX2: ").append(toIndentedString(borderEndX2)).append("\n");
    sb.append("    borderEndY1: ").append(toIndentedString(borderEndY1)).append("\n");
    sb.append("    borderEndY2: ").append(toIndentedString(borderEndY2)).append("\n");
    sb.append("    borderStartX1: ").append(toIndentedString(borderStartX1)).append("\n");
    sb.append("    borderStartX2: ").append(toIndentedString(borderStartX2)).append("\n");
    sb.append("    borderStartY1: ").append(toIndentedString(borderStartY1)).append("\n");
    sb.append("    borderStartY2: ").append(toIndentedString(borderStartY2)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    boundingRectangle: ").append(toIndentedString(boundingRectangle)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    rssExpandedStacked: ").append(toIndentedString(rssExpandedStacked)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    orientationString: ").append(toIndentedString(orientationString)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    barcodeInfoString: ").append(toIndentedString(barcodeInfoString)).append("\n");
    sb.append("    barcodeData: ").append(toIndentedString(barcodeData)).append("\n");
    sb.append("    qrVersion: ").append(toIndentedString(qrVersion)).append("\n");
    sb.append("    numErrorsCorrected: ").append(toIndentedString(numErrorsCorrected)).append("\n");
    sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
    sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
    sb.append("    dataMatrixNumErrorsCorrected: ").append(toIndentedString(dataMatrixNumErrorsCorrected)).append("\n");
    sb.append("    dataMatrixDim2: ").append(toIndentedString(dataMatrixDim2)).append("\n");
    sb.append("    dataMatrixDim1: ").append(toIndentedString(dataMatrixDim1)).append("\n");
    sb.append("    errorCorrectionLevel: ").append(toIndentedString(errorCorrectionLevel)).append("\n");
    sb.append("    barcodeString: ").append(toIndentedString(barcodeString)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
