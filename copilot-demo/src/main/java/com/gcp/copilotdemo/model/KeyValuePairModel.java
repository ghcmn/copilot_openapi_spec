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
 * Metadata is made up of a key and a value
 */
@ApiModel(description = "Metadata is made up of a key and a value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public class KeyValuePairModel   {
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  public KeyValuePairModel key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The metadata key. This value is indexed, so it is suitable for searching
   * @return key
  */
  @ApiModelProperty(example = "Minimum term", required = true, value = "The metadata key. This value is indexed, so it is suitable for searching")
  @NotNull


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KeyValuePairModel value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The metadata value. This value is not indexed, meaning that it is not suited to searching.
   * @return value
  */
  @ApiModelProperty(example = "5 years", required = true, value = "The metadata value. This value is not indexed, meaning that it is not suited to searching.")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyValuePairModel keyValuePair = (KeyValuePairModel) o;
    return Objects.equals(this.key, keyValuePair.key) &&
        Objects.equals(this.value, keyValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValuePairModel {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

