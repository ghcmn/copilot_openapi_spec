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
 * ClaimIdsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class ClaimIdsModel   {
  @JsonProperty("claimId")
  private String claimId;

  public ClaimIdsModel claimId(String claimId) {
    this.claimId = claimId;
    return this;
  }

  /**
   * claim unique identifier
   * @return claimId
  */
  @ApiModelProperty(example = "c1234", required = true, value = "claim unique identifier")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getClaimId() {
    return claimId;
  }

  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimIdsModel claimIds = (ClaimIdsModel) o;
    return Objects.equals(this.claimId, claimIds.claimId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimIdsModel {\n");
    
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
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

