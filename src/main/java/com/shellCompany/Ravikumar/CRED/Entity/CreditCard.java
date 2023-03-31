package com.shellCompany.Ravikumar.CRED.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Credit_Card")
public class CreditCard {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "Vendor_Name")
	private String vendorName;
	
	@Column(name = "Last_Transaction_Date")
	private Date lastTransactionDate;
	
	@Column(name = "Available_Credits")
	private Double availableCredits;
	
	@Column(name = "Avalilable_Points")
	private Double availablePoints;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "creditCard", cascade = CascadeType.ALL)
	private List<Transaction> transactions;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer_ID")
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public Double getAvailableCredits() {
		return availableCredits;
	}

	public void setAvailableCredits(Double availableCredits) {
		this.availableCredits = availableCredits;
	}

	public Double getAvailablePoints() {
		return availablePoints;
	}

	public void setAvailablePoints(Double availablePoints) {
		this.availablePoints = availablePoints;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	

}
