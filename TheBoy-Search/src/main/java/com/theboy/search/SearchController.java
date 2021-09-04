/**
 * 
 */
package com.theboy.search;

import javax.validation.Valid;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.theboy.log.pojo.LogData;
import com.theboy.pojo.ResponseHeader;
import com.theboy.pojo.ResponseWrapper;
import com.theboy.pojo.SearchRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author i-exceed
 *
 */

@RestController
@RequestMapping("/search")
@Api(tags = "Search-Service")
@RefreshScope
public class SearchController {


	@ApiResponses({ @ApiResponse(code = 200, message = "API service reachable", response = ResponseWrapper.class),
			@ApiResponse(code = 408, message = "Service Timed Out"),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "API service not found") })
	@ApiOperation(value = "Search", notes = "API to search")
	@PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseWrapper> customersearchAPI(@Valid @RequestBody SearchRequest request)
			throws JsonProcessingException {

		LogData logData = new LogData("Search");
		
		ResponseWrapper responseWrapper = new ResponseWrapper(); 
		ResponseHeader responseHeader = new ResponseHeader("200","","");
		responseWrapper.setResponseHeader(responseHeader);
		
		return new ResponseEntity<>(responseWrapper, HttpStatus.OK);
	}





	
}
