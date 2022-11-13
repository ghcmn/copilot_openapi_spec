package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The data in the audit block is populated directly by the API from the security context when the record is modified
 */
@ApiModel(description = "The data in the audit block is populated directly by the API from the security context when the record is modified")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class AuditBlockModel   {
  @JsonProperty("user")
  private String user;

  @JsonProperty("at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime at;

  public AuditBlockModel user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The identifier of the user or system user that modified the record
   * @return user
  */
  @ApiModelProperty(example = "svc99", required = true, value = "The identifier of the user or system user that modified the record")
  @NotNull


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AuditBlockModel at(OffsetDateTime at) {
    this.at = at;
    return this;
  }

  /**
   * UTC timestamp of the record modification
   * @return at
  */
  @ApiModelProperty(example = "2021-03-03T08:24:51Z", required = true, value = "UTC timestamp of the record modification")
  @NotNull

  @Valid

  public OffsetDateTime getAt() {
    return at;
  }

  public void setAt(OffsetDateTime at) {
    this.at = at;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditBlockModel auditBlock = (AuditBlockModel) o;
    return Objects.equals(this.user, auditBlock.user) &&
        Objects.equals(this.at, auditBlock.at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, at);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditBlockModel {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

