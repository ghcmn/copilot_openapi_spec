package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProblemFormatItemModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class ProblemFormatItemModel   {
  @JsonProperty("type")
  private URI type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    RISK("RISK"),
    
    PREMIUM("PREMIUM"),
    
    CLAIM("CLAIM"),
    
    DOCUMENT("DOCUMENT"),
    
    EXPERTFEES("EXPERTFEES"),
    
    PARTY("PARTY"),
    
    NOTIFICATION("NOTIFICATION"),
    
    SETTLEMENTS("SETTLEMENTS");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("domain")
  private DomainEnum domain;

  @JsonProperty("errorCode")
  private Integer errorCode;

  public ProblemFormatItemModel type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "https://dxc.com/typerror/premium/2470", required = true, value = "")
  @NotNull

  @Valid

  public URI getType() {
    return type;
  }

  public void setType(URI type) {
    this.type = type;
  }

  public ProblemFormatItemModel title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "title example", required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemFormatItemModel detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @ApiModelProperty(example = "Detailed description of the problem", value = "")


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemFormatItemModel domain(DomainEnum domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @ApiModelProperty(example = "PREMIUM", required = true, value = "")
  @NotNull


  public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  public ProblemFormatItemModel errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @ApiModelProperty(example = "2470", required = true, value = "")
  @NotNull


  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemFormatItemModel problemFormatItem = (ProblemFormatItemModel) o;
    return Objects.equals(this.type, problemFormatItem.type) &&
        Objects.equals(this.title, problemFormatItem.title) &&
        Objects.equals(this.detail, problemFormatItem.detail) &&
        Objects.equals(this.domain, problemFormatItem.domain) &&
        Objects.equals(this.errorCode, problemFormatItem.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, domain, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemFormatItemModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

