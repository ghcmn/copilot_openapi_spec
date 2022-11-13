package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gcp.copilotdemo.model.CurrencyModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentDetailsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class PaymentDetailsModel   {
  @JsonProperty("accountIdentifier")
  private String accountIdentifier;

  @JsonProperty("currency")
  private CurrencyModel currency;

  @JsonProperty("amount")
  private BigDecimal amount;

  public PaymentDetailsModel accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * An identifier for the account. The format is dependent on the value of the paymentMethod attribute
   * @return accountIdentifier
  */
  @ApiModelProperty(example = "GB33BUKB20201555555556", required = true, value = "An identifier for the account. The format is dependent on the value of the paymentMethod attribute")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public PaymentDetailsModel currency(CurrencyModel currency) {
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

  public PaymentDetailsModel amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the transaction. It is interpereted as a decimal number. Note that currencies can have zero, two, or even three decimal places.
   * minimum: 0.001
   * @return amount
  */
  @ApiModelProperty(example = "2999.99", required = true, value = "The amount of the transaction. It is interpereted as a decimal number. Note that currencies can have zero, two, or even three decimal places.")
  @NotNull

  @Valid
@DecimalMin("0.001")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetailsModel paymentDetails = (PaymentDetailsModel) o;
    return Objects.equals(this.accountIdentifier, paymentDetails.accountIdentifier) &&
        Objects.equals(this.currency, paymentDetails.currency) &&
        Objects.equals(this.amount, paymentDetails.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("'accountIdentifier': '").append(toIndentedString(accountIdentifier)).append("',");
    sb.append("'currency': '").append(toIndentedString(currency)).append("',");
    sb.append("'amount': ").append(toIndentedString(amount));
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

