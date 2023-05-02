package com.cd.controller.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ErrorResponse {

	private String code;

	private String message;

	@JsonInclude(Include.NON_NULL)
	private List<ValidationError> validationErrors;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ValidationError> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(List<ValidationError> validationErrors) {
		this.validationErrors = validationErrors;
	}

	public ErrorResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ErrorResponse(String code, String message, List<ValidationError> validationErrors) {
		super();
		this.code = code;
		this.message = message;
		this.validationErrors = validationErrors;
	}
}
