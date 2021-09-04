package com.theboy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class ResponseHeader {
	
	@JsonProperty("ResponseStatus")
	@ApiModelProperty(example = "\"SUCCESS or FAILURE\"", position = 1)
	private String responseStatus;

	@JsonProperty("ErrorMessage")
	@ApiModelProperty(example = "\"Error Description\"", position = 2)
	private String errorMessage;

	@JsonProperty("ErrorCode")
	@ApiModelProperty(example = "\"Error Code\"", position = 3)
	private String errorCode;

	public ResponseHeader() {
		// Nothing to do here
	}

	public ResponseHeader(String responseStatus, String errorMessage, String errorCode) {
		this.responseStatus = responseStatus;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

}
