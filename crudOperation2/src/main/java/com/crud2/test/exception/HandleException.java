package com.crud2.test.exception;



import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(value = NoBankFound.class)
	public ResponseEntity<ExceptionDetails> exception(NoBankFound exception) {
		  ExceptionDetails exceptionDetails=new ExceptionDetails();
		  exceptionDetails.setMessage(exception.getMessage());
		  exceptionDetails.setDate(LocalDateTime.now());
		return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
