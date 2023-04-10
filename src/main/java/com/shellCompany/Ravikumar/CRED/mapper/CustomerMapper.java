package com.shellCompany.Ravikumar.CRED.mapper;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Utils.Utils;
import com.shellCompany.Ravikumar.CRED.dto.CustomerDetails;
import com.shellCompany.Ravikumar.CRED.dto.CustomerRequest;


@Component
public class CustomerMapper {
	
	public Customer mapCustomerDto(CustomerRequest custReq) {
		Customer customerDto = new Customer();
		
		custReq = Optional.ofNullable(custReq).orElse(new CustomerRequest());
		CustomerDetails custDetails = Optional.ofNullable(custReq.getCustomerDetails()).orElse(new CustomerDetails());
		
		customerDto.setName(custReq.getName());
		customerDto.setAddressLane1(custDetails.getAddressLane1());
		customerDto.setAddressLane2(custDetails.getAddressLane2());
		customerDto.setCity(custDetails.getCity());
		customerDto.setDateOfBirth(Utils.convertStringToDate(custDetails.getDateOfBirth()));
		customerDto.setZipCode(custDetails.getZipCode());
		
		return customerDto;
		
	}
	
	public CustomerDetails mapCustomerDetailDto(Customer cust) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAddressLane1(cust.getAddressLane1());
		customerDetails.setAddressLane2(cust.getAddressLane2());
		customerDetails.setCity(cust.getCity());
		customerDetails.setCustId(cust.getCustId());
		customerDetails.setDateOfBirth(Utils.convertDateToString(cust.getDateOfBirth()));
		customerDetails.setName(cust.getName());
		customerDetails.setZipCode(cust.getZipCode());
		return customerDetails;
	}

}
