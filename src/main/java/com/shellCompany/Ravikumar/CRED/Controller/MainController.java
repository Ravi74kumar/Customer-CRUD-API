package com.shellCompany.Ravikumar.CRED.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Repository.JPARepo;
import com.shellCompany.Ravikumar.CRED.dto.CustomerDetails;
import com.shellCompany.Ravikumar.CRED.dto.CustomerRequest;
import com.shellCompany.Ravikumar.CRED.exceptions.CustomerException;
import com.shellCompany.Ravikumar.CRED.mapper.CustomerMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/CRUD")
public class MainController {
	
	@Autowired
	JPARepo jpaRepo;
	
	@Autowired
	CustomerMapper custReqMapper;
	
	@RequestMapping(method= RequestMethod.GET, path = "/getAll")
	public List<Customer> getAll() {
		List<Customer> all = jpaRepo.findAll();
		return all;
	}
	
	@RequestMapping(method= RequestMethod.PUT, path = "/add")
	public byte[] addCustomer(@RequestBody(required = false) CustomerRequest customerReq) {
		
		Customer custDto = custReqMapper.mapCustomerDto(customerReq);
		
		jpaRepo.save(custDto);
		
		return new byte[0];
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/get/{custId}")
	public Object getCustomerDetails(@PathVariable(value = "custId", required = false) String custId) {
		List<Customer> customerList = jpaRepo.getCustomerById(Long.parseLong(custId));
		Customer cust = Optional.of(customerList).orElse(new ArrayList<>()).stream().findFirst().orElse(null);
		if(cust!=null) {
			return custReqMapper.mapCustomerDetailDto(cust);
		}
		return new CustomerException("No Customer found", "No Customer Found for the Id ="+custId);
	}

}
