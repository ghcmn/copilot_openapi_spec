package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gcp.copilotdemo.model.CurrencyModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * settlement status of the currency
 */
@ApiModel(description = "settlement status of the currency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class CurrencyEntryModel   {
  @JsonProperty("currency")
  private CurrencyModel currency;

  @JsonProperty("stfoSettlementAllowed")
  private Boolean stfoSettlementAllowed;

  @JsonProperty("swiftSettlementAllowed")
  private Boolean swiftSettlementAllowed;

  public CurrencyEntryModel currency(CurrencyModel currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyModel getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyModel currency) {
    this.currency = currency;
  }

  public CurrencyEntryModel stfoSettlementAllowed(Boolean stfoSettlementAllowed) {
    this.stfoSettlementAllowed = stfoSettlementAllowed;
    return this;
  }

  /**
   * Whether or not settlement is allowed in this currency for STFO
   * @return stfoSettlementAllowed
  */
  @ApiModelProperty(example = "true", required = true, value = "Whether or not settlement is allowed in this currency for STFO")
  @NotNull


  public Boolean getStfoSettlementAllowed() {
    return stfoSettlementAllowed;
  }

  public void setStfoSettlementAllowed(Boolean stfoSettlementAllowed) {
    this.stfoSettlementAllowed = stfoSettlementAllowed;
  }

  public CurrencyEntryModel swiftSettlementAllowed(Boolean swiftSettlementAllowed) {
    this.swiftSettlementAllowed = swiftSettlementAllowed;
    return this;
  }

  /**
   * Whether or not settlement is allowed in this currency for Swift
   * @return swiftSettlementAllowed
  */
  @ApiModelProperty(example = "true", required = true, value = "Whether or not settlement is allowed in this currency for Swift")
  @NotNull


  public Boolean getSwiftSettlementAllowed() {
    return swiftSettlementAllowed;
  }

  public void setSwiftSettlementAllowed(Boolean swiftSettlementAllowed) {
    this.swiftSettlementAllowed = swiftSettlementAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyEntryModel currencyEntry = (CurrencyEntryModel) o;
    return Objects.equals(this.currency, currencyEntry.currency) &&
        Objects.equals(this.stfoSettlementAllowed, currencyEntry.stfoSettlementAllowed) &&
        Objects.equals(this.swiftSettlementAllowed, currencyEntry.swiftSettlementAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, stfoSettlementAllowed, swiftSettlementAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyEntryModel {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    stfoSettlementAllowed: ").append(toIndentedString(stfoSettlementAllowed)).append("\n");
    sb.append("    swiftSettlementAllowed: ").append(toIndentedString(swiftSettlementAllowed)).append("\n");
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

