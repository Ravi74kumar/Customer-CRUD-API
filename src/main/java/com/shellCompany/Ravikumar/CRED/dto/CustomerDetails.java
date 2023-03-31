package com.shellCompany.Ravikumar.CRED.dto;

public class CustomerDetails {

	private String name;
	private Long custId;
	private String dateOfBirth;
	private String addressLane1;
	private String addressLane2;
	private String city;
	private String zipCode;

	public String getName() {
		return name;
	}

	public Long getCustId() {
		return custId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddressLane1() {
		return addressLane1;
	}

	public String getAddressLane2() {
		return addressLane2;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAddressLane1(String addressLane1) {
		this.addressLane1 = addressLane1;
	}

	public void setAddressLane2(String addressLane2) {
		this.addressLane2 = addressLane2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
