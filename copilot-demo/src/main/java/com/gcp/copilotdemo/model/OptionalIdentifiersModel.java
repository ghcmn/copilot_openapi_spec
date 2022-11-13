package com.gcp.copilotdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OptionalIdentifiersModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class OptionalIdentifiersModel   {
  @JsonProperty("netSettlementId")
  private UUID netSettlementId;

  @JsonProperty("paymentId")
  private UUID paymentId;

  @JsonProperty("cancellationId")
  private UUID cancellationId;

  public OptionalIdentifiersModel netSettlementId(UUID netSettlementId) {
    this.netSettlementId = netSettlementId;
    return this;
  }

  /**
   * If this settlement has been aggregated, the ID of the netSettlement it belongs to
   * @return netSettlementId
  */
  @ApiModelProperty(example = "d5eecee5-6173-4c94-8e01-26cef1dbde5a", value = "If this settlement has been aggregated, the ID of the netSettlement it belongs to")

  @Valid

  public UUID getNetSettlementId() {
    return netSettlementId;
  }

  public void setNetSettlementId(UUID netSettlementId) {
    this.netSettlementId = netSettlementId;
  }

  public OptionalIdentifiersModel paymentId(UUID paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * If this settlement has been paid, the ID of the payment it belongs to
   * @return paymentId
  */
  @ApiModelProperty(example = "13356f3d-fcff-423b-870f-553fac0675f1", value = "If this settlement has been paid, the ID of the payment it belongs to")

  @Valid

  public UUID getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(UUID paymentId) {
    this.paymentId = paymentId;
  }

  public OptionalIdentifiersModel cancellationId(UUID cancellationId) {
    this.cancellationId = cancellationId;
    return this;
  }

  /**
   * If this settlement has been cancelled, the ID of the cancellation request
   * @return cancellationId
  */
  @ApiModelProperty(example = "37e9882a-984f-453e-a676-ed9e841c3150", value = "If this settlement has been cancelled, the ID of the cancellation request")

  @Valid

  public UUID getCancellationId() {
    return cancellationId;
  }

  public void setCancellationId(UUID cancellationId) {
    this.cancellationId = cancellationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalIdentifiersModel optionalIdentifiers = (OptionalIdentifiersModel) o;
    return Objects.equals(this.netSettlementId, optionalIdentifiers.netSettlementId) &&
        Objects.equals(this.paymentId, optionalIdentifiers.paymentId) &&
        Objects.equals(this.cancellationId, optionalIdentifiers.cancellationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netSettlementId, paymentId, cancellationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("'netSettlementId': '").append(toIndentedString(netSettlementId)).append("',");
    sb.append("'paymentId': '").append(toIndentedString(paymentId)).append("',");
    sb.append("'cancellationId': '").append(toIndentedString(cancellationId)).append("'");
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

