package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.gcp.copilotdemo.model.ClaimIdsModel;
import com.gcp.copilotdemo.model.PremiumIdsModel;
import com.gcp.copilotdemo.model.TreatyIdsModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * External identifiers. Only one of &#x60;treatyIds&#x60;, &#x60;claimIds&#x60; or &#x60;premiumIds&#x60; may be present.
 */
@ApiModel(description = "External identifiers. Only one of `treatyIds`, `claimIds` or `premiumIds` may be present.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class OriginatingIdentifiersModel   {
  /**
   * The originating application domain
   */
  public enum ApplicationEnum {
    TREATY("TREATY"),
    
    CLAIM("CLAIM"),
    
    PREMIUM("PREMIUM");

    private String value;

    ApplicationEnum(String value) {
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
    public static ApplicationEnum fromValue(String value) {
      for (ApplicationEnum b : ApplicationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("application")
  private ApplicationEnum application;

  @JsonProperty("treatyIds")
  private TreatyIdsModel treatyIds;

  @JsonProperty("claimIds")
  private ClaimIdsModel claimIds;

  @JsonProperty("premiumIds")
  private PremiumIdsModel premiumIds;

  public OriginatingIdentifiersModel application(ApplicationEnum application) {
    this.application = application;
    return this;
  }

  /**
   * The originating application domain
   * @return application
  */
  @ApiModelProperty(example = "TREATY", required = true, value = "The originating application domain")
  @NotNull


  public ApplicationEnum getApplication() {
    return application;
  }

  public void setApplication(ApplicationEnum application) {
    this.application = application;
  }

  public OriginatingIdentifiersModel treatyIds(TreatyIdsModel treatyIds) {
    this.treatyIds = treatyIds;
    return this;
  }

  /**
   * Get treatyIds
   * @return treatyIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public TreatyIdsModel getTreatyIds() {
    return treatyIds;
  }

  public void setTreatyIds(TreatyIdsModel treatyIds) {
    this.treatyIds = treatyIds;
  }

  public OriginatingIdentifiersModel claimIds(ClaimIdsModel claimIds) {
    this.claimIds = claimIds;
    return this;
  }

  /**
   * Get claimIds
   * @return claimIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClaimIdsModel getClaimIds() {
    return claimIds;
  }

  public void setClaimIds(ClaimIdsModel claimIds) {
    this.claimIds = claimIds;
  }

  public OriginatingIdentifiersModel premiumIds(PremiumIdsModel premiumIds) {
    this.premiumIds = premiumIds;
    return this;
  }

  /**
   * Get premiumIds
   * @return premiumIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public PremiumIdsModel getPremiumIds() {
    return premiumIds;
  }

  public void setPremiumIds(PremiumIdsModel premiumIds) {
    this.premiumIds = premiumIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginatingIdentifiersModel originatingIdentifiers = (OriginatingIdentifiersModel) o;
    return Objects.equals(this.application, originatingIdentifiers.application) &&
        Objects.equals(this.treatyIds, originatingIdentifiers.treatyIds) &&
        Objects.equals(this.claimIds, originatingIdentifiers.claimIds) &&
        Objects.equals(this.premiumIds, originatingIdentifiers.premiumIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, treatyIds, claimIds, premiumIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatingIdentifiersModel {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    treatyIds: ").append(toIndentedString(treatyIds)).append("\n");
    sb.append("    claimIds: ").append(toIndentedString(claimIds)).append("\n");
    sb.append("    premiumIds: ").append(toIndentedString(premiumIds)).append("\n");
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

