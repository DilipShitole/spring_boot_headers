package com.crud2.test.exception;

import java.sql.Date;
import java.time.LocalDateTime;

public class ExceptionDetails {
	private String message;
	private LocalDateTime date;
	public ExceptionDetails(String message, LocalDateTime date) {
		super();
		this.message = message;
		this.date = date;
	}
	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime localDateTime) {
		this.date = localDateTime;
	}

}
