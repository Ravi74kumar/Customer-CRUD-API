package com.shellCompany.Ravikumar.CRED.dto;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class DebitCard {

	private Long debitCardId;
	private List<Transaction> transactions;
	private XMLGregorianCalendar lastTransactiondate;
	private Double balance;

	public Long getDebitCardId() {
		return debitCardId;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public XMLGregorianCalendar getLastTransactiondate() {
		return lastTransactiondate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setDebitCardId(Long debitCardId) {
		this.debitCardId = debitCardId;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void setLastTransactiondate(XMLGregorianCalendar lastTransactiondate) {
		this.lastTransactiondate = lastTransactiondate;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
