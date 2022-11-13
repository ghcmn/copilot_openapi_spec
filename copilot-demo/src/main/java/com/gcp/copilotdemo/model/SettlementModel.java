package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gcp.copilotdemo.model.AuditBlockModel;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.OriginatingIdentifiersModel;
import com.gcp.copilotdemo.model.PaymentDetailsModel;
import com.gcp.copilotdemo.model.PaymentMethodModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SettlementModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class SettlementModel   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("paymentMethod")
  private PaymentMethodModel paymentMethod;

  @JsonProperty("scheduleDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduleDate;

  @JsonProperty("exchangeRate")
  private BigDecimal exchangeRate = new BigDecimal("1");

  @JsonProperty("debit")
  private PaymentDetailsModel debit;

  @JsonProperty("credit")
  private PaymentDetailsModel credit;

  @JsonProperty("optionalIdentifiers")
  private OptionalIdentifiersModel optionalIdentifiers;

  @JsonProperty("uniqueRef")
  private String uniqueRef;

  @JsonProperty("originatingIdentifiers")
  private OriginatingIdentifiersModel originatingIdentifiers;

  @JsonProperty("audit")
  private AuditBlockModel audit;

  public SettlementModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * unique ID of this settlement
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "unique ID of this settlement")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SettlementModel paymentMethod(PaymentMethodModel paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentMethodModel getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodModel paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public SettlementModel scheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
    return this;
  }

  /**
   * The earliest time that this settlement can be paid
   * @return scheduleDate
  */
  @ApiModelProperty(example = "2021-08-29T09:12:33.001Z", required = true, value = "The earliest time that this settlement can be paid")
  @NotNull

  @Valid

  public OffsetDateTime getScheduleDate() {
    return scheduleDate;
  }

  public void setScheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
  }

  public SettlementModel exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The rate used to convert the debit currency to the credit currency. When both currencies are the same this has a value of 1 (the default)
   * minimum: 0.0000010
   * @return exchangeRate
  */
  @ApiModelProperty(example = "1", value = "The rate used to convert the debit currency to the credit currency. When both currencies are the same this has a value of 1 (the default)")

  @Valid
@DecimalMin("0.0000010")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public SettlementModel debit(PaymentDetailsModel debit) {
    this.debit = debit;
    return this;
  }

  /**
   * Get debit
   * @return debit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentDetailsModel getDebit() {
    return debit;
  }

  public void setDebit(PaymentDetailsModel debit) {
    this.debit = debit;
  }

  public SettlementModel credit(PaymentDetailsModel credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentDetailsModel getCredit() {
    return credit;
  }

  public void setCredit(PaymentDetailsModel credit) {
    this.credit = credit;
  }

  public SettlementModel optionalIdentifiers(OptionalIdentifiersModel optionalIdentifiers) {
    this.optionalIdentifiers = optionalIdentifiers;
    return this;
  }

  /**
   * Get optionalIdentifiers
   * @return optionalIdentifiers
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionalIdentifiersModel getOptionalIdentifiers() {
    return optionalIdentifiers;
  }

  public void setOptionalIdentifiers(OptionalIdentifiersModel optionalIdentifiers) {
    this.optionalIdentifiers = optionalIdentifiers;
  }

  public SettlementModel uniqueRef(String uniqueRef) {
    this.uniqueRef = uniqueRef;
    return this;
  }

  /**
   * the checksum of all the attributes contained in the OriginatingIdentifiers object. Used to enforce uniqueness when creating new resources
   * @return uniqueRef
  */
  @ApiModelProperty(example = "77add1d5f41223d5582fca736a5cb335", readOnly = true, value = "the checksum of all the attributes contained in the OriginatingIdentifiers object. Used to enforce uniqueness when creating new resources")


  public String getUniqueRef() {
    return uniqueRef;
  }

  public void setUniqueRef(String uniqueRef) {
    this.uniqueRef = uniqueRef;
  }

  public SettlementModel originatingIdentifiers(OriginatingIdentifiersModel originatingIdentifiers) {
    this.originatingIdentifiers = originatingIdentifiers;
    return this;
  }

  /**
   * Get originatingIdentifiers
   * @return originatingIdentifiers
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OriginatingIdentifiersModel getOriginatingIdentifiers() {
    return originatingIdentifiers;
  }

  public void setOriginatingIdentifiers(OriginatingIdentifiersModel originatingIdentifiers) {
    this.originatingIdentifiers = originatingIdentifiers;
  }

  public SettlementModel audit(AuditBlockModel audit) {
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
    SettlementModel settlement = (SettlementModel) o;
    return Objects.equals(this.id, settlement.id) &&
        Objects.equals(this.paymentMethod, settlement.paymentMethod) &&
        Objects.equals(this.scheduleDate, settlement.scheduleDate) &&
        Objects.equals(this.exchangeRate, settlement.exchangeRate) &&
        Objects.equals(this.debit, settlement.debit) &&
        Objects.equals(this.credit, settlement.credit) &&
        Objects.equals(this.optionalIdentifiers, settlement.optionalIdentifiers) &&
        Objects.equals(this.uniqueRef, settlement.uniqueRef) &&
        Objects.equals(this.originatingIdentifiers, settlement.originatingIdentifiers) &&
        Objects.equals(this.audit, settlement.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentMethod, scheduleDate, exchangeRate, debit, credit, optionalIdentifiers, uniqueRef, originatingIdentifiers, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    optionalIdentifiers: ").append(toIndentedString(optionalIdentifiers)).append("\n");
    sb.append("    uniqueRef: ").append(toIndentedString(uniqueRef)).append("\n");
    sb.append("    originatingIdentifiers: ").append(toIndentedString(originatingIdentifiers)).append("\n");
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

