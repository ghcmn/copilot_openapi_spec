package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PremiumIdsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class PremiumIdsModel   {
  @JsonProperty("premiumId")
  private String premiumId;

  public PremiumIdsModel premiumId(String premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * premium unique identifier
   * @return premiumId
  */
  @ApiModelProperty(example = "c1234", required = true, value = "premium unique identifier")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(String premiumId) {
    this.premiumId = premiumId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumIdsModel premiumIds = (PremiumIdsModel) o;
    return Objects.equals(this.premiumId, premiumIds.premiumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumIdsModel {\n");
    
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
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

