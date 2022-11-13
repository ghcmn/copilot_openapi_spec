package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gcp.copilotdemo.model.AuditBlockModel;
import com.gcp.copilotdemo.model.CurrencyEntryModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A day in the settlement calendar. For each supported currency, shows whether or not this day is allowed for settlements.
 */
@ApiModel(description = "A day in the settlement calendar. For each supported currency, shows whether or not this day is allowed for settlements.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class CalendarDayModel   {
  @JsonProperty("calendarDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate calendarDate;

  @JsonProperty("currencies")
  @Valid
  private List<CurrencyEntryModel> currencies = new ArrayList<>();

  @JsonProperty("audit")
  private AuditBlockModel audit;

  public CalendarDayModel calendarDate(LocalDate calendarDate) {
    this.calendarDate = calendarDate;
    return this;
  }

  /**
   * The date of this calendar entry
   * @return calendarDate
  */
  @ApiModelProperty(example = "Sat Dec 31 05:30:00 IST 2022", required = true, value = "The date of this calendar entry")
  @NotNull

  @Valid

  public LocalDate getCalendarDate() {
    return calendarDate;
  }

  public void setCalendarDate(LocalDate calendarDate) {
    this.calendarDate = calendarDate;
  }

  public CalendarDayModel currencies(List<CurrencyEntryModel> currencies) {
    this.currencies = currencies;
    return this;
  }

  public CalendarDayModel addCurrenciesItem(CurrencyEntryModel currenciesItem) {
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * There must be one entry for each of the 14 supported currencies
   * @return currencies
  */
  @ApiModelProperty(example = "[   {     'currency': 'AUD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'CAD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'CHF',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'DKK',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'EUR',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'GBP',     'stfoSettlementAllowed': false,     'swiftSettlementAllowed': false   },   {     'currency': 'HKD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'JPY',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'NOK',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'NZD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'SEK',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'SGD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'USD',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   },   {     'currency': 'ZAR',     'stfoSettlementAllowed': true,     'swiftSettlementAllowed': true   } ] ", required = true, value = "There must be one entry for each of the 14 supported currencies")
  @NotNull

  @Valid
@Size(min=14,max=14) 
  public List<CurrencyEntryModel> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<CurrencyEntryModel> currencies) {
    this.currencies = currencies;
  }

  public CalendarDayModel audit(AuditBlockModel audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditBlockModel getAudit() {
    return audit;
  }

  public void setAudit(AuditBlockModel audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarDayModel calendarDay = (CalendarDayModel) o;
    return Objects.equals(this.calendarDate, calendarDay.calendarDate) &&
        Objects.equals(this.currencies, calendarDay.currencies) &&
        Objects.equals(this.audit, calendarDay.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarDate, currencies, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDayModel {\n");
    
    sb.append("    calendarDate: ").append(toIndentedString(calendarDate)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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

