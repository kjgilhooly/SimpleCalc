package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.SimpleCalcRequest;
import io.swagger.model.SimpleCalcResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-29T16:21:35.931Z[GMT]")
@RestController
public class CalcApiController implements CalcApi {

    private static final Logger log = LoggerFactory.getLogger(CalcApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CalcApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SimpleCalcResponse> calcGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "operation" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "function", required = true) String function,@NotNull @Parameter(in = ParameterIn.QUERY, description = "one operator" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "opX", required = true) BigDecimal opX,@NotNull @Parameter(in = ParameterIn.QUERY, description = "other operator" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "opY", required = true) BigDecimal opY) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleCalcResponse>(objectMapper.readValue("{\n  \"result\" : 42,\n  \"opX\" : 2,\n  \"function\" : \"add\",\n  \"opY\" : 2\n}", SimpleCalcResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleCalcResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleCalcResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimpleCalcResponse> calcPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody SimpleCalcRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleCalcResponse>(objectMapper.readValue("{\n  \"result\" : 42,\n  \"opX\" : 2,\n  \"function\" : \"add\",\n  \"opY\" : 2\n}", SimpleCalcResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleCalcResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleCalcResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
