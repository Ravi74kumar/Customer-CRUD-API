package com.shellCompany.Ravikumar.CRED.dto;

import java.util.List;

public class CustomerResponse {

	private Long custId;
	private String name;
	private CustomerDetails customerDetails;
	private List<CreditCard> creditCards;
	private Double balance;
	private List<DebitCard> debitCards;
	private List<Loan> loans;

	public Long getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public Double getBalance() {
		return balance;
	}

	public List<DebitCard> getDebitCards() {
		return debitCards;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setDebitCards(List<DebitCard> debitCards) {
		this.debitCards = debitCards;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

}
