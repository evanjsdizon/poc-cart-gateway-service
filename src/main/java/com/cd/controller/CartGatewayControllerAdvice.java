package com.cd.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cd.controller.dto.ErrorResponse;
import com.cd.controller.dto.ValidationError;
import com.cd.exception.NotFoundException;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class CartGatewayControllerAdvice {

	private Logger log = LoggerFactory.getLogger(CartGatewayControllerAdvice.class); 
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorResponse> getNotFoundException(Exception e) {
		var response = new ErrorResponse("404", "NOT_FOUND");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> getMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		var validationErrors = new ArrayList<ValidationError>();
		for (FieldError fe : e.getFieldErrors()) {
			validationErrors.add(new ValidationError(fe.getField(), fe.getDefaultMessage()));
		}
		var response = new ErrorResponse("400", "VALIDATION_ERROR", validationErrors);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> getConstraintViolationException(ConstraintViolationException e) {
		var validationErrors = new ArrayList<ValidationError>();
		for (ConstraintViolation<?> ce : e.getConstraintViolations()) {
			validationErrors.add(new ValidationError(ce.getPropertyPath().toString(), ce.getMessage()));
		}
		var response = new ErrorResponse("400", "VALIDATION_ERROR", validationErrors);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> getException(Exception e) {
		log.error(e.getMessage(), e);
		var response = new ErrorResponse("500", "INTERNAL_SERVER_ERROR");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}
}
