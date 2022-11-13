package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gcp.copilotdemo.model.CurrencyModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Next available settlement date for a currency
 */
@ApiModel(description = "Next available settlement date for a currency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class NextSettlementDayModel   {
  @JsonProperty("currency")
  private CurrencyModel currency;

  @JsonProperty("nextSettlementDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate nextSettlementDate;

  public NextSettlementDayModel currency(CurrencyModel currency) {
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

  public NextSettlementDayModel nextSettlementDate(LocalDate nextSettlementDate) {
    this.nextSettlementDate = nextSettlementDate;
    return this;
  }

  /**
   * The next settlement date for this currency
   * @return nextSettlementDate
  */
  @ApiModelProperty(example = "Sat Dec 31 05:30:00 IST 2022", required = true, value = "The next settlement date for this currency")
  @NotNull

  @Valid

  public LocalDate getNextSettlementDate() {
    return nextSettlementDate;
  }

  public void setNextSettlementDate(LocalDate nextSettlementDate) {
    this.nextSettlementDate = nextSettlementDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextSettlementDayModel nextSettlementDay = (NextSettlementDayModel) o;
    return Objects.equals(this.currency, nextSettlementDay.currency) &&
        Objects.equals(this.nextSettlementDate, nextSettlementDay.nextSettlementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, nextSettlementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextSettlementDayModel {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nextSettlementDate: ").append(toIndentedString(nextSettlementDate)).append("\n");
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

