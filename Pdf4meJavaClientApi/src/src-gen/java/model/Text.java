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
import model.Color;
import model.RotateConfig;
import model.Transform;
import model.Translate;

/**
 * Text
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class Text {
  @SerializedName("positionX")
  private Integer positionX = null;

  @SerializedName("positionY")
  private Integer positionY = null;

  /**
   * Gets or Sets alignX
   */
  @JsonAdapter(AlignXEnum.Adapter.class)
  public enum AlignXEnum {
    LEFT("left"),

    CENTER("center"),

    RIGHT("right");

    private String value;

    AlignXEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignXEnum fromValue(String text) {
      for (AlignXEnum b : AlignXEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignXEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignXEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignXEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignXEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("alignX")
  private AlignXEnum alignX = null;

  /**
   * Gets or Sets alignY
   */
  @JsonAdapter(AlignYEnum.Adapter.class)
  public enum AlignYEnum {
    TOP("top"),

    MIDDLE("middle"),

    BOTTOM("bottom");

    private String value;

    AlignYEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignYEnum fromValue(String text) {
      for (AlignYEnum b : AlignYEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignYEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignYEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignYEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignYEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("alignY")
  private AlignYEnum alignY = null;

  @SerializedName("format")
  private Boolean format = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("font")
  private String font = null;

  @SerializedName("color")
  private Color color = null;

  /**
   * Gets or Sets fontEncoding
   */
  @JsonAdapter(FontEncodingEnum.Adapter.class)
  public enum FontEncodingEnum {
    UNICODE("unicode"),

    WINANSI("winAnsi");

    private String value;

    FontEncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontEncodingEnum fromValue(String text) {
      for (FontEncodingEnum b : FontEncodingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontEncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontEncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontEncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontEncodingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fontEncoding")
  private FontEncodingEnum fontEncoding = null;

  @SerializedName("value")
  private String value = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    FILL("fill"),

    STROKE("stroke");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("rotate")
  private RotateConfig rotate = null;

  @SerializedName("translate")
  private Translate translate = null;

  @SerializedName("transform")
  private Transform transform = null;

  @SerializedName("underline")
  private Boolean underline = null;

  @SerializedName("lineWidth")
  private Double lineWidth = null;

  public Text positionX(Integer positionX) {
    this.positionX = positionX;
    return this;
  }

  /**
   * Get positionX
   * 
   * @return positionX
   **/
  @ApiModelProperty(value = "")
  public Integer getPositionX() {
    return positionX;
  }

  public void setPositionX(Integer positionX) {
    this.positionX = positionX;
  }

  public Text positionY(Integer positionY) {
    this.positionY = positionY;
    return this;
  }

  /**
   * Get positionY
   * 
   * @return positionY
   **/
  @ApiModelProperty(value = "")
  public Integer getPositionY() {
    return positionY;
  }

  public void setPositionY(Integer positionY) {
    this.positionY = positionY;
  }

  public Text alignX(AlignXEnum alignX) {
    this.alignX = alignX;
    return this;
  }

  /**
   * Get alignX
   * 
   * @return alignX
   **/
  @ApiModelProperty(value = "")
  public AlignXEnum getAlignX() {
    return alignX;
  }

  public void setAlignX(AlignXEnum alignX) {
    this.alignX = alignX;
  }

  public Text alignY(AlignYEnum alignY) {
    this.alignY = alignY;
    return this;
  }

  /**
   * Get alignY
   * 
   * @return alignY
   **/
  @ApiModelProperty(value = "")
  public AlignYEnum getAlignY() {
    return alignY;
  }

  public void setAlignY(AlignYEnum alignY) {
    this.alignY = alignY;
  }

  public Text format(Boolean format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * 
   * @return format
   **/
  @ApiModelProperty(value = "")
  public Boolean isFormat() {
    return format;
  }

  public void setFormat(Boolean format) {
    this.format = format;
  }

  public Text size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The font size in points, e.g. 12. If set to 0, the size is chosen such that
   * text fits stamp size (not allowed if operator is within transformation
   * operator).
   * 
   * @return size
   **/
  @ApiModelProperty(value = "The font size in points, e.g. 12. If set to 0, the size is chosen such that text fits stamp size (not allowed if operator is within transformation operator).")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Text font(String font) {
    this.font = font;
    return this;
  }

  /**
   * Get font
   * 
   * @return font
   **/
  @ApiModelProperty(value = "")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public Text color(Color color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * 
   * @return color
   **/
  @ApiModelProperty(value = "")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Text fontEncoding(FontEncodingEnum fontEncoding) {
    this.fontEncoding = fontEncoding;
    return this;
  }

  /**
   * Get fontEncoding
   * 
   * @return fontEncoding
   **/
  @ApiModelProperty(value = "")
  public FontEncodingEnum getFontEncoding() {
    return fontEncoding;
  }

  public void setFontEncoding(FontEncodingEnum fontEncoding) {
    this.fontEncoding = fontEncoding;
  }

  public Text value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * 
   * @return value
   **/
  @ApiModelProperty(required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Text mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * 
   * @return mode
   **/
  @ApiModelProperty(value = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public Text rotate(RotateConfig rotate) {
    this.rotate = rotate;
    return this;
  }

  /**
   * Get rotate
   * 
   * @return rotate
   **/
  @ApiModelProperty(value = "")
  public RotateConfig getRotate() {
    return rotate;
  }

  public void setRotate(RotateConfig rotate) {
    this.rotate = rotate;
  }

  public Text translate(Translate translate) {
    this.translate = translate;
    return this;
  }

  /**
   * Get translate
   * 
   * @return translate
   **/
  @ApiModelProperty(value = "")
  public Translate getTranslate() {
    return translate;
  }

  public void setTranslate(Translate translate) {
    this.translate = translate;
  }

  public Text transform(Transform transform) {
    this.transform = transform;
    return this;
  }

  /**
   * Get transform
   * 
   * @return transform
   **/
  @ApiModelProperty(value = "")
  public Transform getTransform() {
    return transform;
  }

  public void setTransform(Transform transform) {
    this.transform = transform;
  }

  public Text underline(Boolean underline) {
    this.underline = underline;
    return this;
  }

  /**
   * Get underline
   * 
   * @return underline
   **/
  @ApiModelProperty(value = "")
  public Boolean isUnderline() {
    return underline;
  }

  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }

  public Text lineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

  /**
   * Get lineWidth
   * 
   * @return lineWidth
   **/
  @ApiModelProperty(value = "")
  public Double getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return Objects.equals(this.positionX, text.positionX) && Objects.equals(this.positionY, text.positionY)
        && Objects.equals(this.alignX, text.alignX) && Objects.equals(this.alignY, text.alignY)
        && Objects.equals(this.format, text.format) && Objects.equals(this.size, text.size)
        && Objects.equals(this.font, text.font) && Objects.equals(this.color, text.color)
        && Objects.equals(this.fontEncoding, text.fontEncoding) && Objects.equals(this.value, text.value)
        && Objects.equals(this.mode, text.mode) && Objects.equals(this.rotate, text.rotate)
        && Objects.equals(this.translate, text.translate) && Objects.equals(this.transform, text.transform)
        && Objects.equals(this.underline, text.underline) && Objects.equals(this.lineWidth, text.lineWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionX, positionY, alignX, alignY, format, size, font, color, fontEncoding, value, mode,
        rotate, translate, transform, underline, lineWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");

    sb.append("    positionX: ").append(toIndentedString(positionX)).append("\n");
    sb.append("    positionY: ").append(toIndentedString(positionY)).append("\n");
    sb.append("    alignX: ").append(toIndentedString(alignX)).append("\n");
    sb.append("    alignY: ").append(toIndentedString(alignY)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontEncoding: ").append(toIndentedString(fontEncoding)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    translate: ").append(toIndentedString(translate)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
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
