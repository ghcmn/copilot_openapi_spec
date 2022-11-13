package com.gcp.copilotdemo.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The payment method to be used for this settlement
 */
public enum PaymentMethodModel {
  
  SWIFT("SWIFT"),
  
  VITESSE("VITESSE"),
  
  STFO("STFO"),
  
  NONE("NONE");

  private String value;

  PaymentMethodModel(String value) {
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
  public static PaymentMethodModel fromValue(String value) {
    for (PaymentMethodModel b : PaymentMethodModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

