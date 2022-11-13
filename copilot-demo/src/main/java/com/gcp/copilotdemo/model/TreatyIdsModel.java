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
 * TreatyIdsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class TreatyIdsModel   {
  @JsonProperty("treatyId")
  private String treatyId;

  @JsonProperty("brokerId")
  private String brokerId;

  @JsonProperty("brokerGroupId")
  private String brokerGroupId;

  @JsonProperty("statementId")
  private String statementId;

  @JsonProperty("lineItem")
  private String lineItem;

  public TreatyIdsModel treatyId(String treatyId) {
    this.treatyId = treatyId;
    return this;
  }

  /**
   * Treaty identifier
   * @return treatyId
  */
  @ApiModelProperty(example = "123456789", required = true, value = "Treaty identifier")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getTreatyId() {
    return treatyId;
  }

  public void setTreatyId(String treatyId) {
    this.treatyId = treatyId;
  }

  public TreatyIdsModel brokerId(String brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * broker ID, identifies the submitting broker
   * @return brokerId
  */
  @ApiModelProperty(example = "666", required = true, value = "broker ID, identifies the submitting broker")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(String brokerId) {
    this.brokerId = brokerId;
  }

  public TreatyIdsModel brokerGroupId(String brokerGroupId) {
    this.brokerGroupId = brokerGroupId;
    return this;
  }

  /**
   * broker group ID, used to group statements together for submission
   * @return brokerGroupId
  */
  @ApiModelProperty(example = "xyz775", required = true, value = "broker group ID, used to group statements together for submission")
  @NotNull


  public String getBrokerGroupId() {
    return brokerGroupId;
  }

  public void setBrokerGroupId(String brokerGroupId) {
    this.brokerGroupId = brokerGroupId;
  }

  public TreatyIdsModel statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * statement ID
   * @return statementId
  */
  @ApiModelProperty(example = "s123456", required = true, value = "statement ID")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public TreatyIdsModel lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  /**
   * line item on a statement
   * @return lineItem
  */
  @ApiModelProperty(example = "17", required = true, value = "line item on a statement")
  @NotNull

@Pattern(regexp="\\w+") 
  public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreatyIdsModel treatyIds = (TreatyIdsModel) o;
    return Objects.equals(this.treatyId, treatyIds.treatyId) &&
        Objects.equals(this.brokerId, treatyIds.brokerId) &&
        Objects.equals(this.brokerGroupId, treatyIds.brokerGroupId) &&
        Objects.equals(this.statementId, treatyIds.statementId) &&
        Objects.equals(this.lineItem, treatyIds.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(treatyId, brokerId, brokerGroupId, statementId, lineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreatyIdsModel {\n");
    
    sb.append("    treatyId: ").append(toIndentedString(treatyId)).append("\n");
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    brokerGroupId: ").append(toIndentedString(brokerGroupId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
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

