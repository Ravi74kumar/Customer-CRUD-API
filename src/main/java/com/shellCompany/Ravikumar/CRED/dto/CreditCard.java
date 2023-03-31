package com.shellCompany.Ravikumar.CRED.dto;


import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class CreditCard {

	private Long creditcardId;
	private String creditCardVendor;
	private List<Transaction> transactions;
	private XMLGregorianCalendar lastTransactiondate;
	private Double availableCredits;
	private Double availablePoints;
	private Double pointsToRedeem;

	public Long getCreditcardId() {
		return creditcardId;
	}

	public String getCreditCardVendor() {
		return creditCardVendor;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public XMLGregorianCalendar getLastTransactiondate() {
		return lastTransactiondate;
	}

	public Double getAvailableCredits() {
		return availableCredits;
	}

	public Double getAvailablePoints() {
		return availablePoints;
	}

	public Double getPointsToRedeem() {
		return pointsToRedeem;
	}

	public void setCreditcardId(Long creditcardId) {
		this.creditcardId = creditcardId;
	}

	public void setCreditCardVendor(String creditCardVendor) {
		this.creditCardVendor = creditCardVendor;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void setLastTransactiondate(XMLGregorianCalendar lastTransactiondate) {
		this.lastTransactiondate = lastTransactiondate;
	}

	public void setAvailableCredits(Double availableCredits) {
		this.availableCredits = availableCredits;
	}

	public void setAvailablePoints(Double availablePoints) {
		this.availablePoints = availablePoints;
	}

	public void setPointsToRedeem(Double pointsToRedeem) {
		this.pointsToRedeem = pointsToRedeem;
	}

}
