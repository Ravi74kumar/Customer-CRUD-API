package com.shellCompany.Ravikumar.CRED.exceptions;

public class CustomerException {

	private String exceptionType;

	private String detail;

	public CustomerException(String exceptionType, String detail) {
		this.detail = detail;
		this.exceptionType = exceptionType;
	}

	public String getExceptionType() {
		return exceptionType;
	}

	public String getDetail() {
		return detail;
	}

}
