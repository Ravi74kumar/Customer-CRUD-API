package com.shellCompany.Ravikumar.CRED.dto;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class Loan {

	private Long loanId;
	private String loanName;
	private Double outstandingAmount;
	private Double loanAmount;
	private List<Transaction> transactions;
	private XMLGregorianCalendar lastTransactiondate;

	public Long getLoanId() {
		return loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public Double getOutstandingAmount() {
		return outstandingAmount;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public void setOutstandingAmount(Double outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public XMLGregorianCalendar getLastTransactiondate() {
		return lastTransactiondate;
	}

	public void setLastTransactiondate(XMLGregorianCalendar lastTransactiondate) {
		this.lastTransactiondate = lastTransactiondate;
	}

}
