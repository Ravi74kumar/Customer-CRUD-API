package com.shellCompany.Ravikumar.CRED.dto;

import javax.xml.datatype.XMLGregorianCalendar;

public class Transaction {

	private Long transactionId;
	private String transactionName;
	private XMLGregorianCalendar transactionDate;

	public Long getTransactionId() {
		return transactionId;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public XMLGregorianCalendar getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public void setTransactionDate(XMLGregorianCalendar transactionDate) {
		this.transactionDate = transactionDate;
	}

}
