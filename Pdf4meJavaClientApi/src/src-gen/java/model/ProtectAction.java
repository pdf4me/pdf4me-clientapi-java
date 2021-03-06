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

/**
 * ProtectAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class ProtectAction {
  @SerializedName("userPassword")
  private String userPassword = null;

  @SerializedName("ownerPassword")
  private String ownerPassword = null;

  @SerializedName("unlock")
  private Boolean unlock = null;

  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    ALL("all"),

    NONE("none"),

    COPY("copy"),

    ANNOTATE("annotate"),

    FILLFORMS("fillForms"),

    SUPPORTDISABILITIES("supportDisabilities"),

    ASSEMBLE("assemble"),

    DIGITALPRINT("digitalPrint"),

    PRINT("print"),

    MODIFY("modify");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String text) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permissions")
  private List<PermissionsEnum> permissions = null;

  @SerializedName("actionId")
  private UUID actionId = null;

  public ProtectAction userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

  /**
   * Get userPassword
   * 
   * @return userPassword
   **/
  @ApiModelProperty(value = "")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public ProtectAction ownerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
    return this;
  }

  /**
   * Get ownerPassword
   * 
   * @return ownerPassword
   **/
  @ApiModelProperty(value = "")
  public String getOwnerPassword() {
    return ownerPassword;
  }

  public void setOwnerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
  }

  public ProtectAction unlock(Boolean unlock) {
    this.unlock = unlock;
    return this;
  }

  /**
   * Get unlock
   * 
   * @return unlock
   **/
  @ApiModelProperty(value = "")
  public Boolean isUnlock() {
    return unlock;
  }

  public void setUnlock(Boolean unlock) {
    this.unlock = unlock;
  }

  public ProtectAction permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ProtectAction addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<PermissionsEnum>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * 
   * @return permissions
   **/
  @ApiModelProperty(value = "")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public ProtectAction actionId(UUID actionId) {
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
    ProtectAction protectAction = (ProtectAction) o;
    return Objects.equals(this.userPassword, protectAction.userPassword)
        && Objects.equals(this.ownerPassword, protectAction.ownerPassword)
        && Objects.equals(this.unlock, protectAction.unlock)
        && Objects.equals(this.permissions, protectAction.permissions)
        && Objects.equals(this.actionId, protectAction.actionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userPassword, ownerPassword, unlock, permissions, actionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectAction {\n");

    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
    sb.append("    ownerPassword: ").append(toIndentedString(ownerPassword)).append("\n");
    sb.append("    unlock: ").append(toIndentedString(unlock)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
