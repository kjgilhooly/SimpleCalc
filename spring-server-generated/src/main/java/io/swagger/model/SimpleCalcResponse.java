package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimpleCalcResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-29T16:21:35.931Z[GMT]")


public class SimpleCalcResponse   {
  @JsonProperty("function")
  private String function = null;

  @JsonProperty("opX")
  private BigDecimal opX = null;

  @JsonProperty("opY")
  private BigDecimal opY = null;

  @JsonProperty("result")
  private BigDecimal result = null;

  public SimpleCalcResponse function(String function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   **/
  @Schema(example = "add", description = "")
  
    public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public SimpleCalcResponse opX(BigDecimal opX) {
    this.opX = opX;
    return this;
  }

  /**
   * Get opX
   * @return opX
   **/
  @Schema(example = "2", description = "")
  
    @Valid
    public BigDecimal getOpX() {
    return opX;
  }

  public void setOpX(BigDecimal opX) {
    this.opX = opX;
  }

  public SimpleCalcResponse opY(BigDecimal opY) {
    this.opY = opY;
    return this;
  }

  /**
   * Get opY
   * @return opY
   **/
  @Schema(example = "2", description = "")
  
    @Valid
    public BigDecimal getOpY() {
    return opY;
  }

  public void setOpY(BigDecimal opY) {
    this.opY = opY;
  }

  public SimpleCalcResponse result(BigDecimal result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @Schema(example = "42", description = "")
  
    @Valid
    public BigDecimal getResult() {
    return result;
  }

  public void setResult(BigDecimal result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCalcResponse simpleCalcResponse = (SimpleCalcResponse) o;
    return Objects.equals(this.function, simpleCalcResponse.function) &&
        Objects.equals(this.opX, simpleCalcResponse.opX) &&
        Objects.equals(this.opY, simpleCalcResponse.opY) &&
        Objects.equals(this.result, simpleCalcResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, opX, opY, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleCalcResponse {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    opX: ").append(toIndentedString(opX)).append("\n");
    sb.append("    opY: ").append(toIndentedString(opY)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
