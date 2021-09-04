package com.theboy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class ResponseWrapper {
	
	@ApiModelProperty(position = 1)
	private ResponseHeader responseHeader;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	
}
