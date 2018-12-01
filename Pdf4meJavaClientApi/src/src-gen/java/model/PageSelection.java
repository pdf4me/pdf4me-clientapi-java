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

/**
 * PageSelection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-01T18:17:38.351+01:00")
public class PageSelection {
  @SerializedName("pageNrs")
  private List<Integer> pageNrs = null;

  @SerializedName("pageIds")
  private List<String> pageIds = null;

  /**
   * {default: PageSelection.All}
   */
  @JsonAdapter(PageSequenceEnum.Adapter.class)
  public enum PageSequenceEnum {
    ALL("all"),
    
    FIRST("first"),
    
    LAST("last"),
    
    ODD("odd"),
    
    EVEN("even"),
    
    NOTFIRST("notFirst"),
    
    NOTLAST("notLast");

    private String value;

    PageSequenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSequenceEnum fromValue(String text) {
      for (PageSequenceEnum b : PageSequenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageSequenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSequenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSequenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageSequenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageSequence")
  private PageSequenceEnum pageSequence = null;

  public PageSelection pageNrs(List<Integer> pageNrs) {
    this.pageNrs = pageNrs;
    return this;
  }

  public PageSelection addPageNrsItem(Integer pageNrsItem) {
    if (this.pageNrs == null) {
      this.pageNrs = new ArrayList<Integer>();
    }
    this.pageNrs.add(pageNrsItem);
    return this;
  }

   /**
   * Give a list of PageNrs to apply the action.&lt;br /&gt;  PageNrs overruels PageIds and PageSequence
   * @return pageNrs
  **/
  @ApiModelProperty(value = "Give a list of PageNrs to apply the action.<br />  PageNrs overruels PageIds and PageSequence")
  public List<Integer> getPageNrs() {
    return pageNrs;
  }

  public void setPageNrs(List<Integer> pageNrs) {
    this.pageNrs = pageNrs;
  }

  public PageSelection pageIds(List<String> pageIds) {
    this.pageIds = pageIds;
    return this;
  }

  public PageSelection addPageIdsItem(String pageIdsItem) {
    if (this.pageIds == null) {
      this.pageIds = new ArrayList<String>();
    }
    this.pageIds.add(pageIdsItem);
    return this;
  }

   /**
   * Give a List of PagesIds to apply the action.&lt;br /&gt;  PageIds overrules the PageSequence
   * @return pageIds
  **/
  @ApiModelProperty(value = "Give a List of PagesIds to apply the action.<br />  PageIds overrules the PageSequence")
  public List<String> getPageIds() {
    return pageIds;
  }

  public void setPageIds(List<String> pageIds) {
    this.pageIds = pageIds;
  }

  public PageSelection pageSequence(PageSequenceEnum pageSequence) {
    this.pageSequence = pageSequence;
    return this;
  }

   /**
   * {default: PageSelection.All}
   * @return pageSequence
  **/
  @ApiModelProperty(value = "{default: PageSelection.All}")
  public PageSequenceEnum getPageSequence() {
    return pageSequence;
  }

  public void setPageSequence(PageSequenceEnum pageSequence) {
    this.pageSequence = pageSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSelection pageSelection = (PageSelection) o;
    return Objects.equals(this.pageNrs, pageSelection.pageNrs) &&
        Objects.equals(this.pageIds, pageSelection.pageIds) &&
        Objects.equals(this.pageSequence, pageSelection.pageSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNrs, pageIds, pageSequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageSelection {\n");
    
    sb.append("    pageNrs: ").append(toIndentedString(pageNrs)).append("\n");
    sb.append("    pageIds: ").append(toIndentedString(pageIds)).append("\n");
    sb.append("    pageSequence: ").append(toIndentedString(pageSequence)).append("\n");
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

