package com.gcp.copilotdemo.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ISO alpha-3 currency code. There are 14 allowed settlement currencies
 */
public enum CurrencyModel {
  
  AUD("AUD"),
  
  CAD("CAD"),
  
  CHF("CHF"),
  
  DKK("DKK"),
  
  EUR("EUR"),
  
  GBP("GBP"),
  
  HKD("HKD"),
  
  JPY("JPY"),
  
  NOK("NOK"),
  
  NZD("NZD"),
  
  SEK("SEK"),
  
  SGD("SGD"),
  
  USD("USD"),
  
  ZAR("ZAR");

  private String value;

  CurrencyModel(String value) {
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
  public static CurrencyModel fromValue(String value) {
    for (CurrencyModel b : CurrencyModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

