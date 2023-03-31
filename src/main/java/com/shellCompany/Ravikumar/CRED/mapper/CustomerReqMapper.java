package com.shellCompany.Ravikumar.CRED.mapper;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Utils.Utils;
import com.shellCompany.Ravikumar.CRED.dto.CustomerDetails;
import com.shellCompany.Ravikumar.CRED.dto.CustomerRequest;


@Component
public class CustomerReqMapper {
	
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

}
