package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimpleCalcRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-29T16:21:35.931Z[GMT]")


public class SimpleCalcRequest   {
  /**
   * Gets or Sets function
   */
  public enum FunctionEnum {
    ADD("add"),
    
    SUB("sub"),
    
    MUL("mul"),
    
    DIV("div");

    private String value;

    FunctionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FunctionEnum fromValue(String text) {
      for (FunctionEnum b : FunctionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("function")
  private FunctionEnum function = null;

  @JsonProperty("opX")
  private BigDecimal opX = null;

  @JsonProperty("opY")
  private BigDecimal opY = null;

  public SimpleCalcRequest function(FunctionEnum function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   **/
  @Schema(required = true, description = "")
      @NotNull

    public FunctionEnum getFunction() {
    return function;
  }

  public void setFunction(FunctionEnum function) {
    this.function = function;
  }

  public SimpleCalcRequest opX(BigDecimal opX) {
    this.opX = opX;
    return this;
  }

  /**
   * Get opX
   * @return opX
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getOpX() {
    return opX;
  }

  public void setOpX(BigDecimal opX) {
    this.opX = opX;
  }

  public SimpleCalcRequest opY(BigDecimal opY) {
    this.opY = opY;
    return this;
  }

  /**
   * Get opY
   * @return opY
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getOpY() {
    return opY;
  }

  public void setOpY(BigDecimal opY) {
    this.opY = opY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleCalcRequest simpleCalcRequest = (SimpleCalcRequest) o;
    return Objects.equals(this.function, simpleCalcRequest.function) &&
        Objects.equals(this.opX, simpleCalcRequest.opX) &&
        Objects.equals(this.opY, simpleCalcRequest.opY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, opX, opY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleCalcRequest {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    opX: ").append(toIndentedString(opX)).append("\n");
    sb.append("    opY: ").append(toIndentedString(opY)).append("\n");
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
